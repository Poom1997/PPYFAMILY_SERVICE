package com.ppyfamily.ppylert.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "ppyLertWarnings")
public class WarningEntity {
  private UUID warningId;
  private String warningType;
  private String warningSeverity;
  private String warningTopic;
  private String warningMessage;
  private Instant warningStart;
  private Instant warningEnd;
  private Instant createdDate;
  private String warningStatus;
}
