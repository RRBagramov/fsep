<!DOCTYPE html>
<html>
<head>
    <title>Spring Security Example </title>
</head>
<body>
<#--<#if param.error??>-->
<#--<div>-->
<#--Invalid username and password.-->
<#--</div>-->
<#--</#if>-->
<#--<#if param.logout??>-->
<#--<div>-->
<#--You have been logged out.-->
<#--</div>-->
<#--</#if>-->
<form action="/login" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <fieldset>
        <input name="username" placeholder="User Name :" type="text" required autofocus>
    </fieldset>
    <fieldset>
        <input name="password" placeholder="Password:" type="text" required>
    </fieldset>
    <fieldset>
        <button name="submit" type="submit">Submit</button>
    </fieldset>
</form>
</body>
</html>