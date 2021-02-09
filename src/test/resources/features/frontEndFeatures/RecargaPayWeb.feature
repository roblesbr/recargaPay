@Chrome

Feature: Test de Front End Web

  Scenario:  Verificar popup con mismo número ingresado
  Given ingrese al sitio Recarga Pay
  When selecciono recarga celular
  And  ingreso mi numero de telefon y presiono el boton continuar
  Then mi numero figura en el popup
