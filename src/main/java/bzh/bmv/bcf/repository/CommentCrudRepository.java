package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;

import bzh.bmv.bcf.model.Comment;
import bzh.bmv.bcf.repository.base.IBaseRepository;

@Repository
public interface CommentCrudRepository extends IBaseRepository<Comment, Long>{

}
