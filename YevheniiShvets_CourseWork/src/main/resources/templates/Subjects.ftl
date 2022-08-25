<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Subjects</title>
</head>
<body>
<h1>
    Hello Subjects!
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</h1>
<div>
<table border="3" class="table table-light">

    <tr>
        <th> ID </th>
        <th> Subject name </th>
        <th> Subject duration of lections  </th>
        <th> Subject duration of practices </th>
        <th> Subject duration of laboratory works </th>
        <th> Created At </th>
        <th> Updated At </th>
        <th></th>
        <th></th>
    </tr>
<tbody>
    <#list subjects as subject>
        <tr>
            <td>${subject.id}</td>
            <td>${subject.name}</td>
            <td>${subject.lecturesHours}</td>
            <td>${subject.practicesHours}</td>
            <td>${subject.laboratoryWorkHours}</td>
            <td><#if subject.createdAt??>${subject.createdAt}</#if></td>
            <td><#if subject.updatedAt??>${subject.updatedAt}</#if></td>
            <td><a href="/ui/v1/subjects/del/${subject.id}"> <button type="button" class="btn btn-success"> Delete</button> </a> </td>
            <td><a href="/ui/v1/subjects/edit/${subject.id}"> <button type="button" class="btn btn-success"> Update</button> </a> </td>
        </tr>
    </#list>
</tbody>
</table>
</div>

<a href="/ui/v1/subjects/add"><button type="button" class="btn btn-success" >Create</button></a>

</body>
</html>