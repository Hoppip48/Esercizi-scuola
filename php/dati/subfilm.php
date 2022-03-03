<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <script defer src="../assets/stelline.js"></script>
</head>
<body>
    <a href="registi.php"><h1>Registi</h1></a>
    <?php
    $conn = new MySqli("127.0.0.1:3306","root","","videoteca") or die("errore di connessione");
    $conn->query("set names \"UTF\"");
    $no = $_GET["nomer"];
    $cg = $_GET["cognomer"];
    $idr = $_GET["idr"];    
    echo "Regista: $cg $no<br>";
    echo "<a href='film.php?nomer=$no&cognomer=$cg&idr=$idr'><h1>film</h1></a>";
    $titolo = $_GET["titolo"];
    $titolo = str_replace("*","'",$titolo);
    $anno = $_GET["anno"];
    $naz = $_GET["naz"];
    $id = $_GET["id"];
    echo $titolo." ".$anno." ".$naz." "."<br><br><h1>Attori</h1>";
    $sql = "select distinct cognomea, nomea, luogoa from attori, recita, film where $id=codfilm and codicea=idattore";
    $table = $conn->query($sql); 
    while($ez=$table->fetch_array()){
        echo $ez['cognomea']." ".$ez['nomea']." ".$ez['luogoa']."<br>";
    }
    echo "<form id='form' method='GET' action='../controlli/commenti.php'>
    <input type='hidden' name='idf' value='$id'>
    <input type='hidden' name='titolo' value='$titolo'>
    <input type='hidden' name='anno' value='$anno'>
    <input type='hidden' name='naz' value='$naz'>
    <input type='hidden' name='nomer' value='$no'>
    <input type='hidden' name='cognomer' value='$cg'>
    <input type='hidden' name='idr' value='$idr'>
    ";
    echo "<h1>COMMENTI:</h1>
    voto:
    <span id='1' class='fa fa-star checked' onclick='addstar(this)'></span>
    <span id='2' class='fa fa-star' onclick='addstar(this)'></span>
    <span id='3' class='fa fa-star' onclick='addstar(this)'></span>
    <span id='4' class='fa fa-star' onclick='addstar(this)'></span>
    <span id='5' class='fa fa-star' onclick='addstar(this)'></span><br>
    <textarea name='intxt'></textarea><br>
    <button onclick='checkstar()'>Commenta</button><br>
    </form><br><br><h3>Commenti Pubblici:</h3>";
    $table = $conn->query("select distinct * from recensioni where codfilm=$id ");
    while($j=$table->fetch_array()){
        $u = $j["coduser"];
        $t = $conn->query("select username from users where iduser=$u")->fetch_array();
        $u = $t["username"];
        echo "<div id='chungus' border-width='thick'><h4>Utente ".$u.":</h4>voto: "; //$j['voto']
        for($i=0;$i<$j["voto"];$i++){
            echo "<span class='fa fa-star checked'></span>";
        }
        for($i=$j["voto"];$i<5;$i++){
            echo "<span class='fa fa-star'></span>";
        }
        echo "<br>recensione: ".$j['testo']."</div><br>";
    }
    echo "<style>
    div{
        border: 5px solid black;
    }</style>";
    ?>
    <style>
    .checked {
      color: orange;
    }
    </style>
    <link rel="stylesheet" href="../assets/style.css">
    <link rel="stylesheet" href="../sfondo.css">
</body>
</html>