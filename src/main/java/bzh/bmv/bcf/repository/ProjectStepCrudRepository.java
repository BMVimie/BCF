package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;
import bzh.bmv.bcf.model.ProjectStep;
import bzh.bmv.bcf.repository.base.IBaseRepository;

/**
 * <h1>ProjectStepCrudRepository interface</h1>
 * Database access for the class {@link ProjectStep ProjectStep.class}.
 * @author REVEREAU
 * @since 11-09-2018
 */
@Repository
public interface ProjectStepCrudRepository extends IBaseRepository<ProjectStep, Long> {

}
