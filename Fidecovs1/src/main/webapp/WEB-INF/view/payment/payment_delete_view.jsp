<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./css/su.css">
</head>
<body>

<script type="text/javascript">
	 alert("${paymentDTO.payment_id}번의 결제정보가 삭제되었습니다.");
	 location.href="./PaymentSelectAll.py";
	</script>
</body>
</html>