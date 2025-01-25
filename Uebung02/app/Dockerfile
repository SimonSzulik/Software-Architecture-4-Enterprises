# Node.js Image
FROM node:16

# Arbeitsverzeichnis erstellen
WORKDIR /usr/src/app

# Abhängigkeiten kopieren und installieren
COPY package*.json ./
RUN npm install

# Anwendungscode kopieren
COPY . .

# Port und Startbefehl
EXPOSE 3000
CMD ["node", "server.js"]
