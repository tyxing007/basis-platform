
$(function() {
	formValidate();// 字段校验
});

function formValidate() {
	$('#formId').validator({
		// 是否在验证出错时停止继续验证，默认不停止false
		stopOnError : true,
		
		// msgClass : "n-bottom",
		messages : {
			required : "{0}不能为空",
			uniquenessRegion : "重复区域",
			mobileRepeat : "此手机号已经存在"
		},
		// 验证规则
		rules : {
			moblie:[/^(0|86|17951)?(13[0-9]|15[012356789]|17[678]|18[0-9]|14[57])[0-9]{8}$/,'请输入正确手机号'],
			number:[/^[0-9]+(.[0-9]{0,2})?$/,'请输入数字'],
			telephone:[/(^(\d{2,4}[-_－—]?)?\d{3,8}([-_－—]?\d{3,8})?([-_－—]?\d{1,7})?$)|(^0?1[35]\d{9}$)/,'请输入正确座机号'],
			idCard:[/(^(\d{2,4}[-_－—]?)?\d{3,8}([-_－—]?\d{3,8})?([-_－—]?\d{1,7})?$)|(^0?1[35]\d{9}$)/,'请输入正确身份证号'],
			uniquenessRegion:function(el, param, field){
				var status = true;
				$('select[name^=serviceDistincts]').each(function(index,element){
					if(element.name!=el.name){
						var serviceDistinctsVal_element = $(element).find("option:selected").val();
						var serviceDistinctsVal_el = $(el).find("option:selected").val();
						if(serviceDistinctsVal_element==serviceDistinctsVal_el){
							status = false;
							return false;
						}
					}
				});
				return status;
			},
			mobileRepeat:function(el, param, field){
				return validateMobileRepeat(el.value);
			}
		},
		// 验证
		fields : {
			 
			'name' : {
				rule : '姓名:required;'
			},
			'userMobile' : {
				rule : '手机号:required;moblie;mobileRepeat;'
			},
			'addressDetail' : {
				rule : '所在区域:required;'
			},
			'address' : {
				rule : '所在区域:required;'
			},
			'telephone' : {
				rule : '电话号码:required;telephone;'
			},
			'idCard':{
				rule : '身份证:required;idCard;'
			},
			'workYear':{
				rule : '工作年限:required;number;'
			},
			'localCroplandArea':{
				rule : '本地农地:required;number;'
			}
		}
	});
}
