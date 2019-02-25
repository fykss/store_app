package servlets;

import dao.DAOUserSQL;
import utils.FreeMarker;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ServletLogin extends HttpServlet {
    private final FreeMarker freemarker = new FreeMarker();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HashMap<String, Object> data = new HashMap<>();
        List<String> fields = new ArrayList<>();

        fields.add("login");
        fields.add("password");

        data.put("fields", fields);
        data.put("rout", "/login");

        freemarker.render("ftl/login.ftl", data, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

//        DAOUserSQL daoUserSQL = new DAOUserSQL(conn, login, password);
//        HashMap<String, Object> data = new HashMap<>();

//        System.out.println(daoUserSQL.getByLogin());

//        if (!(daoUserSQL.all().isEmpty())) {
//            data.put("login", login);
//
//        }


    }
}
