package com.example.HW3_1;

import com.talanlabs.avatargenerator.Avatar;
import com.talanlabs.avatargenerator.TriangleAvatar;

import javax.imageio.ImageIO;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.util.Base64;
import java.util.Random;


@WebServlet(urlPatterns = "/SelectBeer.do")
public class AvatarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Avatar a= TriangleAvatar.newAvatarBuilder().build();
        String u= request.getParameter("username");
        long unboundedLong = new Random().nextLong();
        BufferedImage result=a.create(unboundedLong);
        request.setAttribute("name", u);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        ImageIO.write(result, "png", output);
        String imageAsBase64 = Base64.getEncoder().encodeToString(output.toByteArray());
        request.setAttribute("imageAsBase64", imageAsBase64);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

}