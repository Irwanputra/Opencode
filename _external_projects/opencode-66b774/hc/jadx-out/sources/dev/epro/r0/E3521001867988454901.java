package dev.epro.r0;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E3521001867988454901 implements E16285158603488107888 {
    public static final E3521001867988454901 b = new E3521001867988454901(0);
    public static final E3521001867988454901 c = new E3521001867988454901(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ E3521001867988454901(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dev.epro.r0.G842859980338292746 a(dev.epro.r0.P10917817599008460069 r9, dev.epro.r0.T558270488962777544 r10, dev.epro.r0.N4061146215511977314 r11) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E3521001867988454901.a(dev.epro.r0.P10917817599008460069, dev.epro.r0.T558270488962777544, dev.epro.r0.N4061146215511977314):dev.epro.r0.G842859980338292746");
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
        T15985366153370019177 t15985366153370019177C = b15682441012508903446.c();
        T558270488962777544 t5582704889627775442 = v5252629055842691065.r;
        return t15985366153370019177C.a(t5582704889627775442 != null ? t5582704889627775442.b() : null);
    }

    public static int c(P10917817599008460069 p10917817599008460069, int i) {
        String strA = p10917817599008460069.f.a("Retry-After");
        if (strA == null) {
            strA = null;
        }
        if (strA == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        patternCompile.getClass();
        if (!patternCompile.matcher(strA).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strA);
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x017e, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0626 A[PHI: r17
      0x0626: PHI (r17v3 dev.epro.r0.O6225539295864356213) = (r17v2 dev.epro.r0.O6225539295864356213), (r17v4 dev.epro.r0.O6225539295864356213) binds: [B:270:0x060a, B:273:0x0614] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x071b A[Catch: IOException -> 0x0629, TryCatch #6 {IOException -> 0x0629, blocks: (B:272:0x060d, B:274:0x0616, B:278:0x062c, B:287:0x0653, B:289:0x065c, B:290:0x0667, B:291:0x0680, B:296:0x0693, B:302:0x06a1, B:303:0x06a8, B:305:0x06ab, B:308:0x06b4, B:314:0x06c1, B:316:0x06f9, B:318:0x070a, B:322:0x0715, B:329:0x072e, B:332:0x073b, B:333:0x075f, B:324:0x071b, B:315:0x06e3), top: B:351:0x060d }] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0768 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v16, types: [dev.epro.r0.R8365488887580997185] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // dev.epro.r0.E16285158603488107888
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.P10917817599008460069 intercept(dev.epro.r0.N4061146215511977314 r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E3521001867988454901.intercept(dev.epro.r0.N4061146215511977314):dev.epro.r0.P10917817599008460069");
    }
}
