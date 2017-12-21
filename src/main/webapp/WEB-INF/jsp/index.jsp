<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
      xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">
<!DOCTYPE html>
<html>
<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<table>
    <tr>
        <th>Група</th>
        <th>Предмет</th>
        <th>Викладач</th>
        <th>Аудиторія</th>
        <th>Початок заняття</th>
        <th>День</th>
    </tr>
    <c:forEach var="list" items="${lists}">
    <tr>
        <td>${list.GroupName}</td>
        <td>${list.SujectName}</td>
        <td>${list.TeacherName}</td>
        <td>${list.Room}</td>
        <td>${list.LessonTime}</td>
        <td>${list.WeekDayName}</td>
        <td></td>
    </tr>
</c:forEach>
</table>

</body>
</html>
