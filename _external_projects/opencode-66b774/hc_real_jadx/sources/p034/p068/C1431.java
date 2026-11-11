package p034.p068;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.service.media.MediaBrowserService;

/* renamed from: づざかべべ.おぐぴう〸ず.ざっざへづ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1431 extends C1432 {
    public C1431(Context context, InterfaceC1435 interfaceC1435) {
        super(context, interfaceC1435);
    }

    @Override // android.service.media.MediaBrowserService
    public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
        ((InterfaceC1435) this.f6705).mo585(str, new C1438<>(result));
    }
}
