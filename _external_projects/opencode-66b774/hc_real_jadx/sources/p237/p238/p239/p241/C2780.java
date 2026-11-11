package p237.p238.p239.p241;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.session.MediaButtonReceiver;
import p034.p035.p041.C1049;
import p237.p238.p239.p241.InterfaceC2797;
import p237.p238.p239.p241.p242.InterfaceC2782;

/* renamed from: びぐびあび.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2780<T extends InterfaceC2797> extends MediaBrowser.ConnectionCallback {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final T f10427;

    public C2780(T t) {
        this.f10427 = t;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnected() {
        MediaBrowserCompat.C0002.C0003 c0003 = (MediaBrowserCompat.C0002.C0003) this.f10427;
        MediaBrowserCompat.C0002.InterfaceC0004 interfaceC0004 = MediaBrowserCompat.C0002.this.f4;
        if (interfaceC0004 != null) {
            MediaBrowserCompat.C0016 c0016 = (MediaBrowserCompat.C0016) interfaceC0004;
            Bundle extras = ((MediaBrowser) c0016.f32).getExtras();
            if (extras != null) {
                extras.getInt("extra_service_version", 0);
                IBinder m2384 = C1049.m2384(extras, "extra_messenger");
                if (m2384 != null) {
                    c0016.f37 = new MediaBrowserCompat.C0017(m2384, c0016.f34);
                    Messenger messenger = new Messenger(c0016.f38);
                    c0016.f33 = messenger;
                    c0016.f38.m16(messenger);
                    try {
                        MediaBrowserCompat.C0017 c0017 = c0016.f37;
                        Context context = c0016.f35;
                        Messenger messenger2 = c0016.f33;
                        c0017.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putString("data_package_name", context.getPackageName());
                        bundle.putBundle("data_root_hints", c0017.f39);
                        c0017.m17(6, bundle, messenger2);
                    } catch (RemoteException unused) {
                    }
                }
                InterfaceC2782 m4757 = InterfaceC2782.AbstractBinderC2783.m4757(C1049.m2384(extras, "extra_session_binder"));
                if (m4757 != null) {
                    c0016.f31 = MediaSessionCompat.Token.m32(((MediaBrowser) c0016.f32).getSessionToken(), m4757);
                }
            }
        }
        MediaBrowserCompat.C0002.this.mo5();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnectionFailed() {
        MediaBrowserCompat.C0002 c0002 = MediaBrowserCompat.C0002.this;
        MediaBrowserCompat.C0002.InterfaceC0004 interfaceC0004 = c0002.f4;
        if (interfaceC0004 != null) {
        }
        ((MediaButtonReceiver.C0193) c0002).m590();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnectionSuspended() {
        MediaBrowserCompat.C0002.C0003 c0003 = (MediaBrowserCompat.C0002.C0003) this.f10427;
        MediaBrowserCompat.C0002.InterfaceC0004 interfaceC0004 = MediaBrowserCompat.C0002.this.f4;
        if (interfaceC0004 != null) {
            MediaBrowserCompat.C0016 c0016 = (MediaBrowserCompat.C0016) interfaceC0004;
            c0016.f37 = null;
            c0016.f33 = null;
            c0016.f31 = null;
            c0016.f38.m16(null);
        }
        ((MediaButtonReceiver.C0193) MediaBrowserCompat.C0002.this).m590();
    }
}
