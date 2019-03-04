package com.droolsMbp.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product {

    public static final String DIAMOND = "DIAMOND";

    public static final String GOLD = "GOLD";

    private String type;

    private int discount;

}
