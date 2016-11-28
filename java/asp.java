/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 */
import java.lang.reflect.Field;

final class asp
implements asq {
    private Field a;
    private /* synthetic */ aso b;

    public asp(aso aso2, Field field) {
        this.b = aso2;
        this.a = field;
    }

    @Override
    public final void a(aso aso2, ark ark2) {
        try {
            if (aso2.c.a.b > 0) {
                aqy aqy2 = ark2.a;
                arz.a(aqy2.a);
                arz arz2 = new arz(aqy2);
                this.a.set((Object)this.b.a, arz2.i());
                return;
            }
            ary ary2 = ark2.b();
            this.a.set((Object)this.b.a, ary2.h());
            return;
        }
        catch (Exception var3_6) {
            String string = String.valueOf((Object)ark2);
            String string2 = String.valueOf((Object)this.a);
            String string3 = String.valueOf((Object)this.b.a);
            throw new RuntimeException(new StringBuilder(55 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length() + String.valueOf((Object)string3).length()).append("Assigning frame ").append(string).append(" to field ").append(string2).append(" of filter ").append(string3).append(" caused exception!").toString(), (Throwable)var3_6);
        }
    }
}

