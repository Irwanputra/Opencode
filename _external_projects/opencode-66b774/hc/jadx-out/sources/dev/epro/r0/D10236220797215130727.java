package dev.epro.r0;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D10236220797215130727 implements Y10761909198794972532 {
    public final S7974369370986781936 a;
    public final S7974369370986781936 b;
    public final S8823403042703197154 d;
    public J15626923165028185778 f;
    public J9638579967056948799 h;
    public final J9638579967056948799 c = new J9638579967056948799(2, null, 14);
    public final L16332649893140491440 e = new L16332649893140491440(this);
    public final U9803441765912152712 g = new U9803441765912152712(1);

    public D10236220797215130727(S7974369370986781936 s7974369370986781936, S7974369370986781936 s79743693709867819362) {
        this.a = s7974369370986781936;
        this.b = s79743693709867819362;
        this.d = new S8823403042703197154(this, s79743693709867819362);
    }

    public final boolean b(boolean z) {
        X9608137461199640409 x9608137461199640409;
        if (g() != null) {
            J9638579967056948799 j9638579967056948799G = g();
            j(null);
            if (j9638579967056948799G != null) {
                H12838525957287096428 h12838525957287096428 = H12838525957287096428.a;
                H12838525957287096428 h128385259572870964282 = H12838525957287096428.c;
                j9638579967056948799G.i1(h12838525957287096428, h128385259572870964282);
                if (!j9638579967056948799G.a.n) {
                    P753981624812481271.b("visitAncestors called on an unattached node");
                }
                R15896830329318850690 r15896830329318850690 = j9638579967056948799G.a.e;
                H11725168162114556860 h11725168162114556860R = R7033599853981556291.R(j9638579967056948799G);
                while (h11725168162114556860R != null) {
                    if ((((R15896830329318850690) h11725168162114556860R.F.g).d & 1024) != 0) {
                        while (r15896830329318850690 != null) {
                            if ((r15896830329318850690.c & 1024) != 0) {
                                R15896830329318850690 r15896830329318850690M = r15896830329318850690;
                                D389890677992184566 d389890677992184566 = null;
                                while (r15896830329318850690M != null) {
                                    if (r15896830329318850690M instanceof J9638579967056948799) {
                                        ((J9638579967056948799) r15896830329318850690M).i1(H12838525957287096428.b, h128385259572870964282);
                                    } else if ((r15896830329318850690M.c & 1024) != 0 && (r15896830329318850690M instanceof J2215566372910931965)) {
                                        int i = 0;
                                        for (R15896830329318850690 r158968303293188506902 = ((J2215566372910931965) r15896830329318850690M).p; r158968303293188506902 != null; r158968303293188506902 = r158968303293188506902.f) {
                                            if ((r158968303293188506902.c & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    r15896830329318850690M = r158968303293188506902;
                                                } else {
                                                    if (d389890677992184566 == null) {
                                                        d389890677992184566 = new D389890677992184566(0, new R15896830329318850690[16]);
                                                    }
                                                    if (r15896830329318850690M != null) {
                                                        d389890677992184566.b(r15896830329318850690M);
                                                        r15896830329318850690M = null;
                                                    }
                                                    d389890677992184566.b(r158968303293188506902);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    r15896830329318850690M = R7033599853981556291.M(d389890677992184566);
                                }
                            }
                            r15896830329318850690 = r15896830329318850690.e;
                        }
                    }
                    h11725168162114556860R = h11725168162114556860R.u();
                    r15896830329318850690 = (h11725168162114556860R == null || (x9608137461199640409 = h11725168162114556860R.F) == null) ? null : (E6101237837392211295) x9608137461199640409.f;
                }
            }
        }
        return true;
    }

    public final boolean c(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = V12319504402545346730.P(this.c, i).ordinal()) == 0) {
            b(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                Z3383101362411723454.g();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            d();
        }
        return z3;
    }

    public final void d() {
        S7974369370986781936 s7974369370986781936 = this.a;
        if (s7974369370986781936.isFocused() || s7974369370986781936.hasFocus()) {
            s7974369370986781936.clearFocus();
        } else if (s7974369370986781936.hasFocus()) {
            View viewFindFocus = s7974369370986781936.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            s7974369370986781936.clearFocus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010a A[Catch: all -> 0x0315, TryCatch #0 {all -> 0x0315, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0017, B:10:0x0023, B:12:0x0027, B:13:0x002f, B:25:0x004b, B:28:0x0056, B:30:0x005c, B:31:0x0061, B:33:0x0069, B:35:0x006e, B:37:0x0074, B:41:0x007a, B:139:0x0196, B:141:0x019c, B:142:0x019f, B:144:0x01aa, B:147:0x01b8, B:151:0x01c2, B:154:0x01c8, B:155:0x01cd, B:158:0x01d5, B:160:0x01db, B:162:0x01df, B:164:0x01e7, B:166:0x01ed, B:170:0x01f5, B:172:0x01fe, B:173:0x0202, B:174:0x0205, B:177:0x020b, B:178:0x0210, B:179:0x0213, B:181:0x0219, B:183:0x021d, B:186:0x0226, B:188:0x022e, B:195:0x0245, B:197:0x024a, B:199:0x024e, B:222:0x0290, B:203:0x025a, B:205:0x0260, B:207:0x0264, B:209:0x026c, B:211:0x0272, B:215:0x027a, B:217:0x0283, B:218:0x0287, B:219:0x028a, B:223:0x0295, B:227:0x02a5, B:229:0x02aa, B:231:0x02ae, B:254:0x02f0, B:235:0x02ba, B:237:0x02c0, B:239:0x02c4, B:241:0x02cc, B:243:0x02d2, B:247:0x02da, B:249:0x02e3, B:250:0x02e7, B:251:0x02ea, B:256:0x02f7, B:258:0x02fe, B:45:0x0082, B:47:0x0088, B:48:0x008b, B:50:0x0093, B:53:0x00a1, B:57:0x00ab, B:88:0x0100, B:90:0x0104, B:60:0x00b0, B:62:0x00b6, B:64:0x00ba, B:66:0x00c2, B:68:0x00c8, B:72:0x00d0, B:74:0x00d9, B:75:0x00dd, B:76:0x00e0, B:79:0x00e6, B:80:0x00eb, B:81:0x00ee, B:83:0x00f4, B:85:0x00f8, B:91:0x010a, B:93:0x0110, B:94:0x0113, B:96:0x011d, B:99:0x012b, B:103:0x0135, B:134:0x018a, B:136:0x018e, B:106:0x013a, B:108:0x0140, B:110:0x0144, B:112:0x014c, B:114:0x0152, B:118:0x015a, B:120:0x0163, B:121:0x0167, B:122:0x016a, B:125:0x0170, B:126:0x0175, B:127:0x0178, B:129:0x017e, B:131:0x0182, B:15:0x0035, B:17:0x0039, B:19:0x003f, B:21:0x0043), top: B:268:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v24, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r12v25, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r12v29, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r12v30, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r12v34, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v43, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(android.view.KeyEvent r13, dev.epro.r0.B13729205492206812220 r14) {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D10236220797215130727.e(android.view.KeyEvent, dev.epro.r0.B13729205492206812220):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:235:0x011c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean f(int r19, dev.epro.r0.S6349823729575121924 r20, dev.epro.r0.F4096073349764486348 r21) {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D10236220797215130727.f(int, dev.epro.r0.S6349823729575121924, dev.epro.r0.F4096073349764486348):java.lang.Boolean");
    }

    public final J9638579967056948799 g() {
        J9638579967056948799 j9638579967056948799 = this.h;
        if (j9638579967056948799 == null || !j9638579967056948799.n) {
            return null;
        }
        return j9638579967056948799;
    }

    public final boolean h(int i, boolean z) {
        J9638579967056948799 j9638579967056948799G = g();
        S7974369370986781936 s7974369370986781936 = this.a;
        byte b = 1;
        if (j9638579967056948799G == null || !j9638579967056948799G.f321o || !s7974369370986781936.x(i)) {
            A7209497065939201693 a7209497065939201693 = new A7209497065939201693();
            a7209497065939201693.a = Boolean.FALSE;
            J9638579967056948799 j9638579967056948799G2 = g();
            Boolean boolF = f(i, s7974369370986781936.getEmbeddedViewFocusRect(), new B5635736699687884861(a7209497065939201693, i, b));
            if (!S10823041268949770285.t(boolF, Boolean.TRUE) || j9638579967056948799G2 == g()) {
                if (boolF != null && a7209497065939201693.a != null) {
                    if (!boolF.booleanValue() || !((Boolean) a7209497065939201693.a).booleanValue()) {
                        if ((i == 1 || i == 2) && z && c(i, false, false)) {
                            Boolean boolF2 = f(i, null, new O16774394856129852758(i, (byte) 5));
                            if (boolF2 != null ? boolF2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean i(int i) {
        if (!c(i, false, false)) {
            return false;
        }
        Boolean boolF = f(i, null, new O16774394856129852758(i, (byte) 4));
        boolean zBooleanValue = boolF != null ? boolF.booleanValue() : false;
        if (!zBooleanValue) {
            d();
        }
        return zBooleanValue;
    }

    public final void j(J9638579967056948799 j9638579967056948799) {
        J9638579967056948799 j96385799670569487992 = this.h;
        this.h = j9638579967056948799;
        U9803441765912152712 u9803441765912152712 = this.g;
        Object[] objArr = u9803441765912152712.a;
        int i = u9803441765912152712.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((D8915346189636035008) objArr[i2]).a(j96385799670569487992, j9638579967056948799);
        }
    }
}
