package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L16987758992765039378 implements L13148442655056575112 {
    public final byte a;
    public final short b;
    public final V697849047308847220 c;
    public int d;

    /* JADX WARN: Multi-variable type inference failed */
    public L16987758992765039378(int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        int i4 = (i / i2) * i2;
        this.c = new V697849047308847220(W7808703833045379622.N(Math.max(i4 - i3, 0), i4 + i2 + i3), B14824868959299866349.s);
        this.d = i;
    }

    public final void a(int i) {
        if (i != this.d) {
            this.d = i;
            byte b = this.a;
            int i2 = (i / b) * b;
            short s = this.b;
            this.c.setValue(W7808703833045379622.N(Math.max(i2 - s, 0), i2 + b + s));
        }
    }

    @Override // dev.epro.r0.L13148442655056575112
    public final Object getValue() {
        return (P8646985343900033725) this.c.getValue();
    }
}
