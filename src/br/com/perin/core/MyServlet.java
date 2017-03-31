/*
 * MyServlet
 * CopyRight Rech Informática Ltda. Todos os direitos reservados.
 */
package br.com.perin.core;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Descrição da classe.
 */
public class MyServlet extends javax.servlet.http.HttpServlet {

    @Override
    public void init() {
        System.out.println("MyServlet.");
        try {
            super.init();
            System.out.println("Running.");
        } catch (ServletException e) {
            System.out.println("Falha ao iniciar servlet!");
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Seta o content type
        resp.setContentType("text/html;charset=ISO-8859-1");
        // Gera o html para responder o request
        StringBuilder html = new StringBuilder();
        html.append("<html>");
        html.append("<head>");
        html.append("<title>teste title</title>");
        html.append("</head>");
        html.append("<body>");
        html.append("<h1>MEU SERVLET!!!</h1>");
        html.append("</body>");
        html.append("</html>");
        // Envia o html
        try (PrintWriter out = resp.getWriter()) {
            out.print(html.toString());
        }
    }

}
