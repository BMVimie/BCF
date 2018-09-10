package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;

import bzh.bmv.bcf.model.ProjectType;
import bzh.bmv.bcf.repository.base.IBaseRepository;

@Repository
public interface ProjectTypeCrudRepository extends IBaseRepository<ProjectType, Long>{
	
}
