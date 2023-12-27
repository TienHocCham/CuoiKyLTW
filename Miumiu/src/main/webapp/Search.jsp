<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>Kết Quả Tìm Kiếm</title>
</head>
<body>
<div class="container">
		<div class="khung-danhsachsinhvien">

			
			<h3 class="text-center">Person List</h3>



			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Tên GV</th>
						<th>KhoaQL</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="kq" items="${ketqua}">
						<tr>
							<td>${kq.idGiangVien}</td>
							<td>${kq.getTenGV()}</td>
							<td>${kq.idKhoaQL}</td>
							<td><a href="UpdateGiangVien?id=${kq.idGiangVien}">Update</a>|
							<a href="DeleteGiangVien?id=${kq.idGiangVien}">Delete</a>|
							
						</tr>
					</c:forEach>

				</tbody>
			</table>

		</div>
	</div>
</body>
</html>