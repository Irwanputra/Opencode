package dev.epro.r0;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G12738412843435213993 {
    public final F4096073349764486348 a;
    public Object b;
    public M8849337839148886240 c;
    public boolean j;
    public int k;
    public int d = -1;
    public final A4559761392562572984 e = E7125458317232359087.f();
    public final A4559761392562572984 f = new A4559761392562572984();
    public final E13273723708836014930 g = new E13273723708836014930();
    public final D389890677992184566 h = new D389890677992184566(0, new B4739506393801054036[16]);
    public final I16737082536984153748 i = new I16737082536984153748(this, (byte) 1);
    public final A4559761392562572984 l = E7125458317232359087.f();
    public final HashMap m = new HashMap();

    public G12738412843435213993(F4096073349764486348 f4096073349764486348) {
        this.a = f4096073349764486348;
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean a(java.util.Set r46) {
        /*
            Method dump skipped, instruction units count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G12738412843435213993.a(java.util.Set):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r21, int r22, java.lang.Object r23, dev.epro.r0.M8849337839148886240 r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            int r4 = r0.k
            if (r4 <= 0) goto Le
            goto La4
        Le:
            int r4 = r3.c(r1)
            if (r4 >= 0) goto L17
            int r4 = ~r4
            r6 = -1
            goto L1b
        L17:
            int[] r6 = r3.c
            r6 = r6[r4]
        L1b:
            java.lang.Object[] r7 = r3.b
            r7[r4] = r1
            int[] r3 = r3.c
            r3[r4] = r2
            boolean r3 = r1 instanceof dev.epro.r0.B4739506393801054036
            r4 = 2
            if (r3 == 0) goto L90
            if (r6 == r2) goto L90
            r2 = r1
            dev.epro.r0.B4739506393801054036 r2 = (dev.epro.r0.B4739506393801054036) r2
            dev.epro.r0.Y5595560268505326605 r2 = r2.h()
            java.util.HashMap r3 = r0.m
            java.lang.Object r7 = r2.f
            r3.put(r1, r7)
            dev.epro.r0.M8849337839148886240 r2 = r2.e
            dev.epro.r0.A4559761392562572984 r3 = r0.l
            dev.epro.r0.E7125458317232359087.p(r3, r1)
            java.lang.Object[] r7 = r2.b
            long[] r2 = r2.a
            int r8 = r2.length
            int r8 = r8 - r4
            if (r8 < 0) goto L90
            r10 = 0
        L48:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L8b
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L62:
            if (r15 >= r13) goto L89
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.32E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L85
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r7[r16]
            r9 = r16
            dev.epro.r0.O13595511762861117873 r9 = (dev.epro.r0.O13595511762861117873) r9
            boolean r5 = r9 instanceof dev.epro.r0.Y14161449526678499798
            if (r5 == 0) goto L82
            r5 = r9
            dev.epro.r0.Y14161449526678499798 r5 = (dev.epro.r0.Y14161449526678499798) r5
            r5.f(r4)
        L82:
            dev.epro.r0.E7125458317232359087.e(r3, r9, r1)
        L85:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L62
        L89:
            if (r13 != r14) goto L90
        L8b:
            if (r10 == r8) goto L90
            int r10 = r10 + 1
            goto L48
        L90:
            r2 = -1
            if (r6 != r2) goto La4
            boolean r2 = r1 instanceof dev.epro.r0.Y14161449526678499798
            if (r2 == 0) goto L9d
            r2 = r1
            dev.epro.r0.Y14161449526678499798 r2 = (dev.epro.r0.Y14161449526678499798) r2
            r2.f(r4)
        L9d:
            dev.epro.r0.A4559761392562572984 r0 = r0.e
            r2 = r23
            dev.epro.r0.E7125458317232359087.e(r0, r1, r2)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G12738412843435213993.b(java.lang.Object, int, java.lang.Object, dev.epro.r0.M8849337839148886240):void");
    }

    public final void c(Object obj, Object obj2) {
        A4559761392562572984 a4559761392562572984 = this.e;
        E7125458317232359087.o(a4559761392562572984, obj2, obj);
        if (!(obj2 instanceof B4739506393801054036) || a4559761392562572984.c(obj2)) {
            return;
        }
        E7125458317232359087.p(this.l, obj2);
        this.m.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(dev.epro.r0.J12623741444539852712 r34) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G12738412843435213993.d(dev.epro.r0.J12623741444539852712):void");
    }
}
