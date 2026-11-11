package p034.p068;

import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.media.MediaBrowserServiceCompat;
import java.util.HashMap;

/* renamed from: づざかべべ.おぐぴう〸ず.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1420 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ MediaBrowserServiceCompat.InterfaceC0180 f6676;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final /* synthetic */ MediaBrowserServiceCompat.C0191 f6677;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ String f6678;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ int f6679;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f6680;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ int f6681;

    public RunnableC1420(MediaBrowserServiceCompat.C0191 c0191, MediaBrowserServiceCompat.InterfaceC0180 interfaceC0180, String str, int i, int i2, Bundle bundle) {
        this.f6677 = c0191;
        this.f6676 = interfaceC0180;
        this.f6678 = str;
        this.f6681 = i;
        this.f6679 = i2;
        this.f6680 = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        MediaBrowserServiceCompat.this.f1294.remove(((MediaBrowserServiceCompat.C0192) this.f6676).m588());
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        String str = this.f6678;
        int i = this.f6681;
        int i2 = this.f6679;
        new HashMap();
        if (Build.VERSION.SDK_INT >= 28) {
            new C1422(str, i, i2);
        }
        MediaBrowserServiceCompat.this.getClass();
        MediaBrowserServiceCompat.this.m568(this.f6678, this.f6679, this.f6680);
        MediaBrowserServiceCompat.this.getClass();
        try {
            ((MediaBrowserServiceCompat.C0192) this.f6676).m587(2, null);
        } catch (RemoteException unused) {
        }
    }
}
