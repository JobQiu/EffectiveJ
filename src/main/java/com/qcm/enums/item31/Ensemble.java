package com.qcm.enums.item31;

/**
 * Created by Congmin Qiu wb-qcm262540
 * Date: 2017/3/1
 * Time: 13:24
 */
public enum Ensemble {
    SOLO, DUET, TRIO, QUARTET, QUINTET,
    SEXTET, SEPTET, OCTET, NONET, DECTET;

    public int numberOfMusicians() {
        return ordinal() + 1;
    }
}