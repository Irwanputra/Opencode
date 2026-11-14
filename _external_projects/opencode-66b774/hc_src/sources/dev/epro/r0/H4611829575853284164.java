package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public class H4611829575853284164 extends N18027129999013161219 implements T1167221497807669151, D11026297070180776487, S8977162183056139880 {
    public final byte g;

    /* JADX WARN: Multi-variable type inference failed */
    public H4611829575853284164(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.g = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [dev.epro.r0.D11026297070180776487] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof H4611829575853284164) {
            H4611829575853284164 h4611829575853284164 = (H4611829575853284164) obj;
            return this.d.equals(h4611829575853284164.d) && this.e.equals(h4611829575853284164.e) && S10823041268949770285.t(this.b, h4611829575853284164.b) && d().equals(h4611829575853284164.d());
        }
        if (!(obj instanceof H4611829575853284164)) {
            return false;
        }
        ?? r0 = this.a;
        if (r0 == 0) {
            b();
            this.a = this;
        } else {
            this = r0;
        }
        return obj.equals(this);
    }

    @Override // dev.epro.r0.T1167221497807669151
    public final int getArity() {
        return this.g;
    }

    public final int hashCode() {
        d();
        return this.e.hashCode() + E12098517352909843120.h(d().hashCode() * 31, 31, this.d);
    }

    public final String toString() {
        D11026297070180776487 d11026297070180776487 = this.a;
        if (d11026297070180776487 == null) {
            b();
            this.a = this;
            d11026297070180776487 = this;
        }
        if (d11026297070180776487 != this) {
            return d11026297070180776487.toString();
        }
        String str = this.d;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : G6547577305291411977.s("function ", str, " (Kotlin reflection is not available)");
    }

    public H4611829575853284164(int i, Class cls, String str, String str2, int i2) {
        this(i, Q5110743215583504520.a, cls, str, str2, i2);
    }
}
