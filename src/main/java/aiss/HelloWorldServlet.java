
package aiss;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.financialprep.Stock;
import aiss.model.news.Article;
import aiss.resources.FinancialPrepResources;
import aiss.resources.NewsResources;

public class HelloWorldServlet extends HttpServlet {

	private static final long	serialVersionUID	= 1L;
	private static final Logger	log					= Logger.getLogger(HelloWorldServlet.class.getName());


	@Override
	public void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws IOException {
		NewsResources nr = new NewsResources();
		List<Article> lista = nr.getRecentNews();

		FinancialPrepResources fp = new FinancialPrepResources();
		List<Stock> mg = fp.getMostGainers();
		List<Stock> ml = fp.getMostLosers();

		req.setAttribute("noticias", lista);
		req.setAttribute("gainers", mg);
		req.setAttribute("losers", ml);

		try {
			req.getRequestDispatcher("index.jsp").forward(req, resp);
			HelloWorldServlet.log.log(Level.INFO, "Mandando info a pagina principal");
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}
}
