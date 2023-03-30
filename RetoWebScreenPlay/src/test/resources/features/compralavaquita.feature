Feature: Compra la vaquita
  yo como usuario de la vaquita
  quiero iniciar sesion en su pagina web
  para comprara productos

  Scenario: compra un producto
    Given el usuario ingresa a la pagina web de la vaquita
    When diligencia el formulario de inicio de sesion
    And el usuario selecciona un producto para comprar
    Then deberia visualizar un mensaje para realizar el pago