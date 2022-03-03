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
    $in3=$_POST["in3"];
    $in4=$_POST["in4"];
    $in5=$_POST["in5"];
    $in6=$_POST["in6"];
    $conn->query("set names \"UTF\"");
    
    if($in1==null or $in2==null or $in3==null or $in4==null or $in5==null or $in6==null){
        echo "<h1>non lasciare valori vuoti</h1>";
        echo "<a href='../index.php'>ho capito</a>";
    }else if(mysqli_num_rows($conn->query("select * from users where email="+$in4))>0){
        echo "<h1>email già in uso</h1>";
        echo "<a href='../index.php'>ho capito</a>";
    }else if(mysqli_num_rows($conn->query("select * from users where username="+$in5))>0){
        echo "<h1>username già in uso</h1>";
        echo "<a href='../index.php'>ho capito</a>";
    }else{
        $_SESSION["user"]=$_POST["in5"];
        $conn->query("insert into users(nome,cognome,pass,email,username,indirizzo)values(
            '$in1','$in2','$in6','$in4','$in5','$in3')");
        header("Location:../dati/registi.php");
    }
    ?>
    <link rel="stylesheet" href="sfondo.css">
</body>
</html>