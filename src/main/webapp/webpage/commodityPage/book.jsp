<%--
  Created by IntelliJ IDEA.
  User: Temp
  Date: 2021/7/5
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        div>input{/*去除input的默认样式*/
            background:none;
            outline:none;
            border:none;
        }
    </style>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>
    <script>

    </script>
</head>
<body>
<h2>Book</h2>
<div id="variety">

    <label>类型:</label>
    <input type="button" name="novel_dushi" value="都市小说">
    <input type="button" name="novel_kehuan" value="科幻小说">
    <input type="button" name="novel_yanqing" value="言情小说">
    <input type="button" name="novel_kongbu" value="恐怖小说">
</div>


</body>
</html>
