package com.personal.asr.caching.example.core.entity;

import com.personal.asr.caching.example.additional.entity.AbstractBaseEntity;
import com.personal.asr.caching.example.core.model.enums.ProductType;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

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

  @Column(name = COLUMN_NAME_NAME, nullable = false, unique = true)
  private String name;

  @Column(name = COLUMN_BRAND_NAME)
  private String brand;

  @Column(name = COLUMN_CURRENT_PRICE_NAME, nullable = false, precision = 10, scale = 2)
  private BigDecimal currentPrice;

  @Column(name = COLUMN_RETAIL_PRICE_NAME, precision = 10, scale = 2)
  private BigDecimal retailPrice;

  @Enumerated(EnumType.STRING)
  @Column(name = COLUMN_PRODUCT_TYPE_NAME, nullable = false)
  private ProductType productType;

  @Lob
  @Column(name = COLUMN_DESCRIPTION_NAME)
  private String description;

}