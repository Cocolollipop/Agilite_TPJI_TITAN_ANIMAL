

Feature: US04 Courir pour un humain
  En tant qu'utilisateur je veux pouvoir faire courir n'importe quel humain 
  Afin d'améliorer l'expérience utilisateur

  
  Scenario Outline: Faire courir un humain
    Given Un humain <nom> <taille>
    When je cours
    Then je cours a ma facon <resultat>


    Examples: 
      | nom  | taille | resultat |
      | "Rean" | 50 | "Je cours"|
      
 
  Scenario Outline: Faire courir un titan
    Given Un titan <nom> <taille> <type>
    When je cours
    Then je cours a ma facon <resultat>

    Examples: 
      | nom  | taille | type | resultat |
      | "Rean" |50 | "DEVIANT" | "Je zig-zag comme un Titan" |
      

  Scenario Outline: Faire courir un homme
    Given Un homme <nom> 
    When je cours
    Then je cours a ma facon <resultat>

    Examples: 
      | nom  | resultat|
      | "Maria" | "Je cours comme un Homme" |
