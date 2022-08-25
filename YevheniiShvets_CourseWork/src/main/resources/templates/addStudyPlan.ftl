<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Study Plan add</title>
</head>
<body>

<h1>Add new Study Plan!!!</h1>
<div>

    <fieldset>
        <form name="studyPlan" action="" method="POST">

            <span style="margin: 5px">
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

            <input type="submit" value="create">
        </form>
    </fieldset>
</div>
</body>
</html>