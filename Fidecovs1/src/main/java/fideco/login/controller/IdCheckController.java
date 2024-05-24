package fideco.login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fideco.member.dao.MemberDAO;
import fideco.control.Controller;
import fideco.handler.HandlerAdapter;

public class IdCheckController implements Controller {
	private static final Log log = LogFactory.getLog(IdCheckController.class);

	@Override
	public HandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
		String member_id = request.getParameter("member_id");
		log.info(member_id);
		MemberDAO memberDAO = new MemberDAO( );
		int result = memberDAO.membermember_Id(member_id);
		if(result == 1) {
			log.info("존재하는 아이디 - " + member_id);
		} else if(result == 0) {
			log.info("존재하지 않는 아이디 - " + member_id);
		}
		try {
			PrintWriter out = response.getWriter( );
			out.write(result + "");
			out.close( );

		} catch(IOException e) {
			e.printStackTrace( );
		}
		HandlerAdapter handlerAdapter = new HandlerAdapter( );
		handlerAdapter.setPath("/WEB-INF/view/member/member_insert.jsp");
		return null;

	}

}
