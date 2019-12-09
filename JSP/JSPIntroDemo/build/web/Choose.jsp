<%-- 
    Document   : Choose
    Created on : Dec 3, 2019, 2:38:16 PM
    Author     : Selam Ghide
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method='post' action='ChooseServlet'>
            <p>Is JSP cool?</p>
            <% %>
            <input type='radio' value='1' name='radioJSPCool' ${radioJSPCooly} ><span>Yes</span><br/>
            <input type='radio' value='0' name='radioJSPCool'${radioJSPCooln} ><span>No</span><br/>
            <input type='submit' name='btnSubmit' value='Submit'/>
            
            
            <p>Is JSF way cool?</p>
            <input type='radio' value='1' name='JSFwayCool' ${JSFwayCooly} ><span>Yes</span><br/>
            <input type='radio' value='0' name='JSFwayCool' ${JSFwayCooln}><span>No</span><br/>
            <input type='submit' name='btnSubmit' value='Submit'/>
            <p>Is the moon made of cheese?</p>
            <input type='radio' value='1' name='moonCheese' ${moonCheesey}><span>Yes</span><br/>
            <input type='radio' value='0' name='moonCheese' ${moonChesen} ><span>No</span><br/>
            <input type='submit' name='btnSubmit' value='Submit'/>
        </form>
    </body>
</html>
