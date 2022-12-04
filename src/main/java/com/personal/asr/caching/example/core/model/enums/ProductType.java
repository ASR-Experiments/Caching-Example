package com.personal.asr.caching.example.core.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Broad types of Product")
public enum ProductType {
  DEVICE,
  APPLIANCES,
  COSMETIC,
  EDIBLE,
  STATIONERY,
  FURNITURE,
  OTHER
}
