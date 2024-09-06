<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Resultado del Formulario</title>
</head>
<body>
<h1>Hola, <%= request.getParameter("nombre") %>!</h1>
<p>Este es un mensaje generado usando JSP.</p>
</body>
</html>
