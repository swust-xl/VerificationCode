package cn.signit.pojo.vo;

import cn.signit.pojo.vo.getuser.commonresponse.VoGetUserCommonResp;

/**
 * 请求正常响应体
 * 
 * @author xuLiang
 * @since 1.0.0
 */
public class GetUserCommonResp {
	private int code;
	private String message;
	private String sessionKey;
	private VoGetUserCommonResp data;

	public GetUserCommonResp(int code, String message, String sessionKey, VoGetUserCommonResp data) {
		super();
		this.code = code;
		this.message = message;
		this.setSessionKey(sessionKey);
		this.data = data;
	}

	public GetUserCommonResp() {

	}

	@Override
	public String toString() {
		return "GetUserCommonResp [code=" + code + ", message=" + message + ", data=" + data + "]";
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public VoGetUserCommonResp getData() {
		return data;
	}

	public void setData(VoGetUserCommonResp data) {
		this.data = data;
	}

	public String getSessionKey() {
		return sessionKey;
	}

	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}

}