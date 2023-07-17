package link.escalenzo.febeapp.dto;


public class Comment {
	private Long userId;
	private String comment;
	public Comment() {
		
	}
	public Comment (Long userId, String comment) {
		this.setUserId(userId);
		this.setComment(comment);
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
