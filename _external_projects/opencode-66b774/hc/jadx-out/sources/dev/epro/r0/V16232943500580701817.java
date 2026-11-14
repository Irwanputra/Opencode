package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V16232943500580701817 implements G4373553504164397325 {
    public final F4096073349764486348 a;
    public final U13365625007077799709 b = new U13365625007077799709(this);
    public final T17817572153526645469 c = new T17817572153526645469();
    public final V697849047308847220 d;
    public final V697849047308847220 e;
    public final V697849047308847220 f;

    public V16232943500580701817(F4096073349764486348 f4096073349764486348) {
        this.a = f4096073349764486348;
        Boolean bool = Boolean.FALSE;
        this.d = V4416135141588678913.t(bool);
        this.e = V4416135141588678913.t(bool);
        this.f = V4416135141588678913.t(bool);
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final boolean b() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final float d(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final Object e(D6414970586266598845 d6414970586266598845, L12639328004344855510 l12639328004344855510, K14749510448791472029 k14749510448791472029) {
        Object objB = O8620973563946607355.B(new C288342651169725874(this, d6414970586266598845, l12639328004344855510, null, (byte) 6), k14749510448791472029);
        return objB == Z3437138737604933638.a ? objB : O9245300239821758723.a;
    }
}
