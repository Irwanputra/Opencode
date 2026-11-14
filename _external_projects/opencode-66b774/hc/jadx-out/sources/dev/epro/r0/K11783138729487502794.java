package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class K11783138729487502794 implements F4096073349764486348 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ I5164649337253478959 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ K11783138729487502794(Z17471428274427141949 z17471428274427141949, G17613326942144185441 g17613326942144185441, I5164649337253478959 i5164649337253478959, int i, int i2, O15974643038957598625 o15974643038957598625) {
        this.e = z17471428274427141949;
        this.f = g17613326942144185441;
        this.d = i5164649337253478959;
        this.b = i;
        this.c = i2;
        this.g = o15974643038957598625;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj2 = this.g;
        I5164649337253478959 i5164649337253478959 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                Z6714950837425363575.d((Y2066038017114788875) obj, (Z17471428274427141949) obj4, (G17613326942144185441) obj3, i5164649337253478959.getLayoutDirection(), this.b, this.c, ((O15974643038957598625) obj2).a);
                break;
            default:
                Z17471428274427141949[] z17471428274427141949Arr = (Z17471428274427141949[]) obj4;
                F15810660954791379866 f15810660954791379866 = (F15810660954791379866) obj3;
                int[] iArr = (int[]) obj2;
                Y2066038017114788875 y2066038017114788875 = (Y2066038017114788875) obj;
                int length = z17471428274427141949Arr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    Z17471428274427141949 z17471428274427141949 = z17471428274427141949Arr[i];
                    int i3 = i2 + 1;
                    z17471428274427141949.getClass();
                    Object objK = z17471428274427141949.k();
                    X1840570513157370182 x1840570513157370182 = objK instanceof X1840570513157370182 ? (X1840570513157370182) objK : null;
                    F10342546226345611902 layoutDirection = i5164649337253478959.getLayoutDirection();
                    B5998207562248239613 b5998207562248239613 = x1840570513157370182 != null ? x1840570513157370182.c : null;
                    int i4 = this.b;
                    y2066038017114788875.g(z17471428274427141949, b5998207562248239613 != null ? b5998207562248239613.h(i4, z17471428274427141949.a, layoutDirection, z17471428274427141949, this.c) : f15810660954791379866.b.a(z17471428274427141949.a, i4, layoutDirection), iArr[i2], 0.0f);
                    i++;
                    i2 = i3;
                }
                break;
        }
        return o9245300239821758723;
    }

    public /* synthetic */ K11783138729487502794(Z17471428274427141949[] z17471428274427141949Arr, F15810660954791379866 f15810660954791379866, int i, int i2, I5164649337253478959 i5164649337253478959, int[] iArr) {
        this.e = z17471428274427141949Arr;
        this.f = f15810660954791379866;
        this.b = i;
        this.c = i2;
        this.d = i5164649337253478959;
        this.g = iArr;
    }
}
