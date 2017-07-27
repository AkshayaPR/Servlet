<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 
<title>Event Registration 1</title>
</head>
<body>
    <form action="EventController.do" method="post">
        <fieldset>
            
            <div>
                <label for="firstName">First Name</label> <input type="text"
                    name="firstName" value="<c:out value="${student.firstName}" />"
                    placeholder="First Name" />
            </div>
            <div>
                <label for="lastName">Last Name</label> <input type="text"
                    name="lastName" value="<c:out value="${student.lastName}" />"
                    placeholder="Last Name" />
            </div>
                <div>
                <input type="submit" value="Submit" />
            </div>
        </fieldset>
    </form>
</body>
</html>