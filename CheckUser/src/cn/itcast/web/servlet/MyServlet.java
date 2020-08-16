package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @description: 测试Servlet的基本使用
 * @author: liuzhi
 * @Date: 2020-08-16 15:12
 **/
public class MyServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String path = this.getServletContext().getRealPath("/download/2.jpg");

        FileInputStream fileInputStream = new FileInputStream(path);

        String FileName = path.substring(path.lastIndexOf("\\")+1);

        response.setHeader("Content-Disposition","attachment;filename="+FileName);

        int len =0;
        byte[]bytes = new byte[1024];
        ServletOutputStream servletOutputStream = response.getOutputStream();

        while ((len = fileInputStream.read(bytes))>0)
        {
            servletOutputStream.write(bytes,0,len);
        }
        servletOutputStream.close();
        fileInputStream.close();



    }
}
