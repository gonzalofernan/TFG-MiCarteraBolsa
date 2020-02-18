<%@ page contentType="text/html; charset=UTF-8" %>

<!doctype html>
<html lang="es">
  <head>
    <!-- Required meta tags -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<title>Mi Cartera de Bolsa</title>
	
  </head>
  
  <body>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <div class="container text-center py-3">
    <h1>MCB</h1>
    <h4>Mi Cartera de Bolsa</h4>
    <p>Noticias actuales de bolsa y sistema de recomendación de inversiones 
    </div> 
    <hr>
	
	<div class="container">
		<div class="row">
			<div class="col-8">
			<h4>Noticias:</h4>
			<hr>    
			
			
			<c:forEach var="lista" items="${noticias}">
				<div class="row">	
					<div class="col-3">
						<img class="img-thumbnail" alt="" src="${lista.urlToImage}">
					</div>
					<div class="col-9">
						<h6>${lista.title}</h6>
						<p>${lista.description}</p>
					</div>	
				</div>
			<hr>
			</c:forEach>
			</div>
			<div class="col-4">
			<h4>Mayores ganadores</h4>
			<hr>
				<table class="table">
					<thead class="bg-dark text-white">
						<tr>
							<th>Ticker</th>
							<th>Precio</th>
							<th>Cambio</th>
						</tr>	
					</thead>
					<tbody>
					<c:forEach var="stock" items="${gainers}">
						<tr>
							<td>${stock.ticker}</td>
							<td>${stock.price} (+${stock.changes}) </td>
							<td class="text-success">${stock.changesPercentage}</td>
						<tr>	
					</c:forEach>
					
					</tbody>
				</table>
				
				<h4>Mayores perdedores</h4>
			<hr>
				<table class="table">
					<thead class="bg-dark text-white">
						<tr>
							<th>Ticker</th>
							<th>Precio</th>
							<th>Cambio</th>
						</tr>	
					</thead>
					<tbody>
					<c:forEach var="stock" items="${losers}">
						<tr>
							<td>${stock.ticker}</td>
							<td>${stock.price} (+${stock.changes}) </td>
							<td class="text-danger">${stock.changesPercentage}</td>
						<tr>	
					</c:forEach>
					
					</tbody>
				</table>
				
			</div>		
		</div>	
	</div>
		


    <!-- Optional JavaScript -->
    
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
  </body>
</html>
