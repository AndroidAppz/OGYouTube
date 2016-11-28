/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.hardware.Camera
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  java.util.concurrent.locks.ReentrantLock
 */
import android.hardware.Camera;
import android.os.Build;
import java.util.concurrent.locks.ReentrantLock;

public final class arf {
    static {
        new ReentrantLock();
    }

    public static int a() {
        return Camera.getNumberOfCameras();
    }

    static boolean b() {
        if (Build.VERSION.SDK_INT < 15) {
            return true;
        }
        return false;
    }
}

