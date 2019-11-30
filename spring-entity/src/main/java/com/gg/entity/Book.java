package com.gg.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author liqingjian
 * @Date 2019/11/30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable {

    private int id;

    private String bookName;

    private Double price;

    private int userId;

}
