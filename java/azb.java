/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.Map
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class azb {
    final List a = new ArrayList();
    final List b = new ArrayList();
    public avy c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public azh h;
    public axs i;
    public Map j;
    public Class k;
    boolean l;
    boolean m;
    public axo n;
    public avz o;
    public azn p;
    public boolean q;

    azb() {
    }

    final bbs a() {
        return this.h.a();
    }

    final List a(File file) {
        return this.c.b.a((Object)file);
    }

    final boolean a(Class class_) {
        if (this.b(class_) != null) {
            return true;
        }
        return false;
    }

    final bam b(Class class_) {
        return this.c.b.a(class_, this.g, this.k);
    }

    final List b() {
        if (!this.l) {
            this.l = true;
            this.a.clear();
            List list = this.c.b.a(this.d);
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                bem bem2 = ((bel)list.get(i)).a(this.d, this.e, this.f, this.i);
                if (bem2 == null) continue;
                this.a.add((Object)bem2);
            }
        }
        return this.a;
    }

    final axv c(Class class_) {
        axv axv2 = (axv)this.j.get((Object)class_);
        if (axv2 == null) {
            if (this.j.isEmpty() && this.q) {
                String string = String.valueOf((Object)class_);
                throw new IllegalArgumentException(new StringBuilder(115 + String.valueOf((Object)string).length()).append("Missing transformation for ").append(string).append(". If you wish to ignore unknown resource types, use the optional transformation methods.").toString());
            }
            axv2 = (bfz)bfz.b;
        }
        return axv2;
    }

    final List c() {
        if (!this.m) {
            this.m = true;
            this.b.clear();
            List list = this.b();
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                bem bem2 = (bem)list.get(i);
                this.b.add((Object)bem2.a);
                this.b.addAll((Collection)bem2.b);
            }
        }
        return this.b;
    }
}

