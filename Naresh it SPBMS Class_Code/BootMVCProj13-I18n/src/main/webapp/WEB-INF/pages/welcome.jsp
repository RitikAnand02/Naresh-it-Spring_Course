<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags"   prefix="sp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>


<h1  style="color:red;text-align:center"><sp:message  code="home.title"/></h1>

 <a href="register"><h3  style="color:green;text-align:center"><sp:message code="home.link1"/></h3></a>
 
 <b>Current  active Locale ::  ${pageContext.response.locale}</b>
 
 <fmt:setLocale value="${pageContext.response.locale}"  /> <br>
 
 <fmt:formatDate var="fdate"  value="${sysDate}"  type="date"  dateStyle="MEDIUM"/>
 <b> Formatted Date :: ${fdate}</b> <br>
 
 <fmt:formatDate var="ftime"  value="${sysDate}"  type="time"  timeStyle="MEDIUM"/>
 <b> Formatted Time :: ${ftime}</b> <br>
 
 <fmt:formatNumber   var="fnumber"  value="${billamt}"   type="number"/>
 <b> Formatted Number :: ${fnumber}</b> <br>
 
 <fmt:formatNumber   var="fcurrency"  value="${billamt}"   type="currency"/>
 <b> Formatted Number :: ${fcurrency}</b> <br>
 
 <fmt:formatNumber   var="fpercentage"  value="${avg}"   type="PERCENT"/>
 <b> Formatted Percentage :: ${fpercentage}</b> <br>
 



<center><a href="?lang=fr_CA">French -CANADA</a>  &nbsp;&nbsp;
                 <a href="?lang=fr_FR">French -France</a>  &nbsp;&nbsp;
                 <a href="?lang=hi_IN">Hindi</a>  &nbsp;&nbsp;
                 <a href="?lang=te_IN">Telugu</a>  &nbsp;&nbsp;
                 <a href="?lang=zh_CN">Chinese</a>  &nbsp;&nbsp;
                 <a href="?lalng=en_US">English</a>  &nbsp;&nbsp;
                 
 </center>