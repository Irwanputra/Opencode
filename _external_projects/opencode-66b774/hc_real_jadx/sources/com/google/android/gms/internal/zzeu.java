package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: /tmp/opencode/hc_real.dex */
public class zzeu implements IInterface {
    private final IBinder zzalc;
    private final String zzald;

    public zzeu(IBinder iBinder, String str) {
        this.zzalc = iBinder;
        this.zzald = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.zzalc;
    }

    public final Parcel zza(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.zzalc.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final void zzb(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.zzalc.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final Parcel zzbe() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zzald);
        return obtain;
    }

    public final void zzc(int i, Parcel parcel) {
        try {
            this.zzalc.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
