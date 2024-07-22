package in.s.Registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.s.Registration.Model.Employee;

public class EmployeeDao {

	public int RegisterEmployee(Employee employee) throws ClassNotFoundException {

		String query = "INSERT INTO employee"
				+ "(ID , FIRSTNAME , LASTNAME , USERNAME , PASSWORD , ADDRESS , CONTACT) VALUES " + "(?,?,?,?,?,?,?);";
		int result = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpractice?useSSl=false", "root",
				"Subh123@"); PreparedStatement ps = con.prepareStatement(query)) {
			ps.setInt(1, 1);
			ps.setString(2, employee.getFirstname());
			ps.setString(3, employee.getLastname());
			ps.setString(4, employee.getUsername());
			ps.setString(5, employee.getPassword());
			ps.setString(6, employee.getAddress());
			ps.setString(7, employee.getContact());
			System.out.println(ps);
			
			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;

	}

}
