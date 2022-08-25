<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <title>Update Study Plan!!!</title>
</head>
<body>
<h1>Update Study Plan!!!</h1>
<div>

    <fieldset>
        <form name="studyPlan" action="" method="POST">

               <span style=" margin: 5px">student:</span>
                <br><span style=" margin: 10px"><@spring.formSingleSelect "form.student",students, "" />
                </span> </span>
            <br>

            <span style="margin: 5px">
                <span style=" margin: 5px">subject:</span>
                <br><span style=" margin: 10px"><@spring.formSingleSelect "form.subject",subjects, "" />
                </span> </span>
            <br>

            <span style="margin: 5px">
                <span style=" margin: 5px">mark:</span>
                <br><span style=" margin: 10px"><@spring.formInput "form.mark" "" "number"/>
                </span> </span>
            <br>

            <span style="margin: 5px">
                <span style=" margin: 5px">CreatedAt:</span>
                <br><span style=" margin: 10px"><@spring.formInput "form.createdAt" "" "date"/>
                </span> </span>
            <br>

            <span style="margin: 5px">
                <span style=" margin: 5px">UpdatedAt:</span>
                <br><span style=" margin: 10px"> <@spring.formInput "form.updatedAt" "" "date"/>
                </span> </span>
            <br>

            <input type="submit" value="save">
        </form>
    </fieldset>
</div>
</body>
</html>