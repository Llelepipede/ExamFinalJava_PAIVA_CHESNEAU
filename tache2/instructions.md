# Exercice 1 - *Panier d'oranges*
1. Dans un paquetage `m1.examen_final.rendu.tache1`, écrire une classe `Orange` contenant 2 champs `value` et `origin` représentant respectivement la valeur (en cts d'euros de type `long`) et le pays d'origine de l'orange (représenté par une chaîne de caractères).
2. Écrire le constructeur prenant en paramètres les valeurs des champs précédents, ainsi que les méthodes `getValue()` et `getOrigin()`.
3. Écrire une méthode `toString()` qui affiche les caractéristiques de l'orange au format `Orange Floride 0.7`.
À quoi sert l'annotation `@Override` ? Doit-on l'utiliser dans ce cas ?
4. Écrire une classe `Basket` permettant de stocker des instances de la classe `Orange`. Ces oranges seront stockées dans un `Basket` à l'aide d'une `java.util.ArrayList`.
Rappelez la différence entre un tableau et une ArrayList. Ajouter une méthode à Basket qui permet d'ajouter une orange dans le panier.
5. On souhaite que tous les paniers possèdent un identifiant (champ entier id) différent qui leur est propre. Par exemple, on peut utiliser le nombre d'instances créées de la classe `Basket`. Implémenter cette solution (penser aux champs statiques).
6. Écrire dans la classe `Basket` une méthode `toString()` permettant d'afficher l'identifiant du panier et son contenu, ligne à ligne, en utilisant un `StringBuilder`. La sortie devra être de la forme suivante:
```Java
Basket id - 1 - [
Orange Espagne 0.9
Orange Floride 0.7
]
```
7. Écrire une méthode permettant de connaître la valeur d'un panier; ce dernier correspond à la somme des valeurs des oranges qu'il contient.
8. On veut désormais pouvoir lier la valeur d'une orange à son niveau de qualité (supposée liée au nombre de pépins). Un "niveau" de pépins par défaut est de 0 (normal): il ne modifie pas la valeur spécifiée. On supppose que plus il y a de pépins, plus le niveau monte et, à chaque niveau supplémentaire, la valeur de l'orange baisse de 5 centimes. Par exemple, une orange d'Espagne à 90 centimes avec un niveau de pépins de 3 vaut 75 centimes.
Ajoutez le champs seedsLevel à la classe Orange et modifiez votre implémentation en conséquence. Le niveau de pépins peut ou non être spécifié à la création de l'orange (surcharge du constructeur).
9. Rendre impossible la création d'une orange dont le niveau de pépin diminue de plus de moitié sa valeur par défaut (voir du côté des exceptions).

# Exercice 2 - Référence, *comparaison d'objets*
- Exécutez le code dans la classe `Exo2a.java`.
Ajouter dans `Orange` une méthode ayant pour signature
```Java
public boolean equals(Orange o);
```
pour que l'execution du main ci-dessus soit plus naturel.
- Puis exécutez le code dans la classe `Exo2b.java`.
Le comportement du code ci-dessus correspond-t-il à vos attentes ? Pourquoi ?
Que doit on modifier ?
Utiliser l'annotation @Override pour vérifier.

# Exercice 3 -*Panier de fruits*
On souhaite maintenant ajouter d'autres types de fruits à notre panier.
1. Ecrire une classe `Banana` contenant un unique champ `origin` représentant le pays d'origine de la banane.
2. On considère ici que la valeur d'une banane est fixée et unique (constante). Apportez les modifications nécessaires.
3. Quels changements dans votre hiérarchie des classes s'imposent pour pouvoir ajouter une Banana à votre panier ?
Effectuez les.
4. Finalement, on souhaite que certains fruits puissent avoir un prix *discount* sur une étiquette, remplaçant alors la valeur usuelle. Pour ce faire, le fruit se voit doté d'une étiquette (classe `Ticket`) précisant le prix de ce dernier (en l'absence d'étiquette, le prix est la valeur normale). Apportez les changements néccessaires à la prise en compte de cette nouvelle contrainte.
5. Écrire une méthode `void boycottOrigin(String country)` dans la classe `Basket` qui retire du panier tous les fruits dont l'origine est passée en argument.
Le code suivant doit fonctionner :
```Java
Basket b = new Basket();
b.addFruit(new Orange("France", 80));
b.addFruit(new Orange("Espagne", 80));
b.addFruit(new Orange("Floride", 90));
b.boycottOrigin("France"); 
```