<html>
    <head>
        <title>List contacts</title>
    </head>
    <body>
        <center>
        <h1>List of Products</h1>
        <g:each in="${wishlist}" var="product">

            Name: ${wishList.customerId}<br />
            Product Type: ${wishList.wishNo}<br />
            <g:link action="delete"
               id="${product.id}">Remove</g:link><br /><br />
        </g:each>
        </center>
    </body>
</html>