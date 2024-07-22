package in.s.Registration.Controller;

import java.io.IOException;

import in.s.Registration.Model.Employee;
import in.s.Registration.dao.EmployeeDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeDao dao = new EmployeeDao();
	public EmployeeServlet() {
		super();
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		 String firstname = req.getParameter("firstname");
         String lastname = req.getParameter("lastname");
         String username = req.getParameter("username");
         String password = req.getParameter("password");
         String address = req.getParameter("address");
         String contact = req.getParameter("contact");
         
         Employee employee = new Employee();
         employee.setFirstname(firstname);
         employee.setLastname(lastname);
         employee.setUsername(username);
         employee.setPassword(password);
         employee.setAddress(address);
         employee.setContact(contact);
         
         try {
			dao.RegisterEmployee(employee);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
         RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/View/employeedetails.jsp");
 		rd.forward(req, resp);
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/View/employeeregister.jsp");
		rd.forward(req, resp);
	}
}
