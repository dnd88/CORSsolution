package woowahan.baemin_waiting.team_six.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService{
	@Autowired
	private StoreDAO storeDAO;

	@Override
	public List<StoreVO> selectStoreAllList() throws Exception {
		return storeDAO.selectStoreAllList();
	}

	@Override
	public StoreVO selectStoreOne(StoreVO pvo) throws Exception {
		return storeDAO.selectStoreOne(pvo);
	}
	
	
	
}
