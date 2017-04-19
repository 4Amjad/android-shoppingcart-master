 <?
include("config.php");
date_default_timezone_set("Asia/Muscat");
$datee= date("Y/m/d");//strip_tags(trim($_POST["date"]));
$timee= date("h:i:sa");//strip_tags(trim($_POST["time"]));
$date_time=$datee." : ".$timee;
    $ename = $_POST["ename"];
    $email = $_POST["email"];
   $epassword = $_POST["epassword"];
   
if($ename<>null && $email<>null && $epassword<>null){ 
      
      $total_row = mysql_query("SELECT * FROM user"); 
      $old = mysql_num_rows( $total_row );
      mysql_query("INSERT INTO user( name,email,password,date_time)values ( '$ename','$email','$epassword','$date_time' )");
  
      $total_row_new = mysql_query("SELECT * FROM user "); 
      $new = mysql_num_rows( $total_row_new );
  
      if($new > $old ){
      $chack["success"] = true;  
      }else{
      $chack["success"] = false;    
      }
  
}else{
   $chack["success"] = false; 
} 
   echo json_encode($chack);
   
    mysql_close($db);
?>