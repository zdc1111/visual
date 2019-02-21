package com.apexsoft.visual.mybatis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDomain {
    private BigDecimal userid;

    private String username;

    private String password;

    private String phone;
}