<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang Cập Nhập</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet" href="st.css">
</head>
<body>

	<div class="container">
		<div class="khung">
			<h3 class="text-center">Trang Cập Nhập</h3>
			<form action="UpdateGiangVien" method="post">
				<div class="mb-3">
				<input type ="hidden" name="id" value="${data.idGiangVien}">
					<label for="TenGV" class="form-label">Họ Và Tên:</label> 
					<input
						type="text" class="form-control" name="TenGV" id="TenGV" value="${GiangVien.TenGV}">
				</div>
				<div class="mb-3">
					<label for="idKhoaQL" class="form-label">Khoa QL:</label> <input
						type="text" class="form-control" id="idKhoaQL" name="idKhoaQL" value="${GiangVien.IdKhoaQL}">
				</div>
				<div class="mb-3 position-relative mt-5">
					<input type="submit"
						class="btn btn-danger position-absolute top-50 start-50 translate-middle"
						value="Update">
				</div>
			</form>
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>