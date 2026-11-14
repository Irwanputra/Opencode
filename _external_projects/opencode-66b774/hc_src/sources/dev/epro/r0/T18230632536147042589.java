package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T18230632536147042589 implements L12639328004344855510 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;

    public T18230632536147042589(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj;
        int intValue = ((Number) obj2).intValue();
        if (m3727281027331139839.R(intValue & 1, (intValue & 3) != 2)) {
            Z6714950837425363575.a(V16747615581620678882.l(V10993962107938880611.a, this.a, this.b), m3727281027331139839, 0);
        } else {
            m3727281027331139839.U();
        }
        return O9245300239821758723.a;
    }
}
