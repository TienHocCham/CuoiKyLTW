<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
					<th>Ten Mon</th>
					<th>Tin Chi</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="kq" items="${listM}">
					<tr>
						<td>${kq.idMonHoc}</td>
						<td>${kq.tenMonHoc}</td>
						<td>${kq.tinchi}</td>
						<td>
							<button type="button" class="btn btn-primary"
								data-bs-toggle="modal"
								data-bs-target="#updateModal${kq.idMonHoc}">Update</button> 
							<button type="button" class="btn btn-primary"
								onclick="window.location.href='DeleteMon?id=${kq.idMonHoc}'">Delete</button>
							<button type="button" class="btn btn-primary"
								data-bs-toggle="modal"
								data-bs-target="#manageModal${kq.idMonHoc}">Manage</button>
						</td>
					</tr>
					<div class="container mt-5">
						<div class="modal" id="updateModal${kq.idMonHoc}">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<h5 class="modal-title">Contact Us</h5>
										<button type="button" class="btn-close"
											data-bs-dismiss="modal"></button>
									</div>
									<div class="modal-body" id="updateModal${kq.idMonHoc}">
										<form action="UpdateMon" method="post">
											<input type="hidden" name="idMon" value="${kq.idMonHoc}">
											<div class="mb-3">
												<label class="form-label required">Ten Mon</label> <input
													type="text" class="form-control" name="TenMon" id="TenMon"
													value="${Mon.tenMonHoc}">
											</div>
											<div class="mb-3">
												<label class="form-label required">ID Khoa</label> <input
													type="text" class="form-control" id="idKhoahoc"
													name="idKhoahoc" value="${Mon.idKhoaHoc}">
											</div>
											<div class="mb-3">
												<label class="form-label required">Tin Chi</label> <input
													type="text" class="form-control" id="TinChi" name="TinChi"
													value="${Mon.tinchi}">
											</div>
											<div class="mb-3">
												<label class="form-label required">ID KhoaQL</label> <input
													type="text" class="form-control" id="idKhoaQL"
													name="idKhoaQL" value="${Mon.idKhoaQL}">
											</div>
											<div class="modal-footer">
												<input type="submit" class="btn btn-primary" value="Update">
											</div>
										</form>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="container mt-5">
						<div class="modal" id="manageModal${kq.idMonHoc}">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<h5 class="modal-title">${kq.tenMonHoc}</h5>
										<button type="button" class="btn-close"
											data-bs-dismiss="modal"></button>
									</div>
									<div class="modal-body">
										<form id="manageForm">
											<div class="mb-3">
												<label class="form-label required">${kq.gv.getTenGV()}</label>
												<input type="checkbox" id="TenGV" name="TenGV"
													value="${kq.gv.getIdGiangVien()}">
											</div>
											<div class="modal-footer">
												<input type="button" class="btn btn-primary" value="Submit"
													onclick="manageForm(${kq.idMonHoc})">
											</div>
										</form>
									</div>
								</div>
							</div>
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
	<script>
	    function manageForm(idMonHoc) {
	        var checkbox = document.getElementById("TenGV");
	        var modal = document.getElementById("manageModal" + idMonHoc);
	
	        if (checkbox && checkbox.checked) {
	            modal.style.display = "none";
	        } else {
	            modal.style.display = "block";
	        }
	    }
	</script>
	<script src="script.js"></script>
</body>
</html>