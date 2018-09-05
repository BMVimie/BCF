package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;

import bzh.bmv.bcf.model.Project;
import bzh.bmv.bcf.repository.base.IBaseRepository;

@Repository
public interface ProjectCrudRepository extends IBaseRepository<Project, Long>{

}
