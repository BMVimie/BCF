package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;

import bzh.bmv.bcf.model.ProjectStep;
import bzh.bmv.bcf.repository.base.IBaseRepository;

@Repository
public interface ProjectStepCrudRepository extends IBaseRepository<ProjectStep, Long>{

}
