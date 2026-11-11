package p034.p068;

import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;

/* renamed from: づざかべべ.おぐぴう〸ず.へぬ〴づぞ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1444 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ MediaBrowserServiceCompat.InterfaceC0180 f6726;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ MediaBrowserServiceCompat.C0191 f6727;

    public RunnableC1444(MediaBrowserServiceCompat.C0191 c0191, MediaBrowserServiceCompat.InterfaceC0180 interfaceC0180) {
        this.f6727 = c0191;
        this.f6726 = interfaceC0180;
    }

    @Override // java.lang.Runnable
    public void run() {
        IBinder m588 = ((MediaBrowserServiceCompat.C0192) this.f6726).m588();
        MediaBrowserServiceCompat.C0183 remove = MediaBrowserServiceCompat.this.f1294.remove(m588);
        if (remove != null) {
            m588.unlinkToDeath(remove, 0);
        }
    }
}
