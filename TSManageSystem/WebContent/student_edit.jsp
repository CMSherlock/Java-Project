<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*,com.sanda.dev.tsm.biz.model.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Details</title>
</head>
<body>
<%
		String basePath = request.getContextPath()+"/";
		Student stu = (Student)request.getAttribute("targetStudent");
	%>
	
	<form action="<%=basePath %>UpdateStudentServlet" method="get">
		<b>请在需要更改的数据下方填入更改后的数据：</b>
		<table border="1" align="center">
		<tr>
			<th>学员编号</th>
			<th>学员姓名</th>
			<th>学员年龄</th>
			<th>学员住址</th>
			<th>学员手机</th>
			<th>学员邮箱</th>
			<th>*修改人工号*</th>
			<th>操&nbsp;&nbsp;作</th>
		</tr>
		<tr>
			<td><%=stu.getStudent_id()%></td>
			<td><%=stu.getStudent_name() %></td>
			<td><%=stu.getStudent_age() %></td>
			<td><%=stu.getStudent_address() %></td>
			<td><%=stu.getStudent_mobile() %></td>
			<td><%=stu.getStudent_email() %></td>
			<td><%=stu.getStudent_updated_name() %></td>
			<td></td>
		</tr>
		<tr>
			<td> <b><%=stu.getStudent_id()%></b> </td>
			<td> <input name="studentName" type="text" dir="rtl"/> </td>
			<td> <input name="studentAge" type="text" dir="rtl"/> </td>
			<td> <input name="studentAddress" type="text" dir="rtl"/> </td>
			<td> <input name="studentMobile" type="text" dir="rtl"/> </td>
			<td> <input name="studentEmail" type="text" dir="rtl"/> </td>
			<td> <input name="studentUpdatedName" type="text" value="1" dir="rtl"/> </td>			<!-- 默认修改人为1 -->
			<td> <input type="submit" value="提交修改"/> </td>
		</tr>
		</table>
		<input name="studentId" type="hidden" value="<%=stu.getStudent_id()%>"/>
		<input name="type" type="hidden" value="submitted" />
		<!-- 以下数据由于(Js不咋熟)时间原因，暂时不予实现 -->		
		<input name="studentUpdatedDate" type="hidden" value="2018-09-27 8:00:00"/>
	</form>
	
	<hr/>
	<button onClick="location.href='index.jsp'" style="margin-left: 90vw;">Back</button>
</body>
</html>