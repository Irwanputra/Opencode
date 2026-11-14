package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G13540085795711994887 implements J6301524036964264730 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public G13540085795711994887(float f, float f2, float f3, float f4) {
        int iD0;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) ? false : true)) {
            StringBuilder sbK = G11450220448113054352.k("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", f, ", ", f2, ", ");
            sbK.append(f3);
            sbK.append(", ");
            sbK.append(f4);
            sbK.append(".");
            H18335142247802896069.a(sbK.toString());
        }
        float[] fArr = new float[5];
        float f5 = (f2 - 0.0f) * 3.0f;
        float f6 = (f4 - f2) * 3.0f;
        float f7 = (1.0f - f4) * 3.0f;
        double d = f5;
        double d2 = f6;
        double d3 = f7;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 == 0.0d) {
            iD0 = d2 == d3 ? 0 : M9216324016624295870.d0((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
            double d7 = (-d) + d2;
            int iD02 = M9216324016624295870.d0((float) ((-(d6 + d7)) / d5), fArr, 0);
            int iD03 = M9216324016624295870.d0((float) ((d6 - d7) / d5), fArr, iD02) + iD02;
            if (iD03 > 1) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                if (f8 > f9) {
                    fArr[0] = f9;
                    fArr[1] = f8;
                } else if (f8 == f9) {
                    iD0 = iD03 - 1;
                }
                iD0 = iD03;
            } else {
                iD0 = iD03;
            }
        }
        float f10 = (f6 - f5) * 2.0f;
        int iD04 = M9216324016624295870.d0((-f10) / (((f7 - f6) * 2.0f) - f10), fArr, iD0) + iD0;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i = 0; i < iD04; i++) {
            float f11 = fArr[i];
            float f12 = (((((((((f2 - f4) * 3.0f) + 1.0f) - 0.0f) * f11) + (((f4 - (f2 * 2.0f)) + 0.0f) * 3.0f)) * f11) + f5) * f11) + 0.0f;
            fMin = Math.min(fMin, f12);
            fMax = Math.max(fMax, f12);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        this.e = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[PHI: r3
      0x0092: PHI (r3v27 float) = (r3v5 float), (r3v16 float), (r3v21 float), (r3v31 float), (r3v36 float) binds: [B:128:0x0236, B:117:0x0206, B:92:0x01bb, B:47:0x00e5, B:22:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162 A[PHI: r12
      0x0162: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:68:0x0160, B:81:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // dev.epro.r0.J6301524036964264730
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float c(float r27) {
        /*
            Method dump skipped, instruction units count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G13540085795711994887.c(float):float");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof G13540085795711994887)) {
            return false;
        }
        G13540085795711994887 g13540085795711994887 = (G13540085795711994887) obj;
        return this.a == g13540085795711994887.a && this.b == g13540085795711994887.b && this.c == g13540085795711994887.c && this.d == g13540085795711994887.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + E12098517352909843120.e(this.c, E12098517352909843120.e(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = G11450220448113054352.k("CubicBezierEasing(a=", this.a, ", b=", this.b, ", c=");
        sbK.append(this.c);
        sbK.append(", d=");
        sbK.append(this.d);
        sbK.append(")");
        return sbK.toString();
    }
}
