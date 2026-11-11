package p034.p068;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;

/* renamed from: づざかべべ.おぐぴう〸ず.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1433 extends MediaBrowserServiceCompat.C0177<MediaBrowserCompat.MediaItem> {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ ResultReceiver f6706;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1433(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.f6706 = resultReceiver;
    }

    @Override // androidx.media.MediaBrowserServiceCompat.C0177
    /* renamed from: くし〴〺ぅ */
    public void mo576(MediaBrowserCompat.MediaItem mediaItem) {
        MediaBrowserCompat.MediaItem mediaItem2 = mediaItem;
        if ((this.f1299 & 2) != 0) {
            this.f6706.m33(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_item", mediaItem2);
        this.f6706.m33(0, bundle);
    }
}
