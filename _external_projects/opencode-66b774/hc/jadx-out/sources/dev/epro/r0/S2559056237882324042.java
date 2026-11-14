package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S2559056237882324042 implements L12639328004344855510 {
    public final /* synthetic */ T15443218846549482730 a;
    public final /* synthetic */ S16571168858015125610 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ F3159055080084457269 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;
    public final /* synthetic */ T1241271073913685060 g;

    public S2559056237882324042(T15443218846549482730 t15443218846549482730, S16571168858015125610 s16571168858015125610, long j, F3159055080084457269 f3159055080084457269, boolean z, float f, T1241271073913685060 t1241271073913685060) {
        this.a = t15443218846549482730;
        this.b = s16571168858015125610;
        this.c = j;
        this.d = f3159055080084457269;
        this.e = z;
        this.f = f;
        this.g = t1241271073913685060;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (m3727281027331139839.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            F3159055080084457269 f3159055080084457269 = this.d;
            boolean z = this.e;
            T14543259587851008825.d(this.a, this.b, this.c, z ? f3159055080084457269.c : f3159055080084457269.g, z ? f3159055080084457269.d : f3159055080084457269.h, this.f, this.g, m3727281027331139839, 24576);
        } else {
            m3727281027331139839.U();
        }
        return O9245300239821758723.a;
    }
}
