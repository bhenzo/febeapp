package link.escalenzo.febeapp.dto;



public class Comment {
	private Long userId;
	private String comment;
	public Comment (Long userId, String comment) {
		this.userId = userId;
		this.comment = comment;
	}
}
