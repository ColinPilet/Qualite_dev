
# Guide de Contribution

Ceci est un guide qui permet de comprendre les méthodes de contribution au projet

# Table de matière

1. [Processus de Contribution](#processus-de-contribution)

2. [Structure des Branches](#structure-des-branches)

3. [Règles pour les Commits](#règles-pour-les-commits)


## Processus de Contribution

1. **Forkez le dépôt** et clonez votre copie en local.
2. Créez une branche pour vos modifications :
    
    ```bash 
    git checkout -b feature/ma-nouvelle-feature
    ```


## Structure des Branches

```main```: Branche de production.

```develop```: Branche de développement.

```feature/*```: Branches pour le développement de nouvelles fonctionnalités.

```fix/*```: Branches pour corriger des bugs spécifiques.

## Règles pour les Commits

- **Soyez clair et concis** : Chaque message doit décrire ce que vous avez changé.
- Utilisez l’un des mots-clés suivants pour commencer votre message :
  - `Ajout` : Pour une nouvelle fonctionnalité ou un fichier.
  - `Correction` : Pour corriger un bug ou un problème.
  - `Mise à jour` : Pour améliorer un code ou une fonctionnalité existante.
  - `Suppression` : Pour retirer du code ou un fichier inutile.
