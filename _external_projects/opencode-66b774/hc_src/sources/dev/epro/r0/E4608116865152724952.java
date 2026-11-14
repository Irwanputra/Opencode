package dev.epro.r0;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E4608116865152724952 implements U13539487668147601899, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public T8605657386197958581 c;
    public ExpandedMenuView d;
    public C546526958440023066 e;
    public M11787204309148171275 f;

    public E4608116865152724952(ContextWrapper contextWrapper) {
        this.a = contextWrapper;
        this.b = LayoutInflater.from(contextWrapper);
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final void a(T8605657386197958581 t8605657386197958581, boolean z) {
        C546526958440023066 c546526958440023066 = this.e;
        if (c546526958440023066 != null) {
            c546526958440023066.a(t8605657386197958581, z);
        }
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final void c() {
        M11787204309148171275 m11787204309148171275 = this.f;
        if (m11787204309148171275 != null) {
            m11787204309148171275.notifyDataSetChanged();
        }
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final void d(Context context, T8605657386197958581 t8605657386197958581) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = t8605657386197958581;
        M11787204309148171275 m11787204309148171275 = this.f;
        if (m11787204309148171275 != null) {
            m11787204309148171275.notifyDataSetChanged();
        }
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final void f(C546526958440023066 c546526958440023066) {
        throw null;
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final boolean h(Q7493219842314740732 q7493219842314740732) {
        boolean hasVisibleItems = q7493219842314740732.hasVisibleItems();
        Context context = q7493219842314740732.a;
        if (!hasVisibleItems) {
            return false;
        }
        B13570233856821118719 b13570233856821118719 = new B13570233856821118719();
        b13570233856821118719.a = q7493219842314740732;
        T17032536773975598836 t17032536773975598836 = new T17032536773975598836(context);
        V4825737980590471194 v4825737980590471194 = (V4825737980590471194) t17032536773975598836.b;
        E4608116865152724952 e4608116865152724952 = new E4608116865152724952(v4825737980590471194.a);
        b13570233856821118719.c = e4608116865152724952;
        e4608116865152724952.e = b13570233856821118719;
        q7493219842314740732.b(e4608116865152724952, context);
        E4608116865152724952 e46081168651527249522 = b13570233856821118719.c;
        M11787204309148171275 m11787204309148171275 = e46081168651527249522.f;
        if (m11787204309148171275 == null) {
            m11787204309148171275 = new M11787204309148171275(e46081168651527249522);
            e46081168651527249522.f = m11787204309148171275;
        }
        v4825737980590471194.g = m11787204309148171275;
        v4825737980590471194.h = b13570233856821118719;
        View view = q7493219842314740732.f512o;
        if (view != null) {
            v4825737980590471194.e = view;
        } else {
            v4825737980590471194.c = q7493219842314740732.n;
            v4825737980590471194.d = q7493219842314740732.m;
        }
        v4825737980590471194.f = b13570233856821118719;
        B9683044498301182575 d = t17032536773975598836.d();
        b13570233856821118719.b = d;
        d.setOnDismissListener(b13570233856821118719);
        WindowManager.LayoutParams attributes = b13570233856821118719.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        b13570233856821118719.b.show();
        C546526958440023066 c546526958440023066 = this.e;
        if (c546526958440023066 == null) {
            return true;
        }
        c546526958440023066.b(q7493219842314740732);
        return true;
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final boolean i() {
        return false;
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final boolean j(I4217019646703278835 i4217019646703278835) {
        return false;
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final boolean k(I4217019646703278835 i4217019646703278835) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.f.getItem(i), this, 0);
    }
}
