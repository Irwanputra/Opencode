package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J16788881807453904096 extends W7378377772343420238 {
    public final String b;
    public final long c;
    public final T13344602445187831655 d;

    public J16788881807453904096(String str, long j, T13344602445187831655 t13344602445187831655) {
        this.b = str;
        this.c = j;
        this.d = t13344602445187831655;
    }

    @Override // dev.epro.r0.W7378377772343420238
    public final long c() {
        return this.c;
    }

    @Override // dev.epro.r0.W7378377772343420238
    public final A459791877761184370 d() {
        String str = this.b;
        if (str != null) {
            H5336160545165318150 h5336160545165318150 = A459791877761184370.e;
            try {
                return B5998207562248239613.q(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // dev.epro.r0.W7378377772343420238
    public final J6206369225411265287 e() {
        return this.d;
    }
}
