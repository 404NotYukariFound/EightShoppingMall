<%--
  Created by IntelliJ IDEA.
  User: Temp
  Date: 2021/7/4
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--    加载三张图片且点击图片时可以跳转到相应的页面(鼠标在图片上悬停时有放大的动画)--%>
    <style>
        #total {
            border: 5px solid red;
            position: absolute;
            top: 20%;
            bottom: 20%;
            left: 10%;
            right: 10%;
        }

        #total > div {
            border: 5px solid black;
            position: absolute;
            width: 30%;
            height: 80%;
            top: 10%;
            bottom: 10%;
        }

        #book > input {
            position: absolute;
            width: 100%;
            height: 100%;
            background: url("static/images/img_choose/book.jpg");
        }

        #furniture > input {
            position: absolute;
            width: 100%;
            height: 100%;
            background: url("static/images/img_choose/furniture.jpg");
        }

        #phone > input {
            position: absolute;
            width: 100%;
            height: 100%;
            background: url("static/images/img_choose/phone.jpg");
        }

        #book {
            left: 0%;
        }

        #furniture {
            left: 34.5%;
        }

        #phone {
            right: 0%;
        }
    </style>
</head>
<body>
<%--    加载三张图片--%>
<div id="total">
    <div id="book">
        <input name="book" type="button">
        <%--        <img src="images/img_choose/book.jpg">--%>
    </div>
    <div id="furniture">
        <input name="furniture" type="button">
        <%--        <img src="images/img_choose/furniture.jpg">--%>
    </div>
    <div id="phone">
        <input name="phone" type="button">
        <%--        <img src="images/img_choose/phone.jpg">--%>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
    $(function(){
        $("input[name='book']").click(function(){
            console.log('book');
            window.location.href="/EightShoppingMall_war/webpage/toPage.do?pageName=book";//宿主对象
        })
        $("input[name='furniture']").click(function(){
            console.log('furniture');
            window.location.href="toPage?pageName=furniture";//宿主对象
        })
        $("input[name='phone']").click(function(){
            console.log('phone');
            window.location.href="toPage?pageName=phone";//宿主对象
        })
    })
</script>
</body>
</html>
