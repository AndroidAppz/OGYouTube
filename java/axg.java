/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayInputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
import java.io.ByteArrayInputStream;
import java.util.Map;

public final class axg
extends auq {
    private final axy d;
    private final aus e;
    private final Map f;

    public axg(String string, axy axy2, aus aus2, Map map) {
        super(0, string);
        this.d = axy2;
        this.e = aus2;
        this.f = map;
    }

    @Override
    protected final auu a(aun aun2) {
        this.d.a((Object)new ByteArrayInputStream(aun2.b));
        return auu.a(aun2.b, avn.a(aun2));
    }

    @Override
    protected final avb a(avb avb2) {
        this.d.a(avb2);
        return super.a(avb2);
    }

    @Override
    public final Map i() {
        return this.f;
    }

    @Override
    public final aus r() {
        return this.e;
    }
}

