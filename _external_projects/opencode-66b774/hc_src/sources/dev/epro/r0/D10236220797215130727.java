package dev.epro.r0;

import android.view.View;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
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
            J9638579967056948799 g = g();
            j(null);
            if (g != null) {
                H12838525957287096428 h12838525957287096428 = H12838525957287096428.a;
                H12838525957287096428 h128385259572870964282 = H12838525957287096428.c;
                g.i1(h12838525957287096428, h128385259572870964282);
                if (!g.a.n) {
                    P753981624812481271.b("visitAncestors called on an unattached node");
                }
                R15896830329318850690 r15896830329318850690 = g.a.e;
                H11725168162114556860 R = R7033599853981556291.R(g);
                while (R != null) {
                    if ((((R15896830329318850690) R.F.g).d & 1024) != 0) {
                        while (r15896830329318850690 != null) {
                            if ((r15896830329318850690.c & 1024) != 0) {
                                R15896830329318850690 r158968303293188506902 = r15896830329318850690;
                                D389890677992184566 d389890677992184566 = null;
                                while (r158968303293188506902 != null) {
                                    if (r158968303293188506902 instanceof J9638579967056948799) {
                                        ((J9638579967056948799) r158968303293188506902).i1(H12838525957287096428.b, h128385259572870964282);
                                    } else if ((r158968303293188506902.c & 1024) != 0 && (r158968303293188506902 instanceof J2215566372910931965)) {
                                        int i = 0;
                                        for (R15896830329318850690 r158968303293188506903 = ((J2215566372910931965) r158968303293188506902).p; r158968303293188506903 != null; r158968303293188506903 = r158968303293188506903.f) {
                                            if ((r158968303293188506903.c & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    r158968303293188506902 = r158968303293188506903;
                                                } else {
                                                    if (d389890677992184566 == null) {
                                                        d389890677992184566 = new D389890677992184566(0, new R15896830329318850690[16]);
                                                    }
                                                    if (r158968303293188506902 != null) {
                                                        d389890677992184566.b(r158968303293188506902);
                                                        r158968303293188506902 = null;
                                                    }
                                                    d389890677992184566.b(r158968303293188506903);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    r158968303293188506902 = R7033599853981556291.M(d389890677992184566);
                                }
                            }
                            r15896830329318850690 = r15896830329318850690.e;
                        }
                    }
                    R = R.u();
                    r15896830329318850690 = (R == null || (x9608137461199640409 = R.F) == null) ? null : (E6101237837392211295) x9608137461199640409.f;
                }
            }
        }
        return true;
    }

    public final boolean c(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (z) {
            b(z);
        } else {
            int ordinal = V12319504402545346730.P(this.c, i).ordinal();
            if (ordinal == 0) {
                b(z);
            } else {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    Z3383101362411723454.g();
                    return false;
                }
                z3 = false;
            }
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
            View findFocus = s7974369370986781936.findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            s7974369370986781936.clearFocus();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        if (r7 == null) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0196 A[Catch: all -> 0x0315, TryCatch #0 {all -> 0x0315, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x0017, B:11:0x0023, B:13:0x0027, B:14:0x002f, B:15:0x004b, B:18:0x0056, B:20:0x005c, B:21:0x0061, B:23:0x0069, B:25:0x006e, B:27:0x0074, B:31:0x007a, B:36:0x0196, B:38:0x019c, B:39:0x019f, B:41:0x01aa, B:44:0x01b8, B:48:0x01c2, B:51:0x01c8, B:52:0x01cd, B:54:0x01d5, B:56:0x01db, B:58:0x01df, B:60:0x01e7, B:62:0x01ed, B:68:0x01f5, B:70:0x01fe, B:71:0x0202, B:66:0x0205, B:77:0x020b, B:88:0x0210, B:91:0x0213, B:93:0x0219, B:100:0x021d, B:105:0x0226, B:107:0x022e, B:115:0x0245, B:117:0x024a, B:151:0x024e, B:146:0x0290, B:119:0x025a, B:121:0x0260, B:123:0x0264, B:125:0x026c, B:127:0x0272, B:133:0x027a, B:135:0x0283, B:136:0x0287, B:131:0x028a, B:157:0x0295, B:161:0x02a5, B:163:0x02aa, B:197:0x02ae, B:192:0x02f0, B:165:0x02ba, B:167:0x02c0, B:169:0x02c4, B:171:0x02cc, B:173:0x02d2, B:179:0x02da, B:181:0x02e3, B:182:0x02e7, B:177:0x02ea, B:204:0x02f7, B:206:0x02fe, B:219:0x0082, B:221:0x0088, B:222:0x008b, B:224:0x0093, B:227:0x00a1, B:231:0x00ab, B:266:0x0100, B:268:0x0104, B:233:0x00b0, B:235:0x00b6, B:237:0x00ba, B:239:0x00c2, B:241:0x00c8, B:247:0x00d0, B:249:0x00d9, B:250:0x00dd, B:245:0x00e0, B:256:0x00e6, B:270:0x00eb, B:273:0x00ee, B:275:0x00f4, B:282:0x00f8, B:287:0x010a, B:289:0x0110, B:290:0x0113, B:292:0x011d, B:295:0x012b, B:299:0x0135, B:334:0x018a, B:336:0x018e, B:301:0x013a, B:303:0x0140, B:305:0x0144, B:307:0x014c, B:309:0x0152, B:315:0x015a, B:317:0x0163, B:318:0x0167, B:313:0x016a, B:324:0x0170, B:339:0x0175, B:342:0x0178, B:344:0x017e, B:351:0x0182, B:357:0x0035, B:359:0x0039, B:361:0x003f, B:363:0x0043), top: B:2:0x0007 }] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(android.view.KeyEvent r13, dev.epro.r0.B13729205492206812220 r14) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D10236220797215130727.e(android.view.KeyEvent, dev.epro.r0.B13729205492206812220):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x011c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean f(int r19, dev.epro.r0.S6349823729575121924 r20, dev.epro.r0.F4096073349764486348 r21) {
        /*
            Method dump skipped, instructions count: 748
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
        J9638579967056948799 g = g();
        S7974369370986781936 s7974369370986781936 = this.a;
        byte b = 1;
        if (g == null || !g.f321o || !s7974369370986781936.x(i)) {
            A7209497065939201693 a7209497065939201693 = new A7209497065939201693();
            a7209497065939201693.a = Boolean.FALSE;
            J9638579967056948799 g2 = g();
            Boolean f = f(i, s7974369370986781936.getEmbeddedViewFocusRect(), new B5635736699687884861(a7209497065939201693, i, b));
            if (!S10823041268949770285.t(f, Boolean.TRUE) || g2 == g()) {
                if (f != null && a7209497065939201693.a != null) {
                    if (!f.booleanValue() || !((Boolean) a7209497065939201693.a).booleanValue()) {
                        if ((i == 1 || i == 2) && z && c(i, false, false)) {
                            Boolean f2 = f(i, null, new O16774394856129852758(i, (byte) 5));
                            if (f2 != null ? f2.booleanValue() : false) {
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
        Boolean f = f(i, null, new O16774394856129852758(i, (byte) 4));
        boolean booleanValue = f != null ? f.booleanValue() : false;
        if (!booleanValue) {
            d();
        }
        return booleanValue;
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
