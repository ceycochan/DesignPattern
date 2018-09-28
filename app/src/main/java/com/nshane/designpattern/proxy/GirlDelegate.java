package com.nshane.designpattern.proxy;

import android.content.Context;

/**
 * Created by lbl on 2017/5/23.
 */

public class GirlDelegate implements Desired {
    Ceyco c;

    Context context;

    public GirlDelegate(GF hb, Context context) {
        c = new Ceyco(hb, context);
    }

    @Override
    public void goToHotel() {
        c.goToHotel();
    }

    @Override
    public void goShowering() {
        c.goShowering();
    }

    @Override
    public void blowJob() {
        c.blowJob();
    }
}
