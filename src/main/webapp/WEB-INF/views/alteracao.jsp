<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Altera��o</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css"/>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
<script>
  $( function() {
    $( "#datepicker" ).datepicker({dateFormat:"dd/mm/yy"});
  } );
  </script>
</head>
<body>
<form action="update">
RE:<input type="text" name="re" value="${funcionario.re}"/><br/>
nome:<input type="text" name="nome" value="${funcionario.nome}"/><br/>
data de nascimento:<input type="text" id="datepicker" name="dataNascimento" 
value="${funcionario.dataNascimentoFormat}"/><br/>
sal�rio:<input type="text" name="salario" value="${funcionario.salario}"/><br/>
e-mail:<input type="text" name="email" value="${funcionario.email}"/><br/>
<input type="submit" value="Enviar"/>
</form>
<a href="/Projeto">voltar</a>
</body>
</html>