package com.zzl.logutils.log.log.util;

import java.util.Arrays;

/**
 * ArrayUtil
 */
public class ArrayUtil {

    public ArrayUtil() {
        throw new AssertionError();
    }

    /**
     * �Ƿ�Ϊ����
     *
     * @param object
     * @return
     */
    public static boolean isArray(Object object) {
        return object.getClass().isArray();
    }

    /**
     * ��ȡ�����ά��
     *
     * @param object
     * @return
     */
    private static int getArrayDimension(Object object) {
        int dim = 0;
        for (int i = 0; i < object.toString().length(); ++i) {
            if (object.toString().charAt(i) == '[') {
                ++dim;
            } else {
                break;
            }
        }
        return dim;
    }

    /**
     * ��ȡ��������
     *
     * @param object
     * @return
     */
    private static char getType(Object object) {
        if (isArray(object)) {
            String str = object.toString();
            return str.substring(str.lastIndexOf("[") + 1, str.lastIndexOf("[") + 2).charAt(0);
        }
        return 0;
    }

    /**
     * ��������
     *
     * @param result
     * @param array
     */
    private static void traverseArray(StringBuilder result, Object array) {
        if (getArrayDimension(array) == 1) {
            switch (getType(array)) {
                case 'I':
                    result.append(Arrays.toString((int[]) array));
                    break;
                case 'D':
                    result.append(Arrays.toString((double[]) array));
                    break;
                case 'Z':
                    result.append(Arrays.toString((boolean[]) array));
                    break;
                case 'B':
                    result.append(Arrays.toString((byte[]) array));
                    break;
                case 'S':
                    result.append(Arrays.toString((short[]) array));
                    break;
                case 'J':
                    result.append(Arrays.toString((long[]) array));
                    break;
                case 'F':
                    result.append(Arrays.toString((float[]) array));
                    break;
                case 'L':
                    Object[] objects = (Object[]) array;
                    result.append("[");

                    for (int i = 0; i < objects.length; i++) {
                        result.append(ObjectUtil.objectToString(objects[i]));
                        if (i != objects.length - 1) {
                            result.append(",");
                        }
                    }
                    result.append("]");
                    break;
                default:
                    result.append(Arrays.toString((Object[]) array));
                    break;
            }
        } else {
            result.append("[");
            for (int i = 0; i < ((Object[]) array).length; i++) {
                traverseArray(result, ((Object[]) array)[i]);
                if (i != ((Object[]) array).length - 1) {
                    result.append(",");
                }
            }
            result.append("]");
        }
    }

    /**
     * ����������ת��Ϊ�ַ���
     *
     * @param array
     * @return
     */
    public static String parseArray(Object array) {
        StringBuilder result = new StringBuilder();
        traverseArray(result, array);
        return result.toString();
    }
}