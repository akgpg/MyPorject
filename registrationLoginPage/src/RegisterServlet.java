

import java.io.IOException;
import java.sql.*;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResgisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req,res);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String firstName,lastName,email,password;
		firstName=req.getParameter("firstName");
		lastName=req.getParameter("lastName");
		email=req.getParameter("email");
		password=req.getParameter("password");
		int i=0;
		try {
			DbConnection db = new DbConnection("hr","hr");
			Connection conn= db.getConnection();
			Statement st =conn.createStatement();
			String sql = "insert into user_table values('"+firstName+"','"+lastName+"','"+email+"','"+password+"')";
			st.executeUpdate(sql);
		    i =st.getUpdateCount();
			conn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		res.getWriter().println("registration successful");
		req.getRequestDispatcher("/index.jsp").include(req, res);
	}

}
