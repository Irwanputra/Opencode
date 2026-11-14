package dev.epro.r0;

import java.nio.ByteBuffer;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E10435692508631311364 {
    public static final HashMap c;
    public final Integer a;
    public final int b;

    static {
        new HashSet(Arrays.asList(G15471856606567993098.V3_SIG_MALFORMED_LINEAGE, G15471856606567993098.V3_INCONSISTENT_LINEAGES, G15471856606567993098.V3_SIG_POR_DID_NOT_VERIFY, G15471856606567993098.V3_SIG_POR_CERT_MISMATCH));
        HashMap hashMap = new HashMap(2);
        hashMap.put(2, "APK Signature Scheme v2");
        hashMap.put(3, "APK Signature Scheme v3");
        c = hashMap;
    }

    public E10435692508631311364(Y12887846282176508602 y12887846282176508602, Integer num, int i) {
        this.a = num;
        this.b = i;
    }

    public static void a(ArrayList arrayList, ArrayList arrayList2, Y11675591421631573075 y11675591421631573075) {
        try {
            if (Arrays.equals(((X509Certificate) arrayList2.get(0)).getEncoded(), ((X509Certificate) arrayList.get(0)).getEncoded())) {
                return;
            }
            y11675591421631573075.a(G15471856606567993098.V4_SIG_V2_V3_SIGNERS_MISMATCH, new Object[0]);
        } catch (CertificateEncodingException e) {
            Z3383101362411723454.m("Failed to encode APK signer cert", e);
        }
    }

    public static void b(ArrayList arrayList, ArrayList arrayList2, byte[] bArr, Y11675591421631573075 y11675591421631573075) {
        if (arrayList.size() != 1) {
            y11675591421631573075.a(G15471856606567993098.V4_SIG_MULTIPLE_SIGNERS, new Object[0]);
        }
        a(arrayList2, ((U10137507234533468731) arrayList.get(0)).a, y11675591421631573075);
        byte[] f = f(((U10137507234533468731) arrayList.get(0)).c);
        if (Arrays.equals(bArr, f)) {
            return;
        }
        y11675591421631573075.a(G15471856606567993098.V4_SIG_V2_V3_DIGESTS_MISMATCH, 3, V12319504402545346730.Y(f), V12319504402545346730.Y(bArr));
    }

    public static void c(ArrayList arrayList, HashMap hashMap) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            N10165880154438570497 n10165880154438570497 = (N10165880154438570497) obj;
            Y16631409940158714280 a = Y16631409940158714280.a(n10165880154438570497.a);
            if (a != null) {
                hashMap.put(a.c, n10165880154438570497.b);
            }
        }
    }

    public static ByteBuffer d(Y12887846282176508602 y12887846282176508602, J13328905385734298453 j13328905385734298453) {
        X13396380553427713373 x13396380553427713373;
        String[] strArr = J5891810409609129928.a;
        ArrayList l = T3224757362656795885.l(y12887846282176508602, j13328905385734298453);
        try {
            B11059234153875532973 e = y12887846282176508602.e(0L, j13328905385734298453.a);
            int size = l.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    x13396380553427713373 = null;
                    break;
                }
                Object obj = l.get(i);
                i++;
                x13396380553427713373 = (X13396380553427713373) obj;
                if ("AndroidManifest.xml".equals(x13396380553427713373.g)) {
                    break;
                }
            }
            if (x13396380553427713373 != null) {
                return ByteBuffer.wrap(Z10210542706506868338.a(e, x13396380553427713373, ((Y12887846282176508602) e).size()));
            }
            throw new C15632080896631311437("Missing AndroidManifest.xml");
        } catch (G3596274300958059526 e2) {
            throw new C15632080896631311437("Failed to read AndroidManifest.xml", e2);
        }
    }

    public static HashMap e(P3161324327665759195 p3161324327665759195) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = p3161324327665759195.g;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            c(((P5799335319119159120) obj).g, hashMap);
        }
        return hashMap;
    }

    public static byte[] f(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        c(arrayList, hashMap);
        Y4733161976867834422[] y4733161976867834422Arr = V933048422416352811.a;
        for (int i = 0; i < 3; i++) {
            Y4733161976867834422 y4733161976867834422 = y4733161976867834422Arr[i];
            if (hashMap.containsKey(y4733161976867834422)) {
                return (byte[]) hashMap.get(y4733161976867834422);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:280:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:330:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:345:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0309 A[LOOP:7: B:348:0x0307->B:349:0x0309, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x032f A[LOOP:8: B:352:0x032d->B:353:0x032f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0378 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:390:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:395:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.Y11675591421631573075 g(dev.epro.r0.Y12887846282176508602 r40) {
        /*
            Method dump skipped, instructions count: 2071
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E10435692508631311364.g(dev.epro.r0.Y12887846282176508602):dev.epro.r0.Y11675591421631573075");
    }
}
