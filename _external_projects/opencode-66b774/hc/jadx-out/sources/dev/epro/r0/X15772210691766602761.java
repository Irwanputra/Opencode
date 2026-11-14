package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X15772210691766602761 implements A859764726080529380 {
    public final String a;
    public final H3913161109771689215 b;

    public X15772210691766602761(String str, H3913161109771689215 h3913161109771689215) {
        this.a = str;
        this.b = h3913161109771689215;
    }

    @Override // dev.epro.r0.A859764726080529380
    public final String a() {
        return this.a;
    }

    @Override // dev.epro.r0.A859764726080529380
    public final String b() {
        return null;
    }

    @Override // dev.epro.r0.A859764726080529380
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || X15772210691766602761.class != obj.getClass()) {
            return false;
        }
        X15772210691766602761 x15772210691766602761 = (X15772210691766602761) obj;
        return S10823041268949770285.t(this.a, x15772210691766602761.a) && this.b == x15772210691766602761.b;
    }

    @Override // dev.epro.r0.A859764726080529380
    public final H3913161109771689215 getDuration() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + G6547577305291411977.i(this.a.hashCode() * 961, 31, false);
    }
}
