<html>
    <head>
        <title>Show Products</title>
    </head>
    <body>
        <center>
        <h1>Show Products</h1>
        Name:${products.productName}<br />
        Price: ${products.price}<br />
        <g:link action="edit" id="${products.id}">Edit</g:link><br />
        <g:link action="delete" id="${products.id}">Delete</g:link>
        </center>
    </body>
</html>