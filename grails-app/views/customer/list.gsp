<html>
    <head>
        <title>List contacts</title>
    </head>
    <body>
        <center>
        <h1>List of Products</h1>
        <h2>Welcome ${customers.customerName}. Check the Products.</h2>
        <g:each in="${products}" var="product">

            Name: ${product.productName}<br />
            Product Type: ${product.productType}<br />
            Price: ${product.price}<br />

            <g:link action="add"
               id="${product.id}">Add To Cart</g:link><br />

            <g:link action="wish"
               id="${customers.id}">Add to WishList</g:link><br /><br />
        </g:each>
        </center>
    </body>
</html>