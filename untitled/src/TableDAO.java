import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class TableDAO {

    private static final String INSERT_TEMPLATE = "insert into wfsim(providerid, gsmnetcode, simno, imsi, simtype) values(%s, %s, '%s', '%s', %s)";


    public void saveFromQueries(List<String> queries, java.sql.Connection connection) {
        try {
            for (String query : queries) {
                saveFromQuery(query, connection);
            }

            connection.commit();
        } catch (SQLException sqlException) {
            try {
                connection.rollback();
            } catch (Exception rollbackEx) {
                // TODO do something with it
            }
        }
    }

    public void saveFromQuery(String query, java.sql.Connection connection) throws SQLException {
        // write db
        PreparedStatement insertStatement = connection.prepareStatement(query).setstr;
        insertStatement.executeUpdate();
    }

}
