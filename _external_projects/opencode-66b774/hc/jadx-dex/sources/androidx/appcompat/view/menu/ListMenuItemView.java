package androidx.appcompat.view.menu;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class ListMenuItemView extends android.widget.LinearLayout implements dev.epro.r0.G16868612739316221327, android.widget.AbsListView.SelectionBoundsAdjuster {
    public dev.epro.r0.I4217019646703278835 a;
    public android.widget.ImageView b;
    public android.widget.RadioButton c;
    public android.widget.TextView d;
    public android.widget.CheckBox e;
    public android.widget.TextView f;
    public android.widget.ImageView g;
    public android.widget.ImageView h;
    public android.widget.LinearLayout i;
    public final android.graphics.drawable.Drawable j;
    public final int k;
    public final android.content.Context l;
    public boolean m;
    public final android.graphics.drawable.Drawable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f138o;
    public android.view.LayoutInflater p;
    public boolean q;

    public ListMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        dev.epro.r0.I1632105416032993715 i1632105416032993715T = dev.epro.r0.I1632105416032993715.t(getContext(), attributeSet, dev.epro.r0.Y17304307076558258116.r, 2130969418);
        this.j = i1632105416032993715T.g(5);
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) i1632105416032993715T.c;
        this.k = typedArray.getResourceId(1, -1);
        this.m = typedArray.getBoolean(7, false);
        this.l = context;
        this.n = i1632105416032993715T.g(8);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, 2130969034, 0);
        this.f138o = typedArrayObtainStyledAttributes.hasValue(0);
        i1632105416032993715T.v();
        typedArrayObtainStyledAttributes.recycle();
    }

    private android.view.LayoutInflater getInflater() {
        android.view.LayoutInflater layoutInflater = this.p;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        this.p = layoutInflaterFrom;
        return layoutInflaterFrom;
    }

    private void setSubMenuArrowVisible(boolean z) {
        android.widget.ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(dev.epro.r0.I4217019646703278835 r11) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.a(dev.epro.r0.I4217019646703278835):void");
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(android.graphics.Rect rect) {
        android.widget.ImageView imageView = this.h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.h.getLayoutParams();
        rect.top = this.h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    public dev.epro.r0.I4217019646703278835 getItemData() {
        return this.a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.j);
        android.widget.TextView textView = (android.widget.TextView) findViewById(2131296786);
        this.d = textView;
        int i = this.k;
        if (i != -1) {
            textView.setTextAppearance(this.l, i);
        }
        this.f = (android.widget.TextView) findViewById(2131296713);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(2131296749);
        this.g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.n);
        }
        this.h = (android.widget.ImageView) findViewById(2131296492);
        this.i = (android.widget.LinearLayout) findViewById(2131296406);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.b != null && this.m) {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        android.widget.CompoundButton compoundButton;
        android.widget.CompoundButton compoundButton2;
        android.widget.CompoundButton compoundButton3;
        if (!z && this.c == null && this.e == null) {
            return;
        }
        if ((this.a.x & 4) != 0) {
            if (this.c == null) {
                android.widget.RadioButton radioButton = (android.widget.RadioButton) getInflater().inflate(2131492881, (android.view.ViewGroup) this, false);
                this.c = radioButton;
                android.widget.LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
            compoundButton2 = this.e;
            compoundButton3 = compoundButton2;
        } else {
            if (this.e == null) {
                android.widget.CheckBox checkBox = (android.widget.CheckBox) getInflater().inflate(2131492878, (android.view.ViewGroup) this, false);
                this.e = checkBox;
                android.widget.LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.e;
            compoundButton2 = this.c;
            compoundButton3 = compoundButton;
        }
        if (!z) {
            if (compoundButton3 != null) {
                compoundButton3.setVisibility(8);
            }
            android.widget.RadioButton radioButton2 = this.c;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
                return;
            }
            return;
        }
        compoundButton.setChecked(this.a.isChecked());
        if (compoundButton.getVisibility() != 0) {
            compoundButton.setVisibility(0);
        }
        if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
            return;
        }
        compoundButton2.setVisibility(8);
    }

    public void setChecked(boolean z) {
        android.widget.CompoundButton compoundButton;
        if ((this.a.x & 4) != 0) {
            if (this.c == null) {
                android.widget.RadioButton radioButton = (android.widget.RadioButton) getInflater().inflate(2131492881, (android.view.ViewGroup) this, false);
                this.c = radioButton;
                android.widget.LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
        } else {
            if (this.e == null) {
                android.widget.CheckBox checkBox = (android.widget.CheckBox) getInflater().inflate(2131492878, (android.view.ViewGroup) this, false);
                this.e = checkBox;
                android.widget.LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.q = z;
        this.m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        android.widget.ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility((this.f138o || !z) ? 8 : 0);
        }
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        dev.epro.r0.T8605657386197958581 t8605657386197958581 = this.a.n;
        boolean z = this.q;
        if (z || this.m) {
            android.widget.ImageView imageView = this.b;
            if (imageView == null && drawable == null && !this.m) {
                return;
            }
            if (imageView == null) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) getInflater().inflate(2131492879, (android.view.ViewGroup) this, false);
                this.b = imageView2;
                android.widget.LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.m) {
                this.b.setVisibility(8);
                return;
            }
            android.widget.ImageView imageView3 = this.b;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.b.getVisibility() != 0) {
                this.b.setVisibility(0);
            }
        }
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        android.widget.TextView textView = this.d;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.d.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
        }
    }
}
