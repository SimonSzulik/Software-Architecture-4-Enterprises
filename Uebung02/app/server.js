require('dotenv').config();
const express = require('express');
const mongoose = require('mongoose');

const app = express();
app.use(express.json());

// Verbindung zu MongoDB
mongoose.connect(process.env.MONGO_URI, {
    useNewUrlParser: true,
    useUnifiedTopology: true,
}).then(() => console.log('MongoDB connected'))
    .catch(err => console.error('MongoDB connection error:', err));

// Modell für Wünsche
const wishSchema = new mongoose.Schema({
    name: String,
    address: String,
    wish: String,
    timestamp: { type: Date, default: Date.now },
});
const Wish = mongoose.model('Wish', wishSchema);

// API-Endpoints
app.get('/wishes', async (req, res) => {
    const wishes = await Wish.find();
    res.json(wishes);
});

app.post('/wishes', async (req, res) => {
    const wish = new Wish(req.body);
    await wish.save();
    res.status(201).json(wish);
});

// Server starten
const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
    console.log(`Server running on port ${PORT}`);
});
