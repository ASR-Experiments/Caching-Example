package com.personal.asr.caching.example.core.repository;

import com.personal.asr.caching.example.core.entity.Product;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.Optional;
import java.util.UUID;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@CacheConfig(cacheNames = { "product" })
@Tag(name = "Product Repository", description = "APIs to perform CRUD operations on the Product")
@Repository
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, UUID>, JpaSpecificationExecutor<Product> {

  @Cacheable(key = "#uuid", unless = "#result == null")
  @Override
  Optional<Product> findById(UUID uuid);

  @CacheEvict(key = "#uuid")
  @Override
  void deleteById(UUID uuid);

  @CacheEvict(key = "#result?.getId()")
  @Override
  <S extends Product> S save(S entity);

  @CacheEvict(key = "#entity?.getId()")
  @Override
  void delete(Product entity);

  @CacheEvict(key = "#result?.getId()")
  @Override
  <S extends Product> S saveAndFlush(S entity);
}