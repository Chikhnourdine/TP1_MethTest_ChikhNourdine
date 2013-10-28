Les probl�mes choisis:

	Probl�me 1: Conversion des nombres Romains vers nombres entiers.
		Le test est fait sur la conversion des nombres constitu�s d'un seul caract�re pour faire des tests unitaires.
		Pour faire le test en entier (traiter des nombres constitu�s de plusieurs caract�res), il faut faire l'int�gration de ces tests unitaires, ce 		qui n'a pas �t� fait pour des contraintes de temps et vu que le TDD se fait sur les tests unitaires.
	Probl�me 2: Conversion des notations math�matiques pr�fix�es vers notations postfix�es.
	Probl�me 3: C'est la suite du probl�me 2 qui consiste � Evaluer les notations postfix�es obtenues � partir d'une notation pr�fix�es.

Memebres du groupe: Ayant rat� la premi�re sc�ance du TP, je n'avais pas de bin�me et j'ai d� travailler tout seul chez moi sur ce TP.

Instructions d'utilisation:
	Le d�p�t contient les trois probl�mes trait�s.
	Pour voir la liste des commit, faire: git log
	Les commit sont organis�s de la fa�on suivante(de la fin au d�but):
		Ajout de ce fichier README

		Factorisation du troisi�me probl�me.
		Test qui marche pour le troisi�me probl�me.
		Test d'�chec pour le troisi�me probl�me.

		Factorisation du deuxi�me probl�me.
		Test qui marche pour le deuxi�me probl�me.
		Test d'�chec pour le deuxi�me probl�me.

		Factorisation du premier probl�me.
		Test qui marche pour le premier probl�me.
		Test d'�chec pour le premier probl�me.
	
	Pour utiliser les projets et les tester sur la bonne version (l'�tape qu'on veut voir)
		Faire un "git log" pour r�cup�rer la liste des commit.
		R�cup�rer l'identifiant du commit.
		Aller l'�tape d�sir�e avec la commande
			git revert <commit>
			avec <commit> celui r�cup�r� dans l'�tape pr�c�dente.
		Copier le projet dans le workspace d'eclipse (ou bien switcher le workspace vers le r�pertoire ou se trouve le projet).
		Ouvrir le projet et le traiter tel qu'un projet eclipse pour la compilation et l'ex�cution.
	
