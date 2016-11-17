<%--
  Created by IntelliJ IDEA.
  User: neo
  Date: 17/11/16
  Time: 7:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.sql.*"%>
<%
    String user = null;
    String message = request.getParameter("message");

    Cookie[] cookies = request.getCookies();
    if(cookies!=null)
    {
        for (int i=0; i<cookies.length; i++)
        {
            Cookie ck = cookies[i];
            String name = ck.getName();
            if (name.equals("username"))
                user = ck.getValue();
            if (name.equals("message"))
                message = ck.getValue();
        }
    }


    if(!message.equals(""))
    {
    try {

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/IM", "root", "root");
        Statement stmt = conn.createStatement();
        int rs = stmt.executeUpdate("INSERT INTO inbox (username, message) values ('"+user+"','"+message+"')");

        if(rs == 1);
        else
        {
            %>
                <script type="text/javascript">
                    alert("Could not send the message... Please try again");
                </script>
            <%
        }

    }
    catch (Exception e)
    {
            %>
                <script type="text/javascript">
                    alert(<% out.print(e); %>);
                </script>
            <%
    }
    }
    else
    {
        %>
            <script type="text/javascript">
                   alert("Could send the message... Please try again");
            </script>
        <%
    }
%>
