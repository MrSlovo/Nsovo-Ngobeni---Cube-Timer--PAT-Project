
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DbConnect {

  private Connection conn = null;
  private Statement stmt = null;

  public DbConnect(String db) throws ClassNotFoundException {
    String driver = "jdbc:ucanaccess://" + db;

    try {
      conn = DriverManager.getConnection(driver);
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Cannot connect" + ex);
      Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  ResultSet executeQuery(String sqlStmt) throws SQLException {
    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery(sqlStmt);
    return rs;
  }

  void updateTbl(String update) throws SQLException {
    Statement st = conn.createStatement();
    st.executeUpdate(update);
    st.close();
  }

}