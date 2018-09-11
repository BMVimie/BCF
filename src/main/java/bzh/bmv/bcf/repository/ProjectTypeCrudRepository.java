package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;
import bzh.bmv.bcf.model.ProjectType;
import bzh.bmv.bcf.repository.base.IBaseRepository;

/**
 * <h1>ProjectTypeCrudRepository interface</h1>
 * Database access for the class {@link ProjectType ProjectType.class}
 * @author REVEREAU
 * @since 11-09-2018
 */
@Repository
public interface ProjectTypeCrudRepository extends IBaseRepository<ProjectType, Long>{
	
}
