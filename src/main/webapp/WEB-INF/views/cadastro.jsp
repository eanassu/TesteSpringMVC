<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Funcionário</title>
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
<form action="gravar" method="post">
<input type="hidden" name="op" value="Cadastrar"/>
RE:<input type="text" name="re"/><br/>
nome:<input type="text" name="nome"/><br/>
data de nascimento:<input type="text" id="datepicker" name="dataNascimento"/><br/>
salário:<input type="text" name="salario"/><br/>
e-mail:<input type="text" name="email"/><br/>
<input type="submit" value="Enviar"/>
</form>
<a href="/Projeto">voltar</a>
</body>
</html>