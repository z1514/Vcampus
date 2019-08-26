package vo;

import java.io.Serializable;

//一类商品，商店初始化时从服务端发向客户端Arraylist<Product>
public class Product implements Serializable {
	private String productName;
	private double productPrice;
	private int stockNum;
//	private byte[] image;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getStockNum() {
		return stockNum;
	}
	public void setStockNum(int stockNum) {
		this.stockNum = stockNum;
	}
	
	
}
