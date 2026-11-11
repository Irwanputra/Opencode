package p010.p011.p012.p014;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.なぎぱいぢぎ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public interface InterfaceC0778 extends IInterface {

    /* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.なぎぱいぢぎ.くし〴〺ぅ$げつ〴ぬぐ, reason: contains not printable characters */
    public static abstract class AbstractBinderC0779 extends Binder implements InterfaceC0778 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public static final /* synthetic */ int f5007 = 0;

        /* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.なぎぱいぢぎ.くし〴〺ぅ$げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0780 implements InterfaceC0778 {

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public IBinder f5008;

            public C0780(IBinder iBinder) {
                this.f5008 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5008;
            }

            @Override // p010.p011.p012.p014.InterfaceC0778
            /* renamed from: ぉ〲なぱぽた */
            public byte[] mo2106(String str, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Crypt.a(Crypt.xrc("\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196<H1kL3=J0iOeiIboK`jAf:\u001eeoNaj\u001acg\u001b4mMdlI`hJ`g\u001eggI0:H7j\u0019d>IfgHjlMdgOjg\u001e7;Mkh\u001akkM6=H6>IgjOfk\u001bkh@3<Ie")));
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    if (!this.f5008.transact(1, obtain, obtain2, 0)) {
                        int i = AbstractBinderC0779.f5007;
                    }
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    byte[] mo2106(String str, byte[] bArr);
}
