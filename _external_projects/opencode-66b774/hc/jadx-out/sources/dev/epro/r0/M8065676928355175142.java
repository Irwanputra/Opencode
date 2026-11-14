package dev.epro.r0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class M8065676928355175142 implements N5372082901916183419 {
    public final G8001132634698687269 a;
    public final int b;
    public final T1542296375665870064 c;

    public M8065676928355175142(G8001132634698687269 g8001132634698687269, int i, T1542296375665870064 t1542296375665870064) {
        this.a = g8001132634698687269;
        this.b = i;
        this.c = t1542296375665870064;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // dev.epro.r0.N5372082901916183419
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.J12043550928838212009 a(dev.epro.r0.G8001132634698687269 r5, int r6, dev.epro.r0.T1542296375665870064 r7) {
        /*
            r4 = this;
            dev.epro.r0.G8001132634698687269 r0 = r4.a
            dev.epro.r0.G8001132634698687269 r5 = r5.plus(r0)
            dev.epro.r0.T1542296375665870064 r1 = dev.epro.r0.T1542296375665870064.a
            dev.epro.r0.T1542296375665870064 r2 = r4.c
            int r3 = r4.b
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = dev.epro.r0.S10823041268949770285.t(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            dev.epro.r0.M8065676928355175142 r4 = r4.d(r5, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M8065676928355175142.a(dev.epro.r0.G8001132634698687269, int, dev.epro.r0.T1542296375665870064):dev.epro.r0.J12043550928838212009");
    }

    public String b() {
        return null;
    }

    public abstract Object c(A2558500182237595544 a2558500182237595544, R4833348786910499294 r4833348786910499294);

    @Override // dev.epro.r0.J12043550928838212009
    public Object collect(S7864201625552763331 s7864201625552763331, R4833348786910499294 r4833348786910499294) {
        Object objB = O8620973563946607355.B(new C288342651169725874((Object) s7864201625552763331, (Object) this, (R4833348786910499294) null, (byte) 3), r4833348786910499294);
        return objB == Z3437138737604933638.a ? objB : O9245300239821758723.a;
    }

    public abstract M8065676928355175142 d(G8001132634698687269 g8001132634698687269, int i, T1542296375665870064 t1542296375665870064);

    public J12043550928838212009 e() {
        return null;
    }

    public E5386183571211952538 f(W5797197595347441198 w5797197595347441198) {
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        L12639328004344855510 y14354959068095823168 = new Y14354959068095823168((Object) this, (R4833348786910499294) null, (byte) 9);
        J17843656891628349757 j17843656891628349757 = new J17843656891628349757(E12775674050813925581.H(w5797197595347441198, this.a), I3887072968740112330.a(i, 4, this.c));
        j17843656891628349757.h0(L856869997670741194.c, j17843656891628349757, y14354959068095823168);
        return j17843656891628349757;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strB = b();
        if (strB != null) {
            arrayList.add(strB);
        }
        I3826119971291161142 i3826119971291161142 = I3826119971291161142.a;
        G8001132634698687269 g8001132634698687269 = this.a;
        if (g8001132634698687269 != i3826119971291161142) {
            arrayList.add("context=" + g8001132634698687269);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        T1542296375665870064 t1542296375665870064 = T1542296375665870064.a;
        T1542296375665870064 t15422963756658700642 = this.c;
        if (t15422963756658700642 != t1542296375665870064) {
            arrayList.add("onBufferOverflow=" + t15422963756658700642);
        }
        return getClass().getSimpleName() + '[' + R9411874267597469228.J0(arrayList, ", ", null, null, 0, null, 62) + ']';
    }
}
