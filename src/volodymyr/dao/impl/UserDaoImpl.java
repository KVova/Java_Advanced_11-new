package volodymyr.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import volodymyr.dao.UserDao;
import volodymyr.domain.User;
import volodymyr.mapper.UserMapper;
import volodymyr.utils.ConnectionUtils;

public class UserDaoImpl implements UserDao {

	public UserDaoImpl() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		connection = ConnectionUtils.openConnection();
	}

	@Override
	public User create(User user) {
		try {
			preparedStatemant = connection.prepareStatement(CREATE);
			preparedStatemant.setString(1, user.getFirstName());
			preparedStatemant.setString(2, user.getLastName());
			preparedStatemant.setInt(3, user.getAge());
			preparedStatemant.setString(4, user.getAddress());
			preparedStatemant.setString(5, user.getUserEmail());
			preparedStatemant.executeUpdate();

			ResultSet rs = preparedStatemant.getGeneratedKeys();
			rs.next();
			user.setId(rs.getInt(1));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User read(Integer id) {
		User user = null;
		try {
			preparedStatemant = connection.prepareStatement(READ_BY_ID);
			preparedStatemant.setInt(1, id);
			ResultSet result = preparedStatemant.executeQuery();
			result.next();

			return UserMapper.map(result);

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return user;
	}

	@Override
	public User update(User user) {
		try {
			preparedStatemant = connection.prepareStatement(UPDATE_BY_ID);
			preparedStatemant.setString(1, user.getFirstName());
			preparedStatemant.setString(2, user.getLastName());
			preparedStatemant.setInt(3, user.getAge());
			preparedStatemant.setString(4, user.getAddress());
			preparedStatemant.setString(5, user.getUserEmail());
			preparedStatemant.setInt(6, user.getId());
			preparedStatemant.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public void delete(Integer id) {
		try {
			preparedStatemant = connection.prepareStatement(DELETE_BY_ID);
			preparedStatemant.setInt(1, id);
			preparedStatemant.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<User> readAll() {
		List<User> listOfUser = new ArrayList<User>();

		try {
			preparedStatemant = connection.prepareStatement(READ_ALL);
			ResultSet result = preparedStatemant.executeQuery();
			while (result.next()) {
				listOfUser.add(UserMapper.map(result));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listOfUser;
	}
	
	private static String CREATE = "insert into user(first_name, last_name, age, address, user_email) value(?,?,?,?,?)";
	private static String READ_BY_ID = "select * from user where id =?";
	private static String UPDATE_BY_ID = "update user set first_name=?, last_name =?, age =?, address =?, user_email =? where id =?";
	private static String DELETE_BY_ID = "delete from user where id =?";
	private static String READ_ALL = "select * from user";

	private Connection connection;
	private PreparedStatement preparedStatemant;

}
