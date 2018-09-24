package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.Comment;

/**
 * <h1>CommentController Class</h1>
 * The CommentController class is the controller of {@link Comment Comment.class}.
 * It allows to recover a JSON at the url BASE_URL.
 * @author REVEREAU
 * @since 11-09-2018
 */
@RestController
@RequestMapping(CommentController.BASE_URL)
public class CommentController extends BaseRestController<Comment, Long> {
    /**
     * path to access this controller.
     */
    public static final String BASE_URL = "/comment";
}
