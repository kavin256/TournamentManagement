<html>

<!-- Connecting to the database -->

<?php

//
$NArr = array($_POST['team1'] , $_POST['team2'], $_POST['team3'] , $_POST['team4'] , $_POST['team5'] , $_POST['team6'], $_POST['team7'] , $_POST['team8'] , $_POST['team9'] , $_POST['team10'], $_POST['team11'] , $_POST['team12'] , $_POST['team13'] , $_POST['team14'], $_POST['team15']);

$servername = "localhost";
$username = "root";
$password = "";
$dbname = "TMDB";

$conn = new mysqli($servername, $username, $password, $dbname);
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);} 

for ($i = 0 ; $NArr[$i] != null ; $i++){
	$sql = "INSERT INTO teams (teamNumber, name)
	VALUES (null, '$NArr[$i]')";

	if ($conn->query($sql) === TRUE) {	} 
	else {
	    echo "Error: " . $sql . "<br>" . $conn->error;
	}
}

$conn->close();

?>

</html>