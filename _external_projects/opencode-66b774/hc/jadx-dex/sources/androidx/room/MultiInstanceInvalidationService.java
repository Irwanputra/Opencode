package androidx.room;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class MultiInstanceInvalidationService extends android.app.Service {
    public int a;
    public final java.util.LinkedHashMap b = new java.util.LinkedHashMap();
    public final dev.epro.r0.Y2182179812378499171 c = new dev.epro.r0.Y2182179812378499171(this);
    public final dev.epro.r0.B3714102630340914807 d = new dev.epro.r0.B3714102630340914807(this);

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        intent.getClass();
        return this.d;
    }
}
