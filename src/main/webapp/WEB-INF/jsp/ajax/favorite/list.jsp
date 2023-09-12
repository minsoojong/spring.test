<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기 리스트</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	<h2>즐겨찾기 추가하기</h2>
	
	<table class="table">
		<thead>
			<tr>
				<th>NO.</th>
				<th>이름</th>
				<th>주소</th>
				<th></th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach var="favorite" items="${favoriteList }">
			<tr>
				<td>${favorite.id }</td>
				<td>${favorite.name }</td>
				<td>${favorite.url }</td>
				<td><button type="button" data-favorite-id ="${favorite.id }" class="btn btn-danger btn-sm delete-btn">삭제</button></td>
			</tr>
			</c:forEach>
		</tbody>

	</table>

	
	
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

	<script>
		$(document).ready(function() {
			$(".delete-btn").on("click", function() {
				
				let id = $(this).data("favorite-id");
				
				$.ajax({
					type:"get"
					, url:"/ajax/favorite/delete"
					, data:{"id":id}
					, success:function(data) {
						
						// 성공 : {"result":"success"}
						// 실패 : {"result":"fail"}
						if(data.result == "success") {
							location.reload();
						}else {
							alert("삭제실패");
						}
					}
					, error:function() {
						alert("삭제 에러");
					}
				
					
				});
				
				
				
			});
			
			
		});
	
	
	
	
	
	</script>







</body>
</html>