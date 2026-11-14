package dev.epro.r0;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M12125336357807756834 implements J12078565427869724451 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Drawable b;

    public /* synthetic */ M12125336357807756834(Drawable drawable, byte b) {
        this.a = b;
        this.b = drawable;
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Drawable drawable = this.b;
        switch (b) {
            case 0:
                long j = ((U10174709222559481877) obj).a;
                M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (!m3727281027331139839.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    m3727281027331139839.U();
                } else {
                    P2382941533350862833.v.c(drawable, m3727281027331139839, 48);
                }
                break;
            default:
                long j2 = ((U10174709222559481877) obj).a;
                M3727281027331139839 m37272810273311398392 = (M3727281027331139839) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (!m37272810273311398392.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    m37272810273311398392.U();
                } else {
                    P2382941533350862833.v.c(drawable, m37272810273311398392, 48);
                }
                break;
        }
        return o9245300239821758723;
    }
}
