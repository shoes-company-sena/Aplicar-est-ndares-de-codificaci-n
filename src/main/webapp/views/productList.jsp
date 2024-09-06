<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Lista de Productos</title>
</head>
<body>
<h2>Lista de Productos</h2>
<a href="new">Agregar nuevo producto</a>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Nombre</th>
        <th>Precio</th>
        <th>Acciones</th>
    </tr>
    <c:forEach var="product" items="${listProduct}">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>
                <a href="edit?id=${product.id}">Editar</a>
                <a href="delete?id=${product.id}">Eliminar</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
