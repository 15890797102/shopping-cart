<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1,user-scalable=no">
<title>登录</title>
<!--标准mui.css-->
<link rel="stylesheet" href="../css/mui.min.css">
<link rel="stylesheet" href="../css/login.css">
<style type="text/css">
	input[type="number"], textarea, button {-webkit-tap-highlight-color:rgba(0,0,0,0);border-radius: 0;}
	.regLogin .list .get{border-radius: 0;border-top-left-radius: 0;border-top-right-radius: 0;border-bottom-right-radius: 0;border-bottom-left-radius: 0;}
	::-webkit-input-placeholder { /* WebKit browsers */ color: #e5f6f9; } 
	:-moz-placeholder { /* Mozilla Firefox 4 to 18 */ color: #e5f6f9; } 
	::-moz-placeholder { /* Mozilla Firefox 19+ */ color: #e5f6f9; } 
	:-ms-input-placeholder { /* Internet Explorer 10+ */ color: #e5f6f9; } 
</style>
</head>
<body class="regLog">
<header class="mui-bar no_bg">
   <a class="mui-action-back mui-icon mui-icon-left-nav mui-pull-left"></a>
   <h1 class="mui-title"></h1>
</header>
<div class="regLogin">
	<div class="hl_logo tc"><img src="../images/11111.png" alt="这里是一个logo"/></div>
    <form id="loginForm" action="../IndexServlet" method="post">
            <div class="list " style="border-bottom:none;">
        </div>
        <div class="list normal">
            <label class="phone">
                <input type="text" id="logPhone" class="checkHasValue" name="username" placeholder="账号" maxlength="11"/>
            </label>
        </div>
        <div class="list normal">
            <label class="imgCode">
                <input id="logImgCode" class="checkHasValue" name="password" type="text" placeholder="密码" maxlength="6"/>
            </label>
        </div>

        <div class="hl_input_row" style="margin: 40px 20px 15px 0;">
            <i class="checkedOn hl_agree"></i><a href='' class="hl_bankAgree" style="color: white;">同意服务协议</a>
        </div>
        <div class="hl-collapse-content" style="margin-top: 0;">
        	<input id="logSubmit" class="submit btn" type="submit" value="登录" onClick="commLogin()" style="margin: 0;width: 100%;"/>
        </div>
    </form>
</div>
<script src="../js/jquery.min.js"></script>
<script type="text/javascript">

</script>
<script>
	//根据协议勾选状态判断按钮是否可点击;
    // var isCheck = true;
    // $(".hl_agree").click(function(){
    //     var selectP = $(".hl_agree");
    //     isCheck = !isCheck;
    //     if (isCheck) {
    //        selectP.removeClass("checkedOff").addClass("checkedOn");
    //     } else {
    //        selectP.removeClass("checkedOn").addClass("checkedOff");
    //     }
    //     if(checkComplect()){
    //         $('.btn').removeAttr('disabled');
    //         $('.btn').removeClass('btn-default');
    //     }else{
    //         $('.btn').attr('disabled','disabled');
    //         $('.btn').addClass('btn-default');
    //     }
    // });

    // function checkComplect(){
    //     var isComtected = true;
    //     if(!$('.hl_agree').hasClass('checkedOn')){
    //         isComtected = false;
    //     }
    //     return isComtected;
    // }
</script>
</body>
</html>