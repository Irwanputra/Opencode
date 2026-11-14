package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H7321006148350780707 implements L12639328004344855510 {
    public final /* synthetic */ long a;
    public final /* synthetic */ S16571168858015125610 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ T15443218846549482730 d;

    public H7321006148350780707(long j, S16571168858015125610 s16571168858015125610, float f, T15443218846549482730 t15443218846549482730) {
        this.a = j;
        this.b = s16571168858015125610;
        this.c = f;
        this.d = t15443218846549482730;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj;
        int intValue = ((Number) obj2).intValue();
        if (m3727281027331139839.R(intValue & 1, (intValue & 3) != 2)) {
            D1286559660607336098.l(this.a, this.b, S10823041268949770285.T(-1767363041, new G8533636551453522475(this.c, this.d), m3727281027331139839), m3727281027331139839, 384);
        } else {
            m3727281027331139839.U();
        }
        return O9245300239821758723.a;
    }
}
