<!DOCTYPE html>
<html>
<head>
</head>
<body>
    <h1>Registrazione</h1>
    <form action="controlli/check.php" method="POST">
        <label for="in1">nome</label>
        <input name="in1" type="text"><br>
        <label for="in2">cognome</label>
        <input name="in2" type="text"><br>
        <label for="in3">indirizzo</label>
        <input name="in3" type="text"><br>
        <label for="in4">email</label>
        <input name="in4" type="email"><br>
        <label for="in5">username</label>
        <input name="in5" type="text"><br>
        <label for="in6">password</label>
        <input name="in6" type="password"><br>
        <input type="submit" name="submit" value="Registrati">
    </form>
    <h4>Già registrato?<br><a href="login.php">Login</a></h4>
    <link rel="stylesheet" href="assets/style.css">
    <link rel="stylesheet" href="sfondo.css">
</body>
</html>