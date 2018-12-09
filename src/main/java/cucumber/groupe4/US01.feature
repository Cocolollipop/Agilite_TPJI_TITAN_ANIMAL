
@tag
Feature: US01 Creation d'un titan
  En tant qu'utilisateur je veux créer un titan
  Afin de diversifier les personnages de mon jeu

  @tag1
  Scenario Outline: Creer un titan
    Given Les attributs <nom> <taille> <type>
    When je cree un titan <nom> <taille> <type>
    Then j obtiens un titan <nom> <taille> <type>


    Examples: 
      | nom  | taille | type  | resultat
      | "Rean" |     50 | "COLOSSAL" | true
      | "Eren" |     7 | "DEVIANT"    | true
