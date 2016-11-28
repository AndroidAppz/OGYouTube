/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.SurfaceTexture
 *  android.opengl.GLES20
 *  android.opengl.GLUtils
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ThreadLocal
 *  java.util.HashMap
 *  javax.microedition.khronos.egl.EGL10
 *  javax.microedition.khronos.egl.EGLConfig
 *  javax.microedition.khronos.egl.EGLContext
 *  javax.microedition.khronos.egl.EGLDisplay
 *  javax.microedition.khronos.egl.EGLSurface
 */
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import android.util.Log;
import java.util.HashMap;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public final class asv {
    static ThreadLocal a;
    static HashMap d;
    private static boolean e;
    private static HashMap f;
    private static HashMap g;
    private static ThreadLocal h;
    private static EGLConfig j;
    private static EGLDisplay k;
    private static HashMap q;
    private static int r;
    private static int s;
    private static int t;
    private static int u;
    EGLDisplay b;
    EGLContext c;
    private Object i = null;
    private EGL10 l = (EGL10)EGLContext.getEGL();
    private EGLSurface m;
    private int n;
    private boolean o;
    private boolean p;

    /*
     * Enabled aggressive block sorting
     */
    static {
        boolean bl2 = Build.VERSION.SDK_INT >= 11;
        e = bl2;
        f = new HashMap();
        g = new HashMap();
        h = new ThreadLocal();
        a = new ThreadLocal();
        j = null;
        d = new HashMap();
        new HashMap();
        q = new HashMap();
        r = 8;
        s = 8;
        t = 8;
        u = 8;
    }

    asv(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int n, boolean bl2, boolean bl3) {
        this.b = eGLDisplay;
        this.c = eGLContext;
        this.m = eGLSurface;
        this.n = n;
        this.o = bl2;
        this.p = bl3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static asv a() {
        int[] arrn;
        EGL10 eGL10 = (EGL10)EGLContext.getEGL();
        EGLDisplay eGLDisplay = eGL10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eGLDisplay == EGL10.EGL_NO_DISPLAY) {
            String string;
            String string2 = String.valueOf((Object)asv.a(eGL10));
            if (string2.length() != 0) {
                string = "EGL Error: Bad display: ".concat(string2);
                do {
                    throw new RuntimeException(string);
                    break;
                } while (true);
            }
            string = new String("EGL Error: Bad display: ");
            throw new RuntimeException(string);
        }
        if (!eGL10.eglInitialize(eGLDisplay, new int[2])) {
            String string;
            String string3 = String.valueOf((Object)asv.a(eGL10));
            if (string3.length() != 0) {
                string = "EGL Error: eglInitialize failed ".concat(string3);
                do {
                    throw new RuntimeException(string);
                    break;
                } while (true);
            }
            string = new String("EGL Error: eglInitialize failed ");
            throw new RuntimeException(string);
        }
        EGLConfig eGLConfig = asv.a(eGL10, eGLDisplay);
        EGLContext eGLContext = eGL10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, arrn = new int[]{12440, 2, 12344});
        if (eGLContext == EGL10.EGL_NO_CONTEXT) {
            String string;
            String string4 = String.valueOf((Object)asv.a(eGL10));
            if (string4.length() != 0) {
                string = "EGL Error: Bad context: ".concat(string4);
                do {
                    throw new RuntimeException(string);
                    break;
                } while (true);
            }
            string = new String("EGL Error: Bad context: ");
            throw new RuntimeException(string);
        }
        EGLSurface eGLSurface = eGL10.eglCreatePbufferSurface(eGLDisplay, asv.a(eGL10, eGLDisplay), new int[]{12375, 1, 12374, 1, 12344});
        asv asv2 = new asv(eGLDisplay, eGLContext, eGLSurface, 0, true, true);
        asv.a((Object)eGLSurface);
        return asv2;
    }

    private static String a(EGL10 eGL10) {
        int n = eGL10.eglGetError();
        if (Build.VERSION.SDK_INT >= 14) {
            return GLUtils.getEGLErrorString((int)n);
        }
        String string = String.valueOf((Object)Integer.toHexString((int)n));
        if (string.length() != 0) {
            return "EGL Error 0x".concat(string);
        }
        return new String("EGL Error 0x");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static EGLConfig a(EGL10 eGL10, EGLDisplay eGLDisplay) {
        if (j != null && eGLDisplay.equals((Object)k)) return j;
        int[] arrn = new int[]{12352, 4, 12324, r, 12323, s, 12322, t, 12321, u, 12325, 0, 12326, 0, 12344};
        EGLConfig[] arreGLConfig = new EGLConfig[1];
        int[] arrn2 = new int[1];
        if (!eGL10.eglChooseConfig(eGLDisplay, arrn, arreGLConfig, 1, arrn2)) {
            String string;
            String string2 = String.valueOf((Object)asv.a(eGL10));
            if (string2.length() != 0) {
                string = "EGL Error: eglChooseConfig failed ".concat(string2);
                do {
                    throw new IllegalArgumentException(string);
                    break;
                } while (true);
            }
            string = new String("EGL Error: eglChooseConfig failed ");
            throw new IllegalArgumentException(string);
        }
        if (arrn2[0] <= 0) return j;
        j = arreGLConfig[0];
        k = eGLDisplay;
        return j;
    }

    private static void a(Object object) {
        Integer n = (Integer)g.get(object);
        if (n != null) {
            g.put(object, (Object)(1 + n));
            return;
        }
        g.put(object, (Object)1);
    }

    public static asv b() {
        return (asv)h.get();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final asv a(SurfaceTexture surfaceTexture) {
        String string;
        EGLSurface eGLSurface;
        HashMap hashMap;
        EGLConfig eGLConfig = asv.a(this.l, this.b);
        HashMap hashMap2 = hashMap = f;
        synchronized (hashMap2) {
            EGLSurface eGLSurface2 = (EGLSurface)f.get((Object)surfaceTexture);
            if (eGLSurface2 == null) {
                eGLSurface = this.l.eglCreateWindowSurface(this.b, eGLConfig, (Object)surfaceTexture, null);
                f.put((Object)surfaceTexture, (Object)eGLSurface);
            } else {
                eGLSurface = eGLSurface2;
            }
        }
        int n = this.l.eglGetError();
        if (n != 12288) {
            String string2 = String.valueOf((Object)Integer.toHexString((int)n));
            throw new RuntimeException(new StringBuilder(32 + String.valueOf((Object)"eglCreateWindowSurface").length() + String.valueOf((Object)string2).length()).append("Error executing ").append("eglCreateWindowSurface").append("! EGL error = 0x").append(string2).toString());
        }
        EGL10 eGL10 = this.l;
        if (eGLSurface != EGL10.EGL_NO_SURFACE) {
            asv asv2 = new asv(this.b, this.c, eGLSurface, 0, false, true);
            asv2.i = surfaceTexture;
            asv.a((Object)eGLSurface);
            return asv2;
        }
        String string3 = String.valueOf((Object)asv.a(eGL10));
        if (string3.length() != 0) {
            string = "EGL Error: Bad surface: ".concat(string3);
            throw new RuntimeException(string);
        }
        string = new String("EGL Error: Bad surface: ");
        throw new RuntimeException(string);
    }

    public final void c() {
        if ((asv)h.get() != this) {
            this.l.eglMakeCurrent(this.b, this.f(), this.f(), this.c);
            h.set((Object)this);
        }
        int[] arrn = new int[1];
        GLES20.glGetIntegerv((int)36006, (int[])arrn, (int)0);
        if (arrn[0] != this.n) {
            GLES20.glBindFramebuffer((int)36160, (int)this.n);
            asa.a("glBindFramebuffer");
        }
    }

    public final void d() {
        this.l.eglSwapBuffers(this.b, this.f());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        if (this.o) {
            this.l.eglDestroyContext(this.b, this.c);
            this.c = EGL10.EGL_NO_CONTEXT;
        }
        if (this.p) {
            HashMap hashMap;
            HashMap hashMap2 = hashMap = f;
            synchronized (hashMap2) {
                boolean bl2;
                EGLSurface eGLSurface = this.m;
                Integer n = (Integer)g.get((Object)eGLSurface);
                if (n != null && n > 0) {
                    Integer n2 = -1 + n;
                    g.put((Object)eGLSurface, (Object)n2);
                    bl2 = n2 == 0;
                } else {
                    String string = String.valueOf((Object)eGLSurface);
                    Log.e((String)"RenderTarget", (String)new StringBuilder(41 + String.valueOf((Object)string).length()).append("Removing reference of already released: ").append(string).append("!").toString());
                    bl2 = false;
                }
                if (bl2) {
                    this.l.eglDestroySurface(this.b, this.m);
                    this.m = EGL10.EGL_NO_SURFACE;
                    f.remove(this.i);
                }
            }
        }
        if (this.n == 0) return;
        int[] arrn = new int[]{this.n};
        asa.b("glDeleteFramebuffers");
        GLES20.glDeleteFramebuffers((int)1, (int[])arrn, (int)0);
        asa.a("glDeleteFramebuffers");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final EGLSurface f() {
        if (e) {
            return this.m;
        }
        EGLSurface eGLSurface = (EGLSurface)q.get((Object)this.c);
        if (eGLSurface != null) return eGLSurface;
        return this.m;
    }

    public final String toString() {
        String string = String.valueOf((Object)this.b);
        String string2 = String.valueOf((Object)this.c);
        String string3 = String.valueOf((Object)this.m);
        int n = this.n;
        return new StringBuilder(31 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length() + String.valueOf((Object)string3).length()).append("RenderTarget(").append(string).append(", ").append(string2).append(", ").append(string3).append(", ").append(n).append(")").toString();
    }
}

