<!DOCTYPE html>
<html>
<head>
</head>
<body>
    <h1>Log in</h1>
    <form action="controlli/check2.php" method="POST">
        <label for="in1">username</label>
        <input name="in1" type="text"><br>
        <label for="in2">password</label>
        <input name="in2" type="password"><br>
        <input type="submit" name="submit" value="Log in">
    </form>
    <h4>Account non registrato?<br><a href="controlli/index.php">Registrati</a></h4>
    <link rel="stylesheet" href="assets/style.css">
    <link rel="stylesheet" href="sfondo.css">
</body>
</html>