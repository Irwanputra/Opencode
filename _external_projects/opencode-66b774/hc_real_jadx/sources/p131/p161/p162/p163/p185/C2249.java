package p131.p161.p162.p163.p185;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p131.p161.p162.p163.p167.AbstractC2150;
import p131.p161.p162.p163.p167.C2145;
import p131.p161.p162.p163.p167.C2147;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2249 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public float f9366;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public WeakReference<InterfaceC2250> f9368;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C2145 f9369;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final TextPaint f9367 = new TextPaint(1);

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final AbstractC2150 f9365 = new C2251();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f9370 = true;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.〳ぜぞぜべっ$〺つふすそ, reason: contains not printable characters */
    public interface InterfaceC2250 {
        int[] getState();

        boolean onStateChange(int[] iArr);

        /* renamed from: げつ〴ぬぐ */
        void mo1302();
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.〳ぜぞぜべっ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2251 extends AbstractC2150 {
        public C2251() {
        }

        @Override // p131.p161.p162.p163.p167.AbstractC2150
        /* renamed from: 〺つふすそ */
        public void mo1390(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            C2249 c2249 = C2249.this;
            c2249.f9370 = true;
            InterfaceC2250 interfaceC2250 = c2249.f9368.get();
            if (interfaceC2250 != null) {
                interfaceC2250.mo1302();
            }
        }

        @Override // p131.p161.p162.p163.p167.AbstractC2150
        /* renamed from: げつ〴ぬぐ */
        public void mo1391(int i) {
            C2249 c2249 = C2249.this;
            c2249.f9370 = true;
            InterfaceC2250 interfaceC2250 = c2249.f9368.get();
            if (interfaceC2250 != null) {
                interfaceC2250.mo1302();
            }
        }
    }

    public C2249(InterfaceC2250 interfaceC2250) {
        this.f9368 = new WeakReference<>(null);
        this.f9368 = new WeakReference<>(interfaceC2250);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m4398(C2145 c2145, Context context) {
        if (this.f9369 != c2145) {
            this.f9369 = c2145;
            if (c2145 != null) {
                TextPaint textPaint = this.f9367;
                AbstractC2150 abstractC2150 = this.f9365;
                c2145.m4232();
                c2145.m4233(textPaint, c2145.f8993);
                c2145.m4230(context, new C2147(c2145, textPaint, abstractC2150));
                InterfaceC2250 interfaceC2250 = this.f9368.get();
                if (interfaceC2250 != null) {
                    this.f9367.drawableState = interfaceC2250.getState();
                }
                c2145.m4231(context, this.f9367, this.f9365);
                this.f9370 = true;
            }
            InterfaceC2250 interfaceC22502 = this.f9368.get();
            if (interfaceC22502 != null) {
                interfaceC22502.mo1302();
                interfaceC22502.onStateChange(interfaceC22502.getState());
            }
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public float m4399(String str) {
        if (!this.f9370) {
            return this.f9366;
        }
        float measureText = str == null ? 0.0f : this.f9367.measureText((CharSequence) str, 0, str.length());
        this.f9366 = measureText;
        this.f9370 = false;
        return measureText;
    }
}
