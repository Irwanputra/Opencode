package dev.epro.r0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T4056244775750501969 extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};
    public final G6575252167976303972 a;
    public final Context b;
    public final R1020344972109547266 c;
    public SpinnerAdapter d;
    public final boolean e;
    public final P1187139614085405202 f;
    public int g;
    public final Rect h;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T4056244775750501969(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.T4056244775750501969.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.h;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            g6575252167976303972.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        P1187139614085405202 p1187139614085405202 = this.f;
        return p1187139614085405202 != null ? p1187139614085405202.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        P1187139614085405202 p1187139614085405202 = this.f;
        return p1187139614085405202 != null ? p1187139614085405202.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f != null ? this.g : super.getDropDownWidth();
    }

    public final P1187139614085405202 getInternalPopup() {
        return this.f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        P1187139614085405202 p1187139614085405202 = this.f;
        return p1187139614085405202 != null ? p1187139614085405202.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        P1187139614085405202 p1187139614085405202 = this.f;
        return p1187139614085405202 != null ? p1187139614085405202.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            return g6575252167976303972.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            return g6575252167976303972.e();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        P1187139614085405202 p1187139614085405202 = this.f;
        if (p1187139614085405202 == null || !p1187139614085405202.b()) {
            return;
        }
        p1187139614085405202.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        J8290223557870360453 j8290223557870360453 = (J8290223557870360453) parcelable;
        super.onRestoreInstanceState(j8290223557870360453.getSuperState());
        if (!j8290223557870360453.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new O1776232730137214479(this, (byte) 0));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        J8290223557870360453 j8290223557870360453 = new J8290223557870360453(super.onSaveInstanceState());
        P1187139614085405202 p1187139614085405202 = this.f;
        j8290223557870360453.a = p1187139614085405202 != null && p1187139614085405202.b();
        return j8290223557870360453;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        R1020344972109547266 r1020344972109547266 = this.c;
        if (r1020344972109547266 == null || !r1020344972109547266.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        P1187139614085405202 p1187139614085405202 = this.f;
        if (p1187139614085405202 == null) {
            return super.performClick();
        }
        if (p1187139614085405202.b()) {
            return true;
        }
        p1187139614085405202.m(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        P1187139614085405202 p1187139614085405202 = this.f;
        if (p1187139614085405202 != null) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            B16530580336360837432 b16530580336360837432 = new B16530580336360837432();
            b16530580336360837432.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                b16530580336360837432.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (!Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
            p1187139614085405202.p(b16530580336360837432);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            g6575252167976303972.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            g6575252167976303972.i(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        P1187139614085405202 p1187139614085405202 = this.f;
        if (p1187139614085405202 == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            p1187139614085405202.k(i2);
            p1187139614085405202.l(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        P1187139614085405202 p1187139614085405202 = this.f;
        if (p1187139614085405202 != null) {
            p1187139614085405202.j(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f != null) {
            this.g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        P1187139614085405202 p1187139614085405202 = this.f;
        if (p1187139614085405202 != null) {
            p1187139614085405202.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(M9216324016624295870.G(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        P1187139614085405202 p1187139614085405202 = this.f;
        if (p1187139614085405202 != null) {
            p1187139614085405202.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            g6575252167976303972.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            g6575252167976303972.m(mode);
        }
    }
}
