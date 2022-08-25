<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <title>Student add</title>
</head>
<body>

<h1>Add new Student!!!</h1>
<div>

    <fieldset>
        <form name="student" action="" method="POST">

            <span style="margin: 5px">
                <span style=" margin: 5px">surname:</span>
                <br><span style=" margin: 10px"><@spring.formInput "form.surname" "" "text"/>
                </span> </span>
            <br>

            <span style="margin: 5px">
                <span style=" margin: 5px">name:</span>
                <br><span style=" margin: 10px"><@spring.formInput "form.name" "" "text"/>
                </span> </span>
            <br>

            <span style="margin: 5px">
                <span style=" margin: 5px">patronymic:</span>
                <br><span style=" margin: 10px"><@spring.formInput "form.patronymic" "" "text"/>
                </span> </span>
            <br>

            <span style="margin: 5px">
                <span style=" margin: 5px">address:</span>
                <br><span style=" margin: 10px"><@spring.formInput "form.address" "" "text"/>
                </span> </span>
            <br>

            <span style="margin: 5px">
                <span style=" margin: 5px">phoneNumber:</span>
                <br><span style=" margin: 10px"><@spring.formInput "form.phoneNumber" "" "text"/>
                </span> </span>
            <br>


            <input type="submit" value="create">
        </form>

    </fieldset>
</div>
</body>
</html>