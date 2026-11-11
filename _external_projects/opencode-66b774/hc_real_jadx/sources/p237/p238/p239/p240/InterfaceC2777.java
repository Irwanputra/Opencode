package p237.p238.p239.p240;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.os.ResultReceiver;

/* renamed from: びぐびあび.げつ〴ぬぐ.げつ〴ぬぐ.〺つふすそ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public interface InterfaceC2777 extends IInterface {

    /* renamed from: びぐびあび.げつ〴ぬぐ.げつ〴ぬぐ.〺つふすそ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public static abstract class AbstractBinderC2778 extends Binder implements InterfaceC2777 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public static final /* synthetic */ int f10425 = 0;

        /* renamed from: びぐびあび.げつ〴ぬぐ.げつ〴ぬぐ.〺つふすそ.げつ〴ぬぐ$げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C2779 implements InterfaceC2777 {

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public IBinder f10426;

            public C2779(IBinder iBinder) {
                this.f10426 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10426;
            }

            @Override // p237.p238.p239.p240.InterfaceC2777
            /* renamed from: びえぁぜい */
            public void mo34(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f10426.transact(1, obtain, null, 1)) {
                        int i2 = AbstractBinderC2778.f10425;
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC2778() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                ((ResultReceiver.BinderC0031) this).mo34(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("android.support.v4.os.IResultReceiver");
            return true;
        }
    }

    /* renamed from: びえぁぜい */
    void mo34(int i, Bundle bundle);
}
