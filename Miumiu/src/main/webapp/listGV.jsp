<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">

<!-- DataTable CSS  -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.3.0-alpha3/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.13.4/css/dataTables.bootstrap5.min.css">
<link rel="stylesheet"
	href="https://cdn.datatables.net/responsive/2.4.1/css/responsive.bootstrap5.min.css">

<title>DataTable | devRasen</title>
</head>

<body>
	<!-- Main Content -->
	<div class="container p-3 my-5 bg-light border border-primary">
		<!-- DataTable Code starts -->
		<table id="example" class="table table-striped nowrap"
			style="width: 100%">
			<thead>
				<tr>
					<th>ID</th>
					<th>Ten GV</th>
					<th>KhoaQL</th>
					<th>Action</th>
					<!-- Added Action column header -->
				</tr>
			</thead>
			<tbody>
				<c:forEach var="kq" items="${list}">
					<tr>
						<td>${kq.idGiangVien}</td>
						<td>${kq.getTenGV()}</td>
						<td>${kq.idKhoaQL}</td>
						<td>
							<button type="button" class="btn btn-primary"
								data-bs-toggle="modal" data-bs-target="#myModal${kq.idGiangVien}">Update</button> |
							<button onclick="window.location.href='DeleteGiangVien?id=${kq.idGiangVien}'">Delete</button>
						</td>
					</tr>
					<div class="container mt-5">
						<div class="modal" id="myModal${kq.idGiangVien}">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<h5 class="modal-title">Contact Us</h5>
										<button type="button" class="btn-close"
											data-bs-dismiss="modal"></button>
									</div>
									<div class="modal-body" id="updateModal${kq.idGiangVien}">
										<form action="UpdateGiangVien" method="post">
											<input type="hidden" name="idGiangVien" value="${kq.idGiangVien}">
											<div class="mb-3">
												<label class="form-label required">Ho Va Ten</label> <input
													type="text" class="form-control" name="TenGV" id="TenGV"
													value="${GiangVien.TenGV}">
											</div>
											<div class="mb-3">
												<label class="form-label required">Khoa QL</label> <input
													type="text" class="form-control" id="idKhoaQL"
													name="idKhoaQL" value="${GiangVien.IdKhoaQL}">
											</div>
											<div class="modal-footer">
												<input type="submit" class="btn btn-primary" value="Update">
											</div>
										</form>
									</div>
								</div>
				</c:forEach>
			</tbody>
		</table>
	</div>


	<!-- DataTable JS -->
	<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
	<script
		src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
	<script
		src="https://cdn.datatables.net/1.13.4/js/dataTables.bootstrap5.min.js"></script>
	<script
		src="https://cdn.datatables.net/responsive/2.4.1/js/dataTables.responsive.min.js"></script>
	<script
		src="https://cdn.datatables.net/responsive/2.4.1/js/responsive.bootstrap5.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
		crossorigin="anonymous"></script>

	<!-- Custom JS -->
	<script src="script.js"></script>
</body>

</html>

</body>

</html>
