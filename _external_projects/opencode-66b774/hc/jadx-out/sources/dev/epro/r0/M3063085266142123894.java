package dev.epro.r0;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M3063085266142123894 {
    public final Q3622318280241842965 a;
    public final Pattern b;
    public final short c;

    /* JADX WARN: Multi-variable type inference failed */
    public M3063085266142123894(Q3622318280241842965 q3622318280241842965, Pattern pattern, int i) {
        this.a = q3622318280241842965;
        this.b = pattern;
        this.c = i;
    }

    public final String toString() {
        return "Tuple tag=" + this.a + " regexp=" + this.b + " limit=" + ((int) this.c);
    }
}
