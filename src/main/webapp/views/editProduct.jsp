<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Editar Producto</title>
</head>
<body>
<h2>Editar Producto</h2>
<form action="update" method="post">
    <input type="hidden" name="id" value="${product.id}">
    <label for="name">Nombre:</label>
    <input type="text" name="name" value="${product.name}" required>
    <label for="price">Precio:</label>
    <input type="text" name="price" value="${product.price}" required>
    <input type="submit" value="Actualizar">
</form>
</body>
</html>
