<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Стартовая страница</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="static/style.css" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body style="background-image: url('UFO3.png');">

<div class="container-fluid">
    <br>
    <br>
    <h1 class="text-center">${sessionScope.result ? "Победа" : "Поражение"} </h1>
    <br>
    <p class="text-center">${sessionScope.outcome} </p>

    <form action="init" method="POST" class="form-horizontal">
        <fieldset>
            <!-- Button -->
            <div class="form-group">
                <label class="col-md-4 control-label" for=""></label>
                <div class="col text-center">
                    <button id="" name="" class="btn btn-primary">Попробовать еще раз</button>
                </div>
            </div>
        </fieldset>
    </form>
</div>

</body>
</html>
