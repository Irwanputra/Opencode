package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p034.p035.p045.C1096;
import p034.p050.p051.p052.C1164;
import p034.p050.p053.InterfaceC1258;
import p034.p050.p060.C1305;
import p034.p050.p060.LayoutInflaterFactory2C1320;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final Rect f398;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public TypedValue f399;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public TypedValue f400;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public TypedValue f401;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public TypedValue f402;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public TypedValue f403;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public TypedValue f404;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public InterfaceC0077 f405;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$げつ〴ぬぐ, reason: contains not printable characters */
    public interface InterfaceC0077 {
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f398 = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f403 == null) {
            this.f403 = new TypedValue();
        }
        return this.f403;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f400 == null) {
            this.f400 = new TypedValue();
        }
        return this.f400;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f404 == null) {
            this.f404 = new TypedValue();
        }
        return this.f404;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f402 == null) {
            this.f402 = new TypedValue();
        }
        return this.f402;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f399 == null) {
            this.f399 = new TypedValue();
        }
        return this.f399;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f401 == null) {
            this.f401 = new TypedValue();
        }
        return this.f401;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0077 interfaceC0077 = this.f405;
        if (interfaceC0077 != null) {
            ((C1305) interfaceC0077).getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0077 interfaceC0077 = this.f405;
        if (interfaceC0077 != null) {
            LayoutInflaterFactory2C1320 layoutInflaterFactory2C1320 = ((C1305) interfaceC0077).f6310;
            InterfaceC1258 interfaceC1258 = layoutInflaterFactory2C1320.f6381;
            if (interfaceC1258 != null) {
                interfaceC1258.mo103();
            }
            if (layoutInflaterFactory2C1320.f6364 != null) {
                layoutInflaterFactory2C1320.f6385.getDecorView().removeCallbacks(layoutInflaterFactory2C1320.f6375);
                if (layoutInflaterFactory2C1320.f6364.isShowing()) {
                    try {
                        layoutInflaterFactory2C1320.f6364.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C1320.f6364 = null;
            }
            layoutInflaterFactory2C1320.m2983();
            C1164 c1164 = layoutInflaterFactory2C1320.m2998(0).f6417;
            if (c1164 != null) {
                c1164.m2619(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0077 interfaceC0077) {
        this.f405 = interfaceC0077;
    }

    public void setDecorPadding(int i, int i2, int i3, int i4) {
        this.f398.set(i, i2, i3, i4);
        if (C1096.m2517(this)) {
            requestLayout();
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m166(Rect rect) {
        fitSystemWindows(rect);
    }
}
