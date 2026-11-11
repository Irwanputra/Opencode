package p034.p068;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.おぐぴう〸ず.おぐぴう〸ず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1427 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ MediaBrowserServiceCompat.InterfaceC0180 f6696;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ String f6697;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ ResultReceiver f6698;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final /* synthetic */ MediaBrowserServiceCompat.C0191 f6699;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ Bundle f6700;

    public RunnableC1427(MediaBrowserServiceCompat.C0191 c0191, MediaBrowserServiceCompat.InterfaceC0180 interfaceC0180, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f6699 = c0191;
        this.f6696 = interfaceC0180;
        this.f6697 = str;
        this.f6700 = bundle;
        this.f6698 = resultReceiver;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (MediaBrowserServiceCompat.this.f1294.get(((MediaBrowserServiceCompat.C0192) this.f6696).m588()) == null) {
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        String str = this.f6697;
        C1436 c1436 = new C1436(mediaBrowserServiceCompat, str, this.f6698);
        mediaBrowserServiceCompat.m573(c1436);
        if (!c1436.m577()) {
            throw new IllegalStateException(C2098.m4205("onSearch must call detach() or sendResult() before returning for query=", str));
        }
    }
}
