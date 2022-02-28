<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


		<%  String guj[]=(String[]) request.getParameterValues("guj");
			String pun[]=(String[]) request.getParameterValues("pun");
			//String email1=(String) request.getAttribute("emailValue");
			//String email=(String) request.getParameter("emailpro");
			String em=(String)session.getAttribute("emailVal");
			
			HashMap<String,String> g=new HashMap<String,String>();
			if(guj==null){
				
				for(int i=0;i<pun.length;i++){
					String arr[]=pun[i].split(":");
					g.put(arr[0],arr[1]);				
				}	
			}else{
			
				
				for(int i=0;i<guj.length;i++){
					String arr[]=guj[i].split(":");
					g.put(arr[0],arr[1]);				
				}
			}
			int sum=0;
			for(int i=0;i<g.size();i++){
				sum=sum+Integer.parseInt(g.get(g.keySet().toArray()[i]));
			}
			double gst=Math.round(sum*0.12);
			
		%>
		
		
		<h1>Total Bill</h1> <br>
		<h5>Purchase Items</h5><br>
		<% for(int i=0;i<g.size();i++){%>
				<%=g.keySet().toArray()[i]+" => "+g.get(g.keySet().toArray()[i])+"<br>" %>
		<% }%>
		
		<%="<br>Bill => "+ sum+"<br>"+"GST(12%) => "+gst+"<br><br>"+"Total Bill => "+(sum+gst)%>
		
		<%="<br><br>Dear sir,"+em+"<br>"+"Your payble amout is "+(sum+gst)+" Rs" %>
		
		
		
		
</body>
</html>