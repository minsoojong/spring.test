<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>통나무 펜션</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="/ajax/css/style.css" type="text/css">
</head>
<body>

	<div id="wrap" >
	    <header class="mt-4">
	        <div class="text-center display-4">통나무 팬션</div>
	        <nav class="mt-4">
	            <ul class="nav nav-fill">
	                <li class="nav-item"><a class="nav-link" href="#">팬션소개</a></li>
	                <li class="nav-item"><a class="nav-link" href="#">객실보기</a></li>
	                <li class="nav-item"><a class="nav-link" href="#">예약하기</a></li>
	                <li class="nav-item"><a class="nav-link" href="#">예약목록</a></li>
	            </ul>
	        </nav>
	    </header>
	
	    <section class="banner">
	        <img src="http://marondal.com/material/images/dulumary/web/front/jquery/test06_banner1.jpg" id="bannerImage">
	    </section>
	    <section class="d-flex">
	        <article class="reservation d-flex justify-content-center align-items-center">
	            <div class="display-4">
	                실시간 <br>
	                예약 하기 
	            </div>
	        </article>
	        <article class="reservation-confirm">
	            <div class="m-4">
	                <div class="d-flex align-items-end">
	                    <h3 class="mr-4">예약 확인</h3>
	                
	                </div>
	            
	
	                <div class="no-member-input mt-3y" id="nonMember">
	                    <div class="input-gorup form-inline">
	                        <label class="input-label">이름 </label>
	                        <input type="text" id="nameInput" class="form-control text-input">
	                    </div>
	                    <div class="input-gorup form-inline mt-3">
	                        <label class="input-label">전화번호 </label>
	                        <input type="text" id="phoneNumberInput" class="form-control text-input">
	                    </div>
	               
	                </div>
	                <div class="d-flex justify-content-end">
	                    <button class="btn btn-success mt-3 mr-5" id="findBtn">조회 하기</button>
	                </div>
	            </div>
	        </article>
	        <article class="reservation-call d-flex justify-content-center align-items-center">
	            <div>
	                <h3>예약문의 : </h3>
	                <h1>010-</h1>
	                <h1>000-1111</h1>
	            </div>
	        </article>
	    </section>
	
	    <footer class="mt-3 ml-4">
	        <address>
	            제주특별자치도 제주시 애월읍  <br>
	            사업자등록번호: 111-22-255222 / 농어촌민박사업자지정 / 대표:김통목 <br>
	            Copyright 2025 tongnamu All right reserved
	        </address>
	
	    </footer>
	
	
	</div>


	<script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>
   
	<script>
   		$(document).ready(function() {
   			$("#findBtn").on("click", function() {
   				let name = $("#nameInput").val();
   				let phoneNumber = $("#phoneNumberInput").val();
   				
   				if(name == "") {
   					alert("이름을 입력하세요");
   					return ;
   				}
   				if(phoneNumber == "") {
   					alert("전화번호를 입력하세요");
   					return ;
   				}
   				
   				$.ajax({
   					type:"get"
   					, url:"/ajax/booking/search"
   					, data:{"name":name, "phoneNumber":phoneNumber}
   					, success:function(data) {
   					/*{
   						  "id": 9,
   						  "name": "장나라",
   						  "headcount": 2,
   						  "day": 1,
   						  "date": "2025-09-11T15:00:00.000+00:00",
   						  "phoneNumber": "010-2222-0000",
   						  "state": "확정",
   						  "createdAt": "2023-07-25T07:14:34.000+00:00",
   						  "updatedAt": "2023-07-25T07:14:34.000+00:00"
   						}  */
   						
   						if(data.result == "fail") {
   							alert("조회 결과가 없습니다.");
   						} else {
   							alert("이름 : " + data.booking.name + "\n"
   	   								+ "날짜 : " + data.booking.date.substring(0, 10) + "\n"
   	   								+ "일수 : " + data.booking.day + "\n"
   	   								+ "인원 : " + data.booking.headcount + "\n"
   	   								+ "상태 : " + data.booking.state);	
   						}
   						
   						
   						
   					}
   					, error:function() {
   						
   						alert("조회 에러");
   					}
   					
   				});
   				
   			});
   		});
   
   	</script>
   
</body>
</html>