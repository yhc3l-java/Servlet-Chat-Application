

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PostMessage")
public class PostMessage extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User tempUser = new User(request.getRemoteAddr());
		User user = Users.users.get(Users.users.indexOf(tempUser));
		Users.messages.add(new Message(user, request.getParameter("message")));
	}
}
