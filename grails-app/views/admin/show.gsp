<html>
    <head>
        <title>Show Products</title>
    </head>
    <body>
        <center>
        <h1>The Following Product has been added</h1>
        <h3>${products.productName}</h3>
        <h3>${products.price}$</h3>
        <g:link action="edit" id="${products.id}">Edit</g:link><br />
        <g:link action="delete" id="${products.id}">Delete</g:link><br />
        <g:link action="list" >Go to the Store</g:link>
        </center>
    </body>
</html>