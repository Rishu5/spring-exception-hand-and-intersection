<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Chooser" method="post" enctype="multipart/form-data">
<h3>  This is First page of Project  </h3>
<h4>please choose your file </h4>
<input type="file" name="filechooser"> file chooser </input>

<input type="text" name="textfield">
<button name="submit">submit</button>

</form>


<form action="file2" method="post" enctype="multipart/form-data">

<input type="datetime-local" name="ldate">

<button name="btn2"> submit</button>

</form>


</body>
</html>