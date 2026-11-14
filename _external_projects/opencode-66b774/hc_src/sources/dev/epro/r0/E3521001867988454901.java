package dev.epro.r0;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E3521001867988454901 implements E16285158603488107888 {
    public static final E3521001867988454901 b = new E3521001867988454901(0);
    public static final E3521001867988454901 c = new E3521001867988454901(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ E3521001867988454901(byte b2) {
        this.a = b2;
    }

    public static G842859980338292746 a(P10917817599008460069 p10917817599008460069, T558270488962777544 t558270488962777544, N4061146215511977314 n4061146215511977314) {
        Z17877815202129479382 z17877815202129479382;
        P10917817599008460069 p109178175990084600692;
        L7308164961383861217 l7308164961383861217 = t558270488962777544 != null ? t558270488962777544.b().c : null;
        int i = p10917817599008460069.d;
        String str = p10917817599008460069.a.b;
        boolean z = false;
        if (i != 307 && i != 308) {
            if (i == 401) {
                n4061146215511977314.i.getClass();
                return null;
            }
            if (i != 421) {
                if (i == 503) {
                    P10917817599008460069 p109178175990084600693 = p10917817599008460069.k;
                    if ((p109178175990084600693 == null || p109178175990084600693.d != 503) && c(p10917817599008460069, Integer.MAX_VALUE) == 0) {
                        return p10917817599008460069.a;
                    }
                } else {
                    if (i == 407) {
                        l7308164961383861217.getClass();
                        if (l7308164961383861217.b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        n4061146215511977314.f386o.getClass();
                        return null;
                    }
                    if (i != 408) {
                        switch (i) {
                        }
                    } else if (n4061146215511977314.q && (((p109178175990084600692 = p10917817599008460069.k) == null || p109178175990084600692.d != 408) && c(p10917817599008460069, 0) <= 0)) {
                        return p10917817599008460069.a;
                    }
                }
            } else if (t558270488962777544 != null && !S10823041268949770285.t(((B15682441012508903446) t558270488962777544.c).c().i.h.d, ((R8365488887580997185) t558270488962777544.d).g().f().a.h.d)) {
                H3726261569308128079 b2 = t558270488962777544.b();
                synchronized (b2) {
                    b2.k = true;
                }
                return p10917817599008460069.a;
            }
            return null;
        }
        if (n4061146215511977314.a.a.h) {
            String a = p10917817599008460069.f.a("Location");
            if (a == null) {
                a = null;
            }
            G842859980338292746 g842859980338292746 = p10917817599008460069.a;
            if (a != null) {
                P10208541982779414550 p10208541982779414550 = g842859980338292746.a;
                p10208541982779414550.getClass();
                try {
                    z17877815202129479382 = new Z17877815202129479382();
                    z17877815202129479382.c(p10208541982779414550, a);
                } catch (IllegalArgumentException unused) {
                    z17877815202129479382 = null;
                }
                P10208541982779414550 a2 = z17877815202129479382 != null ? z17877815202129479382.a() : null;
                if (a2 != null && (S10823041268949770285.t(a2.a, g842859980338292746.a.a) || n4061146215511977314.a.a.i)) {
                    I1581330382723795749 a3 = g842859980338292746.a();
                    if (M18113111391818111737.P(str)) {
                        int i2 = p10917817599008460069.d;
                        if (i2 == 303) {
                            z = !str.equals("PROPFIND");
                        } else if (i2 != 307 && i2 != 308 && !str.equals("PROPFIND") && !str.equals("QUERY")) {
                            z = true;
                        }
                        if (z) {
                            a3.n("GET", null);
                            ((V14323974914327418545) a3.c).p("Transfer-Encoding");
                            ((V14323974914327418545) a3.c).p("Content-Length");
                            ((V14323974914327418545) a3.c).p("Content-Type");
                        } else {
                            a3.n(str, g842859980338292746.d);
                        }
                    }
                    if (!C14766148968941961570.a(g842859980338292746.a, a2)) {
                        ((V14323974914327418545) a3.c).p("Authorization");
                    }
                    a3.a = a2;
                    return new G842859980338292746(a3);
                }
            }
        }
        return null;
    }

    public static boolean b(IOException iOException, V5252629055842691065 v5252629055842691065, N4061146215511977314 n4061146215511977314, G842859980338292746 g842859980338292746) {
        boolean z = iOException instanceof S8252648394274132723;
        if (!n4061146215511977314.q) {
            return false;
        }
        if ((!z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        T558270488962777544 t558270488962777544 = v5252629055842691065.r;
        if (t558270488962777544 == null || !t558270488962777544.a) {
            return false;
        }
        B15682441012508903446 b15682441012508903446 = v5252629055842691065.h;
        b15682441012508903446.getClass();
        T15985366153370019177 c2 = b15682441012508903446.c();
        T558270488962777544 t5582704889627775442 = v5252629055842691065.r;
        return c2.a(t5582704889627775442 != null ? t5582704889627775442.b() : null);
    }

    public static int c(P10917817599008460069 p10917817599008460069, int i) {
        String a = p10917817599008460069.f.a("Retry-After");
        if (a == null) {
            a = null;
        }
        if (a == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        compile.getClass();
        if (!compile.matcher(a).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(a);
        valueOf.getClass();
        return valueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:315:0x0719, code lost:
    
        if ("close".equalsIgnoreCase(r1 == null ? null : r1) != false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017e, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:266:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x065c A[Catch: IOException -> 0x0629, TryCatch #6 {IOException -> 0x0629, blocks: (B:268:0x060d, B:270:0x0616, B:271:0x062c, B:275:0x0653, B:277:0x065c, B:279:0x0667, B:287:0x0680, B:291:0x0693, B:296:0x06a1, B:297:0x06a8, B:300:0x06ab, B:303:0x06b4, B:308:0x06c1, B:309:0x06f9, B:311:0x070a, B:314:0x0715, B:321:0x072e, B:323:0x073b, B:324:0x075f, B:326:0x071b, B:327:0x06e3), top: B:267:0x060d }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0667 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0693 A[Catch: IOException -> 0x0629, TryCatch #6 {IOException -> 0x0629, blocks: (B:268:0x060d, B:270:0x0616, B:271:0x062c, B:275:0x0653, B:277:0x065c, B:279:0x0667, B:287:0x0680, B:291:0x0693, B:296:0x06a1, B:297:0x06a8, B:300:0x06ab, B:303:0x06b4, B:308:0x06c1, B:309:0x06f9, B:311:0x070a, B:314:0x0715, B:321:0x072e, B:323:0x073b, B:324:0x075f, B:326:0x071b, B:327:0x06e3), top: B:267:0x060d }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06ab A[Catch: IOException -> 0x0629, TryCatch #6 {IOException -> 0x0629, blocks: (B:268:0x060d, B:270:0x0616, B:271:0x062c, B:275:0x0653, B:277:0x065c, B:279:0x0667, B:287:0x0680, B:291:0x0693, B:296:0x06a1, B:297:0x06a8, B:300:0x06ab, B:303:0x06b4, B:308:0x06c1, B:309:0x06f9, B:311:0x070a, B:314:0x0715, B:321:0x072e, B:323:0x073b, B:324:0x075f, B:326:0x071b, B:327:0x06e3), top: B:267:0x060d }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x06bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x070a A[Catch: IOException -> 0x0629, TryCatch #6 {IOException -> 0x0629, blocks: (B:268:0x060d, B:270:0x0616, B:271:0x062c, B:275:0x0653, B:277:0x065c, B:279:0x0667, B:287:0x0680, B:291:0x0693, B:296:0x06a1, B:297:0x06a8, B:300:0x06ab, B:303:0x06b4, B:308:0x06c1, B:309:0x06f9, B:311:0x070a, B:314:0x0715, B:321:0x072e, B:323:0x073b, B:324:0x075f, B:326:0x071b, B:327:0x06e3), top: B:267:0x060d }] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0768  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v16, types: [dev.epro.r0.R8365488887580997185] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // dev.epro.r0.E16285158603488107888
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.P10917817599008460069 intercept(dev.epro.r0.N4061146215511977314 r41) {
        /*
            Method dump skipped, instructions count: 1910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E3521001867988454901.intercept(dev.epro.r0.N4061146215511977314):dev.epro.r0.P10917817599008460069");
    }
}
