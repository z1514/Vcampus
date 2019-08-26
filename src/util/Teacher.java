package util;

public class Teacher extends User{
	private String title;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isUserType() {
		return userType;
	}
	private final boolean userType = true;
}
