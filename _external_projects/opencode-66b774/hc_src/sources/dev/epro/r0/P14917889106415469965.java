package dev.epro.r0;

import java.util.BitSet;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public class P14917889106415469965 extends K10678596132709730734 {
    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) {
        boolean z;
        BitSet bitSet = new BitSet();
        d13396727227989475489.b();
        int H = d13396727227989475489.H();
        int i = 0;
        while (H != 2) {
            int A = L11610354117192841236.A(H);
            if (A == 5 || A == 6) {
                int z2 = d13396727227989475489.z();
                if (z2 == 0) {
                    z = false;
                } else {
                    if (z2 != 1) {
                        StringBuilder q = E12098517352909843120.q(z2, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        q.append(d13396727227989475489.o(true));
                        throw new X13554947934760653097(q.toString());
                    }
                    z = true;
                }
            } else {
                if (A != 7) {
                    throw new X13554947934760653097("Invalid bitset value type: " + G11450220448113054352.x(H) + "; at path " + d13396727227989475489.o(false));
                }
                z = d13396727227989475489.u();
            }
            if (z) {
                bitSet.set(i);
            }
            i++;
            H = d13396727227989475489.H();
        }
        d13396727227989475489.g();
        return bitSet;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) {
        BitSet bitSet = (BitSet) obj;
        y14132333989764804283.c();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            y14132333989764804283.A(bitSet.get(i) ? 1L : 0L);
        }
        y14132333989764804283.g();
    }
}
