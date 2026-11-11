package p237.p238.p239.p241;

import android.media.browse.MediaBrowser;
import java.util.List;
import p237.p238.p239.p241.InterfaceC2796;

/* renamed from: びぐびあび.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2800<T extends InterfaceC2796> extends MediaBrowser.SubscriptionCallback {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final T f10462;

    public C2800(T t) {
        this.f10462 = t;
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
        this.f10462.mo20(str, list);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public void onError(String str) {
        this.f10462.mo21(str);
    }
}
