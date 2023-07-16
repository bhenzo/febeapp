package link.escalenzo.febeapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import link.escalenzo.febeapp.dto.Comment;

@RestController
public class CommentsController {

	
	@GetMapping("/comments")
	public List<Comment> getComments(){
		return List.of(
				new Comment(2L, "Comentario 1"),
				new Comment(3L, "Comentario 2")
				);
	}
}
