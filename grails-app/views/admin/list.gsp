<html>
    <head>
        <title>List contacts</title>
    </head>
    <body>
        <center>
        <h1>Welcome to the Store Admin</h1>
        <g:each in="${products}" var="product">

            Name: ${product.productName}<br />
            Product Type: ${product.productType}<br />
            Price: ${product.price}<br />

            <g:link action="edit"
               id="${product.id}">Edit</g:link><br />
            <g:link action="delete"
               id="${product.id}">Delete</g:link><br /><br />
        </g:each>
        <g:link action="create">Add New Products</g:link>
        </center>
    </body>
</html>