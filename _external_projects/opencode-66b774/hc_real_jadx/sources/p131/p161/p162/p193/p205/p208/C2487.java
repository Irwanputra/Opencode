package p131.p161.p162.p193.p205.p208;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzz;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.くし〴〺ぅ.おぐぴう〸ず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2487 implements InterfaceC2505 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final IBinder f9820;

    public C2487(IBinder iBinder) {
        this.f9820 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9820;
    }

    @Override // p131.p161.p162.p193.p205.p208.InterfaceC2505
    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public final void mo4515(InterfaceC2495 interfaceC2495, zzz zzzVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(interfaceC2495.asBinder());
            obtain.writeInt(1);
            zzzVar.writeToParcel(obtain, 0);
            this.f9820.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
