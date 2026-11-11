package p131.p161.p162.p163.p167;

import android.graphics.Typeface;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぅみぱぎぎ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2148 extends AbstractC2150 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final InterfaceC2149 f9003;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f9004;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Typeface f9005;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぅみぱぎぎ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public interface InterfaceC2149 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void mo4234(Typeface typeface);
    }

    public C2148(InterfaceC2149 interfaceC2149, Typeface typeface) {
        this.f9005 = typeface;
        this.f9003 = interfaceC2149;
    }

    @Override // p131.p161.p162.p163.p167.AbstractC2150
    /* renamed from: 〺つふすそ */
    public void mo1390(Typeface typeface, boolean z) {
        if (this.f9004) {
            return;
        }
        this.f9003.mo4234(typeface);
    }

    @Override // p131.p161.p162.p163.p167.AbstractC2150
    /* renamed from: げつ〴ぬぐ */
    public void mo1391(int i) {
        Typeface typeface = this.f9005;
        if (this.f9004) {
            return;
        }
        this.f9003.mo4234(typeface);
    }
}
