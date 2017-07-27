
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show All Students</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>Student ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Course</th>
                <th>Year</th>
                <th colspan="2">Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${students}" var="student">
                <tr>
                    <td><c:out value="${student.studentId}" /></td>
                    <td><c:out value="${student.firstName}" /></td>
                    <td><c:out value="${student.lastName}" /></td>
                    <td><c:out value="${student.course}" /></td>
                    <td><c:out value="${student.year}" /></td>
                    <td><a
                        href="StudentController.do?action=edit&studentId=<c:out value="${student.studentId }"/>">Update</a></td>
                    <td><a
                        href="StudentController.do?action=delete&studentId=<c:out value="${student.studentId }"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <p>
        <a href="StudentController.do?action=insert">Add Student</a>
    </p>
</body>
</html>