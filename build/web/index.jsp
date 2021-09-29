<%@page import="usuarios.Usuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>JSP Page</title>
        <style>
            table, td, th{
                border: 1px solid #aaa;
            }
            td, th{
                text-align: center;
                padding: 8px;
            }
        </style>
    </head>
    
    <body>
        <main>
            <center>
                <header>
                    <h1>Informações dos usuários</h1>
                </header>
                <section>
                    <%
                        Usuarios info = new Usuarios();

                        out.print(info.usuarios());

                    %>
                </section>
                <footer>
                    <p>&copy;<em>by Lucas Torres</em></p>
                </footer>
            </center>
        </main>
    </body>
</html>
