<#ftl encoding="utf-8"/>
<!DOCTYPE html>
<html>
	<head>
		<title>Sample_MVC</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<link rel='stylesheet' href='/resources/css/index.css'>
		<!-- React를 실행. -->
	    <!-- 주의: 사이트를 배포할 때는 "development.js"를 "production.min.js"로 대체하세요. -->
	    <script src="https://unpkg.com/react@17/umd/react.production.min.js" crossorigin></script>
	    <script src="https://unpkg.com/react-dom@17/umd/react-dom.production.min.js" crossorigin></script>
	</head>
	<body>
		<div> 한글 </div>
 
		<h1> ${members.clnn}</h1> 
		
		<script>
			function sum(numbers) {
				return numbers.reduce((total, num) => total + num, 0); // 55
			}
			
			alert ( sum( [1,2,3,4,5,6,7,8,9,10] ) );
		</script>
		
		<!-- Load our React component. 
		    <script src="like_button.js"></script>
		-->
	</body>
</html>
