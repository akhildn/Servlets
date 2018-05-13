<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.training.common.Address" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
</head>
<body bgcolor="#81cbcf" cellpadding="0" cellspacing="0">
<table border="0"  width="100%" cellpadding="0" cellspacing="0">

<tr><td colspan="2" height="150px" bgcolor="#f4e842">
<jsp:include page="Header.jsp"></jsp:include>
</td></tr>
<tr><td width="15%" height="600px" bgcolor="#42f445" valign="top"><jsp:include page="Navigation.jsp"></jsp:include></td>
<td width="85%"><%= "Hello JSP World" %>
<!-- 
<jsp:useBean id="address" scope="request" type="com.training.common.Address"></jsp:useBean>

 -->
 <%
 Address address1 = (Address)request.getAttribute("address");
 
%>
<%=address1.getCity() %>
<%= session.getAttribute("authentication")%>
${session.authentication}
<%=request.getParameter("name") %>
<% out.print(request.getParameter("name")); %>
<%=request.getParameter("password") %>
<%String city = (String)request.getAttribute("city");%>
<%=city %></td></tr>

</table>


</body>
</html>