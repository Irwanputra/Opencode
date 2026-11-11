package p034.p068;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media.MediaBrowserServiceCompat.C0183;

/* renamed from: づざかべべ.おぐぴう〸ず.のぷのちつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1437 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ MediaBrowserServiceCompat.InterfaceC0180 f6712;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final /* synthetic */ MediaBrowserServiceCompat.C0191 f6713;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ String f6714;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ int f6715;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f6716;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ int f6717;

    public RunnableC1437(MediaBrowserServiceCompat.C0191 c0191, MediaBrowserServiceCompat.InterfaceC0180 interfaceC0180, String str, int i, int i2, Bundle bundle) {
        this.f6713 = c0191;
        this.f6712 = interfaceC0180;
        this.f6714 = str;
        this.f6717 = i;
        this.f6715 = i2;
        this.f6716 = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        IBinder m588 = ((MediaBrowserServiceCompat.C0192) this.f6712).m588();
        MediaBrowserServiceCompat.this.f1294.remove(m588);
        MediaBrowserServiceCompat.C0183 c0183 = MediaBrowserServiceCompat.this.new C0183(this.f6714, this.f6717, this.f6715, this.f6716, this.f6712);
        MediaBrowserServiceCompat.this.f1294.put(m588, c0183);
        try {
            m588.linkToDeath(c0183, 0);
        } catch (RemoteException unused) {
        }
    }
}
