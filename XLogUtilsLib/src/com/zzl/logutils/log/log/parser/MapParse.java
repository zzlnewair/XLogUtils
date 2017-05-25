package com.zzl.logutils.log.log.parser;


import java.util.Map;
import java.util.Set;

import com.zzl.logutils.log.log.util.ObjectUtil;

/**
 * Map
 */
public class MapParse implements Parser<Map> {

    @Override
    public Class<Map> parseClassType() {
        return Map.class;
    }

    @Override
    public String parseString(Map map) {
        String msg = map.getClass().getName() + " [" + LINE_SEPARATOR;
        Set<Object> keys = map.keySet();
        for (Object key : keys) {
            String itemString = "%s -> %s" + LINE_SEPARATOR;
            Object value = map.get(key);
            if (value != null) {
                if (value instanceof String) {
                    value = "\"" + value + "\"";
                } else if (value instanceof Character) {
                    value = "\'" + value + "\'";
                }
            }
            msg += String.format(itemString, ObjectUtil.objectToString(key),
                    ObjectUtil.objectToString(value));
        }
        return msg + "]";
    }
}
