package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p034.p050.C1148;
import p034.p050.p051.AbstractC1154;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class ActionBar {

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f113;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f113 = 0;
            this.f113 = 8388627;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f113 = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1148.ActionBarLayout);
            this.f113 = obtainStyledAttributes.getInt(C1148.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f113 = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f113 = 0;
            this.f113 = layoutParams.f113;
        }
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.ActionBar$〺つふすそ, reason: contains not printable characters */
    public static abstract class AbstractC0036 {
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public abstract View m61();

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public abstract Drawable m62();

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public abstract CharSequence m63();

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public abstract void m64();

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public abstract CharSequence m65();
    }

    /* renamed from: androidx.appcompat.app.ActionBar$げつ〴ぬぐ, reason: contains not printable characters */
    public interface InterfaceC0037 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void m66(boolean z);
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void mo42() {
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public abstract boolean mo43();

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public abstract void mo44(Configuration configuration);

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean mo45(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public abstract void mo46(boolean z);

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public abstract void mo47(CharSequence charSequence);

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public abstract void mo48(Drawable drawable);

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public abstract void mo49(boolean z);

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean mo50() {
        return false;
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public abstract void mo51(CharSequence charSequence);

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public abstract Context mo52();

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public abstract void mo53(boolean z);

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean mo54() {
        return false;
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public abstract void mo55(boolean z);

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public AbstractC1154 mo56(AbstractC1154.InterfaceC1155 interfaceC1155) {
        return null;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public abstract int mo57();

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public abstract void mo58(int i);

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public abstract boolean mo59(int i, KeyEvent keyEvent);

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean mo60() {
        return false;
    }
}
