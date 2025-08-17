<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="header">
    <a href="/lobby">홈</a>
    <a href="/recipes">레시피 검색</a>

    <c:choose>
        <c:when test="${empty sessionScope.user}">
            <a href="/login">로그인</a>
            <a href="/signup">회원가입</a>
            <a href="/findpassword">비밀번호 찾기</a>
        </c:when>
        <c:otherwise>
            <div class="profile-menu">
                <img src="/resources/images/profile.png" class="profile-icon" />
                <ul class="dropdown">
                    <li><a href="/mypage">내 정보</a></li>
                    <li><a href="/favorites">즐겨찾기 레시피</a></li>
                    <li><a href="/notifications">알림</a></li>
                    <li><a href="/messages">메시지</a></li>
                    <li><a href="/support">고객 문의</a></li>
                    <li><a href="/edit-profile">회원정보 수정</a></li>
                    <li><a href="/logout">로그아웃</a></li>
                </ul>
            </div>
            <a href="/write">글쓰기</a>
        </c:otherwise>
    </c:choose>
	</div>
</body>
</html>