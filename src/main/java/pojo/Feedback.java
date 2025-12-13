package pojo;

public class Feedback {
	private String Emailid;
	private String suggestion;
	private int rank;
	private String review;
	
	
	public Feedback()
	{
		super();
	}
	
	public Feedback(String Emailid, String suggestion, int rank, String review) {
		super();
		this.Emailid = Emailid;
		this.suggestion = suggestion;
		this.rank = rank;
		this.review = review;
	}

	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		this.Emailid = emailid;
	}
	public String getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
	@Override
	public String toString() {
		return "Feedback [Emailid=" + Emailid + ", suggestion=" + suggestion + ", rank=" + rank + ", review=" + review
				+ "]";
	}
	
	
}
