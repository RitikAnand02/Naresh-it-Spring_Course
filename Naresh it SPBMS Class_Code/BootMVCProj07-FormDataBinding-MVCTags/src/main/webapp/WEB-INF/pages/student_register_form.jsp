<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="frm" %>

<h1 style="color:red;text-align:center"> STudent Registration Form Page </h1>

<frm:form   modelAttribute="stud" >
  <table  border="0"  align="center"  bgcolor="cyan">
   <tr>
      <td> Student Number::  </td>
      <td>  <frm:input type="text" path="sno"  title="enter sno" />
   </tr>
   <tr>
      <td> Student Name  </td>
      <td>  <frm:input type="text" path="sname"/>
   </tr>
   <tr>
      <td> Student Address  </td>
      <td>  <frm:input type="text" path="sadd"/>
   </tr>
   <tr>
      <td> Student Avg  </td>
      <td>  <frm:input type="text" path="avg"/>
   </tr>
   <tr>
      <td> <input type="submit"  value="send"/> </td>
      <td> <input type="reset"  value="cancel"/> </td>
   </tr>
   </table>
</frm:form>
