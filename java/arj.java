/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class arj {
    private asr a;
    private HashMap b = new HashMap();

    public arj(asr asr2) {
        this.a = asr2;
    }

    private final ari b(ari ari2) {
        ari ari3 = new ari(this.a, ari2);
        ari3.b = this.b;
        ari3.c = (arg[])this.b.values().toArray((Object[])new arg[0]);
        Iterator iterator = this.b.entrySet().iterator();
        while (iterator.hasNext()) {
            ((arg)((Map.Entry)iterator.next()).getValue()).insertIntoFilterGraph(ari3);
        }
        return ari3;
    }

    private final void b() {
        for (arg arg2 : this.b.values()) {
            asw asw2 = arg2.getSignature();
            HashSet hashSet = new HashSet();
            hashSet.addAll((Collection)arg2.getConnectedInputPortMap().keySet());
            if (asw2.a != null) {
                for (Map.Entry entry : asw2.a.entrySet()) {
                    String string = (String)entry.getKey();
                    asx asx2 = (asx)entry.getValue();
                    if (arg2.getConnectedInputPort(string) == null && asx2.a()) {
                        String string2 = String.valueOf((Object)arg2);
                        throw new RuntimeException(new StringBuilder(45 + String.valueOf((Object)string2).length() + String.valueOf((Object)string).length()).append("Filter ").append(string2).append(" does not have required input port '").append(string).append("'!").toString());
                    }
                    hashSet.remove((Object)string);
                }
            }
            if (!asw2.c && !hashSet.isEmpty()) {
                String string = String.valueOf((Object)arg2);
                String string3 = String.valueOf((Object)hashSet);
                throw new RuntimeException(new StringBuilder(34 + String.valueOf((Object)string).length() + String.valueOf((Object)string3).length()).append("Filter ").append(string).append(" has invalid input ports: ").append(string3).append("!").toString());
            }
            asw2.a(arg2);
        }
    }

    public final ari a() {
        this.b();
        return this.b(null);
    }

    public final ari a(ari ari2) {
        if (ari2 == null) {
            throw new NullPointerException("Parent graph must be non-null!");
        }
        super.b();
        return super.b(ari2);
    }

    public final void a(arg arg2) {
        if (this.b.values().contains((Object)arg2)) {
            String string = String.valueOf((Object)arg2);
            throw new IllegalArgumentException(new StringBuilder(55 + String.valueOf((Object)string).length()).append("Attempting to add filter ").append(string).append(" that is in the graph already!").toString());
        }
        if (this.b.containsKey((Object)arg2.getName())) {
            String string = String.valueOf((Object)arg2.getName());
            throw new IllegalArgumentException(new StringBuilder(43 + String.valueOf((Object)string).length()).append("Graph contains filter with name '").append(string).append("' already!").toString());
        }
        this.b.put((Object)arg2.getName(), (Object)arg2);
    }
}

