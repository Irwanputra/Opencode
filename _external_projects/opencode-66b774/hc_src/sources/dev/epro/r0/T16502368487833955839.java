package dev.epro.r0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.util.ArrayList;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T16502368487833955839 extends C14538084604686194039 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Handler f;
    public View n;

    /* renamed from: o, reason: collision with root package name */
    public View f499o;
    public int p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public boolean v;
    public C546526958440023066 w;
    public ViewTreeObserver x;
    public PopupWindow.OnDismissListener y;
    public boolean z;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final O1776232730137214479 i = new O1776232730137214479(this, 2);
    public final J10766838134493491179 j = new J10766838134493491179(this, (byte) 1);
    public final H12843822278061842084 k = new H12843822278061842084((Object) this, (byte) 17);
    public int l = 0;
    public int m = 0;
    public boolean u = false;

    public T16502368487833955839(Context context, View view, int i, boolean z) {
        this.b = context;
        this.n = view;
        this.d = i;
        this.e = z;
        this.p = view.getLayoutDirection() == 1 ? (byte) 0 : (byte) 1;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f = new Handler();
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final void a(T8605657386197958581 t8605657386197958581, boolean z) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (t8605657386197958581 == ((A15735106322894363321) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((A15735106322894363321) arrayList.get(i2)).b.c(false);
        }
        A15735106322894363321 a15735106322894363321 = (A15735106322894363321) arrayList.remove(i);
        T8605657386197958581 t86056573861979585812 = a15735106322894363321.b;
        P14632972821668659290 p14632972821668659290 = a15735106322894363321.a;
        F6594473573882211675 f6594473573882211675 = p14632972821668659290.z;
        t86056573861979585812.r(this);
        if (this.z) {
            f6594473573882211675.setExitTransition(null);
            f6594473573882211675.setAnimationStyle(0);
        }
        p14632972821668659290.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.p = ((A15735106322894363321) arrayList.get(size2 - 1)).c;
        } else {
            this.p = this.n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((A15735106322894363321) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        C546526958440023066 c546526958440023066 = this.w;
        if (c546526958440023066 != null) {
            c546526958440023066.a(t8605657386197958581, true);
        }
        ViewTreeObserver viewTreeObserver = this.x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.x.removeGlobalOnLayoutListener(this.i);
            }
            this.x = null;
        }
        this.f499o.removeOnAttachStateChangeListener(this.j);
        this.y.onDismiss();
    }

    @Override // dev.epro.r0.Y1226494281320458288
    public final boolean b() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((A15735106322894363321) arrayList.get(0)).a.z.isShowing();
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final void c() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((A15735106322894363321) obj).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((U12409389856179902213) adapter).notifyDataSetChanged();
        }
    }

    @Override // dev.epro.r0.Y1226494281320458288
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            A15735106322894363321[] a15735106322894363321Arr = (A15735106322894363321[]) arrayList.toArray(new A15735106322894363321[size]);
            for (int i = size - 1; i >= 0; i--) {
                A15735106322894363321 a15735106322894363321 = a15735106322894363321Arr[i];
                if (a15735106322894363321.a.z.isShowing()) {
                    a15735106322894363321.a.dismiss();
                }
            }
        }
    }

    @Override // dev.epro.r0.Y1226494281320458288
    public final void e() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u((T8605657386197958581) obj);
        }
        arrayList.clear();
        View view = this.n;
        this.f499o = view;
        if (view != null) {
            boolean z = this.x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.x = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.f499o.addOnAttachStateChangeListener(this.j);
        }
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final void f(C546526958440023066 c546526958440023066) {
        this.w = c546526958440023066;
    }

    @Override // dev.epro.r0.Y1226494281320458288
    public final S9684361936304835821 g() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((A15735106322894363321) arrayList.get(arrayList.size() - 1)).a.c;
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final boolean h(Q7493219842314740732 q7493219842314740732) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            A15735106322894363321 a15735106322894363321 = (A15735106322894363321) obj;
            if (q7493219842314740732 == a15735106322894363321.b) {
                a15735106322894363321.a.c.requestFocus();
                return true;
            }
        }
        if (!q7493219842314740732.hasVisibleItems()) {
            return false;
        }
        l(q7493219842314740732);
        C546526958440023066 c546526958440023066 = this.w;
        if (c546526958440023066 != null) {
            c546526958440023066.b(q7493219842314740732);
        }
        return true;
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final boolean i() {
        return false;
    }

    @Override // dev.epro.r0.C14538084604686194039
    public final void l(T8605657386197958581 t8605657386197958581) {
        t8605657386197958581.b(this, this.b);
        if (b()) {
            u(t8605657386197958581);
        } else {
            this.g.add(t8605657386197958581);
        }
    }

    @Override // dev.epro.r0.C14538084604686194039
    public final void n(View view) {
        if (this.n != view) {
            this.n = view;
            this.m = Gravity.getAbsoluteGravity(this.l, view.getLayoutDirection());
        }
    }

    @Override // dev.epro.r0.C14538084604686194039
    public final void o(boolean z) {
        this.u = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        A15735106322894363321 a15735106322894363321;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                a15735106322894363321 = null;
                break;
            }
            a15735106322894363321 = (A15735106322894363321) arrayList.get(i);
            if (!a15735106322894363321.a.z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (a15735106322894363321 != null) {
            a15735106322894363321.b.c(false);
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
        if (this.l != i) {
            this.l = i;
            this.m = Gravity.getAbsoluteGravity(i, this.n.getLayoutDirection());
        }
    }

    @Override // dev.epro.r0.C14538084604686194039
    public final void q(int i) {
        this.q = true;
        this.s = i;
    }

    @Override // dev.epro.r0.C14538084604686194039
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.y = onDismissListener;
    }

    @Override // dev.epro.r0.C14538084604686194039
    public final void s(boolean z) {
        this.v = z;
    }

    @Override // dev.epro.r0.C14538084604686194039
    public final void t(int i) {
        this.r = true;
        this.t = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x015b, code lost:
    
        if (((r2.getWidth() + r9[r16]) + r5) > r7.right) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x015d, code lost:
    
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0161, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0166, code lost:
    
        if ((r9[r16] - r5) < 0) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(dev.epro.r0.T8605657386197958581 r19) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.T16502368487833955839.u(dev.epro.r0.T8605657386197958581):void");
    }
}
