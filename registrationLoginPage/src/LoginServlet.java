

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req,res);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email,userPass,dbPass =null;
		email = req.getParameter("email");
		userPass = req.getParameter("password");
		 boolean l_found = true;
		try {
			DbConnection db = new DbConnection("hr","hr");
			Connection conn = db.getConnection();
			Statement st = conn.createStatement();
			String sql = "select get_password('"+email+"') from dual";
			ResultSet result = st.executeQuery(sql);
			l_found = result.next();
			dbPass = result.getString(1);
			if( dbPass !=null )
			   {
				
			
				if ( dbPass.equals(userPass))
				   {
					//res.getWriter().println("incorrect password");
					req.getRequestDispatcher("welcome.jsp").include(req, res);
				   }
				else
				    {
					res.getWriter().println("incorrect password");
					req.getRequestDispatcher("index.jsp").include(req, res);
				    } 
				}
			else
			    {
				res.getWriter().println("user doesnot exist");
				req.getRequestDispatcher("index.jsp").include(req, res);
			    
			    }
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
