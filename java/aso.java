/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Field
 *  java.util.Vector
 */
import java.lang.reflect.Field;
import java.util.Vector;

public final class aso {
    arg a;
    public String b;
    asx c;
    asq d = null;
    aru e = null;
    art f = null;
    public boolean g = true;
    public boolean h = false;

    aso(arg arg2, String string, asx asx2) {
        this.a = arg2;
        this.b = string;
        this.c = asx2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Field a(String string, Class class_) {
        Field field = null;
        try {
            field = class_.getDeclaredField(string);
            field.setAccessible(true);
            return field;
        }
        catch (NoSuchFieldException var4_4) {
            Class class_2 = class_.getSuperclass();
            if (class_2 == null) return field;
            return super.a(string, class_2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ark a() {
        aso aso2 = this;
        synchronized (aso2) {
            if (this.f == null) {
                throw new IllegalStateException("Cannot pull frame from closed input port!");
            }
            ark ark2 = this.f.a.c();
            if (ark2 != null) {
                if (this.d != null) {
                    this.d.a(this, ark2);
                }
                this.a.addAutoReleaseFrame(ark2);
                if (ark2.a.c != -1) {
                    this.a.onPulledFrameWithTimestamp(ark2.a.c);
                }
            }
            return ark2;
        }
    }

    public final void a(asu asu2) {
        this.c();
        this.a.openOutputPort(asu2);
        aru aru2 = this.e;
        art art2 = asu2.e;
        aru2.c.add((Object)art2);
    }

    public final void a(String string) {
        Field field = super.a(string, this.a.getClass());
        if (field == null) {
            throw new IllegalArgumentException(new StringBuilder(39 + String.valueOf((Object)string).length()).append("Attempting to bind to unknown field '").append(string).append("'!").toString());
        }
        this.c();
        this.d = new asp((aso)this, field);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean b() {
        aso aso2 = this;
        synchronized (aso2) {
            if (this.f == null) return false;
            boolean bl2 = this.f.a.a();
            if (!bl2) return false;
            return true;
        }
    }

    final void c() {
        if (this.e == null) {
            throw new IllegalStateException("Attempting to attach port while not in attachment stage!");
        }
    }

    public final String toString() {
        String string = String.valueOf((Object)this.a.getName());
        String string2 = this.b;
        return new StringBuilder(1 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length()).append(string).append(":").append(string2).toString();
    }
}

