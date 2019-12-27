package com.example.Bean;

import org.springframework.stereotype.Component;

/**
 * @author MrChang
 * @create 2019-12-20 9:32
 */
@Component
public class Vip {
    private Integer cardNum;
    private boolean superVip;

    @Override
    public String toString() {
        return "Vip{" +
                "cardNum=" + cardNum +
                ", superVip=" + superVip +
                '}';
    }

    public Integer getCardNum() {
        return cardNum;
    }

    public void setCardNum(Integer cardNum) {
        this.cardNum = cardNum;
    }

    public boolean isSuperVip() {
        return superVip;
    }

    public void setSuperVip(boolean superVip) {
        this.superVip = superVip;
    }
}
