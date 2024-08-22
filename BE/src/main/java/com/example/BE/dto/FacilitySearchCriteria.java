package com.example.BE.dto;

import lombok.Data;

import java.util.List;

@Data
public class FacilitySearchCriteria {
    private List<Integer> buildingIds;
    private Boolean socketYn;
    private Boolean typingYn;
    private Boolean whisperYn;
    private Boolean loudYn;
    private Boolean teamYn;
    private Boolean lieYn;
    private Boolean eatYn;
    private Boolean convYn;
    private Boolean cafeYn;
    private Boolean computerYn;
    private Boolean reserveYn;
    private Boolean seatYn;
}
