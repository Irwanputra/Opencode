package p237.p238.p239.p241;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;
import p237.p238.p239.p241.InterfaceC2798;

/* renamed from: びぐびあび.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2799<T extends InterfaceC2798> extends C2800<T> {
    public C2799(T t) {
        super(t);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
        MediaSessionCompat.m31(bundle);
        ((InterfaceC2798) this.f10462).mo19(str, list, bundle);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public void onError(String str, Bundle bundle) {
        MediaSessionCompat.m31(bundle);
        ((InterfaceC2798) this.f10462).mo18(str, bundle);
    }
}
