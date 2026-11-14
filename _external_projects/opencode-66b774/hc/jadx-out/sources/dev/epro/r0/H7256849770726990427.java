package dev.epro.r0;

import ads_mobile_sdk.au0;
import ads_mobile_sdk.rb1;
import ads_mobile_sdk.rc2;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H7256849770726990427 extends au0 {
    public final void c(int i) {
        b();
        rc2 rc2Var = (rc2) this.b;
        rc2Var.getClass();
        int i2 = 0;
        if (i != 6) {
            switch (i) {
                case 1:
                    break;
                case 2:
                    i2 = 1;
                    break;
                case 3:
                    i2 = 2;
                    break;
                case 4:
                    i2 = 3;
                    break;
                case 5:
                    i2 = 4;
                    break;
                case 6:
                    i2 = -1;
                    break;
                default:
                    throw null;
            }
        } else {
            byte[] bArr = rb1.a;
            S10973172697741180971.j("Can't get the number of an unknown enum value.");
        }
        rc2Var.fillDisabledReason_ = i2;
        rc2Var.bitField0_ |= 4;
    }
}
