# Projet LOCALIB

## Présentation

Ce projet est un projet de fin de formation de CDA. Il a pour but de mettre en pratique les compétences acquise
en créant une application de gestion de location.

## Prérequis

* Java 11+
* [docker](https://www.docker.com/products/docker-desktop)
* [docker-compose](https://docs.docker.com/compose/install/)
* Un IDE Java ([Eclipse](https://www.eclipse.org/downloads/), [IntelliJ](https://www.jetbrains.com/fr-fr/idea/))
* [Postman](http://www.postman.com)

## Installation

### Installation de la base de données

Dans un terminal, exécutez la commande suivante:

```bash
docker compose up -d
```
### Installation du projet
Dans votre IDE, chargez le projet Maven `pom.xml`.

Pour utiliser le front du projet, cloner le repo au lien suivants :`https://github.com/Valerian-Touzard/ECF-2.git`

puis ouvrer un terminal de commande et entrer ceci :
```
npm i
```

Pour lancer le front, entrer la commande suivante :
```
npm start
```


## Utilisation

### lancement de l'application avec IntelliJ
Pour lancer l'application avec un IDE, lancer la classe `EcfBackendApplication`
`

### Utilisation de l'application

L'application est accessible à l'adresse suivante: [http://localhost:8080](http://localhost:8080)
