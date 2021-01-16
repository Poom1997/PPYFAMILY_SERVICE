package com.ppyfamily.ppylert.service;

import com.ppyfamily.ppylert.dto.WarningDto;
import com.ppyfamily.ppylert.entity.WarningEntity;
import com.ppyfamily.ppylert.mapper.WarningMapper;
import com.ppyfamily.ppylert.repository.WarningRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class WarningService {

  private final WarningMapper warningMapper;
  private final WarningRepository warningRepository;

  public WarningDto getAllWarnings() {

    WarningDto warningDto = WarningDto.builder().build();

    List<WarningEntity> warningEntityList = warningRepository.findAll();

    return warningMapper.convertWarningEntityListToWarningDto(warningEntityList);
  }
}
