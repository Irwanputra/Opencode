package dev.epro.r0;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G18438633296416354980 implements Window.Callback {
    public final Window.Callback a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ L9687083612725928934 e;

    public G18438633296416354980(L9687083612725928934 l9687083612725928934, Window.Callback callback) {
        this.e = l9687083612725928934;
        if (callback != null) {
            this.a = callback;
        } else {
            S10973172697741180971.j("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.b = true;
            callback.onContentChanged();
        } finally {
            this.b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        this.a.onProvideKeyboardShortcuts(list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.c;
        Window.Callback callback = this.a;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.e.s(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0 != false) goto L32;
     */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            android.view.Window$Callback r0 = r5.a
            boolean r0 = r0.dispatchKeyShortcutEvent(r6)
            r1 = 1
            if (r0 != 0) goto L6a
            int r0 = r6.getKeyCode()
            dev.epro.r0.L9687083612725928934 r5 = r5.e
            r5.y()
            dev.epro.r0.I6301446377683660838 r2 = r5.n
            r3 = 0
            if (r2 == 0) goto L3c
            dev.epro.r0.O9996154012702779839 r2 = r2.i
            if (r2 != 0) goto L1d
        L1b:
            r0 = r3
            goto L39
        L1d:
            dev.epro.r0.T8605657386197958581 r2 = r2.d
            if (r2 == 0) goto L1b
            int r4 = r6.getDeviceId()
            android.view.KeyCharacterMap r4 = android.view.KeyCharacterMap.load(r4)
            int r4 = r4.getKeyboardType()
            if (r4 == r1) goto L31
            r4 = r1
            goto L32
        L31:
            r4 = r3
        L32:
            r2.setQwertyMode(r4)
            boolean r0 = r2.performShortcut(r0, r6, r3)
        L39:
            if (r0 == 0) goto L3c
            goto L6a
        L3c:
            dev.epro.r0.Z6779776290352300882 r0 = r5.K
            if (r0 == 0) goto L51
            int r2 = r6.getKeyCode()
            boolean r0 = r5.D(r0, r2, r6)
            if (r0 == 0) goto L51
            dev.epro.r0.Z6779776290352300882 r5 = r5.K
            if (r5 == 0) goto L6a
            r5.l = r1
            return r1
        L51:
            dev.epro.r0.Z6779776290352300882 r0 = r5.K
            if (r0 != 0) goto L69
            dev.epro.r0.Z6779776290352300882 r0 = r5.x(r3)
            r5.E(r0, r6)
            int r2 = r6.getKeyCode()
            boolean r5 = r5.D(r0, r2, r6)
            r0.k = r3
            if (r5 == 0) goto L69
            goto L6a
        L69:
            return r3
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G18438633296416354980.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.b) {
            this.a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof T8605657386197958581)) {
            return this.a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            L9687083612725928934 l9687083612725928934 = this.e;
            l9687083612725928934.y();
            I6301446377683660838 i6301446377683660838 = l9687083612725928934.n;
            if (i6301446377683660838 != null) {
                ArrayList arrayList = i6301446377683660838.m;
                if (true != i6301446377683660838.l) {
                    i6301446377683660838.l = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        Z3383101362411723454.s();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.d) {
            this.a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        L9687083612725928934 l9687083612725928934 = this.e;
        if (i != 108) {
            if (i == 0) {
                Z6779776290352300882 x = l9687083612725928934.x(i);
                if (x.m) {
                    l9687083612725928934.q(x, false);
                    return;
                }
                return;
            }
            return;
        }
        l9687083612725928934.y();
        I6301446377683660838 i6301446377683660838 = l9687083612725928934.n;
        if (i6301446377683660838 != null) {
            ArrayList arrayList = i6301446377683660838.m;
            if (i6301446377683660838.l) {
                i6301446377683660838.l = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                Z3383101362411723454.s();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        F18342544821595307642.k(this.a, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        T8605657386197958581 t8605657386197958581 = menu instanceof T8605657386197958581 ? (T8605657386197958581) menu : null;
        if (i == 0 && t8605657386197958581 == null) {
            return false;
        }
        if (t8605657386197958581 != null) {
            t8605657386197958581.x = true;
        }
        boolean onPreparePanel = this.a.onPreparePanel(i, view, menu);
        if (t8605657386197958581 != null) {
            t8605657386197958581.x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        T8605657386197958581 t8605657386197958581 = this.e.x(0).h;
        if (t8605657386197958581 != null) {
            d(list, t8605657386197958581, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.a.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.a.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        L9687083612725928934 l9687083612725928934 = this.e;
        Context context = l9687083612725928934.k;
        if (i != 0) {
            return this.a.onWindowStartingActionMode(callback, i);
        }
        J15730374346044043770 j15730374346044043770 = new J15730374346044043770(context, callback);
        F3205875925450835131 f3205875925450835131 = l9687083612725928934.t;
        if (f3205875925450835131 != null) {
            f3205875925450835131.a();
        }
        W8455343525638953052 w8455343525638953052 = new W8455343525638953052((Object) l9687083612725928934, (Object) j15730374346044043770, (byte) 7);
        l9687083612725928934.y();
        I6301446377683660838 i6301446377683660838 = l9687083612725928934.n;
        byte b = 1;
        if (i6301446377683660838 != null) {
            O9996154012702779839 o9996154012702779839 = i6301446377683660838.i;
            if (o9996154012702779839 != null) {
                o9996154012702779839.a();
            }
            i6301446377683660838.c.setHideOnContentScrollEnabled(false);
            i6301446377683660838.f.e();
            O9996154012702779839 o99961540127027798392 = new O9996154012702779839(i6301446377683660838, i6301446377683660838.f.getContext(), w8455343525638953052);
            T8605657386197958581 t8605657386197958581 = o99961540127027798392.d;
            t8605657386197958581.w();
            try {
                if (((J15730374346044043770) o99961540127027798392.e.b).Q(o99961540127027798392, t8605657386197958581)) {
                    i6301446377683660838.i = o99961540127027798392;
                    o99961540127027798392.h();
                    i6301446377683660838.f.c(o99961540127027798392);
                    i6301446377683660838.a(true);
                } else {
                    o99961540127027798392 = null;
                }
                l9687083612725928934.t = o99961540127027798392;
            } finally {
                t8605657386197958581.v();
            }
        }
        if (l9687083612725928934.t == null) {
            Q1445202285683234142 q1445202285683234142 = l9687083612725928934.x;
            if (q1445202285683234142 != null) {
                q1445202285683234142.b();
            }
            F3205875925450835131 f32058759254508351312 = l9687083612725928934.t;
            if (f32058759254508351312 != null) {
                f32058759254508351312.a();
            }
            if (l9687083612725928934.u == null) {
                if (l9687083612725928934.G) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        H16785758874348248089 h16785758874348248089 = new H16785758874348248089(context, 0);
                        h16785758874348248089.getTheme().setTo(newTheme);
                        context = h16785758874348248089;
                    }
                    l9687083612725928934.u = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    l9687083612725928934.v = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    l9687083612725928934.v.setContentView(l9687083612725928934.u);
                    l9687083612725928934.v.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    l9687083612725928934.u.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    l9687083612725928934.v.setHeight(-2);
                    l9687083612725928934.w = new W15073550463345577671(l9687083612725928934, b);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) l9687083612725928934.z.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        l9687083612725928934.y();
                        I6301446377683660838 i63014463776836608382 = l9687083612725928934.n;
                        Context b2 = i63014463776836608382 != null ? i63014463776836608382.b() : null;
                        if (b2 != null) {
                            context = b2;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        l9687083612725928934.u = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (l9687083612725928934.u != null) {
                Q1445202285683234142 q14452022856832341422 = l9687083612725928934.x;
                if (q14452022856832341422 != null) {
                    q14452022856832341422.b();
                }
                l9687083612725928934.u.e();
                Context context2 = l9687083612725928934.u.getContext();
                ActionBarContextView actionBarContextView = l9687083612725928934.u;
                T12650585037911766659 t12650585037911766659 = new T12650585037911766659();
                t12650585037911766659.c = context2;
                t12650585037911766659.d = actionBarContextView;
                t12650585037911766659.e = w8455343525638953052;
                T8605657386197958581 t86056573861979585812 = new T8605657386197958581(actionBarContextView.getContext());
                t86056573861979585812.l = true;
                t12650585037911766659.h = t86056573861979585812;
                t86056573861979585812.e = t12650585037911766659;
                if (((J15730374346044043770) w8455343525638953052.b).Q(t12650585037911766659, t86056573861979585812)) {
                    t12650585037911766659.h();
                    l9687083612725928934.u.c(t12650585037911766659);
                    l9687083612725928934.t = t12650585037911766659;
                    boolean z = l9687083612725928934.y && (viewGroup = l9687083612725928934.z) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = l9687083612725928934.u;
                    if (z) {
                        actionBarContextView2.setAlpha(0.0f);
                        Q1445202285683234142 a = W10240872260424387225.a(l9687083612725928934.u);
                        a.a(1.0f);
                        l9687083612725928934.x = a;
                        a.d(new W8479308777628047383(l9687083612725928934, b));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        l9687083612725928934.u.setVisibility(0);
                        if (l9687083612725928934.u.getParent() instanceof View) {
                            View view = (View) l9687083612725928934.u.getParent();
                            WeakHashMap weakHashMap = W10240872260424387225.a;
                            view.requestApplyInsets();
                        }
                    }
                    if (l9687083612725928934.v != null) {
                        l9687083612725928934.l.getDecorView().post(l9687083612725928934.w);
                    }
                } else {
                    l9687083612725928934.t = null;
                }
            }
            l9687083612725928934.G();
            l9687083612725928934.t = l9687083612725928934.t;
        }
        l9687083612725928934.G();
        F3205875925450835131 f32058759254508351313 = l9687083612725928934.t;
        if (f32058759254508351313 != null) {
            return j15730374346044043770.D(f32058759254508351313);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
