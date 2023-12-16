<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<body bgcolor="cornsilk">
    <center>
    <h1 style="color:aqua">View All student Form</h1>
    <table border="1">
        <tr>
            <th>SID</th>
            <th>FULLname</th>
            <th>Subject1</th>
            <th>Subject2</th>
            <th>Subject3</th>
            <th>Total</th>
            <th>Percentage</th>
            <th>Grade</th>
            <th>Delete</th>
            <th>Update</th>
        </tr>
        <c:forEach var="s1" items="${students}">
            <tr>
                <td>${s1.sid}</td>
                <td>${s1.fullname}</td>
                <td>${s1.sub1}</td>
                <td>${s1.sub2}</td>
                <td>${s1.sub3}</td>
                <td>${s1.total}</td>
                <td>${s1.percentage}</td>
                <td>${s1.grade}</td>
                <td><a href="/delete/${s1.sid}">delete</a></td>
                <td><a href="/update/${s1.sid}">update</a></td>
            </tr>
        </c:forEach>
    </table>
</center>
    </body>