package bzh.bmv.bcf.repository.base;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * <h1>AddressCrudRepository interface</h1>
 * Database access default interface
 * @author REVEREAU
 * @since 11-09-2018
 */
@NoRepositoryBean
public interface IBaseRepository<T, ID extends Serializable> extends CrudRepository<T, ID>{
}

