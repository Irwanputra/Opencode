package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P4401478981656030991 implements R4833348786910499294, B10350247327218861320 {
    public final R4833348786910499294 a;
    public final G8001132634698687269 b;

    public P4401478981656030991(R4833348786910499294 r4833348786910499294, G8001132634698687269 g8001132634698687269) {
        this.a = r4833348786910499294;
        this.b = g8001132634698687269;
    }

    @Override // dev.epro.r0.B10350247327218861320
    public final B10350247327218861320 getCallerFrame() {
        R4833348786910499294 r4833348786910499294 = this.a;
        if (r4833348786910499294 instanceof B10350247327218861320) {
            return (B10350247327218861320) r4833348786910499294;
        }
        return null;
    }

    @Override // dev.epro.r0.R4833348786910499294
    public final G8001132634698687269 getContext() {
        return this.b;
    }

    @Override // dev.epro.r0.R4833348786910499294
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
