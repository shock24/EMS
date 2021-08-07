<!doctype html>
<%@page import="com.learn.mycart.helper.Helper"%>
<%@page import="com.learn.mycart.entities.Category"%>
<%@page import="com.learn.mycart.dao.CategoryDao"%>
<%@page import="com.learn.mycart.entities.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.learn.mycart.dao.ProductDao"%>
<%@page import="com.learn.mycart.helper.FactoryProvider"%>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <%@include file="components/common_css_js.jsp" %>
    
    <title>My Cart</title>
  </head>
  <body>
  <%@include file="components/navbar.jsp" %>
  <div class="row mt-3 mx-2">
  
  		<%
  			String cat=request.getParameter("category");
  		
  			ProductDao pDao=new ProductDao(FactoryProvider.getFactory());
  			List<Product> list=null;
  			if(cat==null)
  			{
  				list=pDao.getAllProducts();
  			}
  			else if(cat.trim().equals("all"))
  			{
  				list=pDao.getAllProducts();
  			}
  			else
  			{
  				int cid=Integer.parseInt(cat.trim());
  				list=pDao.getAllProductsById(cid);
  			}
  			
  			CategoryDao cdao=new CategoryDao(FactoryProvider.getFactory());
  			List<Category> categories=cdao.getCategories();
  		%>
  
  		<!-- show categories  -->
  		<div class="col-md-2">
  		<div class="list-group mt-4">
  		<%
  			if(cat==null || cat.trim().equals("all"))
  			{%>
  				<a href="index.jsp?category=all" class="list-group-item list-group-item-action active">
    				All products
  				</a>
  			<%}
  			else
  			{%>
  				<a href="index.jsp?category=all" class="list-group-item list-group-item-action">
	    			All products
	  			</a>
  			<%}
  		
  		
  		%>
  			
  		
  		<%
	  		for(Category c: categories)
	  		{ 
	  			if(cat!=null && !cat.trim().equals("all"))
	  			{
	  				if(Integer.parseInt(cat)==c.getCategoryId())
	  				{%>
	  					<a href="index.jsp?category=<%= c.getCategoryId() %>" class="list-group-item list-group-item-action active"><%= c.getCategoryTitle() %></a>
	  					<%continue;
	  				}%>
	  				<a href="index.jsp?category=<%= c.getCategoryId() %>" class="list-group-item list-group-item-action"><%= c.getCategoryTitle() %></a>
	  			<%}
	  			else
	  			{%>
	  				<a href="index.jsp?category=<%= c.getCategoryId() %>" class="list-group-item list-group-item-action"><%= c.getCategoryTitle() %></a>
	  			<%}
	  		
	  		
	  		}
  		
  		
  		
  		%>
  		
  		</div>
  		
  		</div>
  		
  		
  		<!-- show products  -->
  		<div class="col-md-10">
  			<div class="row mt-4">
  				<div class="col-md-12">
  					<div class="card-columns">
  						<%
				  			for(Product product:list)
				  			{%>
				  				
				  				<div class="card product-card">
				  					<div class="container text-center">
				  						<img class="card-img-top m-2" style="max-height: 220px; max-width: 95%; width: auto" src="img/products/<%= product.getpPhoto() %>" alt="Card image cap">
				  					</div>
				  					<div class="card-body">
				  						<h5 class="card-title"><%= product.getpName() %></h5>
				  						<p class="card-text">
				  							<%= Helper.get10Words(product.getpDesc()) %>
				  						
				  						</p>
				  					</div>
				  					
				  					<div class="card-footer text-center">
				  						<button class="btn custom-bg text-white" onclick="add_to_cart(<%= product.getpId() %>,'<%= product.getpName() %>',<%= product.getPriceAfterDiscount() %>)">Add to cart</button>
				  						<button class="btn btn-outline-success"> &#8377; <%= product.getPriceAfterDiscount()%>/- <span class="text-secondary discount-label price-strike"> <%= product.getpPrice() %></span><span class="text-secondary discount-label">,<%= product.getpDiscount() %>% off</span></button>
				  					
				  					</div>
				  					
				  					
				  					<!-- share url in fb code -->
				  					<!-- <iframe src="https://www.facebook.com/plugins/share_button.php?href=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DNuwMu57-87g%26list%3DPL0zysOflRCekMr91amXBNwWku4PmeFaFD%26index%3D24&layout=button_count&size=small&width=77&height=20&appId" width="77" height="20" style="border:none;overflow:none" scrolling="no" frameborder="0" allowfullscreen="true" allow="autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share"></iframe>-->
				  				</div>
				  				
				  				
				  			<%}
  						if(list.size()==0)
  						{
  							out.println("<h3>No item in this category</h3>");
  						}
  						
  						%>
  						
  						
  						
  						
  					
  					</div>
  				
  				
  				
  				</div>
  			
  			
  			</div>
  		
  		
  		
  		
  		</div>
  
  
  </div>
    
    
    
    
   <%@include file="components/common_modals.jsp" %>
  </body>
</html>