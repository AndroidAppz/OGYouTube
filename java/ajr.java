/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Comparable
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.math.BigDecimal
 */
import java.math.BigDecimal;

public final class ajr
implements Comparable {
    public final /* synthetic */ int compareTo(Object object) {
        return Float.floatToIntBits((float)0.0f) - Float.floatToIntBits((float)0.0f);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        if (Float.floatToIntBits((float)0.0f) == Float.floatToIntBits((float)0.0f)) return true;
        return false;
    }

    public final int hashCode() {
        return 31 + Float.floatToIntBits((float)0.0f);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append("resolveInfo:").append(((}
    java.lang.NullPointerException: Attempt to invoke interface method 'void org.benf.cfr.reader.bytecode.analysis.types.JavaTypeInstance.dumpInto(org.benf.cfr.reader.util.output.Dumper, org.benf.cfr.reader.state.TypeUsageInformation)' on a null object reference
    
    