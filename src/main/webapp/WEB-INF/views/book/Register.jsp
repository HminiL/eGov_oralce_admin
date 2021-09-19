<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>고객 등록</h2>

<form action="${contextPath}/books/register" method="post">
  

  <div class="container">
    <label for="bookId"><b>bookId</b></label>
    <input type="text" placeholder="bookId" name="bookId" required>
  
    <label for="bookTitle"><b>bookTitle</b></label>
    <input type="text" placeholder="bookTitle" name="bookTitle" required>

    
    <label for="pubId"><b>pubId</b></label>
    <input type="text" placeholder="pubId" name="pubId" required>
    
    <label for="Price"><b>Price</b></label>
    <input type="text" placeholder="Enter Price" name="Price" >
    
    <button type="submit">책 추가</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
    
    
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>

</body>
</html>