package com.ilp.entity;

import com.ilp.interfaces.Option;

public class OptionText implements Option {
    private String optionText;

    public OptionText(String optionText) {
        this.optionText = optionText;
    }

    @Override
    public String getText() {
        return optionText;
    }

    public void setText(String optionText) {
        this.optionText = optionText;
    }
}

