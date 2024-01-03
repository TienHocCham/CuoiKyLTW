<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Đăng Ký Giáo Viên</title>
    <!-- Google font -->
    <link href="https://fonts.googleapis.com/css?family=Raleway:500" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Muli" rel="stylesheet" type="text/css">
    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <!-- Fontawesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <!-- Your custom CSS -->
    <link rel="stylesheet" href="css/SearchGV.css">
</head>
<body>
    <!-- Header -->
    <div class="custom-header d-flex align-items-center">
        <img src="img/image-1.png" alt="Icon" class="custom-icon float-left">
        <div class="custom-title text-left">Đăng Ký Giáo Viên</div>
    </div>
    <!-- Form -->
        <div class="container">
            <table class="custom-table">
                <thead>
                    <tr>
                        <th>Thu</th>
                        <th>Ten Giao Vien</th>
                        <th>Mon hoc</th>
                        <th>Lop</th>
                        <th>Phong</th>
                        <th>Tiet Ban Đau</th>
                        <th>So Tiet Hoc</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="kq" items="${List_tkb}">
                        <tr>
                            <td>${kq.thu}</td>
                            <td>${kq.getGiangvien().getTenGV()}</td>
                            <td>${kq.getMon().tenMonHoc}</td>
                            <td>${kq.idlop}</td>
                            <td>${kq.getPhong().getIdPhong()}</td>
                            <td>${kq.tietBD}</td>
                            <td>${kq.tietKT}</td>
                            <td><button type="button" class="btn btn-primary"
								data-bs-toggle="modal" data-bs-target="#myModal${kq.thu}">Edit</button></td>
                        </tr>
                        <div class="container mt-5">
						<div class="modal" id="myModal${kq.thu}">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<h5 class="modal-title">Contact Us</h5>
										<button type="button" class="btn-close"
											data-bs-dismiss="modal"></button>
									</div>
									<div class="modal-body">
										<form action="UpdateTKB" method="post">
											<input type="hidden" name="idtkb" value="${kq.thu}">
											<div class="mb-3">
												<label class="form-label required">Ten GV</label> <input
													type="text" class="form-control" name="TenGV" id="TenGV"
													value="${kq.getGiangvien().getIdGiangVien()}">
											</div>
											<div class="mb-3">
												<label class="form-label required">Mon</label> <input
													type="text" class="form-control" id="idMon"
													name="idMon" value="${TKB.getMon().getIdMonHoc()}">
											</div>
											<div class="mb-3">
												<label class="form-label required">Lop</label> <input
													type="text" class="form-control" id="idLop"
													name="idLop" value="${kq.idlop}">
											</div>
											<div class="mb-3">
												<label class="form-label required">Phong</label> <input
													type="text" class="form-control" id="idPhong"
													name="idPhong" value="${kq.getPhong().getIdPhong()}">
											</div>
											<div class="mb-3">
												<label class="form-label required">TietBD</label> <input
													type="text" class="form-control" id="idbd"
													name="idbd" value="${kq.tietBD}">
											</div>
											<div class="mb-3">
												<label class="form-label required">TietKT</label> <input
													type="text" class="form-control" id="idkt"
													name="idkt" value="${kq.tietKT}">
											</div>
											<div class="modal-footer">
												<input type="submit" class="btn btn-primary" value="EditTKB">
											</div>
										</form>
									</div>
								</div>
                    </c:forEach>
                </tbody>
            </table>
        </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
