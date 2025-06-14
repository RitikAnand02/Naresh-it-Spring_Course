<%@ page isELIgnored="false"  contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags"  prefix="sp" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="frm" %>

<h1  style="color:red;text-align:center"><sp:message  code="cust.title"/></h1>

<frm:form  action="register" method="POST"  modelAttribute="cust">
   <table  align="center"  bgcolor="cyan">
     <tr>
        <td><sp:message code="cust.id"/>   </td>
        <td> <frm:input  path="id"/>  </td>
     </tr>
     
     <tr>
        <td><sp:message code="cust.name"/>   </td>
        <td> <frm:input  path="name"/>  </td>
     </tr>
     
     <tr>
        <td><sp:message code="cust.addrs"/>   </td>
        <td> <frm:input  path="addrs"/>  </td>
     </tr>
     
     <tr>
        <td><sp:message code="cust.billamt"/>   </td>
        <td> <frm:input  path="billamt"/>  </td>
     </tr>
     <tr>
        <td  colspan="2"><input type="submit"  
                                                  value="<sp:message code='cust.submit.caption'/>"> </td>
      </tr>
     
     
   </table>

</frm:form>  

<center><a href="?lang=fr_CA">French -CANADA</a>  &nbsp;&nbsp;
                 <a href="?lang=fr_FR">French -France</a>  &nbsp;&nbsp;
                 <a href="?lang=hi_IN">Hindi</a>  &nbsp;&nbsp;
                 <a href="?lang=te_IN">Telugu</a>  &nbsp;&nbsp;
                 <a href="?lang=zh_CN">Chinese</a>  &nbsp;&nbsp;
                 <a href="?lang=en_US">English</a>  &nbsp;&nbsp;
                 
 </center>
