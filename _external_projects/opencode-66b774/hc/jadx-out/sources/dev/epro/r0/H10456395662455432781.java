package dev.epro.r0;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H10456395662455432781 implements F11625739791267273945 {
    public IBinder a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    public final boolean b(F4673815160636847046 f4673815160636847046) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(F11625739791267273945.So);
            parcelObtain.writeStrongInterface(f4673815160636847046);
            this.a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final boolean c() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(F11625739791267273945.So);
            parcelObtain.writeLong(0L);
            this.a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
