@Chrome
#language: es
Característica: Como PO requiero un Login en el sistema para que los usuarios puedan consultar
  su información financiera de forma segura.

  Escenario: 01 - Login exitoso
    Dado que ingrese al Login de Banorte
    Cuando ingreso usuario y contraseña
    Y presiono el botón Entrar
    Entonces ingreso al home Banorte

  Escenario: 02 - Login fallido - User
    Dado que ingrese al Login de Banorte
    Cuando ingreso usuario y contraseña
    Pero el usuario es invalido
    Y presiono el botón Entrar
    Entonces se me muestra un mensaje de Advertencia

  Escenario:03 - Login fallido - Pass
    Dado que ingrese al Login de Banorte
    Cuando ingreso usuario y contraseña
    Pero la contraseña es invalida
    Y presiono el botón Entrar
    Entonces se me muestra un mensaje de Advertencia


  Escenario:04 - Login fallido - Campos vacios
    Dado que ingrese al Login de Banorte
    Cuando dejo campos en blanco
    Y presiono el botón Entrar
    Entonces se me muestra un mensaje de Advertencia