package com.android.tonyvu.sc.demo.constant;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.android.tonyvu.sc.demo.model.Product;

public final class Constant {
    public static final List<Integer> QUANTITY_LIST = new ArrayList<Integer>();

    static {
        for (int i = 1; i < 11; i++) QUANTITY_LIST.add(i);
    }

    public static final Product PRODUCT1 = new Product(1, "italian", BigDecimal.valueOf(19), "The sandwich to conquer all hunger. Served on freshly baked bread, The ITALIAN B.M.T.™ is bursting with sliced salami, pepperoni, smoked turkey, and your choice of vegetables and condiments.", "italian");
    public static final Product PRODUCT2 = new Product(2, "tikka", BigDecimal.valueOf(22), "Freshly baked bread stuffed with tender sliced turkey, smoked turkey, crispy bacon, melted cheese, and your choice of tasty vegetables and condiments. Get your mouth over to your nearest SUBWAY®", "tikka");
    public static final Product PRODUCT3 = new Product(3, "tuna", BigDecimal.valueOf(20), "Our tasty Tuna Sandwich is simply sumptuous. Flaked tuna, mixed with mayo, and your choice of fresh vegetables, this local favorite can be built to suit your craving.", "tuna");

    public static final List<Product> PRODUCT_LIST = new ArrayList<Product>();

    static {
        PRODUCT_LIST.add(PRODUCT1);
        PRODUCT_LIST.add(PRODUCT2);
        PRODUCT_LIST.add(PRODUCT3);
    }

    public static final String CURRENCY = "RS";
}
