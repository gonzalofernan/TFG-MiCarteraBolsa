
package aiss;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.forms.Form;
import aiss.resources.SECResources;

public class CIKServlet extends HttpServlet {

	private static final long	serialVersionUID	= 1L;
	private static final Logger	log					= Logger.getLogger(CIKServlet.class.getName());


	@Override
	public void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws IOException {

		SECResources resources = new SECResources();
		List<Form> list = resources.getBuysCIK(req.getParameter("cik"));

		for (Form f : list) {
			f.setCompanyName(f.getCompanyName().replace("(see all company filings)", ""));
		}

		req.setAttribute("enlaces", list);
		req.setAttribute("owner", list.get(0).getOwner());

		try {
			req.getRequestDispatcher("radar.jsp").forward(req, resp);
			CIKServlet.log.log(Level.INFO, "Mandando info a pagina radar");
		} catch (ServletException e) {
			e.printStackTrace();
		}

	}

}
