package dev.epro.r0;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
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

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B9683044498301182575 extends S15562910060800872316 implements DialogInterface, P11323103762586676051 {
    public L9687083612725928934 e;
    public final H2747464980979465245 f;
    public final O8953140192291099683 g;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [dev.epro.r0.H2747464980979465245] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public B9683044498301182575(android.view.ContextThemeWrapper r5, int r6) {
        /*
            r4 = this;
            int r6 = i(r5, r6)
            r0 = 1
            r1 = 2130969002(0x7f0401aa, float:1.7546674E38)
            if (r6 != 0) goto L19
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L1a
        L19:
            r2 = r6
        L1a:
            r4.<init>(r5, r2)
            dev.epro.r0.H2747464980979465245 r2 = new dev.epro.r0.H2747464980979465245
            r2.<init>()
            r4.f = r2
            dev.epro.r0.V16233589191250258052 r2 = r4.g()
            if (r6 != 0) goto L38
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L38:
            r5 = r2
            dev.epro.r0.L9687083612725928934 r5 = (dev.epro.r0.L9687083612725928934) r5
            r5.R = r6
            r2.b()
            dev.epro.r0.O8953140192291099683 r5 = new dev.epro.r0.O8953140192291099683
            android.content.Context r6 = r4.getContext()
            android.view.Window r0 = r4.getWindow()
            r5.<init>(r6, r4, r0)
            r4.g = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B9683044498301182575.<init>(android.view.ContextThemeWrapper, int):void");
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
        LayoutInflater from = LayoutInflater.from(l9687083612725928934.k);
        if (from.getFactory() == null) {
            from.setFactory2(l9687083612725928934);
        } else {
            from.getFactory2();
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
        View findViewById;
        h(bundle);
        O8953140192291099683 o8953140192291099683 = this.g;
        o8953140192291099683.b.setContentView(o8953140192291099683.q);
        Context context = o8953140192291099683.a;
        Window window = o8953140192291099683.c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup a = O8953140192291099683.a(findViewById6, findViewById3);
        ViewGroup a2 = O8953140192291099683.a(findViewById7, findViewById4);
        ViewGroup a3 = O8953140192291099683.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        o8953140192291099683.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        o8953140192291099683.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a2.findViewById(android.R.id.message);
        o8953140192291099683.m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            o8953140192291099683.i.removeView(o8953140192291099683.m);
            if (o8953140192291099683.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) o8953140192291099683.i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(o8953140192291099683.i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(o8953140192291099683.e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a2.setVisibility(8);
            }
        }
        Button button = (Button) a3.findViewById(android.R.id.button1);
        o8953140192291099683.f = button;
        G17185360867502361524 g17185360867502361524 = o8953140192291099683.w;
        button.setOnClickListener(g17185360867502361524);
        boolean isEmpty = TextUtils.isEmpty(null);
        Button button2 = o8953140192291099683.f;
        if (isEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText((CharSequence) null);
            o8953140192291099683.f.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) a3.findViewById(android.R.id.button2);
        o8953140192291099683.g = button3;
        button3.setOnClickListener(g17185360867502361524);
        boolean isEmpty2 = TextUtils.isEmpty(null);
        Button button4 = o8953140192291099683.g;
        if (isEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText((CharSequence) null);
            o8953140192291099683.g.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) a3.findViewById(android.R.id.button3);
        o8953140192291099683.h = button5;
        button5.setOnClickListener(g17185360867502361524);
        boolean isEmpty3 = TextUtils.isEmpty(null);
        Button button6 = o8953140192291099683.h;
        if (isEmpty3) {
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
            a3.setVisibility(8);
        }
        if (o8953140192291099683.n != null) {
            a.addView(o8953140192291099683.n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            o8953140192291099683.k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(o8953140192291099683.d) || !o8953140192291099683.u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                o8953140192291099683.k.setVisibility(8);
                a.setVisibility(8);
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
        int i2 = (a == null || a.getVisibility() == 8) ? 0 : 1;
        boolean z2 = a3.getVisibility() != 8;
        if (!z2 && (findViewById = a2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = o8953140192291099683.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = o8953140192291099683.e != null ? a.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
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
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = W10240872260424387225.a;
                view.setScrollIndicators(i2 | i3, 3);
                if (findViewById11 != null) {
                    a2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a2.removeView(findViewById12);
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
