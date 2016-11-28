/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.LinkedList
 *  java.util.ListIterator
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

final class asf
implements asi {
    private LinkedList a;

    asf() {
    }

    @Override
    public final void a(ash ash2) {
        ash2.b = asb.b;
        ListIterator listIterator = this.a.listIterator();
        while (listIterator.hasNext()) {
            arg arg2 = (arg)listIterator.next();
            if (arg2.isSleeping()) {
                ash2.a = arg2;
                ash2.b = asb.a;
                continue;
            }
            if (!arg2.canSchedule()) continue;
            ash2.a = arg2;
            ash2.b = 100;
            listIterator.remove();
            this.a.add((Object)arg2);
            break;
        }
    }

    @Override
    public final arg[] a(arg[] arrarg) {
        this.a = new LinkedList((Collection)Arrays.asList((Object[])arrarg));
        return arrarg;
    }
}

