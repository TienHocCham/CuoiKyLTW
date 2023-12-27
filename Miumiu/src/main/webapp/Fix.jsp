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
    <form action=""  method="post">
        <div class="container">
            <table class="custom-table">
                <thead>
                    <tr>
                        <th scope="col">Thứ</th>
                        <th scope="col">Tên Giáo Viên</th>
                        <th scope="col">Môn học</th>
                        <th scope="col">Lớp</th>
                        <th scope="col">Phòng</th>
                        <th scope="col">Tiết Ban Đầu</th>
                        <th scope="col">Số Tiết Học</th>
                    </tr>
                </thead> 	
                <tbody>
                    <c:forEach var="kq" items="${List_TH}">
                        <tr>
                            <td>${kq.thu}</td>
                            <td>
                                <select class="form-select" name="teacher">
                                        <option value="">Please choose an option</option> 
                                    <c:forEach var="c" items="${List_GV}">
                                        <option value="${c.idGiangVien}">${c.tenGV}</option>
                                    </c:forEach>
                                </select>
                            </td>
                            <td>
                                <select class="form-select" name="subject">
                                        <option value="">Please choose an option</option> 
                                    <c:forEach var="c" items="${List_M}">
                                        <option value="${c.idMonHoc}">${c.tenMonHoc}</option>
                                    </c:forEach>
                                </select>
                            </td>
                            <td>
                                <select class="form-select" name="class">
                                        <option value="">Please choose an option</option>
                                    <c:forEach var="c" items="${List_L}"> 
                                        <option value="${c.idLop}">${c.tenLop}</option>
                                    </c:forEach>
                                </select>
                            </td>
                            <td>
                                <select class="form-select" name="room">
                                        <option value="">Please choose an option</option> 
                                    <c:forEach var="c" items="${List_P}">
                                        <option value="${c.idPhong}">${c.idPhong}</option>
                                    </c:forEach>
                                </select>
                            </td>
                            
                            <td>
                                <select class="form-select" name="startPeriod">
                                        <option value="">Please choose an option</option> 
                                    <c:forEach var="c" items="${List_M}">
                                        <option value="${c.tinchi}">${c.tinchi}</option>
                                    </c:forEach>
                                </select>
                            </td>
                            <td>
                                <select class="form-select" name="endPeriod">
                                    <option value="">Please choose an option</option> 
                                    <c:forEach var="c" items="${List_TT}"> 
                                        <option value="${c.tietBD}">${c.tietBD}</option>
                                    </c:forEach>
                                </select>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <button type="submit" class="btn btn-primary">Gửi Dữ Liệu</button>
        </div>
    </form>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
