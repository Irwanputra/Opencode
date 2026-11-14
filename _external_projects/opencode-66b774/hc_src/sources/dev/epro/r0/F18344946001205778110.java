package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final /* synthetic */ class F18344946001205778110 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Z17471428274427141949 c;
    public final /* synthetic */ int d;

    public /* synthetic */ F18344946001205778110(int i, Z17471428274427141949 z17471428274427141949, int i2) {
        this.a = (byte) 1;
        this.b = i;
        this.c = z17471428274427141949;
        this.d = i2;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        int i = this.d;
        int i2 = this.b;
        Z17471428274427141949 z17471428274427141949 = this.c;
        Y2066038017114788875 y2066038017114788875 = (Y2066038017114788875) obj;
        switch (b) {
            case 0:
                y2066038017114788875.g(z17471428274427141949, i2, i, 0.0f);
                break;
            case 1:
                y2066038017114788875.g(z17471428274427141949, T18016951143603335921.Z((i2 - z17471428274427141949.a) / 2.0f), T18016951143603335921.Z((i - z17471428274427141949.b) / 2.0f), 0.0f);
                break;
            default:
                y2066038017114788875.g(z17471428274427141949, i2, i, 0.0f);
                break;
        }
        return o9245300239821758723;
    }

    public /* synthetic */ F18344946001205778110(Z17471428274427141949 z17471428274427141949, int i, int i2, byte b) {
        this.a = b;
        this.c = z17471428274427141949;
        this.b = i;
        this.d = i2;
    }
}
