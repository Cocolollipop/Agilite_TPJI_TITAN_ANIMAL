
Feature: US03 Adopter un animal
  En tant qu'utilisateur je veux dresser un Animal 
  Afin d'améliorer l'expérience utilisateur et creer des liens entre personnages

  Scenario Outline: Un homme adopte un animal
    Given Un homme quelconque <nom>
    And Un animal <nomAnimal> <age> <couleurCollier> <longueurCollier>
    When l homme adopte animal
    Then le lien entre les deux se créer


    Examples: 
      | nom  | nomAnimal | age| couleurCollier | longueurCollier | 
      | "Rean" | "Pipa" | 5 | "rouge" |    50 | 
