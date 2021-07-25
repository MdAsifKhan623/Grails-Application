<html>
    <head>
        <title>Sign Up</title>
    </head>
    <body>

        <center>
        <h1>Sign Up</h1>
        <br/><br/>
        <g:form action="save">
            <g:textField placeholder="Email Id" name="emailId" /><br /><br />
            <g:textField placeholder="Full Name" name="customerName" /><br /><br />
            <g:passwordField placeHolder="Password" name="customerPassword" /><br /><br />
            <g:passwordField placeHolder="Confirm Password" name="confirmPassword" /><br /><br />
            <g:actionSubmit value="Save" />
        </g:form>
        </center>
    </body>
</html>