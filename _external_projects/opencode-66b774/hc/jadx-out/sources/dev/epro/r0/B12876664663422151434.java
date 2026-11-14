package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B12876664663422151434 extends P17072065560811830427 {
    public final int c;
    public final String d;

    public B12876664663422151434(int i, String str, F16470721565862751885 f16470721565862751885, F16470721565862751885 f164707215658627518852) {
        super(f16470721565862751885, f164707215658627518852);
        if (i == 0) {
            Z3383101362411723454.k("Event Type must be provided.");
            throw null;
        }
        this.c = i;
        this.d = str;
    }

    @Override // dev.epro.r0.P17072065560811830427
    public final String a() {
        return "type=" + L11610354117192841236.B(this.c) + ", value=" + this.d;
    }
}
