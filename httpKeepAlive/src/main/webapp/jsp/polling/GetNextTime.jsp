<%--
  Created by IntelliJ IDEA.
  User: wtts
  Date: 2016/7/21
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/WEB-INF/common/taglibs.jsp" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>jQuery 1.5 with long poll</title>
</head>
<body>
<div id="tip"></div>
<script type="text/javascript" src="${plugin}/jQuery/jquery-2.2.3.min.js"></script>
<script type="text/javascript">
    $(function (){
        function log(resp){
            $("#tip").html("<b>" + resp + "</b>");
        }

        log("loading");

        // 去除缓存
        $.ajaxSetup({ cache: false });

        function initGet(){
            $.get("/getNextTime")
                    .success(function(resp){
                        log(resp);
                    }).error(function(){
                log("ERROR!");
            }).done(initGet);
        }

        initGet();
    });
</script>
</body>
</html>
