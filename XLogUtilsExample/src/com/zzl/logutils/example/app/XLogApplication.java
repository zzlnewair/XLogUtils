package com.zzl.logutils.example.app;

import com.zzl.logutils.log.XLog;
import com.zzl.logutils.log.crash.ThreadCatchInterceptor;
import com.zzl.logutils.log.log.LogConfig;

import android.app.Application;


/**
 * XLog Application.
 */
public class XLogApplication extends Application {

 
    private LogConfig logConfig;

    @Override
    public void onCreate() {
        super.onCreate();

        this.logConfig = LogConfig.Buidler
                .buidler()
                .setContext(this)
                .setOpen(true)
                .setTag("zzl-xlog")
                .build();

        ThreadCatchInterceptor.getInstance().install(new ThreadCatchInterceptor.CallBack() {

            @Override
            public void error(Throwable throwable) {
                XLog.i(throwable);
            }

            @Override
            public void finish(String path) {
                XLog.i(path);
            }
        });
    }
}