
<%--<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page language="java" pageEncoding="UTF-8"%>

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
      <form th:action="/router/create" method="post">
        <div class="mt-3">
          Form Create Product
        </div>
        <div class="mt-3">
          <label class="form-label">Tên Tuyến Đường</label>
          <input type="text" name="name" class="form-control" />
        </div>
        <div class="mt-3">
          <label class="form-label">Quãng Đường</label>
          <input type="text" name="distance"  class="form-control" />

        </div>

        <div class="mt-3">
          <label class="form-label">Số Điểm Dừng</label>
          <input type="number" name="stopPoint" class="form-control" />
        </div>


        <div class="mt-3">
          <button type="submit" class="btn btn-primary mb-3">Submit
          </button>
        </div>
      </form>
    </div>
  </div>
</div>
</body>
</html>


