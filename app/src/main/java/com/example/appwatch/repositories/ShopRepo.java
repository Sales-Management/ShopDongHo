package com.example.appwatch.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.appwatch.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopRepo {

    private MutableLiveData<List<Product>> mutableProductList;

    public LiveData<List<Product>> getProducts() {
        if (mutableProductList == null) {
            mutableProductList = new MutableLiveData<>();
            loadProducts();
        }
        return mutableProductList;
    }

    private void loadProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(UUID.randomUUID().toString(), "Apple Watch seri 3", 1299, true, "https://firebasestorage.googleapis.com/v0/b/appwatch-92dd0.appspot.com/o/DongHo%2Fapple-series-3-4g-e34ec47a-050b-4942-a6e9-940061912c74.png?alt=media&token=f6b5fc14-858b-494f-b6dd-a555b2bc9698" ));
        productList.add(new Product(UUID.randomUUID().toString(), "HUBLOT", 799, true, "https://firebasestorage.googleapis.com/v0/b/appwatch-92dd0.appspot.com/o/DongHo%2F2.jpg?alt=media&token=e0c1345f-9ab3-48e5-8193-9da5fef77ce4"));
        productList.add(new Product(UUID.randomUUID().toString(), "Daniel wellington", 999, true, "https://firebasestorage.googleapis.com/v0/b/appwatch-92dd0.appspot.com/o/DongHo%2Fdong-ho-cap-doi-daniel-wellington-classic-black-ashfield-0006dw-0012dw.jpg?alt=media&token=ee22c7d8-cab0-40b0-984b-9991f4d92463"));
        productList.add(new Product(UUID.randomUUID().toString(), "Sam Sung Watch", 699, false, "https://firebasestorage.googleapis.com/v0/b/appwatch-92dd0.appspot.com/o/DongHo%2Fdong-ho-samsung-galaxy-watch-6.jpg?alt=media&token=d66fe250-6547-4dd1-8fad-b54e6c186cfe"));
        productList.add(new Product(UUID.randomUUID().toString(), "Apple Watch seri 6", 999, true, "https://firebasestorage.googleapis.com/v0/b/appwatch-92dd0.appspot.com/o/DongHo%2Funnamed.jpg?alt=media&token=c0ea80a3-622e-4d23-ace8-95584354e823"));
        productList.add(new Product(UUID.randomUUID().toString(), "Tein Top", 1099, true, "https://firebasestorage.googleapis.com/v0/b/appwatch-92dd0.appspot.com/o/DongHo%2FT8646-1_(2).jpg?alt=media&token=4f643f19-27be-4b5e-afb6-6c33f6d982e3"));
        productList.add(new Product(UUID.randomUUID().toString(), "Lobinni", 399, true, "https://firebasestorage.googleapis.com/v0/b/appwatch-92dd0.appspot.com/o/DongHo%2Flobinni-1023-1.jpg?alt=media&token=061eaa37-79ea-4fa6-b1fb-d2130fe46582"));
        productList.add(new Product(UUID.randomUUID().toString(), "Orient", 999, true, "https://firebasestorage.googleapis.com/v0/b/appwatch-92dd0.appspot.com/o/DongHo%2FORIENT-FAC00003W0-4.jpg?alt=media&token=c63bd10d-8c00-4317-9630-327b1de05354"));
        productList.add(new Product(UUID.randomUUID().toString(), "Apple Watch 2", 1299, true, "https://firebasestorage.googleapis.com/v0/b/appwatch-92dd0.appspot.com/o/DongHo%2Fapple-watch-2-gps.jpg?alt=media&token=8a007c21-bcde-4cfe-a738-75816a520547"));
        productList.add(new Product(UUID.randomUUID().toString(), "Jacques", 2399, true, "https://firebasestorage.googleapis.com/v0/b/appwatch-92dd0.appspot.com/o/DongHo%2F1.jfif?alt=media&token=189f2ade-f9fd-4cbb-abe1-4444016ab4d6"));
        mutableProductList.setValue(productList);
    }
}
