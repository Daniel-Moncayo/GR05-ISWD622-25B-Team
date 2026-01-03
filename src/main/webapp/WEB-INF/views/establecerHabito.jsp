<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.sistema_seguimiento.model.Categoria" %>
<%
    // Obtener las categorias del request (enviadas por el controlador)
    Categoria[] categorias = (Categoria[]) request.getAttribute("categorias");
    String mensaje = (String) request.getAttribute("mensaje");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Establecer Habito - Sistema de Seguimiento</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700&display=swap" rel="stylesheet">
    <style>
        * { margin: 0; padding: 0; box-sizing: border-box; }
        body { 
            font-family: 'Poppins', sans-serif; 
            background: linear-gradient(135deg, #E9F7EF 0%, #D4EFDF 100%);
            min-height: 100vh; 
            padding: 20px; 
            color: #555;
            display: flex;
            align-items: center;
            justify-content: center;
        }
        .container { 
            max-width: 600px; 
            width: 100%;
            background: white;
            border-radius: 20px;
            box-shadow: 0 10px 40px rgba(0, 0, 0, 0.1);
            padding: 3rem;
        }
        .header {
            text-align: center;
            margin-bottom: 2rem;
        }
        .header h1 {
            font-size: 28px;
            font-weight: 700;
            color: #333;
            margin-bottom: 8px;
        }
        .header p {
            font-size: 14px;
            color: #888;
        }
        .form-group {
            margin-bottom: 1.5rem;
        }
        .form-group label {
            display: block;
            font-weight: 600;
            margin-bottom: 8px;
            color: #333;
        }
        .form-group input,
        .form-group select {
            width: 100%;
            padding: 12px 16px;
            border: 2px solid #e0e0e0;
            border-radius: 10px;
            font-size: 16px;
            font-family: 'Poppins', sans-serif;
            transition: border-color 0.3s;
        }
        .form-group input:focus,
        .form-group select:focus {
            outline: none;
            border-color: #A8E6CF;
        }
        .btn {
            width: 100%;
            padding: 14px;
            border: none;
            border-radius: 10px;
            font-size: 16px;
            font-weight: 600;
            cursor: pointer;
            transition: all 0.3s;
            font-family: 'Poppins', sans-serif;
        }
        .btn-primary {
            background: linear-gradient(135deg, #A8E6CF, #88D8B0);
            color: #333;
        }
        .btn-primary:hover {
            transform: translateY(-2px);
            box-shadow: 0 5px 20px rgba(168, 230, 207, 0.4);
        }
        .mensaje {
            padding: 15px;
            border-radius: 10px;
            margin-bottom: 1.5rem;
            text-align: center;
            font-weight: 500;
        }
        .mensaje-exito {
            background: #D4EDDA;
            color: #155724;
            border: 1px solid #C3E6CB;
        }
        .btn-secondary {
            background: #f5f5f5;
            color: #555;
            margin-top: 10px;
        }
        .btn-secondary:hover {
            background: #e0e0e0;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="header">
            <h1>Establecer Nuevo Habito</h1>
            <p>Crea un nuevo habito para comenzar tu seguimiento</p>
        </div>
        
        <% if (mensaje != null && !mensaje.isEmpty()) { %>
        <div class="mensaje mensaje-exito">
            <%= mensaje %>
        </div>
        <% } %>
        
        <form action="${pageContext.request.contextPath}/establecer-habito" method="POST">
            <div class="form-group">
                <label for="nombreHabito">Nombre del Habito</label>
                <input type="text" id="nombreHabito" name="nombreHabito" 
                       placeholder="Ej: Leer 30 minutos al dia" required>
            </div>
            
            <div class="form-group">
                <label for="categoria">Categoria</label>
                <select id="categoria" name="categoria" required>
                    <option value="">Selecciona una categoria</option>
                    <% if (categorias != null) { 
                        for (Categoria cat : categorias) { %>
                    <option value="<%= cat.name() %>"><%= cat.name() %></option>
                    <%  } 
                       } %>
                </select>
            </div>
            
            <div class="form-group">
                <label for="fechaInicio">Fecha de Inicio</label>
                <input type="date" id="fechaInicio" name="fechaInicio" required>
            </div>
            
            <button type="submit" class="btn btn-primary">Guardar Habito</button>
            <a href="${pageContext.request.contextPath}/index.jsp" class="btn btn-secondary" style="display: block; text-align: center; text-decoration: none;">Volver al Inicio</a>
        </form>
    </div>
</body>
</html>
