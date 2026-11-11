package p010.p011.p012.p013;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import de.blinkt.openvpn.core.ConnectionStatus;
import de.blinkt.openvpn.core.LogItem;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public interface InterfaceC0728 extends IInterface {

    /* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.〳ぜぞぜべっ$げつ〴ぬぐ, reason: contains not printable characters */
    public static abstract class AbstractBinderC0729 extends Binder implements InterfaceC0728 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public static final /* synthetic */ int f4811 = 0;

        /* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.〳ぜぞぜべっ$げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0730 implements InterfaceC0728 {

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public IBinder f4812;

            public C0730(IBinder iBinder) {
                this.f4812 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4812;
            }

            @Override // p010.p011.p012.p013.InterfaceC0728
            /* renamed from: 〻ぞまぎな〻 */
            public void mo1987(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Crypt.a(Crypt.xrc("\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196;Jb;OcmH1gMbiNejMeo\u001bfj\u001ck=K6iH3g\u001bgnJ0lOjnJ3k\u001cb:\u001beg\u001d4iM0jLk:\u001d6kO6o")));
                    obtain.writeString(str);
                    if (!this.f4812.transact(4, obtain, null, 1)) {
                        int i = AbstractBinderC0729.f4811;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // p010.p011.p012.p013.InterfaceC0728
            /* renamed from: ぇぬぎばつ */
            public void mo1988(long j, long j2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Crypt.a(Crypt.xrc("\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196;Jb;OcmH1gMbiNejMeo\u001bfj\u001ck=K6iH3g\u001bgnJ0lOjnJ3k\u001cb:\u001beg\u001d4iM0jLk:\u001d6kO6o")));
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    if (!this.f4812.transact(3, obtain, null, 1)) {
                        int i = AbstractBinderC0729.f4811;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // p010.p011.p012.p013.InterfaceC0728
            /* renamed from: でどあくず */
            public void mo1989(LogItem logItem) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Crypt.a(Crypt.xrc("\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196;Jb;OcmH1gMbiNejMeo\u001bfj\u001ck=K6iH3g\u001bgnJ0lOjnJ3k\u001cb:\u001beg\u001d4iM0jLk:\u001d6kO6o")));
                    if (logItem != null) {
                        obtain.writeInt(1);
                        logItem.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f4812.transact(1, obtain, null, 1)) {
                        int i = AbstractBinderC0729.f4811;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // p010.p011.p012.p013.InterfaceC0728
            /* renamed from: ぶでにく〼〳 */
            public void mo1990(String str, String str2, int i, ConnectionStatus connectionStatus, Intent intent) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Crypt.a(Crypt.xrc("\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196;Jb;OcmH1gMbiNejMeo\u001bfj\u001ck=K6iH3g\u001bgnJ0lOjnJ3k\u001cb:\u001beg\u001d4iM0jLk:\u001d6kO6o")));
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    if (connectionStatus != null) {
                        obtain.writeInt(1);
                        obtain.writeInt(connectionStatus.ordinal());
                    } else {
                        obtain.writeInt(0);
                    }
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f4812.transact(2, obtain, null, 1)) {
                        int i2 = AbstractBinderC0729.f4811;
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0729() {
            attachInterface(this, Crypt.a(Crypt.xrc("\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196;Jb;OcmH1gMbiNejMeo\u001bfj\u001ck=K6iH3g\u001bgnJ0lOjnJ3k\u001cb:\u001beg\u001d4iM0jLk:\u001d6kO6o")));
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public static InterfaceC0728 m1991(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(Crypt.a(Crypt.xrc("\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196;Jb;OcmH1gMbiNejMeo\u001bfj\u001ck=K6iH3g\u001bgnJ0lOjnJ3k\u001cb:\u001beg\u001d4iM0jLk:\u001d6kO6o")));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0728)) ? new C0730(iBinder) : (InterfaceC0728) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String a = Crypt.a(Crypt.xrc("\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196;Jb;OcmH1gMbiNejMeo\u001bfj\u001ck=K6iH3g\u001bgnJ0lOjnJ3k\u001cb:\u001beg\u001d4iM0jLk:\u001d6kO6o"));
            if (i == 1) {
                parcel.enforceInterface(a);
                C0753.m2041(parcel.readInt() != 0 ? LogItem.CREATOR.createFromParcel(parcel) : null, false);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(a);
                C0753.m2048(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0 ? ConnectionStatus.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(a);
                C0753.m2050(parcel.readLong(), parcel.readLong());
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface(a);
                C0753.m2044(parcel.readString());
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(a);
            return true;
        }
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    void mo1987(String str);

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    void mo1988(long j, long j2);

    /* renamed from: でどあくず, reason: contains not printable characters */
    void mo1989(LogItem logItem);

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    void mo1990(String str, String str2, int i, ConnectionStatus connectionStatus, Intent intent);
}
