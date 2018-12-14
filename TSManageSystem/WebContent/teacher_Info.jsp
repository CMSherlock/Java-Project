<%@ page language="java" import="java.util.*,com.sanda.dev.tsm.biz.model.*" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Teachers Information</title>
</head>
<body>
	
	<%
		String basePath = request.getContextPath()+"/";
		Teacher tea = (Teacher)request.getAttribute("targetTeacher");
		if(tea.getTeacher_id() == 0){
	%>
			<script type="text/javascript" language="javascript">
				alert("暂无此人员记录！");                                            // 弹出错误信息
				window.location='index.jsp';
			</script>			
	<%	
		}
	%>
	<b>教师信息如下：</b>
	<table border="1" align="center">
		<tr>
			<th>教师编号</th>
			<th>教师姓名</th>
			<th>教师年龄</th>
			<th>教师住址</th>
			<th>教师手机</th>
			<th>创建时间</th>
			<th>创建人工号</th>
			<th>操&nbsp;&nbsp;作</th>
		</tr>
	
		<tr>
			<td><%=tea.getTeacher_id()%></td>
			<td><%=tea.getTeacher_name() %></td>
			<td><%=tea.getTeacher_age() %></td>
			<td><%=tea.getTeacher_address() %></td>
			<td><%=tea.getTeacher_mobile() %></td>
			<td><%=tea.getTeacher_created_date() %></td>
			<td><%=tea.getTeacher_created_name() %></td>
			<td><a href="<%=basePath %>DeleteTeacherServlet?teacherId=<%=tea.getTeacher_id()%>">删除</a>|
			<a href="<%=basePath %>UpdateTeacherServlet?teacherId=<%=tea.getTeacher_id()%>">编辑</a>
		</tr>
	</table>
	
	<hr/>
	<button onClick="location.href='index.jsp'" style="margin-left: 90vw;">Back</button>
	
</body>
</html>