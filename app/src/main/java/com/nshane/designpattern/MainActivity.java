package com.nshane.designpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.nshane.designpattern.proxy.GF;
import com.nshane.designpattern.proxy.GirlDelegate;

public class MainActivity extends AppCompatActivity {

    private Button btn_run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_run = (Button) findViewById(R.id.btn_run);
        btn_run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GF gf = new GF("小屁孩");

                GirlDelegate gd = new GirlDelegate(gf, MainActivity.this);

                gd.goToHotel();
                gd.goShowering();
                gd.blowJob();
            }
        });
    }
}
