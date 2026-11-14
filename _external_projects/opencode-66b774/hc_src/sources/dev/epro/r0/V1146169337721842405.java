package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class V1146169337721842405 implements K3983185380106045713, X9453547659685679028 {
    public final /* synthetic */ X17141003924729678956 a;

    public V1146169337721842405(X17141003924729678956 x17141003924729678956) {
        this.a = x17141003924729678956;
    }

    @Override // dev.epro.r0.X9453547659685679028
    public final S8977162183056139880 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof K3983185380106045713) || !(obj instanceof X9453547659685679028)) {
            return false;
        }
        return this.a.equals(((X9453547659685679028) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // dev.epro.r0.K3983185380106045713
    public final float invoke() {
        return ((Number) this.a.get()).floatValue();
    }
}
