# Module 2
## Exercice 1
#### Écrire une méthode demanderEntierEtAfficherParite qui demande un entier à l’utilisateur, et qui affiche si cet entier est pair ou pas.
#### Exemple d’exécution :
```
Entrez un nombre : 13
13 est impair.
```
#### Tip : pour savoir si un nombre est divisible par un autre nombre, on peut utiliser l’opérateur modulo (%). Par exemple, nb % 3 est évalué à true si le nombre contenu dans la variable nb est divisible par 3. Un nombre pair est divisible par 2, un nombre impair ne l’est pas.
## Exercice 4
#### Écrire une méthode qui demande une lettre à l’utilisateur et qui retourne la couleur correspondante. Les lettres valides sont R, V, B. Les couleurs correspondantes sont rouge, vert, bleu. L’utilisateur peut entrer la lettre en minuscule ou en majuscule. La méthode doit retourner « connais pas » si l’entrée utilisateur n’est pas valide. C’est la méthode appelante (main) qui se chargera d’effectuer l’affichage de la couleur choisie.
#### Trois exemples d’exécution :
```
Quelle couleur souhaitez-vous ? b
Vous avez choisi le bleu.

Quelle couleur souhaitez-vous ? R
Vous avez choisi le rouge.

Quelle couleur souhaitez-vous ? Rouge
Connais pas.
```
#### Aide : pour comparer des strings, on n’utilise pas l’opérateur d’égalité ==. Il faut utiliser la méthode equals de la classe String :
```
// ne fonctionne pas, même si s1 et s2 contiennent la même string
if (s1 == s2) { ... }

// Il faut utiliser equals comme ceci pour savoir si s1 est identique à s2
if (s1.equals(s2)) { ... }
```
## Exercice 5
### Écrire une méthode estCapitalisé qui teste si une string commence ou non par une lettre majuscule.
```
capitale("Bonjour") retournera true
capitale("paRiS") retournera false
capitale("FALSE") retournera true
```
#### La classe Character de la Java Class Library contient plusieurs méthodes-tests (de la forme isXXX) qui retournent toutes un booléen (T/F). L’une d’entre elle pourra vous aider dans cet exercice.