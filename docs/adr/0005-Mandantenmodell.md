# ADR-0005: Mandantenmodell: gemeinsames Schema mit Mandanten-Kennung

- **Status:** akzeptiert 
- **Datum:** 28.11.2026

## Kontext

Um Abfragen, zu filtern musste die Entscheidung getroffen werden, ob die Entität
Mandant nur an Benutzerkonto und Projekt angebunden ist oder an jeder Tabelle.


## Betrachtete Optionen

Mandant nur an Benutzerkonto, was das Filtern aufwendiger macht und nur über Verknüpfung möglich ist.
Mandant an jeder Tabelle ermöglicht einfaches Filtern, der Aufwand ist jedoch höher.


## Entscheidung

Meine Wahl fiel, darauf die Entität an jeder Tabelle zu speichern.


## Begründung

Jede Abfrage lässt sich nach Mandant filtern und die Row-Level-Security wird vorbereitet.
Zudem sind eigen Rollen als Mandant möglich.



## Konsequenzen

Eine Aufgabe muss denselben Mandanten haben wie Ihr Projekt, dies stellt die Datenbank sicher. 

## Quellen
