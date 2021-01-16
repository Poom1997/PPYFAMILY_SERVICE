package com.ppyfamily.ppylert.controller;

import com.ppyfamily.ppylert.dto.WarningDto;
import com.ppyfamily.ppylert.service.WarningService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ppylert")
@Slf4j
@RequiredArgsConstructor
public class AlertController {

  private final WarningService warningService;

  @GetMapping("warnings")
  public WarningDto getWarnings() {
    return warningService.getAllWarnings();
  }
}
