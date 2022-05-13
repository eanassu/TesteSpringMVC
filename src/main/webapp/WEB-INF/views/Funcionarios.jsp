<%@page import="java.text.NumberFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="br.com.vemprafam.alunos.pojo.Funcionario"%>
<%@page import="java.util.List"%>
<%@page import="br.com.vemprafam.alunos.controller.dao.DaoFuncionario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Funcionários</title>
</head>
<body>
<table border="1">
<tr>
<th>RE</th><th>nome</th><th>salário</th><th>nascimento</th>
</tr>
<%
DaoFuncionario dao = new DaoFuncionario();
List<Funcionario> funcionarios = dao.getFuncionarios();
SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
for( Funcionario funcionario: funcionarios ) {
	String salario = currencyFormat.format(funcionario.getSalario());
	String nascimento = dateFormat.format(funcionario.getDataNascimento());
%>
<tr>
<td><%=funcionario.getRe()%></td>
<td><%=funcionario.getNome()%></td>
<td><%=salario%></td>
<td><%=nascimento%></td>
</tr>
<%
}
%>
</table>
<a href="/Projeto">voltar</a>
</body>
</html>