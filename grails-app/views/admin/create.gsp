<html>
    <head>
        <title>Create new contact</title>
    </head>
    <body>
        <center>
        <h1>Create new product</h1>
        <g:form action="save">
            Product Name: <g:textField name="productName" /><br /> <br />
            Product Type: <g:textField name="productType" /><br /> <br />
            Price: <g:textField name="price" /><br /><br />
            <g:actionSubmit value="Save" />
        </g:form>
        </center>
    </body>
</html>