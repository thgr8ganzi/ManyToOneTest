package com.example.jointest.domain.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Dto {
    private Long id;
    private String username;
    private Long team_id;
    private String name;
}
