package sn.isi.l3gl.core.productcore.service;

import java.util.List;

import org.springframework.stereotype.Service;
import sn.isi.l3gl.core.productcore.repository.ProductRepository;
import sn.isi.l3gl.core.productcore.entity.Product;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository){
        this.repository = repository;
    }

    public Product createProduct(Product product){
        return repository.save(product);
    }


    public List<Product> listProducts(){
    return repository.findAll();
    }
}