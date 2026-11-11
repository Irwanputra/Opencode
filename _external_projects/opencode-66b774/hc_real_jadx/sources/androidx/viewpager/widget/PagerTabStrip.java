package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p034.p035.p043.C1067;

/* loaded from: /tmp/opencode/hc_real.dex */
public class PagerTabStrip extends PagerTitleStrip {

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public final Paint f1833;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public boolean f1834;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public int f1835;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public final Rect f1836;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public int f1837;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f1838;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public int f1839;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f1840;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public float f1841;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public int f1842;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public int f1843;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public boolean f1844;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public int f1845;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public boolean f1846;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public int f1847;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public float f1848;

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$〺つふすそ, reason: contains not printable characters */
    public class ViewOnClickListenerC0293 implements View.OnClickListener {
        public ViewOnClickListenerC0293() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f1854;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$げつ〴ぬぐ, reason: contains not printable characters */
    public class ViewOnClickListenerC0294 implements View.OnClickListener {
        public ViewOnClickListenerC0294() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PagerTabStrip.this.f1854.setCurrentItem(r2.getCurrentItem() - 1);
        }
    }

    public PagerTabStrip(Context context) {
        this(context, null);
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f1833 = paint;
        this.f1836 = new Rect();
        this.f1835 = Base64.BASELENGTH;
        this.f1846 = false;
        this.f1844 = false;
        int i = this.f1857;
        this.f1840 = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1845 = (int) ((3.0f * f) + 0.5f);
        this.f1838 = (int) ((6.0f * f) + 0.5f);
        this.f1839 = (int) (64.0f * f);
        this.f1847 = (int) ((16.0f * f) + 0.5f);
        this.f1843 = (int) ((1.0f * f) + 0.5f);
        this.f1842 = (int) ((f * 32.0f) + 0.5f);
        this.f1837 = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f1858.setFocusable(true);
        this.f1858.setOnClickListener(new ViewOnClickListenerC0294());
        this.f1859.setFocusable(true);
        this.f1859.setOnClickListener(new ViewOnClickListenerC0293());
        if (getBackground() == null) {
            this.f1846 = true;
        }
    }

    public boolean getDrawFullUnderline() {
        return this.f1846;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f1842);
    }

    public int getTabIndicatorColor() {
        return this.f1840;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f1863.getLeft() - this.f1847;
        int right = this.f1863.getRight() + this.f1847;
        int i = height - this.f1845;
        this.f1833.setColor((this.f1835 << 24) | (this.f1840 & 16777215));
        float f = height;
        canvas.drawRect(left, i, right, f, this.f1833);
        if (this.f1846) {
            this.f1833.setColor((-16777216) | (this.f1840 & 16777215));
            canvas.drawRect(getPaddingLeft(), height - this.f1843, getWidth() - getPaddingRight(), f, this.f1833);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewPager viewPager;
        int currentItem;
        int action = motionEvent.getAction();
        if (action != 0 && this.f1834) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.f1841 = x;
            this.f1848 = y;
            this.f1834 = false;
        } else if (action == 1) {
            if (x < this.f1863.getLeft() - this.f1847) {
                viewPager = this.f1854;
                currentItem = viewPager.getCurrentItem() - 1;
            } else if (x > this.f1863.getRight() + this.f1847) {
                viewPager = this.f1854;
                currentItem = viewPager.getCurrentItem() + 1;
            }
            viewPager.setCurrentItem(currentItem);
        } else if (action == 2 && (Math.abs(x - this.f1841) > this.f1837 || Math.abs(y - this.f1848) > this.f1837)) {
            this.f1834 = true;
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (this.f1844) {
            return;
        }
        this.f1846 = (i & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f1844) {
            return;
        }
        this.f1846 = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f1844) {
            return;
        }
        this.f1846 = i == 0;
    }

    public void setDrawFullUnderline(boolean z) {
        this.f1846 = z;
        this.f1844 = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.f1838;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(int i) {
        this.f1840 = i;
        this.f1833.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(C1067.m2405(getContext(), i));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i) {
        int i2 = this.f1839;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void mo1056(int i, float f, boolean z) {
        Rect rect = this.f1836;
        int height = getHeight();
        int left = this.f1863.getLeft() - this.f1847;
        int right = this.f1863.getRight() + this.f1847;
        int i2 = height - this.f1845;
        rect.set(left, i2, right, height);
        super.mo1056(i, f, z);
        this.f1835 = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f1863.getLeft() - this.f1847, i2, this.f1863.getRight() + this.f1847, height);
        invalidate(rect);
    }
}
