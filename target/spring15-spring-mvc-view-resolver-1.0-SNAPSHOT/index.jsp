<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<html>
<head>
  <title>ManagerBus</title>
  <style>
    .btn{
      height: 40px;
      width: 90px;
      margin-right: 10px;
      box-shadow: 2px 3px 3px #b3aaaa;
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
<h2 style="text-align: center; margin:20px;">MANAGEMENT BUS STOP</h2>
<div class="center d-flex justify-content-center">

  <form:form action="./driver" method="GET">
    <button class="btn" type="submit">Driver</button>
  </form:form>

  <form:form action="./router" method="GET">
    <button class="btn" type="submit">Router</button>
  </form:form>
  <form:form action="./driving" method="GET">
    <button class="btn" type="submit">Driving</button>
  </form:form>
</div>
</body>
</html>
