<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>awesome shop</title>
    <link href="/public/css/meyerreset.css" rel="stylesheet" type="text/css"/>
    <link href="/public/css/home.css" rel="stylesheet" type="text/css"/>
    <script
      src="https://code.jquery.com/jquery-3.3.1.min.js"
      integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
      crossorigin="anonymous"></script>
    <script src="/public/javascript/home.js" type="text/javascript"></script>
  </head>
  <body>

      <header>
        <nav>
          <a class="navLink" href="/cars">cars</a> |
          <a class="navLink" href="/boats">boats</a> |
          <a class="navLink" href="/houses">houses</a>
        </nav>
        <button id="login-button" type="button" onclick="showLogin()">login</button>
      </header>
      <div id="midsection">
        <div id="content">
          <h1>Awesome Sale Shack</h1>
        </div>

        <aside>
          welcome: ${(user.name)!"default Joe!"}<br>
          your password is: ${(user.password)!}<br>
          missing value: ${(user.missing)!}<br>
          stuff on the side<br>
          total items in cart<br>
          total: $34,000,000<br>
          <button type="button">checkout</button>
        </aside>
      </div>

      <footer>
        <section id="copywrite">Copywrite © 2018 - HEDgear Software</section>
      </footer>
      <div id="login-model">
        <form id="login-form" action="/home" method="POST">
          <label for="username-input">User Name:</label><br>
          <input type="text" name="name" id="username-input"><br>
          <label for="password-input">Password: </label><br>
          <input type="text" name="password" id="passowrd-input"><br><br>
          <input class="submit" type="submit" value="submit">
          <input id="cancellogin" type="button" value="cancel">
        </form>
      </div>
  </body>
</html>
