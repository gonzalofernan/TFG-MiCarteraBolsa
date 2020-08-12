
package aiss.model.tipranks;

import com.google.appengine.repackaged.com.google.gson.annotations.Expose;
import com.google.appengine.repackaged.com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class FundManager {

	@SerializedName("distribution")
	@Expose
	private Distribution	distribution;
	@SerializedName("recommendations")
	@Expose
	private Recommendations	recommendations;
	@SerializedName("rank")
	@Expose
	private Rank			rank;
	@SerializedName("name")
	@Expose
	private String			name;
	@SerializedName("pictureUrl")
	@Expose
	private Object			pictureUrl;
	@SerializedName("averageReturn")
	@Expose
	private Double			averageReturn;
	@SerializedName("firm")
	@Expose
	private String			firm;
	@SerializedName("sectorId")
	@Expose
	private String			sectorId;
	@SerializedName("uid")
	@Expose
	private String			uid;
	@SerializedName("insiderPosition")
	@Expose
	private Object			insiderPosition;
	@SerializedName("numUsersSubscribedToExpert")
	@Expose
	private Integer			numUsersSubscribedToExpert;
	@SerializedName("hedgeFundValue")
	@Expose
	private Long			hedgeFundValue;
	@SerializedName("hedgeFundName")
	@Expose
	private String			hedgeFundName;
	@SerializedName("insiderCompanyName")
	@Expose
	private Object			insiderCompanyName;
	@SerializedName("expertType")
	@Expose
	private String			expertType;
	@SerializedName("expertId")
	@Expose
	private Integer			expertId;
	@SerializedName("expertPortfolioId")
	@Expose
	private Object			expertPortfolioId;
	@SerializedName("portfolioPerformanceScores")
	@Expose
	private Object			portfolioPerformanceScores;
	@SerializedName("isFollowing")
	@Expose
	private Boolean			isFollowing;
	@SerializedName("portfolioRisk")
	@Expose
	private Object			portfolioRisk;
	@SerializedName("sectorIdEnum")
	@Expose
	private Integer			sectorIdEnum;
	@SerializedName("holdingsCount")
	@Expose
	private Object			holdingsCount;
	@SerializedName("expertTypeIdEnum")
	@Expose
	private Integer			expertTypeIdEnum;
	@SerializedName("portfolioName")
	@Expose
	private Object			portfolioName;
	@SerializedName("followedSince")
	@Expose
	private Object			followedSince;
	@SerializedName("ratings")
	@Expose
	private List<Rating>	ratings	= new ArrayList<Rating>();
	@SerializedName("expertUrlSuffix")
	@Expose
	private Object			expertUrlSuffix;
	@SerializedName("portfolioRiskEnum")
	@Expose
	private Object			portfolioRiskEnum;
	@SerializedName("portfolioBeta")
	@Expose
	private Object			portfolioBeta;


	public Distribution getDistribution() {
		return distribution;
	}

	public void setDistribution(final Distribution distribution) {
		this.distribution = distribution;
	}

	public FundManager withDistribution(final Distribution distribution) {
		this.distribution = distribution;
		return this;
	}

	public Recommendations getRecommendations() {
		return recommendations;
	}

	public void setRecommendations(final Recommendations recommendations) {
		this.recommendations = recommendations;
	}

	public FundManager withRecommendations(final Recommendations recommendations) {
		this.recommendations = recommendations;
		return this;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(final Rank rank) {
		this.rank = rank;
	}

	public FundManager withRank(final Rank rank) {
		this.rank = rank;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public FundManager withName(final String name) {
		this.name = name;
		return this;
	}

	public Object getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(final Object pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public FundManager withPictureUrl(final Object pictureUrl) {
		this.pictureUrl = pictureUrl;
		return this;
	}

	public Double getAverageReturn() {
		return averageReturn;
	}

	public void setAverageReturn(final Double averageReturn) {
		this.averageReturn = averageReturn;
	}

	public FundManager withAverageReturn(final Double averageReturn) {
		this.averageReturn = averageReturn;
		return this;
	}

	public String getFirm() {
		return firm;
	}

	public void setFirm(final String firm) {
		this.firm = firm;
	}

	public FundManager withFirm(final String firm) {
		this.firm = firm;
		return this;
	}

	public String getSectorId() {
		return sectorId;
	}

	public void setSectorId(final String sectorId) {
		this.sectorId = sectorId;
	}

	public FundManager withSectorId(final String sectorId) {
		this.sectorId = sectorId;
		return this;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(final String uid) {
		this.uid = uid;
	}

	public FundManager withUid(final String uid) {
		this.uid = uid;
		return this;
	}

	public Object getInsiderPosition() {
		return insiderPosition;
	}

	public void setInsiderPosition(final Object insiderPosition) {
		this.insiderPosition = insiderPosition;
	}

	public FundManager withInsiderPosition(final Object insiderPosition) {
		this.insiderPosition = insiderPosition;
		return this;
	}

	public Integer getNumUsersSubscribedToExpert() {
		return numUsersSubscribedToExpert;
	}

	public void setNumUsersSubscribedToExpert(final Integer numUsersSubscribedToExpert) {
		this.numUsersSubscribedToExpert = numUsersSubscribedToExpert;
	}

	public FundManager withNumUsersSubscribedToExpert(final Integer numUsersSubscribedToExpert) {
		this.numUsersSubscribedToExpert = numUsersSubscribedToExpert;
		return this;
	}

	public Long getHedgeFundValue() {
		return hedgeFundValue;
	}

	public void setHedgeFundValue(final Long hedgeFundValue) {
		this.hedgeFundValue = hedgeFundValue;
	}

	public FundManager withHedgeFundValue(final Long hedgeFundValue) {
		this.hedgeFundValue = hedgeFundValue;
		return this;
	}

	public String getHedgeFundName() {
		return hedgeFundName;
	}

	public void setHedgeFundName(final String hedgeFundName) {
		this.hedgeFundName = hedgeFundName;
	}

	public FundManager withHedgeFundName(final String hedgeFundName) {
		this.hedgeFundName = hedgeFundName;
		return this;
	}

	public Object getInsiderCompanyName() {
		return insiderCompanyName;
	}

	public void setInsiderCompanyName(final Object insiderCompanyName) {
		this.insiderCompanyName = insiderCompanyName;
	}

	public FundManager withInsiderCompanyName(final Object insiderCompanyName) {
		this.insiderCompanyName = insiderCompanyName;
		return this;
	}

	public String getExpertType() {
		return expertType;
	}

	public void setExpertType(final String expertType) {
		this.expertType = expertType;
	}

	public FundManager withExpertType(final String expertType) {
		this.expertType = expertType;
		return this;
	}

	public Integer getExpertId() {
		return expertId;
	}

	public void setExpertId(final Integer expertId) {
		this.expertId = expertId;
	}

	public FundManager withExpertId(final Integer expertId) {
		this.expertId = expertId;
		return this;
	}

	public Object getExpertPortfolioId() {
		return expertPortfolioId;
	}

	public void setExpertPortfolioId(final Object expertPortfolioId) {
		this.expertPortfolioId = expertPortfolioId;
	}

	public FundManager withExpertPortfolioId(final Object expertPortfolioId) {
		this.expertPortfolioId = expertPortfolioId;
		return this;
	}

	public Object getPortfolioPerformanceScores() {
		return portfolioPerformanceScores;
	}

	public void setPortfolioPerformanceScores(final Object portfolioPerformanceScores) {
		this.portfolioPerformanceScores = portfolioPerformanceScores;
	}

	public FundManager withPortfolioPerformanceScores(final Object portfolioPerformanceScores) {
		this.portfolioPerformanceScores = portfolioPerformanceScores;
		return this;
	}

	public Boolean getIsFollowing() {
		return isFollowing;
	}

	public void setIsFollowing(final Boolean isFollowing) {
		this.isFollowing = isFollowing;
	}

	public FundManager withIsFollowing(final Boolean isFollowing) {
		this.isFollowing = isFollowing;
		return this;
	}

	public Object getPortfolioRisk() {
		return portfolioRisk;
	}

	public void setPortfolioRisk(final Object portfolioRisk) {
		this.portfolioRisk = portfolioRisk;
	}

	public FundManager withPortfolioRisk(final Object portfolioRisk) {
		this.portfolioRisk = portfolioRisk;
		return this;
	}

	public Integer getSectorIdEnum() {
		return sectorIdEnum;
	}

	public void setSectorIdEnum(final Integer sectorIdEnum) {
		this.sectorIdEnum = sectorIdEnum;
	}

	public FundManager withSectorIdEnum(final Integer sectorIdEnum) {
		this.sectorIdEnum = sectorIdEnum;
		return this;
	}

	public Object getHoldingsCount() {
		return holdingsCount;
	}

	public void setHoldingsCount(final Object holdingsCount) {
		this.holdingsCount = holdingsCount;
	}

	public FundManager withHoldingsCount(final Object holdingsCount) {
		this.holdingsCount = holdingsCount;
		return this;
	}

	public Integer getExpertTypeIdEnum() {
		return expertTypeIdEnum;
	}

	public void setExpertTypeIdEnum(final Integer expertTypeIdEnum) {
		this.expertTypeIdEnum = expertTypeIdEnum;
	}

	public FundManager withExpertTypeIdEnum(final Integer expertTypeIdEnum) {
		this.expertTypeIdEnum = expertTypeIdEnum;
		return this;
	}

	public Object getPortfolioName() {
		return portfolioName;
	}

	public void setPortfolioName(final Object portfolioName) {
		this.portfolioName = portfolioName;
	}

	public FundManager withPortfolioName(final Object portfolioName) {
		this.portfolioName = portfolioName;
		return this;
	}

	public Object getFollowedSince() {
		return followedSince;
	}

	public void setFollowedSince(final Object followedSince) {
		this.followedSince = followedSince;
	}

	public FundManager withFollowedSince(final Object followedSince) {
		this.followedSince = followedSince;
		return this;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(final List<Rating> ratings) {
		this.ratings = ratings;
	}

	public FundManager withRatings(final List<Rating> ratings) {
		this.ratings = ratings;
		return this;
	}

	public Object getExpertUrlSuffix() {
		return expertUrlSuffix;
	}

	public void setExpertUrlSuffix(final Object expertUrlSuffix) {
		this.expertUrlSuffix = expertUrlSuffix;
	}

	public FundManager withExpertUrlSuffix(final Object expertUrlSuffix) {
		this.expertUrlSuffix = expertUrlSuffix;
		return this;
	}

	public Object getPortfolioRiskEnum() {
		return portfolioRiskEnum;
	}

	public void setPortfolioRiskEnum(final Object portfolioRiskEnum) {
		this.portfolioRiskEnum = portfolioRiskEnum;
	}

	public FundManager withPortfolioRiskEnum(final Object portfolioRiskEnum) {
		this.portfolioRiskEnum = portfolioRiskEnum;
		return this;
	}

	public Object getPortfolioBeta() {
		return portfolioBeta;
	}

	public void setPortfolioBeta(final Object portfolioBeta) {
		this.portfolioBeta = portfolioBeta;
	}

	public FundManager withPortfolioBeta(final Object portfolioBeta) {
		this.portfolioBeta = portfolioBeta;
		return this;
	}

}
