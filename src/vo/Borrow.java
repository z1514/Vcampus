package vo;

import java.io.Serializable;

public class Borrow implements Serializable {
	private String bookName;
	private int id;
	private boolean userType;
	//客户端先判断，如果用户借书量超上限，则直接在客户端拒绝请求；发送给服务端则说明借阅操作是合法的，服务端不再判断
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isUserType() {
		return userType;
	}
	public void setUserType(boolean userType) {
		this.userType = userType;
	}

}
