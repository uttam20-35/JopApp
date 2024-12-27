<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
            <c:forEach var="job" items="${jobs}">
                <tr>
                    <td>${job.jobTitle}</td>
                    <td>${job.company}</td>
                    <td>${job.location}</td>
                    <td>${job.salary}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <br>
    <a href="/home">Back to Home</a>
</body>
</html>