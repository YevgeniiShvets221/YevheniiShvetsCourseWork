<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <title>Update subject!!!</title>
</head>
<body>
<div>

    <fieldset>
        <form name="subject" action="" method="POST">

           <span style="margin: 5px">
                <span style=" margin: 5px">id:</span>
                <br><span style=" margin: 10px"><@spring.formInput "form.id" "" "text"/>
                </span> </span>
            <br>

            <span style="margin: 5px">
                <span style=" margin: 5px">name:</span>
                <br><span style=" margin: 10px"><@spring.formInput "form.name" "" "text"/>
                </span> </span>
            <br>

            <span style="margin: 5px">
                <span style=" margin: 5px">lecturesHours:</span>
                <br><span style=" margin: 10px"> <@spring.formInput "form.lecturesHours" "" "number"/>
                </span> </span>
            <br>

            <span style="margin: 5px">
                <span style=" margin: 5px"> practicesHours:</span>
                <br><span style=" margin: 10px"><@spring.formInput "form.practicesHours" "" "number"/>
                </span> </span>
            <br>

            <span style="margin: 5px">
                <span style=" margin: 5px"> laboratoryWorkHours:</span>
                <br><span style=" margin: 10px"><@spring.formInput "form.laboratoryWorkHours" "" "number"/>
                </span> </span>
            <br>

            <span style="margin: 5px">
                <span style=" margin: 5px"> CreatedAt:</span>
                <br><span style=" margin: 10px"><@spring.formInput "form.createdAt" "" "date"/>
                </span> </span>
            <br>

            <span style="margin: 5px">
                <span style=" margin: 5px">  UpdatedAt:</span>
                <br><span style=" margin: 10px"> <@spring.formInput "form.updatedAt" "" "date"/>
                </span> </span>
            <br>

            <input type="submit" value="update">
        </form>
    </fieldset>
</div>
</body>
</html>