# ADR-0001: Vaadin statt react

- **Status:**  akzeptiert 
- **Datum:**  17.11.2026

## Kontext
Die Aufgabenstellung beschreibt, dass nur Technologiestacks aus dem Skript verwendet werden sollen.
Ausgewählt konnte unter mehreren Technologiestacks.
In der Fallstudie geht es um die Entwicklung einer Web-Anwendung für ein Projekt- und Aufgabenmanagementsystem für ein mittelständisches IT-Dienstleistungsunternehmen.
Vorerfahrung habe ich mit dem Stack React + Spring Boot.

## Betrachtete Optionen
React besteht aus einer Oberfläche, für die eine API-Schicht entwickelt werden muss.
Diese läuft im Browser und wird in JavaScript/TypeScript geschrieben.
Vaadin hat eine Oberfläche, die direkt auf dem Server läuft und in Java geschrieben ist.

## Entscheidung
Meine Wahl fiel auf Vaadin + Spring Boot.

## Begründung
Vaadin eignet sich besonders für Unternehmenssoftware, da sich Zustand und Logik auf dem Server befindet. Das sorgt für Sicherheit, da der Nutzer sie nicht manipulieren kann.
Die UI wird mit Vaadin in Java entwickelt und sorgt dafür, dass die modellierte UI im Browser angezeigt wird.
Da die interne Kommunikation durch Vaadin automatisch erfolgt, entsteht weniger eigener Code.
Dies führt zu einer besseren Wartbarkeit.
Außerdem möchte ich Erfahrung mit Vaadin sammeln. 

## Konsequenzen
Der Zustand der Oberfläche wird auf dem Server gehalten, das beeinträchtigt die Skalierbarkeit.
In einem mittelständischen Unternehmen mit einer geringen Nutzerzahl spielt das eine untergeordnete Rolle.

## Quellen
Duarte, Practical Vaadin, 2021.