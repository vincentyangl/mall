package com.mall.handler;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mall.dao.ProductDao;
import com.mall.dao.ProductTypeDao;
import com.mall.model.Product;
import com.mall.model.ProductType;


/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ProductDao pd = new ProductDao();
	ProductTypeDao ptd = new ProductTypeDao();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String state = request.getParameter("state");
		String id = request.getParameter("pid");
		if (state.equals("list")) {
			Map map = initMap(request);
			List<Product> products = pd.listAll(map);
			List<ProductType> types = getTypeList();
			request.setAttribute("types", types);
			request.setAttribute("products", products);
			request.getRequestDispatcher("productList.jsp").forward(request, response);
		}
		if (state.equals("toAdd")) {
			List<ProductType> productTypes = getTypeList();
			request.setAttribute("types", productTypes);
			request.getRequestDispatcher("productAdd.jsp").forward(request, response);
		}
		if (state.equals("add")) {
			Product product = getPro(request, response);
		    pd.save(product);
		    response.sendRedirect("/ProductServlet?state=list");
		}
		if (state.equals("del")) {
			pd.delete(Integer.valueOf(id));
			response.sendRedirect("/ProductServlet?state=list");
		}
		if (state.equals("toUpdate")) {
			Product product = pd.getById(Integer.valueOf(id));
			request.setAttribute("p", product);
			List<ProductType> productTypes = getTypeList();
			request.setAttribute("types", productTypes);
			request.getRequestDispatcher("productAdd.jsp").forward(request, response);
		}
		if (state.equals("update")) {
			Product product = getPro(request, response);
			String pid = request.getParameter("pid");
			product.setPid(Integer.valueOf(pid));
			pd.update(product);
			response.sendRedirect("/ProductServlet?state=list");
		}
	}

	public Map initMap(HttpServletRequest request) {
		Map map = new HashMap<>();
		String ptid = request.getParameter("ptid");
		if (ptid==null) {
			ptid="-1";
		}
		request.setAttribute("ptid", ptid);
		String qname=request.getParameter("qname");
		if (qname!=null) {
			try{
			qname=new String(qname.getBytes("ISO-8859-1"),"UTF-8");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		request.setAttribute("qname", qname);
		map.put("ptid", ptid);
		map.put("qname", qname);
		System.out.println(ptid+":"+qname);
		return map;
	}
	
	public List<ProductType> getTypeList() {
		List<ProductType> types = ptd.listAll();
		return types;
	}
	
	public Product getPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pname = request.getParameter("pname");
		String price = request.getParameter("price");
		String saleCount = request.getParameter("saleCount");
		String descript = request.getParameter("descript");
		String pimg = request.getParameter("pimg");
		String typeId = request.getParameter("typeId");
		Product product = new Product();
		ProductType proType = new ProductType();
		product.setPname(new String(pname.getBytes("ISO-8859-1"),"UTF-8"));
		product.setPrice(Double.valueOf(price));
		product.setSaleCount(Integer.valueOf(saleCount));
		product.setDescript(new String(descript.getBytes("ISO-8859-1"),"UTF-8"));
		product.setPimg(pimg);
		proType = ptd.getById(Integer.valueOf(typeId));
		product.setProductType(proType);
		return product;
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
