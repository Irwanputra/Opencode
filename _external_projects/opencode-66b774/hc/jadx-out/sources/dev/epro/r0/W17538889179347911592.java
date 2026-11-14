package dev.epro.r0;

import ads_mobile_sdk.au0;
import ads_mobile_sdk.b6;
import ads_mobile_sdk.rb1;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W17538889179347911592 extends au0 {
    public final void c(int i) {
        b();
        b6 b6Var = (b6) this.b;
        b6Var.getClass();
        int i2 = 0;
        if (i == 4) {
            byte[] bArr = rb1.a;
            S10973172697741180971.j("Can't get the number of an unknown enum value.");
        } else if (i != 1) {
            i2 = 2;
            if (i == 2) {
                i2 = 1;
            } else if (i != 3) {
                if (i != 4) {
                    throw null;
                }
                i2 = -1;
            }
        }
        b6Var.status_ = i2;
        b6Var.bitField0_ |= 8;
    }
}
