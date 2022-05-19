package ru.geekbrains.jee.lesson1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GetProductServlet", urlPatterns = "/product")

// Сервлет для получения списка продуктов: GET http://localhost:8080/firstapp/product
public class GetProductServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(GetProductServlet.class);


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().printf("<html><body>");
        resp.getWriter().printf("<h1>" + (new Product(1, "Box", 6)).toString() + "</h1>");
        resp.getWriter().printf("<h1>" + (new Product(2, "Bird", 10)).toString() + "</h1>");
        resp.getWriter().printf("<h1>" + (new Product(3, "Cat", 15)).toString() + "</h1>");
        resp.getWriter().printf("<h1>" + (new Product(4, "Dog", 20)).toString() + "</h1>");
        resp.getWriter().printf("<h1>" + (new Product(5, "Cup", 3)).toString() + "</h1>");
        resp.getWriter().printf("<h1>" + (new Product(6, "Clock", 12)).toString() + "</h1>");
        resp.getWriter().printf("<h1>" + (new Product(7, "Book", 13)).toString() + "</h1>");
        resp.getWriter().printf("<h1>" + (new Product(8, "Milk", 2)).toString() + "</h1>");
        resp.getWriter().printf("<h1>" + (new Product(9, "Eggplant", 11)).toString() + "</h1>");
        resp.getWriter().printf("<h1>" + (new Product(10, "Apple", 2)).toString() + "</h1>");
        resp.getWriter().printf("</body></html>");
    }
}
