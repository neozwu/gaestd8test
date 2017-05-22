package org.neowu.gae;

import static org.easymock.EasyMock.createMock;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by neowu on 5/22/17.
 */
@WebServlet(value = "/test")
public class TestServlet extends HttpServlet {

        private static final long serialVersionUID = 523885428311420041L;

        @Override
        public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            PrintWriter out = resp.getWriter();
            AClass aClass = createMock(AClass.class);
            out.append(aClass.getClass().getClassLoader().toString()+"\n");
            out.close();
        }
}
