package util;

public class Student extends User {
	private double GPA;
	private int dormNum;
	private String punish;
	private final boolean userType = false;	//й╪жун╙0
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public int getDormNum() {
		return dormNum;
	}
	public void setDormNum(int dormNum) {
		this.dormNum = dormNum;
	}
	public boolean isUserType() {
		return userType;
	}
}
