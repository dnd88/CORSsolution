package woowahan.baemin_waiting.team_six.proto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProtoServiceImpl implements ProtoService{
	@Autowired
	private ProtoDAO protoDAO;	
	
	@Override
	public void insertTest(ProtoVO pvo) throws Exception {
		protoDAO.insertTest(pvo);
	}	

	@Override
	public ProtoVO selectTest(ProtoVO pvo) throws Exception {
		return protoDAO.selectTest(pvo);
	}

	@Override
	public ProtoVO jsonTest(ProtoVO pvo) throws Exception {
		return protoDAO.jsonTest(pvo);
	}
	
	
}
