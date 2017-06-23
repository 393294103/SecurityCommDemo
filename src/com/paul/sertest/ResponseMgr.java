package com.paul.sertest;

import com.paul.sertest.config.Constant;
import com.paul.sertest.model.CommonResult;
import com.paul.sertest.utils.GsonUtil;

public class ResponseMgr {
	
	/**
	 * ���󷵻����ݴ���
	 * @param commonResult
	 * @return
	 */
	public static String general(CommonResult commonResult) {
		return GsonUtil.objectToJsonStr(commonResult);
	}
	
	/**
	 * �ɹ����󲻴�����
	 * @return
	 */
	public static String success() {
		CommonResult commonResult = new CommonResult(Constant.RESCODE_SUCCESS, "success");
		return general(commonResult);
	}
	
	/**
	 * �ɹ��������������
	 * @param data
	 * @return
	 */
	public static String successWithData(Object data) {
		CommonResult commonResult = new CommonResult(Constant.RESCODE_SUCCESS_MSG, data, "success");
		return general(commonResult);
	}
	
	/**
	 * �������쳣��������
	 * @return
	 */
	public static String err() {
		CommonResult commonResult = new CommonResult(Constant.RESCODE_EXCEPTION, "���Ժ�����");
		return general(commonResult);
	}

	/**
	 * �������쳣������
	 * @param data
	 * @return
	 */
	public static String errWhitData(Object data) {
		CommonResult commonResult = new CommonResult(Constant.RESCODE_EXCEPTION_MSG, data, "���Ժ�����");
		return general(commonResult);
	}
	
	/**
	 * �������쳣�����ݺ���Ϣ
	 * @param data
	 * @return
	 */
	public static String errWhitData(String msg, Object data) {
		CommonResult commonResult = new CommonResult(Constant.RESCODE_EXCEPTION_MSG, data, msg);
		return general(commonResult);
	}
	
	/**
	 * �û�δ��¼
	 * @return
	 */
	public static String noLogin() {
		CommonResult commonResult = new CommonResult(Constant.RESCODE_NOLOGIN, "�û�δ��¼");
		return general(commonResult);
	}
	
	/**
	 * ���Ϊ��
	 * @return
	 */
	public static String noExist() {
		CommonResult commonResult = new CommonResult(Constant.RESCODE_NOEXIST, "���Ϊ��");
		return general(commonResult);
	}
	
	/**
	 * �޲���Ȩ��
	 * @return
	 */
	public static String noAuth() {
		CommonResult commonResult = new CommonResult(Constant.RESCODE_NOAUTH, "�ܾ���Ȩ");
		return general(commonResult);
	}
}
