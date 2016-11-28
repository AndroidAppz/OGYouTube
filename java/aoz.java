/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetFileDescriptor
 *  android.content.res.AssetManager
 *  android.content.res.ColorStateList
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.graphics.Movie
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

class aoz
extends Resources {
    private final Resources a;

    public aoz(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.a = resources;
    }

    public XmlResourceParser getAnimation(int n) {
        return this.a.getAnimation(n);
    }

    public boolean getBoolean(int n) {
        return this.a.getBoolean(n);
    }

    public int getColor(int n) {
        return this.a.getColor(n);
    }

    public ColorStateList getColorStateList(int n) {
        return this.a.getColorStateList(n);
    }

    public Configuration getConfiguration() {
        return this.a.getConfiguration();
    }

    public float getDimension(int n) {
        return this.a.getDimension(n);
    }

    public int getDimensionPixelOffset(int n) {
        return this.a.getDimensionPixelOffset(n);
    }

    public int getDimensionPixelSize(int n) {
        return this.a.getDimensionPixelSize(n);
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.a.getDisplayMetrics();
    }

    public Drawable getDrawable(int n) {
        return this.a.getDrawable(n);
    }

    public Drawable getDrawable(int n, Resources.Theme theme) {
        return this.a.getDrawable(n, theme);
    }

    public Drawable getDrawableForDensity(int n, int n2) {
        return this.a.getDrawableForDensity(n, n2);
    }

    public Drawable getDrawableForDensity(int n, int n2, Resources.Theme theme) {
        return this.a.getDrawableForDensity(n, n2, theme);
    }

    public float getFraction(int n, int n2, int n3) {
        return this.a.getFraction(n, n2, n3);
    }

    public int getIdentifier(String string, String string2, String string3) {
        return this.a.getIdentifier(string, string2, string3);
    }

    public int[] getIntArray(int n) {
        return this.a.getIntArray(n);
    }

    public int getInteger(int n) {
        return this.a.getInteger(n);
    }

    public XmlResourceParser getLayout(int n) {
        return this.a.getLayout(n);
    }

    public Movie getMovie(int n) {
        return this.a.getMovie(n);
    }

    public String getQuantityString(int n, int n2) {
        return this.a.getQuantityString(n, n2);
    }

    public /* varargs */ String getQuantityString(int n, int n2, Object ... arrobject) {
        return this.a.getQuantityString(n, n2, arrobject);
    }

    public CharSequence getQuantityText(int n, int n2) {
        return this.a.getQuantityText(n, n2);
    }

    public String getResourceEntryName(int n) {
        return this.a.getResourceEntryName(n);
    }

    public String getResourceName(int n) {
        return this.a.getResourceName(n);
    }

    public String getResourcePackageName(int n) {
        return this.a.getResourcePackageName(n);
    }

    public String getResourceTypeName(int n) {
        return this.a.getResourceTypeName(n);
    }

    public String getString(int n) {
        return this.a.getString(n);
    }

    public /* varargs */ String getString(int n, Object ... arrobject) {
        return this.a.getString(n, arrobject);
    }

    public String[] getStringArray(int n) {
        return this.a.getStringArray(n);
    }

    public CharSequence getText(int n) {
        return this.a.getText(n);
    }

    public CharSequence getText(int n, CharSequence charSequence) {
        return this.a.getText(n, charSequence);
    }

    public CharSequence[] getTextArray(int n) {
        return this.a.getTextArray(n);
    }

    public void getValue(int n, TypedValue typedValue, boolean bl2) {
        this.a.getValue(n, typedValue, bl2);
    }

    public void getValue(String string, TypedValue typedValue, boolean bl2) {
        this.a.getValue(string, typedValue, bl2);
    }

    public void getValueForDensity(int n, int n2, TypedValue typedValue, boolean bl2) {
        this.a.getValueForDensity(n, n2, typedValue, bl2);
    }

    public XmlResourceParser getXml(int n) {
        return this.a.getXml(n);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] arrn) {
        return this.a.obtainAttributes(attributeSet, arrn);
    }

    public TypedArray obtainTypedArray(int n) {
        return this.a.obtainTypedArray(n);
    }

    public InputStream openRawResource(int n) {
        return this.a.openRawResource(n);
    }

    public InputStream openRawResource(int n, TypedValue typedValue) {
        return this.a.openRawResource(n, typedValue);
    }

    public AssetFileDescriptor openRawResourceFd(int n) {
        return this.a.openRawResourceFd(n);
    }

    public void parseBundleExtra(String string, AttributeSet attributeSet, Bundle bundle) {
        this.a.parseBundleExtra(string, attributeSet, bundle);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.a.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        if (this.a != null) {
            this.a.updateConfiguration(configuration, displayMetrics);
        }
    }
}

