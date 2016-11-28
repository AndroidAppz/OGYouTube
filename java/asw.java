/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class asw {
    HashMap a = null;
    HashMap b = null;
    public boolean c = true;
    private boolean d = true;

    public final asw a() {
        this.c = false;
        this.d = false;
        return this;
    }

    public final asw a(String string, int n, arx arx2) {
        asx asx2 = new asx(n, arx2);
        if (this.a == null) {
            this.a = new HashMap();
        }
        if (this.a.containsKey((Object)string)) {
            throw new RuntimeException(new StringBuilder(42 + String.valueOf((Object)string).length()).append("Attempting to add duplicate input port '").append(string).append("'!").toString());
        }
        this.a.put((Object)string, (Object)asx2);
        return this;
    }

    final void a(arg arg2) {
        HashSet hashSet = new HashSet();
        hashSet.addAll((Collection)arg2.getConnectedOutputPortMap().keySet());
        if (this.b != null) {
            for (Map.Entry entry : this.b.entrySet()) {
                String string = (String)entry.getKey();
                asx asx2 = (asx)entry.getValue();
                if (arg2.getConnectedOutputPort(string) == null && asx2.a()) {
                    String string2 = String.valueOf((Object)arg2);
                    throw new RuntimeException(new StringBuilder(46 + String.valueOf((Object)string2).length() + String.valueOf((Object)string).length()).append("Filter ").append(string2).append(" does not have required output port '").append(string).append("'!").toString());
                }
                hashSet.remove((Object)string);
            }
        }
        if (!this.d && !hashSet.isEmpty()) {
            String string = String.valueOf((Object)arg2);
            String string3 = String.valueOf((Object)hashSet);
            throw new RuntimeException(new StringBuilder(35 + String.valueOf((Object)string).length() + String.valueOf((Object)string3).length()).append("Filter ").append(string).append(" has invalid output ports: ").append(string3).append("!").toString());
        }
    }

    public final asw b(String string, int n, arx arx2) {
        asx asx2 = new asx(n, arx2);
        if (this.b == null) {
            this.b = new HashMap();
        }
        if (this.b.containsKey((Object)string)) {
            throw new RuntimeException(new StringBuilder(43 + String.valueOf((Object)string).length()).append("Attempting to add duplicate output port '").append(string).append("'!").toString());
        }
        this.b.put((Object)string, (Object)asx2);
        return this;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry entry : this.a.entrySet()) {
            stringBuffer.append(String.valueOf((Object)((asx)entry.getValue()).a("input", (String)entry.getKey())).concat("\n"));
        }
        for (Map.Entry entry2 : this.b.entrySet()) {
            stringBuffer.append(String.valueOf((Object)((asx)entry2.getValue()).a("output", (String)entry2.getKey())).concat("\n"));
        }
        if (!this.c) {
            stringBuffer.append("disallow other inputs\n");
        }
        if (!this.d) {
            stringBuffer.append("disallow other outputs\n");
        }
        return stringBuffer.toString();
    }
}

