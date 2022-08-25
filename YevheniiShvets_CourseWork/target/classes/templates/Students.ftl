<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Students</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
<h1>
    Hello Students!
</h1>
<div>
<table border="3" class="table table-striped">

    <tr>
        <th> ID </th>
        <th> Student surname </th>
        <th> Student name  </th>
        <th> Student patronymic </th>
        <th> Student Address</th>
        <th> Student phone number</th>
        <th> Created At </th>
        <th> Updated At </th>
        <th></th>
        <th></th>
    </tr>
<tbody>
    <#list students as student>
        <tr>
            <td>${student.id}</td>
            <td>${student.surname}</td>
            <td>${student.name}</td>
            <td>${student.patronymic}</td>
            <td>${student.address}</td>
            <td>${student.phoneNumber}</td>
            <td><#if student.createdAt??>${student.createdAt}</#if></td>
            <td><#if student.updatedAt??>${student.updatedAt}</#if></td>
            <td><a href="/ui/v1/students/del/${student.id}"> <button type="button" class="btn btn-danger">Delete</button>  </a> </td>

            <td><a href="/ui/v1/students/edit/${student.id}"> <button type="button" class="btn btn-danger">Update</button>  </a> </td>
        </tr>
    </#list>
    </tbody>
</table>
</div>

<a href="/ui/v1/students/add"><button type="button" class="btn btn-danger" >Create</button></a>
</body>
</html>