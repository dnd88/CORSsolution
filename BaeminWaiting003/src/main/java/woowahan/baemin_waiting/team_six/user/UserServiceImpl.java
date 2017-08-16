package woowahan.baemin_waiting.team_six.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;

	@Override
	public void signUpUser(UserVO pvo) throws Exception {
		userDAO.signUpUser(pvo);
	}

	@Override
	public UserVO login(UserVO pvo) throws Exception {		
		return userDAO.login(pvo);
	}
	
	
	
}
