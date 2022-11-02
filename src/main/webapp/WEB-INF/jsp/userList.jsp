
<%@ page import="java.util.*" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>User Liste</title>
    <meta charset="UTF-8">
    <style>
   table  {
       margin-top: 10px;
       border: solid black 1px;
   }
   table  td {
        padding: 5px;
   }
   .message  {
        font-size:90%;
        color:blue;
        font-style:italic;
        margin-top:30px;
   }
</style>
</head>
<body>

<h1>Result</h1>

<body>

    <table border="1">
 <tr>
  <th>Id</th>
   <th>Name</th>
   <th>Firstname</th>
   <th>Date de Naissance</th>
   <th>Date de Création</th>
   <th>Edit</th>
   <th>Delete</th>
 </tr>
<c:forEach  items="persons" var ="person">
    <tr>
    <td>  <c:out value="${person['id']}" /> </td>
  <td><c:out value="${person['name']}" /></td>
   <td> <c:out value="person.name" />  </td>
   <td>  <c:out value="person.firstname" /> </td>
   <td>  <c:out value="person.DateNaissance" /> </td>
   <td>  <c:out value="person.DateCreation" /> </td>
   <td>  <c:out value="person.image" /> </td>
   <td> <a href="deleteUser?id=${info.id}">Delete</a> </td>
   <td> <a href="editUser?id=${info.id}">Edit</a> </td>
 </tr>    
 </c:forEach>
</table>
</body>
<a href="/addUser">Submit another message</a>

</body>
</html>