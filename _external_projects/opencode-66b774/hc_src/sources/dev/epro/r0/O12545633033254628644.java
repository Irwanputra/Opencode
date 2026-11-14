package dev.epro.r0;

import ads_mobile_sdk.c7;
import ads_mobile_sdk.c72;
import ads_mobile_sdk.ib1;
import ads_mobile_sdk.km1;
import ads_mobile_sdk.ut3;
import ads_mobile_sdk.vu3;
import android.app.Application;
import android.content.Context;
import android.os.Parcel;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O12545633033254628644 implements N123190348026444920, Z8888095354249304160, R12081023847482212386, W14715101850940949422, B4259731004323267459, P3831136427564699233, A6650193808056408155, I3673563500665330592, V13679327994991375447, P14073887229229024046 {
    public final /* synthetic */ byte a;

    public static vu3 d(long j) {
        return vu3.a((M15281894020734075014) new ut3(j));
    }

    public static void e(long j, c7 c7Var, boolean z) {
        long[] jArr = {2000490107, 1476547902, 1834034217, 268849430, 1839467528, 4368198174L, 449620248, 1652701270, 1629190168};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = ((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - jArr[5]) + jArr[6]) ^ (jArr[7] % jArr[8]);
        int d = C468629748621011703.d(1027101999, 1121861623, 2097482120, 23637094) ^ 75118620;
        long j8 = z ? (j + j) ^ (j >> 63) : j;
        int i = 1;
        while (true) {
            long j9 = j8 & j7;
            j8 >>>= 7;
            boolean z2 = j8 != 0 || i < 0;
            int i2 = (int) j9;
            if (z2) {
                i2 = ((i2 | 128) << d) >> d;
            }
            ((ByteArrayOutputStream) c7Var.a).write((byte) i2);
            if (!z2) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // dev.epro.r0.V13679327994991375447
    public int a(Context context) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder("com.google.android.gms.cronet_dynamite".length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.com.google.android.gms.cronet_dynamite.ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (V1475975160983963926.t(declaredField.get(null), "com.google.android.gms.cronet_dynamite")) {
                return declaredField2.getInt(null);
            }
            new StringBuilder(String.valueOf(declaredField.get(null)).length() + 50 + "com.google.android.gms.cronet_dynamite".length() + 1);
            return 0;
        } catch (ClassNotFoundException unused) {
            new StringBuilder("com.google.android.gms.cronet_dynamite".length() + 45);
            return 0;
        } catch (Exception e) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage()));
            return 0;
        }
    }

    @Override // dev.epro.r0.P14073887229229024046
    public void accept(Object obj, Object obj2) {
        Q14925164961901808324 q14925164961901808324 = (Q14925164961901808324) ((E17451188492285078839) obj).getService();
        F16869476344901062013 f16869476344901062013 = new F16869476344901062013((M17133811648581684718) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i = M9500913202453405055.a;
        obtain.writeInt(1);
        C468629748621011703.D(obtain, C468629748621011703.A(obtain, 20293));
        obtain.writeStrongBinder(f16869476344901062013);
        Parcel obtain2 = Parcel.obtain();
        try {
            q14925164961901808324.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // dev.epro.r0.P3831136427564699233
    public byte[] b(int i, byte[] bArr, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0165, code lost:
    
        if (r2 != false) goto L99;
     */
    @Override // dev.epro.r0.V13679327994991375447
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c(android.content.Context r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O12545633033254628644.c(android.content.Context, boolean):int");
    }

    @Override // dev.epro.r0.Z8888095354249304160
    public Object f(Object obj) {
        U11450443558875589191 u11450443558875589191;
        List list = (List) obj;
        Object obj2 = list.get(0);
        obj2.getClass();
        int intValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        obj3.getClass();
        int intValue2 = ((Integer) obj3).intValue();
        Object obj4 = list.get(2);
        obj4.getClass();
        int intValue3 = ((Integer) obj4).intValue();
        G9506192477171422664 F = K5751602218013079365.F();
        int i = 3;
        while (true) {
            int i2 = intValue2 + 3;
            u11450443558875589191 = N6128695298966473235.i;
            if (i >= i2) {
                break;
            }
            F.add(u11450443558875589191.f(list.get(i)));
            i++;
        }
        G9506192477171422664 v = K5751602218013079365.v(F);
        G9506192477171422664 F2 = K5751602218013079365.F();
        while (i < intValue2 + intValue3 + 3) {
            F2.add(u11450443558875589191.f(list.get(i)));
            i++;
        }
        return new C13398002342190360892(v, K5751602218013079365.v(F2), intValue);
    }

    @Override // dev.epro.r0.I3673563500665330592
    public Object h() {
        return new U15601475525309034314();
    }

    @Override // dev.epro.r0.N123190348026444920
    public J12043550928838212009 i(M2547930385040280601 m2547930385040280601) {
        return new G6219617120344415229(new G5547415528770645763((Object) m2547930385040280601, (R4833348786910499294) null, (byte) 10), (byte) 5);
    }

    @Override // dev.epro.r0.Z8888095354249304160
    public Object k(E13808449687169887804 e13808449687169887804, Object obj) {
        U11450443558875589191 u11450443558875589191;
        C13398002342190360892 c13398002342190360892 = (C13398002342190360892) obj;
        G9506192477171422664 F = K5751602218013079365.F();
        F.add(Integer.valueOf(c13398002342190360892.a));
        R5670552972627103399 r5670552972627103399 = c13398002342190360892.b;
        F.add(Integer.valueOf(r5670552972627103399.size()));
        R5670552972627103399 r56705529726271033992 = c13398002342190360892.c;
        F.add(Integer.valueOf(r56705529726271033992.size()));
        int size = r5670552972627103399.size();
        int i = 0;
        while (true) {
            u11450443558875589191 = N6128695298966473235.i;
            if (i >= size) {
                break;
            }
            F.add(u11450443558875589191.k(e13808449687169887804, r5670552972627103399.get(i)));
            i++;
        }
        int size2 = r56705529726271033992.size();
        for (int i2 = 0; i2 < size2; i2++) {
            F.add(u11450443558875589191.k(e13808449687169887804, r56705529726271033992.get(i2)));
        }
        return K5751602218013079365.v(F);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "SharingStarted.Lazily";
            case 5:
                int hashCode = hashCode();
                M9216324016624295870.q(16);
                String num = Integer.toString(hashCode, 16);
                num.getClass();
                return E12098517352909843120.m("CreationExtras.Key@", num, "<", J17975719213314763068.a(Application.class).c(), ">");
            default:
                return super.toString();
        }
    }

    @Override // dev.epro.r0.A6650193808056408155
    public void b() {
    }

    public /* synthetic */ O12545633033254628644(byte b) {
        this.a = b;
    }

    @Override // dev.epro.r0.A6650193808056408155
    public void a(String str, JSONObject jSONObject) {
        if ("attest".equals(str)) {
            try {
                String string = jSONObject.getString("mechanism");
                String string2 = jSONObject.getString("version");
                HashMap a = c72.a(jSONObject.getJSONObject("attestationArgs"));
                a.put("version", string2);
                U8836654130139556418.f(ib1.b.a.getApplicationContext(), string, new c7(a));
            } catch (Exception unused) {
            }
        }
    }

    @Override // dev.epro.r0.B4259731004323267459
    public Object a(int i) {
        km1 a = km1.a(i);
        return a == null ? km1.UNRECOGNIZED : a;
    }

    @Override // dev.epro.r0.A6650193808056408155
    public String a() {
        return "omidJsAttestationListener";
    }
}
