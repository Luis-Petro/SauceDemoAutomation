#Author: Luis Petro
@CompraExitosa
  Feature: Compra SWAGLABS

    Compra exitosa por parte de un User en SWAGLABS

    Scenario Outline: Compra exitosa
      Given Que un user ingresa sus credenciales en la pagina
        |  user    |  <user> |
        | password |  <password> |

      When Seleccione el producto de menor precio
      And Confirma la orden
          | primer_nombre | <primer_nombre> |
          | apellidos     | <apellidos>     |
          | codigo_postal | <codigo_postal> |

      Then realizara la orden/pedido de manera exitosa

      Examples:
      |      user       |    password  |primer_nombre| apellidos| codigo_postal|
      |standard_user    | secret_sauce | Luis        | Petro   |  1234         |
      |standard_user    | secret_sauce | Alberto     | Herrera |  5678         |