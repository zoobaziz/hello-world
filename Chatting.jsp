<%--
  Created by IntelliJ IDEA.
  User: neo
  Date: 13/11/16
  Time: 6:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
    import="java.sql.*"
%>
<%@ page import="static java.lang.System.out" %>
<%! String user;%>
<%
        user = null;
        Cookie[] cookie= request.getCookies();
        if(cookie!=null)
        {
            for (int i=0;i<cookie.length; i++)
            {
                Cookie ck = cookie[i];
                String name = ck.getName();
                if (name.equals("username"))
                    user = ck.getValue();
            }
        }
%>
<html>
<head>
    <title>Chats</title>
    <link rel="stylesheet" href="styles.css">
    <script type="text/javascript">

        function submit() {
            var r = new XMLHttpRequest();
            var msg = null;
            r.onreadystatechange = function()
            {
                if(r.readyState == 4 && r.status == 200)
                {
                    msg = document.getElementById("msgs").value;
                }
            }
            r.open('POST', 'submit.jsp?message='+msg, true);
            r.send(null);
        }
        function disp() {
            var req = new XMLHttpRequest();
            req.onreadystatechange = function () {
                if(req.readyState == 4 && req.status == 200)
                {
                    document.getElementById("users").innerHTML = req.responseText;
                }
            }
            req.open('GET', 'disp_users.jsp',true);
            req.send();

            var req1 = new XMLHttpRequest();
            req1.onreadystatechange = function () {
                if (req1.readyState == 4 && req1.status == 200)
                {
                    document.getElementById("messages").innerHTML = req1.responseText;
                }
            }
            req1.open('GET', 'disp_msgs.jsp', true);
            req1.send();
        }
      setInterval(function () { disp() }, 1000);

    </script>
</head>
<body onload="disp();">
<div id="container">
<table>
    <tr>
        <th>MESSAGES</th>
        <th>USERS</th>
    </tr>
    <tr>

        <td id="logged_users">
            <div id="chat_box">
            <div id="messages"></div>
            </div>
        </td>

        <td id="msg">
            <div id="user_box">
            <div id="users"></div>
            </div>
        </td>
    </tr>
</table>
    <form action="" method="post">
        <input type="text" id="msgs" placeholder="Enter Your Message Here"/><br><br>
        <button type="submit" name="send" onclick="submit()">SEND MESSAGE</button>
    </form>
    </div>
</body>
</html>
