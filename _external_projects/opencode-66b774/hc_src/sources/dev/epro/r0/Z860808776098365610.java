package dev.epro.r0;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.widget.EdgeEffect;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes4.dex */
public abstract class Z860808776098365610 {
    public static R2847330884077978889 a;
    public static final O14561027293699174040 b;
    public static final M10846389789027735899 c;
    public static final D14731132657808549702 d;
    public static final D14731132657808549702 e;
    public static final D14731132657808549702 f;
    public static final D14731132657808549702 g;
    public static final D14731132657808549702 h;
    public static final P5733283974459951585 i;
    public static final Object j;
    public static final U11450443558875589191 k;
    public static final H2442898661687873181 l;
    public static Z7022156542152740569 m;
    public static Z7022156542152740569 n;

    public static final void A(L17598299826319227431 l17598299826319227431, B9692660393722135472 b9692660393722135472) {
        long j2;
        Canvas canvas;
        boolean z;
        boolean z2;
        Canvas canvas2;
        float f2;
        V1715405128288489768 A = l17598299826319227431.R().A();
        B9692660393722135472 b96926603937221354722 = (B9692660393722135472) l17598299826319227431.R().c;
        Y257452374762370649 y257452374762370649 = b9692660393722135472.a;
        if (b9692660393722135472.s) {
            return;
        }
        long j3 = b9692660393722135472.h;
        Canvas a2 = R14166932666867597588.a(A);
        boolean isHardwareAccelerated = a2.isHardwareAccelerated();
        if (!isHardwareAccelerated) {
            long j4 = b9692660393722135472.t;
            float f3 = (int) (j4 >> 32);
            float f4 = f3 - b9692660393722135472.v;
            float f5 = (int) (j4 & 4294967295L);
            float f6 = f5 - b9692660393722135472.w;
            long j5 = b9692660393722135472.u;
            float f7 = f3 + ((int) (j5 >> 32)) + b9692660393722135472.x;
            float f8 = f5 + ((int) (j5 & 4294967295L)) + b9692660393722135472.y;
            float a3 = y257452374762370649.a();
            R3103059035698929241 x = y257452374762370649.x();
            int K = y257452374762370649.K();
            if (a3 >= 1.0f && K == 3 && x == null) {
                canvas2 = a2;
                if (y257452374762370649.u() != 1) {
                    canvas2.save();
                    f2 = f4;
                    a2 = canvas2;
                    a2.translate(f2, f6);
                    Matrix C = y257452374762370649.C();
                    C.preTranslate(b9692660393722135472.v, b9692660393722135472.w);
                    a2.concat(C);
                    long j6 = b9692660393722135472.h;
                    float f9 = b9692660393722135472.v;
                    b9692660393722135472.h = L2216691091636065972.e(j6, (Float.floatToRawIntBits(b9692660393722135472.w) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32));
                }
            } else {
                canvas2 = a2;
            }
            O3228356295430981133 o3228356295430981133 = b9692660393722135472.p;
            if (o3228356295430981133 == null) {
                o3228356295430981133 = E12775674050813925581.g();
                b9692660393722135472.p = o3228356295430981133;
            }
            o3228356295430981133.m(a3);
            o3228356295430981133.n(K);
            o3228356295430981133.p(x);
            Paint paint = (Paint) o3228356295430981133.b;
            f2 = f4;
            a2 = canvas2;
            a2.saveLayer(f2, f6, f7, f8, paint);
            a2.translate(f2, f6);
            Matrix C2 = y257452374762370649.C();
            C2.preTranslate(b9692660393722135472.v, b9692660393722135472.w);
            a2.concat(C2);
            long j62 = b9692660393722135472.h;
            float f92 = b9692660393722135472.v;
            b9692660393722135472.h = L2216691091636065972.e(j62, (Float.floatToRawIntBits(b9692660393722135472.w) & 4294967295L) | (Float.floatToRawIntBits(f92) << 32));
        }
        b9692660393722135472.a();
        if (!y257452374762370649.G()) {
            try {
                b9692660393722135472.a.N(b9692660393722135472.b, b9692660393722135472.c, b9692660393722135472, b9692660393722135472.e);
            } catch (Throwable unused) {
            }
        }
        boolean z3 = y257452374762370649.F() > 0.0f;
        if (z3) {
            A.t();
        }
        boolean z4 = !isHardwareAccelerated && b9692660393722135472.A;
        if (z4) {
            A.l();
            J8045362843799184672 d2 = b9692660393722135472.d();
            if (d2 instanceof K10859651572364480586) {
                V1715405128288489768.n(A, ((K10859651572364480586) d2).r);
            } else if (d2 instanceof K14082636229475424456) {
                B1061516154492673368 b1061516154492673368 = b9692660393722135472.m;
                if (b1061516154492673368 != null) {
                    b1061516154492673368.a.rewind();
                } else {
                    b1061516154492673368 = W7346099082318612118.a();
                    b9692660393722135472.m = b1061516154492673368;
                }
                B1061516154492673368.c(b1061516154492673368, ((K14082636229475424456) d2).r);
                A.b(b1061516154492673368);
            } else {
                if (!(d2 instanceof L11060719515004085110)) {
                    Z3383101362411723454.g();
                    return;
                }
                A.b(((L11060719515004085110) d2).r);
            }
        }
        if (b96926603937221354722 != null) {
            A6478343232691943615 a6478343232691943615 = b96926603937221354722.r;
            if (!a6478343232691943615.a) {
                U6129583139759812404.a("Only add dependencies during a tracking");
            }
            E13273723708836014930 e13273723708836014930 = (E13273723708836014930) a6478343232691943615.d;
            if (e13273723708836014930 != null) {
                e13273723708836014930.a(b9692660393722135472);
            } else if (((B9692660393722135472) a6478343232691943615.b) != null) {
                E13273723708836014930 e132737237088360149302 = L12621230156277355451.a;
                E13273723708836014930 e132737237088360149303 = new E13273723708836014930();
                B9692660393722135472 b96926603937221354723 = (B9692660393722135472) a6478343232691943615.b;
                b96926603937221354723.getClass();
                e132737237088360149303.a(b96926603937221354723);
                e132737237088360149303.a(b9692660393722135472);
                a6478343232691943615.d = e132737237088360149303;
                a6478343232691943615.b = null;
            } else {
                a6478343232691943615.b = b9692660393722135472;
            }
            E13273723708836014930 e132737237088360149304 = (E13273723708836014930) a6478343232691943615.e;
            if (e132737237088360149304 != null) {
                z2 = !e132737237088360149304.l(b9692660393722135472);
            } else if (((B9692660393722135472) a6478343232691943615.c) != b9692660393722135472) {
                z2 = true;
            } else {
                a6478343232691943615.c = null;
                z2 = false;
            }
            if (z2) {
                b9692660393722135472.q++;
            }
        }
        if (((U5519500298982620611) A).a.isHardwareAccelerated()) {
            j2 = j3;
            canvas = a2;
            z = z3;
            y257452374762370649.o(A);
        } else {
            N16536369055082677148 n16536369055082677148 = b9692660393722135472.f179o;
            if (n16536369055082677148 == null) {
                n16536369055082677148 = new N16536369055082677148();
                b9692660393722135472.f179o = n16536369055082677148;
            }
            Q7316561721656982910 q7316561721656982910 = n16536369055082677148.b;
            R8540738700654750557 r8540738700654750557 = b9692660393722135472.b;
            F10342546226345611902 f10342546226345611902 = b9692660393722135472.c;
            long Q = I3887072968740112330.Q(b9692660393722135472.u);
            R8540738700654750557 C3 = q7316561721656982910.C();
            F10342546226345611902 E = q7316561721656982910.E();
            canvas = a2;
            V1715405128288489768 A2 = q7316561721656982910.A();
            j2 = j3;
            long F = q7316561721656982910.F();
            z = z3;
            B9692660393722135472 b96926603937221354724 = (B9692660393722135472) q7316561721656982910.c;
            q7316561721656982910.M(r8540738700654750557);
            q7316561721656982910.O(f10342546226345611902);
            q7316561721656982910.L(A);
            q7316561721656982910.P(Q);
            q7316561721656982910.c = b9692660393722135472;
            A.l();
            try {
                b9692660393722135472.c(n16536369055082677148);
            } finally {
                A.j();
                q7316561721656982910.M(C3);
                q7316561721656982910.O(E);
                q7316561721656982910.L(A2);
                q7316561721656982910.P(F);
                q7316561721656982910.c = b96926603937221354724;
            }
        }
        if (z4) {
            A.j();
        }
        if (z) {
            A.m();
        }
        if (!isHardwareAccelerated) {
            canvas.restore();
        }
        b9692660393722135472.h = j2;
    }

    public static Z4023314114778119473 B(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream;
        int i2;
        boolean z;
        bArr.getClass();
        if (bArr.length > 10240) {
            S10973172697741180971.m("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        if (bArr.length == 0) {
            return Z4023314114778119473.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            i2 = 0;
            z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
        } catch (IOException unused) {
            int i3 = J18388554131392922007.a;
            B14824868959299866349.n().getClass();
        } catch (ClassNotFoundException unused2) {
            int i4 = J18388554131392922007.a;
            B14824868959299866349.n().getClass();
        }
        if (z) {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int readInt = objectInputStream.readInt();
                while (i2 < readInt) {
                    linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    i2++;
                }
                objectInputStream.close();
                return new Z4023314114778119473(linkedHashMap);
            } finally {
            }
        } else {
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            try {
                short readShort = dataInputStream.readShort();
                if (readShort == -21521) {
                    short readShort2 = dataInputStream.readShort();
                    if (readShort2 != 1) {
                        Z3383101362411723454.j(G6547577305291411977.n(readShort2, "Unsupported version number: "));
                    }
                } else {
                    Z3383101362411723454.j(G6547577305291411977.n(readShort, "Magic number doesn't match: "));
                }
                int readInt2 = dataInputStream.readInt();
                while (i2 < readInt2) {
                    linkedHashMap.put(dataInputStream.readUTF(), C(dataInputStream, dataInputStream.readByte()));
                    i2++;
                }
                dataInputStream.close();
                return new Z4023314114778119473(linkedHashMap);
            } finally {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable C(DataInputStream dataInputStream, byte b2) {
        if (b2 == 0) {
            return null;
        }
        if (b2 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b2 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b2 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b2 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b2 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b2 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b2 == 7) {
            return dataInputStream.readUTF();
        }
        int i2 = 0;
        if (b2 == 8) {
            int readInt = dataInputStream.readInt();
            ?? r0 = new Boolean[readInt];
            while (i2 < readInt) {
                r0[i2] = Boolean.valueOf(dataInputStream.readBoolean());
                i2++;
            }
            return r0;
        }
        if (b2 == 9) {
            int readInt2 = dataInputStream.readInt();
            ?? r02 = new Byte[readInt2];
            while (i2 < readInt2) {
                r02[i2] = Byte.valueOf(dataInputStream.readByte());
                i2++;
            }
            return r02;
        }
        if (b2 == 10) {
            int readInt3 = dataInputStream.readInt();
            ?? r03 = new Integer[readInt3];
            while (i2 < readInt3) {
                r03[i2] = Integer.valueOf(dataInputStream.readInt());
                i2++;
            }
            return r03;
        }
        if (b2 == 11) {
            int readInt4 = dataInputStream.readInt();
            ?? r04 = new Long[readInt4];
            while (i2 < readInt4) {
                r04[i2] = Long.valueOf(dataInputStream.readLong());
                i2++;
            }
            return r04;
        }
        if (b2 == 12) {
            int readInt5 = dataInputStream.readInt();
            ?? r05 = new Float[readInt5];
            while (i2 < readInt5) {
                r05[i2] = Float.valueOf(dataInputStream.readFloat());
                i2++;
            }
            return r05;
        }
        if (b2 == 13) {
            int readInt6 = dataInputStream.readInt();
            ?? r06 = new Double[readInt6];
            while (i2 < readInt6) {
                r06[i2] = Double.valueOf(dataInputStream.readDouble());
                i2++;
            }
            return r06;
        }
        if (b2 != 14) {
            S10973172697741180971.m(G6547577305291411977.n(b2, "Unsupported type "));
            return null;
        }
        int readInt7 = dataInputStream.readInt();
        ?? r1 = new String[readInt7];
        while (i2 < readInt7) {
            String readUTF = dataInputStream.readUTF();
            if (S10823041268949770285.t(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                readUTF = null;
            }
            r1[i2] = readUTF;
            i2++;
        }
        return r1;
    }

    public static final Z7022156542152740569 E() {
        Z7022156542152740569 z7022156542152740569 = m;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new K11581048818582425500(9.0f, 16.17f));
        arrayList.add(new N18337357316239809325(4.83f, 12.0f));
        arrayList.add(new T8070361472955532362(-1.42f, 1.41f));
        arrayList.add(new N18337357316239809325(9.0f, 19.0f));
        arrayList.add(new N18337357316239809325(21.0f, 7.0f));
        arrayList.add(new T8070361472955532362(-1.41f, -1.41f));
        arrayList.add(new N18337357316239809325(9.0f, 16.17f));
        arrayList.add(G18244342923164738699.c);
        Q17593287602150918564.a(q17593287602150918564, arrayList, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 b2 = q17593287602150918564.b();
        m = b2;
        return b2;
    }

    public static final Z7022156542152740569 F() {
        Z7022156542152740569 z7022156542152740569 = n;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.Code", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 3);
        v14323974914327418545.j(9.4f, 16.6f);
        v14323974914327418545.h(4.8f, 12.0f);
        v14323974914327418545.i(4.6f, -4.6f);
        v14323974914327418545.h(8.0f, 6.0f);
        v14323974914327418545.i(-6.0f, 6.0f);
        v14323974914327418545.i(6.0f, 6.0f);
        v14323974914327418545.i(1.4f, -1.4f);
        v14323974914327418545.c();
        v14323974914327418545.j(14.6f, 16.6f);
        v14323974914327418545.i(4.6f, -4.6f);
        v14323974914327418545.i(-4.6f, -4.6f);
        v14323974914327418545.h(16.0f, 6.0f);
        v14323974914327418545.i(6.0f, 6.0f);
        v14323974914327418545.i(-6.0f, 6.0f);
        v14323974914327418545.i(-1.4f, -1.4f);
        v14323974914327418545.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 b2 = q17593287602150918564.b();
        n = b2;
        return b2;
    }

    public static final I1722681268793429505 G(I1722681268793429505 i1722681268793429505, H8415504349046344551 h8415504349046344551, C16999414938027834076 c16999414938027834076, R7000310675073492254 r7000310675073492254, boolean z) {
        return i1722681268793429505.Q0(new W16788523502141893535(h8415504349046344551, c16999414938027834076, r7000310675073492254, z));
    }

    public static int H(int i2, int i3, int i4) {
        if ((i3 & 8) != 0) {
            i2--;
        }
        if (i4 <= i2) {
            return i2 - i4;
        }
        Q11088980322693754445.h(E12098517352909843120.l("PROTOCOL_ERROR padding ", i4, i2, " > remaining length "));
        return 0;
    }

    public static final native boolean I(String str, List list);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x042d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x045b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02e3  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [int] */
    /* JADX WARN: Type inference failed for: r38v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void J(android.view.ViewStructure r41, dev.epro.r0.H11725168162114556860 r42, android.view.autofill.AutofillId r43, java.lang.String r44, dev.epro.r0.W12302045505279551894 r45) {
        /*
            Method dump skipped, instructions count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Z860808776098365610.J(android.view.ViewStructure, dev.epro.r0.H11725168162114556860, android.view.autofill.AutofillId, java.lang.String, dev.epro.r0.W12302045505279551894):void");
    }

    public static final native String K(String str, M3727281027331139839 m3727281027331139839);

    public static String L(File file) {
        Charset charset = F16059529287866721367.a;
        charset.getClass();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String m2 = B6030175592171028728.m(inputStreamReader);
            inputStreamReader.close();
            return m2;
        } finally {
        }
    }

    public static final void M(Z17561488864728364842 z17561488864728364842, int i2, Object obj) {
        z17561488864728364842.S[(z17561488864728364842.T - z17561488864728364842.O[z17561488864728364842.P - 1].b) + i2] = obj;
    }

    public static final void N(Z17561488864728364842 z17561488864728364842, int i2, Object obj, int i3, Object obj2) {
        int i4 = z17561488864728364842.T - z17561488864728364842.O[z17561488864728364842.P - 1].b;
        Object[] objArr = z17561488864728364842.S;
        objArr[i2 + i4] = obj;
        objArr[i4 + i3] = obj2;
    }

    public static final void O(Z17561488864728364842 z17561488864728364842, Object obj, Object obj2, Object obj3) {
        int i2 = z17561488864728364842.T - z17561488864728364842.O[z17561488864728364842.P - 1].b;
        Object[] objArr = z17561488864728364842.S;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        objArr[i2 + 2] = obj3;
    }

    public static final native R2590639056571640352 P(K6255634571546489463 k6255634571546489463);

    public static final native ArrayList Q(String str);

    public static byte[] R(Z4023314114778119473 z4023314114778119473) {
        z4023314114778119473.getClass();
        HashMap hashMap = z4023314114778119473.a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(hashMap.size());
                for (Map.Entry entry : hashMap.entrySet()) {
                    S(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } catch (IOException unused) {
            int i2 = J18388554131392922007.a;
            B14824868959299866349.n().getClass();
            return new byte[0];
        }
    }

    public static final void S(DataOutputStream dataOutputStream, String str, Object obj) {
        int i2;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                Z3383101362411723454.p("Unsupported value type ", J17975719213314763068.a(obj.getClass()).c());
                return;
            }
            Object[] objArr = (Object[]) obj;
            V6281043481934004271 a2 = J17975719213314763068.a(objArr.getClass());
            if (a2.equals(J17975719213314763068.a(Boolean[].class))) {
                i2 = 8;
            } else if (a2.equals(J17975719213314763068.a(Byte[].class))) {
                i2 = 9;
            } else if (a2.equals(J17975719213314763068.a(Integer[].class))) {
                i2 = 10;
            } else if (a2.equals(J17975719213314763068.a(Long[].class))) {
                i2 = 11;
            } else if (a2.equals(J17975719213314763068.a(Float[].class))) {
                i2 = 12;
            } else if (a2.equals(J17975719213314763068.a(Double[].class))) {
                i2 = 13;
            } else {
                if (!a2.equals(J17975719213314763068.a(String[].class))) {
                    Z3383101362411723454.p("Unsupported value type ", J17975719213314763068.a(objArr.getClass()).b());
                    return;
                }
                i2 = 14;
            }
            dataOutputStream.writeByte(i2);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i2 == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i2 == 9) {
                    Byte b2 = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b2 != null ? b2.byteValue() : (byte) 0);
                } else if (i2 == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i2 == 11) {
                    Long l2 = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l2 != null ? l2.longValue() : 0L);
                } else if (i2 == 12) {
                    Float f2 = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f2 != null ? f2.floatValue() : 0.0f);
                } else if (i2 == 13) {
                    Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d2 != null ? d2.doubleValue() : 0.0d);
                } else if (i2 == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static final native K6255634571546489463 T(R2590639056571640352 r2590639056571640352);

    public static final void U(FileOutputStream fileOutputStream, String str, Charset charset) {
        str.getClass();
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(8192);
        onUnmappableCharacter.getClass();
        ByteBuffer allocate2 = ByteBuffer.allocate(8192 * ((int) Math.ceil(onUnmappableCharacter.maxBytesPerChar())));
        allocate2.getClass();
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            int min = Math.min(8192 - i3, str.length() - i2);
            int i4 = i2 + min;
            char[] array = allocate.array();
            array.getClass();
            str.getChars(i2, i4, array, i3);
            allocate.limit(min + i3);
            i3 = 1;
            if (!onUnmappableCharacter.encode(allocate, allocate2, i4 == str.length()).isUnderflow()) {
                S10973172697741180971.m("Check failed.");
                return;
            }
            fileOutputStream.write(allocate2.array(), 0, allocate2.position());
            if (allocate.position() != allocate.limit()) {
                allocate.put(0, allocate.get());
            } else {
                i3 = 0;
            }
            allocate.clear();
            allocate2.clear();
            i2 = i4;
        }
    }

    public static synchronized V11923105316530470448 V(Context context, Intent intent) {
        R2847330884077978889 r2847330884077978889;
        synchronized (Z860808776098365610.class) {
            r2847330884077978889 = a;
            if (r2847330884077978889 == null) {
                r2847330884077978889 = new R2847330884077978889(context.getApplicationContext(), intent);
                r2847330884077978889.d = new H3351639798230113779(r2847330884077978889);
                ((CopyOnWriteArrayList) r2847330884077978889.b.e).add(r2847330884077978889);
                a = r2847330884077978889;
            }
        }
        return r2847330884077978889;
    }

    public static final native void a(X11638668447546090163 x11638668447546090163, F4096073349764486348 f4096073349764486348, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final native void b(float f2, boolean z, I1722681268793429505 i1722681268793429505, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final native void c(String str, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void d(F16371047080953224077 f16371047080953224077, List list, O14970126286626299582 o14970126286626299582, Integer num, F4096073349764486348 f4096073349764486348, boolean z, F4096073349764486348 f40960733497644863482, boolean z2, F4096073349764486348 f40960733497644863483, boolean z3, F4096073349764486348 f40960733497644863484, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void e(String str, boolean z, int i2, Integer num, boolean z2, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i3);

    public static final native void f(L12639328004344855510 l12639328004344855510, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, B13729205492206812220 b137292054922068122202, F4096073349764486348 f40960733497644863482, D16513696335383100591 d16513696335383100591, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void g(String str, boolean z, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void h(List list, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void i(String str, boolean z, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void j(B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void k(ArrayList arrayList, Set set, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void l(E17523205116624666034 e17523205116624666034, I1722681268793429505 i1722681268793429505, float f2, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void m(int i2, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, I1722681268793429505 i1722681268793429505);

    public static final native void n(A16842337154698931828 a16842337154698931828, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void o(A16842337154698931828 a16842337154698931828, L12639328004344855510 l12639328004344855510, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void p(H5889618771160323474 h5889618771160323474, Map map, Integer num, L12639328004344855510 l12639328004344855510, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void q(Z7022156542152740569 z7022156542152740569, String str, I1722681268793429505 i1722681268793429505, J12078565427869724451 j12078565427869724451, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final void r(C6935141804827476266 c6935141804827476266, Object obj, int i2, Object obj2, M3727281027331139839 m3727281027331139839, int i3) {
        m3727281027331139839.b0(1439843069);
        int i4 = (m3727281027331139839.f(c6935141804827476266) ? 4 : 2) | i3 | (m3727281027331139839.f(obj) ? 32 : 16) | (m3727281027331139839.d(i2) ? 256 : 128) | (m3727281027331139839.f(obj2) ? 2048 : 1024);
        if (m3727281027331139839.R(i4 & 1, (i4 & 1171) != 1170)) {
            ((V4145611664959724223) obj).a(obj2, S10823041268949770285.T(980966366, new G2192189236223710848(i2, c6935141804827476266, obj2), m3727281027331139839), m3727281027331139839, 48);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new N18429394832860979851(c6935141804827476266, obj, i2, obj2, i3);
        }
    }

    public static final void s(I1722681268793429505 i1722681268793429505, L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839, int i2, int i3) {
        int i4;
        m3727281027331139839.b0(-1298353104);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (m3727281027331139839.f(i1722681268793429505) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= m3727281027331139839.h(l12639328004344855510) ? 32 : 16;
        }
        if (m3727281027331139839.R(i4 & 1, (i4 & 19) != 18)) {
            if (i5 != 0) {
                i1722681268793429505 = V10993962107938880611.a;
            }
            Object M = m3727281027331139839.M();
            if (M == O9023047933786425027.a) {
                M = new Y4203361013804869221(N5158094851646208854.k);
                m3727281027331139839.k0(M);
            }
            t((Y4203361013804869221) M, i1722681268793429505, l12639328004344855510, m3727281027331139839, (i4 << 3) & 1008);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new W13996358013743084846(i1722681268793429505, l12639328004344855510, i2, i3);
        }
    }

    public static final void t(Y4203361013804869221 y4203361013804869221, I1722681268793429505 i1722681268793429505, L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        m3727281027331139839.b0(-511989831);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.h(y4203361013804869221) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.f(i1722681268793429505) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= m3727281027331139839.h(l12639328004344855510) ? 256 : 128;
        }
        if (m3727281027331139839.R(i3 & 1, (i3 & 147) != 146)) {
            int hashCode = Long.hashCode(m3727281027331139839.T);
            N4308732927120516147 I = E12775674050813925581.I(m3727281027331139839);
            I1722681268793429505 N = V12319504402545346730.N(m3727281027331139839, i1722681268793429505);
            P3648740535677465818 l2 = m3727281027331139839.l();
            m3727281027331139839.d0();
            if (m3727281027331139839.S) {
                m3727281027331139839.k(H11725168162114556860.S);
            } else {
                m3727281027331139839.n0();
            }
            W7808703833045379622.J(y4203361013804869221.c, m3727281027331139839, y4203361013804869221);
            W7808703833045379622.J(y4203361013804869221.d, m3727281027331139839, I);
            W7808703833045379622.J(y4203361013804869221.e, m3727281027331139839, l12639328004344855510);
            X4572652335386916693.Po.getClass();
            W7808703833045379622.J(P2382941533350862833.h, m3727281027331139839, l2);
            W7808703833045379622.H(m3727281027331139839);
            W7808703833045379622.J(P2382941533350862833.g, m3727281027331139839, N);
            W7808703833045379622.J(P2382941533350862833.j, m3727281027331139839, Integer.valueOf(hashCode));
            m3727281027331139839.q(true);
            if (m3727281027331139839.B()) {
                m3727281027331139839.a0(-1259187287);
                m3727281027331139839.q(false);
            } else {
                m3727281027331139839.a0(-1259245908);
                boolean h2 = m3727281027331139839.h(y4203361013804869221);
                Object M = m3727281027331139839.M();
                if (h2 || M == O9023047933786425027.a) {
                    M = new N8306548196372912291(y4203361013804869221, (byte) 29);
                    m3727281027331139839.k0(M);
                }
                Q13169198992966610970.B((B13729205492206812220) M, m3727281027331139839);
                m3727281027331139839.q(false);
            }
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new U2825079717702289474((Object) y4203361013804869221, (Object) i1722681268793429505, (Object) l12639328004344855510, i2, (byte) 3);
        }
    }

    public static float u(EdgeEffect edgeEffect, float f2, float f3, R8540738700654750557 r8540738700654750557) {
        float f4 = K6307018890215588081.a;
        double c2 = r8540738700654750557.c() * 386.0878f * 160.0f * 0.84f;
        double d2 = K6307018890215588081.a * c2;
        float exp = (float) (Math.exp((K6307018890215588081.b / K6307018890215588081.c) * Math.log((Math.abs(f2) * 0.35f) / d2)) * d2);
        int i2 = Build.VERSION.SDK_INT;
        if (exp > (i2 >= 31 ? M6916561348591858303.d(edgeEffect) : 0.0f) * f3) {
            return 0.0f;
        }
        int Z = T18016951143603335921.Z(f2);
        if (i2 >= 31) {
            edgeEffect.onAbsorb(Z);
            return f2;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(Z);
        }
        return f2;
    }

    public static final int v(int i2, D389890677992184566 d389890677992184566) {
        int i3 = d389890677992184566.c - 1;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = ((i3 - i4) / 2) + i4;
            Object[] objArr = d389890677992184566.a;
            int i6 = ((D2029916669724210805) objArr[i5]).a;
            if (i6 != i2) {
                if (i6 < i2) {
                    i4 = i5 + 1;
                    if (i2 < ((D2029916669724210805) objArr[i4]).a) {
                    }
                } else {
                    i3 = i5 - 1;
                }
            }
            return i5;
        }
        return i4;
    }

    public static final Object z(S14157914735975478504 s14157914735975478504, N235339945877347053 n235339945877347053, R4833348786910499294 r4833348786910499294) {
        Object B = O8620973563946607355.B(new B5703672629416386538((Object) s14157914735975478504, (Object) n235339945877347053, (R4833348786910499294) null, (byte) 10), r4833348786910499294);
        return B == Z3437138737604933638.a ? B : O9245300239821758723.a;
    }

    public Object D(O14561027293699174040 o14561027293699174040) {
        throw new IllegalStateException("");
    }

    public void w(T12670249092619324354 t12670249092619324354, Set set) {
        synchronized (t12670249092619324354) {
            try {
                if (t12670249092619324354.h == null) {
                    t12670249092619324354.h = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean x(O14561027293699174040 o14561027293699174040) {
        return false;
    }

    public int y(T12670249092619324354 t12670249092619324354) {
        int i2;
        synchronized (t12670249092619324354) {
            i2 = t12670249092619324354.i - 1;
            t12670249092619324354.i = i2;
        }
        return i2;
    }

    static {
        izmyclvb.qbtpmwoxbgtw3(0);
        b = new O14561027293699174040(new G5865513469313204166((byte) 21));
        c = new M10846389789027735899((byte) 9);
        d = new D14731132657808549702("STATE_REG", (byte) 25);
        e = new D14731132657808549702("STATE_COMPLETED", (byte) 25);
        f = new D14731132657808549702("STATE_CANCELLED", (byte) 25);
        g = new D14731132657808549702("NO_RESULT", (byte) 25);
        h = new D14731132657808549702("PARAM_CLAUSE_0", (byte) 25);
        i = new P5733283974459951585((byte) 0);
        j = new Object();
        k = new U11450443558875589191((byte) 5);
        l = new H2442898661687873181((byte) 1);
    }
}
