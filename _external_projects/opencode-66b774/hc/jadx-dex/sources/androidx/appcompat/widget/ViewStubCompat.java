package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ViewStubCompat extends android.view.View {
    public int a;
    public int b;
    public java.lang.ref.WeakReference c;
    public android.view.LayoutInflater d;

    public ViewStubCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = 0;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dev.epro.r0.Y17304307076558258116.z, 0, 0);
        this.b = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.a = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final android.view.View a() {
        android.view.ViewParent parent = getParent();
        if (!(parent instanceof android.view.ViewGroup)) {
            dev.epro.r0.S10973172697741180971.m("ViewStub must have a non-null ViewGroup viewParent");
            return null;
        }
        if (this.a == 0) {
            dev.epro.r0.S10973172697741180971.j("ViewStub must have a valid layoutResource");
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        android.view.LayoutInflater layoutInflaterFrom = this.d;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        }
        android.view.View viewInflate = layoutInflaterFrom.inflate(this.a, viewGroup, false);
        int i = this.b;
        if (i != -1) {
            viewInflate.setId(i);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.c = new java.lang.ref.WeakReference(viewInflate);
        return viewInflate;
    }

    public int getInflatedId() {
        return this.b;
    }

    public android.view.LayoutInflater getLayoutInflater() {
        return this.d;
    }

    public int getLayoutResource() {
        return this.a;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.b = i;
    }

    public void setLayoutInflater(android.view.LayoutInflater layoutInflater) {
        this.d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.a = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        java.lang.ref.WeakReference weakReference = this.c;
        if (weakReference != null) {
            android.view.View view = (android.view.View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            } else {
                dev.epro.r0.S10973172697741180971.m("setVisibility called on un-referenced view");
                return;
            }
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            a();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
    }

    public void setOnInflateListener(dev.epro.r0.G10876164906605950167 g10876164906605950167) {
    }
}
