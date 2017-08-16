package woowahan.baemin_waiting.team_six.proto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProtoController {
	@Autowired
	private ProtoService protoService;
	
	@RequestMapping(value="Proto_insertTest.do")
	public void insertTest(HttpServletRequest request, HttpServletResponse reponse) throws Exception {
		ProtoVO pvo = new ProtoVO();
		pvo.setTestId(request.getParameter("id"));
		pvo.setTestName(request.getParameter("name"));
		
		protoService.insertTest(pvo);
		System.out.println("insertDone");		
	}
	
	@RequestMapping(value="Proto_selectTest.do")
	public ModelAndView selectTest(HttpServletRequest request, HttpServletResponse reponse) throws Exception {
		
		ProtoVO pvo = new ProtoVO();
		pvo.setTestId(request.getParameter("id"));
		
		ProtoVO rvo = protoService.selectTest(pvo);
		
		return new ModelAndView("protoResult", "rvo", rvo);
	}
	
	@RequestMapping(value="Proto_jsonTest.do")
	public ModelAndView jsonTest(HttpServletRequest request, HttpServletResponse reponse) throws Exception {
		ProtoVO pvo = new ProtoVO();
		pvo.setTestId(request.getParameter("id"));
		
		ProtoVO rvo = protoService.jsonTest(pvo);
		System.out.println(rvo);
		return new ModelAndView("JsonView","rvo", rvo);
	}
}
