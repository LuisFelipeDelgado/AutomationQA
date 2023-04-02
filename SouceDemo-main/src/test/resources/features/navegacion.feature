#language:en
Feature: Navegacion y categorias de productos en el sitio web

  Background: Usuario visita la pagina principal
    Given que un usuario visita la pagina principal

  Scenario: Iniciar sesion con exito
    Given que estoy en la pagina de inicio de sesion
    When ingreso mi nombre de usuario "standard_user" y mi contrasena "secret_sauce"
    Then veo la pagina de productos


  Scenario Outline: Agregar un producto al carrito de compra
    Given ingreso mi usuario "standard_user" y mi contrasena "secret_sauce"
    And que estoy en la pagina de productos
    When selecciono el producto "<producto>" de la lista
    And presiono el boton de agregar al carrito "<producto>"

    Examples:
      | producto                  |
      | Sauce Labs Backpack       |
      | Sauce Labs Bike Light     |
      | Sauce Labs Bolt T-Shirt   |