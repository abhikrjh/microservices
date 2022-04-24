package com.abhicode.MyOrderService.entities;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProductList {
    private List<Product> products;

    public ProductList() {
        products =  new ArrayList<>();
    }

}
