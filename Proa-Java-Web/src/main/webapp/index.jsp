<!DOCTYPE html>
<html>
	<head>
		<title>Título da página</title>
	
		<%@include file="includes/css.jsp" %>
	</head>
	<body>
	
		<%@include file="includes/header.jsp" %>]
			
		<h1>Conteúdo da página</h1>
		<%
		
		String[] primeiroNome = {"Cecília", "Tawane", "Karen", "Luana", "Júlia", "Letícia", "Natalia", "Vyviane", "Raissa", "Gabriela"};
		
		%>
		
		<div class="container">
		<div class="row">
			<% for( int i = 0; i < 10; i++){ %>
				<div class="col-md-4">
					<div class="card mb-5">
						<img class="card-img-top" src="https://i.pinimg.com/originals/1e/06/e1/1e06e107f0ca520aed316957b685ef5c.jpg" alt="Card image cap">
						<div class="card-body">
						  <h5 class="card-title"><%=primeiroNome[i]%></h5>
						  <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
						  <a href="#" class="btn btn-primary">Saiba mais</a>
						</div>
					</div>
				</div>
			<% } %>
		</div>
	</div>
	</body>
</html>