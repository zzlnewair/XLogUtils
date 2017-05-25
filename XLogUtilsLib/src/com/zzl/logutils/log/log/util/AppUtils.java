package com.zzl.logutils.log.log.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;

/**
 * AppUtils
 */
public class AppUtils {

    /**
     * 
     *
     * @param context Context
     * @return 
     */
    public static String getVersionName(Context context) {
        String version = "";
        try {
            PackageInfo pkg = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            version = pkg.versionName;
        } catch (NameNotFoundException e) {
            version = "1.0";
            e.printStackTrace();
        }
        return version;
    }
}