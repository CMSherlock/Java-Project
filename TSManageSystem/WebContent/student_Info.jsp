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
		if(stu.getStudent_id() == 0){
%>
		<script type="text/javascript" language="javascript">
			alert("暂无此人员记录！");                                            // 弹出错误信息
			window.location='index.jsp';
		</script>			
<%	
		}
	%>
	<b>学生信息如下：</b>
	<table border="1" align="center">
		<tr>
			<th>学员编号</th>
			<th>学员姓名</th>
			<th>学员年龄</th>
			<th>学员住址</th>
			<th>学员手机</th>
			<th>创建时间</th>
			<th>创建人工号</th>
			<th>操&nbsp;&nbsp;作</th>
		</tr>
	
		<tr>
			<td><%=stu.getStudent_id()%></td>
			<td><%=stu.getStudent_name() %></td>
			<td><%=stu.getStudent_age() %></td>
			<td><%=stu.getStudent_address() %></td>
			<td><%=stu.getStudent_mobile() %></td>
			<td><%=stu.getStudent_created_date() %></td>
			<td><%=stu.getStudent_created_name() %></td>
			<td><a href="<%=basePath %>DeleteStudentServlet?studentId=<%=stu.getStudent_id()%>">删除</a>|
			<a href="<%=basePath %>UpdateStudentServlet?studentId=<%=stu.getStudent_id()%>">编辑</a>
		</tr>
	</table>
	<hr/>
	<button onClick="location.href='index.jsp'" style="margin-left: 90vw;">Back</button>
</body>
</html>