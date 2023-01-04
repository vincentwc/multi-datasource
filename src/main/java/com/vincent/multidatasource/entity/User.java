package com.vincent.multidatasource.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.vincent.multidatasource.config.JacksonCustomizerConfig;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author wang_cheng
 * @date 2023/01/04 15:04
 * @desc
 **/
@Data
public class User {

    @JsonSerialize(using = JacksonCustomizerConfig.LocalDateTimeSerializer.class)
    private LocalDateTime dateTime;
}
