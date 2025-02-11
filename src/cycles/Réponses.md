# Réponses

## Exercices

### Exercice 5:

"redéfinir une méthode" signifie qu'a la base elle provient d'une class mère ou cette methode est abstraite, il y a juste la signature de la méthode et pas le corps.
Elle est ensuite redéfini dans la class mere c'est à dire `@Override`.

### Exercice 6:

Les méthodes qui sont redéfinies dans la class `Velo` et `VeloElec` sont :
- ezfzef

### Exercice 7:

L'annotation `@Override` placée parfois avant la définition d’une méthode signifie que l'on récupére une methode abstraite pour la redéfinir.

### Exercice 8:

Sa présence apporte la modification du corps de cette méthode.
On peut s'en dispenser mais dans une bonne pratique, on garde le `@Override`.

### Exercice 10:

L'appel `super.getPuissane(FrequenceCoupsDePedale)` dans la méthode `VeloElec.getPuissane()` permet de reprendre la méthode de la class `Velo` et de l'incorporer dans la class `VeloElec`.