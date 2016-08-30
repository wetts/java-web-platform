<%--
  Created by IntelliJ IDEA.
  User: linger
  Date: 2016/7/21
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/WEB-INF/common/taglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Testing websockets</title>
    <script type="text/javascript" src="${plugin}/jQuery/jquery-2.2.3.min.js"></script>
</head>
<body>
<div>
    <input type="text" id="t" />
    <input type="button" value="Start" onclick="javascript: webSocket.send($('#t').val());"/>
</div>
<div id="messages"></div>
<script type="text/javascript">
    var relationId = 913;
    var userCode = 117;

    var webSocket = null;
    var tryTime = 0;
    $(function () {
        initSocket();

        window.onbeforeunload = function () {
        //离开页面时的其他操作
        };
    });

    /**
     * 初始化websocket，建立连接
     */
    function initSocket() {
        if (!window.WebSocket) {
            alert("您的浏览器不支持websocket！");
            return false;
        }

        webSocket = new WebSocket("ws://" + window.location.host + "/websocket.ws/" + relationId + "/" + userCode);

        // 收到服务端消息
        webSocket.onmessage = function (msg) {
            console.log(msg);
        };

        // 异常
        webSocket.onerror = function (event) {
            console.log(event);
        };

        // 建立连接
        webSocket.onopen = function (event) {
            console.log(event);
        };

        // 断线重连
        webSocket.onclose = function () {
            // 重试10次，每次之间间隔10秒
            if (tryTime < 10) {
                setTimeout(function () {
                    webSocket = null;
                    tryTime++;
                    initSocket();
                }, 500);
            } else {
                tryTime = 0;
            }
        };

    }
</script>
</body>
</html>
