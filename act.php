<html>

<?php 	
$Numrow = $_POST['numrows'];
$url = "actcS/actc".$Numrow.".php";

header("Location: $url");
?>

</html>