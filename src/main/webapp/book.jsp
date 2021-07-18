<%@ page import="com.eight.bean.book_detail" %>
<%@ page import="java.util.List" %>
<%@ page import="com.eight.bean.product_pic_info" %>
<%@ page import="com.eight.bean.product_category" %>
<%@ page import="com.eight.bean.product_info" %>
<%@ page import="java.util.ArrayList" %><%--
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
    <%
        List<product_category> book_categoryList = (List<product_category>) session.getAttribute("bookCategoryList");
        List<product_info> book_infoList = (List<product_info>) session.getAttribute("bookInfoList");
        List<book_detail> book_detailList = (List<book_detail>) session.getAttribute("bookDetailList");
        List<product_pic_info> book_picInfoList = (List<product_pic_info>) session.getAttribute("bookPicInfoList");
    %>
    <style>
        li > input { /*去除input的默认样式*/
            background: none;
            outline: none;
            border: none;
        }

        <%
        for(int i=0;i<book_infoList.size();i++){
        %>
        #books > div[id="<%="commodities_"+book_infoList.get(i).getProduct_id()%>"] {
            position: absolute;
            width: 20%;
            height: 40%;
            left: <%=(int)(10+30*(i%3))%>%;
            top: <%=(int)(20+(i/3)*50)%>%;
        }

        div[id="<%="commodities_"+book_infoList.get(i).getProduct_id()%>"] > input[name="<%=book_infoList.get(i).getProduct_id()%>"] {
            position: absolute;
            width: 100%;
            height: 90%;
            background: url(<%=book_picInfoList.get(i).getPic_url()%>);
            background-size: 100% 100%;
        }

        div[id="<%="commodities_"+book_infoList.get(i).getProduct_id()%>"] > div[name="<%="descript_"+book_infoList.get(i).getProduct_id()%>"] {
            position: absolute;
            width: 100%;
            top: 90%;
            text-align: center;
        }

        <%
        }
        %>

    </style>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>
    <script>

    </script>
</head>
<body>
<h2>Book</h2>

<div id="variety">
    <ul>
        <li>
            <label>类型: </label>
            <%
                for (int i = 0; i < book_categoryList.size(); i++) {
            %>
            <input type="button"
                   name=<%=book_categoryList.get(i).getCategory_id()%> value=<%=book_categoryList.get(i).getCategory_name()%>>
            <%
                }
            %>
        </li>
        <li>
            <label>出版社:</label>
            <%
                List<String> publisherList = new ArrayList<String>();
                for (int i = 0, j = 0; i < 6; i++, j++) {
                    if (publisherList.contains(book_detailList.get(j).getB_publisher())) {
                        i--;
                        continue;
                    } else {
                        publisherList.add(book_detailList.get(j).getB_publisher());
            %>
            <input type="button"
                   name=<%=book_detailList.get(j).getB_publisher()%> value=<%=book_detailList.get(j).getB_publisher()%>>
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
                    if (authorList.contains(book_detailList.get(j).getB_author())) {
                        i--;
                        continue;
                    } else {
                        authorList.add(book_detailList.get(j).getB_author());
            %>
            <input type="button"
                   name=<%=book_detailList.get(j).getB_author()%> value=<%=book_detailList.get(j).getB_author()%>>
            <%
                    }
                }
            %>
        </li>
    </ul>
</div>

<div id="books">
    <%
        for (int i = 0; i < book_infoList.size(); i++) {
    %>
    <div id=<%="commodities_" + book_infoList.get(i).getProduct_id()%>>
        <input type="button" name=<%=book_infoList.get(i).getProduct_id()%>>
        <div name=<%="descript_" + book_infoList.get(i).getProduct_id()%>><%="《" + book_infoList.get(i).getProduct_name() + "》"%>
        </div>
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
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
    $(function () {
        $("input").click(function () {
            console.log("this.name:" + this.name);
        })
    })
</script>
</body>
</html>
