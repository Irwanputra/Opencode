package dev.epro.r0;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J6579077889109668233 {
    public static final Charset b = Charset.forName("UTF-8");
    public final ByteArrayInputStream a;

    public J6579077889109668233(ByteArrayInputStream byteArrayInputStream) {
        this.a = byteArrayInputStream;
    }

    public static int a(K15572083692188606544 k15572083692188606544) {
        k15572083692188606544.getClass();
        if (!(k15572083692188606544 instanceof D16457379462628768197)) {
            Q11088980322693754445.h("invalid key id: not a JSON primitive");
            return 0;
        }
        if (!(k15572083692188606544.m().a instanceof Number)) {
            Q11088980322693754445.h("invalid key id: not a JSON number");
            return 0;
        }
        Number o2 = k15572083692188606544.m().o();
        try {
            G6653507854629384154 g6653507854629384154 = P1853490117004660039.a;
            if (!(o2 instanceof H5899666700909189688)) {
                throw new IllegalArgumentException("does not contain a parsed number.");
            }
            long parseLong = Long.parseLong(((H5899666700909189688) o2).a);
            if (parseLong <= 4294967295L && parseLong >= -2147483648L) {
                return (int) parseLong;
            }
            Q11088980322693754445.h("invalid key id");
            return 0;
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x026e, code lost:
    
        if (r15 == r5) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0271, code lost:
    
        if (r15 == 2) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0273, code lost:
    
        r8 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0274, code lost:
    
        if (r15 == 3) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0277, code lost:
    
        if (r15 == 4) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0279, code lost:
    
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0293, code lost:
    
        if (r9 != r14) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0295, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029e, code lost:
    
        r9 = dev.epro.r0.V817572303467081827.A();
        r7 = r4.w("typeUrl").p();
        r9.e();
        ((dev.epro.r0.V817572303467081827) r9.b).C(r7);
        r0 = dev.epro.r0.N17666688112968464504.i(r14, r0, r0.length);
        r9.e();
        ((dev.epro.r0.V817572303467081827) r9.b).D(r0);
        r0 = r4.w("keyMaterialType").p();
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02d2, code lost:
    
        switch(r0.hashCode()) {
            case -1881281466: goto L165;
            case -1609477353: goto L161;
            case 249237018: goto L157;
            case 1534613202: goto L153;
            default: goto L152;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02d5, code lost:
    
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0302, code lost:
    
        switch(r11) {
            case 0: goto L175;
            case 1: goto L174;
            case 2: goto L173;
            case 3: goto L172;
            default: goto L193;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0311, code lost:
    
        r0 = dev.epro.r0.Y7386946880990094255.ASYMMETRIC_PUBLIC;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x031c, code lost:
    
        r9.e();
        ((dev.epro.r0.V817572303467081827) r9.b).B(r0);
        r0 = (dev.epro.r0.V817572303467081827) r9.b();
        r6.e();
        ((dev.epro.r0.X7969147725001179512) r6.b).B(r0);
        r0 = (dev.epro.r0.X7969147725001179512) r6.b();
        r3.e();
        ((dev.epro.r0.D10561744321209513073) r3.b).w(r0);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0314, code lost:
    
        r0 = dev.epro.r0.Y7386946880990094255.ASYMMETRIC_PRIVATE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0317, code lost:
    
        r0 = dev.epro.r0.Y7386946880990094255.SYMMETRIC;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x031a, code lost:
    
        r0 = dev.epro.r0.Y7386946880990094255.REMOTE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0310, code lost:
    
        throw new dev.epro.r0.J18177443637724208589("unknown key material type: ".concat(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02dd, code lost:
    
        if (r0.equals("ASYMMETRIC_PUBLIC") != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02e0, code lost:
    
        r11 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02e8, code lost:
    
        if (r0.equals("ASYMMETRIC_PRIVATE") != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02eb, code lost:
    
        r11 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02f3, code lost:
    
        if (r0.equals("SYMMETRIC") != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02f6, code lost:
    
        r11 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02fe, code lost:
    
        if (r0.equals("REMOTE") != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0301, code lost:
    
        r11 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0297, code lost:
    
        r11 = new byte[r9];
        r14 = 0;
        java.lang.System.arraycopy(r0, 0, r11, 0, r9);
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x027c, code lost:
    
        r9 = r18 + 1;
        r0[r18] = (byte) (r17 >> 10);
        r18 = r18 + 2;
        r0[r9] = (byte) (r17 >> 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x028b, code lost:
    
        r8 = 3;
        r9 = r18 + 1;
        r0[r18] = (byte) (r17 >> 4);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dev.epro.r0.D10561744321209513073 b(dev.epro.r0.I16631908410500040363 r19) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J6579077889109668233.b(dev.epro.r0.I16631908410500040363):dev.epro.r0.D10561744321209513073");
    }
}
