package p131.p161.p162.p193.p205.p208;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.zzev;
import com.google.android.gms.internal.zzew;
import p034.p095.C1687;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.くし〴〺ぅ.のぷのちつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractBinderC2500 extends zzev implements InterfaceC2495 {
    public AbstractBinderC2500() {
        attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zzew.zza(parcel, Bundle.CREATOR);
            BinderC2483 binderC2483 = (BinderC2483) this;
            C1687.m3726(binderC2483.f9815, "onPostInitComplete can be called only once per call to getRemoteService");
            binderC2483.f9815.zza(readInt, readStrongBinder, bundle, binderC2483.f9816);
            binderC2483.f9815 = null;
        } else {
            if (i != 2) {
                return false;
            }
            parcel.readInt();
            new Exception();
        }
        parcel2.writeNoException();
        return true;
    }
}
