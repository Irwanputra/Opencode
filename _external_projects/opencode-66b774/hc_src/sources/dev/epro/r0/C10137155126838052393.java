package dev.epro.r0;

import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C10137155126838052393 implements A8947685337014270457 {
    public static final byte[] g = new byte[0];
    public static final byte[] h = {0};
    public final RSAPublicKey a;
    public final String b;
    public final PSSParameterSpec c;
    public final byte[] d;
    public final byte[] e;
    public final Provider f;

    public C10137155126838052393(RSAPublicKey rSAPublicKey, P11201002968880096560 p11201002968880096560, P11201002968880096560 p112010029688800965602, int i, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!G6547577305291411977.d(2)) {
            W4415201450379021245.c("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        if (!p11201002968880096560.equals(p112010029688800965602)) {
            W4415201450379021245.c("sigHash and mgf1Hash must be the same");
            throw null;
        }
        M3250598633778217966.b(rSAPublicKey.getModulus().bitLength());
        M3250598633778217966.c(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.b = c(p11201002968880096560);
        this.c = d(p11201002968880096560, p112010029688800965602, i);
        this.d = bArr;
        this.e = bArr2;
        this.f = provider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if ((!java.util.Objects.equals(java.lang.System.getProperty("java.vendor"), "The Android Project") ? null : java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT)).intValue() <= 23) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dev.epro.r0.C10137155126838052393 b(dev.epro.r0.S14902715661559460346 r10) {
        /*
            int r0 = dev.epro.r0.Z12670897225348479586.a
            java.lang.String r0 = "java.vendor"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            java.lang.String r2 = "The Android Project"
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 == 0) goto L2d
            java.lang.String r0 = java.lang.System.getProperty(r0)
            boolean r0 = java.util.Objects.equals(r0, r2)
            r1 = 0
            if (r0 != 0) goto L1d
            r0 = r1
            goto L23
        L1d:
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L23:
            int r0 = r0.intValue()
            r2 = 23
            if (r0 > r2) goto L2d
        L2b:
            r9 = r1
            goto L32
        L2d:
            java.security.Provider r1 = dev.epro.r0.C775827382551829194.U()
            goto L2b
        L32:
            if (r9 == 0) goto L6f
            java.lang.String r0 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0, r9)
            java.security.spec.RSAPublicKeySpec r1 = new java.security.spec.RSAPublicKeySpec
            java.math.BigInteger r2 = r10.k
            dev.epro.r0.M5876618289820536996 r3 = r10.j
            java.math.BigInteger r4 = r3.b
            r1.<init>(r2, r4)
            java.security.PublicKey r0 = r0.generatePublic(r1)
            java.security.interfaces.RSAPublicKey r0 = (java.security.interfaces.RSAPublicKey) r0
            dev.epro.r0.C10137155126838052393 r2 = new dev.epro.r0.C10137155126838052393
            dev.epro.r0.P11201002968880096560 r4 = r3.d
            dev.epro.r0.P11201002968880096560 r5 = r3.e
            int r6 = r3.f
            dev.epro.r0.J4250663911053539605 r10 = r10.l
            byte[] r7 = r10.b()
            dev.epro.r0.D14731132657808549702 r10 = r3.c
            dev.epro.r0.D14731132657808549702 r1 = dev.epro.r0.D14731132657808549702.v0
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L68
            byte[] r10 = dev.epro.r0.C10137155126838052393.h
        L65:
            r8 = r10
            r3 = r0
            goto L6b
        L68:
            byte[] r10 = dev.epro.r0.C10137155126838052393.g
            goto L65
        L6b:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        L6f:
            java.security.NoSuchProviderException r10 = new java.security.NoSuchProviderException
            java.lang.String r0 = "RSA SSA PSS using Conscrypt is not supported."
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.C10137155126838052393.b(dev.epro.r0.S14902715661559460346):dev.epro.r0.C10137155126838052393");
    }

    public static String c(P11201002968880096560 p11201002968880096560) {
        if (p11201002968880096560 == P11201002968880096560.b) {
            return "SHA256withRSA/PSS";
        }
        if (p11201002968880096560 == P11201002968880096560.c) {
            return "SHA384withRSA/PSS";
        }
        if (p11201002968880096560 == P11201002968880096560.d) {
            return "SHA512withRSA/PSS";
        }
        S10973172697741180971.j("Unsupported hash: ".concat(String.valueOf(p11201002968880096560)));
        return null;
    }

    public static PSSParameterSpec d(P11201002968880096560 p11201002968880096560, P11201002968880096560 p112010029688800965602, int i) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        P11201002968880096560 p112010029688800965603 = P11201002968880096560.d;
        P11201002968880096560 p112010029688800965604 = P11201002968880096560.c;
        P11201002968880096560 p112010029688800965605 = P11201002968880096560.b;
        if (p11201002968880096560 == p112010029688800965605) {
            str = "SHA-256";
        } else if (p11201002968880096560 == p112010029688800965604) {
            str = "SHA-384";
        } else {
            if (p11201002968880096560 != p112010029688800965603) {
                S10973172697741180971.j("Unsupported MD hash: ".concat(String.valueOf(p11201002968880096560)));
                return null;
            }
            str = "SHA-512";
        }
        if (p112010029688800965602 == p112010029688800965605) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (p112010029688800965602 == p112010029688800965604) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (p112010029688800965602 != p112010029688800965603) {
                S10973172697741180971.j("Unsupported MGF1 hash: ".concat(String.valueOf(p112010029688800965602)));
                return null;
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i, 1);
    }

    @Override // dev.epro.r0.A8947685337014270457
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.d;
        if (!Z12670897225348479586.b(bArr3, bArr)) {
            W4415201450379021245.c("Invalid signature (output prefix mismatch)");
            return;
        }
        Signature signature = Signature.getInstance(this.b, this.f);
        signature.initVerify(this.a);
        signature.setParameter(this.c);
        signature.update(bArr2);
        byte[] bArr4 = this.e;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        if (signature.verify(bArr, bArr3.length, bArr.length - bArr3.length)) {
            return;
        }
        W4415201450379021245.c("signature verification failed");
    }
}
