package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W8584012123181847202 {

    @O7462376509978667369("startMuted")
    public boolean a;

    @O7462376509978667369("clickToExpandRequested")
    public boolean b;

    @O7462376509978667369("customControlsRequested")
    public boolean c;

    public W8584012123181847202(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W8584012123181847202)) {
            return false;
        }
        W8584012123181847202 w8584012123181847202 = (W8584012123181847202) obj;
        return this.a == w8584012123181847202.a && this.b == w8584012123181847202.b && this.c == w8584012123181847202.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.b;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.c;
        return i2 + (z3 ? 1 : z3);
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        StringBuilder sb = new StringBuilder("VideoOptionsSignal(startMuted=");
        sb.append(z);
        sb.append(", clickToExpandRequested=");
        sb.append(z2);
        sb.append(", customControlsRequested=");
        return E12098517352909843120.o(sb, z3, ")");
    }

    public W8584012123181847202() {
        this(true, false, false);
    }
}
