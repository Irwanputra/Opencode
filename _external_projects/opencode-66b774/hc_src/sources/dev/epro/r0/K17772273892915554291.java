package dev.epro.r0;

import java.util.Calendar;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public class K17772273892915554291 extends K10678596132709730734 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0041, code lost:
    
        if (r0.equals("month") == false) goto L11;
     */
    @Override // dev.epro.r0.K10678596132709730734
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(dev.epro.r0.D13396727227989475489 r12) {
        /*
            r11 = this;
            int r11 = r12.H()
            r0 = 9
            if (r11 != r0) goto Ld
            r12.D()
            r11 = 0
            return r11
        Ld:
            r12.c()
            r11 = 0
            r1 = r11
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
        L17:
            int r0 = r12.H()
            r7 = 4
            if (r0 == r7) goto L7f
            java.lang.String r0 = r12.B()
            int r8 = r12.z()
            int r9 = r0.hashCode()
            r10 = -1
            switch(r9) {
                case -1181204563: goto L65;
                case -1074026988: goto L5a;
                case -906279820: goto L4f;
                case 3704893: goto L44;
                case 104080000: goto L3b;
                case 985252545: goto L30;
                default: goto L2e;
            }
        L2e:
            r7 = r10
            goto L6f
        L30:
            java.lang.String r7 = "hourOfDay"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L39
            goto L2e
        L39:
            r7 = 5
            goto L6f
        L3b:
            java.lang.String r9 = "month"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L6f
            goto L2e
        L44:
            java.lang.String r7 = "year"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L4d
            goto L2e
        L4d:
            r7 = 3
            goto L6f
        L4f:
            java.lang.String r7 = "second"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L58
            goto L2e
        L58:
            r7 = 2
            goto L6f
        L5a:
            java.lang.String r7 = "minute"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L63
            goto L2e
        L63:
            r7 = 1
            goto L6f
        L65:
            java.lang.String r7 = "dayOfMonth"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L6e
            goto L2e
        L6e:
            r7 = r11
        L6f:
            switch(r7) {
                case 0: goto L7d;
                case 1: goto L7b;
                case 2: goto L79;
                case 3: goto L77;
                case 4: goto L75;
                case 5: goto L73;
                default: goto L72;
            }
        L72:
            goto L17
        L73:
            r4 = r8
            goto L17
        L75:
            r2 = r8
            goto L17
        L77:
            r1 = r8
            goto L17
        L79:
            r6 = r8
            goto L17
        L7b:
            r5 = r8
            goto L17
        L7d:
            r3 = r8
            goto L17
        L7f:
            r12.h()
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.K17772273892915554291.b(dev.epro.r0.D13396727227989475489):java.lang.Object");
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) {
        if (((Calendar) obj) == null) {
            y14132333989764804283.p();
            return;
        }
        y14132333989764804283.d();
        y14132333989764804283.j("year");
        y14132333989764804283.A(r4.get(1));
        y14132333989764804283.j("month");
        y14132333989764804283.A(r4.get(2));
        y14132333989764804283.j("dayOfMonth");
        y14132333989764804283.A(r4.get(5));
        y14132333989764804283.j("hourOfDay");
        y14132333989764804283.A(r4.get(11));
        y14132333989764804283.j("minute");
        y14132333989764804283.A(r4.get(12));
        y14132333989764804283.j("second");
        y14132333989764804283.A(r4.get(13));
        y14132333989764804283.h();
    }
}
