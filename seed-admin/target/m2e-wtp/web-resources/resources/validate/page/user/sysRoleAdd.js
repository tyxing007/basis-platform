
$(function() {
	formValidate();// 字段校验
});

function formValidate() {
	$('#formId').validator({
		// 是否在验证出错时停止继续验证，默认不停止false
		stopOnError : true,
		// msgClass : "n-bottom",
		messages : {
			required : "{0}不能为空"
		},
		// 验证规则
		rules : {
		},
		// 验证
		fields : {
			 
			'roleName' : {
				rule : '角色名称:required;'
			 
			},
			'description' : {
				rule : '角色描述:required;'
			 
			}
		}
	});
}
