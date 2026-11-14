package dev.epro.r0;

import net.zetetic.database.CursorWindow;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final /* synthetic */ class B15085781124798608112 implements D11437685219418266086 {
    @Override // dev.epro.r0.D11437685219418266086
    public final Object e(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, M3727281027331139839 m3727281027331139839, Integer num) {
        int i;
        String str = (String) obj;
        boolean booleanValue = bool.booleanValue();
        K7902078054435340508 k7902078054435340508 = (K7902078054435340508) obj2;
        J12078565427869724451 j12078565427869724451 = (J12078565427869724451) obj3;
        B13729205492206812220 b13729205492206812220 = (B13729205492206812220) obj4;
        int intValue = num.intValue();
        int i2 = intValue & 6;
        V10993962107938880611 v10993962107938880611 = V10993962107938880611.a;
        if (i2 == 0) {
            i = (m3727281027331139839.f(v10993962107938880611) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= m3727281027331139839.f(str) ? 32 : 16;
        }
        if ((intValue & 384) == 0) {
            i |= m3727281027331139839.g(booleanValue) ? 256 : 128;
        }
        if ((intValue & 3072) == 0) {
            i |= m3727281027331139839.f(k7902078054435340508) ? 2048 : 1024;
        }
        if ((intValue & 24576) == 0) {
            i |= m3727281027331139839.h(j12078565427869724451) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((intValue & 196608) == 0) {
            i |= m3727281027331139839.h(b13729205492206812220) ? 131072 : 65536;
        }
        if (m3727281027331139839.R(i & 1, (599187 & i) != 599186)) {
            G14491528922524918276.c(str, booleanValue, k7902078054435340508, v10993962107938880611, j12078565427869724451, b13729205492206812220, m3727281027331139839, (i & 458752) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            m3727281027331139839.U();
        }
        return O9245300239821758723.a;
    }
}
