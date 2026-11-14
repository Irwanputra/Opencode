package dev.epro.r0;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B9683044498301182575 extends S15562910060800872316 implements DialogInterface, P11323103762586676051 {
    public L9687083612725928934 e;
    public final H2747464980979465245 f;
    public final O8953140192291099683 g;

    /* JADX WARN: Type inference failed for: r2v2, types: [dev.epro.r0.H2747464980979465245] */
    public B9683044498301182575(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int i3 = i(contextThemeWrapper, i);
        if (i3 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i3;
        }
        super(contextThemeWrapper, i2);
        this.f = new A9749874239022662777() { // from class: dev.epro.r0.H2747464980979465245
            @Override // dev.epro.r0.A9749874239022662777
            public final boolean e(KeyEvent keyEvent) {
                return this.a.l(keyEvent);
            }
        };
        V16233589191250258052 v16233589191250258052G = g();
        if (i3 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i3 = typedValue2.resourceId;
        }
        ((L9687083612725928934) v16233589191250258052G).R = i3;
        v16233589191250258052G.b();
        this.g = new O8953140192291099683(getContext(), this, getWindow());
    }

    public static int i(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // dev.epro.r0.S15562910060800872316, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        L9687083612725928934 l9687083612725928934 = (L9687083612725928934) g();
        l9687083612725928934.u();
        ((ViewGroup) l9687083612725928934.z.findViewById(android.R.id.content)).addView(view, layoutParams);
        l9687083612725928934.m.a(l9687083612725928934.l.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        g().c();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return Q3181834110876746778.A(this.f, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        L9687083612725928934 l9687083612725928934 = (L9687083612725928934) g();
        l9687083612725928934.u();
        return l9687083612725928934.l.findViewById(i);
    }

    public final V16233589191250258052 g() {
        L9687083612725928934 l9687083612725928934 = this.e;
        if (l9687083612725928934 != null) {
            return l9687083612725928934;
        }
        V15499216873564893116 v15499216873564893116 = V16233589191250258052.a;
        L9687083612725928934 l96870836127259289342 = new L9687083612725928934(getContext(), getWindow(), this, this);
        this.e = l96870836127259289342;
        return l96870836127259289342;
    }

    public final void h(Bundle bundle) {
        L9687083612725928934 l9687083612725928934 = (L9687083612725928934) g();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(l9687083612725928934.k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(l9687083612725928934);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        super.onCreate(bundle);
        g().b();
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        L9687083612725928934 l9687083612725928934 = (L9687083612725928934) g();
        if (l9687083612725928934.n != null) {
            l9687083612725928934.y();
            l9687083612725928934.n.getClass();
            l9687083612725928934.z(0);
        }
    }

    public final void k(CharSequence charSequence) {
        super.setTitle(charSequence);
        g().j(charSequence);
    }

    public final boolean l(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // dev.epro.r0.S15562910060800872316, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        h(bundle);
        O8953140192291099683 o8953140192291099683 = this.g;
        o8953140192291099683.b.setContentView(o8953140192291099683.q);
        Context context = o8953140192291099683.a;
        Window window = o8953140192291099683.c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupA = O8953140192291099683.a(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupA2 = O8953140192291099683.a(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupA3 = O8953140192291099683.a(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        o8953140192291099683.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        o8953140192291099683.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupA2.findViewById(android.R.id.message);
        o8953140192291099683.m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            o8953140192291099683.i.removeView(o8953140192291099683.m);
            if (o8953140192291099683.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) o8953140192291099683.i.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(o8953140192291099683.i);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(o8953140192291099683.e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupA2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupA3.findViewById(android.R.id.button1);
        o8953140192291099683.f = button;
        G17185360867502361524 g17185360867502361524 = o8953140192291099683.w;
        button.setOnClickListener(g17185360867502361524);
        boolean zIsEmpty = TextUtils.isEmpty(null);
        Button button2 = o8953140192291099683.f;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText((CharSequence) null);
            o8953140192291099683.f.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupA3.findViewById(android.R.id.button2);
        o8953140192291099683.g = button3;
        button3.setOnClickListener(g17185360867502361524);
        boolean zIsEmpty2 = TextUtils.isEmpty(null);
        Button button4 = o8953140192291099683.g;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText((CharSequence) null);
            o8953140192291099683.g.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupA3.findViewById(android.R.id.button3);
        o8953140192291099683.h = button5;
        button5.setOnClickListener(g17185360867502361524);
        boolean zIsEmpty3 = TextUtils.isEmpty(null);
        Button button6 = o8953140192291099683.h;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText((CharSequence) null);
            o8953140192291099683.h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = o8953140192291099683.f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = o8953140192291099683.g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = o8953140192291099683.h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupA3.setVisibility(8);
        }
        if (o8953140192291099683.n != null) {
            viewGroupA.addView(o8953140192291099683.n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            o8953140192291099683.k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(o8953140192291099683.d) || !o8953140192291099683.u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                o8953140192291099683.k.setVisibility(8);
                viewGroupA.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                o8953140192291099683.l = textView2;
                textView2.setText(o8953140192291099683.d);
                Drawable drawable = o8953140192291099683.j;
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
        if (!z2 && (viewFindViewById = viewGroupA2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = o8953140192291099683.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = o8953140192291099683.e != null ? viewGroupA.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupA2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = o8953140192291099683.e;
        if (alertController$RecycleListView != null && (!z2 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z2 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
        }
        if (!z) {
            View view = o8953140192291099683.e;
            if (view == null) {
                view = o8953140192291099683.i;
            }
            if (view != null) {
                int i3 = z2 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = W10240872260424387225.a;
                view.setScrollIndicators(i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupA2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupA2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = o8953140192291099683.e;
        if (alertController$RecycleListView2 == null || (listAdapter = o8953140192291099683.f418o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = o8953140192291099683.p;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.g.i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.g.i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // dev.epro.r0.S15562910060800872316, android.app.Dialog
    public final void onStop() {
        super.onStop();
        L9687083612725928934 l9687083612725928934 = (L9687083612725928934) g();
        l9687083612725928934.y();
        I6301446377683660838 i6301446377683660838 = l9687083612725928934.n;
        if (i6301446377683660838 != null) {
            i6301446377683660838.t = false;
            Y15061126039216380234 y15061126039216380234 = i6301446377683660838.s;
            if (y15061126039216380234 != null) {
                y15061126039216380234.a();
            }
        }
    }

    @Override // dev.epro.r0.S15562910060800872316, android.app.Dialog
    public final void setContentView(int i) {
        e();
        g().g(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        k(charSequence);
        O8953140192291099683 o8953140192291099683 = this.g;
        o8953140192291099683.d = charSequence;
        TextView textView = o8953140192291099683.l;
        if (textView != null) {
            textView.setText(charSequence);
        }
        o8953140192291099683.c.setTitle(charSequence);
    }

    @Override // dev.epro.r0.S15562910060800872316, android.app.Dialog
    public final void setContentView(View view) {
        e();
        g().h(view);
    }

    @Override // dev.epro.r0.S15562910060800872316, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        g().i(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        g().j(getContext().getString(i));
    }
}
