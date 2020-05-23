package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DBHelper;


//商品的业务逻辑类
public class ProductDAO {
	//获得所有的商品信息
	public ArrayList<Product> getALLProducts()
	{
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Product> list = new ArrayList<Product>();	//商品集合
		try
		{
			conn = DBHelper.getConnection();
			String sql = "select * from product";	//要执行的SQL语句
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next())
			{
				Product product = new Product();
				product.setProductId(rs.getInt("productId"));	/*获取产品ID，唯一识别*/
				product.setProductName(rs.getString("productName"));	/*获取产品名称，显示在页面上*/
				product.setPicture1(rs.getString("picture1"));	/*获取照片，显示在页面上*/
				product.setOnlineSalesUnivalence(rs.getFloat("onlineSalesUnivalence"));	 /*获取产品价格，显示在页面上*/
				list.add(product);	//每次遍历的时候，把商品加入一个集合
			}
			return list;	//返回集合
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		finally
		{
			//关闭rs对象,释放数据集对象
			if(rs!=null)
			{
				try
				{
					rs.close();
					rs = null;
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
			//关闭stmt对象，释放语句对象
			if(stmt!=null)
			{
				try
				{
					stmt.close();
					stmt = null;
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}	
		}
	}
}
