package androidx.appcompat.view.menu;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class ActionMenuItemView extends dev.epro.r0.Q6854864344654328121 implements dev.epro.r0.G16868612739316221327, android.view.View.OnClickListener, dev.epro.r0.V17859802919350004506 {
    public dev.epro.r0.I4217019646703278835 i;
    public java.lang.CharSequence j;
    public android.graphics.drawable.Drawable k;
    public dev.epro.r0.O691910143173251949 l;
    public dev.epro.r0.P10847846558498882845 m;
    public dev.epro.r0.H8799190816846314569 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f137o;
    public boolean p;
    public final int q;
    public int r;
    public final int s;

    /* JADX WARN: Multi-variable type inference failed */
    public ActionMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        android.content.res.Resources resources = context.getResources();
        this.f137o = h();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dev.epro.r0.Y17304307076558258116.c, 0, 0);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.s = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.r = -1;
        setSaveEnabled(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(dev.epro.r0.I4217019646703278835 i4217019646703278835) {
        this.i = i4217019646703278835;
        setIcon(i4217019646703278835.getIcon());
        setTitle(i4217019646703278835.getTitleCondensed());
        setId(i4217019646703278835.a);
        setVisibility(i4217019646703278835.isVisible() ? 0 : 8);
        setEnabled(i4217019646703278835.isEnabled());
        if (i4217019646703278835.hasSubMenu() && this.m == null) {
            this.m = new dev.epro.r0.P10847846558498882845(this);
        }
    }

    public final boolean b() {
        return !android.text.TextUtils.isEmpty(getText());
    }

    public final boolean c() {
        return !android.text.TextUtils.isEmpty(getText()) && this.i.getIcon() == null;
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return android.widget.Button.class.getName();
    }

    public dev.epro.r0.I4217019646703278835 getItemData() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h() {
        android.content.res.Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        boolean z = true;
        boolean z2 = !android.text.TextUtils.isEmpty(this.j);
        if (this.k != null && ((this.i.y & 4) != 4 || (!this.f137o && !this.p))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.j : null);
        java.lang.CharSequence charSequence = this.i.q;
        if (android.text.TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.i.e);
        } else {
            setContentDescription(charSequence);
        }
        java.lang.CharSequence charSequence2 = this.i.r;
        if (android.text.TextUtils.isEmpty(charSequence2)) {
            dev.epro.r0.E2166724654553415323.r(this, z3 ? null : this.i.e);
        } else {
            dev.epro.r0.E2166724654553415323.r(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        dev.epro.r0.O691910143173251949 o691910143173251949 = this.l;
        if (o691910143173251949 != null) {
            o691910143173251949.b(this.i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
        this.f137o = h();
        i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = android.text.TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.r) >= 0) {
            super/*android.view.View*/.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.q;
        int iMin = mode == Integer.MIN_VALUE ? java.lang.Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.k == null) {
            return;
        }
        super/*android.view.View*/.setPadding((getMeasuredWidth() - this.k.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        super/*android.view.View*/.onRestoreInstanceState(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        dev.epro.r0.P10847846558498882845 p10847846558498882845;
        if (this.i.hasSubMenu() && (p10847846558498882845 = this.m) != null && p10847846558498882845.onTouch(this, motionEvent)) {
            return true;
        }
        return super/*android.view.View*/.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.p != z) {
            this.p = z;
            dev.epro.r0.I4217019646703278835 i4217019646703278835 = this.i;
            if (i4217019646703278835 != null) {
                dev.epro.r0.T8605657386197958581 t8605657386197958581 = i4217019646703278835.n;
                t8605657386197958581.k = true;
                t8605657386197958581.p(true);
            }
        }
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
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
        setCompoundDrawables(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        i();
    }

    public void setItemInvoker(dev.epro.r0.O691910143173251949 o691910143173251949) {
        this.l = o691910143173251949;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.r = i;
        super/*android.view.View*/.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(dev.epro.r0.H8799190816846314569 h8799190816846314569) {
        this.n = h8799190816846314569;
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        this.j = charSequence;
        i();
    }

    public ActionMenuItemView(android.content.Context context) {
        this(context, null);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }
}
