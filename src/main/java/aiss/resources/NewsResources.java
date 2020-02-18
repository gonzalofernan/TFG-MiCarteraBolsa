
package aiss.resources;

import java.util.List;

import org.restlet.resource.ClientResource;

import aiss.model.news.Article;
import aiss.model.news.News;

public class NewsResources {

	private static String URL_NEWS = "https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=843829b70b074bdba05be7b114ff738c";


	public List<Article> getRecentNews() {
		List<Article> res;
		ClientResource cr = new ClientResource(NewsResources.URL_NEWS);

		News news = cr.get(News.class);
		res = news.getArticles();
		for (Article art : res) {
			art.getTitle().replaceAll("‘", "\'").replaceAll("—", "-").replaceAll("’", "\'");

		}
		return res;

	}
}
