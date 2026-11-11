package p034.p068;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import java.util.List;

/* renamed from: づざかべべ.おぐぴう〸ず.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1436 extends MediaBrowserServiceCompat.C0177<List<MediaBrowserCompat.MediaItem>> {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ ResultReceiver f6711;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1436(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.f6711 = resultReceiver;
    }

    @Override // androidx.media.MediaBrowserServiceCompat.C0177
    /* renamed from: くし〴〺ぅ */
    public void mo576(List<MediaBrowserCompat.MediaItem> list) {
        List<MediaBrowserCompat.MediaItem> list2 = list;
        if ((this.f1299 & 4) != 0 || list2 == null) {
            this.f6711.m33(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("search_results", (Parcelable[]) list2.toArray(new MediaBrowserCompat.MediaItem[0]));
        this.f6711.m33(0, bundle);
    }
}
