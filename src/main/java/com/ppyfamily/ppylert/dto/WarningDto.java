package com.ppyfamily.ppylert.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WarningDto {
  private List<WarningData> data;

  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  @Builder
  public static class WarningData {
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
}
