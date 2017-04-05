<%--
  Created by IntelliJ IDEA.
  User: wetts
  Date: 16/8/7
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="utf-8" %>
<%@ include file="/WEB-INF/common/taglibs-auth.jsp" %>
<html>
<head>
    <title>Shiro综合案例</title>
</head>
<body>

<iframe name="content" class="ui-layout-center"
        src="${pageContext.request.contextPath}/welcome" frameborder="0" scrolling="auto"></iframe>
<div class="ui-layout-north">欢迎[<shiro:principal/>]学习Shiro综合案例，<a href="${pageContext.request.contextPath}/logout">退出</a></div>
<div class="ui-layout-west">
    功能菜单<br/>
    <c:forEach items="${menus}" var="m">
        <a href="${pageContext.request.contextPath}/${m.url}" target="content">${m.name}</a><br/>
    </c:forEach>

    <shiro:hasPermission name="organization:create">
        organization:create
    </shiro:hasPermission>

    <shiro:hasPermission name="accout:create">
        accout:create
    </shiro:hasPermission>
</div>


</body>
</html>