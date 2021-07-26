<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.eight.bean.ProductCategory" %>
<%@ page import="com.eight.bean.BookDetail" %><%--
  Created by IntelliJ IDEA.
  User: Temp
  Date: 2021/7/5
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <%
        int totalRecord = (int) session.getAttribute("totalRecord");
        String pageName = (String) session.getAttribute("pageName");
        List<ProductCategory> book_categoryList = (List<ProductCategory>) session.getAttribute("bookCategoryList");
        List<BookDetail> book_detailList = (List<BookDetail>) session.getAttribute("bookDetailList");
    %>
    <style>
        li > input { /*去除input的默认样式*/
            background: none;
            outline: none;
            border: none;
        }

        #variety > ul {
            border: gray solid 5px;
        }

        #page {
            position: fixed;
            top: 90%;
        }

        .hovered {
            color: red;
        }

        .selected {
            color: red;
        }
    </style>
</head>
<body>
<h2>Book</h2>
<input id="curPage" type="hidden" name="curPage" value="1">
<input id="pageSize" type="hidden" name="pageSize" value="15">
<input id="totalRecord" type="hidden" name="totalRecord" value=<%=totalRecord%>>
<input id="pic_infoList" type="hidden">
<div id="variety">
    <ul>
        <li>
            <label>类型: </label>
            <%
                for (int i = 0; i < book_categoryList.size(); i++) {
            %>
            <input id="<%="twoCategoryId_"+i%>" type="button"
                   name="condition"
                   value=<%=book_categoryList.get(i).getCategoryName()%> data=<%=book_categoryList.get(i).getCategoryId()%>>
            <%
                }
            %>
        </li>
        <li>
            <label>出版社:</label>
            <%
                List<String> publisherList = new ArrayList<String>();
                for (int i = 0, j = 0; i < 6; i++, j++) {
                    if (publisherList.contains(book_detailList.get(j).getBPublisher())) {
                        i--;
                        continue;
                    } else {
                        publisherList.add(book_detailList.get(j).getBPublisher());
            %>
            <input id="<%="bPublisher_"+i%>" type="button"
                   name="condition"
                   value=<%=book_detailList.get(j).getBPublisher()%> data=<%=book_detailList.get(j).getBPublisher()%>>
            <%
                    }
                }
            %>
        </li>
        <li>
            <label>作者: </label>
            <%
                List<String> authorList = new ArrayList<String>();
                for (int i = 0, j = 0; i < 6; i++, j++) {
                    if (authorList.contains(book_detailList.get(j).getBAuthor())) {
                        i--;
                        continue;
                    } else {
                        authorList.add(book_detailList.get(j).getBAuthor());
            %>
            <input id="<%="bAuthor_"+i%>" type="button"
                   name="condition"
                   value=<%=book_detailList.get(j).getBAuthor()%> data=<%=book_detailList.get(j).getBAuthor()%>>
            <%
                    }
                }
            %>
        </li>
    </ul>
</div>

<div id="books">
    <%
        for (int i = 0; i < 15; i++) {
    %>
    <div id="<%="commodities_" + i%>">
        <input id="<%="pic_"+i%>" type="button" name=<%="pic_"+i%>>
        <div id="<%="productName_"+i%>"></div>
    </div>
    <%
        if ((i + 1) % 3 == 0) {
    %>
    <br/>
    <%
            }
        }
    %>
</div>

<div id="page">
    <input id="firstPage" type="button" name="toPage" value="首页">
    <input id="prePage" type="button" name="toPage" value="上一页">
    <input id="nextPage" type="button" name="toPage" value="下一页">
    <input id="lastPage" type="button" name="toPage" value="尾页">
</div>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>
<script src="https://gitee.com/ishouke/front_end_plugin/blob/master/jquerysession.js"></script>

<script>
    var con = $("input[name='condition']");
    var curPage = $("#curPage");
    var totalRecord = $("#totalRecord");
    var pageSize = Number($("#pageSize").val());
    var totalPage = parseInt((Number(totalRecord.val()) + pageSize - 1) / pageSize);
    var flag = "false";
    var selectedList = [];
    var condition = "redirectPage.do?pageName=<%=pageName%>&pageSize=" + pageSize + "&conLen=" + selectedList.length;
    var conditionLen = condition.length;

    var books = $("#books");
    books.css("position", "absolute");
    books.css("width", "100%");
    books.css("height", "100%");
    books.css("top", "20%");

    for (var i = 0; i < pageSize; i++) {
        var commodities = $("#commodities_" + i);
        var productName = $("#productName_" + i);
        var pic = $("#pic_" + i);

        commodities.css("position", "absolute");
        commodities.css("width", "20%");
        commodities.css("height", "50%");
        commodities.css("left", (10 + 30 * (i % 3)).toString() + "%");
        commodities.css("top", (parseInt((i / 3)) * 50).toString() + "%");

        productName.css("position", "absolute");
        productName.css("width", "100%");
        productName.css("top", "90%");
        productName.css("text-align", "center");

        pic.css("position", "absolute");
        pic.css("width", "100%");
        pic.css("height", "90%");
    }

    $(document).ready(function () {
        condition += ("&curPage=" + curPage.val());
        xmlHttp = new XMLHttpRequest();
        xmlHttp.onreadystatechange = function () {
            if (xmlHttp.readyState === 4) {
                if (xmlHttp.status === 200) {
                    rel = JSON.parse(xmlHttp.responseText);
                    for (var i = 0; i < rel.length; i++) {
                        var pic = $("#pic_" + i);
                        var name = $("#productName_" + i);
                        pic.css("background", "url(webpage/static" + rel[i]["picUrl"] + ")");
                        pic.css("background-size", "100% 100%");
                        name.text("《" + rel[i]["productName"] + "》");
                    }
                }
            }
        }
        xmlHttp.open("GET", condition);
        xmlHttp.send(null);
    })
    $("input[name='toPage']").click(function () {
        if (this.id === "firstPage") {
            curPage.val(1);
        } else if (this.id === "prePage") {
            if (curPage.val() !== "1") {
                curPage.val(Number(curPage.val()) - 1);
            }
        } else if (this.id === "nextPage") {
            if (curPage.val() < totalPage) {
                curPage.val(Number(curPage.val()) + 1);
            }
        } else if (this.id === "lastPage") {
            curPage.val(totalPage);
        }
        condition = condition.substring(0, conditionLen);
        condition += ("&curPage=" + curPage.val());
        console.log(condition);
        xmlHttp = new XMLHttpRequest();
        xmlHttp.onreadystatechange = function () {
            if (xmlHttp.readyState === 4) {
                if (xmlHttp.status === 200) {
                    rel = JSON.parse(xmlHttp.responseText);
                    if (flag === "true" && Number(curPage.val()) !== totalPage) {
                        for (var j = 0; j < pageSize; j++) {
                            $("#pic_" + j).attr("type", "button");
                        }
                        flag = "false";
                    }
                    if (Number(curPage.val()) === totalPage) {
                        flag = "true";
                    }
                    for (var i = 0; i < pageSize; i++) {
                        var e = $("#pic_" + i);
                        if (i < rel.length) {
                            e.css("background", "url(webpage/static" + rel[i]["picUrl"] + ")");
                            e.css("background-size", "100% 100%");
                            $("#productName_" + i).text("《" + rel[i]["productName"] + "》");
                        } else {
                            e.attr("type", "hidden");
                            $("#productName_" + i).text("");
                        }
                    }
                }
            }
        }
        xmlHttp.open("GET", condition);
        xmlHttp.send(null);
    });

    con.hover(function () {
        $(this).addClass("hovered");
    }, function () {
        $(this).removeClass("hovered")
    });

    con.click(function () {
        condition = "redirectPage.do?pageName=<%=pageName%>&pageSize=" + pageSize;
        var lastLen=0;
        var obj = {"id": $(this).attr("id"), "data": $(this).attr("data")}
        var objIndex;
        var res = selectedList.some(item => {
            if (item.id === obj.id) {
                objIndex = selectedList.indexOf(item);
                return true;
            } else
                return false;
        });

        if (!res) {
            $(this).addClass("selected");
            selectedList.push(obj);
        } else {
            $(this).removeClass("selected");
            selectedList = $.grep(selectedList, function (e, n) {
                return n !== objIndex;
            })
        }
        $.each(selectedList, function (n, e) {
            var c = "&condition_" + n + "=" + e.id.substring(0, e.id.length - 1) + e.data;
            condition += c;
        });
        condition += ("&conLen=" + selectedList.length);
        conditionLen = condition.length;
        condition += ("&curPage=1");
        curPage.val(1);
        console.log(condition);

        xmlHttp = new XMLHttpRequest();
        xmlHttp.onreadystatechange = function () {
            if (xmlHttp.readyState === 4) {
                if (xmlHttp.status === 200) {
                    if (xmlHttp.responseText.length == 0) {
                        alert("抱歉，未能查询到您需要的商品信息");
                        for(var i=0;i<pageSize;i++){
                            $("#pic_" + i).attr("type", "hidden");
                            $("#productName_" + i).text("");
                        }
                        flag="true";
                    } else {
                        rel = JSON.parse(xmlHttp.responseText);
                        console.log(rel);
                        totalRecord.val(rel[0]["totalRecord"]);
                        totalPage = parseInt((Number(totalRecord.val()) + pageSize - 1) / pageSize);
                        if (flag === "true" && rel.length >= pageSize) {
                            for (var j = 0; j < pageSize; j++) {
                                $("#pic_" + j).attr("type", "button");
                            }
                            flag = "false";
                        }
                        if (flag === "true" && rel.length >= lastLen) {
                            for (var j = 0; j < pageSize; j++) {
                                $("#pic_" + j).attr("type", "button");
                            }
                        }
                        if (rel.length < pageSize) {
                            flag = "true";
                        }
                        lastLen=rel.length;
                        for (var i = 0; i < pageSize; i++) {
                            var e = $("#pic_" + i);
                            if (i < rel.length) {
                                e.css("background", "url(webpage/static" + rel[i]["picUrl"] + ")");
                                e.css("background-size", "100% 100%");
                                $("#productName_" + i).text("《" + rel[i]["productName"] + "》");
                            } else {
                                e.attr("type", "hidden");
                                $("#productName_" + i).text("");
                            }
                        }
                    }
                }

            }
        }
        xmlHttp.open("GET", condition);
        xmlHttp.send(null);
    });
</script>
</body>
</html>
