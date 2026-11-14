package dev.epro.r0;

import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class F6872943321507891134 {
    public static final X354568553596380848 a = new X354568553596380848(new H475444086652660118((byte) 1), (byte) 1);
    public static final G15535714851655169452 b = new G15535714851655169452((byte) 2);

    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (android.text.TextUtils.isEmpty(r5) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        if (r5 != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(dev.epro.r0.Y8564331055586212282 r12, android.content.Context r13, boolean r14, java.lang.CharSequence r15, dev.epro.r0.F12478849263529740365 r16, dev.epro.r0.S16869475527240117894 r17, dev.epro.r0.F4096073349764486348 r18) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 < r5) goto Lcd
            if (r15 == 0) goto Lcd
            if (r0 == 0) goto Lcd
            if (r1 == 0) goto Lcd
            boolean r4 = r1 instanceof dev.epro.r0.K1755082528704418605
            if (r4 != 0) goto L18
            goto Lcd
        L18:
            dev.epro.r0.K1755082528704418605 r1 = (dev.epro.r0.K1755082528704418605) r1
            long r4 = r0.a
            java.lang.Object r6 = r1.h
            dev.epro.r0.H15186625828076266306 r7 = r1.e
            boolean r8 = r7.g()
            r9 = 0
            if (r8 != 0) goto L28
            goto L48
        L28:
            dev.epro.r0.V697849047308847220 r1 = r1.g
            java.lang.Object r1 = r1.getValue()
            dev.epro.r0.D6481647950163785171 r1 = (dev.epro.r0.D6481647950163785171) r1
            if (r1 == 0) goto L43
            long r10 = r1.b
            boolean r4 = dev.epro.r0.F12478849263529740365.c(r4, r10)
            if (r4 == 0) goto L43
            java.lang.CharSequence r4 = r1.a
            boolean r4 = dev.epro.r0.S10823041268949770285.t(r15, r4)
            if (r4 == 0) goto L43
            goto L44
        L43:
            r1 = r9
        L44:
            r7.b(r9)
            r9 = r1
        L48:
            if (r9 != 0) goto L4f
            r2.invoke(r12)
            goto Lc3
        L4f:
            java.util.ArrayList r1 = r9.d
            android.view.textclassifier.TextClassification r4 = r9.c
            java.util.List r5 = dev.epro.r0.U14881866531452519068.k(r4)
            boolean r5 = r5.isEmpty()
            r7 = 0
            if (r5 != 0) goto L6f
            java.lang.Object r5 = r1.get(r7)
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            dev.epro.r0.L1522958525456855662 r8 = new dev.epro.r0.L1522958525456855662
            r8.<init>(r6, r4, r7, r5)
            dev.epro.r0.U9803441765912152712 r5 = r12.a
            r5.a(r8)
            goto L9a
        L6f:
            android.graphics.drawable.Drawable r5 = dev.epro.r0.T15589241373902147015.d(r4)
            if (r5 != 0) goto L7f
            java.lang.CharSequence r5 = dev.epro.r0.M13159286552657112763.f(r4)
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L9a
        L7f:
            android.content.Intent r5 = dev.epro.r0.T15589241373902147015.c(r4)
            if (r5 != 0) goto L8b
            android.view.View$OnClickListener r5 = dev.epro.r0.T15589241373902147015.f(r4)
            if (r5 == 0) goto L9a
        L8b:
            android.graphics.drawable.Drawable r5 = dev.epro.r0.T15589241373902147015.d(r4)
            dev.epro.r0.L1522958525456855662 r8 = new dev.epro.r0.L1522958525456855662
            r9 = -1
            r8.<init>(r6, r4, r9, r5)
            dev.epro.r0.U9803441765912152712 r5 = r12.a
            r5.a(r8)
        L9a:
            r2.invoke(r12)
            java.util.List r2 = dev.epro.r0.U14881866531452519068.k(r4)
            int r5 = r2.size()
        La5:
            if (r7 >= r5) goto Lc3
            java.lang.Object r8 = r2.get(r7)
            dev.epro.r0.T15589241373902147015.v(r8)
            if (r7 <= 0) goto Lc0
            java.lang.Object r8 = r1.get(r7)
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            dev.epro.r0.L1522958525456855662 r9 = new dev.epro.r0.L1522958525456855662
            r9.<init>(r6, r4, r7, r8)
            dev.epro.r0.U9803441765912152712 r8 = r12.a
            r8.a(r9)
        Lc0:
            int r7 = r7 + 1
            goto La5
        Lc3:
            long r4 = r0.a
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            dev.epro.r0.U16229988784104357932.t(r0, r1, r2, r3, r4)
            return
        Lcd:
            r2.invoke(r12)
            if (r15 == 0) goto Ldd
            if (r0 == 0) goto Ldd
            long r4 = r0.a
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            dev.epro.r0.U16229988784104357932.t(r0, r1, r2, r3, r4)
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.F6872943321507891134.a(dev.epro.r0.Y8564331055586212282, android.content.Context, boolean, java.lang.CharSequence, dev.epro.r0.F12478849263529740365, dev.epro.r0.S16869475527240117894, dev.epro.r0.F4096073349764486348):void");
    }

    public static final S16869475527240117894 b(L14432282451889478852 l14432282451889478852, A5535629440393075509 a5535629440393075509, M3727281027331139839 m3727281027331139839, int i) {
        m3727281027331139839.a0(430530635);
        if (Build.VERSION.SDK_INT < 28) {
            m3727281027331139839.q(false);
            return null;
        }
        Context context = (Context) m3727281027331139839.j(T15795698139970521497.b);
        G8001132634698687269 g8001132634698687269 = (G8001132634698687269) m3727281027331139839.j(a);
        boolean f = ((((i & 112) ^ 48) > 32 && m3727281027331139839.f(a5535629440393075509)) || (i & 48) == 32) | m3727281027331139839.f(g8001132634698687269) | m3727281027331139839.f(context);
        Object M = m3727281027331139839.M();
        if (f || M == O9023047933786425027.a) {
            b.getClass();
            M = new K1755082528704418605(g8001132634698687269, context, l14432282451889478852, a5535629440393075509);
            m3727281027331139839.k0(M);
        }
        S16869475527240117894 s16869475527240117894 = (S16869475527240117894) M;
        m3727281027331139839.q(false);
        return s16869475527240117894;
    }
}
