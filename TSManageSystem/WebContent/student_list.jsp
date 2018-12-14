<%@ page language="java" import="java.util.*,com.sanda.dev.tsm.biz.model.*" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="<%=request.getContextPath()%>/jQuery/jquery-3.3.1.min.js"> </script>
<link href="<%=request.getContextPath()%>/css/table.css" rel="stylesheet"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Students Information</title>
<style type="text/css">
	body{
		background-image: url(<%=request.getContextPath()%>/img/Background.jpg);
	}
</style>
</head>
<body>
	
	<%
		String basePath = request.getContextPath()+"/";
		List<Student> lists = (ArrayList<Student>)request.getAttribute("allStudents");

		if(lists.size() == 0){ 
	%>
		<script type="text/javascript" language="javascript">
			alert("暂无人员记录！");                                            // 弹出错误信息
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
			<th><input type="button" class="RevertAll" value="全选/反选" onclick="revertAll()"/></th>
		</tr>
	<%
		Iterator<Student> its = lists.iterator();
		Student stu = null;
		Integer i = 0;
		while(its.hasNext()){
		stu = new Student();
		stu = its.next();
		i++;
	%>
	
		<tr>
			<td><%=stu.getStudent_id() %></td>
			<td><%=stu.getStudent_name() %></td>
			<td><%=stu.getStudent_age() %></td>
			<td><%=stu.getStudent_address() %></td>
			<td><%=stu.getStudent_mobile() %></td>
			<td><%=stu.getStudent_created_date() %></td>
			<td><%=stu.getStudent_created_name() %></td>
			<td><a href="<%=basePath %>DeleteStudentServlet?studentLists=<%=stu.getStudent_id()%>"><button>删除</button></a> |
			<a href="<%=basePath %>UpdateStudentServlet?studentId=<%=stu.getStudent_id()%>"><button>编辑</button></a></td>
			<td><input type="checkbox" class="CheckBox" value="<%=stu.getStudent_id()%>"/></td>
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
		location.href = "DeleteStudentServlet?studentLists="+ arrayObj;
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