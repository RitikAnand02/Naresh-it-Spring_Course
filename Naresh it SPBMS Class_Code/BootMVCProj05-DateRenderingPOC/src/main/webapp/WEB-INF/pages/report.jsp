<%@ page isELIgnored="false"   %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>


<h1 style="color:red;text-align:center"> From the Report Page </h1>



<h1> Model attributes</h1>
<c:choose>
  <c:when  test="${!empty custList}">
     <table  border="1"  align="center"  bgcolor="cyan">
         <tr>
            <th>cno</th><th> cname </th> <th> caddrs </th> <th> billAmt </th> 
         </tr>   
         <tr>
             <c:forEach var="cust"  items="${custList}">
                <tr>
                   <td>${cust.cno}</td>
                   <td>${cust.cname}</td>
                   <td>${cust.cadd}</td>
                   <td>${cust.billamt}</td>
                </tr>
             
             </c:forEach>
         </tr>
       </table>
  </c:when>
  
</c:choose>


<%--   <c:if test="${!empty custData}">
      Model  class obj data ::  ${custData}  <br>
        cname  property value  of  Model class obj :: ${custData.cname}
  </c:if>
 --%>
<%-- <c:if test="${!empty nickNames}">
   NickNames :: <c:forEach var="name"  items="${nickNames}">
                                          ${name} <br>
                            </c:forEach>
</c:if>
<br><br>
<c:if test="${!empty friends}">
   Friends :: ${friends}
</c:if>
<br><br>

<c:if test="${!empty phones}">
   Phones :: ${phones}
</c:if>
<br><br>

<c:if test="${!empty idDetails}">
   IdDetails :: ${idDetails}
</c:if>
<br><br>
 --%>

<%-- <b> Model attributes</b> <br>
<i> Nick Names:: <%=Arrays.toString((String[])request.getAttribute("nickNames")) %></i> <br>
<i> friends:: ${friends}</i> <br>
<i> phones:: ${phones}</i> <br>
<i> idDetails:: ${idDetails}</i> <br>
 --%>
 
 
<br><br>




