<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  <!-- Font Awesome -->
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" rel="stylesheet" />
  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" rel="stylesheet" />
  <!-- MDB -->
  <link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.css" rel="stylesheet" />
  <!-- MDB -->
  <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.js"></script>

  <title>Document</title>
  <style>
    span {
      color: red;
      font-style: italic;
    }
  </style>
</head>
<body>
<div class="row">
  <div class="col-12">
    <div class="col-6 offset-3">
      <form th:action="{pageContext.request.contextPath}/create" method="post">
        <div class="mt-3">
          <h1>TASK DRIVING</h1>
        </div>

          <div class="mt-3">
            <label class="form-label">Tên Tài Xế</label>
            <select name="driver" class="form-select">
            <c:forEach var="driver" items="${diver}">
              <option value="${driver.id}" > ${driver.name}</option>
            </c:forEach>
            </select>
          </div>

          <div class="mt-3">
            <label class="form-label">Tuyến Đường</label>
            <select name="router" class="form-select">
              <c:forEach var="router" items="${router}">
              <option value="${router.id}" > ${router.name}</option>
              </c:forEach>
            </select>
          </div>

        <div class="mt-3">
          <label class="form-label">Số lượt đi</label>
          <input type="text" name="turnNumber"  class="form-control" />
        </div>

        <div class="mt-3">
          <button type="submit" class="btn btn-primary mb-3">Submit
          </button>
        </div>
        <form:form action="/driving" method="post">
          <button type="submit">quay lai</button>
        </form:form>
      </form>
    </div>
  </div>
</div>
</body>
</html>


