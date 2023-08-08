

```cpp
instance yazid { "docker1", 'docker2', "docker3" }
repo git_repos {"git1", "git2", "git3"}
project projects_yazid {"C:\\Proj\\1", "C:\\Proj\\2", "/home/yazid/proj12"}
file single_file {"le_fichier_de_confiuguration_bizzare.tf"}
```

```cpp
token github_token1 "github_machin_46e6f6e46e4f6e4dz6ed46ze4fez56f4z6e5d46z"
report rapport_docker "mon_rapport_sur_les_images_docker.json"

// Déclaration de target ou de tableaux de targets

// Images docker
image images_docker {"docker1:latest", "docker2:latest", "docker3:latest", "docker4:latest"}
image image_docker_proc_unit "ghcr.io/procunit:latest"

// Dépôts git
repo git_repos {"https://github.com/Xacone/DevSecOpsAdvisor", "https://github.com/ESIR2-PROJET-KEOLIS/processing-storage-unit"}
repo mon_projet_git "https://github.com/Xacone/AMSI-DLL-Injection"

// Projets bruts
project mes_projets {"/home/yazid/mon_projet_vulnerable", "C:\Windows\System32\*"}
project mes_projet vulnerable "/root/insecure-flight-booking-app/"

// Accession aux éléments des tableaux
images_docker[1] -> "docker2:latest"
git_repos[0] -> "https://github.com/Xacone/DevSecOpsAdvisor"

// Actions

// Afficher les informations en relations avec le truc
on images_docker do 
	// Assignation à variables (??)
	var1 = fetch plang // Fetching programming languages used in images
	var2 = fetch fwork // Fetch frameworks used in images
	
// Opérations sur les boucles
on images_docker do
	
	check dependencies 
	print // Affichera simplement le contenu des tableaux 
	// Sans filtres -> Renverra tout par défaut et tous les résultats nécessaires

// Commun à tous les objets sur lesquels l'on souhaite effectuer des opérations d'analyse de vulnérabilités
	check vulns dependencies // Filtrage
		filter by id // Filtrer uniquement les résultats basés sur un seul typ
			filter by cve
			filter by cwe
		filter by severity critical, high, medium, low, info // On veut afficher les vulnérabilités associées à un ou plusieurs degrés de sévérité
		exclude refs //// prints result buy
		enable rapidcheck // It checks (among other things ?) the number of files and then decides if it should use time-consuming tools or not	

on mes_projets do
	check leaks

// Opérateurs
	// Vérification d'égalité (=) ?
// Conditions
	// 
```
