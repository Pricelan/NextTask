# ADR-0002: PostgreSQL

- **Status:**  akzeptiert 
- **Datum:**   17.11.2026

## Kontext
Die Aufgabenstellung verlangt, dass die Daten persistent gespeichert werden.
Technologie ist frei wählbar.
Erfahrung in MySQL ist vorhanden.

## Betrachtete Optionen
H2 ist eine kleine Datenbank, die oft nur im Arbeitsspeicher gespeichert wird und nicht für
den echten Betrieb geeignet ist.
MySQL/MariaDB ist eine relationale Datenbank.
PostgreSQL ist ein relationaler Open-Source-Datenbankserver, der sehr viele Funktionen bietet und nah am Standard ist.
MongoDB speichert Dokumente statt Tabellen und ist eine NoSQL-Datenbank.

## Entscheidung

Meine Wahl fiel auf PostgreSQL.

## Begründung

Die Daten liegen in Tabellen, die über Beziehungen verbunden sind.
In einem Projektmanagementsystem stehen viele Benutzer, Rollen und Aufgaben in Beziehungen zueinander. Außerdem besitzt PostgreSQL eine Row-Level-Security, wo die Datenbank festlegen kann, welche Zeile ein Nutzer sehen darf.
Dies passt zu den Anforderungen: Einsicht von Projekten, für die ich berechtigt bin; Autorisierung; Mandantenfähigkeit. 

## Konsequenzen
PostgreSQL braucht ein eigenständiges Programm, damit es läuft. In diesem Projekt wird es mit einem Docker-Container umgesetzt. MySQL und PostgreSQL sind beides relationale Datenbanken mit ähnlicher Syntax, deswegen ist der Umstieg kein großer Nachteil. Die Tests laufen gegen PostgreSQL, wie später auch in der fertigen Anwendung. Dies hat den Vorteil, dass die Tests sehr repräsentativ sind. Jedoch ist die lange Laufzeit der Tests ein Nachteil.



## Quellen
Kleuker, Grundkurs Datenbankentwicklung, 2024.