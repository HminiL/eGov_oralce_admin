<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>개인정보 수정</h2>

<form action="<%= application.getContextPath() %>/books/update" method="post">
  <div class="container">
  
    <label for="bookId"><b>bookId</b></label>
    <input type="text" placeholder="bookId" name="bookId" required>
  
    <label for="bookTitle"><b>bookTitle</b></label>
    <input type="text" placeholder="bookTitle" name="bookTitle" required>

    
    <label for="pubId"><b>pubId</b></label>
    <input type="text" placeholder="pubId" name="pubId" required>
    
    <label for="Price"><b>Price</b></label>
    <input type="text" placeholder="Enter Price" name="Price" >
    <button type="submit">책 정보!</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>
</form>


<h2>개인정보 삭제</h2>
<form action="<%= application.getContextPath() %>/books/delete" method="get">
  <div class="container">
   <label for="bookId"><b>bookId</b></label>
    <input type="text" placeholder="bookId" name="bookId" required>

    <button type="submit">책 삭제!</button>
  </div>
</form>


</body>
</html>