<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날씨 입력</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<link rel="stylesheet" href="/jstl/css/style.css" type="text/css">
</head>
<body>
		<div id="wrap d-flex">
		<div class="d-flex">
			<div class="contents pr-3">
				<div class="text-white text-center font-weight-bold pt-3">
					<img width="40" src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjAxMjBfMTcy%2FMDAxNjQyNjY2MTE1Njk3.S_c3AYh1eLaxeDwjADqJ2ih6AMD4icvkweMic176jFEg.wN1Mu2cmFZO9CuBqx9ICzibBsf7lJpft9JnHhWBwZRkg.PNG.realdebate2011%2Fweather04.png&type=sc960_832" alt="기상청로고"> 기상청</div>
				 <nav class="d-flex">
                    <ul class="nav flex-column pt-4">
                        <li class="nav-item menu-item"><a href="#" class="nav-link text-white font-weight-bold">날씨</a></li>
                        <li class="nav-item menu-item"><a href="#" class="nav-link text-white font-weight-bold">날씨입력</a></li>
                        <li class="nav-item menu-item"><a href="#" class="nav-link text-white font-weight-bold">테마날씨</a></li>
                        <li class="nav-item menu-item"><a href="#" class="nav-link text-white font-weight-bold">관측기후</a></li>
                    </ul>
                </nav>
              </div>
                
                <div class="input">
                	<h3 class="font-weight-bold">날씨입력</h3>
                	<div class="d-flex">
               		<div>날짜<input type="text"></div>
               		<div>날씨</div>
                	<select>
                		<option>맑음</option>
                		<option>구름조금</option>
                		<option>흐림</option>
                		<option>비</option>
                	</select>
	                	
                	<div>미세먼지</div>
                	<select>
                		<option>좋음</option>
                		<option>보통</option>
                		<option>나쁨</option>
                		<option>최악</option>
                	</select>
                	</div>
               		<div>
               			<label class="col-3">기온</label>
                		<div class="input-group">
                        <input type="text">
                        <div class="input-group-append">
                            <button class="btn" type="button">℃</button>
                        </div>
                    	</div>
                    	
                    	<div>강수량</div>
                    	<div class="input-group">
                        <input type="text">
                        <div class="input-group-append">
                            <button class="btn" type="button">mm</button>
                        </div>
                		</div>
                	
                	
                		<div>풍속</div>
                		<div class="input-group">
                        <input type="text">
                        <div class="input-group-append">
                            <button class="btn" type="button">km/h</button>
                        </div>
                		</div>
                		<button class="btn bg-success text-white" type="button">저장</button>
               	 	</div>
			</div>
				<footer class="d-flex">
					<div class="rogo">
						<img width="200" src="https://search.pstatic.net/sunny/?src=https%3A%2F%2Fwww.kma.go.kr%2Fw%2Fresources%2Fimage%2Ffoot_logo2.png&type=sc960_832" alt="기상청 로고 사진 " >
					</div>
					<div class="address text-secondary mt-3 ml-5 small">(07062) 서울시 동작구 여의대방로16길 61 <br>
						Copyright@2023 KMA. All Rights RESERVED.	
					</div>
					
				</footer>
			</div>
		</div>	
 <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>