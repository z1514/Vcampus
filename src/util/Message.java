package util;

import java.io.Serializable;

import org.omg.PortableInterceptor.USER_EXCEPTION;

public class Message implements Serializable {
	private boolean userType;
	private int userId;
	private Object data;
	private String messageType;
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public boolean isUserType() {
		return userType;
	}
	public void setUserType(boolean userType) {
		this.userType = userType;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
