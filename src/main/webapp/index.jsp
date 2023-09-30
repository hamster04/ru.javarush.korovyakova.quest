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
  <h1 class="text-center">Пролог</h1>
  <p>Ты стоишь в космическом порту и готов подняться на борт своего корабля. Разве ты не об этом мечтал? Стать капитаном галактического судна с экипажем, который будет совершать подвиги под твоим командованием.</p>
  <p>Так что вперед!</p>
  <br>
  <h1 class="text-center">Знакомство с экипажем</h1>
  <p>Добро пожаловать на борт корабля JavaSpaceX.</p>
  <p>Когда ты поднялся на борт корабля, тебя поприветствовала девушка с черной папкой в руках:</p>
  <p>- Здравствуйте, командир! Я Айка - ваша помощница. Видите? Там в углу человек пьет кофе - это наш штурман, а рядом с ним спит наш бортмеханик.</p>
  <p>А как обращаться к Вам??</p>
  <form action="init" method="POST" class="form-horizontal">
    <fieldset>
      <!-- Text input-->
      <div class="form-group">
        <label class="col-md-4 control-label" for="name"></label>
        <div class="col text-center">
          <input autocomplete="off" id="name" name="name" type="text" placeholder="Введите Ваше имя здесь" class="form-control input-md">
        </div>
      </div>

      <!-- Button -->
      <div class="form-group">
        <label class="col-md-4 control-label" for=""></label>
        <div class="col text-center">
          <button id="" name="" class="btn btn-primary">Начать квест</button>
        </div>
      </div>
      </fieldset>
  </form>
</div>
</body>
</html>
