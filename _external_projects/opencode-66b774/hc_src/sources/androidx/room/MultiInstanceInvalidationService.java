package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import dev.epro.r0.B3714102630340914807;
import dev.epro.r0.Y2182179812378499171;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final Y2182179812378499171 c = new Y2182179812378499171(this);
    public final B3714102630340914807 d = new B3714102630340914807(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.d;
    }
}
