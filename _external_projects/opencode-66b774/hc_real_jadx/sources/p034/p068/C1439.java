package p034.p068;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import androidx.media.MediaBrowserServiceCompat;
import java.util.Collections;
import java.util.List;

/* renamed from: づざかべべ.おぐぴう〸ず.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1439 extends MediaBrowserServiceCompat.C0177<List<MediaBrowserCompat.MediaItem>> {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f6719;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f6720;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ MediaBrowserServiceCompat.C0183 f6721;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final /* synthetic */ String f6722;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final /* synthetic */ MediaBrowserServiceCompat f6723;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1439(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, MediaBrowserServiceCompat.C0183 c0183, String str, Bundle bundle, Bundle bundle2) {
        super(obj);
        this.f6723 = mediaBrowserServiceCompat;
        this.f6721 = c0183;
        this.f6722 = str;
        this.f6720 = bundle;
        this.f6719 = bundle2;
    }

    @Override // androidx.media.MediaBrowserServiceCompat.C0177
    /* renamed from: くし〴〺ぅ */
    public void mo576(List<MediaBrowserCompat.MediaItem> list) {
        List<MediaBrowserCompat.MediaItem> list2 = list;
        MediaBrowserServiceCompat.C0183 c0183 = this.f6723.f1294.get(((MediaBrowserServiceCompat.C0192) this.f6721.f1307).m588());
        MediaBrowserServiceCompat.C0183 c01832 = this.f6721;
        if (c0183 != c01832) {
            if (MediaBrowserServiceCompat.f1292) {
                String str = c01832.f1309;
                return;
            }
            return;
        }
        if ((this.f1299 & 1) != 0) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f6723;
            Bundle bundle = this.f6720;
            mediaBrowserServiceCompat.getClass();
            if (list2 == null) {
                list2 = null;
            } else {
                int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i != -1 || i2 != -1) {
                    int i3 = i2 * i;
                    int i4 = i3 + i2;
                    if (i < 0 || i2 < 1 || i3 >= list2.size()) {
                        list2 = Collections.emptyList();
                    } else {
                        if (i4 > list2.size()) {
                            i4 = list2.size();
                        }
                        list2 = list2.subList(i3, i4);
                    }
                }
            }
        }
        try {
            ((MediaBrowserServiceCompat.C0192) this.f6721.f1307).m586(this.f6722, list2, this.f6720, this.f6719);
        } catch (RemoteException unused) {
            String str2 = this.f6721.f1309;
        }
    }
}
