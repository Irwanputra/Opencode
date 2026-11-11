package p015.p016.p019;

import p015.p016.p020.AbstractC0974;
import p015.p016.p020.C0976;

/* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0914 implements InterfaceC0915 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C0913 f5237;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final AbstractC0917 f5238;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C0976 f5239;

    public C0914(C0976 c0976, C0913 c0913, AbstractC0917 abstractC0917) {
        this.f5239 = c0976;
        this.f5237 = c0913;
        this.f5238 = abstractC0917;
    }

    @Override // p015.p016.p019.InterfaceC0915
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void mo2240(AbstractC0974 abstractC0974, int i) {
    }

    @Override // p015.p016.p019.InterfaceC0915
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo2241(AbstractC0974 abstractC0974, int i) {
        if (abstractC0974 instanceof C0976) {
            C0976 c0976 = (C0976) abstractC0974;
            if (this.f5238.mo2237(this.f5239, c0976)) {
                this.f5237.add(c0976);
            }
        }
    }
}
