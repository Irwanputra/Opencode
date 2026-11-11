package p010.p011.p012.p013;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import de.blinkt.openvpn.core.DeviceStateReceiver;
import de.blinkt.openvpn.core.OpenVPNService;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public interface InterfaceC0761 extends IInterface {

    /* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.なぎぱいぢぎ$げつ〴ぬぐ, reason: contains not printable characters */
    public static abstract class AbstractBinderC0762 extends Binder implements InterfaceC0761 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public static final /* synthetic */ int f4899 = 0;

        /* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.なぎぱいぢぎ$げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0763 implements InterfaceC0761 {

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public IBinder f4900;

            public C0763(IBinder iBinder) {
                this.f4900 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4900;
            }

            @Override // p010.p011.p012.p013.InterfaceC0761
            /* renamed from: ぉざぅち〻 */
            public void mo1585(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Crypt.a(Crypt.xrc("\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196nK3:J1;LfnI6=I39\u001d19LdmAbgK6l\u001benOg>O0m\u001cj<Md<\u001c7nKk:@1k\u001ckj\u001efk\u001bkg\u001d0j")));
                    obtain.writeString(str);
                    if (!this.f4900.transact(4, obtain, obtain2, 0)) {
                        int i = AbstractBinderC0762.f4899;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p010.p011.p012.p013.InterfaceC0761
            /* renamed from: げつ〴ぬぐ */
            public boolean mo1589(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Crypt.a(Crypt.xrc("\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196nK3:J1;LfnI6=I39\u001d19LdmAbgK6l\u001benOg>O0m\u001cj<Md<\u001c7nKk:@1k\u001ckj\u001efk\u001bkg\u001d0j")));
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.f4900.transact(3, obtain, obtain2, 0)) {
                        int i = AbstractBinderC0762.f4899;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0762() {
            attachInterface(this, Crypt.a(Crypt.xrc("\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196nK3:J1;LfnI6=I39\u001d19LdmAbgK6l\u001benOg>O0m\u001cj<Md<\u001c7nKk:@1k\u001ckj\u001efk\u001bkg\u001d0j")));
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public static InterfaceC0761 m2056(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(Crypt.a(Crypt.xrc("\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196nK3:J1;LfnI6=I39\u001d19LdmAbgK6l\u001benOg>O0m\u001cj<Md<\u001c7nKk:@1k\u001ckj\u001efk\u001bkg\u001d0j")));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0761)) ? new C0763(iBinder) : (InterfaceC0761) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String a = Crypt.a(Crypt.xrc("\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196nK3:J1;LfnI6=I39\u001d19LdmAbgK6l\u001benOg>O0m\u001cj<Md<\u001c7nKk:@1k\u001ckj\u001efk\u001bkg\u001d0j"));
            if (i == 1598968902) {
                parcel2.writeString(a);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(a);
                    boolean protect = OpenVPNService.this.protect(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(protect ? 1 : 0);
                    return true;
                case 2:
                    parcel.enforceInterface(a);
                    boolean z = parcel.readInt() != 0;
                    DeviceStateReceiver deviceStateReceiver = OpenVPNService.this.f3715;
                    if (deviceStateReceiver != null) {
                        deviceStateReceiver.m1572(z);
                    }
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(a);
                    boolean mo1589 = ((OpenVPNService.BinderC0497) this).mo1589(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(mo1589 ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface(a);
                    OpenVPNService.this.mo1585(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(a);
                    boolean m1587 = OpenVPNService.this.m1587(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(m1587 ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface(a);
                    OpenVPNService.this.m1594(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: ぉざぅち〻 */
    void mo1585(String str);

    /* renamed from: げつ〴ぬぐ */
    boolean mo1589(boolean z);
}
