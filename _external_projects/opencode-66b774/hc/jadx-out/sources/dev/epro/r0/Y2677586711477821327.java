package dev.epro.r0;

import ads_mobile_sdk.dw0;
import ads_mobile_sdk.wg2;
import ads_mobile_sdk.yw;
import android.content.Context;
import androidx.webkit.WebViewStartUpResult;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class Y2677586711477821327 implements L9201360080215238538, WebViewStartUpResult, P6802326504044700406, B4259731004323267459, J15525459402216671908, P3831136427564699233 {
    public final /* synthetic */ byte a;

    public Y2677586711477821327(Z6787503239643758223 z6787503239643758223) {
        this.a = (byte) 7;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static K5454855350570310837 c(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return K5454855350570310837.e;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return K5454855350570310837.d;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return K5454855350570310837.c;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return K5454855350570310837.f;
            }
        } else if (str.equals("SSLv3")) {
            return K5454855350570310837.g;
        }
        S10973172697741180971.j("Unexpected TLS version: ".concat(str));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043 A[RETURN] */
    @Override // dev.epro.r0.L9201360080215238538
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            dev.epro.r0.H914524984241725581 r4 = (dev.epro.r0.H914524984241725581) r4
            dev.epro.r0.H914524984241725581 r5 = (dev.epro.r0.H914524984241725581) r5
            r3 = 0
            r0 = 1
            if (r4 == 0) goto L35
            if (r5 == 0) goto L35
            float r1 = r4.e
            float r2 = r5.e
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L43
            float r1 = r4.f
            float r2 = r5.f
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L43
            dev.epro.r0.F10342546226345611902 r1 = r4.b
            dev.epro.r0.F10342546226345611902 r2 = r5.b
            if (r1 != r2) goto L43
            dev.epro.r0.U14340554418656580554 r1 = r4.c
            dev.epro.r0.U14340554418656580554 r2 = r5.c
            boolean r1 = dev.epro.r0.S10823041268949770285.t(r1, r2)
            if (r1 == 0) goto L43
            long r1 = r4.d
            long r4 = r5.d
            boolean r4 = dev.epro.r0.I16980768508151520658.c(r1, r4)
            if (r4 == 0) goto L43
            goto L42
        L35:
            if (r4 != 0) goto L39
            r4 = r0
            goto L3a
        L39:
            r4 = r3
        L3a:
            if (r5 != 0) goto L3e
            r5 = r0
            goto L3f
        L3e:
            r5 = r3
        L3f:
            r4 = r4 ^ r5
            if (r4 != 0) goto L43
        L42:
            return r0
        L43:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Y2677586711477821327.a(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // dev.epro.r0.P3831136427564699233
    public byte[] b(int i, byte[] bArr, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public boolean d(CharSequence charSequence) {
        return false;
    }

    public F14744793426222135532 e(Context context, V13679327994991375447 v13679327994991375447) {
        F14744793426222135532 f14744793426222135532 = new F14744793426222135532();
        f14744793426222135532.a = 0;
        f14744793426222135532.b = 0;
        f14744793426222135532.c = 0;
        int iC = v13679327994991375447.c(context, true);
        f14744793426222135532.b = iC;
        if (iC != 0) {
            f14744793426222135532.c = 1;
            return f14744793426222135532;
        }
        int iA = v13679327994991375447.a(context);
        f14744793426222135532.a = iA;
        if (iA != 0) {
            f14744793426222135532.c = -1;
        }
        return f14744793426222135532;
    }

    @Override // androidx.webkit.WebViewStartUpResult
    public Long getMaxTimePerTaskInUiThreadMillis() {
        return null;
    }

    @Override // androidx.webkit.WebViewStartUpResult
    public List getNonUiThreadBlockingStartUpLocations() {
        return null;
    }

    @Override // androidx.webkit.WebViewStartUpResult
    public Long getTotalTimeInUiThreadMillis() {
        return null;
    }

    @Override // androidx.webkit.WebViewStartUpResult
    public List getUiThreadBlockingStartUpLocations() {
        return null;
    }

    public /* synthetic */ Y2677586711477821327(byte b) {
        this.a = b;
    }

    public Y2677586711477821327(W5605385477019102368 w5605385477019102368, int i) {
        this.a = (byte) 6;
    }

    @Override // dev.epro.r0.B4259731004323267459
    public Object a(int i) {
        switch (this.a) {
            case 8:
                wg2 wg2VarA = wg2.a(i);
                return wg2VarA == null ? wg2.USER_POPULATION_UNSPECIFIED : wg2VarA;
            case 13:
                dw0 dw0Var = i != 0 ? null : dw0.TAG_UNKNOWN;
                return dw0Var == null ? dw0.UNRECOGNIZED : dw0Var;
            default:
                yw ywVarA = yw.a(i);
                return ywVarA == null ? yw.UNRECOGNIZED : ywVarA;
        }
    }

    @Override // dev.epro.r0.P6802326504044700406
    public Object a() {
        return new U11450443558875589191((byte) 7);
    }
}
