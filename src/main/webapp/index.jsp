
<%@ page contentType="text/html; ISO-8859-1" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>>
<body>
      <h2>Testing JSP</h2>
      <p>
          <%
              java.util.Date now = new java.util.Date();
              String string = "Current date : " + now;
          %>
      <%= string %>
      </p>
</body>
</html>
