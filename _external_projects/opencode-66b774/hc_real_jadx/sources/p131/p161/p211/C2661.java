package p131.p161.p211;

import p131.p161.p211.p213.C2534;
import p131.p161.p211.p213.C2535;
import p131.p161.p211.p213.EnumC2533;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.びえぁぜい, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2661<T> extends AbstractC2658<T> {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2658 f10118;

    public C2661(AbstractC2658 abstractC2658) {
        this.f10118 = abstractC2658;
    }

    @Override // p131.p161.p211.AbstractC2658
    /* renamed from: 〺つふすそ */
    public void mo4533(C2534 c2534, T t) {
        if (t == null) {
            c2534.mo4541();
        } else {
            this.f10118.mo4533(c2534, t);
        }
    }

    @Override // p131.p161.p211.AbstractC2658
    /* renamed from: げつ〴ぬぐ */
    public T mo4534(C2535 c2535) {
        if (c2535.mo4559() != EnumC2533.NULL) {
            return (T) this.f10118.mo4534(c2535);
        }
        c2535.mo4572();
        return null;
    }
}
