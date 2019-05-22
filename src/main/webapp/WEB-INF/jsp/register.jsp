<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://fonts.googleapis.com/css?family=Roboto:400,700" rel="stylesheet">
<title>Bootstrap Simple Registration Form</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">

<style type="text/css">
	body{
		color: #fff;
		background: #63738a;
		font-family: 'Roboto', sans-serif;
	}
	.error{
	margin-top: 5px;
		color: red;
	}
    .form-control{
		height: 40px;
		box-shadow: none;
		color: #969fa4;
	}
	.form-control:focus{
		border-color: #5cb85c;
	}
    .form-control, .btn{        
        border-radius: 3px;
    }
	.signup-form{
		width: 400px;
		margin: 0 auto;
		padding: 30px 0;
	}
	.signup-form h2{
		color: #636363;
        margin: 0 0 15px;
		position: relative;
		text-align: center;
    }
	.signup-form h2:before, .signup-form h2:after{
		content: "";
		height: 2px;
		width: 30%;
		background: #d4d4d4;
		position: absolute;
		top: 50%;
		z-index: 2;
	}	
	.signup-form h2:before{
		left: 0;
	}
	.signup-form h2:after{
		right: 0;
	}
    .signup-form .hint-text{
		color: #999;
		margin-bottom: 30px;
		text-align: center;
	}
    .signup-form form{
		color: #999;
		border-radius: 3px;
    	margin-bottom: 15px;
        background: #f2f3f7;
        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
        padding: 30px;
    }
	.signup-form .form-group{
		margin-bottom: 20px;
	}
	.signup-form input[type="checkbox"]{
		margin-top: 3px;
	}
	.signup-form .btn{        
        font-size: 16px;
        font-weight: bold;		
		min-width: 140px;
        outline: none !important;
    }
	.signup-form .row div:first-child{
		padding-right: 10px;
	}
	.signup-form .row div:last-child{
		padding-left: 10px;
	}    	
    .signup-form a{
		color: #fff;
		text-decoration: underline;
	}
    .signup-form a:hover{
		text-decoration: none;
	}
	.signup-form form a{
		color: #5cb85c;
		text-decoration: none;
	}	
	.signup-form form a:hover{
		text-decoration: underline;
	}  
</style>
</head>
<body>
<script src="https://code.jquery.com/jquery-3.4.0.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.17.0/jquery.validate.min.js"></script>
<div class="signup-form">
    <form action="<%=request.getContextPath() %>/action?action=regis" method="post" id="formreg">
		<h2>Đăng ký</h2>
		<p class="hint-text">Tạo tài khoản của bạn. Miễn phí và nhanh chóng</p>
        <div class="form-group">
			<div class="row">
				<div class="col-xs-6"><input type="text" class="form-control" name="fname" placeholder="Tên" required="required"></div>
				<div class="col-xs-6"><input type="text" class="form-control" name="lname" placeholder="Họ" required="required"></div>
			</div>        	
        </div>
        <div class="form-group">
        	<input type="email" class="form-control" name="email" placeholder="Emaill">
        </div>
        <div class="form-group">
        	<input type="number" class="form-control" name="number" placeholder="Số điện thoại">
        </div>
		<div class="form-group">
            <input type="password" class="form-control" id="password" name="password" placeholder="Mật khẩu">
        </div>
		<div class="form-group">
            <input type="password" class="form-control" name="confirm_password" placeholder="Xác nhận mật khẩu">
        </div>        
        <div class="form-group">
			<label class="checkbox-inline"><input type="checkbox" required="required"> Tôi đồng ý <a href="#">điều khoản</a> &amp; <a href="#">chính sách</a></label>
		</div>
		<div class="form-group">
            <button type="submit" class="btn btn-success btn-lg btn-block">Đăng ký ngay</button>
        </div>
    </form>
	<div class="text-center">Already have an account? <a href="#">Sign in</a></div>
</div>



<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
<script>

$(function() {
$("#formreg").validate({
 
    rules: {
        email: {
        	 required: true,
        	email: true,
        	remote : 'http://localhost:8080/thang/action?action=valid'
           
        },
        fname: {required: true,
            minlength: 3
        },
        lname: {
            minlength: 3
        },
        number: {
        	minlength: 10
        },
        confirm_password: {
        	equalTo: "#password"
        }
    },
    messages: {
        email: {
            email: "Email không đúng định dạng",
            remote: "Email đã có người sử dụng"
        },
        fname: {
            minlength: "Tên phải có ít nhất 3 ký tự"
        },
        lname: {
            minlength: "Họ phải có ít nhất 3 ký tự"
        },
        number: {
            minlength: "Số điện thoại phải có ít nhất 10 chữ số"
        },
        confirm_password: {
        	equalTo: "Không trùng khớp"
        }
    }
});
});
</script>
</body>
</html>                            