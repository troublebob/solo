<! DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="./styles/fdm_blog.css"> <meta="" charset="UTF8">
	<title>Charity Project</title>
</head>
<body>
<div id="container">
	<div id="header">
		<%@ include file="header.jsp" %>
	</div>
	<div id="main_content">
		<div id="content">
		${signupcomplete}
		<h2 class="needs_padding">Causes</h2>
		<div id="em_div">
		<p class="needs_padding">PlaceHolder</p>
		</div>
		</div>
		<div id="side_bar">
			<%@ include file="sidebar.jsp" %>
		</div>
	</div>
	<div id ="footer">
		<%@ include file="footer.jsp" %>
	</div>
</div>	
</body>

</html>