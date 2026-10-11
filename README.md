# Jorned

Course work and self-study outside the degree — Alura, Oracle Next Education and the
MCIO programmes.

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=flat-square&logo=javascript&logoColor=black)
![SQL](https://img.shields.io/badge/SQL-4169E1?style=flat-square&logo=postgresql&logoColor=white)

## Contents

### `Lógica de Programação - JavaScript`

Programming logic with functions and lists, and the Secret Number game — a browser
project with HTML, CSS and JavaScript covering DOM manipulation, event handling and
random number generation.

### `Programação Orientada a Objetos - Java`

First Java applications: classes, objects and the structure of a project.

### `SQL`

Basic manipulation against an Oracle-style schema — table creation with typed
columns and constraints, inserts, queries and updates over a customer model.

### `MCIO`

Infrastructure material from the MCIO programme.

## Running it

**JavaScript** — open `index.html` in a browser; no build step.

**Java** — the projects were written in IntelliJ. From the command line:

```bash
javac -d out src/**/*.java && java -cp out Main
```

**SQL** — the script targets Oracle syntax (`VARCHAR2`, `NUMBER`). On PostgreSQL or
SQL Server the types need adapting.
