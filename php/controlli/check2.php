<!DOCTYPE html>
<html>
<head>
</head>
<body>
    <?php
    session_start();
    $conn = new MySqli("127.0.0.1:3306","root","","videoteca") or die("errore di connessione"); 
    $in1=$_POST["in1"];
    $in2=$_POST["in2"];
    $conn->query("set names \"UTF\"");
    
    if($in1==null or $in2==null){
        echo "<h1>non lasciare valori vuoti</h1>";
        echo "<a href='../index.php'>ho capito</a>";
    //}elseif(!$conn->query("select * from users where email="+$in4)){
    //    echo "<h1>email già in uso</h1>";
    }else if(mysqli_num_rows($conn->query("select * from users where username='$in1' and pass='$in2'"))<1){
        echo "dati non registrati<br>";
        echo "<a href='form.php'>Registrati<a>";
    }else{
        $_SESSION["user"]=$_POST["in1"];
        header("Location:../dati/registi.php");
    }

    ?>
</body>
</html>