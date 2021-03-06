package com.cmcc.voicewaveview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cmcc.voicewaveview.view.VoiceWaveView;
import com.echo.voicewaveview.R;

public class MainActivity extends AppCompatActivity {

    VoiceWaveView wvw_main;

    Button btn_main;
    Button btn_main2;
    Button btn_main3;
    Button btn_main4;
    Button btn_main5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wvw_main = (VoiceWaveView) findViewById(R.id.wvw_main);

        btn_main = (Button) findViewById(R.id.btn_main);
        btn_main2 = (Button) findViewById(R.id.btn_main2);
        btn_main3 = (Button) findViewById(R.id.btn_main3);
        btn_main4 = (Button) findViewById(R.id.btn_main4);
        btn_main5 = (Button) findViewById(R.id.btn_main5);

        btn_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wvw_main.startRecord();
            }
        });

        btn_main2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wvw_main.pauseRecord();
            }
        });

        btn_main3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wvw_main.startPlay();
            }
        });

        btn_main4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wvw_main.pausePlay();
            }
        });

        btn_main5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(wvw_main.isShown())
                    wvw_main.setVisibility(View.GONE);
                else
                    wvw_main.setVisibility(View.VISIBLE);
            }
        });
    }
}
