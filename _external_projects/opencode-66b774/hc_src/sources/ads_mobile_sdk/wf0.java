package ads_mobile_sdk;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.N4024785987441166868;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X7175349259954592591;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class wf0 {
    public final W5797197595347441198 a;
    public final rf0 b;
    public final jr0 c;
    public final String d;
    public final String e;
    public final I16631908410500040363 f;
    public final mi3 g;
    public PointF h = new PointF(-1.0f, -1.0f);
    public PointF i = new PointF(-1.0f, -1.0f);
    public int j = 4;
    public final int k;
    public X7175349259954592591 l;

    public wf0(Context context, W5797197595347441198 w5797197595347441198, rf0 rf0Var, jr0 jr0Var, String str, String str2, I16631908410500040363 i16631908410500040363, mi3 mi3Var) {
        this.a = w5797197595347441198;
        this.b = rf0Var;
        this.c = jr0Var;
        this.d = str;
        this.e = str2;
        this.f = i16631908410500040363;
        this.g = mi3Var;
        this.k = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        byte b = 1;
        if (actionMasked == 0) {
            this.j = 1;
            this.h = new PointF(motionEvent.getX(), motionEvent.getY());
            return;
        }
        int i = this.j;
        if (i == 4) {
            return;
        }
        R4833348786910499294 r4833348786910499294 = null;
        if (i == 1 && actionMasked == 5) {
            this.j = 2;
            this.i = new PointF(motionEvent.getX(1), motionEvent.getY(1));
            this.l = R7033599853981556291.E(this.a, I3826119971291161142.a, null, new P7598478828797568949(new N4024785987441166868(this, r4833348786910499294, (byte) 24), r4833348786910499294, b), 2);
            return;
        }
        if (i == 2) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= historySize) {
                        break;
                    }
                    if (!a(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2))) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                if (a(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            X7175349259954592591 x7175349259954592591 = this.l;
            if (x7175349259954592591 != null) {
                x7175349259954592591.c(null);
            }
            this.j = 4;
        }
    }

    public final boolean a(float f, float f2, float f3, float f4) {
        float abs = Math.abs(this.h.x - f);
        float f5 = this.k;
        return abs < f5 && Math.abs(this.h.y - f2) < f5 && Math.abs(this.i.x - f3) < f5 && Math.abs(this.i.y - f4) < f5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (ads_mobile_sdk.rf0.a(r1, r2, r3, r4, r5, r6) != r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (dev.epro.r0.J8045362843799184672.J(r4, r6) == r7) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.wf0 r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.vf0
            if (r0 == 0) goto L14
            r0 = r9
            ads_mobile_sdk.vf0 r0 = (ads_mobile_sdk.vf0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ads_mobile_sdk.vf0 r0 = new ads_mobile_sdk.vf0
            r0.<init>(r8, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.b
            int r0 = r6.d
            r1 = 0
            r2 = 1
            r3 = 2
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r0 == 0) goto L39
            if (r0 == r2) goto L33
            if (r0 != r3) goto L2d
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L7c
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r1
        L33:
            ads_mobile_sdk.wf0 r8 = r6.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L62
        L39:
            dev.epro.r0.E17665849472693074628.k(r9)
            ads_mobile_sdk.jr0 r9 = r8.c
            dev.epro.r0.E17149812035295265804 r0 = dev.epro.r0.E17093345031926825464.b
            dev.epro.r0.N13798149404328803870 r0 = dev.epro.r0.N13798149404328803870.SECONDS
            long r4 = dev.epro.r0.M9216324016624295870.Z(r3, r0)
            dev.epro.r0.E17093345031926825464 r0 = new dev.epro.r0.E17093345031926825464
            r0.<init>(r4)
            ads_mobile_sdk.ao r4 = ads_mobile_sdk.ao.a
            java.lang.String r5 = "gads:debug_hold_gesture:time_millis"
            java.lang.Object r9 = r9.a(r5, r0, r4)
            dev.epro.r0.E17093345031926825464 r9 = (dev.epro.r0.E17093345031926825464) r9
            long r4 = r9.a
            r6.a = r8
            r6.d = r2
            java.lang.Object r9 = dev.epro.r0.J8045362843799184672.J(r4, r6)
            if (r9 != r7) goto L62
            goto L7b
        L62:
            r9 = 3
            r8.j = r9
            r9 = r1
            ads_mobile_sdk.rf0 r1 = r8.b
            java.lang.String r2 = r8.d
            r0 = r3
            java.lang.String r3 = r8.e
            dev.epro.r0.I16631908410500040363 r4 = r8.f
            ads_mobile_sdk.mi3 r5 = r8.g
            r6.a = r9
            r6.d = r0
            java.lang.Object r8 = ads_mobile_sdk.rf0.a(r1, r2, r3, r4, r5, r6)
            if (r8 != r7) goto L7c
        L7b:
            return r7
        L7c:
            dev.epro.r0.O9245300239821758723 r8 = dev.epro.r0.O9245300239821758723.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.wf0.a(ads_mobile_sdk.wf0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
