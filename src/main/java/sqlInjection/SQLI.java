package sqlInjection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;

public class SQLI {
  public void sqlTest1(HttpServletRequest request) {
    try {
      String ip = request.getParameter("ip");
      String ip2 = request.getParameter("ip2");
      System.out.println("blop");
      System.out.println("blop");
      System.out.println("blop");
      System.out.println("blop");
      System.out.println("blop");
      String uuid = UUID.randomUUID().toString();
      Statement statement = getJDBCConnection().createStatement();
      String sql =
          "INSERT INTO banned_ip(id, ip, ip2) VALUE('" + uuid + "','" + ip + "','" + ip2 + "')";
      statement.execute(sql);
    } catch (SQLException exception) {
      exception.printStackTrace();
    }
  }

  public void sqlTest4(HttpServletRequest request) {
    try {
      String ip = request.getParameter("ip");
      System.out.println("blop");
      System.out.println("blop");
      System.out.println("blop");
      System.out.println("blop");
      System.out.println("blop");
      String uuid = UUID.randomUUID().toString();
      Statement statement = getJDBCConnection().createStatement();
      String sql = "INSERT INTO banned_ip(id, ip) VALUE('" + uuid + "','" + ip + "')";
      statement.execute(sql);
    } catch (SQLException exception) {
      exception.printStackTrace();
    }
  }

  public void sqlTest2(int x, String d, String y) {
    try {
      int u = x + 1;
      System.out.println(d + "blabla");
      String id = getid(y);
      String sql =
          "INSERT INTO banned_ip(id, ip) VALUE('"
              + UUID.randomUUID().toString()
              + "','"
              + id
              + "')";
      Statement statement = getJDBCConnection().createStatement();
      statement.execute(sql);
    } catch (SQLException exception) {
      exception.printStackTrace();
    }
    System.out.print("sdfdsf");
  }

  public String getid(String x) {
    String id = x;
    return id;
  }

  Connection getJDBCConnection() {
    return null;
  }
}
