<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style></style>
</head>
<body>

 
    <form method="POST" action='/addUser' name="addUser">

    	<table>
    		<tr>
    			<td>Name</td>
				<td><input type="text" name="name" ${user.name}/></td>
			</tr>
			<tr>
    			<td>FirstName</td>
        		<td><input type="text" name="firstname" ${user.firstname} /></td>
        	</tr>
        	<tr>
    			<td>Date de Naissance</td>
        		<td><input type="text" name="dateNaissance" ${user.dateNaissance} /></td>
        	</tr>
        	<tr>
    			<td>Date de Création</td>
        		<td><input type="text" name="dateCreation" ${user.dateCreation} /></td>
        	</tr>
        	<tr>
    			<td>&nbsp;</td>
        		<td><input type="submit" value="Submit" /></td>
        		<td>&nbsp;</td>
        	</tr>
        </table>
        
    </form>
</body>
</html>