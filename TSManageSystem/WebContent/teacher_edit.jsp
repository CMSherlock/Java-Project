<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*,com.sanda.dev.tsm.biz.model.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Teacher Details</title>
</head>
<body>
<%
		String basePath = request.getContextPath()+"/";
		Teacher tea = (Teacher)request.getAttribute("targetTeacher");
	%>

	<form action="<%=basePath %>UpdateTeacherServlet" method="get">
	<b>请在需要更改的数据下方填入更改后的数据：</b>
		<table border="1" align="center">
		<tr>
			<th>教师编号</th>
			<th>教师姓名</th>
			<th>教师年龄</th>
			<th>教师住址</th>
			<th>教师手机</th>
			<th>教师邮箱</th>
			<th>*修改人工号*</th>
			<th>操&nbsp;&nbsp;作</th>
		</tr>
		<tr>
			<td><%=tea.getTeacher_id()%></td>
			<td><%=tea.getTeacher_name() %></td>
			<td><%=tea.getTeacher_age() %></td>
			<td><%=tea.getTeacher_address() %></td>
			<td><%=tea.getTeacher_mobile() %></td>
			<td><%=tea.getTeacher_email() %></td>
			<td><%=tea.getTeacher_updated_name() %></td>
			<td></td>
		</tr>
		<tr>
			<td> <b><%=tea.getTeacher_id()%></b> </td>
			<td> <input name="teacherName" type="text" dir="rtl"/> </td>
			<td> <input name="teacherAge" type="text" dir="rtl"/> </td>
			<td> <input name="teacherAddress" type="text" dir="rtl"/> </td>
			<td> <input name="teacherMobile" type="text" dir="rtl"/> </td>
			<td> <input name="teacherEmail" type="text" dir="rtl"/> </td>
			<td> <input name="teacherUpdatedName" type="text" value="1" dir="rtl"/> </td>			<!-- 默认修改人为1 -->
			<td> <input type="submit" value="提交修改"/> </td>
		</tr>
		</table>
		<input name="teacherId" type="hidden" value="<%=tea.getTeacher_id()%>"/>
		<input name="type" type="hidden" value="submitted" />
		<!-- 以下数据由于(Js不咋熟)时间原因，暂时不予实现 -->		
		<input name="teacherUpdatedDate" type="hidden" value="2018-09-27 8:00:00"/>
	</form>
	
	<hr/>
	<button onClick="location.href='index.jsp'" style="margin-left: 90vw;">Back</button>
</body>
</html>