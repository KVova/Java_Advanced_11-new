package volodymyr.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import volodymyr.dao.BucketDao;
import volodymyr.domain.Bucket;
import volodymyr.mapper.BucketMapper;
import volodymyr.utils.ConnectionUtils;

public class BucketDaoImpl implements BucketDao {

	public BucketDaoImpl() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		connection = ConnectionUtils.openConnection();
	}

	@Override
	public Bucket create(Bucket bucket) {
		try {
			preparedStatemant = connection.prepareStatement(CREATE, Statement.RETURN_GENERATED_KEYS);
			preparedStatemant.setInt(1, bucket.getUserId());
			preparedStatemant.setInt(2, bucket.getMagazineId());
			preparedStatemant.setDate(3, new Date(bucket.getDate().getTime()));
			preparedStatemant.executeUpdate();

			ResultSet rs = preparedStatemant.getGeneratedKeys();
			rs.next();
			bucket.setId(rs.getInt(1));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bucket;
	}

	@Override
	public Bucket read(Integer id) {
		Bucket bucket = null;
		try {
			preparedStatemant = connection.prepareStatement(READ_BY_ID);
			preparedStatemant.setInt(1, id);
			ResultSet result = preparedStatemant.executeQuery();
			result.next();

			return BucketMapper.map(result);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bucket;
	}

	@Override
	public Bucket update(Bucket t) {
		throw new IllegalStateException("there is no update for bucket");
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
	public List<Bucket> readAll() {
		List<Bucket> listOfBucket = new ArrayList<>();

		try {
			preparedStatemant = connection.prepareStatement(READ_ALL);
			ResultSet result = preparedStatemant.executeQuery();
			while (result.next()) {
				listOfBucket.add(BucketMapper.map(result));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listOfBucket;
	}

	private static String READ_ALL = "select * from bucket";
	private static String CREATE = "insert into bucket(user_id, magazine_id, date) value(?,?,?)";
	private static String READ_BY_ID = "select * from bucket where id =?";
	private static String DELETE_BY_ID = "delete from bucket where id =?";

	private Connection connection;
	private PreparedStatement preparedStatemant;

}
