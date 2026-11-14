package dev.epro.r0;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J17018592638074147698 implements U13539487668147601899 {
    public T8605657386197958581 a;
    public I4217019646703278835 b;
    public final /* synthetic */ Toolbar c;

    public J17018592638074147698(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final void c() {
        if (this.b != null) {
            T8605657386197958581 t8605657386197958581 = this.a;
            if (t8605657386197958581 != null) {
                int size = t8605657386197958581.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            k(this.b);
        }
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final void d(Context context, T8605657386197958581 t8605657386197958581) {
        I4217019646703278835 i4217019646703278835;
        T8605657386197958581 t86056573861979585812 = this.a;
        if (t86056573861979585812 != null && (i4217019646703278835 = this.b) != null) {
            t86056573861979585812.d(i4217019646703278835);
        }
        this.a = t8605657386197958581;
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final boolean h(Q7493219842314740732 q7493219842314740732) {
        return false;
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final boolean i() {
        return false;
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final boolean j(I4217019646703278835 i4217019646703278835) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        View actionView = i4217019646703278835.getActionView();
        toolbar.i = actionView;
        this.b = i4217019646703278835;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            L16872835672943068242 h = Toolbar.h();
            h.a = (toolbar.n & 112) | 8388611;
            h.b = (byte) 2;
            toolbar.i.setLayoutParams(h);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((L16872835672943068242) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.E.add(childAt);
            }
        }
        toolbar.requestLayout();
        i4217019646703278835.C = true;
        i4217019646703278835.n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof T939033232728923374) {
            ((A9431976593427631936) ((T939033232728923374) callback)).a.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final boolean k(I4217019646703278835 i4217019646703278835) {
        Toolbar toolbar = this.c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof T939033232728923374) {
            ((A9431976593427631936) ((T939033232728923374) callback)).a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.b = null;
        toolbar.requestLayout();
        i4217019646703278835.C = false;
        i4217019646703278835.n.p(false);
        toolbar.t();
        return true;
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final void a(T8605657386197958581 t8605657386197958581, boolean z) {
    }
}
