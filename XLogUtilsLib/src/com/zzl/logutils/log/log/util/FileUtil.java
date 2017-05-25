package com.zzl.logutils.log.log.util;

import java.io.File;

/**
 * FileUtil
 */
public class FileUtil {

    public FileUtil() {
        throw new AssertionError();
    }

    /**
     * SD���Ƿ���ڼ��
     *
     * @return SD���Ƿ����
     */
    public static boolean existSDCard() {
        return android.os.Environment.getExternalStorageState().equals(android.os.Environment.MEDIA_MOUNTED);
    }

    /**
     * �����ļ���
     *
     * @param path �ļ��о���·��
     * @return File
     */
    public static boolean createDirectory(String path) {
        File file = new File(path);
        if (!file.exists()) {
            return file.mkdirs();
        } else {
            return true;
        }
    }
}