<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <style>
        label {
            display: inline-block;
            width: 10%;
        }
    </style>
</head>

<body>
<div align="center">${flash.message}</div>
<g:form action="login" align="center" style="margin: 20%;">
    <div style="margin: 20px;">
        <label for="login">Email:</label>
        <input type="text" name="login" required>
    </div>
    <div style="margin: 20px;">
        <label for="password">Password:</label>
        <input type="password" name="password" required>
    </div>
    <input type="submit" value="Отправить">
</g:form>

</body>

</html>