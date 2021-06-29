<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>FileUpload</title>
</head>
<body>
    <h1>Upload File Form</h1>
    <form action="upload" method="post" enctype="multipart/form-data">
        <input type="file" name="testImg"/> <br>
        <input type="submit"/>
    </form>

</body>
</html>
