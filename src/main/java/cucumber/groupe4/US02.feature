
@tag
Feature: US02 Détruire un mur
  En tant qu'utilisateur je veux détruire un mur 
  Afin que les titans puissent attaquer les humains

  @tag1
  Scenario Outline: Si le titan est plus grand que le mur
    Given Un titan
    And Un mur <nomMur> <taille>
    When il attaque le mur
    Then j obtiens <resultat>


    Examples: 
     |nomMur | taille  | resultat |
      | "Tulipe" |     7 | "Attaque : Super efficace" |
      
  @tag2
  Scenario Outline: Si le titan est plus petit que le mur
    Given Un titan
    And Un mur <nomMur> <taille>
    When il attaque le mur
    Then j obtiens <resultat>


    Examples: 
     |nomMur | taille  | resultat |
      | "Marguerite" |     100 |  "Le mur a senti des chatouilles.." |
      
     @tag3
  Scenario Outline: Si le titan est aussi grand que le mur
    Given Un titan
    And Un mur <nomMur> <taille>
    When il attaque le mur
    Then j obtiens <resultat>


    Examples: 
     |nomMur | taille  | resultat |
      | "Rose" |     50 |  "Pas très efficace"|

