/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
import android.os.Handler;
import android.os.Message;
import java.util.List;

final class bae
implements Handler.Callback {
    bae() {
    }

    public final boolean handleMessage(Message message) {
        bac bac2 = (bac)message.obj;
        switch (message.what) {
            default: {
                int n = message.what;
                throw new IllegalStateException(new StringBuilder(33).append("Unrecognized message: ").append(n).toString());
            }
            case 1: {
                bac2.b.a();
                if (bac2.q) {
                    bac2.j.d();
                    bac2.a(false);
                    return true;
                }
                if (bac2.a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (bac2.l) {
                    throw new IllegalStateException("Already have resource");
                }
                bac2.o = new bai(bac2.j, bac2.h);
                bac2.l = true;
                bac2.o.e();
                bac2.c.a(bac2.g, bac2.o);
                for (bkb bkb2 : bac2.a) {
                    if (bac2.b(bkb2)) continue;
                    bac2.o.e();
                    bkb2.a(bac2.o, bac2.k);
                }
                bac2.o.f();
                bac2.a(false);
                return true;
            }
            case 2: {
                bac2.c();
                return true;
            }
            case 3: 
        }
        bac2.b.a();
        if (!bac2.q) {
            throw new IllegalStateException("Not cancelled");
        }
        bac2.c.a(bac2, bac2.g);
        bac2.a(false);
        return true;
    }
}

