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
    <title>修改书籍</title>
</head>
<body>
    <form action="../../book/update" method="post">
    书籍名称： <input type="text" name="bookName" value="${bookInfo.bookName}"> <br/>
    书籍数量： <input type="text" name="bookCounts" value="${bookInfo.bookCounts}"> <br/>
    书籍描述： <input type="text" name="detail" value="${bookInfo.detail}"> <br/>
        <input type="hidden" name="bookID" value="${bookInfo.bookID}">
    <input type="submit" value="添加书籍" />
</form>
</body>
</html>
