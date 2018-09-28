package com.nshane.designpattern.proxy;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by lbl on 2017/5/22.
 */

public class Ceyco implements Desired {

    GF gf;
    Context context;

    public Ceyco(GF hb, Context context) {
        this.gf = hb;
        this.context = context;
    }

    @Override
    public void goToHotel() {
        Toast.makeText(context, gf.getName() + "hotel arrived", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void goShowering() {
        Toast.makeText(context, gf.getName()+"is showering", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void blowJob() {
        Toast.makeText(context, "blow job ing", Toast.LENGTH_SHORT).show();
    }
}
