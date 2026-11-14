package dev.epro.r0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T2861735882155554692 extends C14538084604686194039 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context b;
    public final T8605657386197958581 c;
    public final U12409389856179902213 d;
    public final boolean e;
    public final int f;
    public final int g;
    public final P14632972821668659290 h;
    public PopupWindow.OnDismissListener k;
    public View l;
    public View m;
    public C546526958440023066 n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f504o;
    public boolean p;
    public boolean q;
    public int r;
    public boolean t;
    public final O1776232730137214479 i = new O1776232730137214479(this, 3);
    public final J10766838134493491179 j = new J10766838134493491179(this, 2);
    public int s = 0;

    public T2861735882155554692(Context context, T8605657386197958581 t8605657386197958581, View view, int i, boolean z) {
        this.b = context;
        this.c = t8605657386197958581;
        this.e = z;
        this.d = new U12409389856179902213(t8605657386197958581, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.g = i;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.l = view;
        this.h = new P14632972821668659290(context, null, i, 0);
        t8605657386197958581.b(this, context);
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final void a(T8605657386197958581 t8605657386197958581, boolean z) {
        if (t8605657386197958581 != this.c) {
            return;
        }
        dismiss();
        C546526958440023066 c546526958440023066 = this.n;
        if (c546526958440023066 != null) {
            c546526958440023066.a(t8605657386197958581, z);
        }
    }

    @Override // dev.epro.r0.Y1226494281320458288
    public final boolean b() {
        return !this.p && this.h.z.isShowing();
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final void c() {
        this.q = false;
        U12409389856179902213 u12409389856179902213 = this.d;
        if (u12409389856179902213 != null) {
            u12409389856179902213.notifyDataSetChanged();
        }
    }

    @Override // dev.epro.r0.Y1226494281320458288
    public final void dismiss() {
        if (b()) {
            this.h.dismiss();
        }
    }

    @Override // dev.epro.r0.Y1226494281320458288
    public final void e() {
        View view;
        if (b()) {
            return;
        }
        if (this.p || (view = this.l) == null) {
            S10973172697741180971.m("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.m = view;
        P14632972821668659290 p14632972821668659290 = this.h;
        F6594473573882211675 f6594473573882211675 = p14632972821668659290.z;
        F6594473573882211675 f65944735738822116752 = p14632972821668659290.z;
        f6594473573882211675.setOnDismissListener(this);
        p14632972821668659290.p = this;
        p14632972821668659290.y = true;
        f65944735738822116752.setFocusable(true);
        View view2 = this.m;
        boolean z = this.f504o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f504o = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.j);
        p14632972821668659290.f357o = view2;
        p14632972821668659290.l = this.s;
        boolean z2 = this.q;
        Context context = this.b;
        U12409389856179902213 u12409389856179902213 = this.d;
        if (!z2) {
            this.r = C14538084604686194039.m(u12409389856179902213, context, this.f);
            this.q = true;
        }
        p14632972821668659290.q(this.r);
        f65944735738822116752.setInputMethodMode(2);
        Rect rect = this.a;
        p14632972821668659290.x = rect != null ? new Rect(rect) : null;
        p14632972821668659290.e();
        S9684361936304835821 s9684361936304835821 = p14632972821668659290.c;
        s9684361936304835821.setOnKeyListener(this);
        if (this.t) {
            T8605657386197958581 t8605657386197958581 = this.c;
            if (t8605657386197958581.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) s9684361936304835821, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(t8605657386197958581.m);
                }
                frameLayout.setEnabled(false);
                s9684361936304835821.addHeaderView(frameLayout, null, false);
            }
        }
        p14632972821668659290.p(u12409389856179902213);
        p14632972821668659290.e();
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final void f(C546526958440023066 c546526958440023066) {
        this.n = c546526958440023066;
    }

    @Override // dev.epro.r0.Y1226494281320458288
    public final S9684361936304835821 g() {
        return this.h.c;
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final boolean h(Q7493219842314740732 q7493219842314740732) {
        boolean z;
        if (q7493219842314740732.hasVisibleItems()) {
            V2419641781538918069 v2419641781538918069 = new V2419641781538918069(this.b, q7493219842314740732, this.m, this.e, this.g, 0);
            C546526958440023066 c546526958440023066 = this.n;
            v2419641781538918069.h = c546526958440023066;
            C14538084604686194039 c14538084604686194039 = v2419641781538918069.i;
            if (c14538084604686194039 != null) {
                c14538084604686194039.f(c546526958440023066);
            }
            int size = q7493219842314740732.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = q7493219842314740732.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            v2419641781538918069.g = z;
            C14538084604686194039 c145380846046861940392 = v2419641781538918069.i;
            if (c145380846046861940392 != null) {
                c145380846046861940392.o(z);
            }
            v2419641781538918069.j = this.k;
            this.k = null;
            this.c.c(false);
            P14632972821668659290 p14632972821668659290 = this.h;
            int i2 = p14632972821668659290.f;
            int n = p14632972821668659290.n();
            if ((Gravity.getAbsoluteGravity(this.s, this.l.getLayoutDirection()) & 7) == 5) {
                i2 += this.l.getWidth();
            }
            if (!v2419641781538918069.b()) {
                if (v2419641781538918069.e != null) {
                    v2419641781538918069.d(i2, n, true, true);
                }
            }
            C546526958440023066 c5465269584400230662 = this.n;
            if (c5465269584400230662 != null) {
                c5465269584400230662.b(q7493219842314740732);
            }
            return true;
        }
        return false;
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final boolean i() {
        return false;
    }

    @Override // dev.epro.r0.C14538084604686194039
    public final void n(View view) {
        this.l = view;
    }

    @Override // dev.epro.r0.C14538084604686194039
    public final void o(boolean z) {
        this.d.c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.f504o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f504o = this.m.getViewTreeObserver();
            }
            this.f504o.removeGlobalOnLayoutListener(this.i);
            this.f504o = null;
        }
        this.m.removeOnAttachStateChangeListener(this.j);
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // dev.epro.r0.C14538084604686194039
    public final void p(int i) {
        this.s = i;
    }

    @Override // dev.epro.r0.C14538084604686194039
    public final void q(int i) {
        this.h.f = i;
    }

    @Override // dev.epro.r0.C14538084604686194039
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    @Override // dev.epro.r0.C14538084604686194039
    public final void s(boolean z) {
        this.t = z;
    }

    @Override // dev.epro.r0.C14538084604686194039
    public final void t(int i) {
        this.h.j(i);
    }
}
