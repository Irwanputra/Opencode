package p010.p011.p012.p013;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import de.blinkt.openvpn.core.OpenVPNStatusService;
import de.blinkt.openvpn.core.TrafficHistory;
import java.util.UUID;
import p010.p011.p012.p013.InterfaceC0728;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public interface InterfaceC0734 extends IInterface {

    /* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.ぁごぐすすぃ$げつ〴ぬぐ, reason: contains not printable characters */
    public static abstract class AbstractBinderC0735 extends Binder implements InterfaceC0734 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public static final /* synthetic */ int f4826 = 0;

        /* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.ぁごぐすすぃ$げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0736 implements InterfaceC0734 {

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public IBinder f4827;

            public C0736(IBinder iBinder) {
                this.f4827 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4827;
            }

            @Override // p010.p011.p012.p013.InterfaceC0734
            /* renamed from: は〲ぱなで */
            public TrafficHistory mo1597() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Crypt.a(Crypt.xrc("\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196f\u001acg\u001da:If;I79H1n\u001b7<\u00193m\u001c6<IfhHe=Hjm\u001cagOdl\u001b3>KklN79@dhI0n\u001bbn\u001cgo\u001cgj")));
                    if (!this.f4827.transact(5, obtain, obtain2, 0)) {
                        int i = AbstractBinderC0735.f4826;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? TrafficHistory.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p010.p011.p012.p013.InterfaceC0734
            /* renamed from: へぬ〴づぞ */
            public ParcelFileDescriptor mo1598(InterfaceC0728 interfaceC0728) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Crypt.a(Crypt.xrc("\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196f\u001acg\u001da:If;I79H1n\u001b7<\u00193m\u001c6<IfhHe=Hjm\u001cagOdl\u001b3>KklN79@dhI0n\u001bbn\u001cgo\u001cgj")));
                    obtain.writeStrongBinder(interfaceC0728 != null ? interfaceC0728.asBinder() : null);
                    if (!this.f4827.transact(1, obtain, obtain2, 0)) {
                        int i = AbstractBinderC0735.f4826;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p010.p011.p012.p013.InterfaceC0734
            /* renamed from: ぺぁあねじ */
            public String mo1599() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Crypt.a(Crypt.xrc("\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196f\u001acg\u001da:If;I79H1n\u001b7<\u00193m\u001c6<IfhHe=Hjm\u001cagOdl\u001b3>KklN79@dhI0n\u001bbn\u001cgo\u001cgj")));
                    if (!this.f4827.transact(3, obtain, obtain2, 0)) {
                        int i = AbstractBinderC0735.f4826;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0735() {
            attachInterface(this, Crypt.a(Crypt.xrc("\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196f\u001acg\u001da:If;I79H1n\u001b7<\u00193m\u001c6<IfhHe=Hjm\u001cagOdl\u001b3>KklN79@dhI0n\u001bbn\u001cgo\u001cgj")));
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String a = Crypt.a(Crypt.xrc("\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196f\u001acg\u001da:If;I79H1n\u001b7<\u00193m\u001c6<IfhHe=Hjm\u001cagOdl\u001b3>KklN79@dhI0n\u001bbn\u001cgo\u001cgj"));
            if (i == 1) {
                parcel.enforceInterface(a);
                ParcelFileDescriptor mo1598 = ((OpenVPNStatusService.BinderC0500) this).mo1598(InterfaceC0728.AbstractBinderC0729.m1991(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (mo1598 != null) {
                    parcel2.writeInt(1);
                    mo1598.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(a);
                OpenVPNStatusService.f3726.unregister(InterfaceC0728.AbstractBinderC0729.m1991(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(a);
                String str = C0753.f4882;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface(a);
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                String readString2 = parcel.readString();
                C0758 m2055 = C0758.m2055(UUID.fromString(readString));
                if (readInt == 2) {
                    m2055.f4892 = readString2;
                } else if (readInt == 3) {
                    m2055.f4893 = readString2;
                }
                parcel2.writeNoException();
                return true;
            }
            if (i != 5) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(a);
                return true;
            }
            parcel.enforceInterface(a);
            TrafficHistory trafficHistory = C0753.f4883;
            parcel2.writeNoException();
            if (trafficHistory != null) {
                parcel2.writeInt(1);
                trafficHistory.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    /* renamed from: は〲ぱなで */
    TrafficHistory mo1597();

    /* renamed from: へぬ〴づぞ */
    ParcelFileDescriptor mo1598(InterfaceC0728 interfaceC0728);

    /* renamed from: ぺぁあねじ */
    String mo1599();
}
