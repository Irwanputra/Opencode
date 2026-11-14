package dev.epro.r0;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E7893495821728651450 extends X17453750288186724334 {
    public final H17686692708284905246 g;
    public final /* synthetic */ AtomicReferenceArray h;

    public E7893495821728651450(long j, E7893495821728651450 e7893495821728651450, H17686692708284905246 h17686692708284905246, int i) {
        super(j, e7893495821728651450, i);
        this.g = h17686692708284905246;
        this.h = new AtomicReferenceArray(J11102083402305026174.b * 2);
    }

    @Override // dev.epro.r0.X17453750288186724334
    public final int g() {
        return J11102083402305026174.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004a, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004c, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // dev.epro.r0.X17453750288186724334
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r5, dev.epro.r0.G8001132634698687269 r6) {
        /*
            r4 = this;
            int r6 = dev.epro.r0.J11102083402305026174.b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.h
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.l(r5)
            boolean r1 = r6 instanceof dev.epro.r0.J1083986568308928281
            dev.epro.r0.H17686692708284905246 r2 = r4.g
            r3 = 0
            if (r1 != 0) goto L50
            boolean r1 = r6 instanceof dev.epro.r0.G633373366446159924
            if (r1 == 0) goto L21
            goto L50
        L21:
            dev.epro.r0.D14731132657808549702 r1 = dev.epro.r0.J11102083402305026174.j
            if (r6 == r1) goto L47
            dev.epro.r0.D14731132657808549702 r1 = dev.epro.r0.J11102083402305026174.k
            if (r6 != r1) goto L2a
            goto L47
        L2a:
            dev.epro.r0.D14731132657808549702 r1 = dev.epro.r0.J11102083402305026174.g
            if (r6 == r1) goto L11
            dev.epro.r0.D14731132657808549702 r1 = dev.epro.r0.J11102083402305026174.f
            if (r6 != r1) goto L33
            goto L11
        L33:
            dev.epro.r0.D14731132657808549702 r4 = dev.epro.r0.J11102083402305026174.i
            if (r6 == r4) goto L6a
            dev.epro.r0.D14731132657808549702 r4 = dev.epro.r0.J11102083402305026174.d
            if (r6 != r4) goto L3c
            goto L6a
        L3c:
            dev.epro.r0.D14731132657808549702 r4 = dev.epro.r0.J11102083402305026174.l
            if (r6 != r4) goto L41
            goto L6a
        L41:
            java.lang.String r4 = "unexpected state: "
            dev.epro.r0.Q11088980322693754445.i(r4, r6)
            return
        L47:
            r4.n(r5, r3)
            if (r0 == 0) goto L6a
            r2.getClass()
            return
        L50:
            if (r0 == 0) goto L55
            dev.epro.r0.D14731132657808549702 r1 = dev.epro.r0.J11102083402305026174.j
            goto L57
        L55:
            dev.epro.r0.D14731132657808549702 r1 = dev.epro.r0.J11102083402305026174.k
        L57:
            boolean r6 = r4.k(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.n(r5, r3)
            r6 = r0 ^ 1
            r4.m(r5, r6)
            if (r0 == 0) goto L6a
            r2.getClass()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E7893495821728651450.h(int, dev.epro.r0.G8001132634698687269):void");
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.h;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.h.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            H17686692708284905246 h17686692708284905246 = this.g;
            h17686692708284905246.getClass();
            h17686692708284905246.P((this.d * ((long) J11102083402305026174.b)) + ((long) i));
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.h.set(i * 2, obj);
    }

    public final void o(int i, Object obj) {
        this.h.set((i * 2) + 1, obj);
    }
}
