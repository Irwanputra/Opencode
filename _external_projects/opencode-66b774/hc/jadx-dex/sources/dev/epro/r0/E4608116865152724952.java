package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E4608116865152724952 implements dev.epro.r0.U13539487668147601899, android.widget.AdapterView.OnItemClickListener {
    public android.content.Context a;
    public android.view.LayoutInflater b;
    public dev.epro.r0.T8605657386197958581 c;
    public androidx.appcompat.view.menu.ExpandedMenuView d;
    public dev.epro.r0.C546526958440023066 e;
    public dev.epro.r0.M11787204309148171275 f;

    public E4608116865152724952(android.content.ContextWrapper contextWrapper) {
        this.a = contextWrapper;
        this.b = android.view.LayoutInflater.from(contextWrapper);
    }

    public final void a(dev.epro.r0.T8605657386197958581 t8605657386197958581, boolean z) {
        dev.epro.r0.C546526958440023066 c546526958440023066 = this.e;
        if (c546526958440023066 != null) {
            c546526958440023066.a(t8605657386197958581, z);
        }
    }

    public final void c() {
        dev.epro.r0.M11787204309148171275 m11787204309148171275 = this.f;
        if (m11787204309148171275 != null) {
            m11787204309148171275.notifyDataSetChanged();
        }
    }

    public final void d(android.content.Context context, dev.epro.r0.T8605657386197958581 t8605657386197958581) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = android.view.LayoutInflater.from(context);
            }
        }
        this.c = t8605657386197958581;
        dev.epro.r0.M11787204309148171275 m11787204309148171275 = this.f;
        if (m11787204309148171275 != null) {
            m11787204309148171275.notifyDataSetChanged();
        }
    }

    public final void f(dev.epro.r0.C546526958440023066 c546526958440023066) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [android.app.Dialog, dev.epro.r0.B9683044498301182575] */
    public final boolean h(dev.epro.r0.Q7493219842314740732 q7493219842314740732) {
        boolean zHasVisibleItems = q7493219842314740732.hasVisibleItems();
        android.content.Context context = ((dev.epro.r0.T8605657386197958581) q7493219842314740732).a;
        if (!zHasVisibleItems) {
            return false;
        }
        dev.epro.r0.B13570233856821118719 b13570233856821118719 = new dev.epro.r0.B13570233856821118719();
        b13570233856821118719.a = q7493219842314740732;
        dev.epro.r0.T17032536773975598836 t17032536773975598836 = new dev.epro.r0.T17032536773975598836(context);
        dev.epro.r0.V4825737980590471194 v4825737980590471194 = (dev.epro.r0.V4825737980590471194) t17032536773975598836.b;
        dev.epro.r0.E4608116865152724952 e4608116865152724952 = new dev.epro.r0.E4608116865152724952(v4825737980590471194.a);
        b13570233856821118719.c = e4608116865152724952;
        e4608116865152724952.e = b13570233856821118719;
        q7493219842314740732.b(e4608116865152724952, context);
        dev.epro.r0.E4608116865152724952 e46081168651527249522 = b13570233856821118719.c;
        dev.epro.r0.M11787204309148171275 m11787204309148171275 = e46081168651527249522.f;
        if (m11787204309148171275 == null) {
            m11787204309148171275 = new dev.epro.r0.M11787204309148171275(e46081168651527249522);
            e46081168651527249522.f = m11787204309148171275;
        }
        v4825737980590471194.g = m11787204309148171275;
        v4825737980590471194.h = b13570233856821118719;
        android.view.View view = ((dev.epro.r0.T8605657386197958581) q7493219842314740732).o;
        if (view != null) {
            v4825737980590471194.e = view;
        } else {
            v4825737980590471194.c = ((dev.epro.r0.T8605657386197958581) q7493219842314740732).n;
            v4825737980590471194.d = ((dev.epro.r0.T8605657386197958581) q7493219842314740732).m;
        }
        v4825737980590471194.f = b13570233856821118719;
        ?? D = t17032536773975598836.d();
        b13570233856821118719.b = D;
        D.setOnDismissListener(b13570233856821118719);
        android.view.WindowManager.LayoutParams attributes = b13570233856821118719.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        b13570233856821118719.b.show();
        dev.epro.r0.C546526958440023066 c546526958440023066 = this.e;
        if (c546526958440023066 == null) {
            return true;
        }
        c546526958440023066.b(q7493219842314740732);
        return true;
    }

    public final boolean i() {
        return false;
    }

    public final boolean j(dev.epro.r0.I4217019646703278835 i4217019646703278835) {
        return false;
    }

    public final boolean k(dev.epro.r0.I4217019646703278835 i4217019646703278835) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        this.c.q(this.f.b(i), this, 0);
    }
}
