package com.personal.asr.caching.example.additional.entity;

import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstractBaseEntity {
  public static final String COLUMN_ID_NAME = "id";

  public static final String COLUMN_VERSION_NAME = "version";

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = COLUMN_ID_NAME, nullable = false)
  private UUID id;

  @Setter(AccessLevel.NONE)
  @Version
  @Column(name = COLUMN_VERSION_NAME)
  private Integer version;

  @Temporal(TemporalType.TIMESTAMP)
  @CreatedDate
  private Date createdDate;

  @Temporal(TemporalType.TIMESTAMP)
  @LastModifiedDate
  private Date lastModifiedDate;

  @CreatedBy
  private String createdBy;

  @LastModifiedBy
  private String modifiedBy;
}
