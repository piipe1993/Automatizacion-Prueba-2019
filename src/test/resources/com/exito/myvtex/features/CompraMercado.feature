Feature: Validar compras de mercado con peso fijo y peso variable.

Background:
Given ingresar al ambiente de pruebas del exito "andres.cardona@sqasa.co" "Andres1993"

@TestCase1
Scenario Outline: Compra pedido mercado peso fijo
Given seleccionamos categoria <categoria> y subcategoria <subcategoria>
And seleccionamos y agregamos producto <producto>
And clic sobre envio a domicio en la modal, ingresar email <emailModal> y finalizar modal
And clic sobre boton checkout
And clic sobre boton finalizar compra
And elegir fecha de entrega
And dar clic en ir a metodo de pago
And Seleccionar metodo pago
And clic sobre boton pagar
Then se finaliza la compra correctamente y se visualiza el numero de pedido


Examples:
|categoria|subcategoria|producto            |emailModal             |
|Mercado  |Frutas       |Mango				|andres.cardona@sqasa.co|




