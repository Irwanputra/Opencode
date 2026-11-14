package dev.epro.r0;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class V2419641781538918069 {
    public final Context a;
    public final T8605657386197958581 b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public C546526958440023066 h;
    public C14538084604686194039 i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final A3742417247838262859 k = new A3742417247838262859(this);

    public V2419641781538918069(Context context, T8605657386197958581 t8605657386197958581, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = t8605657386197958581;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final C14538084604686194039 a() {
        C14538084604686194039 t2861735882155554692 = this.i;
        if (t2861735882155554692 == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (iMin >= dimensionPixelSize) {
                t2861735882155554692 = new T16502368487833955839(context2, this.e, this.d, this.c);
            } else {
                t2861735882155554692 = new T2861735882155554692(context2, this.b, this.e, this.d, this.c);
            }
            t2861735882155554692.l(this.b);
            t2861735882155554692.r(this.k);
            t2861735882155554692.n(this.e);
            t2861735882155554692.f(this.h);
            t2861735882155554692.o(this.g);
            t2861735882155554692.p(this.f);
            this.i = t2861735882155554692;
        }
        return t2861735882155554692;
    }

    public final boolean b() {
        C14538084604686194039 c14538084604686194039 = this.i;
        return c14538084604686194039 != null && c14538084604686194039.b();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        C14538084604686194039 c14538084604686194039A = a();
        c14538084604686194039A.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            c14538084604686194039A.q(i);
            c14538084604686194039A.t(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c14538084604686194039A.a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        c14538084604686194039A.e();
    }
}
