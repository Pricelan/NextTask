# ADR-0003: Docker

- **Status:**  akzeptiert 
- **Datum:** 17.11.2026

## Kontext
Entscheidung für PostgreSQL (siehe ADR-0002). 
Der Datenbankserver kann in zwei verschiedenen Varianten bereitgestellt werden.

## Betrachtete Optionen

Wahl zwischen der nativen Installation, die als normale Anwendung unter Windows im Hintergrund läuft, oder Docker-Container, wo PostgreSQL isoliert in einem Container läuft.

## Entscheidung

Meine Wahl fiel auf Docker-Container.

## Begründung

Da ein öffentliches Code-Repository eingerichtet ist, bietet sich Docker-Container an. Jeder bekommt die Beschreibung, wie der Container aussieht und hat somit dieselbe Einrichtung. 
Testcontainers startet bei jedem Testlauf den PostgreSQL-Container, dadurch werden Docker-Container benötigt. Aufgrund dessen bietet sich an, nur eine Variante zu nutzen, anstatt zwei mit einer nativen Installation (siehe ADR-0002).



## Konsequenzen

Docker-Desktop muss laufen, damit PostgreSQl startet, dies kostet Arbeitsspeicher. Die Entscheidung für eine Version 18.7 bewirkt, dass jeder die gleiche Version verwendet, hat jedoch einen Nachteil bei Sicherheitsupdates. Diese erfolgen nicht automatisch, sondern vom Nutzer, durch Änderung der Version. Es gibt kein Volume auf der Festplatte, das bedeutet, wenn der Container gelöscht wird, wird auch die Datenbank gelöscht.
Bei der Entwicklung ist das weniger schlimm, da die Datenbank schnell zurückgesetzt werden kann. Für den echten Betrieb braucht es ein Volume.
Das Passwort ist standardmäßig secret, was in der Entwicklung vertretbar ist.
Dies sollte bei Betrieb geändert werden.


## Quellen
Development-time Services:: Spring Boot.