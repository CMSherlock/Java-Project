<%@ page language="java" import="java.util.*,com.sanda.dev.tsm.biz.model.*" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="<%=request.getContextPath()%>/jQuery/jquery-3.3.1.min.js"> </script>
<link href="<%=request.getContextPath()%>/css/table.css" rel="stylesheet"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Teachers Information</title>
<style type="text/css">
	body{
		background-image: url(<%=request.getContextPath()%>/img/Background.jpg);
	}
</style>
</head>
<body>
	
	<%
		String basePath = request.getContextPath()+"/";
		List<Teacher> lists = (ArrayList<Teacher>)request.getAttribute("allTeachers");
		
		if(lists.size() == 0){ 
	%>
			<script type="text/javascript" language="javascript">
				alert("暂无人员记录！");                                            // 弹出错误信息
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
			<th><input type="button" class="RevertAll" value="全选/反选" onclick="revertAll()"/></th>
		</tr>
	<%
		Iterator<Teacher> its = lists.iterator();
		Teacher tea = null;
		while(its.hasNext()){
		tea = new Teacher();
		tea = its.next();
	%>
	
		<tr>
			<td><%=tea.getTeacher_id()%></td>
			<td><%=tea.getTeacher_name() %></td>
			<td><%=tea.getTeacher_age() %></td>
			<td><%=tea.getTeacher_address() %></td>
			<td><%=tea.getTeacher_mobile() %></td>
			<td><%=tea.getTeacher_created_date() %></td>
			<td><%=tea.getTeacher_created_name() %></td>
			<td><a href="<%=basePath %>DeleteTeacherServlet?teacherLists=<%=tea.getTeacher_id()%>"><button>删除</button></a> |
			<a href="<%=basePath %>UpdateTeacherServlet?teacherId=<%=tea.getTeacher_id()%>"><button>编辑</button></a></td>
			<td><input type="checkbox" class="CheckBox" value="<%=tea.getTeacher_id()%>"/></td>
		</tr>
	
	<%
	}
	%>
	<tr class="BorderZero">
		<td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
		<td>
			<button onClick="deleteAll()">删除选中</button>
		</td>
	</tr>
	</table>
	<hr/>
	<button onClick="location.href='index.jsp'" style="float:right;">Back</button>
	
	
<script>
	var arrayObj = new Array();

	function deleteAll(){
		
		var arrayObjTmp = $(".CheckBox");

		for(var i=0;i<arrayObjTmp.length;i++){
			if(arrayObjTmp[i].checked){
				arrayObj.push(arrayObjTmp[i].value);
			}
		}
		
		if(arrayObj.length == 0){
			alert("当前未选中任何元素！");
			return;
		}
		location.href = "DeleteTeacherServlet?teacherLists="+ arrayObj;
	}
	
	function revertAll(){
		
		var CheckBoxList = $(".CheckBox");
		var isAllChecked = true;

		for(var i=0;i<CheckBoxList.length;i++){
			if(!CheckBoxList[i].checked){				//只要有一个没有被选，就全选
				isAllChecked = false;
				break;
			}
		}
		
		if(isAllChecked){
			for(var i=0;i<CheckBoxList.length;i++){
				CheckBoxList[i].checked = false;
			}
		}else{
			
			for(var i=0;i<CheckBoxList.length;i++){
				CheckBoxList[i].checked = true;
			}
		}
		
		
	}
</script>
</body>
</html>