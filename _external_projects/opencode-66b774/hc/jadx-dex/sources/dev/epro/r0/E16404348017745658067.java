package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E16404348017745658067 implements dev.epro.r0.W5605385477019102368 {
    public static final byte[] a = new byte[0];
    public static final byte[] b = {0};
    public static final byte[] c = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};
    public static final byte[] d = new byte[0];
    public static final byte[] e = {0};

    public static dev.epro.r0.E16404348017745658067 a(dev.epro.r0.H12854953188221809952 h12854953188221809952) throws java.security.spec.InvalidKeySpecException, java.security.NoSuchProviderException {
        java.security.Provider providerU = dev.epro.r0.C775827382551829194.U();
        if (providerU == null) {
            throw new java.security.NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
        }
        byte[] bArrB = ((dev.epro.r0.J4250663911053539605) h12854953188221809952.k.b).b();
        h12854953188221809952.d0().b();
        dev.epro.r0.D14731132657808549702 d14731132657808549702 = h12854953188221809952.j.j.a;
        dev.epro.r0.D14731132657808549702 d147311326578085497022 = dev.epro.r0.D14731132657808549702.L;
        dev.epro.r0.E16404348017745658067 e16404348017745658067 = new dev.epro.r0.E16404348017745658067();
        if (!dev.epro.r0.G6547577305291411977.c(1)) {
            dev.epro.r0.W4415201450379021245.c("Can not use Ed25519 in FIPS-mode.");
            throw null;
        }
        if (bArrB.length != 32) {
            dev.epro.r0.S10973172697741180971.j("Given private key's length is not 32");
            throw null;
        }
        java.security.KeyFactory.getInstance("Ed25519", providerU).generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(dev.epro.r0.Z1953481206310471956.B(new byte[][]{c, bArrB})));
        return e16404348017745658067;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dev.epro.r0.E16404348017745658067 b(dev.epro.r0.S7434432239944054875 r13) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
        /*
            int r0 = dev.epro.r0.Z12670897225348479586.a
            java.lang.String r0 = "java.vendor"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            java.lang.String r2 = "The Android Project"
            boolean r1 = java.util.Objects.equals(r1, r2)
            r3 = 0
            if (r1 == 0) goto L2d
            java.lang.String r0 = java.lang.System.getProperty(r0)
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 != 0) goto L1d
            r0 = r3
            goto L23
        L1d:
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L23:
            int r0 = r0.intValue()
            r1 = 23
            if (r0 > r1) goto L2d
            r0 = r3
            goto L31
        L2d:
            java.security.Provider r0 = dev.epro.r0.C775827382551829194.U()
        L31:
            if (r0 == 0) goto Lb7
            java.lang.String r1 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r1, r0)
            dev.epro.r0.S14902715661559460346 r1 = r13.j
            dev.epro.r0.M5876618289820536996 r1 = r1.j
            java.security.spec.RSAPrivateCrtKeySpec r4 = new java.security.spec.RSAPrivateCrtKeySpec
            dev.epro.r0.S14902715661559460346 r2 = r13.j
            java.math.BigInteger r5 = r2.k
            java.math.BigInteger r6 = r1.b
            dev.epro.r0.M9197813449740923653 r2 = r13.k
            java.lang.Object r2 = r2.b
            r7 = r2
            java.math.BigInteger r7 = (java.math.BigInteger) r7
            dev.epro.r0.M9197813449740923653 r2 = r13.l
            java.lang.Object r2 = r2.b
            r8 = r2
            java.math.BigInteger r8 = (java.math.BigInteger) r8
            dev.epro.r0.M9197813449740923653 r2 = r13.m
            java.lang.Object r2 = r2.b
            r9 = r2
            java.math.BigInteger r9 = (java.math.BigInteger) r9
            dev.epro.r0.M9197813449740923653 r2 = r13.n
            java.lang.Object r2 = r2.b
            r10 = r2
            java.math.BigInteger r10 = (java.math.BigInteger) r10
            dev.epro.r0.M9197813449740923653 r2 = r13.o
            java.lang.Object r2 = r2.b
            r11 = r2
            java.math.BigInteger r11 = (java.math.BigInteger) r11
            dev.epro.r0.M9197813449740923653 r2 = r13.p
            java.lang.Object r2 = r2.b
            r12 = r2
            java.math.BigInteger r12 = (java.math.BigInteger) r12
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            java.security.PrivateKey r0 = r0.generatePrivate(r4)
            java.security.interfaces.RSAPrivateCrtKey r0 = (java.security.interfaces.RSAPrivateCrtKey) r0
            dev.epro.r0.E16404348017745658067 r2 = new dev.epro.r0.E16404348017745658067
            dev.epro.r0.P11201002968880096560 r4 = r1.d
            dev.epro.r0.P11201002968880096560 r5 = r1.e
            int r6 = r1.f
            dev.epro.r0.J4250663911053539605 r13 = r13.d0()
            r13.b()
            dev.epro.r0.D14731132657808549702 r13 = r1.c
            dev.epro.r0.D14731132657808549702 r1 = dev.epro.r0.D14731132657808549702.v0
            r13.equals(r1)
            r2.<init>()
            r13 = 2
            boolean r13 = dev.epro.r0.G6547577305291411977.d(r13)
            if (r13 == 0) goto Lb1
            java.math.BigInteger r13 = r0.getModulus()
            int r13 = r13.bitLength()
            dev.epro.r0.M3250598633778217966.b(r13)
            java.math.BigInteger r13 = r0.getPublicExponent()
            dev.epro.r0.M3250598633778217966.c(r13)
            dev.epro.r0.C10137155126838052393.c(r4)
            dev.epro.r0.C10137155126838052393.d(r4, r5, r6)
            return r2
        Lb1:
            java.lang.String r13 = "Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available."
            dev.epro.r0.W4415201450379021245.c(r13)
            throw r3
        Lb7:
            java.security.NoSuchProviderException r13 = new java.security.NoSuchProviderException
            java.lang.String r0 = "RSA SSA PSS using Conscrypt is not supported."
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E16404348017745658067.b(dev.epro.r0.S7434432239944054875):dev.epro.r0.E16404348017745658067");
    }
}
