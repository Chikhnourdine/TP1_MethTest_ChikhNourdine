Les problèmes choisis:

	Problème 1: Conversion des nombres Romains vers nombres entiers.
		Le test est fait sur la conversion des nombres constitués d'un seul caractère pour faire des tests unitaires.
		Pour faire le test en entier (traiter des nombres constitués de plusieurs caractères), il faut faire l'intégration de ces tests unitaires, ce 		qui n'a pas été fait pour des contraintes de temps et vu que le TDD se fait sur les tests unitaires.
	Problème 2: Conversion des notations mathématiques préfixées vers notations postfixées.
	Problème 3: C'est la suite du problème 2 qui consiste à Evaluer les notations postfixées obtenues à partir d'une notation préfixées.

Memebres du groupe: Ayant raté la première scéance du TP, je n'avais pas de binôme et j'ai dû travailler tout seul chez moi sur ce TP.

Instructions d'utilisation:
	Le dépôt contient les trois problèmes traités.
	Pour voir la liste des commit, faire: git log
	Les commit sont organisés de la façon suivante(de la fin au début):
		Ajout de ce fichier README

		Factorisation du troisième problème.
		Test qui marche pour le troisième problème.
		Test d'échec pour le troisième problème.

		Factorisation du deuxième problème.
		Test qui marche pour le deuxième problème.
		Test d'échec pour le deuxième problème.

		Factorisation du premier problème.
		Test qui marche pour le premier problème.
		Test d'échec pour le premier problème.
	
	Pour utiliser les projets et les tester sur la bonne version (l'étape qu'on veut voir)
		Faire un "git log" pour récupérer la liste des commit.
		Récupérer l'identifiant du commit.
		Aller l'étape désirée avec la commande
			git revert <commit>
			avec <commit> celui récupéré dans l'étape précédente.
		Copier le projet dans le workspace d'eclipse (ou bien switcher le workspace vers le répertoire ou se trouve le projet).
		Ouvrir le projet et le traiter tel qu'un projet eclipse pour la compilation et l'exécution.
	
