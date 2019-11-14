<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록</title>
<script src="/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#name").focus();
		$("#subbtn").click(function() {
			if ($("#name").val() == "") {
				alert("이름을 입력하세요.");
				$("#name").focus();
				return false;
			} else if ($("#price").val() == "") {
				alert("가격을 입력하세요.");
				$("#price").focus();
				return false;
			}
		})
	})
</script>
</head>
<body>
<h3>상품을 등록해주세요.</h3>
<form name="writeform" action="/pd/write.do" method="post">
	상품명 : <input type="text" name="name" id="name">
	가격 : <input type="text" name="price" id="price">
	<input type="submit" id="subbtn" value="제출">
	<input type="reset" value="취소">
</form>
</body>
</html>