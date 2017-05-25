package com.zzl.logutils.log.log.parser;



import java.lang.ref.Reference;

import com.zzl.logutils.log.log.util.ObjectUtil;

/**
 * Reference
 */
public class ReferenceParse implements Parser<Reference> {

    @Override
    public Class<Reference> parseClassType() {
        return Reference.class;
    }

    @Override
    public String parseString(Reference reference) {
        Object actual = reference.get();
        StringBuilder builder = new StringBuilder(reference.getClass().getSimpleName() + "<"
                + actual.getClass().getSimpleName() + "> {");
        builder.append("¡ú" + ObjectUtil.objectToString(actual));
        return builder.toString() + "}";
    }
}
