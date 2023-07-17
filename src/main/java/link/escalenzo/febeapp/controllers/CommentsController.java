package link.escalenzo.febeapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import link.escalenzo.febeapp.dto.Comment;

@RestController
public class CommentsController {

	@Value("${user}")
	private String user;
	@Value("${password}")
	private String pass;
	
	
	@GetMapping("/comments")
	public List<Comment> getComments(){
		return List.of(
				new Comment(2L, "Comentario 1 " + user),
				new Comment(3L, "Comentario 2 " + pass)
				);
	}
}
