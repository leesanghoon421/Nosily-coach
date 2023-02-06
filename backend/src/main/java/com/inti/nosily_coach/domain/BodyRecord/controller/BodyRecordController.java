package com.inti.nosily_coach.domain.BodyRecord.controller;

import com.inti.nosily_coach.domain.BodyRecord.service.BodyRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BodyRecordController {
    private final BodyRecordService bodyRecordService;
}
