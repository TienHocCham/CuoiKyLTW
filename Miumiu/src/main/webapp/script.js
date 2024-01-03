$("#example").DataTable({
  responsive: true,
});



function closePopup() {
    document.getElementById('popupForm').style.display = 'none';
    document.getElementById('overlay').style.display = 'none';
}




function toggleRowVisibility(checkbox) {
    var teacherId = checkbox.value;
    var teacherRow = document.getElementById('teacher-' + teacherId);

    if (checkbox.checked) {
        // Ẩn dữ liệu khi checkbox được chọn
        teacherRow.style.display = 'none';
    } else {
        // Hiển thị lại dữ liệu khi checkbox được hủy chọn
        teacherRow.style.display = 'block';
    }
}



