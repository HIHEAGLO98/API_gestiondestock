package com.example.gestiondestock.dto;

import com.example.gestiondestock.models.Article;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CategoryDto {
    private Integer id;

    private String code;

    private String  designation;

    private List<ArticleDto> articleDtos;
}
