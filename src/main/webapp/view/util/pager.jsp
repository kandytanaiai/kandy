<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<div id="div_pager">

</div>
<!--
第<input type="text" value="${pager.currPage}" onkeydown="if(event.keyCode==13) submitOut(this.value);">/${pager.pageCount}页
&nbsp;共${pager.recCount}条记录&nbsp;显示第${pager.recIndexStart+1}~${pager.recIndexEnd+1}条<br>
<a href="javascript:submitOut(${pager.firstPage});">首页</a>
<a href="javascript:submitOut(${pager.prePage});">上一页</a>
<a href="javascript:submitOut(${pager.nextPage});">下一页</a>
<a href="javascript:submitOut(${pager.lastPage});">尾页</a>
&nbsp;
<select id="sel_pageSize" name="sel_pageSize" onchange="submitOut(${pager.currPage});">
    <option value="5">5</option>
    <option value="10">10</option>
    <option value="20">20</option>
</select>条/页
-->
<script type="text/javascript">

    function submitOut(currPage) {
        query(currPage, $("#sel_pageSize").val());
    }

    function fillPager(pager) {
        if(pager.recCount < 1) {
            $("#div_pager").html();
            return;
        }
        $("#div_pager").html("第<input id=\"pager_currPage\" type=\"text\" value=\""+pager.currPage+"\" onkeydown=\"if(event.keyCode==13) submitOut(this.value);\">/"+pager.pageCount+"页\n" +
            "&nbsp;共"+pager.recCount+"条记录&nbsp;显示第"+pager.recIndexStart+1+"~"+pager.recIndexEnd+1+"条<br>\n" +
            "<a href=\"javascript:submitOut("+pager.firstPage+");\">首页</a>\n" +
            "<a href=\"javascript:submitOut("+pager.prePage+");\">上一页</a>\n" +
            "<a href=\"javascript:submitOut("+pager.nextPage+");\">下一页</a>\n" +
            "<a href=\"javascript:submitOut("+pager.lastPage+");\">尾页</a>\n" +
            "&nbsp;\n" +
            "<select id=\"sel_pageSize\" name=\"sel_pageSize\" onchange=\"submitOut("+pager.currPage+");\">\n" +
            "    <option value=\"5\">5</option>\n" +
            "    <option value=\"10\">10</option>\n" +
            "    <option value=\"20\">20</option>\n" +
            "</select>条/页");

        $("#sel_pageSize").val(pager.pageSize);
    }

</script>
</body>
</html>
