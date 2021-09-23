<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhuxiuwei
  Date: 2021/9/23
  Time: 1:38 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>
</head>
<body>
    <h1>books</h1>
    <table border="1">
        <tr>
            <td>ID</td>
            <td>书名</td>
            <td>数量</td>
            <td>描述</td>
            <td>操作</td>
        </tr>
        <c:forEach var="book" items="${books}">
            <tr>
                <td>${book.bookID}</td>
                <td>${book.bookName}</td>
                <td>${book.bookCounts}</td>
                <td>${book.detail}</td>
                <td>
                    <a href="delete/${book.bookID}">删除</a>
                    <a href="modifyPage/${book.bookID}">修改</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <br/>

    <a href="toAddBookPage">添加书籍</a>
</body>
</html>
