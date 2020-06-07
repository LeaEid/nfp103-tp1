# nfp103-tp1
8 exercices de TP


## Exercice 1 : Des threads indépendants
Un "compteur" a un nom (Cpt par exemple) et il compte de 1 à n
(nombre entier positif quelconque). Il marque une pause aléatoire
entre chaque nombre (de 0 à 5000 millisecondes par exemple).

Un compteur affiche chaque nombre (Cpt affichera par exemple, "Cpt
: 3") et il affiche un message du type "*** Cpt a fini de compter jusqu'à
10" quand il a fini.

Écrivez la classe compteur et testez-la en lançant plusieurs
compteurs qui comptent jusqu'à 10. Voyez celui qui a fini le plus
vite.

### Correction: quand elle sera disponible

[Compteur.java](Correction/exo1/Compteur.java)

## Exercice 2 : Des threads un peu dépendants
Modifiez la classe Compteur pour que chaque compteur affiche son ordre
d'arrivée : le message de fin est du type : "Cpt a fini de compter
jusqu'à 10 <font color="#FF0000">en position 3</font>".

### Correction: quand elle sera disponible

<a href="Correction/exo2/Compteur.java">Compteur.java</a>


<hr WIDTH="100%">


## Exercice 3 : Un problème d'accès concurrent</h2>
Voici 2 classes 

<tt><a href="Compte.java">Compte</a></tt> (correspond à
un compte bancaire) 

et <tt><a href="Operation.java">Operation</a></tt> (thread qui effectue des opérations sur un compte bancaire).


<ol>
<li>
Examinez le code et faites exécuter la classe <tt>Opération</tt>.
Constatez le problème : opération effectue des opérations
qui devraient laisser le sode du compte inchangé, et pourtant, après
un moment, le solde ne reste pas à 0. Expliquez.</li>

<li>
Modifiez le code pour empêcher ce problème.</li>

<li>
Dans le code de <tt>Operation</tt>, remplacez l'opération nulle
par 2 opérations ajouter et retirer qui devraient elles aussi laisser
le solde du compte à 0 (elles sont en commentaire dans le code).
Lancez l'exécution et constatez le problème. Modifiez le
code pour que ça marche.</li>
</ol>

## Correction: quand elle sera disponible

<a href="Correction/synchronized/Compte.java">Compte.java</a> 
<a href="Correction/synchronized/Operation.java">Operation.java</a>

Pour la dernière question : <a href="Correction/synchronized2/Compte.java">Compte.java</a>
<a href="Correction/synchronized2/Operation.java">Operation.java</a>


<hr WIDTH="100%">

# Exercice 4 : Tris parallèles</h2>
Voici un algorithme de tri en ordre croissant d'une tranche de tableau
comprise entre les éléments d'indices <tt>debut</tt> et <tt>fin</tt>
:
```C 
trier(debut, fin) {
   si (fin - debut < 2) {
     si (t[debut] > t[fin])
       echanger(t[i], t[j])
   }
   sinon {
     milieu = (i + j) / 2
     trier(debut, milieu)
     trier(milieu + 1, fin)
     triFusion(milieu) // tri fusion des 2 moitiés du tableau
   }
 }
 ```
On remarque que les 2 tris qui sont effectués avant la fusion sont indépendants l'un de l'autre et il est donc facile des les faire exécuter en parallèle par 2 threads.

[Voici](Trieur.java) une version Java mono-tâche de cet algorithme. Vous pouvez coder votre propre version si vous le souhaitez:


<hr WIDTH="100%">

## Exercice 5 :
Codez une nouvelle version en utilisant cette fois-ci <tt>wait()</tt> -
<tt>notify()</tt>
au lieu de <tt>join()</tt>.

Relancez plusieurs fois (au moins une dizaine de fois) votre programme
pour essayer de repérer des éventuels problèmes liés
au multi-tâche.

## Correction: quand elle sera disponible 

<a href="Correction/avecwait/Trieur.java">Trieur.java</a>

<hr WIDTH="100%">

## Exercice 6 :
Si votre programme de l'exercice précédent marche parfaitement,
bravo !
<p>Pour vous montrer tout de même le type de problème que
l'on peut rencontrer avec la programmation de plusieurs tâches, <a href="Correction/avecwait/TrieurFaux.java">voici</a>
une classe qui induit ce type de problème. Lancez-la plusieurs fois
jusqu'à obtenir un mauvais fonctionnement (blocage du programme).
<p>Expliquez le problème et donnez une solution (vous l'avez peut-être
déjà donnée dans votre programme de l'exercice précédent).

## Correction: quand elle sera disponible 
(C'est la même correction que l'exercice précédent)
<br><a href="Correction/avecwait/Trieur.java">Trieur.java</a>

<hr WIDTH="100%">

## Exercice 7 : Produit de 2 matrices en multi-tâches
Rappel : (Aij) . (Bkl) = (Pmn) avec Pmn = <font face="Symbol">S (</font>Amj
. Bjn)
<p>On remarque que les calculs des Pmn sont indépendants les uns
des autres. On peut donc facilement effectuer ces calculs en parallèles.
<br>Ecrivez une classe Matrice (n'implantez que les méthodes utiles
pour effectuer le produit de 2 matrices en parallèle).

### Correction : Retouver l'introduction de ma partie de cours!

<hr WIDTH="100%">

## Exercice 8 : Des threads un peu plus dépendants
Modifiez la classe Compteur de l'exercice 2 pour que chaque compteur donne
un coup de pouce à un des autres compteurs (choisi au hasard) juste
après avoir affiché un nombre : il interrompt la pause de
cet autre compteur (pause entre l'affichage de 2 nombres), ce qui raccourcit
le délai entre l'affichage de 2 nombres.



