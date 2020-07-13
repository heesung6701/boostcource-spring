<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<title>회원 가입폼</title>
<style>
.error {
	color: red;
}
</style>
</head>
<body>
	<div>
		<div>
			<h1>회원 가입</h1>
		</div>

		<form:form method="POST" action="/reservation/user/join"
			modelAttribute="user">
			<div>
				<label for="email">이메일(아이디)</label>
				<form:input path="email" />
				<form:errors path="email" cssClass="error" />
			</div>
			<div>
				<label for="password">암호</label>
				<form:input path="password" type="password" />
				<form:errors path="password" cssClass="error" />
			</div>
			<div>
				<label for="name">이름</label>
				<form:input path="name" />
				<form:errors path="name" cssClass="error" />
			</div>
			<div>
				<label for="phone">연락처</label>
				<form:input path="phone" />
				<form:errors path="phone" cssClass="error" />
			</div>
			<input type="submit" value="가입" />
		</form:form>
	</div>
</body>