package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B12876664663422151434 extends dev.epro.r0.P17072065560811830427 {
    public final int c;
    public final java.lang.String d;

    public B12876664663422151434(int i, java.lang.String str, dev.epro.r0.F16470721565862751885 f16470721565862751885, dev.epro.r0.F16470721565862751885 f164707215658627518852) {
        super(f16470721565862751885, f164707215658627518852);
        if (i == 0) {
            dev.epro.r0.Z3383101362411723454.k("Event Type must be provided.");
            throw null;
        }
        this.c = i;
        this.d = str;
    }

    public final java.lang.String a() {
        return "type=" + dev.epro.r0.L11610354117192841236.B(this.c) + ", value=" + this.d;
    }
}
