<!DOCTYPE html>
<html>
<head>
</head>
<body>
    <?php
    session_start();
    if(isset($_SESSION["user"])){
        $text = $_GET["intxt"];
        $voto = $_GET["voto"];
        $idf = $_GET["idf"];
        $user = $_SESSION["user"];
        echo "<h1>".$_SESSION["user"].":</h1>voto: ".$voto." | recensione: ".$text."<br>";
        $conn = new MySqli("127.0.0.1:3306","root","","videoteca") or die("errore di connessione"); 
        $conn->query("set names \"UTF\"");
        $idu = $conn->query("select iduser from users where username='$user'")->fetch_array();
        $idu = $idu["iduser"];
        $conn->query("delete from recensioni where coduser=$idu and codfilm=$idf");  
        $conn->query("insert into recensioni(testo,voto,coduser,codfilm) values('$text','$voto','$idu','$idf');");
        $arr = array($_GET["titolo"],$_GET["anno"],$_GET["naz"],$_GET["idf"],$_GET["nomer"],$_GET["cognomer"],$_GET["idr"]);
        header("Location:../dati/subfilm.php?titolo=".$arr[0]."&anno=".$arr[1]."&naz=".$arr[2]."&id=".$arr[3]."&nomer=".$arr[4]."&cognomer=".$arr[5]."&idr=".$arr[6]."&u=".$idu."&f=".$idf);
    }
    else{
        echo "Registrati/Accedi per commentare<br>";
        echo "<a href='../form.php'>Registrati</a><br>";
        echo "<a href='../login.php'>Accedi<a>";
    }
    ?>
    <link rel="stylesheet" href="sfondo.css">
</body>
</html>