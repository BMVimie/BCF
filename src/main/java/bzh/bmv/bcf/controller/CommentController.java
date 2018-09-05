package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.Comment;

@RestController
@RequestMapping(CommentController.BASE_URL)
public class CommentController extends BaseRestController<Comment, Long> {
	public static final String BASE_URL = "/comment";
}
