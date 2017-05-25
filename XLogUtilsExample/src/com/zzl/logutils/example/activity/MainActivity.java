package com.zzl.logutils.example.activity;

import com.zzl.logutils.example.R;
import com.zzl.logutils.example.help.DataHelper;
import com.zzl.logutils.log.XLog;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;

import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * 测试
 */
public class MainActivity extends Activity {

    private Button btnDefaultLog = null;
    private Button btnJsonLog = null;
    private Button btnXMLLog = null;
    private Button btnBigLog = null;

    private Button btnCrash = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.logTest();

        this.crashTest();
    }

    private void logTest() {
        btnDefaultLog = (Button) findViewById(R.id.btn_default_log);
        btnJsonLog = (Button) findViewById(R.id.btn_json_log);
        btnXMLLog = (Button) findViewById(R.id.btn_xml_log);
        btnBigLog = (Button) findViewById(R.id.btn_big_log);

        View.OnClickListener onClickListener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_default_log:
                        // 基本数据类型 byte short int long float double char boolean
                        XLog.v(3.1415926);
                        // 数组
                        XLog.d(DataHelper.getArray());
                        // Map
                        XLog.i(DataHelper.getMap());
                        // List
                        XLog.w(DataHelper.getList());
                        // Intent
                        XLog.e(DataHelper.getIntent());
                        break;
                    case R.id.btn_json_log:
                        XLog.json(DataHelper.getJson());
                        break;
                    case R.id.btn_xml_log:
                        XLog.xml(DataHelper.getXml());
                        break;
                    case R.id.btn_big_log:
                        XLog.d(DataHelper.getBigString(MainActivity.this));
                        break;
                    default:
                        break;
                }
            }
        };

        btnDefaultLog.setOnClickListener(onClickListener);
        btnJsonLog.setOnClickListener(onClickListener);
        btnXMLLog.setOnClickListener(onClickListener);
        btnBigLog.setOnClickListener(onClickListener);
    }

    private void crashTest() {
        btnCrash = (Button) findViewById(R.id.btn_crash);

        View.OnClickListener onClickListener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_crash:
                        throw new RuntimeException("RuntimeException Test");
                    default:
                        break;
                }
            }
        };

        btnCrash.setOnClickListener(onClickListener);
    }

  

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                finish();
                break;
        }
        return super.onKeyDown(keyCode, event);
    }
}
