package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p034.p050.C1148;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class ViewStubCompat extends View {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f649;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f650;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public LayoutInflater f651;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public InterfaceC0110 f652;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public WeakReference<View> f653;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$げつ〴ぬぐ, reason: contains not printable characters */
    public interface InterfaceC0110 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void m245(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f649 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1148.ViewStubCompat, i, 0);
        this.f650 = obtainStyledAttributes.getResourceId(C1148.ViewStubCompat_android_inflatedId, -1);
        this.f649 = obtainStyledAttributes.getResourceId(C1148.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C1148.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f650;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f651;
    }

    public int getLayoutResource() {
        return this.f649;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f650 = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f651 = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f649 = i;
    }

    public void setOnInflateListener(InterfaceC0110 interfaceC0110) {
        this.f652 = interfaceC0110;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f653;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m244();
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public View m244() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f649 == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f651;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f649, viewGroup, false);
        int i = this.f650;
        if (i != -1) {
            inflate.setId(i);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f653 = new WeakReference<>(inflate);
        InterfaceC0110 interfaceC0110 = this.f652;
        if (interfaceC0110 != null) {
            interfaceC0110.m245(this, inflate);
        }
        return inflate;
    }
}
