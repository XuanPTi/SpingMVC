<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<html>
<head>
  <title>Hello World Spring MVC</title>
  <style>
    .btn{
      height: 40px;
      width: 90px;
      margin-right: 10px;
      box-shadow: 2px 3px 3px #b3aaaa;
    }
    td{
      margin-right: 10px;
      width:120px
    }
    a{
      text-decoration: none;
    }
    .info-router{
      display: flex;
      justify-content: center;
    }
  </style>
</head>
<body>

<div class="menu">

  <nav class="navbar navbar-expand-sm navbar-dark bg-dark">
    <div class="container-fluid">
      <a class="navbar-brand" href="${pageContext.request.contextPath}/">Logo</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="mynavbar">
        <ul class="navbar-nav me-auto">
          <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/driver/">Driver</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/driving/">Driving</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/router/">Router</a>
          </li>
        </ul>
        <form class="d-flex">
          <input class="form-control me-2" type="text" placeholder="Search">
          <button class="btn btn-primary" type="button">Search</button>
        </form>
      </div>
    </div>
  </nav>

</div>
<div class="center">
  <h1 style="text-align: center">Information Router</h1>
  <div class="info-router">
    <table>
      <tr>
        <td>Tuyến </td>
        <td>Quãng đường</td>
        <td>Số điểm dừng</td>
      </tr>
      <c:forEach var="router" items="${listRouter}">
        <tr>
          <th>${router.name}</th>
          <th>${router.distance}</th>
          <th>${router.stopPoint}</th>
          <th>
            <button class="btn"><a href="${pageContext.request.contextPath}/router/delete/${router.id}">Xóa</a></button>
            <button class="btn"><a href="${pageContext.request.contextPath}/router/update/${router.id}">Sửa</a></button>
          </th>
        </tr>
      </c:forEach>
    </table>

  </div>

  <form:form class="info-router" action="./router/create" method="GET">
    <button class="btn" type="submit">Create</button>
  </form:form>

</div>
</body>
</html>
