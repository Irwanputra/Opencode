package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U13365625007077799709 implements A7868207189447841291 {
    public final /* synthetic */ V16232943500580701817 a;

    public U13365625007077799709(V16232943500580701817 v16232943500580701817) {
        this.a = v16232943500580701817;
    }

    @Override // dev.epro.r0.A7868207189447841291
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        V16232943500580701817 v16232943500580701817 = this.a;
        float fFloatValue = ((Number) v16232943500580701817.a.invoke(Float.valueOf(f))).floatValue();
        v16232943500580701817.e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        v16232943500580701817.f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
