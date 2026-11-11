package p237.p238.p239.p241.p242;

import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import p237.p238.p239.p241.p242.InterfaceC2782;

/* renamed from: びぐびあび.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2785 implements InterfaceC2794 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public InterfaceC2782 f10429;

    public C2785(MediaSessionCompat.Token token) {
        this.f10429 = InterfaceC2782.AbstractBinderC2783.m4757((IBinder) token.f67);
    }

    @Override // p237.p238.p239.p241.p242.InterfaceC2794
    /* renamed from: げつ〴ぬぐ */
    public boolean mo24(KeyEvent keyEvent) {
        try {
            this.f10429.mo4756(keyEvent);
            return false;
        } catch (RemoteException unused) {
            return false;
        }
    }
}
