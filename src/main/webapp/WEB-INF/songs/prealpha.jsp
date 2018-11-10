<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Demo JSP</title>
    </head>
    <style>
    * {
	vertical-align: baseline;
    box-sizing: border-box;
	font-weight: inherit;
	font-family: inherit;
	font-style: inherit;
	font-size: 100%;
	border: 0 none;
	outline: 0;
	padding: 0;
	margin: 0;
    }
    body {
    background-color: black;
    }
    #wrapper {
    	width: 1177px;
    	height: 1080px;
    	background-image: url("../img/beavis.jpg");
    	margin: 0px auto;
    	border: 10px white solid;
    }
    
    .video {
    
    }
    </style>
<body>
	<div id="wrapper">
	<iframe class="video" width="560" height="315" src="https://www.youtube.com/embed/<c:out value="${link}"/>" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
	</div>
</body>
</html>