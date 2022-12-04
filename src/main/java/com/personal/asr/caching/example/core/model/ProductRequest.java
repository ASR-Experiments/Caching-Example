package com.personal.asr.caching.example.core.model;

import com.personal.asr.caching.example.additional.model.AbstractBaseModel;
import com.personal.asr.caching.example.core.model.enums.ProductType;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest extends AbstractBaseModel {
  private String name;

  private String brand;

  private BigDecimal currentPrice;

  private BigDecimal retailPrice;

  private ProductType productType;

  private String description;
}
