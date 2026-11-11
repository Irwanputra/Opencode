package p237.p238.p239.p241.p242;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.KeyEvent;
import p237.p238.p239.p241.p242.InterfaceC2790;

/* renamed from: びぐびあび.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public interface InterfaceC2782 extends IInterface {

    /* renamed from: びぐびあび.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public static abstract class AbstractBinderC2783 extends Binder implements InterfaceC2782 {

        /* renamed from: びぐびあび.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.〺つふすそ$げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C2784 implements InterfaceC2782 {

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public IBinder f10428;

            public C2784(IBinder iBinder) {
                this.f10428 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10428;
            }

            @Override // p237.p238.p239.p241.p242.InterfaceC2782
            /* renamed from: づざかべべ */
            public void mo4755(InterfaceC2790 interfaceC2790) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder((InterfaceC2790.AbstractBinderC2791) interfaceC2790);
                    this.f10428.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p237.p238.p239.p241.p242.InterfaceC2782
            /* renamed from: どぇぞほだ */
            public boolean mo4756(KeyEvent keyEvent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(1);
                    keyEvent.writeToParcel(obtain, 0);
                    this.f10428.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public static InterfaceC2782 m4757(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC2782)) ? new C2784(iBinder) : (InterfaceC2782) queryLocalInterface;
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    void mo4755(InterfaceC2790 interfaceC2790);

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    boolean mo4756(KeyEvent keyEvent);
}
