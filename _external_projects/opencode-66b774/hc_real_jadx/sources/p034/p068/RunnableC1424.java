package p034.p068;

import android.os.Bundle;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.List;
import p034.p035.p042.C1052;
import p131.p155.p156.p157.C2098;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.おぐぴう〸ず.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1424 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ MediaBrowserServiceCompat.InterfaceC0180 f6686;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ String f6687;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f6688;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final /* synthetic */ MediaBrowserServiceCompat.C0191 f6689;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ IBinder f6690;

    public RunnableC1424(MediaBrowserServiceCompat.C0191 c0191, MediaBrowserServiceCompat.InterfaceC0180 interfaceC0180, String str, IBinder iBinder, Bundle bundle) {
        this.f6689 = c0191;
        this.f6686 = interfaceC0180;
        this.f6687 = str;
        this.f6690 = iBinder;
        this.f6688 = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        MediaBrowserServiceCompat.C0183 c0183 = MediaBrowserServiceCompat.this.f1294.get(((MediaBrowserServiceCompat.C0192) this.f6686).m588());
        if (c0183 == null) {
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        String str = this.f6687;
        IBinder iBinder = this.f6690;
        Bundle bundle = this.f6688;
        mediaBrowserServiceCompat.getClass();
        List<C1052<IBinder, Bundle>> list = c0183.f1308.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (C1052<IBinder, Bundle> c1052 : list) {
            if (iBinder == c1052.f5499 && C2786.m4792(bundle, c1052.f5498)) {
                return;
            }
        }
        list.add(new C1052<>(iBinder, bundle));
        c0183.f1308.put(str, list);
        C1439 c1439 = new C1439(mediaBrowserServiceCompat, str, c0183, str, bundle, null);
        if (bundle == null) {
            mediaBrowserServiceCompat.m570(str, c1439);
        } else {
            mediaBrowserServiceCompat.m574(str, c1439);
        }
        if (c1439.m577()) {
            mediaBrowserServiceCompat.m569();
            return;
        }
        StringBuilder m4207 = C2098.m4207("onLoadChildren must call detach() or sendResult() before returning for package=");
        m4207.append(c0183.f1309);
        m4207.append(" id=");
        m4207.append(str);
        throw new IllegalStateException(m4207.toString());
    }
}
