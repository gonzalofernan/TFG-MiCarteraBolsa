
package aiss.model.tipranks;

import com.google.appengine.repackaged.com.google.gson.annotations.Expose;
import com.google.appengine.repackaged.com.google.gson.annotations.SerializedName;

public class Rank {

	@SerializedName("ranked")
	@Expose
	private Integer	ranked;
	@SerializedName("outOf")
	@Expose
	private Integer	outOf;
	@SerializedName("sectorRank")
	@Expose
	private Object	sectorRank;
	@SerializedName("starRating")
	@Expose
	private Double	starRating;


	public Integer getRanked() {
		return ranked;
	}

	public void setRanked(final Integer ranked) {
		this.ranked = ranked;
	}

	public Rank withRanked(final Integer ranked) {
		this.ranked = ranked;
		return this;
	}

	public Integer getOutOf() {
		return outOf;
	}

	public void setOutOf(final Integer outOf) {
		this.outOf = outOf;
	}

	public Rank withOutOf(final Integer outOf) {
		this.outOf = outOf;
		return this;
	}

	public Object getSectorRank() {
		return sectorRank;
	}

	public void setSectorRank(final Object sectorRank) {
		this.sectorRank = sectorRank;
	}

	public Rank withSectorRank(final Object sectorRank) {
		this.sectorRank = sectorRank;
		return this;
	}

	public Double getStarRating() {
		return starRating;
	}

	public void setStarRating(final Double starRating) {
		this.starRating = starRating;
	}

	public Rank withStarRating(final Double starRating) {
		this.starRating = starRating;
		return this;
	}

}
