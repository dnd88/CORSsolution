package woowahan.baemin_waiting.team_six.user;

public interface UserDAO {
	public void signUpUser(UserVO pvo) throws Exception;
	public UserVO login(UserVO pvo) throws Exception;
}
