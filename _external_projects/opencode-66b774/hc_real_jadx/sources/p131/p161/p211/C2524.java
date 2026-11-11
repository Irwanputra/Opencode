package p131.p161.p211;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;
import p131.p161.p211.p213.C2534;
import p131.p161.p211.p213.C2535;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2524 extends AbstractC2658<AtomicLongArray> {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2658 f9868;

    public C2524(AbstractC2658 abstractC2658) {
        this.f9868 = abstractC2658;
    }

    @Override // p131.p161.p211.AbstractC2658
    /* renamed from: 〺つふすそ */
    public void mo4533(C2534 c2534, AtomicLongArray atomicLongArray) {
        AtomicLongArray atomicLongArray2 = atomicLongArray;
        c2534.mo4557();
        int length = atomicLongArray2.length();
        for (int i = 0; i < length; i++) {
            this.f9868.mo4533(c2534, Long.valueOf(atomicLongArray2.get(i)));
        }
        c2534.mo4555();
    }

    @Override // p131.p161.p211.AbstractC2658
    /* renamed from: げつ〴ぬぐ */
    public AtomicLongArray mo4534(C2535 c2535) {
        ArrayList arrayList = new ArrayList();
        c2535.mo4574();
        while (c2535.mo4563()) {
            arrayList.add(Long.valueOf(((Number) this.f9868.mo4534(c2535)).longValue()));
        }
        c2535.mo4583();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }
}
