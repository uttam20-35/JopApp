<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>View All Jobs</title>
</head>
<body>
    <h1>All Jobs</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Job Title</th>
                <th>Company</th>
                <th>Location</th>
                <th>Salary</th>
            </tr>
        </thead>
        <tbody>
            <%-- Example Data (Replace with dynamic data from the backend) --%>
            <tr>
                <td>Software Engineer</td>
                <td>TechCorp</td>
                <td>New York</td>
                <td>$100,000</td>
            </tr>
            <tr>
                <td>Web Developer</td>
                <td>WebWorks</td>
                <td>San Francisco</td>
                <td>$80,000</td>
            </tr>
            <%-- Use a loop to dynamically generate rows here --%>
        </tbody>
    </table>
    <br>
    <a href="home.jsp">Back to Home</a>
</body>
</html>
