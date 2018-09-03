package bzh.bmv.bcf.repository.base;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IBaseRepository<T, ID extends Serializable> extends CrudRepository<T, ID>{

<<<<<<< HEAD
}
=======
}
>>>>>>> 20cca9dbd5b43cbbd46196f05523ca86b137c735
