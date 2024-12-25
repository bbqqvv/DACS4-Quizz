package DTO;

public class StatisticalDTO {
    private int totalUser;
    private float maxScore;
    private float minScore;
    private float avgScore;
	public StatisticalDTO(int totalUser, float maxScore, float minScore, float avgScore) {
		super();
		this.totalUser = totalUser;
		this.maxScore = maxScore;
		this.minScore = minScore;
		this.avgScore = avgScore;
	}
	public StatisticalDTO() {
		super();
	}
	public int getTotalUser() {
		return totalUser;
	}
	public void setTotalUser(int totalUser) {
		this.totalUser = totalUser;
	}
	public float getMaxScore() {
		return maxScore;
	}
	public void setMaxScore(float maxScore) {
		this.maxScore = maxScore;
	}
	public float getMinScore() {
		return minScore;
	}
	public void setMinScore(float minScore) {
		this.minScore = minScore;
	}
	public float getAvgScore() {
		return avgScore;
	}
	public void setAvgScore(float avgScore) {
		this.avgScore = avgScore;
	}
    
    
    
}
