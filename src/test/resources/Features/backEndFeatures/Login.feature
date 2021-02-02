@Api
#language: es

Característica: Como usuario requiero un Login en el sistema para que los usuarios puedan consultar
  su información financiera de forma segura.

  Escenario: 01 - Success Login
    Cuando ingreso email y password
    Entonces recibo 200

  Escenario: 02 - Fail Login - User
    Cuando ingreso email invalido y password valido
    Entonces recibo 4xx

  Escenario:03 - Fail Login - Pass
    Cuando ingreso email valido y password invalido
    Entonces recibo 4xx


  Escenario:04 - Login fallido - Campos vacios
    Cuando ingreso email vacio y password vacio
    Entonces recibo 4xx
