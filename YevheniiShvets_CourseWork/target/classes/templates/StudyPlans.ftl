<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>StudyPlans</title>
</head>
<body>
<h1>
    Hello Study Plans!!!
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</h1>
<<div>
<table border="3" class="table table-info">

    <tr>
        <th> ID </th>
        <th> Student surname </th>
        <th> Subject name </th>
        <th> Total mark for the course </th>
        <th> Created At </th>
        <th> Updated At </th>
        <th></th>
        <th></th>
    </tr>

<tbody>
    <#list studyPlans as studyPlan>
        <tr>
            <td>${studyPlan.id}</td>
            <td>${studyPlan.student.surname}</td>
            <td>${studyPlan.subject.name}</td>
            <td>${studyPlan.mark}</td>
            <td><#if studyPlan.createdAt??>${studyPlan.createdAt}</#if></td>
            <td><#if studyPlan.updatedAt??>${studyPlan.updatedAt}</#if></td>
            <td><a href="/ui/v1/studyPlans/del/${studyPlan.id}"><button type="button" class="btn btn-warning"> Delete</button> </a> </td>
            <td><a href="/ui/v1/studyPlans/edit/${studyPlan.id}"><button type="button" class="btn btn-warning"> Update</button> </a> </td>
        </tr>
    </#list>
</tbody>
</table>
</div>

   <a href="/ui/v1/studyPlans/add"><button type="button" class="btn btn-warning" >Create</button></a>

</body>
</html>