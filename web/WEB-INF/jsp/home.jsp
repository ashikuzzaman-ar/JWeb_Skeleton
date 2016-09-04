<%@page import="com.studevs.models.UserInformation"%>
<%
    UserInformation userInformation = (UserInformation) request.getAttribute("userInformation");
%>
<div>
    <div>
        <h1>Welcome Mr. <%= userInformation.getFirstName() + " " + userInformation.getLastName()%></h1>
    </div>
</div>