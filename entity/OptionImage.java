package com.ilp.entity;

public class OptionImage extends OptionText {
    private String imageUrl;

    public OptionImage(String optionContent, String imageUrl) {
        super(optionContent);
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

