package woowahan.baemin_waiting.team_six.user;


import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;

import woowahan.baemin_waiting.team_six.util.ShaPasswordEncoder;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
//	@RequestMapping(value="User_insertUser.do")
//	public void insertUser(HttpServletRequest request, HttpServletResponse reponse) throws Exception {
//		System.out.println("insertUser 컨트롤러 돌기시작");
//		UserVO pvo = new UserVO(); 
//		
//		pvo.setUserId(request.getParameter("id"));
//		pvo.setUserPassword(request.getParameter("password"));
//		pvo.setUserName(request.getParameter("name"));
//		//pvo.setUserNumber(Integer.parseInt(request.getParameter("number")));
//		
//		userService.insertUser(pvo);
//		System.out.println("user insert done");
//	}
	
	//sign up 
	@RequestMapping(value="User_signUpUser.do")
	public void signUpUser(HttpServletRequest request, HttpServletResponse reponse) throws Exception {
		System.out.println("ajax test run");
		UserVO pvo = new UserVO();
		
		pvo.setUserId(request.getParameter("userId"));
		pvo.setUserName(request.getParameter("userName"));
		pvo.setUserPhoneNumber(request.getParameter("userPhoneNumber"));
		pvo.setUserRole("업주");
		
		//password encoding 
		String password = request.getParameter("userPassword");
		ShaPasswordEncoder encoder = new ShaPasswordEncoder();
		String encodedPw = encoder.encodePassword(password);				
		pvo.setUserPassword(encodedPw);
		
		userService.signUpUser(pvo);
		
	}
	
	@RequestMapping(value="User_signUpUser2.do")
	public void signUpUser2(HttpServletRequest request, HttpServletResponse reponse) throws Exception {
		System.out.println("ㅇ");
		UserVO pvo = new UserVO();
		
		pvo.setUserId(request.getParameter("userId"));
		pvo.setUserName(request.getParameter("userName"));
		pvo.setUserPhoneNumber(request.getParameter("userPhoneNumber"));
		//String password = request.getParameter("userPassword");
		System.out.println(pvo);
	}
	
	//log in 
	@RequestMapping(value="User_login.do")
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response, UserVO vo)throws Exception{
		UserVO pvo = new UserVO();
		
		pvo.setUserId(request.getParameter("userId"));
		//password encoding 
		String password = request.getParameter("userPassword");
		ShaPasswordEncoder encoder = new ShaPasswordEncoder();
		String encodedPw = encoder.encodePassword(password);				
		pvo.setUserPassword(encodedPw);
				
        UserVO rvo = userService.login(pvo);
        
        if(rvo == null){
           PrintWriter out = response.getWriter();
           out.println("<script type='text/javascript'> alert('please check your id and password')</script> ");
           out.flush();
           return new ModelAndView("redirect:/html/user/login.html");
        }
        
        //session binding
        request.getSession().setAttribute("rvo", rvo);
        System.out.println(" login done ");
        //return new ModelAndView("redirect:/protoMain.html");
        boolean flag = true;
        return new ModelAndView("JsonView", "flag", flag);
     }
	
	//log out
	@RequestMapping(value="User_logout.do")
	public ModelAndView logout(HttpServletRequest request,HttpServletResponse response)throws Exception{
		request.getSession().invalidate();
		
		PrintWriter out = response.getWriter();
        out.println("<script type='text/javascript'> alert('로그아웃 되셨습니다')</script> ");
        out.flush();
		
		return new ModelAndView("redirect:/protoMain.html");
	}
	
	//check login
	@RequestMapping(value="User_checkLogin.do")
	public ModelAndView checkLogin(HttpServletRequest request,HttpServletResponse response)throws Exception{
		boolean flag = false;
		
		if (request.getSession().getAttribute("rvo") != null) {
			flag = true;			
		}
		
		return new ModelAndView("JsonView", "flag", flag);
	}
	
	@RequestMapping(value="login.do")
	public ModelAndView jsonParse(HttpServletRequest request,HttpServletResponse response)throws Exception{
		UserVO pvo = new UserVO();
		//password encoding 
				String password = request.getParameter("userPassword");
				ShaPasswordEncoder encoder = new ShaPasswordEncoder();
				String encodedPw = encoder.encodePassword(password);				
				pvo.setUserPassword(encodedPw);
		System.out.println(encodedPw);
				
		String key = encodedPw;
		
		//jwt토큰 만드는 로
		JWSSigner signer = new MACSigner(key);//key must be at least 256 bits
		JWTClaimsSet claimsSet = new JWTClaimsSet.Builder()
		                .claim("cid", "this-is-key")
		                .claim("name", "chidoo")
		                .claim("admin", true)
		                .build();
		SignedJWT signedJWT = new SignedJWT(new JWSHeader(JWSAlgorithm.HS256), claimsSet);
		signedJWT.sign(signer);
		 
		String jwtString = signedJWT.serialize();
		System.out.println("/////////plz////////");
		System.out.println(jwtString);
		//여기까지  
		
		
		
		
		String jsonString = request.getParameter("jsonParameter");

	

		
		pvo.setUserId(request.getParameter("userId"));
		
				
        UserVO rvo = userService.login(pvo);
        
        if(rvo == null){
           PrintWriter out = response.getWriter();
           out.println("<script type='text/javascript'> alert('please check your id and password')</script> ");
           out.flush();
           return new ModelAndView("redirect:/html/user/login.html");
        }
        
        //session binding
        request.getSession().setAttribute("rvo", rvo);
        System.out.println(" login done ");
        //return new ModelAndView("redirect:/protoMain.html");
        boolean flag = true;
        return new ModelAndView("JsonView", "flag", flag);
	}
	
}
