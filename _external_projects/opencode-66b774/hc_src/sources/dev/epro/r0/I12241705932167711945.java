package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I12241705932167711945 extends F15209282533750470613 {
    public final Throwable a;

    public I12241705932167711945(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof I12241705932167711945) {
            return S10823041268949770285.t(this.a, ((I12241705932167711945) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // dev.epro.r0.F15209282533750470613
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
