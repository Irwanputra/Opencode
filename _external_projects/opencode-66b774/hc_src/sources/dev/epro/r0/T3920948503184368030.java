package dev.epro.r0;

import ads_mobile_sdk.gg0;
import ads_mobile_sdk.yj3;
import android.os.Parcel;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T3920948503184368030 extends I11267981316413440737 implements B1049225300677980478 {
    public final void e(gg0 gg0Var, yj3 yj3Var) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i = Z15241293964366332233.a;
        obtain.writeInt(1);
        gg0Var.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(yj3Var);
        Parcel obtain2 = Parcel.obtain();
        try {
            this.b.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
