package dev.epro.r0;

import android.content.Context;
import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final /* synthetic */ class L11725228430494186389 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ S2557420383749238385 b;

    public /* synthetic */ L11725228430494186389(S2557420383749238385 s2557420383749238385, byte b) {
        this.a = b;
        this.b = s2557420383749238385;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        int i;
        byte b = this.a;
        S2557420383749238385 s2557420383749238385 = this.b;
        switch (b) {
            case 0:
                U14177313425639231181 u14177313425639231181 = s2557420383749238385.f;
                boolean z = false;
                if (s2557420383749238385.g) {
                    N11678082982039175888 n11678082982039175888 = s2557420383749238385.b.f;
                    if (n11678082982039175888 == null || !n11678082982039175888.isEmpty()) {
                        Iterator it = n11678082982039175888.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (!(((R14289894334981469490) it.next()).b instanceof Q4132023691817090890) && (i = i + 1) < 0) {
                                K5751602218013079365.e0();
                                throw null;
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (i > 1) {
                        z = true;
                    }
                }
                u14177313425639231181.setEnabled(z);
                return O9245300239821758723.a;
            default:
                Context context = s2557420383749238385.a;
                G1840519957725232630 g1840519957725232630 = s2557420383749238385.b.s;
                context.getClass();
                g1840519957725232630.getClass();
                return new G1342353298891221680();
        }
    }
}
