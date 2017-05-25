package com.zzl.logutils.log.log.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * TimeUtils
 */
public class TimeUtils {

	/** TIME */
	private static final SimpleDateFormat TIME = new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss", Locale.getDefault());

	public TimeUtils() {
		throw new AssertionError();
	}

	/**
	 * ��ʽ������
	 * 
	 * @param rule
	 *            ��ʽ����
	 * @param time
	 *            ʱ���
	 * @return ��ʽ���������
	 */
	public static String formatDate(String rule, long time) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(time);
		return new SimpleDateFormat(rule, Locale.getDefault()).format(calendar.getTime());
	}

	/**
	 * ��ʽ����ǰ����
	 * 
	 * @param rule
	 *            ��ʽ����
	 * @return ��ʽ���������
	 */
	public static String formatDate(String rule) {
		return new SimpleDateFormat(rule, Locale.getDefault()).format(new Date());
	}

	/**
	 * ��ʽ����ǰʱ��
	 * 
	 * @return Time
	 */
	public static String formatTime() {
		return TIME.format(new Date());
	}

	/**
	 * Current TimeMillis
	 * 
	 * @return millis
	 */
	public static long currentTimeMillis() {
		return System.currentTimeMillis();
	}
}