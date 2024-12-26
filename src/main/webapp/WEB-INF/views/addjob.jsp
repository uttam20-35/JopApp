<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOC-TYPE html>
<html>
<head>
    <title>Add Job</title>
</head>
<body>
    <h1>Add a New Job</h1>
    <form action="handleForm" method="post">
        <label for="jobTitle">Job Title:</label>
        <input type="text" id="jobTitle" name="jobTitle" required><br><br>

        <label for="company">Company:</label>
        <input type="text" id="company" name="company" required><br><br>

        <label for="location">Location:</label>
        <input type="text" id="location" name="location" required><br><br>

        <label for="salary">Salary:</label>
        <input type="number" id="salary" name="salary"><br><br>

        <input type="submit" value="Add Job">
    </form>
</body>
</html>
