package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E10435692508631311364 {
    public static final java.util.HashMap c;
    public final java.lang.Integer a;
    public final int b;

    static {
        new java.util.HashSet(java.util.Arrays.asList(dev.epro.r0.G15471856606567993098.y0, dev.epro.r0.G15471856606567993098.C0, dev.epro.r0.G15471856606567993098.x0, dev.epro.r0.G15471856606567993098.z0));
        java.util.HashMap map = new java.util.HashMap(2);
        map.put(2, "APK Signature Scheme v2");
        map.put(3, "APK Signature Scheme v3");
        c = map;
    }

    public E10435692508631311364(dev.epro.r0.Y12887846282176508602 y12887846282176508602, java.lang.Integer num, int i) {
        this.a = num;
        this.b = i;
    }

    public static void a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, dev.epro.r0.Y11675591421631573075 y11675591421631573075) {
        try {
            if (java.util.Arrays.equals(((java.security.cert.X509Certificate) arrayList2.get(0)).getEncoded(), ((java.security.cert.X509Certificate) arrayList.get(0)).getEncoded())) {
                return;
            }
            y11675591421631573075.a(dev.epro.r0.G15471856606567993098.K0, new java.lang.Object[0]);
        } catch (java.security.cert.CertificateEncodingException e) {
            dev.epro.r0.Z3383101362411723454.m("Failed to encode APK signer cert", e);
        }
    }

    public static void b(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, byte[] bArr, dev.epro.r0.Y11675591421631573075 y11675591421631573075) {
        if (arrayList.size() != 1) {
            y11675591421631573075.a(dev.epro.r0.G15471856606567993098.I0, new java.lang.Object[0]);
        }
        a(arrayList2, ((dev.epro.r0.U10137507234533468731) arrayList.get(0)).a, y11675591421631573075);
        byte[] bArrF = f(((dev.epro.r0.U10137507234533468731) arrayList.get(0)).c);
        if (java.util.Arrays.equals(bArr, bArrF)) {
            return;
        }
        y11675591421631573075.a(dev.epro.r0.G15471856606567993098.L0, new java.lang.Object[]{3, dev.epro.r0.V12319504402545346730.Y(bArrF), dev.epro.r0.V12319504402545346730.Y(bArr)});
    }

    public static void c(java.util.ArrayList arrayList, java.util.HashMap map) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            dev.epro.r0.N10165880154438570497 n10165880154438570497 = (dev.epro.r0.N10165880154438570497) obj;
            dev.epro.r0.Y16631409940158714280 y16631409940158714280A = dev.epro.r0.Y16631409940158714280.a(n10165880154438570497.a);
            if (y16631409940158714280A != null) {
                map.put(y16631409940158714280A.c, n10165880154438570497.b);
            }
        }
    }

    public static java.nio.ByteBuffer d(dev.epro.r0.Y12887846282176508602 y12887846282176508602, dev.epro.r0.J13328905385734298453 j13328905385734298453) throws dev.epro.r0.C15632080896631311437 {
        dev.epro.r0.X13396380553427713373 x13396380553427713373;
        java.lang.String[] strArr = dev.epro.r0.J5891810409609129928.a;
        java.util.ArrayList arrayListL = dev.epro.r0.T3224757362656795885.l(y12887846282176508602, j13328905385734298453);
        try {
            dev.epro.r0.Y12887846282176508602 y12887846282176508602E = y12887846282176508602.e(0L, j13328905385734298453.a);
            int size = arrayListL.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    x13396380553427713373 = null;
                    break;
                }
                java.lang.Object obj = arrayListL.get(i);
                i++;
                x13396380553427713373 = (dev.epro.r0.X13396380553427713373) obj;
                if ("AndroidManifest.xml".equals(x13396380553427713373.g)) {
                    break;
                }
            }
            if (x13396380553427713373 != null) {
                return java.nio.ByteBuffer.wrap(dev.epro.r0.Z10210542706506868338.a(y12887846282176508602E, x13396380553427713373, y12887846282176508602E.size()));
            }
            throw new dev.epro.r0.C15632080896631311437("Missing AndroidManifest.xml");
        } catch (dev.epro.r0.G3596274300958059526 e) {
            throw new dev.epro.r0.C15632080896631311437("Failed to read AndroidManifest.xml", e);
        }
    }

    public static java.util.HashMap e(dev.epro.r0.P3161324327665759195 p3161324327665759195) {
        java.util.HashMap map = new java.util.HashMap();
        java.util.ArrayList arrayList = p3161324327665759195.g;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            c(((dev.epro.r0.P5799335319119159120) obj).g, map);
        }
        return map;
    }

    public static byte[] f(java.util.ArrayList arrayList) {
        java.util.HashMap map = new java.util.HashMap();
        c(arrayList, map);
        dev.epro.r0.Y4733161976867834422[] y4733161976867834422Arr = dev.epro.r0.V933048422416352811.a;
        for (int i = 0; i < 3; i++) {
            dev.epro.r0.Y4733161976867834422 y4733161976867834422 = y4733161976867834422Arr[i];
            if (map.containsKey(y4733161976867834422)) {
                return (byte[]) map.get(y4733161976867834422);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0309 A[LOOP:7: B:116:0x0307->B:117:0x0309, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x032f A[LOOP:8: B:119:0x032d->B:120:0x032f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x03ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0378 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:457:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:458:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:459:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.Y11675591421631573075 g(dev.epro.r0.Y12887846282176508602 r40) throws dev.epro.r0.C15632080896631311437 {
        /*
            Method dump skipped, instruction units count: 2071
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E10435692508631311364.g(dev.epro.r0.Y12887846282176508602):dev.epro.r0.Y11675591421631573075");
    }
}
