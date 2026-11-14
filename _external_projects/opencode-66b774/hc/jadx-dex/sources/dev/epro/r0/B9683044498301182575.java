package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B9683044498301182575 extends dev.epro.r0.S15562910060800872316 implements android.content.DialogInterface, dev.epro.r0.P11323103762586676051 {
    public dev.epro.r0.L9687083612725928934 e;
    public final dev.epro.r0.H2747464980979465245 f;
    public final dev.epro.r0.O8953140192291099683 g;

    /* JADX WARN: Multi-variable type inference failed */
    public B9683044498301182575(android.view.ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int i3 = i(contextThemeWrapper, i);
        if (i3 == 0) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(2130969002, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i3;
        }
        super(contextThemeWrapper, i2);
        this.f = new dev.epro.r0.H2747464980979465245(this);
        dev.epro.r0.L9687083612725928934 l9687083612725928934G = g();
        if (i3 == 0) {
            android.util.TypedValue typedValue2 = new android.util.TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(2130969002, typedValue2, true);
            i3 = typedValue2.resourceId;
        }
        l9687083612725928934G.R = i3;
        l9687083612725928934G.b();
        this.g = new dev.epro.r0.O8953140192291099683(getContext(), this, getWindow());
    }

    public static int i(android.content.Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(2130968624, typedValue, true);
        return typedValue.resourceId;
    }

    public final void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        e();
        dev.epro.r0.L9687083612725928934 l9687083612725928934G = g();
        l9687083612725928934G.u();
        ((android.view.ViewGroup) l9687083612725928934G.z.findViewById(android.R.id.content)).addView(view, layoutParams);
        l9687083612725928934G.m.a(l9687083612725928934G.l.getCallback());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface
    public final void dismiss() {
        super/*android.app.Dialog*/.dismiss();
        g().c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return dev.epro.r0.Q3181834110876746778.A(this.f, getWindow().getDecorView(), this, keyEvent);
    }

    public final android.view.View findViewById(int i) {
        dev.epro.r0.L9687083612725928934 l9687083612725928934G = g();
        l9687083612725928934G.u();
        return l9687083612725928934G.l.findViewById(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dev.epro.r0.V16233589191250258052 g() {
        dev.epro.r0.L9687083612725928934 l9687083612725928934 = this.e;
        if (l9687083612725928934 != null) {
            return l9687083612725928934;
        }
        dev.epro.r0.V15499216873564893116 v15499216873564893116 = dev.epro.r0.V16233589191250258052.a;
        dev.epro.r0.L9687083612725928934 l96870836127259289342 = new dev.epro.r0.L9687083612725928934(getContext(), getWindow(), this, this);
        this.e = l96870836127259289342;
        return l96870836127259289342;
    }

    public final void h(android.os.Bundle bundle) {
        android.view.LayoutInflater.Factory2 factory2 = (dev.epro.r0.L9687083612725928934) g();
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(((dev.epro.r0.L9687083612725928934) factory2).k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(factory2);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        super.onCreate(bundle);
        g().b();
    }

    public final void invalidateOptionsMenu() {
        dev.epro.r0.L9687083612725928934 l9687083612725928934G = g();
        if (l9687083612725928934G.n != null) {
            l9687083612725928934G.y();
            l9687083612725928934G.n.getClass();
            l9687083612725928934G.z(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(java.lang.CharSequence charSequence) {
        super/*android.app.Dialog*/.setTitle(charSequence);
        g().j(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean l(android.view.KeyEvent keyEvent) {
        return super/*android.app.Dialog*/.dispatchKeyEvent(keyEvent);
    }

    public final void onCreate(android.os.Bundle bundle) {
        int i;
        android.widget.ListAdapter listAdapter;
        android.view.View viewFindViewById;
        h(bundle);
        dev.epro.r0.O8953140192291099683 o8953140192291099683 = this.g;
        o8953140192291099683.b.setContentView(o8953140192291099683.q);
        android.content.Context context = o8953140192291099683.a;
        android.view.Window window = o8953140192291099683.c;
        android.view.View viewFindViewById2 = window.findViewById(2131296656);
        android.view.View viewFindViewById3 = viewFindViewById2.findViewById(2131296791);
        android.view.View viewFindViewById4 = viewFindViewById2.findViewById(2131296407);
        android.view.View viewFindViewById5 = viewFindViewById2.findViewById(2131296376);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewFindViewById2.findViewById(2131296417);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        android.view.View viewFindViewById6 = viewGroup.findViewById(2131296791);
        android.view.View viewFindViewById7 = viewGroup.findViewById(2131296407);
        android.view.View viewFindViewById8 = viewGroup.findViewById(2131296376);
        android.view.ViewGroup viewGroupA = dev.epro.r0.O8953140192291099683.a(viewFindViewById6, viewFindViewById3);
        android.view.ViewGroup viewGroupA2 = dev.epro.r0.O8953140192291099683.a(viewFindViewById7, viewFindViewById4);
        android.view.ViewGroup viewGroupA3 = dev.epro.r0.O8953140192291099683.a(viewFindViewById8, viewFindViewById5);
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) window.findViewById(2131296695);
        o8953140192291099683.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        o8953140192291099683.i.setNestedScrollingEnabled(false);
        android.widget.TextView textView = (android.widget.TextView) viewGroupA2.findViewById(android.R.id.message);
        o8953140192291099683.m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            o8953140192291099683.i.removeView(o8953140192291099683.m);
            if (o8953140192291099683.e != null) {
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) o8953140192291099683.i.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(o8953140192291099683.i);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(o8953140192291099683.e, iIndexOfChild, new android.view.ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupA2.setVisibility(8);
            }
        }
        android.widget.Button button = (android.widget.Button) viewGroupA3.findViewById(android.R.id.button1);
        o8953140192291099683.f = button;
        android.view.View.OnClickListener onClickListener = o8953140192291099683.w;
        button.setOnClickListener(onClickListener);
        boolean zIsEmpty = android.text.TextUtils.isEmpty(null);
        android.widget.Button button2 = o8953140192291099683.f;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText((java.lang.CharSequence) null);
            o8953140192291099683.f.setVisibility(0);
            i = 1;
        }
        android.widget.Button button3 = (android.widget.Button) viewGroupA3.findViewById(android.R.id.button2);
        o8953140192291099683.g = button3;
        button3.setOnClickListener(onClickListener);
        boolean zIsEmpty2 = android.text.TextUtils.isEmpty(null);
        android.widget.Button button4 = o8953140192291099683.g;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText((java.lang.CharSequence) null);
            o8953140192291099683.g.setVisibility(0);
            i |= 2;
        }
        android.widget.Button button5 = (android.widget.Button) viewGroupA3.findViewById(android.R.id.button3);
        o8953140192291099683.h = button5;
        button5.setOnClickListener(onClickListener);
        boolean zIsEmpty3 = android.text.TextUtils.isEmpty(null);
        android.widget.Button button6 = o8953140192291099683.h;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText((java.lang.CharSequence) null);
            o8953140192291099683.h.setVisibility(0);
            i |= 4;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(2130968622, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                android.widget.Button button7 = o8953140192291099683.f;
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                android.widget.Button button8 = o8953140192291099683.g;
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                android.widget.Button button9 = o8953140192291099683.h;
                android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupA3.setVisibility(8);
        }
        if (o8953140192291099683.n != null) {
            viewGroupA.addView(o8953140192291099683.n, 0, new android.view.ViewGroup.LayoutParams(-1, -2));
            window.findViewById(2131296788).setVisibility(8);
        } else {
            o8953140192291099683.k = (android.widget.ImageView) window.findViewById(android.R.id.icon);
            if (android.text.TextUtils.isEmpty(o8953140192291099683.d) || !o8953140192291099683.u) {
                window.findViewById(2131296788).setVisibility(8);
                o8953140192291099683.k.setVisibility(8);
                viewGroupA.setVisibility(8);
            } else {
                android.widget.TextView textView2 = (android.widget.TextView) window.findViewById(2131296332);
                o8953140192291099683.l = textView2;
                textView2.setText(o8953140192291099683.d);
                android.graphics.drawable.Drawable drawable = o8953140192291099683.j;
                if (drawable != null) {
                    o8953140192291099683.k.setImageDrawable(drawable);
                } else {
                    o8953140192291099683.l.setPadding(o8953140192291099683.k.getPaddingLeft(), o8953140192291099683.k.getPaddingTop(), o8953140192291099683.k.getPaddingRight(), o8953140192291099683.k.getPaddingBottom());
                    o8953140192291099683.k.setVisibility(8);
                }
            }
        }
        boolean z = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupA == null || viewGroupA.getVisibility() == 8) ? 0 : 1;
        boolean z2 = viewGroupA3.getVisibility() != 8;
        if (!z2 && (viewFindViewById = viewGroupA2.findViewById(2131296772)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            androidx.core.widget.NestedScrollView nestedScrollView2 = o8953140192291099683.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            android.view.View viewFindViewById9 = o8953140192291099683.e != null ? viewGroupA.findViewById(2131296787) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            android.view.View viewFindViewById10 = viewGroupA2.findViewById(2131296773);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        androidx.appcompat.app.AlertController$RecycleListView alertController$RecycleListView = o8953140192291099683.e;
        if (alertController$RecycleListView != null && (!z2 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z2 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
        }
        if (!z) {
            android.view.View view = o8953140192291099683.e;
            if (view == null) {
                view = o8953140192291099683.i;
            }
            if (view != null) {
                int i3 = z2 ? 2 : 0;
                android.view.View viewFindViewById11 = window.findViewById(2131296694);
                android.view.View viewFindViewById12 = window.findViewById(2131296693);
                java.util.WeakHashMap weakHashMap = dev.epro.r0.W10240872260424387225.a;
                view.setScrollIndicators(i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupA2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupA2.removeView(viewFindViewById12);
                }
            }
        }
        androidx.appcompat.app.AlertController$RecycleListView alertController$RecycleListView2 = o8953140192291099683.e;
        if (alertController$RecycleListView2 == null || (listAdapter = o8953140192291099683.o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = o8953140192291099683.p;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        androidx.core.widget.NestedScrollView nestedScrollView = this.g.i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super/*android.app.Dialog*/.onKeyDown(i, keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        androidx.core.widget.NestedScrollView nestedScrollView = this.g.i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super/*android.app.Dialog*/.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public final void onStop() {
        super.onStop();
        dev.epro.r0.L9687083612725928934 l9687083612725928934G = g();
        l9687083612725928934G.y();
        dev.epro.r0.I6301446377683660838 i6301446377683660838 = l9687083612725928934G.n;
        if (i6301446377683660838 != null) {
            i6301446377683660838.t = false;
            dev.epro.r0.Y15061126039216380234 y15061126039216380234 = i6301446377683660838.s;
            if (y15061126039216380234 != null) {
                y15061126039216380234.a();
            }
        }
    }

    public final void setContentView(int i) {
        e();
        g().g(i);
    }

    public final void setTitle(java.lang.CharSequence charSequence) {
        k(charSequence);
        dev.epro.r0.O8953140192291099683 o8953140192291099683 = this.g;
        o8953140192291099683.d = charSequence;
        android.widget.TextView textView = o8953140192291099683.l;
        if (textView != null) {
            textView.setText(charSequence);
        }
        o8953140192291099683.c.setTitle(charSequence);
    }

    public final void setContentView(android.view.View view) {
        e();
        g().h(view);
    }

    public final void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        e();
        g().i(view, layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTitle(int i) {
        super/*android.app.Dialog*/.setTitle(i);
        g().j(getContext().getString(i));
    }
}
