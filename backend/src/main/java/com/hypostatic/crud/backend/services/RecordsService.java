package com.hypostatic.crud.backend.services;

import com.hypostatic.crud.backend.dtos.GymRecordDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class RecordsService {
    public List<GymRecordDto> allRecords() {
        return Arrays.asList(
                new GymRecordDto(1L, "Bench press", 130),
                new GymRecordDto(1L, "Squat", 140)
        );
    }
}
