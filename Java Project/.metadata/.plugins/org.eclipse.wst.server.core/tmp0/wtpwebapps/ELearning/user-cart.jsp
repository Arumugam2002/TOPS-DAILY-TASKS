<%@page import="model.Course"%>
<%@page import="dao.CourseDao"%>
<%@page import="dao.CartDao"%>
<%@page import="model.Cart"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="user-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<body>
	<div class="container-xxl py-5">
        <div class="container">
            <div class="row g-4">
                <table class="table">
                    <thead>
                        <tr>
                            <th scope="col">Course Name</th>
                            <th scope="col">Course Price</th>
                            <th scope="col">Quantity</th>
                            <th scope="col">Total</th>
                            <th scope="col">Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                        List<Cart> list = CartDao.getCartByUserId(u.getId());
                        int subtotal = 0;

                        for (Cart c : list) {
                        	subtotal = subtotal + c.getTotalprice();
                        	Course c1 = CourseDao.getCourseById(c.getCid());
                        %>
                        <tr>
                            <td><h5><%=c1.getCname()%></h5></td>
                            <td><h5><%=c1.getCprice()%></h5></td>
                            <td>
                                <form action="CartController"
									method="post">
									<input type="hidden" name="action" value="updatecart">
                                    <input type="hidden" name="cartid"
										value="<%=c.getCartid()%>">
                                    <input type="number" name="qty"
										value="<%=c.getQty()%>" onchange="this.form.submit();">
                                </form>
                            </td>
                            <td><%=c.getTotalprice()%></td>
                            <td>
                                <form
									id="remove-cart-form-<%=c.getCartid()%>"
									action="user-remove-from-cart.jsp" method="post"
									style="display: none;">
                                    <input type="hidden" name="cartid"
										value="<%=c.getCartid()%>">
                                </form>
                                <a href="javascript:void(0);"
								onclick="document.getElementById('remove-cart-form-<%=c.getCartid()%>').submit();">Remove From Cart</a>
                            </td>
                        </tr>
                        <%
                        }
                        %>
                        <tr>
                            <td><h6>Sub total</h6></td>
                            <td><h6><%=subtotal%></h6></td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>


	<%@include file="user-footer.jsp"%>
</body>

</html>