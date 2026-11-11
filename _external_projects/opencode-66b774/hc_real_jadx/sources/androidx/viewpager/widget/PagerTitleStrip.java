package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p034.p084.p085.AbstractC1512;
import p237.p238.p239.p241.p242.C2786;

@ViewPager.InterfaceC0304
/* loaded from: /tmp/opencode/hc_real.dex */
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static final int[] f1851 = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static final int[] f1852 = {R.attr.textAllCaps};

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f1853;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public ViewPager f1854;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public float f1855;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f1856;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int f1857;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public TextView f1858;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public TextView f1859;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final C0296 f1860;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f1861;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public WeakReference<AbstractC1512> f1862;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public TextView f1863;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public int f1864;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f1865;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean f1866;

    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$〺つふすそ, reason: contains not printable characters */
    public static class C0295 extends SingleLineTransformationMethod {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public Locale f1867;

        public C0295(Context context) {
            this.f1867 = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f1867);
            }
            return null;
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0296 extends DataSetObserver implements ViewPager.InterfaceC0308, ViewPager.InterfaceC0298 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f1868;

        public C0296() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.m1057(pagerTitleStrip.f1854.getCurrentItem(), PagerTitleStrip.this.f1854.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f = pagerTitleStrip2.f1855;
            if (f < 0.0f) {
                f = 0.0f;
            }
            pagerTitleStrip2.mo1056(pagerTitleStrip2.f1854.getCurrentItem(), f, true);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0308
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void mo1059(int i) {
            this.f1868 = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0308
        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public void mo1060(int i) {
            if (this.f1868 == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.m1057(pagerTitleStrip.f1854.getCurrentItem(), PagerTitleStrip.this.f1854.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f = pagerTitleStrip2.f1855;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                pagerTitleStrip2.mo1056(pagerTitleStrip2.f1854.getCurrentItem(), f, true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0308
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void mo1061(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.mo1056(i, f, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0298
        /* renamed from: びぐびあび, reason: contains not printable characters */
        public void mo1062(ViewPager viewPager, AbstractC1512 abstractC1512, AbstractC1512 abstractC15122) {
            PagerTitleStrip.this.m1058(abstractC1512, abstractC15122);
        }
    }

    public PagerTitleStrip(Context context) {
        this(context, null);
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1861 = -1;
        this.f1855 = -1.0f;
        this.f1860 = new C0296();
        TextView textView = new TextView(context);
        this.f1858 = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f1863 = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f1859 = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1851);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            C2786.m4774(this.f1858, resourceId);
            C2786.m4774(this.f1863, resourceId);
            C2786.m4774(this.f1859, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f1858.setTextColor(color);
            this.f1863.setTextColor(color);
            this.f1859.setTextColor(color);
        }
        this.f1865 = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f1857 = this.f1863.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f1858.setEllipsize(TextUtils.TruncateAt.END);
        this.f1863.setEllipsize(TextUtils.TruncateAt.END);
        this.f1859.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f1852);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        TextView textView4 = this.f1858;
        if (z) {
            setSingleLineAllCaps(textView4);
            setSingleLineAllCaps(this.f1863);
            setSingleLineAllCaps(this.f1859);
        } else {
            textView4.setSingleLine();
            this.f1863.setSingleLine();
            this.f1859.setSingleLine();
        }
        this.f1853 = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new C0295(textView.getContext()));
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f1853;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        AbstractC1512 adapter = viewPager.getAdapter();
        C0296 c0296 = this.f1860;
        viewPager.f1926 = c0296;
        if (viewPager.f1916 == null) {
            viewPager.f1916 = new ArrayList();
        }
        viewPager.f1916.add(c0296);
        this.f1854 = viewPager;
        WeakReference<AbstractC1512> weakReference = this.f1862;
        m1058(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f1854;
        if (viewPager != null) {
            m1058(viewPager.getAdapter(), null);
            ViewPager viewPager2 = this.f1854;
            ViewPager.InterfaceC0308 interfaceC0308 = viewPager2.f1926;
            viewPager2.f1926 = null;
            C0296 c0296 = this.f1860;
            List<ViewPager.InterfaceC0298> list = viewPager2.f1916;
            if (list != null) {
                list.remove(c0296);
            }
            this.f1854 = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1854 != null) {
            float f = this.f1855;
            if (f < 0.0f) {
                f = 0.0f;
            }
            mo1056(this.f1861, f, true);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int max;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int size = View.MeasureSpec.getSize(i);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (size * 0.2f), -2);
        this.f1858.measure(childMeasureSpec2, childMeasureSpec);
        this.f1863.measure(childMeasureSpec2, childMeasureSpec);
        this.f1859.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            max = View.MeasureSpec.getSize(i2);
        } else {
            max = Math.max(getMinHeight(), this.f1863.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(max, i2, this.f1863.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f1856) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i) {
        this.f1865 = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f) {
        int i = ((int) (f * 255.0f)) & Base64.BASELENGTH;
        this.f1864 = i;
        int i2 = (i << 24) | (this.f1857 & 16777215);
        this.f1858.setTextColor(i2);
        this.f1859.setTextColor(i2);
    }

    public void setTextColor(int i) {
        this.f1857 = i;
        this.f1863.setTextColor(i);
        int i2 = (this.f1864 << 24) | (this.f1857 & 16777215);
        this.f1858.setTextColor(i2);
        this.f1859.setTextColor(i2);
    }

    public void setTextSize(int i, float f) {
        this.f1858.setTextSize(i, f);
        this.f1863.setTextSize(i, f);
        this.f1859.setTextSize(i, f);
    }

    public void setTextSpacing(int i) {
        this.f1853 = i;
        requestLayout();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m1057(int i, AbstractC1512 abstractC1512) {
        int mo1135 = abstractC1512 != null ? abstractC1512.mo1135() : 0;
        this.f1856 = true;
        CharSequence charSequence = null;
        this.f1858.setText((i < 1 || abstractC1512 == null) ? null : abstractC1512.mo1632(i - 1));
        this.f1863.setText((abstractC1512 == null || i >= mo1135) ? null : abstractC1512.mo1632(i));
        int i2 = i + 1;
        if (i2 < mo1135 && abstractC1512 != null) {
            charSequence = abstractC1512.mo1632(i2);
        }
        this.f1859.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f1858.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f1863.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f1859.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f1861 = i;
        if (!this.f1866) {
            mo1056(i, this.f1855, false);
        }
        this.f1856 = false;
    }

    /* renamed from: くし〴〺ぅ */
    public void mo1056(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.f1861) {
            m1057(i, this.f1854.getAdapter());
        } else if (!z && f == this.f1855) {
            return;
        }
        this.f1866 = true;
        int measuredWidth = this.f1858.getMeasuredWidth();
        int measuredWidth2 = this.f1863.getMeasuredWidth();
        int measuredWidth3 = this.f1859.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (i8 * f2))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = this.f1858.getBaseline();
        int baseline2 = this.f1863.getBaseline();
        int baseline3 = this.f1859.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = max - baseline;
        int i12 = max - baseline2;
        int i13 = max - baseline3;
        int max2 = Math.max(Math.max(this.f1858.getMeasuredHeight() + i11, this.f1863.getMeasuredHeight() + i12), this.f1859.getMeasuredHeight() + i13);
        int i14 = this.f1865 & 112;
        if (i14 == 16) {
            i2 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else {
            if (i14 != 80) {
                i3 = i11 + paddingTop;
                i4 = i12 + paddingTop;
                i5 = paddingTop + i13;
                TextView textView = this.f1863;
                textView.layout(i9, i4, i10, textView.getMeasuredHeight() + i4);
                int min = Math.min(paddingLeft, (i9 - this.f1853) - measuredWidth);
                TextView textView2 = this.f1858;
                textView2.layout(min, i3, measuredWidth + min, textView2.getMeasuredHeight() + i3);
                int max3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f1853);
                TextView textView3 = this.f1859;
                textView3.layout(max3, i5, max3 + measuredWidth3, textView3.getMeasuredHeight() + i5);
                this.f1855 = f;
                this.f1866 = false;
            }
            i2 = (height - paddingBottom) - max2;
        }
        i3 = i11 + i2;
        i4 = i12 + i2;
        i5 = i2 + i13;
        TextView textView4 = this.f1863;
        textView4.layout(i9, i4, i10, textView4.getMeasuredHeight() + i4);
        int min2 = Math.min(paddingLeft, (i9 - this.f1853) - measuredWidth);
        TextView textView22 = this.f1858;
        textView22.layout(min2, i3, measuredWidth + min2, textView22.getMeasuredHeight() + i3);
        int max32 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f1853);
        TextView textView32 = this.f1859;
        textView32.layout(max32, i5, max32 + measuredWidth3, textView32.getMeasuredHeight() + i5);
        this.f1855 = f;
        this.f1866 = false;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m1058(AbstractC1512 abstractC1512, AbstractC1512 abstractC15122) {
        if (abstractC1512 != null) {
            abstractC1512.f6965.unregisterObserver(this.f1860);
            this.f1862 = null;
        }
        if (abstractC15122 != null) {
            abstractC15122.f6965.registerObserver(this.f1860);
            this.f1862 = new WeakReference<>(abstractC15122);
        }
        ViewPager viewPager = this.f1854;
        if (viewPager != null) {
            this.f1861 = -1;
            this.f1855 = -1.0f;
            m1057(viewPager.getCurrentItem(), abstractC15122);
            requestLayout();
        }
    }
}
