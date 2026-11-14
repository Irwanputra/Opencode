package dev.epro.r0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y2182179812378499171 extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public Y2182179812378499171(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ((L11636844115202314953) iInterface).getClass();
        obj.getClass();
        this.a.b.remove((Integer) obj);
    }
}
