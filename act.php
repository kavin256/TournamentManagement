<html>

<?php 	
$Numrow = $_POST['numrows'];
$url = "actc".$Numrow.".php";

header("Location: $url");
?>

</html>