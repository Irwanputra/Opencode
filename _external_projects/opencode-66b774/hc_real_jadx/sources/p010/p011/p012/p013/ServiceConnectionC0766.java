package p010.p011.p012.p013;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.BlockingQueue;
import p010.p011.p012.p014.InterfaceC0778;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class ServiceConnectionC0766 implements ServiceConnection {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ BlockingQueue f4912;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public volatile boolean f4913 = false;

    public ServiceConnectionC0766(BlockingQueue blockingQueue) {
        this.f4912 = blockingQueue;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0778 c0780;
        if (this.f4913) {
            return;
        }
        this.f4913 = true;
        try {
            BlockingQueue blockingQueue = this.f4912;
            int i = InterfaceC0778.AbstractBinderC0779.f5007;
            if (iBinder == null) {
                c0780 = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface(Crypt.a(Crypt.xrc("\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196<H1kL3=J0iOeiIboK`jAf:\u001eeoNaj\u001acg\u001b4mMdlI`hJ`g\u001eggI0:H7j\u0019d>IfgHjlMdgOjg\u001e7;Mkh\u001akkM6=H6>IgjOfk\u001bkh@3<Ie")));
                c0780 = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0778)) ? new InterfaceC0778.AbstractBinderC0779.C0780(iBinder) : (InterfaceC0778) queryLocalInterface;
            }
            blockingQueue.put(c0780);
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
