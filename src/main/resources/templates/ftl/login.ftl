<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="../../../../../assets/css/style.css">
</head>
<body>
<div class="login-form registration-form">
    <div class="block-line block-line-login">
        <hr class="hr-left" align="left" width="120px" size="1px" color="#eaeaea"/>
        <span class="or">Log In</span>
        <hr class="hr-right" align="right" width="120px" size="1px" color="#eaeaea"/>
    </div>

    <main>
        <div class="input-form">
            <form  method="post" class="form" action=${rout} >
                <#list fields as field>
                    <#if field == "password">
                        <input class="text-field" type="password" placeholder="Password" required>
                    <#else>
                        <input class="text-field" type="text" placeholder="Login" required>
                    </#if>
                </#list>
                <button class="button-form" type="submit">Log In</button>
            </form>
        </div>
    </main>
</div>
</body>
</html>