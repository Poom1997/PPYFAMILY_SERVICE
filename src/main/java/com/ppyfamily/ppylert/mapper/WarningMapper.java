package com.ppyfamily.ppylert.mapper;

import com.ppyfamily.ppylert.entity.WarningEntity;
import com.ppyfamily.ppylert.dto.WarningDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class WarningMapper {

  public WarningDto convertWarningEntityListToWarningDto(List<WarningEntity> warningEntityList) {

    List<WarningDto.WarningData> warningDataList =
        warningEntityList.stream()
            .map(
                warningEntity ->
                    WarningDto.WarningData.builder()
                        .warningId(warningEntity.getWarningId())
                        .warningType(warningEntity.getWarningType())
                        .warningSeverity(warningEntity.getWarningSeverity())
                        .warningTopic(warningEntity.getWarningTopic())
                        .warningMessage(warningEntity.getWarningMessage())
                        .warningStart(warningEntity.getWarningStart())
                        .warningEnd(warningEntity.getWarningEnd())
                        .warningStatus(warningEntity.getWarningStatus())
                        .build())
            .collect(Collectors.toList());

    return WarningDto.builder().data(warningDataList).build();
  }
}
