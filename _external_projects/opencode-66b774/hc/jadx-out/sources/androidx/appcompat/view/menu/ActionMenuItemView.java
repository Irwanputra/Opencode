package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import dev.epro.r0.E2166724654553415323;
import dev.epro.r0.G16868612739316221327;
import dev.epro.r0.H8799190816846314569;
import dev.epro.r0.I4217019646703278835;
import dev.epro.r0.O691910143173251949;
import dev.epro.r0.P10847846558498882845;
import dev.epro.r0.Q6854864344654328121;
import dev.epro.r0.T8605657386197958581;
import dev.epro.r0.V17859802919350004506;
import dev.epro.r0.Y17304307076558258116;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends Q6854864344654328121 implements G16868612739316221327, View.OnClickListener, V17859802919350004506 {
    public I4217019646703278835 i;
    public CharSequence j;
    public Drawable k;
    public O691910143173251949 l;
    public P10847846558498882845 m;
    public H8799190816846314569 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f137o;
    public boolean p;
    public final int q;
    public int r;
    public final int s;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f137o = h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Y17304307076558258116.c, 0, 0);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.s = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.r = -1;
        setSaveEnabled(false);
    }

    @Override // dev.epro.r0.G16868612739316221327
    public final void a(I4217019646703278835 i4217019646703278835) {
        this.i = i4217019646703278835;
        setIcon(i4217019646703278835.getIcon());
        setTitle(i4217019646703278835.getTitleCondensed());
        setId(i4217019646703278835.a);
        setVisibility(i4217019646703278835.isVisible() ? 0 : 8);
        setEnabled(i4217019646703278835.isEnabled());
        if (i4217019646703278835.hasSubMenu() && this.m == null) {
            this.m = new P10847846558498882845(this);
        }
    }

    @Override // dev.epro.r0.V17859802919350004506
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // dev.epro.r0.V17859802919350004506
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.i.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // dev.epro.r0.G16868612739316221327
    public I4217019646703278835 getItemData() {
        return this.i;
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void i() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.j);
        if (this.k != null && ((this.i.y & 4) != 4 || (!this.f137o && !this.p))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.j : null);
        CharSequence charSequence = this.i.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.i.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.i.r;
        if (TextUtils.isEmpty(charSequence2)) {
            E2166724654553415323.r(this, z3 ? null : this.i.e);
        } else {
            E2166724654553415323.r(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        O691910143173251949 o691910143173251949 = this.l;
        if (o691910143173251949 != null) {
            o691910143173251949.b(this.i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f137o = h();
        i();
    }

    @Override // dev.epro.r0.Q6854864344654328121, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.r) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.q;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.k == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.k.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        P10847846558498882845 p10847846558498882845;
        if (this.i.hasSubMenu() && (p10847846558498882845 = this.m) != null && p10847846558498882845.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.p != z) {
            this.p = z;
            I4217019646703278835 i4217019646703278835 = this.i;
            if (i4217019646703278835 != null) {
                T8605657386197958581 t8605657386197958581 = i4217019646703278835.n;
                t8605657386197958581.k = true;
                t8605657386197958581.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.k = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.s;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        i();
    }

    public void setItemInvoker(O691910143173251949 o691910143173251949) {
        this.l = o691910143173251949;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.r = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(H8799190816846314569 h8799190816846314569) {
        this.n = h8799190816846314569;
    }

    public void setTitle(CharSequence charSequence) {
        this.j = charSequence;
        i();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }
}
