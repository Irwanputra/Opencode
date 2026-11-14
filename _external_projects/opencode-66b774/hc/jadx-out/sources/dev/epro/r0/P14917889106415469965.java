package dev.epro.r0;

import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class P14917889106415469965 extends K10678596132709730734 {
    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) throws IOException {
        boolean zU;
        BitSet bitSet = new BitSet();
        d13396727227989475489.b();
        int iH = d13396727227989475489.H();
        int i = 0;
        while (iH != 2) {
            int iA = L11610354117192841236.A(iH);
            if (iA == 5 || iA == 6) {
                int iZ = d13396727227989475489.z();
                if (iZ == 0) {
                    zU = false;
                } else {
                    if (iZ != 1) {
                        StringBuilder sbQ = E12098517352909843120.q(iZ, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        sbQ.append(d13396727227989475489.o(true));
                        throw new X13554947934760653097(sbQ.toString());
                    }
                    zU = true;
                }
            } else {
                if (iA != 7) {
                    throw new X13554947934760653097("Invalid bitset value type: " + G11450220448113054352.x(iH) + "; at path " + d13396727227989475489.o(false));
                }
                zU = d13396727227989475489.u();
            }
            if (zU) {
                bitSet.set(i);
            }
            i++;
            iH = d13396727227989475489.H();
        }
        d13396727227989475489.g();
        return bitSet;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        y14132333989764804283.c();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            y14132333989764804283.A(bitSet.get(i) ? 1L : 0L);
        }
        y14132333989764804283.g();
    }
}
