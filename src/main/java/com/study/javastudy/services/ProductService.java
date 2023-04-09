import com.study.javastudy.repository.ProductRepository;
import com.study.javastudy.model.Product;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProductService{

    @Autowired
    private ProductRepository productRepository; 

    /**
     * Method to return products list
     * @return all products in a list
     */
    public List<Product> getAll(){
        return productRepository.getAll();
    };

    /**
     * Method to get product by id
     * @param id
     * @return product by ID
     */
    public Optional<Product> getById(Integer id){
        return productRepository.getById(id);
    };

    /**
     * Method to add new product
     * @param product will be added
     * @return returns product added into list
     */

    public Product add(Product product){
        return productRepository.add(product);
    };

    /**
     * Method to delete product by id
     * @param id
     */
    public void delete(Integer id){
        productRepository.delete(id);
    };

    /**
     * Method to update a product
     * @param product
     * @return updated product
     */
    public Product update(Integer id, Product product){

        product.setId(id); 
        
        return productRepository.update(product);
    }
}