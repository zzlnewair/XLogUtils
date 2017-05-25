package com.zzl.logutils.log.log.parser;

import com.zzl.logutils.log.log.LogConstant;



/**
 * 
 */
public interface Parser<T> {

    String LINE_SEPARATOR = LogConstant.BR;

    Class<T> parseClassType();

    String parseString(T t);
}
