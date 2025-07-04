<!DOCTYPE html>
<html lang="utf-8">
<head>
<meta charset="utf-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<style>
#pubutton{
margin-left: 11%;
}

#mcbutton{
margin-left: 1%;
}
</style>
<style>
     #ul {
          list-style-type: none;
          background-color: #D9D9D9;
          width: 50%;
          padding: 0;
          margin: 0;
          border-radius: 2%;
     }

     #li a {
          text-decoration: none;
          display: block;
          color: #000;
          padding: 5% 12% 5% 12%;
          font-weight: bold;
          border-bottom: 1px solid #fff;
          cursor:pointer;
     }

     #li a:hover {
          background-color: #005B00;
          color: #fff;
          border-radius: 2%;
          
     }
     
     @media (max-width: 768px) {
    /* 모바일에 최적화된 예외 CSS 코드*/
         #ul {
          list-style-type: none;
          background-color: #ccc;
          width: 100%;
          padding: 0;
          margin: 0;
          border-radius: 2%;
     }

     #li a {
          text-decoration: none;
          display: block;
          color: #000;
          padding: 2% 8% 2% 8%;
          font-weight: bold;
          border-bottom: 1px solid #fff;
          cursor:pointer;
     }

     #li a:hover {
          background-color: #005B00;
          color: #fff;
          border-radius: 2%;
          
     }
}

     #ul li a.on {
          background-color: #005B00;
          color: #fff;
          border-radius: 2%;
          
     }
</style>
<script type="text/javascript">
$(function(){
	// #ul의 자식 엘리먼트(li)가 몇번째인지 확인한 후 a요소를 찾은 후 on이라는 클래스 추가
    $('#ul').children().eq(0).find('a').addClass('on');

});
</script>
</script>

<script>
$(document).ready(function(){
	$('#register_btn').click(function(){
		$('#register_form').attr({
			'enctpe':'multipart/form-data',
			'method':'post',
			'action':'[[@{/mentor/registerimpl}]]'
		});
		$('#register_form').submit();
		alert('멘토 신청이 완료되었습니다. 신청 후 관리자의 승인 완료되면 멘토로 활동하실 수 있습니다');
	});
	
});

function previewprofile(event) {// 프로필 이미지 미리 보여주기
	    var reader = new FileReader();

	    reader.onload = function(event) {
	    	$('#uploadprofile').attr('src',event.target.result);
	    	$('#uploadprofile').attr('style','width:300px; hight:300px;');
	    };
	    reader.readAsDataURL(event.target.files[0]);
	  }

function previewimg(event) {// 명함 이미지 미리 보여주기
/* 	$('#msgText').hide();// 영수증 업로드 시 msg 내용 지우기 
	
	$('#context').hide(); */
    var reader = new FileReader();

    reader.onload = function(event) {
    	$('#uploadimg').attr('src',event.target.result);
    	$('#uploadimg').attr('style','width:300px; hight:300px;');
    	
    };
    reader.readAsDataURL(event.target.files[0]);
    //alert('reader.readAsDataURL : ' + event.target.files[0]);
  }

function display(obj) {
	var name = obj.images[0].fields[0].inferText; //이름 (화면에 출력 x) 
	var position = obj.images[0].fields[1].inferText; //직책
	var company = obj.images[0].fields[2].inferText; //회사
	$('#mentorcom').val(company);
	$('#mcardposition').val(position);
}

function upload() {
	const imageInput = $("#mcimg")[0];
	alert("ocr 실행중입니다. 잠시만 기다려 주세요.")
	if (imageInput.files.length === 0) {
		alert("파일을 선택해주세요");
		return;
	}

	const formData = new FormData();
	formData.append("image", imageInput.files[0]);

	$.ajax({
		type : "POST",
		url : "[[@{/ocrresult}]]",
		processData : false,
		contentType : false,
	 	data: formData,
	 	dataType : "JSON",
	 	success: function(obj) {

			display(obj);	

	 	}
		
	});
}

</script>
</head>

	<!-- Home -->

	<div class="home">
		<div class="breadcrumbs_container">
			<div class="container">
				<div class="row">
					<div class="col">
						<div class="breadcrumbs">
							<ul>
								<li><a th:href="@{/}">홈</a></li>
								<li><a th:href="@{/user/mypage(userid=${u.userid})}">마이페이지</a></li>
								<li>멘토등록하기</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>			
	</div>

	<!-- Contact -->

	<div class="contact">

		<!-- Contact Info -->

		<div class="contact_info_container">
			<div class="container">
				<div class="row">

			<div class="col-lg-4">
				<div class="sidebar">
				<a th:href="@{/user/mypage(userid = ${session.loginuser.userid})}"><div class="contact_info_title">마이페이지</div></a>
					<!-- Latest Course -->
<!-- 					<div class="sidebar_section">
						<div style="margin-top: 50px;" th:if="${ms != null}"
							class="sidebar_section_title">Mentoring Register</div>
						<div class="sidebar_latest">
							Latest Course
							<div
								class="latest d-flex flex-row align-items-start justify-content-start">
							</div>
						</div>
					</div> -->
					<div>&nbsp</div>
					<div>&nbsp</div>
						<div class="sidebar_section">
							<div class="sidebar_section_title"></div>
							<div class="sidebar_categories">
								<ul id="ul" style="text-align: center">
									<li id="li">
										<a th:onclick="|location.href='@{/mentor/mentorregister(id=${u.userid})}'|">멘토 등록</a>
									</li>
									<li id="li">
										<a th:if="${ms != null}" th:onclick="|location.href='@{/mentor/idcheck(mentorid=${ms.mentorid})}'|">멘토 정보</a>
									</li> 
									<li id="li">
										<a th:if="${ms != null}" th:onclick="|location.href='@{/mentor/mentormodify(id=${u.userid},mentorid=${ms.mentorid})}'|">멘토 정보 수정</a>
									</li>
									<li id="li">
										<a th:onclick="|location.href='@{/purchase/purchasedetail(id=${u.userid})}'|">구매 이력</a>
									</li>
									<li id="li">
										<a th:onclick="|location.href='@{/mentoring/mymentoringdetail(id=${u.userid})}'|">멘토링 이력</a>
									</li>
									<li id="li">
										<a th:if="${ms != null and ms.mentorok == 1}" th:onclick="|location.href='@{/mentor/mentoringadmin(id=${u.userid},mentorid=${ms.mentorid})}'|">멘토링 관리</a>
									</li>
									<li id="li">
										<a th:onclick="|location.href='@{/coupon/mycoupon(id=${u.userid})}'|">내 쿠폰함</a>
									</li>
								</ul>
							</div>
						</div>
				</div>
			</div>

					<!-- Contact Form -->
					<div class="col-lg-8">
						<div class="contact_form">
							<div class="contact_info_title"><!-- Mentor Apply --></div>
							<form class="register_form" id = "register_form" enctype="multipart/form-data">
							
								
								<div>
									<div class="form_title" style="font-weight:bold;">
									<i class="fa-solid fa-chevron-right"></i>
									&nbsp해당 페이지에서 멘토 신청 후 관리자의 승인 시 멘토로 활동하실 수 있습니다.
									</div>
									<div>&nbsp</div>
									<div>&nbsp</div>
									<label class="form_title"> 
										  파일 업로드 버튼을 눌러 프로필 이미지를 등록해주세요.
										<div>
											<img id="uploadprofile" th:src="@{/images/defaultprofileupload.jpg}" style="width:200px">
										</div>
									<label id="pubutton" class="btn btn-dark" for="mpimg" style="width:110px;height:35px;font-size:15px">파일 업로드</label>
									</label>
									<input type="file" style="display:none" name="mpimg" id="mpimg" th:onchange="previewprofile(event);">
								</div>
								
								<div>
									<label for = "userid" class="form_title">ID</label>
									<input type="text" class="userid comment_input" id = "userid" name = "userid" th:value = "${session.loginuser.userid}" readonly="readonly">
								</div>

								<div>
									<label for = "username" class="form_title">이름</label>
									<input type="text" class="userid comment_input" id = "username" name = "username" th:value = "${session.loginuser.username}" readonly="readonly">
								</div>

								<div style = "display:none">
									<label for = "adminid" class="form_title">Adminid</label>
									<input type="text" class="comment_input" id = "adminid" name = "adminid">
								</div>
				
								<div>
									<label class="form_title">명함</label>
									<div>
									<img id="uploadimg" th:src="@{/images/defaultcardupload.jpg}" style="width:120px">&nbsp&nbsp&nbsp&nbsp
									<label class="btn btn-dark" for="mcimg" style="width:96px;height:31px;font-size:13px">파일 업로드</label>
									</div>
									<input type="file" class="comment_input" style="display:none" name="mcimg" id="mcimg"  th:onchange="previewimg(event);">
									<div>
									<button type="button" id="mcbutton" th:onclick="upload()" class="comment_button trans_200" style="width:50px;height:24px">등록</button>
									</div>
								</div>											
			
								<div>
									<label for = "mentorcom" class="form_title">회사명<span style="color:red"> *</span></label>
									<input type="text" class="comment_input" id = "mentorcom" name = "mentorcom">
								</div>

								<div>
									<label for = "mcardposition" class="form_title">부서명 & 직급<span style="color:red"> *</span></label>
									<input type="text" class="comment_input" id="mcardposition" name="mcardposition">
								</div>

								<div>
									<label for = "mentorcon" class="form_title">소개<span style="color:red"> *</span></label>
									<textarea class="comment_input" id = "mentorcon" name = "mentorcon"></textarea>
								</div>

								<div>
									<label for = "mentorcareer" class="form_title">경력사항<span style="color:red"> *</span></label>
									<textarea class="comment_input" id = "mentorcareer" name = "mentorcareer"></textarea>
								</div>
								
								<div>
										<label for = "mwishcate" class="form_title">카테고리<span style="color:red"> *</span></label><br>
										<div class="form-check-inline">
									       	<label class="form-check-label" for="web">
									          <input type="checkbox" class="form-check-input" id="web" name="mcateid" value=10>
									          웹
									        </label>
								        </div>
								        <div class="form-check-inline"> 
									        <label class="form-check-label" for="secure">
									          <input type="checkbox" class="form-check-input" id="secure" name="mcateid" value=20>
									          보안
									        </label>
								        </div>
									    <div class="form-check-inline">
									      <label class="form-check-label" for="network">
									        <input type="checkbox" class="form-check-input" id="network" name="mcateid" value=30>
									        네트워크
									      </label>
									    </div>							        
									    <div class="form-check-inline">
									      <label class="form-check-label" for="ds">
									        <input type="checkbox" class="form-check-input" id="ds" name="mcateid" value=40>
									        데이터사이언스
									      </label>
									    </div>
									    <div class="form-check-inline">
									      <label class="form-check-label" for="game">
									        <input type="checkbox" class="form-check-input" id="game" name="mcateid" value=50>
									        게임
									      </label>
									    </div>
									    <div class="form-check-inline">
									      <label class="form-check-label" for="ai">
									        <input type="checkbox" class="form-check-input" id="ai" name="mcateid" value=60>
									        AI
									      </label>
									    </div>
									    <div class="form-check-inline">
									      <label class="form-check-label" for="cloud">
									        <input type="checkbox" class="form-check-input" id="cloud" name="mcateid" value=70>
									       	Cloud
									      </label>
									    </div>
									    <div class="form-check-inline">
									      <label class="form-check-label" for="etc">
									        <input type="checkbox" class="form-check-input" id="etc" name="mcateid" value=80>
									        기타
									      </label>
								    </div>
								    
								    <div>&nbsp</div>
								    
								</div>
								
							</form>
								<button id = "register_btn" class="comment_button trans_200">등록하기</button>
														
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Newsletter -->



</html>