package com.example.MyBookShopApp.data;

import java.util.Objects;

public class Book {

    private Integer id;
    private String author;
    private String title;
    private String priceOld;
    private String price;
    private Boolean isNew;
    private Boolean isPopular;
    private Boolean isRecomended;
    private Boolean isCart;
    private Boolean isKept;

    public enum Type {
        Recomended,
        Recent,
        Popular,
        Cart,
        Kept;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPriceOld() {
        return priceOld;
    }

    public void setPriceOld(String priceOld) {
        this.priceOld = priceOld;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public Boolean getPopular() {
        return isPopular;
    }

    public void setPopular(Boolean popular) {
        isPopular = popular;
    }

    public Boolean getRecomended() {
        return isRecomended;
    }

    public void setRecomended(Boolean recomended) {
        isRecomended = recomended;
    }


    public Boolean getCart() {
        return isCart;
    }

    public void setCart(Boolean cart) {
        isCart = cart;
    }

    public Boolean getKept() {
        return isKept;
    }

    public void setKept(Boolean kept) {
        isKept = kept;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", priceOld='" + priceOld + '\'' +
                ", price='" + price + '\'' +
                ", isNew=" + isNew +
                ", isPopular=" + isPopular +
                ", isRecomended=" + isRecomended +
                ", isCart=" + isCart +
                ", isKept=" + isKept +
                '}';
    }
}
