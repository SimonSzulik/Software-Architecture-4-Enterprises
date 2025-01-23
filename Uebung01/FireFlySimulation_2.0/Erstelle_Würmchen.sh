#!/bin/bash

# Überprüfen, ob eine Zahl als Argument übergeben wurde
if [ -z "$1" ]; then
  echo "Usage: $0 <number_of_fireflies>"
  exit 1
fi

# Anzahl der Fireflies, die erstellt werden sollen
num_fireflies=$1

# Start-Port festlegen (kann angepasst werden)
start_port=5001

# Array für die Ports
ports=()

# Generiere die Ports
for ((i=0; i<num_fireflies; i++)); do
  ports+=($((start_port + i)))
done

# Schleife zum Starten von Firefly-Prozessen
for i in "${!ports[@]}"; do
  # Der aktuelle Port
  myPort=${ports[$i]}

  # Erstellen einer Liste der Client-Ports (alle anderen Ports außer dem eigenen)
  clientPorts=()
  for j in "${!ports[@]}"; do
    if [ "$i" -ne "$j" ]; then
      clientPorts+=("${ports[$j]}")
    fi
  done

  # Ports als String für Gradle-Task vorbereiten (eigener Port, gefolgt von den Client-Ports)
  clientPortsString=$(IFS=,; echo "${clientPorts[*]}")

  echo "Starting Firefly with myPort: $myPort and clientPorts: $clientPortsString"
  gradle runFirefly -Pports="$myPort,$clientPortsString" &
done

# Warten, bis alle Prozesse abgeschlossen sind
wait
echo "All Firefly processes have been started."

