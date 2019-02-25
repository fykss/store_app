package servlets;

import utils.FreeMarker;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ServletRegister extends HttpServlet {
    private final FreeMarker freeMarker = new FreeMarker();
//    private DAO dao;
//
//    public ServletRegister(Connection connection) {
//        this.dao = new DAOUserSQL(connection);
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HashMap<String, Object> data = new HashMap<>();
        List<String> fields = new ArrayList<>();

        fields.add("login");
        fields.add("password");

        data.put("fields", fields);
        data.put("rout", "/reg");

        freeMarker.render("ftl/reg.ftl", data, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirm-password");

//        DAOUserSQL daoUserSQL = new DAOUserSQL(conn, login, password);
//        ArrayList<User> users = new ArrayList<>();
//
//        User user = new User(login, password);
//        if (!(daoUserSQL.check())) {
//            if (password.equals(confirmPassword)) {
//                users.add(user);
//                daoUserSQL.put(user);
//                resp.sendRedirect("/login");
//            } else {
//                resp.getWriter().println("Password does not match. Please try again!");
//            }
//        }
//
//        else {
//            resp.getWriter().println("This login is already taken. Please try again!");
//        }
    }
}
