package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;
import bzh.bmv.bcf.model.Comment;
import bzh.bmv.bcf.repository.base.IBaseRepository;

/**
 * <h1>CommentCrudRepository interface</h1>
 * Database access for the class {@link Comment Comment.class}.
 * @author REVEREAU
 * @since 11-09-2018
 */
@Repository
public interface CommentCrudRepository extends IBaseRepository<Comment, Long> {

}
