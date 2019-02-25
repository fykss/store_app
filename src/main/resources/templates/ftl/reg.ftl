<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
    <link rel="stylesheet" href="../../../../../assets/css/style.css">
</head>
<body>
<div class="registration-form">
    <a class="button-login" href="/login">Log In</a>
    <div class="block-line">
        <hr class="hr-left" align="left" width="125px" size="1px" color="#eaeaea"/>
        <span class="or">or</span>
        <hr class="hr-right" align="right" width="125px" size="1px" color="#eaeaea"/>
    </div>

    <div class="input-form">
        <form method="post" class="form" action=${rout}>
            <#list fields as field>
                <#if field == "password">
                    <input class="text-field" type="password" name="password" placeholder="Password" required>
                    <input class="text-field" type="password" name="confirm-password" placeholder="Confirm password" required>
                <#else>
                    <input class="text-field" type="text" name="login" placeholder="Login" required>
                </#if>
            </#list>
            <button class="button-form" type="submit">Register</button>
        </form>
    </div>
</div>
</body>
</html>