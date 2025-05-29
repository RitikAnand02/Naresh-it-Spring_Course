<%@ page isELIgnored="false"%>

<h1 style="color:red;text-align:center">Home Page</h1>
<br><br>
<form action="register" method="post">
<table border=1 algin="center" bgcolor="cyan">
   <tr>
    <td>Student Number</td>
    <td><input type="text" name="sno"></td>
    </tr>
    <tr>
    <td>Student Name</td>
    <td><input type="text" name="sname"></td>
    </tr>
    <tr>
    <td>Student Address</td>
    <td><input type="text" name="saddrs"></td>
    </tr>
    <tr>
    <td>Student avg</td>
    <td><input type="text" name="avg"></td>
    </tr>
    <tr>
    <td colspan="2"><input type="submit" value="register"></td>
</table>
</form>
