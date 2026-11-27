# Datenmodell

Entschieden
- Benutzerkonto mit Admin-Info als Eigenschaft(Systemrolle)
- Projekt
- Mitgliedschaft: genau ein Konto und ein Projekt, genau eine Projektrolle
- Projektrolle als Entität, anstatt Enum (Begründung: Erweiterbarkeit Q2)
- Status als Enum/Aufzählung
- Aufgabe gehört zu einem Projekt

Offen
- Aufgabe - Projekt als kardinalität formulieren
- Braucht eine Aufgabe ein Benutzerkonto, z. B. zuständig oder erstellt von?
- Mandant: Entität? Zu welchen Entitäten gehört er?
- Bootstrapping: Wie kommen erster Admin und die Projektrolle in die Datenbank?