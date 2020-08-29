<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Queries???</title>
</head>
<body style="background-color: lightblue;">


    <form method="post" action="postsave">
     
    <table border="8" width="70%" cellpadding="20" style="margin-left:auto;margin-right:auto;margin-top:0px;margin-bottom:100px;">
    <tr>
<th>Question
<input type="text" name="question" value="${Question.question}">
 
     
</th>
</tr>
    <tr>
<th>
<input type="submit" value="Submit">
</tr>
</table>
        

        
    </form>
        

</body>
</html>