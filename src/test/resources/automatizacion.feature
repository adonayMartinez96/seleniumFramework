Feature: Todos los productos dentro de la orden
    Con este caso Buscamos el agregar productos uno por uno al carrito
    y luego lograr ver los productos dentro de nuestra orden
    de forma exitosa, lista para ser pagada

    Scenario: accedemos a la pagina principal y digitamos el nombre del producto
        Given Navegamos en la pagina principal, buscamos el producto y agregamos al carrito
        When Revisamos la orden en el carrito
        And Realizamos el pago
        Then Validamos que el campo total este disponible
        



