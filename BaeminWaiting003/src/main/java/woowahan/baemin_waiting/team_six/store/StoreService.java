package woowahan.baemin_waiting.team_six.store;

import java.util.List;

public interface StoreService {
	public List<StoreVO> selectStoreAllList() throws Exception;
	public StoreVO selectStoreOne(StoreVO pvo) throws Exception;
}
