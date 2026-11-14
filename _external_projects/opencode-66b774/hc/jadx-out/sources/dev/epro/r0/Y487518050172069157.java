package dev.epro.r0;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y487518050172069157 implements L11636844115202314953 {
    public IBinder a;

    @Override // dev.epro.r0.L11636844115202314953
    public final void a(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(L11636844115202314953.To);
            parcelObtain.writeStringArray(strArr);
            this.a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
