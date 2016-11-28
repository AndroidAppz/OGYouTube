/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
import android.content.ComponentName;

public final class ady {
    final ComponentName a;

    ady(ComponentName componentName) {
        if (componentName == null) {
            throw new IllegalArgumentException("componentName must not be null");
        }
        this.a = componentName;
    }

    public final String toString() {
        return "ProviderMetadata{ componentName=" + this.a.flattenToShortString() + " }";
    }
}

