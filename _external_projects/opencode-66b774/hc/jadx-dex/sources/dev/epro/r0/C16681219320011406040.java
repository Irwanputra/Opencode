package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class C16681219320011406040 implements dev.epro.r0.F4096073349764486348 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    public /* synthetic */ C16681219320011406040(dev.epro.r0.W17425295458373561372 w17425295458373561372, int i, dev.epro.r0.Z17471428274427141949 z17471428274427141949, int i2, dev.epro.r0.I5164649337253478959 i5164649337253478959) {
        this.d = w17425295458373561372;
        this.b = i;
        this.e = z17471428274427141949;
        this.c = i2;
        this.f = i5164649337253478959;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        byte b = this.a;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        java.lang.Object obj2 = this.f;
        java.lang.Object obj3 = this.e;
        java.lang.Object obj4 = this.d;
        switch (b) {
            case 0:
                dev.epro.r0.Z17471428274427141949[] z17471428274427141949Arr = (dev.epro.r0.Z17471428274427141949[]) obj4;
                dev.epro.r0.G8839996886126338788 g8839996886126338788 = (dev.epro.r0.G8839996886126338788) obj3;
                int[] iArr = (int[]) obj2;
                dev.epro.r0.Y2066038017114788875 y2066038017114788875 = (dev.epro.r0.Y2066038017114788875) obj;
                int length = z17471428274427141949Arr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    dev.epro.r0.Z17471428274427141949 z17471428274427141949 = z17471428274427141949Arr[i];
                    int i3 = i2 + 1;
                    z17471428274427141949.getClass();
                    java.lang.Object objK = z17471428274427141949.k();
                    dev.epro.r0.X1840570513157370182 x1840570513157370182 = objK instanceof dev.epro.r0.X1840570513157370182 ? (dev.epro.r0.X1840570513157370182) objK : null;
                    dev.epro.r0.B5998207562248239613 b5998207562248239613 = x1840570513157370182 != null ? x1840570513157370182.c : null;
                    int i4 = this.b;
                    dev.epro.r0.Y2066038017114788875.h(y2066038017114788875, z17471428274427141949, iArr[i2], b5998207562248239613 != null ? b5998207562248239613.h(i4, z17471428274427141949.b, dev.epro.r0.F10342546226345611902.a, z17471428274427141949, this.c) : g8839996886126338788.b.a(z17471428274427141949.b, i4));
                    i++;
                    i2 = i3;
                }
                break;
            default:
                dev.epro.r0.Z17471428274427141949 z174714282744271419492 = (dev.epro.r0.Z17471428274427141949) obj3;
                dev.epro.r0.Y2066038017114788875.i((dev.epro.r0.Y2066038017114788875) obj, z174714282744271419492, ((dev.epro.r0.Q2551293802323679034) ((dev.epro.r0.W17425295458373561372) obj4).p.invoke(new dev.epro.r0.Q13254524308163418711((((long) (this.b - z174714282744271419492.a)) << 32) | (((long) (this.c - z174714282744271419492.b)) & 4294967295L)), ((dev.epro.r0.I5164649337253478959) obj2).getLayoutDirection())).a);
                break;
        }
        return o9245300239821758723;
    }

    public /* synthetic */ C16681219320011406040(dev.epro.r0.Z17471428274427141949[] z17471428274427141949Arr, dev.epro.r0.G8839996886126338788 g8839996886126338788, int i, int i2, int[] iArr) {
        this.d = z17471428274427141949Arr;
        this.e = g8839996886126338788;
        this.b = i;
        this.c = i2;
        this.f = iArr;
    }
}
