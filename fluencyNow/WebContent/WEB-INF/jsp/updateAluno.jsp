<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<spring:url value="/resources/fluency.css" var="fluencyCSS" />


    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
  <link href="${fluencyCSS}" rel="stylesheet" />
</head>
<body>
<h2>UPDATE Aluno</h2>

<form action="saveUpdateAluno" method="post">

 <label>Aluno Nome</label>
    <input type="text" name="aluno-nome" id="aluno-nome" value="${param.nome}">



    <input type="text" name="aluno-cpf" id="aluno-cpf" value="${param.cpf}">



        <input type="text" name="aluno-datanasc" id="aluno-datanasc" value="${param.datanasc}">



            <input type="text" name="aluno-endereco" id="aluno-endereco" value="${param.endereco}">



                <input type="text" name="aluno-cep" id="aluno-cep" value="${param.cep}">



                    <input type="text" name="aluno-numero" id="aluno-numero" value="${param.numero}">



    <input type="text" name="aluno-celular" id="aluno-celular" value="${param.celular}">


    <input type="text" name="aluno-email" id="aluno-email" value="${param.email}">
    <button type="submit">Save</button>
</form>

</body>
</html>
