const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const path = require('path');

const app = express();
const PORT = 3000;

// MongoDB-Verbindung
const mongoUri = process.env.MONGO_URI || 'mongodb://localhost:27017/xmaswishes';
mongoose.connect(mongoUri, { useNewUrlParser: true, useUnifiedTopology: true })
    .then(() => console.log('MongoDB connected'))
    .catch(err => console.error('MongoDB connection error:', err));

// Middleware
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

// Schema und Modell
const wishSchema = new mongoose.Schema({
    name: { type: String, required: true },
    address: { type: String, required: true },
    wish: { type: String, required: true },
    createdAt: { type: Date, default: Date.now }
});

const Wish = mongoose.model('Wish', wishSchema);


// Serve static files (HTML)
app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'index.html'));
});

// POST-Route für Formulareingaben
app.post('/submit-wish', async (req, res) => {
    try {
        const { name, address, wish } = req.body;
        if (!name || !address || !wish) {
            return res.status(400).send('Bitte alle Felder ausfüllen!');
        }
        const newWish = new Wish({ name, address, wish });
        await newWish.save();
        res.send('<h1>Wunsch wurde erfolgreich gespeichert!</h1>');
    } catch (err) {
        console.error('Fehler beim Speichern:', err);
        res.status(500).send('Fehler beim Speichern des Wunsches.');
    }
});


// Server starten
app.listen(PORT, () => {
    console.log(`Server running on http://localhost:${PORT}`);
});

app.get('/wishes', async (req, res) => {
    try {
        const wishes = await Wish.find();
        res.json(wishes);
    } catch (err) {
        console.error(err);
        res.status(500).send('Fehler beim Abrufen der Wünsche.');
    }
});
