<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta charset= "UTF-8">
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1>회원가입 </h1>
 
 
<form action="${pageContext.request.contextPath}/member/add.do" method="post">
   아이디 : <input type="text" name="memId"/>   <br/> <!--  vo 랑 이름같게하는게 좋음 -->
   비밀번호 : <input type="text" name="memPass"/> <br/>
   이름 :  <input type="text" name="memName"/> <br/>
   포인트 : <input type="text" name="memPoint"/> <br/>
    
    <input type="submit" vlaue ="가입"/>
  
   </form>
</body>
</html>