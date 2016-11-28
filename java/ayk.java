/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.Object
 */
import java.io.InputStream;

public final class ayk
implements axz {
    private final bhb a;

    ayk(InputStream inputStream, baw baw2) {
        this.a = new bhb(inputStream, baw2);
        this.a.mark(5242880);
    }

    @Override
    public final /* synthetic */ Object a() {
        this.a.reset();
        return this.a;
    }

    @Override
    public final void b() {
        this.a.b();
    }
}

