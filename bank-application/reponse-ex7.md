# Exercice 7

## mvn clean

Dans cette phase de default-clean est exécuté.

Après cette commande le dossier /target disparait.

## mvn test

Dans cette phase on a :

- `default-resources`
- `default-compile`
- `default-testRessources`
- `default-testCompile`
- `default-test`

On retrouve dans le target des nouveaux dossiers :

- `target/classes`
- `target/generated-sources`
- `target/generated-test-sources`
- `target/maven-status`
- `target/test-classes`

## mvn package

Dans cette phase on a :

- `default-resources`
- `default-compile`
- `default-testRessources`
- `default-testCompile`
- `default-test`
- `default-jar`

On retrouve dans le target des nouveaux dossiers :

- `target/maven-archiver`
- `target/bank-application-1.0-SNAPSHOT.jar`

## mvn verify

La différence réside dans le fait que nvm verify va plus loin et va en théorie lancer les tests d'intégrations sur le `.jar` qui a été compilé.