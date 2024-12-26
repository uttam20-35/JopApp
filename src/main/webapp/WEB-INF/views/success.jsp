<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOC-TYPE html>
<html>
<head>
    <title>Success</title>
</head>
<body>
    <h1>Operation Successful!</h1>
    <h2>Your request was processed successfully.</h2>
     <br><p> Job Title: ${jobPost.jobTitle}
     <br> Company: ${jobPost.company}
     <br> Location: ${jobPost.location}
     <br> Salary: ${jobPost.salary}
     </p><br>
    <a href="/home">Go to Home</a>
</body>
</html>