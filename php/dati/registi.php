<!DOCTYPE html>
<html>
<head>
</head>
<body>
    <a href="registi.php"><h1>Registi</h1></a>
    <?php
    $conn = new MySqli("127.0.0.1:3306","root","","videoteca") or die("errore di connessione");
    $conn->query("set names \"UTF\"");
    $table = $conn->query("select cognomer, nomer, idregista from registi");
    while($ez=$table->fetch_array()){
        $nomer = $ez['nomer'];
        $cognomer = $ez['cognomer'];
        $cognomer = str_replace(" ","",$cognomer);
        $idr = $ez['idregista'];
        echo "<a href='film.php?nomer=$nomer&cognomer=$cognomer&idr=$idr'>".$cognomer." ".$nomer."<br></a>";
    }
    ?>
    <link rel="stylesheet" href="../assets/style.css">
    <link rel="stylesheet" href="../sfondo.css">
</body>
</html>