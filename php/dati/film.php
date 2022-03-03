<!DOCTYPE html>
<html>
<head>
</head>
<body>
    <a href="registi.php"><h1>Registi</h1></a>
    <h1>film</h1>
    <?php
    $conn = new MySqli("127.0.0.1:3306","root","","videoteca") or die("errore di connessione");
    $conn->query("set names \"UTF\"");
    $cognomer = $_GET["cognomer"];
    $nomer = $_GET["nomer"];
    $idr = $_GET["idr"];
    echo $nomer." ".$cognomer."<br><br>";
    $sql = "select * from film where $idr=codicer";
    $table = $conn->query($sql);
    while($ez=$table->fetch_array()){
        $id=$ez['idfilm'];
        $titolo=$ez['titolo'];
        $anno=$ez['anno'];
        $naz=$ez['nazionalita'];
        $titolo = str_replace("'","*",$titolo);
        echo "<a href='subfilm.php?titolo=$titolo&anno=$anno&naz=$naz&id=$id&nomer=$nomer&cognomer=$cognomer&idr=$idr'>";
        echo $ez['titolo']." ".$ez['anno']." ".$ez['nazionalita']."<br></a>";
    }
    ?>
    <link rel="stylesheet" href="../assets/style.css">
    <link rel="stylesheet" href="../sfondo.css">   
</body>
</html>