<%--
  Created by IntelliJ IDEA.
  User: wetts
  Date: 16/8/7
  Time: 08:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="utf-8" %>
<%@ include file="/WEB-INF/common/taglibs-auth.jsp" %>
<html>
<head>
    <title>没有权限</title>
    <style>.error{color:red;}</style>
</head>
<body>

<div class="error">您没有权限[${exception.message}]</div>
</body>
</html>