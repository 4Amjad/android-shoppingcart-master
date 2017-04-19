<?
include("config.php");
    $ename = $_POST["Login_name"];
   $epassword = $_POST["Login_password"];
      
   $total_row = mysql_query("SELECT * FROM user WHERE name LIKE '$ename' AND password LIKE '$epassword' "); 
    $row = mysql_num_rows( $total_row );
  
  if($row > 0 ){
   $chack["success"] = true;  
  }else{
   $chack["success"] = false;    
 }
    
echo json_encode($chack);
mysql_close($db);
?>