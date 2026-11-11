package p034.p068;

import androidx.media.MediaBrowserServiceCompat;

/* renamed from: づざかべべ.おぐぴう〸ず.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1445 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ MediaBrowserServiceCompat.InterfaceC0180 f6728;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ MediaBrowserServiceCompat.C0191 f6729;

    public RunnableC1445(MediaBrowserServiceCompat.C0191 c0191, MediaBrowserServiceCompat.InterfaceC0180 interfaceC0180) {
        this.f6729 = c0191;
        this.f6728 = interfaceC0180;
    }

    @Override // java.lang.Runnable
    public void run() {
        MediaBrowserServiceCompat.C0183 remove = MediaBrowserServiceCompat.this.f1294.remove(((MediaBrowserServiceCompat.C0192) this.f6728).m588());
        if (remove != null) {
            ((MediaBrowserServiceCompat.C0192) remove.f1307).m588().unlinkToDeath(remove, 0);
        }
    }
}
