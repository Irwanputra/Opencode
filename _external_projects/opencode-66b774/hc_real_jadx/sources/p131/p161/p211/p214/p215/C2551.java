package p131.p161.p211.p214.p215;

import java.util.ArrayList;
import p131.p161.p211.AbstractC2658;
import p131.p161.p211.C2673;
import p131.p161.p211.InterfaceC2656;
import p131.p161.p211.p213.C2534;
import p131.p161.p211.p213.C2535;
import p131.p161.p211.p214.C2637;
import p131.p161.p211.p218.C2672;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2551 extends AbstractC2658<Object> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final InterfaceC2656 f9921 = new C2552();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C2673 f9922;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.〳ぜぞぜべっ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2552 implements InterfaceC2656 {
        @Override // p131.p161.p211.InterfaceC2656
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public <T> AbstractC2658<T> mo4592(C2673 c2673, C2672<T> c2672) {
            if (c2672.f10130 == Object.class) {
                return new C2551(c2673);
            }
            return null;
        }
    }

    public C2551(C2673 c2673) {
        this.f9922 = c2673;
    }

    @Override // p131.p161.p211.AbstractC2658
    /* renamed from: 〺つふすそ */
    public void mo4533(C2534 c2534, Object obj) {
        if (obj == null) {
            c2534.mo4541();
            return;
        }
        C2673 c2673 = this.f9922;
        Class<?> cls = obj.getClass();
        c2673.getClass();
        AbstractC2658 m4646 = c2673.m4646(new C2672(cls));
        if (!(m4646 instanceof C2551)) {
            m4646.mo4533(c2534, obj);
        } else {
            c2534.mo4543();
            c2534.mo4545();
        }
    }

    @Override // p131.p161.p211.AbstractC2658
    /* renamed from: げつ〴ぬぐ */
    public Object mo4534(C2535 c2535) {
        int ordinal = c2535.mo4559().ordinal();
        if (ordinal == 0) {
            ArrayList arrayList = new ArrayList();
            c2535.mo4574();
            while (c2535.mo4563()) {
                arrayList.add(mo4534(c2535));
            }
            c2535.mo4583();
            return arrayList;
        }
        if (ordinal == 2) {
            C2637 c2637 = new C2637();
            c2535.mo4585();
            while (c2535.mo4563()) {
                c2637.put(c2535.mo4582(), mo4534(c2535));
            }
            c2535.mo4570();
            return c2637;
        }
        if (ordinal == 5) {
            return c2535.mo4580();
        }
        if (ordinal == 6) {
            return Double.valueOf(c2535.mo4578());
        }
        if (ordinal == 7) {
            return Boolean.valueOf(c2535.mo4562());
        }
        if (ordinal != 8) {
            throw new IllegalStateException();
        }
        c2535.mo4572();
        return null;
    }
}
