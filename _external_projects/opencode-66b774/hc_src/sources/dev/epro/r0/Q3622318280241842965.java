package dev.epro.r0;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q3622318280241842965 {
    public static final Q3622318280241842965 c;
    public static final Q3622318280241842965 d;
    public static final Q3622318280241842965 e;
    public static final Q3622318280241842965 f;
    public static final Q3622318280241842965 g;
    public static final Q3622318280241842965 h;
    public static final Q3622318280241842965 i;
    public static final Q3622318280241842965 j;
    public static final Q3622318280241842965 k;
    public static final Q3622318280241842965 l;
    public static final Q3622318280241842965 m;
    public static final Q3622318280241842965 n;

    /* renamed from: o, reason: collision with root package name */
    public static final Q3622318280241842965 f452o;
    public static final Q3622318280241842965 p;
    public static final HashSet q;
    public static final Q3622318280241842965 r;
    public static final HashMap s;
    public final String a;
    public final boolean b;

    static {
        Q3622318280241842965 q3622318280241842965 = new Q3622318280241842965("tag:yaml.org,2002:yaml");
        c = q3622318280241842965;
        Q3622318280241842965 q36223182802418429652 = new Q3622318280241842965("tag:yaml.org,2002:merge");
        d = q36223182802418429652;
        Q3622318280241842965 q36223182802418429653 = new Q3622318280241842965("tag:yaml.org,2002:set");
        e = q36223182802418429653;
        Q3622318280241842965 q36223182802418429654 = new Q3622318280241842965("tag:yaml.org,2002:pairs");
        f = q36223182802418429654;
        Q3622318280241842965 q36223182802418429655 = new Q3622318280241842965("tag:yaml.org,2002:omap");
        g = q36223182802418429655;
        Q3622318280241842965 q36223182802418429656 = new Q3622318280241842965("tag:yaml.org,2002:binary");
        h = q36223182802418429656;
        Q3622318280241842965 q36223182802418429657 = new Q3622318280241842965("tag:yaml.org,2002:int");
        i = q36223182802418429657;
        Q3622318280241842965 q36223182802418429658 = new Q3622318280241842965("tag:yaml.org,2002:float");
        j = q36223182802418429658;
        Q3622318280241842965 q36223182802418429659 = new Q3622318280241842965("tag:yaml.org,2002:timestamp");
        k = q36223182802418429659;
        Q3622318280241842965 q362231828024184296510 = new Q3622318280241842965("tag:yaml.org,2002:bool");
        l = q362231828024184296510;
        Q3622318280241842965 q362231828024184296511 = new Q3622318280241842965("tag:yaml.org,2002:null");
        m = q362231828024184296511;
        Q3622318280241842965 q362231828024184296512 = new Q3622318280241842965("tag:yaml.org,2002:str");
        n = q362231828024184296512;
        Q3622318280241842965 q362231828024184296513 = new Q3622318280241842965("tag:yaml.org,2002:seq");
        f452o = q362231828024184296513;
        Q3622318280241842965 q362231828024184296514 = new Q3622318280241842965("tag:yaml.org,2002:map");
        p = q362231828024184296514;
        HashSet hashSet = new HashSet(15);
        q = hashSet;
        hashSet.add(q3622318280241842965);
        hashSet.add(q36223182802418429652);
        hashSet.add(q36223182802418429653);
        hashSet.add(q36223182802418429654);
        hashSet.add(q36223182802418429655);
        hashSet.add(q36223182802418429656);
        hashSet.add(q36223182802418429657);
        hashSet.add(q36223182802418429658);
        hashSet.add(q36223182802418429659);
        hashSet.add(q362231828024184296510);
        hashSet.add(q362231828024184296511);
        hashSet.add(q362231828024184296512);
        hashSet.add(q362231828024184296513);
        hashSet.add(q362231828024184296514);
        r = new Q3622318280241842965("tag:yaml.org,2002:comment");
        HashMap hashMap = new HashMap();
        s = hashMap;
        HashSet hashSet2 = new HashSet();
        hashSet2.add(Double.class);
        hashSet2.add(Float.class);
        hashSet2.add(BigDecimal.class);
        hashMap.put(q36223182802418429658, hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(Integer.class);
        hashSet3.add(Long.class);
        hashSet3.add(BigInteger.class);
        hashMap.put(q36223182802418429657, hashSet3);
        HashSet hashSet4 = new HashSet();
        hashSet4.add(Date.class);
        try {
            hashSet4.add(Class.forName("java.sql.Date"));
            hashSet4.add(Class.forName("java.sql.Timestamp"));
        } catch (ClassNotFoundException unused) {
        }
        s.put(k, hashSet4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x022e, code lost:
    
        r3 = new java.lang.String(r8, 0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        r5 = r25.length();
        r8 = (char[]) dev.epro.r0.K17198996250266005227.a.get();
        r9 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r6 >= r5) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r6 >= r5) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        r11 = r6 + 1;
        r12 = r25.charAt(r6);
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r12 < 55296) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r12 <= 57343) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r12 > 56319) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r11 != r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        r12 = -r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        r13 = r25.charAt(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (java.lang.Character.isLowSurrogate(r13) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        r12 = java.lang.Character.toCodePoint(r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        throw new java.lang.IllegalArgumentException("Expected low surrogate but got char '" + r13 + "' with value " + ((int) r13) + " at index " + r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b9, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected low surrogate character '" + r12 + "' with value " + ((int) r12) + " at index " + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
    
        if (r12 < 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        r11 = dev.epro.r0.D16524099442378852760.c;
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c0, code lost:
    
        if (r12 >= r4.length) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c4, code lost:
    
        if (r4[r12] == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c6, code lost:
    
        r19 = r7;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b6, code lost:
    
        if (r3 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01b8, code lost:
    
        r7 = r6 - r9;
        r11 = r10 + r7;
        r13 = r3.length + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01bf, code lost:
    
        if (r8.length >= r13) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c1, code lost:
    
        r13 = new char[((r5 - r6) + r13) + 32];
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c8, code lost:
    
        if (r10 <= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ca, code lost:
    
        java.lang.System.arraycopy(r8, 0, r13, 0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01cd, code lost:
    
        r8 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ce, code lost:
    
        if (r7 <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01d0, code lost:
    
        r25.getChars(r9, r6, r8, r10);
        r10 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01d5, code lost:
    
        if (r3.length <= 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01d7, code lost:
    
        java.lang.System.arraycopy(r3, 0, r8, r10, r3.length);
        r10 = r10 + r3.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01e1, code lost:
    
        if (java.lang.Character.isSupplementaryCodePoint(r12) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01e4, code lost:
    
        r14 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01e6, code lost:
    
        r9 = r6 + r14;
        r6 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01e9, code lost:
    
        if (r6 >= r5) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01eb, code lost:
    
        r3 = r25.charAt(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01f0, code lost:
    
        if (r3 >= r4.length) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f4, code lost:
    
        if (r4[r3] != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f7, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01fa, code lost:
    
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d4, code lost:
    
        if (r12 > 127) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d6, code lost:
    
        r3 = new char[3];
        r3[0] = '%';
        r3[2] = r11[r12 & 15];
        r3[r7] = r11[r12 >>> 4];
        r19 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ea, code lost:
    
        r19 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f9, code lost:
    
        if (r12 > 2047) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00fb, code lost:
    
        r7 = new char[6];
        r7[0] = '%';
        r7[3] = '%';
        r7[5] = r11[r12 & 15];
        r7[4] = r11[((r12 >>> 4) & 3) | 8];
        r7[2] = r11[(r12 >>> 6) & 15];
        r7[r19] = r11[12 | (r12 >>> 10)];
        r3 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012c, code lost:
    
        if (r12 > 65535) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012e, code lost:
    
        r3 = new char[9];
        r3[0] = '%';
        r3[r19] = 'E';
        r3[3] = '%';
        r3[6] = '%';
        r3[8] = r11[r12 & 15];
        r3[7] = r11[((r12 >>> 4) & 3) | 8];
        r3[5] = r11[(r12 >>> 6) & 15];
        r3[4] = r11[((r12 >>> 10) & 3) | 8];
        r3[2] = r11[r12 >>> 12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0166, code lost:
    
        if (r12 > 1114111) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0168, code lost:
    
        r3 = new char[12];
        r3[0] = '%';
        r3[r19] = 'F';
        r3[3] = '%';
        r3[6] = '%';
        r3[9] = '%';
        r3[11] = r11[r12 & 15];
        r3[10] = r11[((r12 >>> 4) & 3) | 8];
        r3[8] = r11[(r12 >>> 6) & 15];
        r3[7] = r11[((r12 >>> 10) & 3) | 8];
        r3[5] = r11[(r12 >>> 12) & 15];
        r3[4] = r11[((r12 >>> 16) & 3) | 8];
        r3[2] = r11[(r12 >>> 18) & 7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01fe, code lost:
    
        dev.epro.r0.S10973172697741180971.j(dev.epro.r0.G6547577305291411977.n(r12, "Invalid unicode character value "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0207, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0208, code lost:
    
        dev.epro.r0.S10973172697741180971.j("Trailing high surrogate at end of input");
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0210, code lost:
    
        dev.epro.r0.W4415201450379021245.a("Index exceeds specified range");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0217, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0218, code lost:
    
        r3 = r5 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x021c, code lost:
    
        if (r3 <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x021e, code lost:
    
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0220, code lost:
    
        if (r8.length >= r3) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0222, code lost:
    
        r4 = new char[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0224, code lost:
    
        if (r10 <= 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0226, code lost:
    
        java.lang.System.arraycopy(r8, 0, r4, 0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0229, code lost:
    
        r8 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x022a, code lost:
    
        r25.getChars(r9, r5, r8, r10);
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Q3622318280241842965(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Q3622318280241842965.<init>(java.lang.String):void");
    }

    public final boolean a() {
        return (this.b || q.contains(this)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Q3622318280241842965)) {
            return false;
        }
        return this.a.equals(((Q3622318280241842965) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
