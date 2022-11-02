<!DOCTYPE HTML>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>User List</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
  </head>
  <body>
    <h1>User List</h1>
   
    <br/><br/>
    <div>
      <table border="1">
        <tr>
          <th>First Name</th>
          <th>Last Name</th>
        </tr>
        <c:forEach var ="user" items="${users}" >
        <tr>
          <td>${user.name}</td>
          <td>${user.firstname}</td>
        </tr>
        </c:forEach>
      </table>
    </div>
  </body>
 