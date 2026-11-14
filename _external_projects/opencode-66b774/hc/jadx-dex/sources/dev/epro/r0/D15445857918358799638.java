package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class D15445857918358799638 {
    public static final dev.epro.r0.M14716691558468128220 a;
    public static final dev.epro.r0.X14364139104409853146 b;
    public static final java.lang.Object[] c;
    public static final dev.epro.r0.E1517907155487775131 d;
    public static final dev.epro.r0.D2456187031834883815 e;
    public static final byte[] f;
    public static final dev.epro.r0.Y4261039727803185691 g;
    public static final float h;
    public static final dev.epro.r0.Y4261039727803185691 i;
    public static final dev.epro.r0.Y4261039727803185691 j;
    public static final dev.epro.r0.P10283164515565247229 k;
    public static final dev.epro.r0.Z14997871575210439922 l;
    public static final dev.epro.r0.O12545633033254628644 m;
    public static dev.epro.r0.Z7022156542152740569 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static dev.epro.r0.Z7022156542152740569 f198o;

    public static final native void A(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str);

    public static java.lang.Object B(int i2) {
        if (i2 >= 2 && i2 <= 1073741824 && java.lang.Integer.highestOneBit(i2) == i2) {
            return i2 <= 256 ? new byte[i2] : i2 <= 65536 ? new short[i2] : new int[i2];
        }
        dev.epro.r0.S10973172697741180971.j(dev.epro.r0.G6547577305291411977.n(i2, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    public static final long C(dev.epro.r0.X16625187937554653603 x16625187937554653603) {
        return dev.epro.r0.T18016951143603335921.a0(((dev.epro.r0.O15319392248629494012) x16625187937554653603.d.d).g() * x16625187937554653603.n()) + (((long) ((dev.epro.r0.P6024466796603310388) x16625187937554653603.d.c).g()) * ((long) x16625187937554653603.n()));
    }

    public static void D(dev.epro.r0.Q7316561721656982910 q7316561721656982910, dev.epro.r0.D2456187031834883815 d2456187031834883815) {
        long[] jArr = new long[10];
        dev.epro.r0.Q7316561721656982910 q73165617216569829102 = d2456187031834883815.a;
        dev.epro.r0.O4077903568229246.R((long[]) q73165617216569829102.b, (long[]) q7316561721656982910.b);
        long[] jArr2 = (long[]) q73165617216569829102.d;
        long[] jArr3 = (long[]) q7316561721656982910.c;
        dev.epro.r0.O4077903568229246.R(jArr2, jArr3);
        long[] jArr4 = d2456187031834883815.b;
        dev.epro.r0.O4077903568229246.R(jArr4, (long[]) q7316561721656982910.d);
        dev.epro.r0.O4077903568229246.T(jArr4, jArr4, jArr4);
        long[] jArr5 = (long[]) q73165617216569829102.c;
        dev.epro.r0.O4077903568229246.T(jArr5, (long[]) q7316561721656982910.b, jArr3);
        dev.epro.r0.O4077903568229246.R(jArr, jArr5);
        long[] jArr6 = (long[]) q73165617216569829102.b;
        dev.epro.r0.O4077903568229246.T(jArr5, jArr2, jArr6);
        dev.epro.r0.O4077903568229246.S(jArr2, jArr2, jArr6);
        dev.epro.r0.O4077903568229246.S(jArr6, jArr, jArr5);
        dev.epro.r0.O4077903568229246.S(jArr4, jArr4, jArr2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.Y11460403151847909905 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void E(dev.epro.r0.S7864201625552763331 r4, java.lang.Object r5, java.lang.Object r6, dev.epro.r0.K14749510448791472029 r7) throws dev.epro.r0.Y11460403151847909905 {
        /*
            boolean r0 = r7 instanceof dev.epro.r0.C9134415729975282224
            if (r0 == 0) goto L13
            r0 = r7
            dev.epro.r0.C9134415729975282224 r0 = (dev.epro.r0.C9134415729975282224) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            dev.epro.r0.C9134415729975282224 r0 = new dev.epro.r0.C9134415729975282224
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.u
            int r1 = r0.v
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return
        L27:
            java.lang.Object r6 = r0.t
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L3d
        L2d:
            dev.epro.r0.E17665849472693074628.k(r7)
            r0.t = r6
            r0.v = r2
            java.lang.Object r4 = r4.emit(r5, r0)
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r4 != r5) goto L3d
            return
        L3d:
            dev.epro.r0.Y11460403151847909905 r4 = new dev.epro.r0.Y11460403151847909905
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D15445857918358799638.E(dev.epro.r0.S7864201625552763331, java.lang.Object, java.lang.Object, dev.epro.r0.K14749510448791472029):void");
    }

    public static int F(int i2, int i3) {
        int i4 = (~(i2 ^ i3)) & 255;
        int i5 = i4 & (i4 << 4);
        int i6 = i5 & (i5 << 2);
        return ((i6 & (i6 << 1)) >> 7) & 1;
    }

    public static final dev.epro.r0.Z7022156542152740569 G() {
        dev.epro.r0.Z7022156542152740569 z7022156542152740569 = f198o;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        dev.epro.r0.Q17593287602150918564 q17593287602150918564 = new dev.epro.r0.Q17593287602150918564("Outlined.Description", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = dev.epro.r0.A5540824790408504619.a;
        dev.epro.r0.H10765568533039107979 h10765568533039107979 = new dev.epro.r0.H10765568533039107979(dev.epro.r0.U10174709222559481877.b);
        dev.epro.r0.V14323974914327418545 v14323974914327418545 = new dev.epro.r0.V14323974914327418545((byte) 3);
        v14323974914327418545.j(8.0f, 16.0f);
        v14323974914327418545.g(8.0f);
        v14323974914327418545.s(2.0f);
        v14323974914327418545.h(8.0f, 18.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(8.0f, 12.0f);
        v14323974914327418545.g(8.0f);
        v14323974914327418545.s(2.0f);
        v14323974914327418545.h(8.0f, 14.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(14.0f, 2.0f);
        v14323974914327418545.h(6.0f, 2.0f);
        v14323974914327418545.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        v14323974914327418545.s(16.0f);
        v14323974914327418545.e(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        v14323974914327418545.h(18.0f, 22.0f);
        v14323974914327418545.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        v14323974914327418545.h(20.0f, 8.0f);
        v14323974914327418545.i(-6.0f, -6.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(18.0f, 20.0f);
        v14323974914327418545.h(6.0f, 20.0f);
        v14323974914327418545.h(6.0f, 4.0f);
        v14323974914327418545.g(7.0f);
        v14323974914327418545.s(5.0f);
        v14323974914327418545.g(5.0f);
        v14323974914327418545.s(11.0f);
        v14323974914327418545.c();
        dev.epro.r0.Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, (dev.epro.r0.H10765568533039107979) null, 1.0f, 14336);
        dev.epro.r0.Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        f198o = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static byte[] H(byte[] bArr) {
        java.security.MessageDigest messageDigest = (java.security.MessageDigest) dev.epro.r0.W8357658991043002609.e.a.a("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        byte b2 = (byte) (bArrDigest[31] & 127);
        bArrDigest[31] = b2;
        bArrDigest[31] = (byte) (b2 | 64);
        return bArrDigest;
    }

    public static final java.lang.String I(java.lang.Object obj) {
        return java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
    }

    public static final long J(android.view.KeyEvent keyEvent) {
        return dev.epro.r0.S10823041268949770285.h(keyEvent.getKeyCode());
    }

    public static final int K(android.view.KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final native java.lang.Object L(dev.epro.r0.L12602321637077960189 l12602321637077960189, dev.epro.r0.K14749510448791472029 k14749510448791472029);

    public static final void M(dev.epro.r0.F13711604687869105489 f13711604687869105489, int i2, int i3) {
        f13711604687869105489.d = false;
        dev.epro.r0.F12478849263529740365 f12478849263529740365 = f13711604687869105489.g;
        int iMin = java.lang.Math.min(i2, i3);
        int iMax = java.lang.Math.max(i2, i3);
        f13711604687869105489.c(iMin, iMax, "");
        if (f12478849263529740365 != null) {
            long jE = dev.epro.r0.E2166724654553415323.e(iMin, iMax, 0, f12478849263529740365.a);
            if (dev.epro.r0.F12478849263529740365.d(jE)) {
                f13711604687869105489.f((dev.epro.r0.F12478849263529740365) null);
            } else {
                f13711604687869105489.e(dev.epro.r0.F12478849263529740365.g(jE), dev.epro.r0.F12478849263529740365.f(jE), (java.util.List) null);
            }
        }
    }

    public static final void N(dev.epro.r0.F13711604687869105489 f13711604687869105489, int i2, int i3, java.lang.CharSequence charSequence) {
        dev.epro.r0.F13711604687869105489 f137116046878691054892;
        dev.epro.r0.C8612968177090877106 c8612968177090877106 = f13711604687869105489.b;
        int iMin = java.lang.Math.min(i2, i3);
        int iMax = java.lang.Math.max(i2, i3);
        int i4 = 0;
        int i5 = iMin;
        while (i5 < iMax && i4 < charSequence.length() && charSequence.charAt(i4) == c8612968177090877106.charAt(i5)) {
            i4++;
            i5++;
        }
        int length = charSequence.length();
        int i6 = iMax;
        while (i6 > i5 && length > i4 && charSequence.charAt(length - 1) == c8612968177090877106.charAt(i6 - 1)) {
            length--;
            i6--;
        }
        if (i5 == i6 && i4 == length) {
            f13711604687869105489.f((dev.epro.r0.F12478849263529740365) null);
            f13711604687869105489.i = null;
            f137116046878691054892 = f13711604687869105489;
        } else {
            java.lang.CharSequence charSequenceSubSequence = (i4 == 0 && length == charSequence.length()) ? charSequence : charSequence.subSequence(i4, length);
            f137116046878691054892 = f13711604687869105489;
            dev.epro.r0.F13711604687869105489.d(f137116046878691054892, i5, i6, charSequenceSubSequence, 0, false, 24);
        }
        int length2 = charSequence.length() + iMin;
        f137116046878691054892.g(dev.epro.r0.T1335862270807194835.d(length2, length2));
    }

    public static boolean O(java.lang.String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean P(long[] jArr) {
        long[] jArr2 = new long[jArr.length + 1];
        java.lang.System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        dev.epro.r0.O4077903568229246.M(jArr2);
        byte[] bArrL = dev.epro.r0.O4077903568229246.l(jArr2);
        for (int i2 = 0; i2 < 32; i2++) {
            if (bArrL[i2] != 0) {
                return true;
            }
        }
        return false;
    }

    public static long Q(int i2, byte[] bArr) {
        return (((long) (bArr[i2 + 2] & 255)) << 16) | (((long) bArr[i2]) & 255) | (((long) (bArr[i2 + 1] & 255)) << 8);
    }

    public static long R(int i2, byte[] bArr) {
        return (((long) (bArr[i2 + 3] & 255)) << 24) | Q(i2, bArr);
    }

    public static int S(int i2, int i3, int i4) {
        return (i2 & (~i4)) | (i3 & i4);
    }

    public static int T(int i2) {
        return (i2 + 1) * (i2 < 32 ? 4 : 2);
    }

    public static final native dev.epro.r0.G8001132634698687269 U(dev.epro.r0.Z6112298763105579796 z6112298763105579796);

    public static int V(java.lang.Object obj, java.lang.Object obj2, int i2, java.lang.Object obj3, int[] iArr, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        int i3;
        int i4;
        int iR = dev.epro.r0.U16229988784104357932.R(obj);
        int i5 = iR & i2;
        int iB0 = b0(i5, obj3);
        if (iB0 != 0) {
            int i6 = ~i2;
            int i7 = iR & i6;
            int i8 = -1;
            while (true) {
                i3 = iB0 - 1;
                i4 = iArr[i3];
                if ((i4 & i6) == i7 && dev.epro.r0.M2066880349381062048.A(obj, objArr[i3]) && (objArr2 == null || dev.epro.r0.M2066880349381062048.A(obj2, objArr2[i3]))) {
                    break;
                }
                int i9 = i4 & i2;
                if (i9 == 0) {
                    break;
                }
                i8 = i3;
                iB0 = i9;
            }
            int i10 = i4 & i2;
            if (i8 == -1) {
                c0(i5, i10, obj3);
                return i3;
            }
            iArr[i8] = S(iArr[i8], i10, i2);
            return i3;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object W(dev.epro.r0.B13729205492206812220 r4, dev.epro.r0.L12639328004344855510 r5, dev.epro.r0.K14749510448791472029 r6) {
        /*
            boolean r0 = r6 instanceof dev.epro.r0.H17701809074551495843
            if (r0 == 0) goto L13
            r0 = r6
            dev.epro.r0.H17701809074551495843 r0 = (dev.epro.r0.H17701809074551495843) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            dev.epro.r0.H17701809074551495843 r0 = new dev.epro.r0.H17701809074551495843
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.t
            int r1 = r0.u
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            dev.epro.r0.E17665849472693074628.k(r6)     // Catch: dev.epro.r0.T6443995776615006365 -> L3f
            goto L3f
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r2
        L2c:
            dev.epro.r0.E17665849472693074628.k(r6)
            dev.epro.r0.E2138349585700051059 r6 = new dev.epro.r0.E2138349585700051059     // Catch: dev.epro.r0.T6443995776615006365 -> L3f
            r6.<init>(r4, r5, r2, r3)     // Catch: dev.epro.r0.T6443995776615006365 -> L3f
            r0.u = r3     // Catch: dev.epro.r0.T6443995776615006365 -> L3f
            java.lang.Object r4 = dev.epro.r0.O8620973563946607355.B(r6, r0)     // Catch: dev.epro.r0.T6443995776615006365 -> L3f
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r4 != r5) goto L3f
            return r5
        L3f:
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D15445857918358799638.W(dev.epro.r0.B13729205492206812220, dev.epro.r0.L12639328004344855510, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public static dev.epro.r0.Q7316561721656982910 X(byte[] bArr) {
        int i2;
        byte[] bArr2 = new byte[64];
        int i3 = 0;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = i3 * 2;
            bArr2[i4] = (byte) (bArr[i3] & 15);
            bArr2[i4 + 1] = (byte) (((bArr[i3] & 255) >> 4) & 15);
            i3++;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < 63) {
            byte b2 = (byte) (bArr2[i5] + i6);
            bArr2[i5] = b2;
            int i7 = (b2 + 8) >> 4;
            bArr2[i5] = (byte) (b2 - (i7 << 4));
            i5++;
            i6 = i7;
        }
        bArr2[63] = (byte) (bArr2[63] + i6);
        dev.epro.r0.D2456187031834883815 d2456187031834883815 = new dev.epro.r0.D2456187031834883815((byte) 0);
        dev.epro.r0.D2456187031834883815 d24561870318348838152 = new dev.epro.r0.D2456187031834883815((byte) 1);
        for (i2 = 1; i2 < 64; i2 += 2) {
            dev.epro.r0.E1517907155487775131 e1517907155487775131 = new dev.epro.r0.E1517907155487775131();
            Y(e1517907155487775131, i2 / 2, bArr2[i2]);
            dev.epro.r0.D2456187031834883815.a(d24561870318348838152, d2456187031834883815);
            s(d2456187031834883815, d24561870318348838152, e1517907155487775131);
        }
        dev.epro.r0.Q7316561721656982910 q7316561721656982910 = new dev.epro.r0.Q7316561721656982910((byte) 19);
        dev.epro.r0.Q7316561721656982910.z(q7316561721656982910, d2456187031834883815);
        D(q7316561721656982910, d2456187031834883815);
        dev.epro.r0.Q7316561721656982910.z(q7316561721656982910, d2456187031834883815);
        D(q7316561721656982910, d2456187031834883815);
        dev.epro.r0.Q7316561721656982910.z(q7316561721656982910, d2456187031834883815);
        D(q7316561721656982910, d2456187031834883815);
        dev.epro.r0.Q7316561721656982910.z(q7316561721656982910, d2456187031834883815);
        D(q7316561721656982910, d2456187031834883815);
        for (int i8 = 0; i8 < 64; i8 += 2) {
            dev.epro.r0.E1517907155487775131 e15179071554877751312 = new dev.epro.r0.E1517907155487775131();
            Y(e15179071554877751312, i8 / 2, bArr2[i8]);
            dev.epro.r0.D2456187031834883815.a(d24561870318348838152, d2456187031834883815);
            s(d2456187031834883815, d24561870318348838152, e15179071554877751312);
        }
        dev.epro.r0.Q7316561721656982910 q73165617216569829102 = new dev.epro.r0.Q7316561721656982910(d2456187031834883815);
        long[] jArr = new long[10];
        dev.epro.r0.O4077903568229246.R(jArr, (long[]) q73165617216569829102.b);
        long[] jArr2 = new long[10];
        dev.epro.r0.O4077903568229246.R(jArr2, (long[]) q73165617216569829102.c);
        long[] jArr3 = new long[10];
        dev.epro.r0.O4077903568229246.R(jArr3, (long[]) q73165617216569829102.d);
        long[] jArr4 = new long[10];
        dev.epro.r0.O4077903568229246.R(jArr4, jArr3);
        long[] jArr5 = new long[10];
        dev.epro.r0.O4077903568229246.S(jArr5, jArr2, jArr);
        dev.epro.r0.O4077903568229246.E(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        dev.epro.r0.O4077903568229246.E(jArr6, jArr, jArr2);
        dev.epro.r0.O4077903568229246.E(jArr6, jArr6, dev.epro.r0.F1919009084933321653.a);
        dev.epro.r0.O4077903568229246.T(jArr6, jArr6, jArr4);
        dev.epro.r0.O4077903568229246.L(jArr6, jArr6);
        if (java.security.MessageDigest.isEqual(dev.epro.r0.O4077903568229246.l(jArr5), dev.epro.r0.O4077903568229246.l(jArr6))) {
            return q73165617216569829102;
        }
        dev.epro.r0.S10973172697741180971.m("arithmetic error in scalar multiplication");
        return null;
    }

    public static void Y(dev.epro.r0.E1517907155487775131 e1517907155487775131, int i2, byte b2) {
        int i3 = (b2 & 255) >> 7;
        int i4 = b2 - (((-i3) & b2) << 1);
        dev.epro.r0.E1517907155487775131[][] e1517907155487775131Arr = dev.epro.r0.F1919009084933321653.d;
        e1517907155487775131.a(e1517907155487775131Arr[i2][0], F(i4, 1));
        e1517907155487775131.a(e1517907155487775131Arr[i2][1], F(i4, 2));
        e1517907155487775131.a(e1517907155487775131Arr[i2][2], F(i4, 3));
        e1517907155487775131.a(e1517907155487775131Arr[i2][3], F(i4, 4));
        e1517907155487775131.a(e1517907155487775131Arr[i2][4], F(i4, 5));
        e1517907155487775131.a(e1517907155487775131Arr[i2][5], F(i4, 6));
        e1517907155487775131.a(e1517907155487775131Arr[i2][6], F(i4, 7));
        e1517907155487775131.a(e1517907155487775131Arr[i2][7], F(i4, 8));
        long[] jArr = e1517907155487775131.b;
        long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, 10);
        long[] jArr2 = e1517907155487775131.a;
        long[] jArrCopyOf2 = java.util.Arrays.copyOf(jArr2, 10);
        long[] jArr3 = e1517907155487775131.c;
        long[] jArrCopyOf3 = java.util.Arrays.copyOf(jArr3, 10);
        for (int i5 = 0; i5 < jArrCopyOf3.length; i5++) {
            jArrCopyOf3[i5] = -jArrCopyOf3[i5];
        }
        dev.epro.r0.M9216324016624295870.r(jArr2, jArrCopyOf, i3);
        dev.epro.r0.M9216324016624295870.r(jArr, jArrCopyOf2, i3);
        dev.epro.r0.M9216324016624295870.r(jArr3, jArrCopyOf3, i3);
    }

    public static byte[] Z(byte[] bArr) {
        int i2;
        byte[] bArr2 = new byte[256];
        for (int i3 = 0; i3 < 256; i3++) {
            bArr2[i3] = (byte) (1 & ((bArr[i3 >> 3] & 255) >> (i3 & 7)));
        }
        for (int i4 = 0; i4 < 256; i4++) {
            if (bArr2[i4] != 0) {
                for (int i5 = 1; i5 <= 6 && (i2 = i4 + i5) < 256; i5++) {
                    byte b2 = bArr2[i2];
                    if (b2 != 0) {
                        byte b3 = bArr2[i4];
                        if ((b2 << i5) + b3 <= 15) {
                            bArr2[i4] = (byte) (b3 + (b2 << i5));
                            bArr2[i2] = 0;
                        } else if (b3 - (b2 << i5) >= -15) {
                            bArr2[i4] = (byte) (b3 - (b2 << i5));
                            while (true) {
                                if (i2 >= 256) {
                                    break;
                                }
                                if (bArr2[i2] == 0) {
                                    bArr2[i2] = 1;
                                    break;
                                }
                                bArr2[i2] = 0;
                                i2++;
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static final native void a(dev.epro.r0.J12043550928838212009 j12043550928838212009, boolean z, dev.epro.r0.L12639328004344855510 l12639328004344855510, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static void a0(dev.epro.r0.D2456187031834883815 d2456187031834883815, dev.epro.r0.D2456187031834883815 d24561870318348838152, dev.epro.r0.E1517907155487775131 e1517907155487775131) {
        long[] jArr = new long[10];
        dev.epro.r0.Q7316561721656982910 q7316561721656982910 = d2456187031834883815.a;
        long[] jArr2 = (long[]) q7316561721656982910.b;
        dev.epro.r0.Q7316561721656982910 q73165617216569829102 = d24561870318348838152.a;
        dev.epro.r0.O4077903568229246.T(jArr2, (long[]) q73165617216569829102.c, (long[]) q73165617216569829102.b);
        long[] jArr3 = (long[]) q7316561721656982910.c;
        dev.epro.r0.O4077903568229246.S(jArr3, (long[]) q73165617216569829102.c, (long[]) q73165617216569829102.b);
        dev.epro.r0.O4077903568229246.E(jArr3, jArr3, e1517907155487775131.a);
        long[] jArr4 = (long[]) q7316561721656982910.d;
        long[] jArr5 = (long[]) q7316561721656982910.b;
        dev.epro.r0.O4077903568229246.E(jArr4, jArr5, e1517907155487775131.b);
        long[] jArr6 = d2456187031834883815.b;
        dev.epro.r0.O4077903568229246.E(jArr6, d24561870318348838152.b, e1517907155487775131.c);
        e1517907155487775131.b(jArr5, (long[]) q73165617216569829102.d);
        dev.epro.r0.O4077903568229246.T(jArr, jArr5, jArr5);
        dev.epro.r0.O4077903568229246.S(jArr5, jArr4, jArr3);
        dev.epro.r0.O4077903568229246.T(jArr3, jArr4, jArr3);
        dev.epro.r0.O4077903568229246.S(jArr4, jArr, jArr6);
        dev.epro.r0.O4077903568229246.T(jArr6, jArr, jArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(dev.epro.r0.B13729205492206812220 r16, dev.epro.r0.V11842483535419227802 r17, dev.epro.r0.T15443218846549482730 r18, dev.epro.r0.M3727281027331139839 r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D15445857918358799638.b(dev.epro.r0.B13729205492206812220, dev.epro.r0.V11842483535419227802, dev.epro.r0.T15443218846549482730, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    public static int b0(int i2, java.lang.Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i2] & 255 : obj instanceof short[] ? ((short[]) obj)[i2] & 65535 : ((int[]) obj)[i2];
    }

    public static final void c(dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.L12639328004344855510 l12639328004344855510, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2) {
        m3727281027331139839.b0(1090521195);
        int i3 = (m3727281027331139839.f(i1722681268793429505) ? 4 : 2) | i2 | (m3727281027331139839.h(l12639328004344855510) ? 32 : 16);
        if (m3727281027331139839.R(i3 & 1, (i3 & 19) != 18)) {
            java.lang.Object objM = m3727281027331139839.M();
            if (objM == dev.epro.r0.O9023047933786425027.a) {
                objM = dev.epro.r0.D4887919054349991205.b;
                m3727281027331139839.k0(objM);
            }
            dev.epro.r0.A10838822263452390785 a10838822263452390785 = (dev.epro.r0.A10838822263452390785) objM;
            int iHashCode = java.lang.Long.hashCode(m3727281027331139839.T);
            dev.epro.r0.P3648740535677465818 p3648740535677465818L = m3727281027331139839.l();
            dev.epro.r0.I1722681268793429505 i1722681268793429505N = dev.epro.r0.V12319504402545346730.N(m3727281027331139839, i1722681268793429505);
            dev.epro.r0.X4572652335386916693.Po.getClass();
            int i4 = (((((i3 << 3) & 112) | (((i3 >> 3) & 14) | 384)) << 6) & 896) | 6;
            m3727281027331139839.d0();
            if (m3727281027331139839.S) {
                m3727281027331139839.k(dev.epro.r0.H11725168162114556860.S);
            } else {
                m3727281027331139839.n0();
            }
            dev.epro.r0.W7808703833045379622.J(dev.epro.r0.P2382941533350862833.i, m3727281027331139839, a10838822263452390785);
            dev.epro.r0.W7808703833045379622.J(dev.epro.r0.P2382941533350862833.h, m3727281027331139839, p3648740535677465818L);
            dev.epro.r0.W7808703833045379622.J(dev.epro.r0.P2382941533350862833.j, m3727281027331139839, java.lang.Integer.valueOf(iHashCode));
            dev.epro.r0.W7808703833045379622.H(m3727281027331139839);
            dev.epro.r0.W7808703833045379622.J(dev.epro.r0.P2382941533350862833.g, m3727281027331139839, i1722681268793429505N);
            dev.epro.r0.L11610354117192841236.s((i4 >> 6) & 14, l12639328004344855510, m3727281027331139839, true);
        } else {
            m3727281027331139839.U();
        }
        dev.epro.r0.V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new dev.epro.r0.T14793413619962821194(i1722681268793429505, l12639328004344855510, i2, (byte) 7);
        }
    }

    public static void c0(int i2, int i3, java.lang.Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    public static final void d(dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.D7996823394324996916 d7996823394324996916, dev.epro.r0.W1972671267364756056 w1972671267364756056, dev.epro.r0.G17854281415623469737 g17854281415623469737, dev.epro.r0.I5573661370475160895 i5573661370475160895, long j2, float f2, dev.epro.r0.T15443218846549482730 t15443218846549482730, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2) {
        m3727281027331139839.b0(848986741);
        int i3 = i2 | (m3727281027331139839.f(i1722681268793429505) ? 4 : 2) | (m3727281027331139839.f(d7996823394324996916) ? 32 : 16) | (m3727281027331139839.f(g17854281415623469737) ? 2048 : 1024) | (m3727281027331139839.f(i5573661370475160895) ? 16384 : 8192) | (m3727281027331139839.e(j2) ? 131072 : 65536) | (m3727281027331139839.c(0.0f) ? 1048576 : 524288) | (m3727281027331139839.c(f2) ? 8388608 : 4194304) | (m3727281027331139839.f((java.lang.Object) null) ? 67108864 : 33554432) | (m3727281027331139839.h(t15443218846549482730) ? 536870912 : 268435456);
        if (m3727281027331139839.R(i3 & 1, (i3 & 306783379) != 306783378)) {
            dev.epro.r0.W3656598099029166611 w3656598099029166611G = dev.epro.r0.V933048422416352811.G(d7996823394324996916, "DropDownMenu", m3727281027331139839, (((i3 >> 3) & 14) | 48) & 126);
            dev.epro.r0.M7102034154292440921 m7102034154292440921A0 = dev.epro.r0.J8045362843799184672.A0(dev.epro.r0.H12684780467384173668.b, m3727281027331139839);
            dev.epro.r0.M7102034154292440921 m7102034154292440921A02 = dev.epro.r0.J8045362843799184672.A0(dev.epro.r0.H12684780467384173668.d, m3727281027331139839);
            dev.epro.r0.O3410298526443296213 o3410298526443296213 = dev.epro.r0.D15913187640519482289.h;
            dev.epro.r0.L6855102173777462404 l6855102173777462404 = w3656598099029166611G.a;
            dev.epro.r0.V697849047308847220 v697849047308847220 = w3656598099029166611G.d;
            boolean zBooleanValue = ((java.lang.Boolean) l6855102173777462404.g()).booleanValue();
            m3727281027331139839.a0(143964305);
            float f3 = zBooleanValue ? 1.0f : 0.8f;
            m3727281027331139839.q(false);
            java.lang.Float fValueOf = java.lang.Float.valueOf(f3);
            boolean zBooleanValue2 = ((java.lang.Boolean) v697849047308847220.getValue()).booleanValue();
            m3727281027331139839.a0(143964305);
            float f4 = zBooleanValue2 ? 1.0f : 0.8f;
            m3727281027331139839.q(false);
            java.lang.Float fValueOf2 = java.lang.Float.valueOf(f4);
            w3656598099029166611G.f();
            m3727281027331139839.a0(-745957716);
            m3727281027331139839.q(false);
            boolean z = true;
            dev.epro.r0.O4957013336652243483 o4957013336652243483M = dev.epro.r0.V933048422416352811.m(w3656598099029166611G, fValueOf, fValueOf2, m7102034154292440921A0, o3410298526443296213, m3727281027331139839, 0);
            boolean zBooleanValue3 = ((java.lang.Boolean) w3656598099029166611G.a.g()).booleanValue();
            m3727281027331139839.a0(892761509);
            float f5 = zBooleanValue3 ? 1.0f : 0.0f;
            m3727281027331139839.q(false);
            java.lang.Float fValueOf3 = java.lang.Float.valueOf(f5);
            boolean zBooleanValue4 = ((java.lang.Boolean) v697849047308847220.getValue()).booleanValue();
            m3727281027331139839.a0(892761509);
            float f6 = zBooleanValue4 ? 1.0f : 0.0f;
            m3727281027331139839.q(false);
            java.lang.Float fValueOf4 = java.lang.Float.valueOf(f6);
            w3656598099029166611G.f();
            m3727281027331139839.a0(2839488);
            m3727281027331139839.q(false);
            dev.epro.r0.O4957013336652243483 o4957013336652243483M2 = dev.epro.r0.V933048422416352811.m(w3656598099029166611G, fValueOf3, fValueOf4, m7102034154292440921A02, o3410298526443296213, m3727281027331139839, 0);
            boolean zBooleanValue5 = ((java.lang.Boolean) m3727281027331139839.j(dev.epro.r0.S146220729136318558.a)).booleanValue();
            boolean zG = m3727281027331139839.g(zBooleanValue5) | m3727281027331139839.f(o4957013336652243483M);
            if ((i3 & 112) != 32) {
                z = false;
            }
            boolean zF = z | zG | m3727281027331139839.f(o4957013336652243483M2);
            java.lang.Object objM = m3727281027331139839.M();
            if (zF || objM == dev.epro.r0.O9023047933786425027.a) {
                dev.epro.r0.C8860366629087389742 c8860366629087389742 = new dev.epro.r0.C8860366629087389742(zBooleanValue5, d7996823394324996916, w1972671267364756056, o4957013336652243483M, o4957013336652243483M2);
                m3727281027331139839.k0(c8860366629087389742);
                objM = c8860366629087389742;
            }
            int i4 = i3 >> 9;
            int i5 = i3 >> 6;
            dev.epro.r0.X15668192874961033526.a(dev.epro.r0.M18113111391818111737.J(dev.epro.r0.V10993962107938880611.a, (dev.epro.r0.F4096073349764486348) objM), i5573661370475160895, j2, 0L, 0.0f, f2, (dev.epro.r0.U6155824110361579454) null, dev.epro.r0.S10823041268949770285.T(-1463404422, new dev.epro.r0.V8104000428493290582(i1722681268793429505, g17854281415623469737, t15443218846549482730, (byte) 4), m3727281027331139839), m3727281027331139839, (i4 & 896) | (i4 & 112) | 12582912 | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 8);
        } else {
            m3727281027331139839.U();
        }
        dev.epro.r0.V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new dev.epro.r0.Y17934734317078524398(i1722681268793429505, d7996823394324996916, w1972671267364756056, g17854281415623469737, i5573661370475160895, j2, f2, t15443218846549482730, i2);
        }
    }

    public static int d0(int i2) {
        int iMax = java.lang.Math.max(i2 + 1, 2);
        int iHighestOneBit = java.lang.Integer.highestOneBit(iMax);
        if (iMax > ((int) (1.0d * ((double) iHighestOneBit))) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
            iHighestOneBit = 1073741824;
        }
        return java.lang.Math.max(4, iHighestOneBit);
    }

    public static final void e(dev.epro.r0.L12639328004344855510 l12639328004344855510, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.L12639328004344855510 l126393280043448555102, boolean z, dev.epro.r0.W12365810355607269257 w12365810355607269257, dev.epro.r0.T1241271073913685060 t1241271073913685060, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        m3727281027331139839.b0(-1325192924);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.h(l12639328004344855510) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.h(b13729205492206812220) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= m3727281027331139839.f(i1722681268793429505) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= m3727281027331139839.h(l126393280043448555102) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= m3727281027331139839.h((java.lang.Object) null) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= m3727281027331139839.g(z) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= m3727281027331139839.f(w12365810355607269257) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= m3727281027331139839.f(t1241271073913685060) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= m3727281027331139839.f((java.lang.Object) null) ? 67108864 : 33554432;
        }
        if (m3727281027331139839.R(i3 & 1, (38347923 & i3) != 38347922)) {
            dev.epro.r0.I1722681268793429505 i1722681268793429505E0 = dev.epro.r0.Q13169198992966610970.e0(dev.epro.r0.V16747615581620678882.n(dev.epro.r0.O5354877807466160604.E(i1722681268793429505, (dev.epro.r0.S9385204271696540760) null, dev.epro.r0.M3862790495145116409.a(0.0f, 6, 0L, true), z, (dev.epro.r0.H10924029057425269323) null, b13729205492206812220, 24).Q0(dev.epro.r0.V16747615581620678882.a), 112.0f, 48.0f, 280.0f, 8), t1241271073913685060);
            dev.epro.r0.G8839996886126338788 g8839996886126338788A = dev.epro.r0.N12246959866253683127.a(dev.epro.r0.V1475975160983963926.a, dev.epro.r0.T13350664027331345869.l, m3727281027331139839, 48);
            int iA = dev.epro.r0.E12775674050813925581.A(m3727281027331139839);
            dev.epro.r0.P3648740535677465818 p3648740535677465818L = m3727281027331139839.l();
            dev.epro.r0.I1722681268793429505 i1722681268793429505N = dev.epro.r0.V12319504402545346730.N(m3727281027331139839, i1722681268793429505E0);
            dev.epro.r0.X4572652335386916693.Po.getClass();
            m3727281027331139839.d0();
            if (m3727281027331139839.S) {
                m3727281027331139839.k(dev.epro.r0.H11725168162114556860.S);
            } else {
                m3727281027331139839.n0();
            }
            dev.epro.r0.W7808703833045379622.J(dev.epro.r0.P2382941533350862833.i, m3727281027331139839, g8839996886126338788A);
            dev.epro.r0.W7808703833045379622.J(dev.epro.r0.P2382941533350862833.h, m3727281027331139839, p3648740535677465818L);
            dev.epro.r0.X4712621039624176170 x4712621039624176170 = dev.epro.r0.P2382941533350862833.j;
            if (m3727281027331139839.S || !dev.epro.r0.S10823041268949770285.t(m3727281027331139839.M(), java.lang.Integer.valueOf(iA))) {
                dev.epro.r0.L11610354117192841236.t(iA, m3727281027331139839, iA, x4712621039624176170);
            }
            dev.epro.r0.W7808703833045379622.J(dev.epro.r0.P2382941533350862833.g, m3727281027331139839, i1722681268793429505N);
            dev.epro.r0.F2465500022857960993.a(((dev.epro.r0.L10797789142392276788) m3727281027331139839.j(dev.epro.r0.V6937487778750555249.a)).m, dev.epro.r0.S10823041268949770285.T(865999929, new dev.epro.r0.L18035490183431705262(l126393280043448555102, w12365810355607269257, z, l12639328004344855510), m3727281027331139839), m3727281027331139839, 48);
            m3727281027331139839.q(true);
        } else {
            m3727281027331139839.U();
        }
        dev.epro.r0.V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new dev.epro.r0.G13316295172010118610(l12639328004344855510, b13729205492206812220, i1722681268793429505, l126393280043448555102, z, w12365810355607269257, t1241271073913685060, i2);
        }
    }

    public static final java.lang.Object[] e0(java.util.Collection collection) {
        collection.getClass();
        int size = collection.size();
        java.lang.Object[] objArr = c;
        if (size == 0) {
            return objArr;
        }
        java.util.Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        java.lang.Object[] objArrCopyOf = new java.lang.Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new java.lang.OutOfMemoryError();
                    }
                }
                objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, i4);
            } else if (!it.hasNext()) {
                return java.util.Arrays.copyOf(objArrCopyOf, i3);
            }
            i2 = i3;
        }
    }

    public static final void f(dev.epro.r0.R14289894334981469490 r14289894334981469490, dev.epro.r0.V4145611664959724223 v4145611664959724223, dev.epro.r0.T15443218846549482730 t15443218846549482730, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2) {
        m3727281027331139839.b0(233973821);
        int i3 = (m3727281027331139839.h(r14289894334981469490) ? 4 : 2) | i2 | (m3727281027331139839.h(v4145611664959724223) ? 32 : 16);
        if (m3727281027331139839.R(i3 & 1, (i3 & 147) != 146)) {
            dev.epro.r0.D1286559660607336098.b(new dev.epro.r0.P11507981277033739248[]{dev.epro.r0.E2450128541048067988.a.a(r14289894334981469490), dev.epro.r0.G7911722858908282497.a.a(r14289894334981469490), dev.epro.r0.M472386255662143721.a.a(r14289894334981469490)}, dev.epro.r0.S10823041268949770285.T(1808964477, new dev.epro.r0.C833917354866129315(v4145611664959724223, r14289894334981469490, t15443218846549482730), m3727281027331139839), m3727281027331139839, 56);
        } else {
            m3727281027331139839.U();
        }
        dev.epro.r0.V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new dev.epro.r0.C833917354866129315(r14289894334981469490, v4145611664959724223, t15443218846549482730, i2);
        }
    }

    public static final java.lang.Object[] f0(java.util.Collection collection, java.lang.Object[] objArr) {
        java.lang.Object[] objArrCopyOf;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            java.util.Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (java.lang.Object[]) objNewInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new java.lang.OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, i4);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return java.util.Arrays.copyOf(objArrCopyOf, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final native void g(android.content.Context context, dev.epro.r0.D16513696335383100591 d16513696335383100591, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.F4096073349764486348 f40960733497644863482, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.F4096073349764486348 f40960733497644863483, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final java.lang.String g0(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.Object c10696704014433963524;
        if (r4833348786910499294 instanceof dev.epro.r0.N16152488056535110728) {
            return ((dev.epro.r0.N16152488056535110728) r4833348786910499294).toString();
        }
        try {
            c10696704014433963524 = r4833348786910499294 + '@' + I(r4833348786910499294);
        } catch (java.lang.Throwable th) {
            c10696704014433963524 = new dev.epro.r0.C10696704014433963524(th);
        }
        if (dev.epro.r0.I11772848013184437928.a(c10696704014433963524) != null) {
            c10696704014433963524 = r4833348786910499294.getClass().getName() + '@' + I(r4833348786910499294);
        }
        return (java.lang.String) c10696704014433963524;
    }

    public static final native void h(int i2, dev.epro.r0.M3727281027331139839 m3727281027331139839);

    public static final native dev.epro.r0.R2590639056571640352 h0(dev.epro.r0.R2590639056571640352 r2590639056571640352, dev.epro.r0.S5131558922358224965 s5131558922358224965, dev.epro.r0.T13614432975881747224 t13614432975881747224, java.lang.String str);

    public static final native void i(java.lang.String str, boolean z, boolean z2, boolean z3, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native dev.epro.r0.Z12230432157744414222 i0(dev.epro.r0.Z12230432157744414222 z12230432157744414222, dev.epro.r0.Y11103388702254586570 y11103388702254586570);

    public static final native void j(boolean z, java.util.Set set, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native dev.epro.r0.A16842337154698931828 j0(dev.epro.r0.A16842337154698931828 a16842337154698931828, dev.epro.r0.Y11103388702254586570 y11103388702254586570);

    public static final native void k(dev.epro.r0.X11638668447546090163 x11638668447546090163, java.lang.String str, java.util.Set set, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.F4096073349764486348 f40960733497644863482, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native dev.epro.r0.H9594781759364688001 k0(dev.epro.r0.H9594781759364688001 h9594781759364688001, dev.epro.r0.Y11103388702254586570 y11103388702254586570);

    public static final native void l(dev.epro.r0.O42784603342561125 o42784603342561125, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native dev.epro.r0.Q7430090668634766253 l0(dev.epro.r0.Q7430090668634766253 q7430090668634766253, dev.epro.r0.Y11103388702254586570 y11103388702254586570);

    public static final void m(dev.epro.r0.V4145611664959724223 v4145611664959724223, dev.epro.r0.T15443218846549482730 t15443218846549482730, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2) {
        m3727281027331139839.b0(832919318);
        int i3 = (m3727281027331139839.h(v4145611664959724223) ? 4 : 2) | i2;
        if (m3727281027331139839.R(i3 & 1, (i3 & 19) != 18)) {
            java.lang.Object objM = m3727281027331139839.M();
            if (objM == dev.epro.r0.O9023047933786425027.a) {
                objM = new dev.epro.r0.P16607035664026122700((byte) 19);
                m3727281027331139839.k0(objM);
            }
            dev.epro.r0.F4096073349764486348 f4096073349764486348 = (dev.epro.r0.F4096073349764486348) objM;
            dev.epro.r0.J5715778638296486773 j5715778638296486773A = dev.epro.r0.E2450128541048067988.a(m3727281027331139839);
            if (j5715778638296486773A == null) {
                dev.epro.r0.S10973172697741180971.m("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            dev.epro.r0.V6281043481934004271 v6281043481934004271A = dev.epro.r0.J17975719213314763068.a(dev.epro.r0.Q12218207363801806011.class);
            dev.epro.r0.S11323950170556863336 s11323950170556863336 = new dev.epro.r0.S11323950170556863336((byte) 1);
            s11323950170556863336.a(dev.epro.r0.J17975719213314763068.a(dev.epro.r0.Q12218207363801806011.class), f4096073349764486348);
            dev.epro.r0.Q12218207363801806011 q12218207363801806011L = dev.epro.r0.P1789376955961125859.l(v6281043481934004271A, j5715778638296486773A, s11323950170556863336.c(), dev.epro.r0.S12227320117525376577.p(j5715778638296486773A), m3727281027331139839);
            q12218207363801806011L.c = new dev.epro.r0.J1604157424733740866(v4145611664959724223);
            v4145611664959724223.a(q12218207363801806011L.b, t15443218846549482730, m3727281027331139839, ((i3 << 6) & 896) | 48);
        } else {
            m3727281027331139839.U();
        }
        dev.epro.r0.V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new dev.epro.r0.B1246560328695757114(v4145611664959724223, t15443218846549482730, i2, (byte) 17);
        }
    }

    public static final native void n(boolean z, java.lang.String str, java.lang.String str2, boolean z2, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.F4096073349764486348 f40960733497644863482, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void o(dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.B13729205492206812220 b137292054922068122202, dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void p(dev.epro.r0.J11701987730295342092 j11701987730295342092, boolean z, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void q(int i2, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.M3727281027331139839 m3727281027331139839, dev.epro.r0.I1722681268793429505 i1722681268793429505, java.lang.String str);

    public static final native void r(dev.epro.r0.E17523205116624666034 e17523205116624666034, dev.epro.r0.I1722681268793429505 i1722681268793429505, float f2, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static void s(dev.epro.r0.D2456187031834883815 d2456187031834883815, dev.epro.r0.D2456187031834883815 d24561870318348838152, dev.epro.r0.E1517907155487775131 e1517907155487775131) {
        long[] jArr = new long[10];
        dev.epro.r0.Q7316561721656982910 q7316561721656982910 = d2456187031834883815.a;
        long[] jArr2 = (long[]) q7316561721656982910.b;
        dev.epro.r0.Q7316561721656982910 q73165617216569829102 = d24561870318348838152.a;
        dev.epro.r0.O4077903568229246.T(jArr2, (long[]) q73165617216569829102.c, (long[]) q73165617216569829102.b);
        long[] jArr3 = (long[]) q7316561721656982910.c;
        dev.epro.r0.O4077903568229246.S(jArr3, (long[]) q73165617216569829102.c, (long[]) q73165617216569829102.b);
        dev.epro.r0.O4077903568229246.E(jArr3, jArr3, e1517907155487775131.b);
        long[] jArr4 = (long[]) q7316561721656982910.d;
        long[] jArr5 = (long[]) q7316561721656982910.b;
        dev.epro.r0.O4077903568229246.E(jArr4, jArr5, e1517907155487775131.a);
        long[] jArr6 = d2456187031834883815.b;
        dev.epro.r0.O4077903568229246.E(jArr6, d24561870318348838152.b, e1517907155487775131.c);
        e1517907155487775131.b(jArr5, (long[]) q73165617216569829102.d);
        dev.epro.r0.O4077903568229246.T(jArr, jArr5, jArr5);
        dev.epro.r0.O4077903568229246.S(jArr5, jArr4, jArr3);
        dev.epro.r0.O4077903568229246.T(jArr3, jArr4, jArr3);
        dev.epro.r0.O4077903568229246.T(jArr4, jArr, jArr6);
        dev.epro.r0.O4077903568229246.S(jArr6, jArr, jArr6);
    }

    public static dev.epro.r0.I1722681268793429505 t(dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.F9886074403848142923 f9886074403848142923, boolean z, boolean z2) {
        return i1722681268793429505.Q0(new dev.epro.r0.E13235531759824730377(f9886074403848142923, z2, java.lang.Boolean.valueOf(z)));
    }

    public static final java.lang.Object u(dev.epro.r0.F9886074403848142923 f9886074403848142923, float f2, dev.epro.r0.F18142507606280211225 f18142507606280211225, dev.epro.r0.V4351601219763732262 v4351601219763732262, java.lang.Object obj, dev.epro.r0.M15459437176959963354 m15459437176959963354, dev.epro.r0.Z15098663524054267378 z15098663524054267378) {
        java.lang.Object objK;
        float fC = v4351601219763732262.c(obj);
        dev.epro.r0.A81664135048468380 a81664135048468380 = new dev.epro.r0.A81664135048468380();
        a81664135048468380.a = java.lang.Float.isNaN(f9886074403848142923.f.g()) ? 0.0f : f9886074403848142923.f.g();
        if (!java.lang.Float.isNaN(fC)) {
            float f3 = a81664135048468380.a;
            if (f3 != fC && (objK = dev.epro.r0.M17147082063200071302.k(f3, fC, f2, m15459437176959963354, new dev.epro.r0.X5076676067399127345(f18142507606280211225, a81664135048468380, (byte) 0), z15098663524054267378)) == dev.epro.r0.Z3437138737604933638.a) {
                return objK;
            }
        }
        return dev.epro.r0.O9245300239821758723.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(dev.epro.r0.F9886074403848142923 r10, java.lang.Object r11, float r12, dev.epro.r0.M15459437176959963354 r13, dev.epro.r0.X14364139104409853146 r14, dev.epro.r0.K14749510448791472029 r15) {
        /*
            boolean r0 = r15 instanceof dev.epro.r0.P939447604353450941
            if (r0 == 0) goto L13
            r0 = r15
            dev.epro.r0.P939447604353450941 r0 = (dev.epro.r0.P939447604353450941) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            dev.epro.r0.P939447604353450941 r0 = new dev.epro.r0.P939447604353450941
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.v
            int r1 = r0.w
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            float r12 = r0.t
            dev.epro.r0.A81664135048468380 r10 = r0.u
            dev.epro.r0.E17665849472693074628.k(r15)
            goto L57
        L29:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r10)
            r10 = 0
            return r10
        L30:
            dev.epro.r0.E17665849472693074628.k(r15)
            dev.epro.r0.A81664135048468380 r7 = new dev.epro.r0.A81664135048468380
            r7.<init>()
            r7.a = r12
            dev.epro.r0.Z15098663524054267378 r3 = new dev.epro.r0.Z15098663524054267378
            r9 = 0
            r4 = r10
            r5 = r12
            r6 = r13
            r8 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.u = r7
            r0.t = r5
            r0.w = r2
            dev.epro.r0.D6414970586266598845 r10 = dev.epro.r0.D6414970586266598845.a
            java.lang.Object r10 = r4.b(r11, r10, r3, r0)
            dev.epro.r0.Z3437138737604933638 r11 = dev.epro.r0.Z3437138737604933638.a
            if (r10 != r11) goto L55
            return r11
        L55:
            r12 = r5
            r10 = r7
        L57:
            float r10 = r10.a
            float r12 = r12 - r10
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r12)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D15445857918358799638.v(dev.epro.r0.F9886074403848142923, java.lang.Object, float, dev.epro.r0.M15459437176959963354, dev.epro.r0.X14364139104409853146, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public static java.lang.Object w(dev.epro.r0.F9886074403848142923 f9886074403848142923, java.lang.Object obj, float f2, dev.epro.r0.K1156020009529999285 k1156020009529999285) {
        dev.epro.r0.M15459437176959963354 m15459437176959963354;
        dev.epro.r0.X14364139104409853146 x14364139104409853146;
        if (f9886074403848142923.f()) {
            m15459437176959963354 = (dev.epro.r0.M15459437176959963354) f9886074403848142923.k;
            if (m15459437176959963354 == null) {
                dev.epro.r0.S10823041268949770285.b0("snapAnimationSpec");
                throw null;
            }
        } else {
            m15459437176959963354 = dev.epro.r0.V15080374573826814248.a;
        }
        dev.epro.r0.M15459437176959963354 m154594371769599633542 = m15459437176959963354;
        if (f9886074403848142923.f()) {
            x14364139104409853146 = (dev.epro.r0.X14364139104409853146) f9886074403848142923.l;
            if (x14364139104409853146 == null) {
                dev.epro.r0.S10823041268949770285.b0("decayAnimationSpec");
                throw null;
            }
        } else {
            x14364139104409853146 = dev.epro.r0.V15080374573826814248.c;
        }
        return v(f9886074403848142923, obj, f2, m154594371769599633542, x14364139104409853146, k1156020009529999285);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long x(dev.epro.r0.I11366018238968599357 r11, dev.epro.r0.I11366018238968599357 r12) {
        /*
            int r0 = r12.a
            int r1 = r12.d
            int r2 = r12.a
            int r3 = r12.c
            int r4 = r12.b
            int r5 = r11.c
            int r6 = r11.b
            int r7 = r11.d
            int r8 = r11.a
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            if (r0 < r5) goto L19
        L17:
            r11 = r10
            goto L39
        L19:
            if (r3 > r8) goto L1d
            r11 = r9
            goto L39
        L1d:
            int r0 = r12.d()
            if (r0 != 0) goto L24
            goto L17
        L24:
            int r0 = java.lang.Math.max(r8, r2)
            int r11 = r11.c
            int r11 = java.lang.Math.min(r11, r3)
            int r11 = r11 + r0
            int r11 = r11 / 2
            int r11 = r11 - r2
            float r11 = (float) r11
            int r0 = r12.d()
            float r0 = (float) r0
            float r11 = r11 / r0
        L39:
            if (r4 < r7) goto L3d
        L3b:
            r9 = r10
            goto L5b
        L3d:
            if (r1 > r6) goto L40
            goto L5b
        L40:
            int r0 = r12.b()
            if (r0 != 0) goto L47
            goto L3b
        L47:
            int r0 = java.lang.Math.max(r6, r4)
            int r1 = java.lang.Math.min(r7, r1)
            int r1 = r1 + r0
            int r1 = r1 / 2
            int r1 = r1 - r4
            float r0 = (float) r1
            int r12 = r12.b()
            float r12 = (float) r12
            float r9 = r0 / r12
        L5b:
            long r11 = dev.epro.r0.L12240044716294895599.c(r11, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D15445857918358799638.x(dev.epro.r0.I11366018238968599357, dev.epro.r0.I11366018238968599357):long");
    }

    public static final void y(androidx.work.impl.WorkDatabase workDatabase, dev.epro.r0.W1977247516027959386 w1977247516027959386, dev.epro.r0.B9934915652113529982 b9934915652113529982) {
        int i2;
        workDatabase.getClass();
        w1977247516027959386.getClass();
        java.util.ArrayList arrayListX = dev.epro.r0.K5751602218013079365.X(new dev.epro.r0.B9934915652113529982[]{b9934915652113529982});
        int i3 = 0;
        while (!arrayListX.isEmpty()) {
            java.util.List list = ((dev.epro.r0.B9934915652113529982) dev.epro.r0.P17571903987102865660.r0(arrayListX)).b;
            if (list.isEmpty()) {
                i2 = 0;
            } else {
                java.util.Iterator it = list.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (!((dev.epro.r0.M10089736868580320414) it.next()).b.j.i.isEmpty() && (i2 = i2 + 1) < 0) {
                        dev.epro.r0.K5751602218013079365.e0();
                        throw null;
                    }
                }
            }
            i3 += i2;
        }
        if (i3 == 0) {
            return;
        }
        int iIntValue = ((java.lang.Number) dev.epro.r0.G16660188620551127941.E(workDatabase.x().a, true, false, new dev.epro.r0.A11054869418321976017((byte) 6))).intValue();
        if (iIntValue + i3 <= 8) {
            return;
        }
        dev.epro.r0.S10973172697741180971.j(dev.epro.r0.G11450220448113054352.h(iIntValue, i3, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: 8;\nalready enqueued count: ", ";\ncurrent enqueue operation count: ", ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(dev.epro.r0.V4351601219763732262 r6, float r7, float r8, dev.epro.r0.F4096073349764486348 r9, dev.epro.r0.B13729205492206812220 r10) {
        /*
            boolean r0 = java.lang.Float.isNaN(r7)
            r1 = 0
            if (r0 != 0) goto L91
            float r0 = java.lang.Math.abs(r8)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r0 <= 0) goto L14
            r0 = r4
            goto L15
        L14:
            r0 = r3
        L15:
            if (r0 == 0) goto L1d
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1d
            r2 = r4
            goto L1e
        L1d:
            r2 = r3
        L1e:
            if (r0 != 0) goto L28
            java.lang.Object r6 = r6.a(r7)
            r6.getClass()
            return r6
        L28:
            float r8 = java.lang.Math.abs(r8)
            java.lang.Object r10 = r10.invoke()
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            float r10 = java.lang.Math.abs(r10)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto L46
            java.lang.Object r6 = r6.b(r7, r2)
            r6.getClass()
            return r6
        L46:
            java.lang.Object r8 = r6.b(r7, r3)
            r8.getClass()
            float r10 = r6.c(r8)
            java.lang.Object r0 = r6.b(r7, r4)
            r0.getClass()
            float r6 = r6.c(r0)
            float r5 = r10 - r6
            float r5 = java.lang.Math.abs(r5)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Object r9 = r9.invoke(r5)
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            float r9 = java.lang.Math.abs(r9)
            if (r2 == 0) goto L77
            goto L78
        L77:
            r10 = r6
        L78:
            float r10 = r10 - r7
            float r6 = java.lang.Math.abs(r10)
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 < 0) goto L82
            r3 = r4
        L82:
            if (r3 != r4) goto L87
            if (r2 == 0) goto L8b
            goto L8c
        L87:
            if (r3 != 0) goto L8d
            if (r2 == 0) goto L8c
        L8b:
            return r8
        L8c:
            return r0
        L8d:
            dev.epro.r0.Z3383101362411723454.g()
            return r1
        L91:
            java.lang.String r6 = "The offset provided to computeTarget must not be NaN."
            dev.epro.r0.S10973172697741180971.j(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D15445857918358799638.z(dev.epro.r0.V4351601219763732262, float, float, dev.epro.r0.F4096073349764486348, dev.epro.r0.B13729205492206812220):java.lang.Object");
    }

    static {
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(250);
        a = new dev.epro.r0.M14716691558468128220((byte) 9);
        b = new dev.epro.r0.X14364139104409853146(new dev.epro.r0.M10846389789027735899((byte) 0));
        c = new java.lang.Object[0];
        d = new dev.epro.r0.E1517907155487775131(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        e = new dev.epro.r0.D2456187031834883815(new dev.epro.r0.Q7316561721656982910(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, (byte) 19), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        f = new byte[]{-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};
        dev.epro.r0.Y4261039727803185691 y4261039727803185691 = dev.epro.r0.Y4261039727803185691.i;
        g = y4261039727803185691;
        h = 0.38f;
        i = y4261039727803185691;
        j = dev.epro.r0.Y4261039727803185691.l;
        k = new dev.epro.r0.P10283164515565247229(1022);
        l = new dev.epro.r0.Z14997871575210439922((byte) 7);
        m = new dev.epro.r0.O12545633033254628644((byte) 16);
    }
}
