var domain = "http://localhost:80/";
var request_type_action = "action";
var request_type_static = "static/view";
var model_base = "base";
var url_base_user_selectPager = domain + request_type_action + "/"+ model_base  + "/user/selectPager";
var url_base_user_delete = domain + request_type_action + "/"+ model_base  + "/user/delete";
var url_base_user_edit = domain + request_type_static + "/"+ model_base  + "/user/user_edit.html";
var url_base_user_selectOne = domain + request_type_action + "/"+ model_base  + "/user/selectOne";
var url_base_user_save = domain + request_type_action + "/"+ model_base  + "/user/save";
var url_base_user_noExist = domain + request_type_action + "/"+ model_base  + "/user/noExist";

var url_base_code_selectList = domain + request_type_action + "/"+ model_base  + "/code/selectList";

var model_mall = "mall";
var url_mall_goods_selectPager = domain + request_type_action + "/"+ model_mall  + "/goods/selectPager";
var url_mall_goods_selectUserPager = domain + request_type_action + "/"+ model_mall  + "/goods/selectUserPager";