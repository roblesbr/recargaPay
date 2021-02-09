@Api

Feature: Consulta que obtenga  3 personajes de manera aleatoria
         y muestre el nombre, y la última película filmada.

  Scenario: Test Recarga Pay
    Given I'm a Star Wars fan
    When ask what was the last movie of my favorite characters
    Then receive the names of the characters and the last movie filmed

