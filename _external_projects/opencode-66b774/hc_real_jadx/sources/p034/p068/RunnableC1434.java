package p034.p068;

import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.おぐぴう〸ず.てぜきぽく, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1434 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ MediaBrowserServiceCompat.InterfaceC0180 f6707;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ String f6708;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ MediaBrowserServiceCompat.C0191 f6709;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ ResultReceiver f6710;

    public RunnableC1434(MediaBrowserServiceCompat.C0191 c0191, MediaBrowserServiceCompat.InterfaceC0180 interfaceC0180, String str, ResultReceiver resultReceiver) {
        this.f6709 = c0191;
        this.f6707 = interfaceC0180;
        this.f6708 = str;
        this.f6710 = resultReceiver;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (MediaBrowserServiceCompat.this.f1294.get(((MediaBrowserServiceCompat.C0192) this.f6707).m588()) == null) {
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        String str = this.f6708;
        C1433 c1433 = new C1433(mediaBrowserServiceCompat, str, this.f6710);
        mediaBrowserServiceCompat.m572(c1433);
        if (!c1433.m577()) {
            throw new IllegalStateException(C2098.m4205("onLoadItem must call detach() or sendResult() before returning for id=", str));
        }
    }
}
