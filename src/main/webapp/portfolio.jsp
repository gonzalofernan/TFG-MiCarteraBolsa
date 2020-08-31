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
	<ul class="nav justify-content-center">
	  <li class="nav-item">
	    <a class="nav-link active" href="/">Inicio</a>
	  </li>
	  <li class="nav-item">
	    <a class="nav-link" href="/radar">Radar</a>
	  </li>
	  <li class="nav-item">
	    <a class="nav-link" href="/portfolio">Portfolio</a>
	  </li>
	
	</ul>  
    
    <hr>

    
	
	<div class="container">
		<div class="row">
			<div class="col-8">
			<h4>Portfolio MCB de Top 25 Hedge Funds "</h4>
			   
			
			<table class="table">
					<thead class="">
						<tr>
							<th>Compañia</th>
							<th>Hedge Funds con acciones </th>
						</tr>	
					</thead>
					<tbody>
					<c:forEach var="lista" items="${list}">
					<tr>
							<td>
							<a class="tab-link" href="https://finance.yahoo.com/quote/${lista.name}">${lista.name}</a>
							</td>
						
							<td>${lista.number} </td>
					</tr>
					
					
					
					</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="col-4">
			<form action="/companies" method="post">
				<input type="text" class="form-control" name="name" placeholder="Buscar por nombre de la empresa">
				<button type="submit" class="btn btn-secondary my-1">Buscar</button>
			</form>	
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
