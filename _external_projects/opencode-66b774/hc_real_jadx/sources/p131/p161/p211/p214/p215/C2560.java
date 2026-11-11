package p131.p161.p211.p214.p215;

import p131.p161.p211.AbstractC2658;
import p131.p161.p211.C2673;
import p131.p161.p211.InterfaceC2656;
import p131.p161.p211.p218.C2672;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.ぇぬぎばつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2560 implements InterfaceC2656 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ C2672 f9942;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2658 f9943;

    public C2560(C2672 c2672, AbstractC2658 abstractC2658) {
        this.f9942 = c2672;
        this.f9943 = abstractC2658;
    }

    @Override // p131.p161.p211.InterfaceC2656
    /* renamed from: げつ〴ぬぐ */
    public <T> AbstractC2658<T> mo4592(C2673 c2673, C2672<T> c2672) {
        if (c2672.equals(this.f9942)) {
            return this.f9943;
        }
        return null;
    }
}
