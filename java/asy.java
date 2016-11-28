/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Map$Entry
 */
import java.util.LinkedHashMap;
import java.util.Map;

final class asy
extends LinkedHashMap {
    private int a = 64;

    public asy() {
        super(65, 1.0f, true);
    }

    protected final boolean removeEldestEntry(Map.Entry entry) {
        if (super.size() > this.a) {
            return true;
        }
        return false;
    }
}

