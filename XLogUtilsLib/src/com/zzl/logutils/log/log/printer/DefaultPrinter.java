

package com.zzl.logutils.log.log.printer;

import android.util.Log;

/**
 * Default Printer
 */
public class DefaultPrinter implements Printer {

    @Override
    public void printer(Type type, String tag, String object) {
        switch (type) {
            case V:
                Log.v(tag, object);
                break;
            case D:
                Log.d(tag, object);
                break;
            case I:
                Log.i(tag, object);
                break;
            case W:
                Log.w(tag, object);
                break;
            case E:
                Log.e(tag, object);
                break;
            case WTF:
                Log.wtf(tag, object);
                break;
            case J:
                Log.d(tag, object);
                break;
            case X:
                Log.d(tag, object);
                break;
            default:
                break;
        }
    }
}