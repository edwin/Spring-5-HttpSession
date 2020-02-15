<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World</title>
</head>
<body>

<table>
    <tr>
        <td> ${name}  </td>
    </tr>
</table>

<br />
<br />
<br />

    <form method="POST" action="${pageContext.request.contextPath}/">
        <input type="text" name="value" />
        <input type="submit" value="Send Request">
    </form>

<br />
<br />
<br />



</body>
</html>
