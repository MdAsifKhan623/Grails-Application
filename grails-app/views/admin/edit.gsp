<html>
    <head>
        <title>Edit Product</title>
    </head>
    <body>
        <center>
        <h1>Edit Product</h1>
        <br />
        <g:form action="update" id="${products.id}">
           <g:textField placeholder="Product Name" name="productName"
                     value="${products.productName}"/><br /><br />
            <g:textField name="productType"
                             value="${products.productType}"/><br /><br />
            <g:textField name="price"
                             value="${products.price}"/><br /><br />
            <g:actionSubmit value="Update" />
        </g:form>
        </center>
    </body>
</html>