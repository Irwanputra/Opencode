package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M7102034154292440921 implements A10693687560045094360 {
    public final float a;
    public final float b;
    public final Object c;

    public M7102034154292440921(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    @Override // dev.epro.r0.M15459437176959963354
    public final V9266657454036696449 a(R3937090736490516115 r3937090736490516115) {
        Object obj = this.c;
        return new M204440408817344908(this.a, this.b, obj == null ? null : (Z13251062865217617579) ((O3410298526443296213) r3937090736490516115).a.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof M7102034154292440921) {
            M7102034154292440921 m7102034154292440921 = (M7102034154292440921) obj;
            if (m7102034154292440921.a == this.a && m7102034154292440921.b == this.b && S10823041268949770285.t(m7102034154292440921.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + E12098517352909843120.e(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ M7102034154292440921(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
