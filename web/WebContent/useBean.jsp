<%@page contentType="text/html;charset=Windows-31J"%>
<!-- webパッケージのEmpBeanクラスを使うよって定義 -->
<jsp:useBean id="emp" scope="request" class="web.EmpBean" />
<html>
<body>
	<h1>UseBean</h1>
	<table border>
		<tr>
			<td>Name</td>
			<!-- リクエストオブジェクトに格納されている
			beanの中のプロパティー名がnameaの値を取得しています -->
			<td><jsp:getProperty name="emp" property="name" /></td>
		</tr>
		<tr>
			<td>Age</td>
			<!-- リクエストオブジェクトに格納されている
			beanの中のプロパティー名がnameaの値を取得しています -->
			<td><jsp:getProperty name="emp" property="age" /></td>
		</tr>
	</table>
</body>
</html>