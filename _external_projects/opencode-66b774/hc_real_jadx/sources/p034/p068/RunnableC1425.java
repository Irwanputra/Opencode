package p034.p068;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.おぐぴう〸ず.ぇぬぎばつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1425 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ MediaBrowserServiceCompat.InterfaceC0180 f6691;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ String f6692;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ ResultReceiver f6693;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final /* synthetic */ MediaBrowserServiceCompat.C0191 f6694;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ Bundle f6695;

    public RunnableC1425(MediaBrowserServiceCompat.C0191 c0191, MediaBrowserServiceCompat.InterfaceC0180 interfaceC0180, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f6694 = c0191;
        this.f6691 = interfaceC0180;
        this.f6692 = str;
        this.f6695 = bundle;
        this.f6693 = resultReceiver;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (MediaBrowserServiceCompat.this.f1294.get(((MediaBrowserServiceCompat.C0192) this.f6691).m588()) == null) {
            StringBuilder m4207 = C2098.m4207("sendCustomAction for callback that isn't registered action=");
            m4207.append(this.f6692);
            m4207.append(", extras=");
            m4207.append(this.f6695);
            m4207.toString();
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        String str = this.f6692;
        Bundle bundle = this.f6695;
        C1423 c1423 = new C1423(mediaBrowserServiceCompat, str, this.f6693);
        mediaBrowserServiceCompat.m571(c1423);
        if (c1423.m577()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }
}
