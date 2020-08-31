
package aiss;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.financialprep.Portfolio;
import aiss.resources.TipRanksResources;

public class PortfolioServlet extends HttpServlet {

	private static final long	serialVersionUID	= 1L;
	private static final Logger	log					= Logger.getLogger(PortfolioServlet.class.getName());


	@Override
	public void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws IOException {

		TipRanksResources resources = new TipRanksResources();

		Map<String, Integer> holdings = resources.getHoldings();

		List<Portfolio> list = new ArrayList<Portfolio>();

		for (int i = 0; i < holdings.keySet().size(); i++) {
			Portfolio p = new Portfolio();

			p.setName((String) holdings.keySet().toArray()[i]);
			p.setNumber(holdings.get(p.getName()));

			list.add(p);
		}
		Collections.sort(list, Collections.reverseOrder());

		req.setAttribute("list", list);

		try {
			req.getRequestDispatcher("portfolio.jsp").forward(req, resp);
			PortfolioServlet.log.log(Level.INFO, "Mandando info a pagina radar");
		} catch (ServletException e) {
			e.printStackTrace();

		}

	}

}
