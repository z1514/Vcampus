package vo;

import java.io.Serializable;

//在客户端先判断余额是否足够，
public class Purchase implements Serializable {
	private String productName;
	private int userId;	//购买人
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	private int num;	//购买数量
}
