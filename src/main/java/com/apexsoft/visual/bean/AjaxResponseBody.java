package com.apexsoft.visual.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AjaxResponseBody implements Serializable{
    private String status;
    private String msg;
    private Object result;
    //private String jwtToken;
}
