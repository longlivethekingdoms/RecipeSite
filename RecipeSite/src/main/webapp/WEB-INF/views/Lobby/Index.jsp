<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="/WEB-INF/views/Common/header.jsp" %>

	<h2>레시피 카테고리</h2>
	<!-- 카테고리 필터링 -->
	<select name="category">
	    <option value="all">전체</option>
	    <option value="korean">한식</option>
	    <option value="western">양식</option>
	    <option value="japanese">일식</option>
	</select>
	
	<h2>이번 주 화제 레시피</h2>
	<ul>
	    <c:forEach var="recipe" items="${hotRecipes}">
	        <li><a href="/recipe/${recipe.id}">${recipe.name}</a></li>
	    </c:forEach>
	</ul>
	<a href="/hotrecipe">더보기</a>
	
	<h2>역대 추천 BEST 레시피</h2>
	<ul>
	    <c:forEach var="recipe" items="${bestRecipes}">
	        <li><a href="/recipe/${recipe.id}">${recipe.name}</a></li>
	    </c:forEach>
	</ul>
	<a href="/bestrecipe">더보기</a>
	
	<h2>베스트 셰프</h2>
	<ul>
	    <c:forEach var="chef" items="${bestChefs}">
	        <li><a href="/chef/${chef.id}">${chef.username}</a></li>
	    </c:forEach>
	</ul>
	<a href="/bestchef">더보기</a>
	
	<%@ include file="/WEB-INF/views/Common/footer.jsp" %>
</body>
</html>