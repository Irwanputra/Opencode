package dev.epro.r0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public class M10701816181309613444 implements Y1226494281320458288 {
    public static final Method A;
    public static final Method B;
    public final Context a;
    public ListAdapter b;
    public S9684361936304835821 c;
    public int f;
    public int g;
    public boolean i;
    public boolean j;
    public boolean k;
    public D6507936737849582661 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f357o;
    public AdapterView.OnItemClickListener p;
    public AdapterView.OnItemSelectedListener q;
    public final Handler v;
    public Rect x;
    public boolean y;
    public final F6594473573882211675 z;
    public final int d = -2;
    public int e = -2;
    public final short h = 1002;
    public int l = 0;
    public final int m = Integer.MAX_VALUE;
    public final O1721407113567964106 r = new O1721407113567964106(this, (byte) 1);
    public final Q123627356342694286 s = new Q123627356342694286(this);
    public final H2403852577558633051 t = new H2403852577558633051(this);
    public final O1721407113567964106 u = new O1721407113567964106(this, (byte) 0);
    public final Rect w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public M10701816181309613444(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.a = context;
        this.v = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Y17304307076558258116.f585o, i, 0);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        F6594473573882211675 f6594473573882211675 = new F6594473573882211675(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, Y17304307076558258116.s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            f6594473573882211675.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        f6594473573882211675.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : M9216324016624295870.G(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.z = f6594473573882211675;
        f6594473573882211675.setInputMethodMode(1);
    }

    public S9684361936304835821 a(Context context, boolean z) {
        return new S9684361936304835821(context, z);
    }

    @Override // dev.epro.r0.Y1226494281320458288
    public final boolean b() {
        return this.z.isShowing();
    }

    public final int c() {
        return this.f;
    }

    @Override // dev.epro.r0.Y1226494281320458288
    public final void dismiss() {
        F6594473573882211675 f6594473573882211675 = this.z;
        f6594473573882211675.dismiss();
        f6594473573882211675.setContentView(null);
        this.c = null;
        this.v.removeCallbacks(this.r);
    }

    @Override // dev.epro.r0.Y1226494281320458288
    public final void e() {
        int i;
        int paddingBottom;
        S9684361936304835821 s9684361936304835821;
        S9684361936304835821 s96843619363048358212 = this.c;
        Context context = this.a;
        F6594473573882211675 f6594473573882211675 = this.z;
        if (s96843619363048358212 == null) {
            S9684361936304835821 s9684361936304835821A = a(context, !this.y);
            this.c = s9684361936304835821A;
            s9684361936304835821A.setAdapter(this.b);
            this.c.setOnItemClickListener(this.p);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new V3015761816140229469(this));
            this.c.setOnScrollListener(this.t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.q;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            f6594473573882211675.setContentView(this.c);
        }
        Drawable background = f6594473573882211675.getBackground();
        Rect rect = this.w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int maxAvailableHeight = f6594473573882211675.getMaxAvailableHeight(this.f357o, this.g, f6594473573882211675.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = maxAvailableHeight + i;
        } else {
            int i4 = this.e;
            int iA = this.c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), maxAvailableHeight);
            paddingBottom = iA + (iA > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i : 0);
        }
        boolean z = f6594473573882211675.getInputMethodMode() == 2;
        f6594473573882211675.setWindowLayoutType(this.h);
        if (f6594473573882211675.isShowing()) {
            if (this.f357o.isAttachedToWindow()) {
                int width = this.e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f357o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.e;
                    if (z) {
                        f6594473573882211675.setWidth(i5 == -1 ? -1 : 0);
                        f6594473573882211675.setHeight(0);
                    } else {
                        f6594473573882211675.setWidth(i5 == -1 ? -1 : 0);
                        f6594473573882211675.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                f6594473573882211675.setOutsideTouchable(true);
                int i6 = width;
                View view = this.f357o;
                int i7 = this.f;
                int i8 = this.g;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                f6594473573882211675.update(view, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int width2 = this.e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f357o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        f6594473573882211675.setWidth(width2);
        f6594473573882211675.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = A;
            if (method != null) {
                try {
                    method.invoke(f6594473573882211675, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        } else {
            N13459929895848246258.r(f6594473573882211675);
        }
        f6594473573882211675.setOutsideTouchable(true);
        f6594473573882211675.setTouchInterceptor(this.s);
        if (this.k) {
            f6594473573882211675.setOverlapAnchor(this.j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = B;
            if (method2 != null) {
                try {
                    method2.invoke(f6594473573882211675, this.x);
                } catch (Exception unused2) {
                }
            }
        } else {
            N13459929895848246258.q(f6594473573882211675, this.x);
        }
        f6594473573882211675.showAsDropDown(this.f357o, this.f, this.g, this.l);
        this.c.setSelection(-1);
        if ((!this.y || this.c.isInTouchMode()) && (s9684361936304835821 = this.c) != null) {
            s9684361936304835821.setListSelectionHidden(true);
            s9684361936304835821.requestLayout();
        }
        if (this.y) {
            return;
        }
        this.v.post(this.u);
    }

    public final Drawable f() {
        return this.z.getBackground();
    }

    @Override // dev.epro.r0.Y1226494281320458288
    public final S9684361936304835821 g() {
        return this.c;
    }

    public final void i(Drawable drawable) {
        this.z.setBackgroundDrawable(drawable);
    }

    public final void j(int i) {
        this.g = i;
        this.i = true;
    }

    public final void l(int i) {
        this.f = i;
    }

    public final int n() {
        if (this.i) {
            return this.g;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        D6507936737849582661 d6507936737849582661 = this.n;
        if (d6507936737849582661 == null) {
            this.n = new D6507936737849582661(this);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(d6507936737849582661);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.n);
        }
        S9684361936304835821 s9684361936304835821 = this.c;
        if (s9684361936304835821 != null) {
            s9684361936304835821.setAdapter(this.b);
        }
    }

    public final void q(int i) {
        Drawable background = this.z.getBackground();
        if (background == null) {
            this.e = i;
            return;
        }
        Rect rect = this.w;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i;
    }
}
