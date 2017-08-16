package woowahan.baemin_waiting.team_six.user;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO{

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public void signUpUser(UserVO pvo) throws Exception {
		sqlSession.insert("User.signUpUser", pvo);
		
	}

	@Override
	public UserVO login(UserVO pvo) throws Exception {		
		return sqlSession.selectOne("User.login", pvo);
	}
	
	
}
