package Util;


import java.sql.*;

public class JDBCConnection {
    private static Connection conn;
    private static PreparedStatement ps;
    private static ResultSet rs;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {  //数据库连接
        Connection connection =     null;
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
        String username = "root";
        String password = "root";
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    //查询
    public static void select() throws SQLException, ClassNotFoundException {
        conn = JDBCConnection.getConnection();
        String a;
        System.out.printf("获取连接成功");
        System.out.printf(String.valueOf(conn));
        String sql = "select * from user  ";
        Statement statement = conn.createStatement();
        rs = statement.executeQuery(sql);
//        System.out.println(rs);
//        ps = conn.prepareStatement(sql);
//        rs = ps.executeQuery(sql);
        while (rs.next()) {
            a=rs.getString(1);
            System.out.println("a="+rs.getString(1));
        }
    }
    //Statement   接口下实现  增删改  确定的SQL语句
//    public static void update() throws SQLException, ClassNotFoundException {
//        conn = JDBCConnection.getConnection();
//        Statement statement=conn.createStatement();
//       <----- 删------>
//        String sql="delete from user where id=4";
//        statement.executeUpdate(sql);
//        System.out.println(statement.executeUpdate(sql));  //返回值是影响的行数
//        <----- 增------>
//        String sql="insert into user(id,username,password) values(12,'sad','asdas')";
//      statement.executeUpdate(sql);  //如果同时会报错，因为相当于执行了两次
//        System.out.println(statement.executeUpdate(sql));
//        <---- 改  ---->
//        String sql=" update user set username='liyongke' where id=1";
//        statement.executeUpdate(sql);
//        System.out.println(statement.executeUpdate(sql));
//        }


    //PrepareStatement 接口实现预编译的操作
//    public static void update(int id) throws SQLException,ClassNotFoundException{  //根据id查
//    public static void update(int id, String username, String password) throws SQLException, ClassNotFoundException { //增删改
    

//        conn = JDBCConnection.getConnection();
//           <-----------查----------->
//        String sql = "select * from user where id=?";
//         ps = conn.prepareStatement(sql);
//        ps.setInt(1, id);
//        rs = ps.executeQuery();
//        while (rs.next()) {
//            System.out.println(rs.getString(2));
//        }
        //    <-----------增----------->
//        String sql="insert into user (id,username,password) values (?,?,?)";
//        ps=conn.prepareStatement(sql);
//        ps.setInt(1,id);
//        ps.setString(2,username);
//        ps.setString(3,password);
//        ps.executeUpdate();
        //    <-----------改----------->
//        String sql="update user set username=? ,password=? where id=?";
//        ps=conn.prepareStatement(sql);
//        ps.setString(1,username);
//        ps.setString(2,password);
//        ps.setInt(3,id);
//        ps.executeUpdate();
//    }
}
