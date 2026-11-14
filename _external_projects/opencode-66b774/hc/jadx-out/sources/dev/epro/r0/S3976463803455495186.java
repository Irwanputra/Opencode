package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S3976463803455495186 implements A7868207189447841291 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ S3976463803455495186(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // dev.epro.r0.A7868207189447841291
    public final float a(float f) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                L18111935460025096722 l18111935460025096722 = (L18111935460025096722) obj2;
                float fG = l18111935460025096722.J.g(f);
                float fG2 = fG - l18111935460025096722.J.f.g();
                ((F18142507606280211225) obj).a(fG, 0.0f);
                return fG2;
            default:
                V5142773592757085764 v5142773592757085764 = (V5142773592757085764) obj2;
                if (Math.abs(f) == 0.0f || ((Boolean) v5142773592757085764.h.invoke()).booleanValue()) {
                    return v5142773592757085764.e(v5142773592757085764.h(((G3869673327990687150) obj).a(2, v5142773592757085764.f(v5142773592757085764.i(f)))));
                }
                throw new M9997906910517833636("The fling animation was cancelled", (byte) 0);
        }
    }
}
