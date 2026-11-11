package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p034.p086.p090.C1566;
import p034.p086.p090.C1575;

/* loaded from: /tmp/opencode/hc_real.dex */
public class Constraints extends ViewGroup {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1566 f940;

    public static class LayoutParams extends ConstraintLayout.LayoutParams {

        /* renamed from: 〺〲に〼へ〸, reason: contains not printable characters */
        public float f941;

        /* renamed from: ぁないぼぎへ, reason: contains not printable characters */
        public float f942;

        /* renamed from: ぅばづそほせ, reason: contains not printable characters */
        public float f943;

        /* renamed from: ぉねぞはがぞ, reason: contains not printable characters */
        public float f944;

        /* renamed from: がぐくいおす, reason: contains not printable characters */
        public float f945;

        /* renamed from: しげにけぃ, reason: contains not printable characters */
        public float f946;

        /* renamed from: しぷげへが, reason: contains not printable characters */
        public float f947;

        /* renamed from: せだてはぺて, reason: contains not printable characters */
        public float f948;

        /* renamed from: つしけおつ, reason: contains not printable characters */
        public float f949;

        /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
        public boolean f950;

        /* renamed from: ぱでかぁ〻〹, reason: contains not printable characters */
        public float f951;

        /* renamed from: へえどぜせ, reason: contains not printable characters */
        public float f952;

        /* renamed from: へぼ〳〻び, reason: contains not printable characters */
        public float f953;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f944 = 1.0f;
            this.f950 = false;
            this.f947 = 0.0f;
            this.f953 = 0.0f;
            this.f942 = 0.0f;
            this.f952 = 0.0f;
            this.f943 = 1.0f;
            this.f948 = 1.0f;
            this.f945 = 0.0f;
            this.f946 = 0.0f;
            this.f941 = 0.0f;
            this.f951 = 0.0f;
            this.f949 = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f944 = 1.0f;
            this.f950 = false;
            this.f947 = 0.0f;
            this.f953 = 0.0f;
            this.f942 = 0.0f;
            this.f952 = 0.0f;
            this.f943 = 1.0f;
            this.f948 = 1.0f;
            this.f945 = 0.0f;
            this.f946 = 0.0f;
            this.f941 = 0.0f;
            this.f951 = 0.0f;
            this.f949 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1575.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1575.ConstraintSet_android_alpha) {
                    this.f944 = obtainStyledAttributes.getFloat(index, this.f944);
                } else if (index == C1575.ConstraintSet_android_elevation) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f947 = obtainStyledAttributes.getFloat(index, this.f947);
                        this.f950 = true;
                    }
                } else if (index == C1575.ConstraintSet_android_rotationX) {
                    this.f942 = obtainStyledAttributes.getFloat(index, this.f942);
                } else if (index == C1575.ConstraintSet_android_rotationY) {
                    this.f952 = obtainStyledAttributes.getFloat(index, this.f952);
                } else if (index == C1575.ConstraintSet_android_rotation) {
                    this.f953 = obtainStyledAttributes.getFloat(index, this.f953);
                } else if (index == C1575.ConstraintSet_android_scaleX) {
                    this.f943 = obtainStyledAttributes.getFloat(index, this.f943);
                } else if (index == C1575.ConstraintSet_android_scaleY) {
                    this.f948 = obtainStyledAttributes.getFloat(index, this.f948);
                } else if (index == C1575.ConstraintSet_android_transformPivotX) {
                    this.f945 = obtainStyledAttributes.getFloat(index, this.f945);
                } else if (index == C1575.ConstraintSet_android_transformPivotY) {
                    this.f946 = obtainStyledAttributes.getFloat(index, this.f946);
                } else if (index == C1575.ConstraintSet_android_translationX) {
                    this.f941 = obtainStyledAttributes.getFloat(index, this.f941);
                } else if (index == C1575.ConstraintSet_android_translationY) {
                    this.f951 = obtainStyledAttributes.getFloat(index, this.f951);
                } else if (index == C1575.ConstraintSet_android_translationZ && Build.VERSION.SDK_INT >= 21) {
                    this.f949 = obtainStyledAttributes.getFloat(index, this.f949);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m320();
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m320();
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public C1566 getConstraintSet() {
        if (this.f940 == null) {
            this.f940 = new C1566();
        }
        C1566 c1566 = this.f940;
        c1566.getClass();
        int childCount = getChildCount();
        c1566.f7349.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c1566.f7348 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!c1566.f7349.containsKey(Integer.valueOf(id))) {
                c1566.f7349.put(Integer.valueOf(id), new C1566.C1569());
            }
            C1566.C1569 c1569 = c1566.f7349.get(Integer.valueOf(id));
            if (childAt instanceof ConstraintHelper) {
                ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
                c1569.m3518(id, layoutParams);
                if (constraintHelper instanceof Barrier) {
                    C1566.C1567 c1567 = c1569.f7427;
                    c1567.f7355 = 1;
                    Barrier barrier = (Barrier) constraintHelper;
                    c1567.f7387 = barrier.getType();
                    c1569.f7427.f7403 = barrier.getReferencedIds();
                    c1569.f7427.f7372 = barrier.getMargin();
                }
            }
            c1569.m3518(id, layoutParams);
        }
        return this.f940;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m320() {
    }
}
