package com.vanthe.ecommerce.dao;

import com.vanthe.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCatogory", path="product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {
}
