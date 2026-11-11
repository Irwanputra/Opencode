package p034.p068;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

/* renamed from: づざかべべ.おぐぴう〸ず.ざとぅぼこ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1432 extends MediaBrowserService {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final InterfaceC1430 f6705;

    public C1432(Context context, InterfaceC1430 interfaceC1430) {
        attachBaseContext(context);
        this.f6705 = interfaceC1430;
    }

    @Override // android.service.media.MediaBrowserService
    public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        MediaSessionCompat.m31(bundle);
        if (this.f6705.mo582(str, i, bundle == null ? null : new Bundle(bundle)) == null) {
            return null;
        }
        throw null;
    }

    @Override // android.service.media.MediaBrowserService
    public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
        this.f6705.mo581(str, new C1438<>(result));
    }
}
