## Author: Giovanni Gómez

  Feature: Agregar producto en Target

    Scenario: Agregar un nuevo producto
      Given el Usuario abre pagina
      And se verifica conexion a internet
      And el Usuario busca "womens shoes"
      When el Usuario elige especificacion
      |Color  |Cantidad|
      |Black  |1       |
      Then el Uusario realiza la compra
      And se verifica la compra
