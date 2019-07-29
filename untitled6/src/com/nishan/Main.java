package com.nishan;

import com.timbuchalka.DeskPhone;
import com.timbuchalka.ITelephone;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

    }
}
