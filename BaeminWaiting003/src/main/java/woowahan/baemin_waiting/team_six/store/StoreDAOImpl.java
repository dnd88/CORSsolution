package woowahan.baemin_waiting.team_six.store;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StoreDAOImpl implements StoreDAO {
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<StoreVO> selectStoreAllList() throws Exception {		
		return sqlSession.selectList("Store.selectStoreAllList");
	}

	@Override
	public StoreVO selectStoreOne(StoreVO pvo) throws Exception {		
		return sqlSession.selectOne("Store.selectStoreOne", pvo);
	}
	
	
	
}
