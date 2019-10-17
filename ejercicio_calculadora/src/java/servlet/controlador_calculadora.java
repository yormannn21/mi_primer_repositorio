import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


        protected void processRequest(HttpServletRequest Request, HttpServletResponse Response)
             throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()){
    
            calculadora cal=new calculadora();
             cal.valor1 =Float.parseFloat(Request.getParameter("valor1"));
                cal.valor2 =Float.parseFloat(Request.getParameter("valor2"));

              if (request.getParameter("operacion").equals("suma")){
              cal.calcular_suma();
              out.print("la suma es: " + cal.resultado);
              }
            if (request.getParameter("operacion").equals("resta")){
            cal.calcular_resta();
            out.print("la resta es: " + cal.resultado);
            }
            if (request.getParameter("operacion").equals("")){
            cal.calcular_suma();
            out.print("la multiplicacion es: " + cal.resultado);
            }
            if (request.getParameter("operacion").equals("sumar")){
            cal.calcular_divicion();
            out.print("la divicion es: " + cal.resultado);
            }





}


    }







