<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ page import="dao.ProductDAO,dao.Product"%><!-- 只能引入一个包，把Product与ProductDAO放入同一个包中，导入 -->
<%-- <%@ page import="dao.Product"%> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>产品报价</title>
<link rel="stylesheet" type="text/css" href="css/product_price.css">
</head>  
<body background="images/background/background.jpg">
<div class="wrap"> 
    <table class="content">
	    <tr>
	    	<td>	    		
	    		<!-- 商品循环开始 -->
	    		<%
	    			/* 循环写在table里面，这样就会在一行显示，不然会以一个表格为单位进行循环 */
		    		ProductDAO productDao = new ProductDAO();
		        	ArrayList<Product> list = productDao.getALLProducts();
		        	if(list!=null&&list.size()>0)
		        	{
			        	for(int i=0;i<list.size();i++)
			        	{
		    				Product product = list.get(i);
	    		%>	  
		    		<div class="display">  		
	    				<dl>
	    					<dt class="dt_picture">
	    						<!-- 在页面展示从数据库读取的图片，注意路径是否要写全 -->
	    						<%-- <a href="XX.jsp?productId=<%=product.getProductId()%>">	 --%><!-- 创建超链接，是否显示产品的详细信息，用？传递参数 -->
	    							<img src="<%=product.getPicture1()%>" alt="产品图片">
	    						<!-- </a> -->
	    					</dt>
	    					<dd class="dd_text">
	    						<!-- 在页面展示从数据库读取的产品名称 -->
	    						产品名称：<%=product.getProductName() %>
	    						<br>
	    						<!-- 在页面展示从数据库读取的产品价格 -->
	    						零售价：<%=product.getOnlineSalesUnivalence() %>
	    					</dd>
	    				</dl>
	    			</div>
    			<%
    					}
    				}
    			%>
	    	</td>
	    </tr>
    </table>
</div>     
</body>  
</html>