package dev.epro.r0;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H13521189488363841561 extends M10701816181309613444 implements P1187139614085405202 {
    public CharSequence C;
    public B16530580336360837432 D;
    public final Rect E;
    public int F;
    public final /* synthetic */ T4056244775750501969 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H13521189488363841561(T4056244775750501969 t4056244775750501969, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.G = t4056244775750501969;
        this.E = new Rect();
        this.f357o = t4056244775750501969;
        this.y = true;
        this.z.setFocusable(true);
        this.p = new O5554340795038408562(this, (byte) 0);
    }

    @Override // dev.epro.r0.P1187139614085405202
    public final void h(CharSequence charSequence) {
        this.C = charSequence;
    }

    @Override // dev.epro.r0.P1187139614085405202
    public final void k(int i) {
        this.F = i;
    }

    @Override // dev.epro.r0.P1187139614085405202
    public final void m(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        F6594473573882211675 f6594473573882211675 = this.z;
        boolean zIsShowing = f6594473573882211675.isShowing();
        s();
        f6594473573882211675.setInputMethodMode(2);
        e();
        S9684361936304835821 s9684361936304835821 = this.c;
        s9684361936304835821.setChoiceMode(1);
        s9684361936304835821.setTextDirection(i);
        s9684361936304835821.setTextAlignment(i2);
        T4056244775750501969 t4056244775750501969 = this.G;
        int selectedItemPosition = t4056244775750501969.getSelectedItemPosition();
        S9684361936304835821 s96843619363048358212 = this.c;
        if (f6594473573882211675.isShowing() && s96843619363048358212 != null) {
            s96843619363048358212.setListSelectionHidden(false);
            s96843619363048358212.setSelection(selectedItemPosition);
            if (s96843619363048358212.getChoiceMode() != 0) {
                s96843619363048358212.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = t4056244775750501969.getViewTreeObserver()) == null) {
            return;
        }
        O1776232730137214479 o1776232730137214479 = new O1776232730137214479(this, (byte) 1);
        viewTreeObserver.addOnGlobalLayoutListener(o1776232730137214479);
        f6594473573882211675.setOnDismissListener(new D11460893557152340610(this, o1776232730137214479));
    }

    @Override // dev.epro.r0.P1187139614085405202
    public final CharSequence o() {
        return this.C;
    }

    @Override // dev.epro.r0.M10701816181309613444, dev.epro.r0.P1187139614085405202
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.D = (B16530580336360837432) listAdapter;
    }

    public final void s() {
        int i;
        F6594473573882211675 f6594473573882211675 = this.z;
        Drawable background = f6594473573882211675.getBackground();
        T4056244775750501969 t4056244775750501969 = this.G;
        Rect rect = t4056244775750501969.h;
        if (background != null) {
            background.getPadding(rect);
            boolean z = G17670069693736004358.a;
            i = t4056244775750501969.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = t4056244775750501969.getPaddingLeft();
        int paddingRight = t4056244775750501969.getPaddingRight();
        int width = t4056244775750501969.getWidth();
        int i2 = t4056244775750501969.g;
        if (i2 == -2) {
            int iA = t4056244775750501969.a(this.D, f6594473573882211675.getBackground());
            int i3 = (t4056244775750501969.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i3) {
                iA = i3;
            }
            q(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i2);
        }
        boolean z2 = G17670069693736004358.a;
        this.f = t4056244775750501969.getLayoutDirection() == 1 ? (((width - paddingRight) - this.e) - this.F) + i : paddingLeft + this.F + i;
    }
}
