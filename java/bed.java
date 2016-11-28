/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 */
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class bed {
    private static final String b = System.getProperty((String)"http.agent");
    private static final Map c;
    Map a = c;

    static {
        HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty((CharSequence)b)) {
            hashMap.put((Object)"User-Agent", (Object)Collections.singletonList((Object)new bee(b)));
        }
        hashMap.put((Object)"Accept-Encoding", (Object)Collections.singletonList((Object)new bee("identity")));
        c = Collections.unmodifiableMap((Map)hashMap);
    }
}

