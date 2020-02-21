<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<!--
<form action="test/beans">
    <table border="1px">
        <tr>
            <td>用户名:</td>
            <td><input name="username" type="text"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input name="password" type="text"></td>
        </tr>
        <tr>
            <td>生日:</td>
            <td><input name="date" type="text"></td>
        </tr>
        <tr>
            <td>年龄:</td>
            <td><input name="age" type="text"></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>
-->
<!--
<a href="test/testRequestParam?name=test&email=123@12.com">requestParam 注解(没有age)</a><br>
<a href="test/testRequestParam?age=10">requestParam 注解(没有name)</a><br>
<a href="test/testRequestParam?name=test&age=10">requestParam 注解.(没有email)</a><br>
<a href="test/testRequestParam?name=test&age=10&email=123@12.com">requestParam 注解.(都有)</a><br>
-->


<!--RequestBody注解-->
<!--
<form action="test/testRequestBody" method="post">
    <table border="1px">
        <tr>
            <td>用户名:</td>
            <td><input name="username" type="text"></td>
        </tr>
        <tr>
            <td>年龄:</td>
            <td><input name="age" type="text"></td>
        </tr>
        <tr>
            <td>email:</td>
            <td><input name="email" type="text"></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>

<a href="test/testRequestBody?username=test&age=10&email=123@12.com">RequestBody测试</a><br>
-->

<!--PathVariable注解

<a href="test/testPathVariable/101">RequestBody测试</a><br>
-->

<!--RequestHeader注解

<a href="test/testRequestHeader">获取请求消息头</a>
-->

<!-- CookieValue
    用于把指定 cookie 名称的值传入控制器方法参数。
<a href="test/setCookieValue">设置 cookie 的值</a><br/>
<a href="test/testCookieValue">获取 cookie 的值</a><br/>
-->


<%--<form action="test/testModelAttribute">
    <table border="1px">
        <tr>
            <td>用户名:</td>
            <td><input name="username" type="text"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input name="password" type="text" value="loltoulan"></td>
        </tr>
        &lt;%&ndash;<tr>
            <td>生日:</td>
            <td><input name="date" type="text"></td>
        </tr>&ndash;%&gt;
        <tr>
            <td>年龄:</td>
            <td><input name="age" type="text" ></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>--%>


<!-- SessionAttribute 注解的使用
<a href="springmvc/testPut">存入 SessionAttribute</a>
<hr/>
<a href="springmvc/testGet">取出 SessionAttribute</a>
<hr/>
<a href="springmvc/testClean">清除 SessionAttribute</a>
-->

<a href="session/testSessionAttributes">存入 SessionAttribute</a>
<hr/>
<a href="session/getSessionAttributes">取出 SessionAttribute</a>
<hr/>
<a href="session/delSessionAttributes">清除 SessionAttribute</a>

</body>
</html>