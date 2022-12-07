
package simpe.spring.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import simpe.spring.models.Login;
import simpe.spring.models.User;

@Component
public class LoginRepository implements SimpleSpringRepository<Login, Long>{

    @Autowired
    private Connection connection;

    @Override
    public List<Login> findAll() {
         String query = "SELECT *\n" + "FROM Login;";
        List<Login> userList = new ArrayList<>();

        try (Statement statement = this.connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                long id = resultSet.getLong(1);
                String firstName = resultSet.getString(2);
                String lastName = resultSet.getString(3);

                userList.add(new Login(id, firstName, lastName));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return userList;
    }

    @Override
    public Optional<Login> findById(Long id) {
        String query = "SELECT *\n" + "FROM userss\n" + "WHERE id = ?;";
        Login user = null;

        try (PreparedStatement preparedStatement = this.connection.prepareStatement(query)) {
            preparedStatement.setLong(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                long id1 = resultSet.getLong(1);
                String firstName = resultSet.getString(2);
                String lastName = resultSet.getString(3);

                user = new Login(id1, firstName, lastName);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return Optional.ofNullable(user);
    }

    @Override
    public void save(Login t) {
        
    }
    

}
