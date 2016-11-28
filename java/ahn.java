/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.KeyEvent
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.MotionEvent
 *  android.view.SearchEvent
 *  android.view.View
 *  android.view.Window
 *  android.view.Window$Callback
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.view.accessibility.AccessibilityEvent
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;

public class ahn
implements Window.Callback {
    private Window.Callback a;

    public ahn(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.a = callback;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.a.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.a.onContentChanged();
    }

    public boolean onCreatePanelMenu(int n, Menu menu) {
        return this.a.onCreatePanelMenu(n, menu);
    }

    public View onCreatePanelView(int n) {
        return this.a.onCreatePanelView(n);
    }

    public void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int n, MenuItem menuItem) {
        return this.a.onMenuItemSelected(n, menuItem);
    }

    public boolean onMenuOpened(int n, Menu menu) {
        return this.a.onMenuOpened(n, menu);
    }

    public void onPanelClosed(int n, Menu menu) {
        this.a.onPanelClosed(n, menu);
    }

    public boolean onPreparePanel(int n, View view, Menu menu) {
        return this.a.onPreparePanel(n, view, menu);
    }

    public boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.a.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean bl2) {
        this.a.onWindowFocusChanged(bl2);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.a.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int n) {
        return this.a.onWindowStartingActionMode(callback, n);
    }
}

