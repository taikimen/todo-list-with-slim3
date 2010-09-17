<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>TaskList</title>
</head>
<body>
<h1>Task List</h1>
<p>welcome ${f:h(userName)} !</p>
<h2>Write Ticket</h2>
<form method="POST" action="write">
<textarea name="content"></textarea><br />
<br />
dueDate : <input type="text" name="dueDate">
<br />
<br />
<input type="submit" value="save">
</form>
<hr />
<h2>Open Ticket</h2>
<dl>
<c:forEach var="e" items="${openTask}">
<dt>${f:h(e.dueDate)}</dt>
<dd>${f:h(e.content)}</dd>
<dd><a href="finish?key=${e.key.id}">close</a><dd>
</c:forEach>
</dl>
<hr />
<h2>Close Ticket</h2>
<dl>
<c:forEach var="e" items="${closeTask}">
<dt>${f:h(e.dueDate)}</dt>
<dd>${f:h(e.content)}</dd>
</c:forEach>
</dl>
<hr />
<p><a href="${logoutUrl}">logout</a></p>
</body>
</html>
