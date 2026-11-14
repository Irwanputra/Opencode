package dev.epro.r0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V4351601219763732262 {
    public final List a;
    public final float[] b;
    public final int c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [dev.epro.r0.O2161699089510411363] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public V4351601219763732262(List list, float[] fArr) {
        Object objU;
        this.a = list;
        this.b = fArr;
        if (list.size() != fArr.length) {
            int length = fArr.length;
            if (length != 0) {
                if (length != 1) {
                    objU = new ArrayList(fArr.length);
                    for (float f : fArr) {
                        objU.add(Float.valueOf(f));
                    }
                } else {
                    objU = K5751602218013079365.U(Float.valueOf(fArr[0]));
                }
            } else {
                objU = O2161699089510411363.a;
            }
            Y16081827717826519461.a("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + objU);
        }
        this.c = this.b.length;
    }

    public final Object a(float f) {
        float[] fArr = this.b;
        int length = fArr.length;
        float f2 = Float.POSITIVE_INFINITY;
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < length) {
            int i4 = i3 + 1;
            float fAbs = Math.abs(f - fArr[i]);
            if (fAbs <= f2) {
                i2 = i3;
                f2 = fAbs;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.a.get(i2);
    }

    public final Object b(float f, boolean z) {
        float[] fArr = this.b;
        int length = fArr.length;
        int i = 0;
        int i2 = -1;
        float f2 = Float.POSITIVE_INFINITY;
        int i3 = 0;
        while (i < length) {
            float f3 = fArr[i];
            int i4 = i3 + 1;
            float f4 = z ? f3 - f : f - f3;
            if (f4 < 0.0f) {
                f4 = Float.POSITIVE_INFINITY;
            }
            if (f4 <= f2) {
                i2 = i3;
                f2 = f4;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.a.get(i2);
    }

    public final float c(Object obj) {
        int iIndexOf = this.a.indexOf(obj);
        if (iIndexOf < 0) {
            return Float.NaN;
        }
        float[] fArr = this.b;
        if (iIndexOf < fArr.length) {
            return fArr[iIndexOf];
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V4351601219763732262)) {
            return false;
        }
        V4351601219763732262 v4351601219763732262 = (V4351601219763732262) obj;
        return this.a.equals(v4351601219763732262.a) && Arrays.equals(this.b, v4351601219763732262.b) && this.c == v4351601219763732262.c;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.b) + (this.a.hashCode() * 31)) * 31) + this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DraggableAnchors(anchors={"
            r0.<init>(r1)
            r1 = 0
        L8:
            int r2 = r6.c
            if (r1 >= r2) goto L41
            java.util.List r3 = r6.a
            java.lang.Object r3 = dev.epro.r0.R9411874267597469228.E0(r1, r3)
            if (r1 < 0) goto L1c
            float[] r4 = r6.b
            int r5 = r4.length
            if (r1 >= r5) goto L1c
            r4 = r4[r1]
            goto L1e
        L1c:
            r4 = 2143289344(0x7fc00000, float:NaN)
        L1e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = "="
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            r0.append(r3)
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L3e
            java.lang.String r2 = ", "
            r0.append(r2)
        L3e:
            int r1 = r1 + 1
            goto L8
        L41:
            java.lang.String r6 = "})"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V4351601219763732262.toString():java.lang.String");
    }
}
