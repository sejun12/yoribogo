package com.app.yoribogo.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Data
public class TagVO implements Serializable {
    private Long id;
    private String tagName;
}
