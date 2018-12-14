<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<%=request.getContextPath()%>/css/table.css" rel="stylesheet"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>教师学员管理系统 </title>
<style type="text/css">
	.showAll a{
		text-decoration: none;
	}
	body{
		text-align: center;
		background-image: url(<%=request.getContextPath()%>/img/Background.jpg);
	}
</style>
</head>
<body>
	<%String basePath = request.getContextPath()+"/";%>
	
	<br/>
	<div class="showAll">
			<b>所有人员信息查询：</b>
			<button onClick="location.href='<%=basePath %>ShowStudentServlet?type=ALL'">展示所有的学员</button>
			<button onClick="location.href='<%=basePath %>ShowTeacherServlet?type=ALL'">展示所有的教师</button>
		</div>
		
		<hr/>
		
		<div class="showOne">
			<b>单个人员信息查询</b>
			<form action="<%=basePath %>ShowStudentServlet" method="get">
				<b>输入学号以查询学生信息：</b>
				<input name="studentId" type="text" />
				<input type="hidden" name="type" value="SINGLE">
				<input type="submit" value="查询" />
			</form>
			<form action="<%=basePath %>ShowTeacherServlet" method="get">
				<b>输入教师ID以查询信息：&nbsp;&nbsp;&nbsp;&nbsp;</b>
				<input name="teacherId" type="text" />
				<input type="hidden" name="type" value="SINGLE">
				<input type="submit" value="查询" />
			</form>
		</div>
		
		<hr/>
		
		<div class="addNewInfo">
			<form action="<%=basePath %>AddStudentServlet" method="get">
			
				<b>添加学生信息</b>
				<table border="1" align="center">
				<tr>
					<th>学员编号</th>
					<th>学员姓名</th>
					<th>学员年龄</th>
					<th>学员住址</th>
					<th>学员手机</th>
					<th>学员邮箱</th>
					<th>创建人工号</th>
				</tr>
				<tr>
					<td> <input name="studentId" type="text" dir="rtl"/> </td>
					<td> <input name="studentName" type="text" dir="rtl"/> </td>
					<td> <input name="studentAge" type="text" dir="rtl"/> </td>
					<td> <input name="studentAddress" type="text" dir="rtl"/> </td>
					<td> <input name="studentMobile" type="text" dir="rtl"/> </td>
					<td> <input name="studentEmail" type="text" dir="rtl"/> </td>
					<td> <input name="studentCreatedName" type="text" dir="rtl"/> </td>
				</tr>
				<tr class="BorderZero">
					<td></td><td></td><td></td><td></td><td></td><td></td>
					<td>
						<input type="submit" value="提交" />
					</td>
				</tr>
				</table>
				<!-- 以下数据由于(Js不咋熟)时间原因，暂时不予实现 -->
				<input name="studentCreatedDate" type="hidden" value="2018-09-27 8:00:00"/>			
				<input name="studentUpdateDate" type="hidden" value="2018-09-27 8:00:00"/>
				<input name="studentUpdateName" type="hidden" value="2"/>
			</form>
			
			<form action="<%=basePath %>AddTeacherServlet" method="get">
			
				<b>添加教师信息</b>
				<table border="1" align="center">
				<tr>
					<th>教师编号</th>
					<th>教师姓名</th>
					<th>教师年龄</th>
					<th>教师住址</th>
					<th>教师手机</th>
					<th>教师邮箱</th>
					<th>创建人工号</th>
				</tr>
				<tr>
					<td> <input name="teacherId" type="text" dir="rtl"/> </td>
					<td> <input name="teacherName" type="text" dir="rtl"/> </td>
					<td> <input name="teacherAge" type="text" dir="rtl"/> </td>
					<td> <input name="teacherAddress" type="text" dir="rtl"/> </td>
					<td> <input name="teacherMobile" type="text" dir="rtl"/> </td>
					<td> <input name="teacherEmail" type="text" dir="rtl"/> </td>
					<td> <input name="teacherCreatedName" type="text" dir="rtl"/> </td>
				</tr>
				<tr class="BorderZero">
					<td></td><td></td><td></td><td></td><td></td><td></td>
					<td>
						<input type="submit" value="提交" />
					</td>
				</tr>
				</table>
				<!-- 以下数据由于(Js不咋熟)时间原因，暂时不予实现 -->
				<input name="teacherCreatedDate" type="hidden" value="2018-09-27 8:00:00"/>			
				<input name="teacherUpdateDate" type="hidden" value="2018-09-27 8:00:00"/>
				<input name="teacherUpdateName" type="hidden" value="2"/>
			</form>
		</div>
		
	<br/>
</body>
</html>