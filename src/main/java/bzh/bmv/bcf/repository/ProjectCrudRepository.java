package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;
import bzh.bmv.bcf.model.Project;
import bzh.bmv.bcf.repository.base.IBaseRepository;

/**
 * <h1>ProjectCrudRepository interface</h1>
 * Database access for the class {@link Project Project.class}
 * @author REVEREAU
 * @since 11-09-2018
 */
@Repository
public interface ProjectCrudRepository extends IBaseRepository<Project, Long>{

}
