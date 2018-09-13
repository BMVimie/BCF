package bzh.bmv.bcf.controller.base;

import java.io.Serializable;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import bzh.bmv.bcf.repository.base.IBaseRepository;


/**
 * Base Rest Controller.
 * @author REVEREAU, CRONIER
 * @since 2018-09-13
 * @param <T> Object
 * @param <ID> Object identifier
 */
public abstract class BaseRestController<T, ID extends Serializable> {

	/**
	 * Retrieve the application bean for the crud repository.
	 */
	@Autowired
    IBaseRepository<T, ID> crudRepository;

		/**
		 * Get method for read.
		 * @return Object list
		 */
    @RequestMapping(path = {"/", ""}, method = RequestMethod.GET)
    public ResponseEntity<Iterable<T>> index() {
        Iterable<T> items = crudRepository.findAll();
        new ResponseEntity<T>(HttpStatus.OK);
		return ResponseEntity.ok(items);
    }

    /**
     * Method for read one object.
     * @param index Object.id
     * @return Object
     */
    @RequestMapping("/{index}")
    public ResponseEntity<Optional<T>> getByIndex(@PathVariable("index") ID index) {
        Optional<T> item = crudRepository.findById(index);
    	new ResponseEntity<T>(HttpStatus.OK);
		return ResponseEntity.ok(item);
    }

    /**
     * Post method for create.
     * @param item Object
     * @return created Object
     */
    @RequestMapping(path = {"/", ""}, method = RequestMethod.POST)
    public ResponseEntity<T> postItem(@RequestBody T item) {
    	crudRepository.save(item);
    	new ResponseEntity<T>(HttpStatus.OK);
		return ResponseEntity.ok(item);
    }

    /**
     * Put method for modify.
     * @param item Object
     * @return modified Object
     */
    @RequestMapping(path = {"/", ""}, method = RequestMethod.PUT)
    public ResponseEntity<T> updateItem(@RequestBody T item) {
    	crudRepository.save(item);
    	new ResponseEntity<T>(HttpStatus.OK);
		return ResponseEntity.ok(item);
    }

    /**
     * Delete method for delete.
     * @param item Object
     * @return deleted Object
     */
    @RequestMapping(path = {"/", ""}, method = RequestMethod.DELETE)
    public ResponseEntity<T> deleteItem(@RequestBody T item) {
    	crudRepository.delete(item);
        new ResponseEntity<T>(HttpStatus.OK);
		return ResponseEntity.ok(item);
    }
}
