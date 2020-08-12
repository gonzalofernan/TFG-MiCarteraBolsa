
package aiss;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.financialprep.Company;
import aiss.resources.FinancialPrepResources;

public class SearchCompanyServlet extends HttpServlet {

	private static final long	serialVersionUID	= 1L;
	private static final Logger	log					= Logger.getLogger(SearchCompanyServlet.class.getName());


	@Override
	public void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws IOException {

		FinancialPrepResources resources = new FinancialPrepResources();
		List<Company> list = resources.getCompanies(req.getParameter("name").replace(" ", "%20"));

		req.setAttribute("companies", list);
		req.setAttribute("name", req.getParameter("name"));

		try {
			req.getRequestDispatcher("companies.jsp").forward(req, resp);
			SearchCompanyServlet.log.log(Level.INFO, "Mandando info a pagina radar");
		} catch (ServletException e) {
			e.printStackTrace();
		}

	}
}
