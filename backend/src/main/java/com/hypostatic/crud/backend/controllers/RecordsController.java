package com.hypostatic.crud.backend.controllers;

import com.hypostatic.crud.backend.dtos.GymRecordDto;
import com.hypostatic.crud.backend.services.RecordsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class RecordsController {
    public final RecordsService recordsService;

    @GetMapping("/gym/records")
    public ResponseEntity<List<GymRecordDto>> allRecords() {
        return ResponseEntity.ok(recordsService.allRecords());
    }
}

