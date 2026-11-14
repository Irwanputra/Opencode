package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class H1357765634984004052 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ L2733745526099941872 b;

    public /* synthetic */ H1357765634984004052(L2733745526099941872 l2733745526099941872, byte b) {
        this.a = b;
        this.b = l2733745526099941872;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        L2733745526099941872 l2733745526099941872 = this.b;
        switch (b) {
            case 0:
                C10288805116980491173 c10288805116980491173 = l2733745526099941872.c;
                C13297862214201274442 c13297862214201274442 = (C13297862214201274442) obj;
                int i = c13297862214201274442.a;
                Long lB = l2733745526099941872.b();
                if (lB != null) {
                    G12426915514109744413 g12426915514109744413F = c10288805116980491173.f(c10288805116980491173.f(lB.longValue()).e);
                    if (l2733745526099941872.a.c(g12426915514109744413F.a)) {
                        l2733745526099941872.e.setValue(g12426915514109744413F);
                    }
                }
                l2733745526099941872.g.setValue(c13297862214201274442);
                break;
            case 1:
                Long l = (Long) obj;
                V697849047308847220 v697849047308847220 = l2733745526099941872.f;
                if (l == null) {
                    v697849047308847220.setValue(null);
                } else {
                    L15314296645528043221 l15314296645528043221B = l2733745526099941872.c.b(l.longValue());
                    v697849047308847220.setValue(l2733745526099941872.a.c(l15314296645528043221B.a) ? l15314296645528043221B : null);
                }
                break;
            default:
                G12426915514109744413 g12426915514109744413F2 = l2733745526099941872.c.f(((Long) obj).longValue());
                if (l2733745526099941872.a.c(g12426915514109744413F2.a)) {
                    l2733745526099941872.e.setValue(g12426915514109744413F2);
                }
                break;
        }
        return o9245300239821758723;
    }
}
