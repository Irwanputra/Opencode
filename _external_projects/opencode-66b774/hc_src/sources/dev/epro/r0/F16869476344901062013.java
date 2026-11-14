package dev.epro.r0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F16869476344901062013 extends Binder implements IInterface {
    public final /* synthetic */ M17133811648581684718 a;

    public F16869476344901062013(M17133811648581684718 m17133811648581684718) {
        this.a = m17133811648581684718;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i3 = M9500913202453405055.a;
        Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        N3755692042688883577 createFromParcel2 = parcel.readInt() == 0 ? null : N3755692042688883577.CREATOR.createFromParcel(parcel);
        R122968600551594484 r122968600551594484 = createFromParcel2 != null ? new R122968600551594484(createFromParcel2.d, createFromParcel2.e) : null;
        S14461012662136963693 s14461012662136963693 = this.a.a;
        if (createFromParcel.d <= 0) {
            s14461012662136963693.f(r122968600551594484);
            return true;
        }
        s14461012662136963693.e(new X4906216915227203322(createFromParcel));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
