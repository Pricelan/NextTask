# Anforderungen

| ID  | Anforderung                                     | Art           | Rolle          | Quelle        | Priorität |
|-----|-------------------------------------------------|---------------|----------------|---------------|-----------|
| F01 | Benutzerkonten anlegen                          | funktional    | Admin          | UserStory1    |   1        |
| F02 | Rollen vergeben                                 | funktional    | Admin          | UserStory1    |   4        |
| F03 | Projekt anlegen                                 | funktional    | Projektleitung | UserStory2    |   5        |
| F04 | Projekt bearbeiten                              | funktional    | Projektleitung | UserStory2    |   12        |
| F05 | Projekt archivieren                             | funktional    | Projektleitung | UserStory2    |   13        |
| F06 | Projekt mehrere Mitarbeitende zuordnen          | funktional    | Projektleitung | UserStory3    |   6        |
| F07 | Aufgaben in einem Projekt erstellen             | funktional    | Mitarbeitende  | UserStory4    |   7      |
| F08 | Aufgaben bearbeiten                             | funktional    | Mitarbeitende  | UserStory4    |   11        |
| F09 | Status einer Aufgabe ändern                     | funktional    | Mitarbeitende  | UserStory5    |   8       |
| F10 | Fortschritt anhand erledigter Aufgaben einsehen | funktional    | Projektleitung | UserStory6    |   9       |
| F11 | System anmelden                                 | funktional    | Benutzende     | UserStory7    |   2        |
| F12 | System abmelden                                 | funktional    | Benutzende     | UserStory7    |   3        |
| F13 | Projekte sehen nur mit Berechtigung             | funktional    | Benutzende     | UserStory8    |   10        |
| Q1  | Wartbarkeit                                     | Qualität      |                | Szenario      |           |
| Q2  | Erweiterbarkeit                                 | Qualität      |                | Szenario      |           |
| Q3  | Skalierbarkeit                                  | Qualität      |                | Szenario      |           |
| Q4  | Mandantenfähig vorbereitet                      | Qualität      |                | Szenario      |           |
| Q5  | Sicherheit (Zugriffskontrolle)   | Qualität      |                | Szenario      |           |
| R1  | Technologiestack aus dem Skript                 | Randbedingung |                | Aufgabenliste |           |
| R2  | Daten persistent speichern                      | Randbedingung |                | Aufgabenliste |           |


## Entscheidungen zur Klassifikation

1. UserStories aufgeteilt, anstatt mehrere Anforderungen zu bündeln.
Begründung: Eine kombinierte Anforderung lässt sich nicht eindeutig testen. S.115 Pohl&Rupp Basiswissen Requirement Engineering
2. Persistente Speicherung als Randbedingung
Begründung: Dies ist eine Vorgabe von der Aufgabenstellung, eine Randbedingung. Keine funktionale oder qualitative Anforderung.
3. Authentifizierung und Autorisierung stehen nicht als eigenständige Q-Einträge drin
Begründung: Diese werden mit F11-13 und F02 abgedeckt und mit der Q5 Anforderung Sicherheit.
4. Projekt und Prozessanforderungen (KI-Tool, Dokumentation, öffentliches Repo)
Begründung: Projekt- und Prozessanforderungen sind eine separate Kategorie, ich bin nur auf Systemanforderungen eingegangen. CPRE Glossar der Requirements Engineering Terminologie S.3
Die drei Vorgaben werden anhand der Aufgabenstellung erfüllt.
5. Die Priorisierung erfolgte nach der Top-10-Technik, da alles umgesetzt werden muss, stand MoSCoW oder Kano nicht zur Auswahl.
Bei Kano wäre eine Nutzerbefragung nötig in dem Projekt nicht möglich. Kriterien sind Abhängigkeit und Geschäftswert, Dringlichkeit spielt in dem Projekt eine untergeordnete Rolle. S.207 Pohl&Rupp Basiswissen Requirement Engineering
    
