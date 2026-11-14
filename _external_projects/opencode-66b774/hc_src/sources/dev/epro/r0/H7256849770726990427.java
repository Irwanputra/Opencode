package dev.epro.r0;

import ads_mobile_sdk.au0;
import ads_mobile_sdk.rb1;
import ads_mobile_sdk.rc2;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H7256849770726990427 extends au0 {
    public final void c(int i) {
        int i2;
        b();
        rc2 rc2Var = (rc2) this.b;
        rc2Var.getClass();
        int i3 = 0;
        if (i != 6) {
            switch (i) {
                case 1:
                    break;
                case 2:
                    i3 = 1;
                    break;
                case 3:
                    i3 = 2;
                    break;
                case 4:
                    i3 = 3;
                    break;
                case 5:
                    i3 = 4;
                    break;
                case 6:
                    i3 = -1;
                    break;
                default:
                    throw null;
            }
        } else {
            byte[] bArr = rb1.a;
            S10973172697741180971.j("Can't get the number of an unknown enum value.");
        }
        rc2Var.fillDisabledReason_ = i3;
        i2 = rc2Var.bitField0_;
        rc2Var.bitField0_ = i2 | 4;
    }
}
