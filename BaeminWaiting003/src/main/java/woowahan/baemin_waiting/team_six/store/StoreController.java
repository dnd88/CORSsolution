package woowahan.baemin_waiting.team_six.store;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StoreController {
	@Autowired
	private StoreService storeService;
	
	
	@RequestMapping(value="Store_selectStoreAllList.do")
	public ModelAndView selectStoreAllList(HttpServletRequest request, HttpServletResponse reponse) throws Exception{
		
		List<StoreVO> rvo = storeService.selectStoreAllList();
		
		for(StoreVO s : rvo) {
		
			System.out.println(s);
		}
		
		return new ModelAndView("JsonView", "rvo", rvo);
	}
	
	@RequestMapping(value="Store_selectStoreOne.do")
	public ModelAndView selectStoreOne(HttpServletRequest request, HttpServletResponse reponse) throws Exception{
		StoreVO pvo = new StoreVO();
				
		pvo.setStoreId(Integer.parseInt(request.getParameter("storeId")));
		
		StoreVO rvo = storeService.selectStoreOne(pvo);
		return new ModelAndView("JsonView", "rvo", rvo);
	}
	
}
