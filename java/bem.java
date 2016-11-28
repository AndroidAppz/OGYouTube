/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.List
 */
import java.util.Collections;
import java.util.List;

public final class bem {
    public final axo a;
    public final List b;
    public final axx c;

    public bem(axo axo2, axx axx2) {
        super(axo2, Collections.emptyList(), axx2);
    }

    public bem(axo axo2, List list, axx axx2) {
        this.a = (axo)blm.a(axo2, "Argument must not be null");
        this.b = (List)blm.a((Object)list, "Argument must not be null");
        this.c = (axx)blm.a(axx2, "Argument must not be null");
    }
}

