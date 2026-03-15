package sn.isi.l3gl.core.productcore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.isi.l3gl.core.productcore.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}