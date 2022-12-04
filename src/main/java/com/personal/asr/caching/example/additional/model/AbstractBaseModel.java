package com.personal.asr.caching.example.additional.model;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractBaseModel implements Serializable {
  private UUID id;

  private Integer version;

  private Date createdDate;

  private Date lastModifiedDate;

  private String createdBy;

  private String modifiedBy;
}
