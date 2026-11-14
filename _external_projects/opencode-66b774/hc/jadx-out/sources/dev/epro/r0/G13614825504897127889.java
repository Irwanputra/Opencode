package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G13614825504897127889 implements L13148442655056575112 {
    public Float a;
    public Float b;
    public final V697849047308847220 c;
    public W543543915243615877 d;
    public boolean e;
    public boolean f;
    public long g;
    public final /* synthetic */ Y5971758352763163472 h;

    public G13614825504897127889(Y5971758352763163472 y5971758352763163472, Float f, Float f2, S14520841167617591865 s14520841167617591865) {
        O3410298526443296213 o3410298526443296213 = D15913187640519482289.h;
        this.h = y5971758352763163472;
        this.a = f;
        this.b = f2;
        this.c = V4416135141588678913.t(f);
        this.d = new W543543915243615877(s14520841167617591865, o3410298526443296213, this.a, this.b, null);
    }

    @Override // dev.epro.r0.L13148442655056575112
    public final Object getValue() {
        return this.c.getValue();
    }
}
