
package TodoMemo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	@WebServlet("/registerM")
	public class MemoRegisterServlet extends HttpServlet{
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		
		// 등록
		String contents = req.getParameter("contents");	 
		BoardMemoService m = new BoardMemoService();
		m.registerMemo(contents);	
		// 메모 등록 후, 메모 목록 조회 페이지로 이동
		resp.sendRedirect(req.getContextPath()+"/inquiryM");
	
	}
}
