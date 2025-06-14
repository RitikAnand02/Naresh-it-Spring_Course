<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="frm" %>
<h1  style="color:red;text-align:center"> Doctor Edit  Page </h1>

<frm:form action="edit"  modelAttribute="doc"  >
  <table  align="center"  bgcolor="cyan">
     <tr>
        <th>   Id::  </th>
        <th>  <frm:input type="text"  path="did"  readonly="true"/>
     </tr>
     
     <tr>
        <th>  Name::  </th>
        <th>  <frm:input type="text"  path="dname"/>
     </tr>
     <tr>
        <th>  Address::  </th>
        <th>  <frm:input type="text"  path="addrs"/>
     </tr>
     <tr>
        <th> Expert::  </th>
        <th>  <frm:input type="text"  path="expert"/>
     </tr>
     <tr>
        <th> Fee:  </th>
        <th>  <frm:input type="text"  path="fee"/>
     </tr>
     <tr>
        <th> <input type="Submit"  value="Edit Doctor"/> </th>
        <th>  <input type="reset"  value="reset"/>  </th>
     </tr>
     </table>
</frm:form>

