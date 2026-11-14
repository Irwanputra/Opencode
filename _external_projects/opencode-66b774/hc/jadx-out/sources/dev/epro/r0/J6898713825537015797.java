package dev.epro.r0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J6898713825537015797 extends L14144435763408236280 {
    public E1636901823844057514 j;
    public final int k;

    public J6898713825537015797(E1636901823844057514 e1636901823844057514, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", (byte) 3);
        this.j = e1636901823844057514;
        this.k = i;
    }

    @Override // dev.epro.r0.L14144435763408236280
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        int i2 = this.k;
        if (i == 1) {
            int i3 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) R17194208210488071321.a(parcel, Bundle.CREATOR);
            R17194208210488071321.c(parcel);
            M18113111391818111737.w("onPostInitComplete can be called only once per call to getRemoteService", this.j);
            E1636901823844057514 e1636901823844057514 = this.j;
            e1636901823844057514.getClass();
            A12579232015529019125 a12579232015529019125 = new A12579232015529019125(e1636901823844057514, i3, strongBinder, bundle);
            C4270155929442575666 c4270155929442575666 = e1636901823844057514.zzb;
            c4270155929442575666.sendMessage(c4270155929442575666.obtainMessage(1, i2, -1, a12579232015529019125));
            this.j = null;
        } else if (i == 2) {
            parcel.readInt();
            R17194208210488071321.c(parcel);
            new Exception();
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            Y9189380382094246501 y9189380382094246501 = (Y9189380382094246501) R17194208210488071321.a(parcel, Y9189380382094246501.CREATOR);
            R17194208210488071321.c(parcel);
            E1636901823844057514 e16369018238440575142 = this.j;
            M18113111391818111737.w("onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService", e16369018238440575142);
            M18113111391818111737.v(y9189380382094246501);
            e16369018238440575142.zzc(y9189380382094246501);
            Bundle bundle2 = y9189380382094246501.d;
            M18113111391818111737.w("onPostInitComplete can be called only once per call to getRemoteService", this.j);
            E1636901823844057514 e16369018238440575143 = this.j;
            e16369018238440575143.getClass();
            A12579232015529019125 a125792320155290191252 = new A12579232015529019125(e16369018238440575143, i4, strongBinder2, bundle2);
            C4270155929442575666 c42701559294425756662 = e16369018238440575143.zzb;
            c42701559294425756662.sendMessage(c42701559294425756662.obtainMessage(1, i2, -1, a125792320155290191252));
            this.j = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
