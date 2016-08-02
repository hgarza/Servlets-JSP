<%@ page import="java.io.*" %>

			<%
				InputStream ins = (InputStream)request.getAttribute("file");
				int read = 0;
				byte[] bytes = new byte[5120];
				OutputStream os = response.getOutputStream();
				while ((read = ins.read(bytes)) != -1) {
					os.write(bytes, 0, read);
				}
				os.flush();
				os.close();
			%>
