<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Subjects add</title>
</head>
<body>

<h1>Add new Subject!!!</h1>
<div>

    <fieldset>
        <form name="subject" action="" method="POST">
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


            <input type="submit" value="create">
        </form>
    </fieldset>
</div>
</body>
</html>