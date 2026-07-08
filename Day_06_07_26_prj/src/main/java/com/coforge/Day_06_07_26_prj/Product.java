package com.coforge.Day_06_07_26_prj;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Comparable<Product> {

    private int productId;
    private String productName;
    private double price;
    private String category;
    private int quantity;

    @Override
    public int compareTo(Product p) {
        return Integer.compare(this.productId, p.productId);
    }
}