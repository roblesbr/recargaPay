@Nexus5xOreo

Feature: Dada la apk, realizar pruebas para que se validen las opciones de resultados
  de triángulos Escalenos, Isósceles y Equilátero ingresando los valores de los lados

  Scenario: Test Mobile
    Given estoy dentro de la aplicacion
    When ingreso 1,5,5
    And presiono calcular
    Then recibo Isosceles
    When ingreso 1,3,5
    And presiono calcular
    Then recibo Escaleno
    When ingreso 5,5,5
    And presiono calcular
    Then recibo Equilatero

