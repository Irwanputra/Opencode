package p034.p068;

import android.os.Bundle;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import java.util.Iterator;
import java.util.List;
import p034.p035.p042.C1052;

/* renamed from: づざかべべ.おぐぴう〸ず.ぺふねづ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1446 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ MediaBrowserServiceCompat.InterfaceC0180 f6730;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ String f6731;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ MediaBrowserServiceCompat.C0191 f6732;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ IBinder f6733;

    public RunnableC1446(MediaBrowserServiceCompat.C0191 c0191, MediaBrowserServiceCompat.InterfaceC0180 interfaceC0180, String str, IBinder iBinder) {
        this.f6732 = c0191;
        this.f6730 = interfaceC0180;
        this.f6731 = str;
        this.f6733 = iBinder;
    }

    @Override // java.lang.Runnable
    public void run() {
        MediaBrowserServiceCompat.C0183 c0183 = MediaBrowserServiceCompat.this.f1294.get(((MediaBrowserServiceCompat.C0192) this.f6730).m588());
        if (c0183 == null) {
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        String str = this.f6731;
        IBinder iBinder = this.f6733;
        mediaBrowserServiceCompat.getClass();
        try {
            if (iBinder != null) {
                List<C1052<IBinder, Bundle>> list = c0183.f1308.get(str);
                if (list != null) {
                    Iterator<C1052<IBinder, Bundle>> it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == it.next().f5499) {
                            it.remove();
                        }
                    }
                    if (list.size() == 0) {
                        c0183.f1308.remove(str);
                    }
                }
            } else if (c0183.f1308.remove(str) != null) {
            }
        } finally {
            mediaBrowserServiceCompat.m567();
        }
    }
}
