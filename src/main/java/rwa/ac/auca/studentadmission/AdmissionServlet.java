package rwa.ac.auca.studentadmission;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/AdmissionServlet")
public class AdmissionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String FullName= req.getParameter("FullName");
        String LastName= req.getParameter("LastName");
        String NationalId= req.getParameter("NationalId");
        String Email= req.getParameter("Email");
        String Gender= req.getParameter("Gender");
        String DateOfBirth=req.getParameter("DateOfBirth");
        String Address =req.getParameter("Address");
        String MotherName =req.getParameter("MotherName");
        String FatherName =req.getParameter("FatherName");
        String Religion =req.getParameter("Religion");
        String Status =req.getParameter("Status");

        System.out.println("FullName="+FullName);
        System.out.println("LastName="+LastName);
        System.out.println("NationalId="+NationalId);
        System.out.println("Gender="+Gender);
        System.out.println("DateOfBirth="+DateOfBirth);
        System.out.println("Email="+Email);
        System.out.println("Address="+Address);
        System.out.println("MotherName="+MotherName);
        System.out.println("FatherName="+FatherName);
        System.out.println("Religion="+Religion);
        System.out.println("Status="+Status);
        req.setAttribute("FullName",FullName);
        req.setAttribute("LastName",LastName);
        req.setAttribute("NationalId",NationalId);
        req.setAttribute("Gender",Gender);
        req.setAttribute("DateOfBirth",DateOfBirth);
        req.setAttribute("Email",Email);
        req.setAttribute("Address",Address);
        req.setAttribute("MotherName",MotherName);
        req.setAttribute("FatherName",FatherName);
        req.setAttribute("Religion",Religion);
        req.setAttribute("Status",Status);
        req.getRequestDispatcher("Display.jsp").forward(req,resp);

    }
}
