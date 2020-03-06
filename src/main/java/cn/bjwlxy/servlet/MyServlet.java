package cn.bjwlxy.servlet;

import Dao.MyDao;
import entity.MyEntity;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String id= request.getParameter("id");
        MyDao mydao = new MyDao();
        ArrayList<String> myEntit = mydao.Link(id);
        //System.out.println(myEntit);
        if(myEntit!=null) {
            request.setAttribute("id",myEntit.toString());
            request.getRequestDispatcher("success.jsp").forward(request, response);
        }else {
            System.out.print("错误信息");
        }

        }
    }


