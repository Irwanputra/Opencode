package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class ActionBarContainer extends android.widget.FrameLayout {
    public boolean a;
    public android.view.View b;
    public android.view.View c;
    public android.graphics.drawable.Drawable d;
    public android.graphics.drawable.Drawable e;
    public android.graphics.drawable.Drawable f;
    public final boolean g;
    public boolean h;
    public final int i;

    public ActionBarContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new dev.epro.r0.O5200913447099250009(this));
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dev.epro.r0.Y17304307076558258116.a);
        boolean z = false;
        this.d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == 2131296731) {
            this.g = true;
            this.f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.g ? !(this.d != null || this.e != null) : this.f == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.d;
        if (drawable != null && drawable.isStateful()) {
            this.d.setState(getDrawableState());
        }
        android.graphics.drawable.Drawable drawable2 = this.e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.e.setState(getDrawableState());
        }
        android.graphics.drawable.Drawable drawable3 = this.f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f.setState(getDrawableState());
    }

    public android.view.View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable drawable3 = this.f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.b = findViewById(2131296308);
        this.c = findViewById(2131296316);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return this.a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.view.View view;
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.g) {
            android.graphics.drawable.Drawable drawable = this.f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.d == null) {
                z2 = false;
            } else if (this.b.getVisibility() == 0 || ((view = this.c) != null && view.getVisibility() == 0)) {
                this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                this.d.setBounds(0, 0, 0, 0);
            }
            this.h = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.b == null && android.view.View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.i) >= 0) {
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i3, android.view.View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.b == null) {
            return;
        }
        android.view.View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.d);
        }
        this.d = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.b != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.g ? !(this.d != null || this.e != null) : this.f == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2;
        android.graphics.drawable.Drawable drawable3 = this.f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f);
        }
        this.f = drawable;
        boolean z = this.g;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.d != null || this.e != null) : this.f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.e);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.h && this.e != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.g ? !(this.d != null || this.e != null) : this.f == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        android.graphics.drawable.Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        android.graphics.drawable.Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        android.graphics.drawable.Drawable drawable3 = this.f;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.ActionMode startActionModeForChild(android.view.View view, android.view.ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.d;
        boolean z = this.g;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.e && this.h) {
            return true;
        }
        return (drawable == this.f && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.ActionMode startActionModeForChild(android.view.View view, android.view.ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(android.content.Context context) {
        this(context, null);
    }

    public void setTabContainer(dev.epro.r0.J6637482083273243667 j6637482083273243667) {
    }
}
