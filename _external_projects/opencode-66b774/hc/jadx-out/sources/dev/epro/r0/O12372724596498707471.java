package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class O12372724596498707471 {
    public static final float a;

    static {
        D1286559660607336098.c(16.0f, 8.0f);
        a = 200.0f;
    }

    public static T5223795089867562870 a(int i, int i2, M3727281027331139839 m3727281027331139839) {
        D6962450040782876658 d6962450040782876658 = Z3703597371693563980.a;
        int iG0 = ((R8540738700654750557) m3727281027331139839.j(Y238707362170117896.h)).g0(4.0f);
        boolean zD = ((((i2 & 14) ^ 6) > 4 && m3727281027331139839.d(i)) || (i2 & 6) == 4) | m3727281027331139839.d(iG0);
        Object objM = m3727281027331139839.M();
        if (zD || objM == O9023047933786425027.a) {
            objM = new T5223795089867562870(i, iG0);
            m3727281027331139839.k0(objM);
        }
        return (T5223795089867562870) objM;
    }
}
