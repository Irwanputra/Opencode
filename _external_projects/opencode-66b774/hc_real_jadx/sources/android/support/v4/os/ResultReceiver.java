package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import p237.p238.p239.p240.InterfaceC2777;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: /tmp/opencode/hc_real.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C0032();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public InterfaceC2777 f90;

    /* renamed from: android.support.v4.os.ResultReceiver$〺つふすそ, reason: contains not printable characters */
    public class BinderC0031 extends InterfaceC2777.AbstractBinderC2778 {
        public BinderC0031() {
        }

        @Override // p237.p238.p239.p240.InterfaceC2777
        /* renamed from: びえぁぜい, reason: contains not printable characters */
        public void mo34(int i, Bundle bundle) {
            ResultReceiver.this.getClass();
            ResultReceiver.this.mo0(i, bundle);
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0032 implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    public ResultReceiver(Parcel parcel) {
        InterfaceC2777 c2779;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i = InterfaceC2777.AbstractBinderC2778.f10425;
        if (readStrongBinder == null) {
            c2779 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            c2779 = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC2777)) ? new InterfaceC2777.AbstractBinderC2778.C2779(readStrongBinder) : (InterfaceC2777) queryLocalInterface;
        }
        this.f90 = c2779;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f90 == null) {
                this.f90 = new BinderC0031();
            }
            parcel.writeStrongBinder(this.f90.asBinder());
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void m33(int i, Bundle bundle) {
        InterfaceC2777 interfaceC2777 = this.f90;
        if (interfaceC2777 != null) {
            try {
                interfaceC2777.mo34(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: なぎぱいぢぎ */
    public void mo0(int i, Bundle bundle) {
    }
}
