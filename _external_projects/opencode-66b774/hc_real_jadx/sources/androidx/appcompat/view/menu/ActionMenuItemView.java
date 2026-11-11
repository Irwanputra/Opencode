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
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import p034.p050.C1148;
import p034.p050.p051.p052.C1164;
import p034.p050.p051.p052.C1197;
import p034.p050.p051.p052.InterfaceC1173;
import p034.p050.p051.p052.InterfaceC1195;
import p034.p050.p053.AbstractViewOnTouchListenerC1249;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ActionMenuItemView extends AppCompatTextView implements InterfaceC1195.InterfaceC1196, View.OnClickListener, ActionMenuView.InterfaceC0059 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public Drawable f181;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public CharSequence f182;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public AbstractViewOnTouchListenerC1249 f183;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int f184;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int f185;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean f186;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C1197 f187;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean f188;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public int f189;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public C1164.InterfaceC1165 f190;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public AbstractC0042 f191;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$〺つふすそ, reason: contains not printable characters */
    public static abstract class AbstractC0042 {
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0043 extends AbstractViewOnTouchListenerC1249 {
        public C0043() {
            super(ActionMenuItemView.this);
        }

        @Override // p034.p050.p053.AbstractViewOnTouchListenerC1249
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public InterfaceC1173 mo89() {
            ActionMenuPresenter.C0052 c0052;
            AbstractC0042 abstractC0042 = ActionMenuItemView.this.f191;
            if (abstractC0042 == null || (c0052 = ActionMenuPresenter.this.f283) == null) {
                return null;
            }
            return c0052.m2653();
        }

        @Override // p034.p050.p053.AbstractViewOnTouchListenerC1249
        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean mo90() {
            InterfaceC1173 mo89;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C1164.InterfaceC1165 interfaceC1165 = actionMenuItemView.f190;
            return interfaceC1165 != null && interfaceC1165.mo92(actionMenuItemView.f187) && (mo89 = mo89()) != null && mo89.mo176();
        }
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f186 = m86();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1148.ActionMenuItemView, i, 0);
        this.f189 = obtainStyledAttributes.getDimensionPixelSize(C1148.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f184 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f185 = -1;
        setSaveEnabled(false);
    }

    @Override // p034.p050.p051.p052.InterfaceC1195.InterfaceC1196
    public C1197 getItemData() {
        return this.f187;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C1164.InterfaceC1165 interfaceC1165 = this.f190;
        if (interfaceC1165 != null) {
            interfaceC1165.mo92(this.f187);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f186 = m86();
        m87();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean m84 = m84();
        if (m84 && (i3 = this.f185) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f189) : this.f189;
        if (mode != 1073741824 && this.f189 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (m84 || this.f181 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f181.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC1249 abstractViewOnTouchListenerC1249;
        if (this.f187.hasSubMenu() && (abstractViewOnTouchListenerC1249 = this.f183) != null && abstractViewOnTouchListenerC1249.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f188 != z) {
            this.f188 = z;
            C1197 c1197 = this.f187;
            if (c1197 != null) {
                c1197.f5937.m2615();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f181 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f184;
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
        m87();
    }

    public void setItemInvoker(C1164.InterfaceC1165 interfaceC1165) {
        this.f190 = interfaceC1165;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f185 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0042 abstractC0042) {
        this.f191 = abstractC0042;
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTitle(CharSequence charSequence) {
        this.f182 = charSequence;
        m87();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0059
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean mo83() {
        return m84() && this.f187.getIcon() == null;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean m84() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0059
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean mo85() {
        return m84();
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final boolean m86() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final void m87() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f182);
        if (this.f181 != null) {
            if (!((this.f187.f5918 & 4) == 4) || (!this.f186 && !this.f188)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f182 : null);
        CharSequence charSequence = this.f187.f5919;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = z3 ? null : this.f187.f5926;
        }
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.f187.f5925;
        if (TextUtils.isEmpty(charSequence2)) {
            C2786.m4764(this, z3 ? null : this.f187.f5926);
        } else {
            C2786.m4764(this, charSequence2);
        }
    }

    @Override // p034.p050.p051.p052.InterfaceC1195.InterfaceC1196
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void mo88(C1197 c1197, int i) {
        this.f187 = c1197;
        setIcon(c1197.getIcon());
        setTitle(c1197.getTitleCondensed());
        setId(c1197.f5922);
        setVisibility(c1197.isVisible() ? 0 : 8);
        setEnabled(c1197.isEnabled());
        if (c1197.hasSubMenu() && this.f183 == null) {
            this.f183 = new C0043();
        }
    }
}
