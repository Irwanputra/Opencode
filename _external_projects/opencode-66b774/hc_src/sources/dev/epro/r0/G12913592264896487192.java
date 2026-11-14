package dev.epro.r0;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class G12913592264896487192 {
    public final Context a;
    public final String b;
    public final W8455343525638953052 c;
    public final Q7290242871485078968 d;
    public final H9807528374655572032 e;
    public final int f;
    public final T15504973625601650233 g;
    public final X12014589167171900524 h;

    public G12913592264896487192(Context context, W8455343525638953052 w8455343525638953052, Q7290242871485078968 q7290242871485078968, Q8222385749838460873 q8222385749838460873) {
        M18113111391818111737.w("Null context is not permitted.", context);
        M18113111391818111737.w("Api must not be null.", w8455343525638953052);
        M18113111391818111737.w("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.", q8222385749838460873);
        this.a = context.getApplicationContext();
        String str = null;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", null).invoke(context, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.b = str;
        this.c = w8455343525638953052;
        this.d = q7290242871485078968;
        this.e = new H9807528374655572032(w8455343525638953052, q7290242871485078968, str);
        X12014589167171900524 e = X12014589167171900524.e(this.a);
        this.h = e;
        this.f = e.h.getAndIncrement();
        this.g = q8222385749838460873.a;
        R502132765509599220 r502132765509599220 = e.m;
        r502132765509599220.sendMessage(r502132765509599220.obtainMessage(7, this));
    }

    public final Q7316561721656982910 b() {
        Q7316561721656982910 q7316561721656982910 = new Q7316561721656982910((byte) 13, false);
        Set set = Collections.EMPTY_SET;
        K4498948325030944807 k4498948325030944807 = (K4498948325030944807) q7316561721656982910.b;
        if (k4498948325030944807 == null) {
            k4498948325030944807 = new K4498948325030944807(0);
            q7316561721656982910.b = k4498948325030944807;
        }
        k4498948325030944807.addAll(set);
        Context context = this.a;
        q7316561721656982910.d = context.getClass().getName();
        q7316561721656982910.c = context.getPackageName();
        return q7316561721656982910;
    }

    public final S14461012662136963693 c(int i, V14477269137702253517 v14477269137702253517) {
        boolean z;
        M17133811648581684718 m17133811648581684718 = new M17133811648581684718();
        X12014589167171900524 x12014589167171900524 = this.h;
        R502132765509599220 r502132765509599220 = x12014589167171900524.m;
        short s = v14477269137702253517.c;
        S14461012662136963693 s14461012662136963693 = m17133811648581684718.a;
        if (s != 0) {
            J2847175858738564144 j2847175858738564144 = null;
            if (x12014589167171900524.a()) {
                F5577235160184315757 f5577235160184315757 = (F5577235160184315757) H12843822278061842084.C().b;
                H9807528374655572032 h9807528374655572032 = this.e;
                if (f5577235160184315757 != null) {
                    if (f5577235160184315757.e) {
                        z = f5577235160184315757.f;
                        Z102412548944701279 z102412548944701279 = (Z102412548944701279) x12014589167171900524.j.get(h9807528374655572032);
                        if (z102412548944701279 != null) {
                            Object obj = z102412548944701279.b;
                            if (obj instanceof E1636901823844057514) {
                                E1636901823844057514 e1636901823844057514 = (E1636901823844057514) obj;
                                if (e1636901823844057514.hasConnectionInfo() && !e1636901823844057514.isConnecting()) {
                                    M3288231786426044629 a = J2847175858738564144.a(z102412548944701279, e1636901823844057514, s);
                                    if (a != null) {
                                        z102412548944701279.l++;
                                        z = a.f;
                                    }
                                }
                            }
                        }
                    }
                    j2847175858738564144 = null;
                } else {
                    z = true;
                }
                j2847175858738564144 = new J2847175858738564144(x12014589167171900524, s, h9807528374655572032, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
            }
            if (j2847175858738564144 != null) {
                r502132765509599220.getClass();
                s14461012662136963693.b.b(new I6845661640435175914(new Q9579657892041446906(r502132765509599220, (byte) 1), j2847175858738564144));
                s14461012662136963693.i();
            }
        }
        r502132765509599220.sendMessage(r502132765509599220.obtainMessage(4, new B5749411157085511637(new U11157288742250959493(i, v14477269137702253517, m17133811648581684718, this.g), x12014589167171900524.i.get(), this)));
        return s14461012662136963693;
    }
}
