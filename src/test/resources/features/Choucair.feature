#Author: eapaezh@correo.udistrital.edu.co

@retoChoucair
Feature: Prueba de ingreso Choucair


  @tag1
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    Then valido final <value> <status>

    Examples: 
      | name  | value | status  |
      | "name1" |     "5" | "success" |
       | "name1" |     "6" | "success" |

  @tag2
  Scenario Outline: Title of your scenario outline 2
    Given I want to write a step with <name>
    Then valido final <value> <status>

    Examples: 
      | name  | value | status  |
      | "name1" |     "5" | "success" |
       | "name1" |     "6" | "success" |

