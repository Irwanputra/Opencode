package dev.epro.r0;

import ads_mobile_sdk.y1;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class I3887072968740112330 {
    public static final V10933700885381486763 A;
    public static final Y4261039727803185691 B;
    public static final float C;
    public static final float D;
    public static final Y4261039727803185691 E;
    public static final float F;
    public static final Y4261039727803185691 G;
    public static final float H;
    public static final Y4261039727803185691 I;
    public static final float J;
    public static final Y4261039727803185691 K;
    public static final float L;
    public static final D4961612090878789022 M;
    public static final Y4261039727803185691 N;
    public static final Y4261039727803185691 O;
    public static final float P;
    public static final Y4261039727803185691 Q;
    public static final float R;
    public static final Y4261039727803185691 S;
    public static final Y4261039727803185691 T;
    public static final Y4261039727803185691 U;
    public static final float V;
    public static final Y4261039727803185691 W;
    public static final Y4261039727803185691 X;
    public static final byte[] Y;
    public static final byte[] Z;
    public static final V10300877997588547986 a0;
    public static final Z14997871575210439922 b0;
    public static Z7022156542152740569 c0;
    public static final V10933700885381486763 d;
    public static Z7022156542152740569 d0;
    public static final Y4261039727803185691 j;
    public static final float k;
    public static final float l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Y4261039727803185691 f292o;
    public static final float p;
    public static final Y4261039727803185691 q;
    public static final float r;
    public static final Y4261039727803185691 s;
    public static final D4961612090878789022 t;
    public static final Y4261039727803185691 u;
    public static final float v;
    public static final Y4261039727803185691 w;
    public static final int[] x;
    public static final long[] y;
    public static final Object[] z;

    public static final long A(long j2) {
        return (((j2 << 32) >> 33) & 4294967295L) | ((j2 >> 33) << 32);
    }

    public static final boolean B(N13196868278329319633 n13196868278329319633, long j2, long j3) {
        int i = n13196868278329319633.i == 1 ? 1 : 0;
        long j4 = n13196868278329319633.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32)) * f;
        float f2 = ((int) (j2 >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j2 & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final I1722681268793429505 C(I1722681268793429505 i1722681268793429505, J12078565427869724451 j12078565427869724451) {
        return i1722681268793429505.Q0(new G15695671338464229824(j12078565427869724451));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void D(R15896830329318850690 r15896830329318850690, B13729205492206812220 b13729205492206812220) {
        F9846267855282604745 f9846267855282604745 = r15896830329318850690.g;
        if (f9846267855282604745 == null) {
            f9846267855282604745 = new F9846267855282604745((C12172695433110393112) r15896830329318850690);
            r15896830329318850690.g = f9846267855282604745;
        }
        B4499109999593241705 snapshotObserver = ((S7974369370986781936) R7033599853981556291.S(r15896830329318850690)).getSnapshotObserver();
        snapshotObserver.a.d(f9846267855282604745, F9846267855282604745.b, b13729205492206812220);
    }

    public static final int E(V2435767323669307206 v2435767323669307206, R7000310675073492254 r7000310675073492254) {
        return (int) (r7000310675073492254 == R7000310675073492254.a ? v2435767323669307206.w & 4294967295L : v2435767323669307206.w >> 32);
    }

    public static void F(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final long G(N13196868278329319633 n13196868278329319633, boolean z2) {
        long jE = L2216691091636065972.e(n13196868278329319633.c, n13196868278329319633.g);
        if (z2 || !n13196868278329319633.c()) {
            return jE;
        }
        return 0L;
    }

    public static E13661095186259607145 H(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j2;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            Q11088980322693754445.h("Cannot read metadata.");
            return null;
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j2 = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j2 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j2 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j3; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j4 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j4 + j2));
                    E13661095186259607145 e13661095186259607145 = new E13661095186259607145();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    e13661095186259607145.d = byteBufferDuplicate;
                    e13661095186259607145.a = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    e13661095186259607145.b = i6;
                    e13661095186259607145.c = ((ByteBuffer) e13661095186259607145.d).getShort(i6);
                    return e13661095186259607145;
                }
            }
        }
        Q11088980322693754445.h("Cannot read metadata.");
        return null;
    }

    public static int[] I(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iN = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iN += (int) A10225670138084435446.N(byteArrayInputStream, 2);
            iArr[i2] = iN;
        }
        return iArr;
    }

    public static V12242721515760750181[] J(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, V12242721515760750181[] v12242721515760750181Arr) throws IOException {
        byte[] bArr3 = M9216324016624295870.i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, M9216324016624295870.j)) {
                S10973172697741180971.m("Unsupported meta version");
                return null;
            }
            int iN = (int) A10225670138084435446.N(fileInputStream, 2);
            byte[] bArrM = A10225670138084435446.M(fileInputStream, (int) A10225670138084435446.N(fileInputStream, 4), (int) A10225670138084435446.N(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                S10973172697741180971.m("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM);
            try {
                V12242721515760750181[] v12242721515760750181ArrL = L(byteArrayInputStream, bArr2, iN, v12242721515760750181Arr);
                byteArrayInputStream.close();
                return v12242721515760750181ArrL;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(M9216324016624295870.d, bArr2)) {
            S10973172697741180971.m("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            S10973172697741180971.m("Unsupported meta version");
            return null;
        }
        int iN2 = (int) A10225670138084435446.N(fileInputStream, 1);
        byte[] bArrM2 = A10225670138084435446.M(fileInputStream, (int) A10225670138084435446.N(fileInputStream, 4), (int) A10225670138084435446.N(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            S10973172697741180971.m("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM2);
        try {
            V12242721515760750181[] v12242721515760750181ArrK = K(byteArrayInputStream2, iN2, v12242721515760750181Arr);
            byteArrayInputStream2.close();
            return v12242721515760750181ArrK;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static V12242721515760750181[] K(ByteArrayInputStream byteArrayInputStream, int i, V12242721515760750181[] v12242721515760750181Arr) {
        if (byteArrayInputStream.available() == 0) {
            return new V12242721515760750181[0];
        }
        if (i != v12242721515760750181Arr.length) {
            S10973172697741180971.m("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iN = (int) A10225670138084435446.N(byteArrayInputStream, 2);
            iArr[i2] = (int) A10225670138084435446.N(byteArrayInputStream, 2);
            strArr[i2] = new String(A10225670138084435446.I(byteArrayInputStream, iN), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            V12242721515760750181 v12242721515760750181 = v12242721515760750181Arr[i3];
            if (!v12242721515760750181.b.equals(strArr[i3])) {
                S10973172697741180971.m("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            v12242721515760750181.e = i4;
            v12242721515760750181.h = I(byteArrayInputStream, i4);
        }
        return v12242721515760750181Arr;
    }

    public static V12242721515760750181[] L(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, V12242721515760750181[] v12242721515760750181Arr) {
        V12242721515760750181 v12242721515760750181;
        if (byteArrayInputStream.available() == 0) {
            return new V12242721515760750181[0];
        }
        if (i != v12242721515760750181Arr.length) {
            S10973172697741180971.m("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            A10225670138084435446.N(byteArrayInputStream, 2);
            String str = new String(A10225670138084435446.I(byteArrayInputStream, (int) A10225670138084435446.N(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jN = A10225670138084435446.N(byteArrayInputStream, 4);
            int iN = (int) A10225670138084435446.N(byteArrayInputStream, 2);
            if (v12242721515760750181Arr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i3 = 0; i3 < v12242721515760750181Arr.length; i3++) {
                    if (v12242721515760750181Arr[i3].b.equals(strSubstring)) {
                        v12242721515760750181 = v12242721515760750181Arr[i3];
                        break;
                    }
                }
                v12242721515760750181 = null;
            } else {
                v12242721515760750181 = null;
            }
            if (v12242721515760750181 == null) {
                S10973172697741180971.m("Missing profile key: ".concat(str));
                return null;
            }
            v12242721515760750181.d = jN;
            int[] iArrI = I(byteArrayInputStream, iN);
            if (Arrays.equals(bArr, M9216324016624295870.h)) {
                v12242721515760750181.e = iN;
                v12242721515760750181.h = iArrI;
            }
        }
        return v12242721515760750181Arr;
    }

    public static V12242721515760750181[] M(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, M9216324016624295870.e)) {
            S10973172697741180971.m("Unsupported version");
            return null;
        }
        int iN = (int) A10225670138084435446.N(fileInputStream, 1);
        byte[] bArrM = A10225670138084435446.M(fileInputStream, (int) A10225670138084435446.N(fileInputStream, 4), (int) A10225670138084435446.N(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            S10973172697741180971.m("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM);
        try {
            V12242721515760750181[] v12242721515760750181ArrN = N(byteArrayInputStream, str, iN);
            byteArrayInputStream.close();
            return v12242721515760750181ArrN;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static V12242721515760750181[] N(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new V12242721515760750181[0];
        }
        V12242721515760750181[] v12242721515760750181Arr = new V12242721515760750181[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iN = (int) A10225670138084435446.N(byteArrayInputStream, 2);
            int iN2 = (int) A10225670138084435446.N(byteArrayInputStream, 2);
            v12242721515760750181Arr[i3] = new V12242721515760750181(str, new String(A10225670138084435446.I(byteArrayInputStream, iN), StandardCharsets.UTF_8), A10225670138084435446.N(byteArrayInputStream, 4), iN2, (int) A10225670138084435446.N(byteArrayInputStream, 4), (int) A10225670138084435446.N(byteArrayInputStream, 4), new int[iN2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            V12242721515760750181 v12242721515760750181 = v12242721515760750181Arr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = v12242721515760750181.f;
            int i6 = v12242721515760750181.g;
            TreeMap treeMap = v12242721515760750181.i;
            int i7 = iAvailable - i5;
            int iN3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iN3 += (int) A10225670138084435446.N(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iN3), 1);
                int iN4 = (int) A10225670138084435446.N(byteArrayInputStream, 2);
                while (iN4 > 0) {
                    A10225670138084435446.N(byteArrayInputStream, 2);
                    int iN5 = (int) A10225670138084435446.N(byteArrayInputStream, 1);
                    if (iN5 != 6 && iN5 != 7) {
                        while (iN5 > 0) {
                            A10225670138084435446.N(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iN6 = (int) A10225670138084435446.N(byteArrayInputStream, 1); iN6 > 0; iN6--) {
                                A10225670138084435446.N(byteArrayInputStream, 2);
                            }
                            iN5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iN4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                S10973172697741180971.m("Read too much data during profile line parse");
                return null;
            }
            v12242721515760750181.h = I(byteArrayInputStream, v12242721515760750181.e);
            BitSet bitSetValueOf = BitSet.valueOf(A10225670138084435446.I(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return v12242721515760750181Arr;
    }

    public static final native void O(L13135072960070674001 l13135072960070674001, Z12230432157744414222 z12230432157744414222);

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5 A[PHI: r0
      0x00a5: PHI (r0v11 int) = (r0v5 int), (r0v6 int), (r0v7 int), (r0v8 int) binds: [B:54:0x00a3, B:57:0x00a8, B:60:0x00ac, B:63:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P(dev.epro.r0.J9638579967056948799 r10, int r11, dev.epro.r0.F4096073349764486348 r12) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I3887072968740112330.P(dev.epro.r0.J9638579967056948799, int, dev.epro.r0.F4096073349764486348):java.lang.Object");
    }

    public static final long Q(long j2) {
        return (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
    }

    /* JADX WARN: Finally extract failed */
    public static boolean R(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, V12242721515760750181[] v12242721515760750181Arr) throws IOException {
        int i;
        int i2;
        int length;
        byte[] bArr2 = M9216324016624295870.h;
        byte[] bArr3 = M9216324016624295870.g;
        byte[] bArr4 = M9216324016624295870.d;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = M9216324016624295870.e;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrV = v(v12242721515760750181Arr, bArr5);
                A10225670138084435446.S(byteArrayOutputStream, v12242721515760750181Arr.length, 1);
                A10225670138084435446.S(byteArrayOutputStream, bArrV.length, 4);
                byte[] bArrX = A10225670138084435446.x(bArrV);
                A10225670138084435446.S(byteArrayOutputStream, bArrX.length, 4);
                byteArrayOutputStream.write(bArrX);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                A10225670138084435446.S(byteArrayOutputStream, v12242721515760750181Arr.length, 1);
                for (V12242721515760750181 v12242721515760750181 : v12242721515760750181Arr) {
                    int size = v12242721515760750181.i.size() * 4;
                    String strY = y(v12242721515760750181.a, v12242721515760750181.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    A10225670138084435446.T(byteArrayOutputStream, strY.getBytes(charset).length);
                    A10225670138084435446.T(byteArrayOutputStream, v12242721515760750181.h.length);
                    A10225670138084435446.S(byteArrayOutputStream, size, 4);
                    A10225670138084435446.S(byteArrayOutputStream, v12242721515760750181.c, 4);
                    byteArrayOutputStream.write(strY.getBytes(charset));
                    Iterator it = v12242721515760750181.i.keySet().iterator();
                    while (it.hasNext()) {
                        A10225670138084435446.T(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        A10225670138084435446.T(byteArrayOutputStream, 0);
                    }
                    for (int i4 : v12242721515760750181.h) {
                        A10225670138084435446.T(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr6 = M9216324016624295870.f;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrV2 = v(v12242721515760750181Arr, bArr6);
                A10225670138084435446.S(byteArrayOutputStream, v12242721515760750181Arr.length, 1);
                A10225670138084435446.S(byteArrayOutputStream, bArrV2.length, 4);
                byte[] bArrX2 = A10225670138084435446.x(bArrV2);
                A10225670138084435446.S(byteArrayOutputStream, bArrX2.length, 4);
                byteArrayOutputStream.write(bArrX2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            A10225670138084435446.T(byteArrayOutputStream, v12242721515760750181Arr.length);
            for (V12242721515760750181 v122427215157607501812 : v12242721515760750181Arr) {
                String str = v122427215157607501812.a;
                TreeMap treeMap = v122427215157607501812.i;
                String strY2 = y(str, v122427215157607501812.b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                A10225670138084435446.T(byteArrayOutputStream, strY2.getBytes(charset2).length);
                A10225670138084435446.T(byteArrayOutputStream, treeMap.size());
                A10225670138084435446.T(byteArrayOutputStream, v122427215157607501812.h.length);
                A10225670138084435446.S(byteArrayOutputStream, v122427215157607501812.c, 4);
                byteArrayOutputStream.write(strY2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    A10225670138084435446.T(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : v122427215157607501812.h) {
                    A10225670138084435446.T(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            A10225670138084435446.T(byteArrayOutputStream2, v12242721515760750181Arr.length);
            int i6 = 2;
            int i7 = 2;
            for (V12242721515760750181 v122427215157607501813 : v12242721515760750181Arr) {
                A10225670138084435446.S(byteArrayOutputStream2, v122427215157607501813.c, 4);
                A10225670138084435446.S(byteArrayOutputStream2, v122427215157607501813.d, 4);
                A10225670138084435446.S(byteArrayOutputStream2, v122427215157607501813.g, 4);
                String strY3 = y(v122427215157607501813.a, v122427215157607501813.b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strY3.getBytes(charset3).length;
                A10225670138084435446.T(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(strY3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            I12516644236219320733 i12516644236219320733 = new I12516644236219320733(false, byteArray, 1);
            byteArrayOutputStream2.close();
            arrayList.add(i12516644236219320733);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < v12242721515760750181Arr.length) {
                try {
                    V12242721515760750181 v122427215157607501814 = v12242721515760750181Arr[i8];
                    A10225670138084435446.T(byteArrayOutputStream3, i8);
                    A10225670138084435446.T(byteArrayOutputStream3, v122427215157607501814.e);
                    i9 = i9 + 4 + (v122427215157607501814.e * i6);
                    int[] iArr = v122427215157607501814.h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    while (i3 < length3) {
                        int i11 = iArr[i3];
                        A10225670138084435446.T(byteArrayOutputStream3, i11 - i10);
                        i3++;
                        i6 = i6;
                        i10 = i11;
                    }
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                }
            }
            int i12 = i6;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            I12516644236219320733 i125166442362193207332 = new I12516644236219320733(true, byteArray2, 3);
            byteArrayOutputStream3.close();
            arrayList.add(i125166442362193207332);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            for (int i14 = 0; i14 < v12242721515760750181Arr.length; i14++) {
                try {
                    V12242721515760750181 v122427215157607501815 = v12242721515760750181Arr[i14];
                    Iterator it3 = v122427215157607501815.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        V(byteArrayOutputStream4, iIntValue, v122427215157607501815);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            W(byteArrayOutputStream4, v122427215157607501815);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            A10225670138084435446.T(byteArrayOutputStream3, i14);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i13 + 6;
                            A10225670138084435446.S(byteArrayOutputStream3, length4, 4);
                            A10225670138084435446.T(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i13 = i15 + length4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            I12516644236219320733 i125166442362193207333 = new I12516644236219320733(true, byteArray5, 4);
            byteArrayOutputStream3.close();
            arrayList.add(i125166442362193207333);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            A10225670138084435446.S(byteArrayOutputStream, arrayList.size(), 4);
            int i16 = 0;
            while (i16 < arrayList.size()) {
                I12516644236219320733 i125166442362193207334 = (I12516644236219320733) arrayList.get(i16);
                int i17 = i125166442362193207334.a;
                byte[] bArr7 = i125166442362193207334.b;
                if (i17 != 1) {
                    i = i12;
                    if (i17 == i) {
                        i2 = 1;
                    } else if (i17 == 3) {
                        i2 = i;
                    } else if (i17 == 4) {
                        i2 = 3;
                    } else {
                        if (i17 != 5) {
                            throw null;
                        }
                        i2 = 4;
                    }
                } else {
                    i = i12;
                    i2 = 0;
                }
                A10225670138084435446.S(byteArrayOutputStream, i2, 4);
                A10225670138084435446.S(byteArrayOutputStream, size2, 4);
                if (i125166442362193207334.c) {
                    long length5 = bArr7.length;
                    byte[] bArrX3 = A10225670138084435446.x(bArr7);
                    arrayList2.add(bArrX3);
                    A10225670138084435446.S(byteArrayOutputStream, bArrX3.length, 4);
                    A10225670138084435446.S(byteArrayOutputStream, length5, 4);
                    length = bArrX3.length;
                } else {
                    arrayList2.add(bArr7);
                    A10225670138084435446.S(byteArrayOutputStream, bArr7.length, 4);
                    A10225670138084435446.S(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i16++;
                i12 = i;
            }
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i18));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static final native A16842337154698931828 S(A16842337154698931828 a16842337154698931828);

    public static void T(ByteArrayOutputStream byteArrayOutputStream, V12242721515760750181 v12242721515760750181) throws IOException {
        W(byteArrayOutputStream, v12242721515760750181);
        int i = v12242721515760750181.g;
        int[] iArr = v12242721515760750181.h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            A10225670138084435446.T(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : v12242721515760750181.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void U(ByteArrayOutputStream byteArrayOutputStream, V12242721515760750181 v12242721515760750181, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        A10225670138084435446.T(byteArrayOutputStream, str.getBytes(charset).length);
        A10225670138084435446.T(byteArrayOutputStream, v12242721515760750181.e);
        A10225670138084435446.S(byteArrayOutputStream, v12242721515760750181.f, 4);
        A10225670138084435446.S(byteArrayOutputStream, v12242721515760750181.c, 4);
        A10225670138084435446.S(byteArrayOutputStream, v12242721515760750181.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void V(ByteArrayOutputStream byteArrayOutputStream, int i, V12242721515760750181 v12242721515760750181) throws IOException {
        int i2 = v12242721515760750181.g;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : v12242721515760750181.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void W(ByteArrayOutputStream byteArrayOutputStream, V12242721515760750181 v12242721515760750181) {
        int i = 0;
        for (Map.Entry entry : v12242721515760750181.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                A10225670138084435446.T(byteArrayOutputStream, iIntValue - i);
                A10225670138084435446.T(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    public static H17686692708284905246 a(int i, int i2, T1542296375665870064 t1542296375665870064) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        int i3 = i2 & 2;
        T1542296375665870064 t15422963756658700642 = T1542296375665870064.a;
        if (i3 != 0) {
            t1542296375665870064 = t15422963756658700642;
        }
        if (i == -2) {
            if (t1542296375665870064 != t15422963756658700642) {
                return new C16234273676361039229(1, t1542296375665870064);
            }
            E5386183571211952538.Oo.getClass();
            return new H17686692708284905246(S14925445853137674304.b);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? t1542296375665870064 == t15422963756658700642 ? new H17686692708284905246(i) : new C16234273676361039229(i, t1542296375665870064) : new H17686692708284905246(Integer.MAX_VALUE) : t1542296375665870064 == t15422963756658700642 ? new H17686692708284905246(0) : new C16234273676361039229(1, t1542296375665870064);
        }
        if (t1542296375665870064 == t15422963756658700642) {
            return new C16234273676361039229(1, T1542296375665870064.b);
        }
        S10973172697741180971.j("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    public static final native void b(F16371047080953224077 f16371047080953224077, H10681976249452161517 h10681976249452161517, H10681976249452161517 h106819762494521615172, H10681976249452161517 h106819762494521615173, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, M3727281027331139839 m3727281027331139839, int i);

    public static final native void c(T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i);

    public static final native void d(int i, T15443218846549482730 t15443218846549482730, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, I1722681268793429505 i1722681268793429505, boolean z2);

    public static final native void e(B13729205492206812220 b13729205492206812220, I1722681268793429505 i1722681268793429505, L7100317404093621994 l7100317404093621994, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i, int i2);

    public static final native void f(boolean z2, F4096073349764486348 f4096073349764486348, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i);

    public static final native void g(int i, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, boolean z2);

    public static final native void h(Context context, Configuration configuration, L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839, int i);

    public static final native void i(H9594781759364688001 h9594781759364688001, boolean z2, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, F4096073349764486348 f40960733497644863484, F4096073349764486348 f40960733497644863485, F4096073349764486348 f40960733497644863486, F4096073349764486348 f40960733497644863487, F4096073349764486348 f40960733497644863488, F4096073349764486348 f40960733497644863489, F4096073349764486348 f409607334976448634810, F4096073349764486348 f409607334976448634811, F4096073349764486348 f409607334976448634812, F4096073349764486348 f409607334976448634813, F4096073349764486348 f409607334976448634814, F4096073349764486348 f409607334976448634815, F4096073349764486348 f409607334976448634816, F4096073349764486348 f409607334976448634817, B13729205492206812220 b13729205492206812220, I1722681268793429505 i1722681268793429505, boolean z3, boolean z4, boolean z5, M3727281027331139839 m3727281027331139839, int i, int i2, int i3, int i4);

    public static final native void j(Z1656773070093558724 z1656773070093558724, F4096073349764486348 f4096073349764486348, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i);

    public static y1 k(int i) throws Exception {
        y1 y1Var = (y1) y1.c.get(Integer.valueOf(i));
        if (y1Var != null) {
            return y1Var;
        }
        throw new Exception("Invalid for value enum " + I3887072968740112330.class.getName() + ": " + i);
    }

    public static IOException l(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    public static IOException m(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        return parentFile == null ? l(file, iOException) : parentFile.exists() ? parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? l(file, iOException) : l(file, iOException) : parentFile.canWrite() ? l(file, iOException) : l(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? l(file, iOException) : l(file, iOException) : parentFile.canWrite() ? l(file, iOException) : l(file, iOException) : l(file, iOException);
    }

    public static final native Object n(Z7637734454282223795 z7637734454282223795, long j2, float f, float f2, float f3, M204440408817344908 m204440408817344908, B401944902727389462 b401944902727389462);

    public static final int o(int i, int i2, int[] iArr) {
        iArr.getClass();
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final int p(long[] jArr, int i, long j2) {
        jArr.getClass();
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j3 = jArr[i4];
            if (j3 < j2) {
                i3 = i4 + 1;
            } else {
                if (j3 <= j2) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static final boolean q(N13196868278329319633 n13196868278329319633) {
        return (n13196868278329319633.c() || n13196868278329319633.h || !n13196868278329319633.d) ? false : true;
    }

    public static final boolean r(N13196868278329319633 n13196868278329319633) {
        return !n13196868278329319633.h && n13196868278329319633.d;
    }

    public static final boolean s(N13196868278329319633 n13196868278329319633) {
        return (n13196868278329319633.c() || !n13196868278329319633.h || n13196868278329319633.d) ? false : true;
    }

    public static final boolean t(N13196868278329319633 n13196868278329319633) {
        return n13196868278329319633.h && !n13196868278329319633.d;
    }

    public static final native int u(CharSequence charSequence, int i, O11717703281911440328 o11717703281911440328);

    public static byte[] v(V12242721515760750181[] v12242721515760750181Arr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (V12242721515760750181 v12242721515760750181 : v12242721515760750181Arr) {
            length += ((((v12242721515760750181.g * 2) + 7) & (-8)) / 8) + (v12242721515760750181.e * 2) + y(v12242721515760750181.a, v12242721515760750181.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + v12242721515760750181.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, M9216324016624295870.f)) {
            int length2 = v12242721515760750181Arr.length;
            while (i < length2) {
                V12242721515760750181 v122427215157607501812 = v12242721515760750181Arr[i];
                U(byteArrayOutputStream, v122427215157607501812, y(v122427215157607501812.a, v122427215157607501812.b, bArr));
                T(byteArrayOutputStream, v122427215157607501812);
                i++;
            }
        } else {
            for (V12242721515760750181 v122427215157607501813 : v12242721515760750181Arr) {
                U(byteArrayOutputStream, v122427215157607501813, y(v122427215157607501813.a, v122427215157607501813.b, bArr));
            }
            int length3 = v12242721515760750181Arr.length;
            while (i < length3) {
                T(byteArrayOutputStream, v12242721515760750181Arr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static final native Object w(Z7637734454282223795 z7637734454282223795, long j2, float f, float f2, K1246821697113442187 k1246821697113442187, W5797197595347441198 w5797197595347441198, M204440408817344908 m204440408817344908, B401944902727389462 b401944902727389462);

    public static /* synthetic */ J12043550928838212009 x(N5372082901916183419 n5372082901916183419, G8001132634698687269 g8001132634698687269, int i, T1542296375665870064 t1542296375665870064, int i2) {
        if ((i2 & 1) != 0) {
            g8001132634698687269 = I3826119971291161142.a;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            t1542296375665870064 = T1542296375665870064.a;
        }
        return n5372082901916183419.a(g8001132634698687269, i, t1542296375665870064);
    }

    public static String y(String str, String str2, byte[] bArr) {
        byte[] bArr2 = M9216324016624295870.g;
        byte[] bArr3 = M9216324016624295870.h;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return G6547577305291411977.u(new StringBuilder(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static final Z7022156542152740569 z() {
        Z7022156542152740569 z7022156542152740569 = c0;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 3);
        v14323974914327418545.j(19.0f, 13.0f);
        v14323974914327418545.g(-6.0f);
        v14323974914327418545.s(6.0f);
        v14323974914327418545.g(-2.0f);
        v14323974914327418545.s(-6.0f);
        v14323974914327418545.f(5.0f);
        v14323974914327418545.s(-2.0f);
        v14323974914327418545.g(6.0f);
        v14323974914327418545.r(5.0f);
        v14323974914327418545.g(2.0f);
        v14323974914327418545.s(6.0f);
        v14323974914327418545.g(6.0f);
        v14323974914327418545.s(2.0f);
        v14323974914327418545.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        c0 = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public abstract void onNavigationEvent(int i);

    static {
        izmyclvb.dpqpjfpoanwt1(726);
        V10933700885381486763 v10933700885381486763 = V10933700885381486763.j;
        d = v10933700885381486763;
        Y4261039727803185691 y4261039727803185691 = Y4261039727803185691.h;
        j = y4261039727803185691;
        k = 0.38f;
        l = 8.0f;
        f292o = y4261039727803185691;
        p = 0.12f;
        Y4261039727803185691 y42610397278031856912 = Y4261039727803185691.l;
        q = y42610397278031856912;
        r = 1.0f;
        s = y4261039727803185691;
        D4961612090878789022 d4961612090878789022 = D4961612090878789022.h;
        t = d4961612090878789022;
        u = y4261039727803185691;
        v = 0.38f;
        Y4261039727803185691 y42610397278031856913 = Y4261039727803185691.m;
        w = y42610397278031856913;
        x = new int[0];
        y = new long[0];
        z = new Object[0];
        A = v10933700885381486763;
        B = y4261039727803185691;
        C = 0.38f;
        D = 8.0f;
        E = y4261039727803185691;
        F = 0.12f;
        G = y4261039727803185691;
        H = 0.12f;
        I = Y4261039727803185691.q;
        J = 1.0f;
        K = y42610397278031856912;
        L = 1.0f;
        M = d4961612090878789022;
        Y4261039727803185691 y42610397278031856914 = Y4261039727803185691.g;
        N = y42610397278031856914;
        Y4261039727803185691 y42610397278031856915 = Y4261039727803185691.i;
        O = y42610397278031856915;
        P = 18.0f;
        Q = y4261039727803185691;
        R = 0.38f;
        S = y42610397278031856914;
        T = y42610397278031856913;
        U = y4261039727803185691;
        V = 0.38f;
        W = y42610397278031856914;
        X = y42610397278031856915;
        Y = new byte[]{112, 114, 111, 0};
        Z = new byte[]{112, 114, 109, 0};
        a0 = new V10300877997588547986((Object) new T10658432029677253838((byte) 16), (Object) new V3436737973405206042((byte) 18), (byte) 20);
        b0 = new Z14997871575210439922((byte) 26);
    }

    public void onMessageChannelReady() {
    }

    public void extraCallback(String str) {
    }

    public void extraCallbackWithResult(String str) {
    }

    public void onActivityResized(Bundle bundle) {
    }

    public void onPostMessage(String str) {
    }

    public void onRelationshipValidationResult(Uri uri) {
    }
}
