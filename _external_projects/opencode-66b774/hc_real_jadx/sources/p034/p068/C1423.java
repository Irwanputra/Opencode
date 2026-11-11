package p034.p068;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;

/* renamed from: づざかべべ.おぐぴう〸ず.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1423 extends MediaBrowserServiceCompat.C0177<Bundle> {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ ResultReceiver f6685;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1423(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.f6685 = resultReceiver;
    }

    @Override // androidx.media.MediaBrowserServiceCompat.C0177
    /* renamed from: 〺つふすそ */
    public void mo575(Bundle bundle) {
        this.f6685.m33(-1, bundle);
    }

    @Override // androidx.media.MediaBrowserServiceCompat.C0177
    /* renamed from: くし〴〺ぅ */
    public void mo576(Bundle bundle) {
        this.f6685.m33(0, bundle);
    }
}
