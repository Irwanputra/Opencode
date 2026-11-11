package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p045.C1096;
import p034.p050.C1148;
import p034.p050.C1268;
import p034.p050.p053.C1201;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public Drawable f212;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean f213;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Drawable f214;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f215;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public View f216;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public View f217;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public Drawable f218;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public View f219;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean f220;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f221;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1201 c1201 = new C1201(this);
        AtomicInteger atomicInteger = C1096.f5578;
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(c1201);
        } else {
            setBackgroundDrawable(c1201);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1148.ActionBar);
        this.f218 = obtainStyledAttributes.getDrawable(C1148.ActionBar_background);
        this.f214 = obtainStyledAttributes.getDrawable(C1148.ActionBar_backgroundStacked);
        this.f221 = obtainStyledAttributes.getDimensionPixelSize(C1148.ActionBar_height, -1);
        boolean z = true;
        if (getId() == C1268.split_action_bar) {
            this.f220 = true;
            this.f212 = obtainStyledAttributes.getDrawable(C1148.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f220 ? this.f218 != null || this.f214 != null : this.f212 != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f218;
        if (drawable != null && drawable.isStateful()) {
            this.f218.setState(getDrawableState());
        }
        Drawable drawable2 = this.f214;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f214.setState(getDrawableState());
        }
        Drawable drawable3 = this.f212;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f212.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f216;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f218;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f214;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f212;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f219 = findViewById(C1268.action_bar);
        this.f217 = findViewById(C1268.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f213 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        View view2 = this.f216;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            int measuredHeight2 = measuredHeight - view2.getMeasuredHeight();
            int i5 = layoutParams.bottomMargin;
            view2.layout(i, measuredHeight2 - i5, i3, measuredHeight - i5);
        }
        if (this.f220) {
            Drawable drawable3 = this.f212;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f218 != null) {
                if (this.f219.getVisibility() == 0) {
                    drawable2 = this.f218;
                    left = this.f219.getLeft();
                    top = this.f219.getTop();
                    right = this.f219.getRight();
                    view = this.f219;
                } else {
                    View view3 = this.f217;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f218.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.f218;
                        left = this.f217.getLeft();
                        top = this.f217.getTop();
                        right = this.f217.getRight();
                        view = this.f217;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f215 = z4;
            if (!z4 || (drawable = this.f214) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f219
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f221
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f219
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f216
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f219
            boolean r0 = r3.m95(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f219
        L42:
            int r0 = r3.m96(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f217
            boolean r0 = r3.m95(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f217
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f216
            int r1 = r3.m96(r1)
            int r1 = r1 + r0
            int r4 = java.lang.Math.min(r1, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f218;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f218);
        }
        this.f218 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f219;
            if (view != null) {
                this.f218.setBounds(view.getLeft(), this.f219.getTop(), this.f219.getRight(), this.f219.getBottom());
            }
        }
        boolean z = true;
        if (!this.f220 ? this.f218 != null || this.f214 != null : this.f212 != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f212;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f212);
        }
        this.f212 = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f220 && (drawable2 = this.f212) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f220 ? !(this.f218 != null || this.f214 != null) : this.f212 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f214;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f214);
        }
        this.f214 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f215 && (drawable2 = this.f214) != null) {
                drawable2.setBounds(this.f216.getLeft(), this.f216.getTop(), this.f216.getRight(), this.f216.getBottom());
            }
        }
        boolean z = true;
        if (!this.f220 ? this.f218 != null || this.f214 != null : this.f212 != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f216;
        if (view != null) {
            removeView(view);
        }
        this.f216 = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f213 = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f218;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f214;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f212;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f218 && !this.f220) || (drawable == this.f214 && this.f215) || ((drawable == this.f212 && this.f220) || super.verifyDrawable(drawable));
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final boolean m95(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final int m96(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }
}
