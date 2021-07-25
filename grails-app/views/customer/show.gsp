<html>
    <head>
        <title>Show Customer and Login Page</title>
    </head>
    <body>
        <center>
        <h1>Welcome ${customers.customerName}. You have been added as a member.</h1>
        <br />
        <h1>Login</h1>
        <g:form action="find">
                    <g:textField placeholder="Email Id" name="emailId" /><br /> <br />
                    <g:passwordField placeholder="Password" name="customerPassword" /><br /> <br />
                    <g:actionSubmit value="Find" />
         </g:form>
        </center>
    </body>
</html>