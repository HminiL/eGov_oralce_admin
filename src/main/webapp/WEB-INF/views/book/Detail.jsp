<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>책 상세</h2>

<h3> findById</h3>
<form action="<%= application.getContextPath() %>/books/detail" method="get">

  <div class="container">
    <label for="bookId"><b>custId</b></label>
    <input type="text" placeholder="bookId" name="bookId" required>
    
    <button type="submit">책 상세!</button>
  </div>
</form>

<h3>findByName</h3>

<form action="<%= application.getContextPath() %>/books/detail/name" method="post">

  <div class="container">
    <label for="bookName"><b>custId</b></label>
    <input type="text" placeholder="bookName" name="bookName" required>
    
    <button type="submit">책 상세!</button>
  </div>
</form>

<h3>findByPubId</h3>

<form action="<%= application.getContextPath() %>/books/detail/pubId" method="post">

  <div class="container">
    <label for="pubId"><b>custId</b></label>
    <input type="text" placeholder="pubId" name="pubId" required>
    
    <button type="submit">책 상세!</button>
  </div>
</form>

</body>
</html>