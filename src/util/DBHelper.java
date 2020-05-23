package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
	//驱动程序名   
	private static final String driver = "com.mysql.jdbc.Driver";
    //连接数据库的URL地址以及数据库名字,useUnicode=true&characterEncoding=utf-8 防止中文乱码
	private static final String url = "jdbc:mysql://localhost:3306/haolas?useUnicode=true&characterEncoding=UTF-8";  
    //数据库用户名   
	private static final String username = "root";  
    //密码   
	private static final String password = "root"; 
	
	//私有类型的连接对象
	private static Connection conn = null; 
	
	//静态代码块负责加载驱动
	static
	{
		try{
			Class.forName(driver);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	//返回数据库连接对象
	public static Connection getConnection() throws SQLException
	{
		if(conn==null)
		{
			conn = DriverManager.getConnection(url, username, password);
			return conn;
		}
		return conn;
	}
	
	//验证数据库是否连接成功
	public static void main(String[] args)
	{
		try{
			Connection conn = DBHelper.getConnection();
			if(conn!=null)
			{
				System.out.print("数据库连接正常！");
			}
			else
			{
				System.out.print("数据库连接异常！");
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
