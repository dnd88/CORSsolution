package woowahan.baemin_waiting.team_six.user;

public class UserVO {
	private String userId;
	private String userPassword;
	private String userName;
	private String userPhoneNumber;
	private String userRole;
	
	public UserVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserVO(String userId, String userPassword, String userName, String userPhoneNumber, String userRole) {
		super();
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userPhoneNumber = userPhoneNumber;
		this.userRole = userRole;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", userPassword=" + userPassword + ", userName=" + userName
				+ ", userPhoneNumber=" + userPhoneNumber + ", userRole=" + userRole + "]";
	}
	
	
	
	
	
}
