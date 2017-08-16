package woowahan.baemin_waiting.team_six.proto;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProtoDAOImpl implements ProtoDAO {
	@Autowired
	private SqlSessionTemplate sqlSession;

	
	
	@Override
	public void insertTest(ProtoVO pvo) throws Exception {
		sqlSession.insert("Proto.insertTest", pvo);
	}	

	@Override
	public ProtoVO selectTest(ProtoVO pvo) throws Exception {
		return sqlSession.selectOne("Proto.selectTest", pvo);
	}

	@Override
	public ProtoVO jsonTest(ProtoVO pvo) throws Exception {
		return sqlSession.selectOne("Proto.jsonTest", pvo);
	}
	
	
	
}
