package dev.epro.r0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final /* synthetic */ class N8996292563264153518 implements X9973786505953245660 {
    public final /* synthetic */ byte a;

    public /* synthetic */ N8996292563264153518(byte b) {
        this.a = b;
    }

    @Override // dev.epro.r0.X9973786505953245660
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                S9686291038205059113 s9686291038205059113 = (S9686291038205059113) obj;
                U6292466256832577288 u6292466256832577288 = (U6292466256832577288) obj2;
                B13729205492206812220 b13729205492206812220 = (B13729205492206812220) obj3;
                M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj4;
                int intValue = ((Integer) obj5).intValue();
                if ((intValue & 6) == 0) {
                    i = intValue | ((intValue & 8) == 0 ? m3727281027331139839.f(s9686291038205059113) : m3727281027331139839.h(s9686291038205059113) ? 4 : 2);
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= (intValue & 64) == 0 ? m3727281027331139839.f(u6292466256832577288) : m3727281027331139839.h(u6292466256832577288) ? 32 : 16;
                }
                if ((intValue & 384) == 0) {
                    i |= m3727281027331139839.h(b13729205492206812220) ? 256 : 128;
                }
                if (!m3727281027331139839.R(i & 1, (i & 1171) != 1170)) {
                    m3727281027331139839.U();
                    break;
                } else {
                    I828473291849542367.c(s9686291038205059113, u6292466256832577288, b13729205492206812220, m3727281027331139839, i & 1022);
                    break;
                }
            case 1:
                S9686291038205059113 s96862910382050591132 = (S9686291038205059113) obj;
                U6292466256832577288 u62924662568325772882 = (U6292466256832577288) obj2;
                B13729205492206812220 b137292054922068122202 = (B13729205492206812220) obj3;
                M3727281027331139839 m37272810273311398392 = (M3727281027331139839) obj4;
                int intValue2 = ((Integer) obj5).intValue();
                if ((intValue2 & 6) == 0) {
                    i2 = intValue2 | ((intValue2 & 8) == 0 ? m37272810273311398392.f(s96862910382050591132) : m37272810273311398392.h(s96862910382050591132) ? 4 : 2);
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= (intValue2 & 64) == 0 ? m37272810273311398392.f(u62924662568325772882) : m37272810273311398392.h(u62924662568325772882) ? 32 : 16;
                }
                if ((intValue2 & 384) == 0) {
                    i2 |= m37272810273311398392.h(b137292054922068122202) ? 256 : 128;
                }
                if (!m37272810273311398392.R(i2 & 1, (i2 & 1171) != 1170)) {
                    m37272810273311398392.U();
                    break;
                } else {
                    I828473291849542367.c(s96862910382050591132, u62924662568325772882, b137292054922068122202, m37272810273311398392, i2 & 1022);
                    break;
                }
            default:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                long j = ((F12478849263529740365) obj5).a;
                String obj6 = ((CharSequence) obj4).subSequence(F12478849263529740365.g(j), F12478849263529740365.f(j)).toString();
                Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", booleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = putExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", obj6);
                ((Context) obj).startActivity(className);
                break;
        }
        return o9245300239821758723;
    }
}
