<%@page contentType="text/html;charset=Windows-31J"%>
<!-- web�p�b�P�[�W��EmpBean�N���X���g������Ē�` -->
<jsp:useBean id="emp" scope="request" class="web.EmpBean" />
<html>
<body>
	<h1>UseBean</h1>
	<table border>
		<tr>
			<td>Name</td>
			<!-- ���N�G�X�g�I�u�W�F�N�g�Ɋi�[����Ă���
			bean�̒��̃v���p�e�B�[����namea�̒l���擾���Ă��܂� -->
			<td><jsp:getProperty name="emp" property="name" /></td>
		</tr>
		<tr>
			<td>Age</td>
			<!-- ���N�G�X�g�I�u�W�F�N�g�Ɋi�[����Ă���
			bean�̒��̃v���p�e�B�[����namea�̒l���擾���Ă��܂� -->
			<td><jsp:getProperty name="emp" property="age" /></td>
		</tr>
	</table>
</body>
</html>