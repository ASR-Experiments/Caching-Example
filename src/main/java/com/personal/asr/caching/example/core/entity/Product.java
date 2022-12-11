package com.personal.asr.caching.example.core.entity;

import com.personal.asr.caching.example.additional.entity.AbstractBaseEntity;
import com.personal.asr.caching.example.core.model.enums.ProductType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuperBuilder
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = Product.TABLE_NAME)
@NoArgsConstructor
public class Product extends AbstractBaseEntity {

  public static final String TABLE_NAME = "TBL_product";

  public static final String COLUMN_NAME_NAME = "name";

  public static final String COLUMN_BRAND_NAME = "brand";

  public static final String COLUMN_CURRENT_PRICE_NAME = "current_price";

  public static final String COLUMN_RETAIL_PRICE_NAME = "retail_price";

  public static final String COLUMN_PRODUCT_TYPE_NAME = "product_type";

  public static final String COLUMN_DESCRIPTION_NAME = "description";

  @Schema(description = "Name of Product")
  @NotNull
  @Column(name = COLUMN_NAME_NAME, nullable = false, unique = true)
  private String name;

  @Schema(description = "Brand of product from which it is associated")
  @Column(name = COLUMN_BRAND_NAME)
  private String brand;

  @Schema(description = "Price for which product is currently available")
  @NotNull
  @Column(name = COLUMN_CURRENT_PRICE_NAME, nullable = false, precision = 10, scale = 2)
  private BigDecimal currentPrice;

  @Schema(description = "Market price for the Product")
  @Column(name = COLUMN_RETAIL_PRICE_NAME, precision = 10, scale = 2)
  private BigDecimal retailPrice;

  @Schema(description = "Broad type of the Product")
  @NotNull
  @Enumerated(EnumType.STRING)
  @Column(name = COLUMN_PRODUCT_TYPE_NAME, nullable = false)
  private ProductType productType;

  @Schema(description = "Detailed description of the Product")
  @Lob
  @Column(name = COLUMN_DESCRIPTION_NAME)
  private String description;

}