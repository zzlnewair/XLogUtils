package com.zzl.logutils.log;

import com.zzl.logutils.log.log.PrinterManager;



/**
 * ��־������
 */
public class XLog {

    /**
     * ��־��ӡ������
     */
    private static PrinterManager printer = new PrinterManager();

    public XLog() {
        throw new AssertionError();
    }

    /**
     * ��־���-#BBBBBB
     *
     * @param object
     */
    public static void v(Object object) {
        printer.v(object);
    }

    /**
     * ��־���-#0070BB
     *
     * @param object
     */
    public static void d(Object object) {
        printer.d(object);
    }

    /**
     * ��־���-#48BB31
     *
     * @param object
     */
    public static void i(Object object) {
        printer.i(object);
    }

    /**
     * ��־���-# BBBB23
     *
     * @param object
     */
    public static void w(Object object) {
        printer.w(object);
    }

    /**
     * ��־���-#FF0006
     *
     * @param object
     */
    public static void e(Object object) {
        printer.e(object);
    }

    /**
     * ��־���-#8F0005
     *
     * @param object
     */
    public static void wtf(Object object) {
        printer.wtf(object);
    }

    /**
     * Json
     *
     * @param object
     */
    public static void json(Object object) {
        printer.json(object);
    }

    /**
     * XML
     *
     * @param object
     */
    public static void xml(Object object) {
        printer.xml(object);
    }
}