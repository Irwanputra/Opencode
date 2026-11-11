package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.LinearLayoutCompat;
import p034.p050.C1146;
import p034.p050.C1148;
import p034.p050.C1264;
import p034.p050.C1285;
import p034.p050.p053.RunnableC1211;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f465;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Runnable f466;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f467;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public LinearLayoutCompat f468;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f469;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f470;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Spinner f471;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f472;

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$〺つふすそ, reason: contains not printable characters */
    public class C0083 extends LinearLayout {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final int[] f473;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public ActionBar.AbstractC0036 f475;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public ImageView f476;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public View f477;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public TextView f478;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C0083(android.content.Context r6, androidx.appcompat.app.ActionBar.AbstractC0036 r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.ScrollingTabContainerView.this = r5
                int r5 = p034.p050.C1264.actionBarTabStyle
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 0
                r3 = 16842964(0x10100d4, float:2.3694152E-38)
                r1[r2] = r3
                r4.f473 = r1
                r4.f475 = r7
                android.content.res.TypedArray r5 = r6.obtainStyledAttributes(r0, r1, r5, r2)
                boolean r7 = r5.hasValue(r2)
                if (r7 == 0) goto L37
                boolean r7 = r5.hasValue(r2)
                if (r7 == 0) goto L30
                int r7 = r5.getResourceId(r2, r2)
                if (r7 == 0) goto L30
                android.graphics.drawable.Drawable r6 = p034.p050.p055.p056.C1266.m2928(r6, r7)
                goto L34
            L30:
                android.graphics.drawable.Drawable r6 = r5.getDrawable(r2)
            L34:
                r4.setBackgroundDrawable(r6)
            L37:
                r5.recycle()
                if (r8 == 0) goto L42
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L42:
                r4.m189()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ScrollingTabContainerView.C0083.<init>(androidx.appcompat.widget.ScrollingTabContainerView, android.content.Context, androidx.appcompat.app.ActionBar$〺つふすそ, boolean):void");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (ScrollingTabContainerView.this.f470 > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = ScrollingTabContainerView.this.f470;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m189() {
            ActionBar.AbstractC0036 abstractC0036 = this.f475;
            View m61 = abstractC0036.m61();
            if (m61 != null) {
                ViewParent parent = m61.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(m61);
                    }
                    addView(m61);
                }
                this.f477 = m61;
                TextView textView = this.f478;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f476;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f476.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f477;
            if (view != null) {
                removeView(view);
                this.f477 = null;
            }
            Drawable m62 = abstractC0036.m62();
            CharSequence m65 = abstractC0036.m65();
            if (m62 != null) {
                if (this.f476 == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f476 = appCompatImageView;
                }
                this.f476.setImageDrawable(m62);
                this.f476.setVisibility(0);
            } else {
                ImageView imageView2 = this.f476;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f476.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(m65);
            if (z) {
                if (this.f478 == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, C1264.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f478 = appCompatTextView;
                }
                this.f478.setText(m65);
                this.f478.setVisibility(0);
            } else {
                TextView textView2 = this.f478;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f478.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f476;
            if (imageView3 != null) {
                imageView3.setContentDescription(abstractC0036.m63());
            }
            C2786.m4764(this, z ? null : abstractC0036.m63());
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$くし〴〺ぅ, reason: contains not printable characters */
    public class C0084 extends AnimatorListenerAdapter {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean f480 = false;

        public C0084() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f480 = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f480) {
                return;
            }
            ScrollingTabContainerView.this.getClass();
            ScrollingTabContainerView.this.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.f480 = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0085 extends BaseAdapter {
        public C0085() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return ScrollingTabContainerView.this.f468.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((C0083) ScrollingTabContainerView.this.f468.getChildAt(i)).f475;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view != null) {
                C0083 c0083 = (C0083) view;
                c0083.f475 = ((C0083) ScrollingTabContainerView.this.f468.getChildAt(i)).f475;
                c0083.m189();
                return view;
            }
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            ActionBar.AbstractC0036 abstractC0036 = ((C0083) scrollingTabContainerView.f468.getChildAt(i)).f475;
            scrollingTabContainerView.getClass();
            C0083 c00832 = new C0083(scrollingTabContainerView, scrollingTabContainerView.getContext(), abstractC0036, true);
            c00832.setBackgroundDrawable(null);
            c00832.setLayoutParams(new AbsListView.LayoutParams(-1, scrollingTabContainerView.f465));
            return c00832;
        }
    }

    static {
        new DecelerateInterpolator();
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        new C0084();
        setHorizontalScrollBarEnabled(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C1148.ActionBar, C1264.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C1148.ActionBar_height, 0);
        layoutDimension = context.getResources().getBoolean(C1146.abc_action_bar_embed_tabs) ? layoutDimension : Math.min(layoutDimension, context.getResources().getDimensionPixelSize(C1285.abc_action_bar_stacked_max_height));
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f467 = context.getResources().getDimensionPixelSize(C1285.abc_action_bar_stacked_tab_max_width);
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, C1264.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        this.f468 = linearLayoutCompat;
        addView(linearLayoutCompat, new ViewGroup.LayoutParams(-2, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f466;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C1148.ActionBar, C1264.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C1148.ActionBar_height, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(C1146.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C1285.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f467 = context.getResources().getDimensionPixelSize(C1285.abc_action_bar_stacked_tab_max_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f466;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0083) view).f475.m64();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f468.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f470 = -1;
        } else {
            if (childCount > 2) {
                this.f470 = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f470 = View.MeasureSpec.getSize(i) / 2;
            }
            this.f470 = Math.min(this.f470, this.f467);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f465, 1073741824);
        if (!z && this.f469) {
            this.f468.measure(0, makeMeasureSpec);
            if (this.f468.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                Spinner spinner = this.f471;
                if (!(spinner != null && spinner.getParent() == this)) {
                    if (this.f471 == null) {
                        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, C1264.actionDropDownStyle);
                        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
                        appCompatSpinner.setOnItemSelectedListener(this);
                        this.f471 = appCompatSpinner;
                    }
                    removeView(this.f468);
                    addView(this.f471, new ViewGroup.LayoutParams(-2, -1));
                    if (this.f471.getAdapter() == null) {
                        this.f471.setAdapter((SpinnerAdapter) new C0085());
                    }
                    Runnable runnable = this.f466;
                    if (runnable != null) {
                        removeCallbacks(runnable);
                        this.f466 = null;
                    }
                    this.f471.setSelection(this.f472);
                }
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z || measuredWidth == measuredWidth2) {
                }
                setTabSelected(this.f472);
                return;
            }
        }
        m188();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f469 = z;
    }

    public void setContentHeight(int i) {
        this.f465 = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f472 = i;
        int childCount = this.f468.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f468.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                View childAt2 = this.f468.getChildAt(i);
                Runnable runnable = this.f466;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                RunnableC1211 runnableC1211 = new RunnableC1211(this, childAt2);
                this.f466 = runnableC1211;
                post(runnableC1211);
            }
            i2++;
        }
        Spinner spinner = this.f471;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final boolean m188() {
        Spinner spinner = this.f471;
        if (!(spinner != null && spinner.getParent() == this)) {
            return false;
        }
        removeView(this.f471);
        addView(this.f468, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f471.getSelectedItemPosition());
        return false;
    }
}
