<%@ page language="java"  isELIgnored="false"  %>

<h1  style="color:red;text-align:center"> Show Report Page </h1>


<c:choose>
  <c:when  test="${!empty resultList}">
   <table  border="1"  align="center"  bgcolor="cyan">
        <tr>
          <th> ID   </th><th> Name   </th><th> Addrs   </th><th> Expert  </th><th> Fee   </th><th> Operations</th>
        </tr>
        
        <c:forEach var="doc" items="${resultList}">
           <tr>
             <td>${doc.did}</td>
             <td>${doc.dname}</td>
             <td>${doc.addrs}</td>
             <td>${doc.expert}</td>
             <td>${doc.fee}</td>
             <td><a href="edit?no=${doc.did}"><img src="images/edit.jpg" width="30" height="30"></a> 
                         &nbsp;&nbsp;
                         <a href="delete?no=${doc.did}"  onclick="return confirm('Do u Really Want to Delete?')"><img src="images/delete.jpg" width="30" height="30"></a>
               </td>
           </tr>
        </c:forEach>
   </table>
   </c:when>
   <c:otherwise>
              <h1 style="color:red;text-align:center">No Doctors found to Display  </h1>
   </c:otherwise>
</c:choose>

   <h1 style="color:green;text-align:center">${resultMsg}</h1>

<br> <center> <a href="register"> Add Doctor <img src="images/add.jpg" width="100" height="100"></a>  </center>

<br><br>
<center><a href="./">home <img src="images/home.png" width="70" height="90"></a></center>