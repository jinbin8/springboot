package com.example.demo.entity;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "dog")
@Data
public class Dog {
    private String name;

    @Email
    @Max(1)
    private Map<Object,Object> map;
    private List<Object> list;
}