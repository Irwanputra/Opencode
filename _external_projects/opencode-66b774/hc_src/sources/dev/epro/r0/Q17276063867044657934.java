package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q17276063867044657934 implements L13148442655056575112 {
    public final R3937090736490516115 a;
    public final V697849047308847220 b;
    public Z13251062865217617579 c;
    public long d;
    public long e;
    public boolean f;

    public Q17276063867044657934(R3937090736490516115 r3937090736490516115, Object obj, Z13251062865217617579 z13251062865217617579, long j, long j2, boolean z) {
        Z13251062865217617579 z132510628652176175792;
        this.a = r3937090736490516115;
        this.b = V4416135141588678913.t(obj);
        if (z13251062865217617579 != null) {
            z132510628652176175792 = E3422549137300678133.N(z13251062865217617579);
        } else {
            z132510628652176175792 = (Z13251062865217617579) ((O3410298526443296213) r3937090736490516115).a.invoke(obj);
            z132510628652176175792.d();
        }
        this.c = z132510628652176175792;
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    public final Object a() {
        return ((O3410298526443296213) this.a).b.invoke(this.c);
    }

    @Override // dev.epro.r0.L13148442655056575112
    public final Object getValue() {
        return this.b.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.b.getValue() + ", velocity=" + a() + ", isRunning=" + this.f + ", lastFrameTimeNanos=" + this.d + ", finishedTimeNanos=" + this.e + ")";
    }

    public /* synthetic */ Q17276063867044657934(R3937090736490516115 r3937090736490516115, Object obj, Z13251062865217617579 z13251062865217617579, int i) {
        this(r3937090736490516115, obj, (i & 4) != 0 ? null : z13251062865217617579, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
