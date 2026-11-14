package dev.epro.r0;

import ads_mobile_sdk.c7;
import ads_mobile_sdk.ib1;
import ads_mobile_sdk.y11;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public abstract class T3224757362656795885 {
    public static Z7022156542152740569 a;

    static {
        izmyclvb.qgayjvbiagej2(1408);
    }

    public static final long a(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final I16631908410500040363 b(y11 y11Var) {
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        I16631908410500040363 i166319084105000403632 = new I16631908410500040363();
        i166319084105000403632.t("uri", y11Var.a.toString());
        i166319084105000403632.t("verb", y11Var.b);
        i16631908410500040363.q("firstline", i166319084105000403632);
        Map map = y11Var.c;
        if (!map.isEmpty()) {
            P16422848101170923038 p16422848101170923038 = new P16422848101170923038();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                I16631908410500040363 i166319084105000403633 = new I16631908410500040363();
                i166319084105000403633.t("name", str);
                i166319084105000403633.t("value", str2);
                p16422848101170923038.q(i166319084105000403633);
            }
            i16631908410500040363.q("headers", p16422848101170923038);
        }
        byte[] bArr = y11Var.d;
        if (bArr != null) {
            byte[] bytes = bArr.toString().getBytes(F16059529287866721367.a);
            bytes.getClass();
            i16631908410500040363.t("body", Base64.encodeToString(bytes, 0));
        }
        return i16631908410500040363;
    }

    public static void c(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter("method");
            if (TextUtils.isEmpty(queryParameter)) {
                uri.toString();
                return;
            }
            if (queryParameter.hashCode() == -1407254715 && queryParameter.equals("attest")) {
                HashMap hashMap = new HashMap();
                for (String str : uri.getQueryParameterNames()) {
                    hashMap.put(str, uri.getQueryParameter(str));
                }
                try {
                    U8836654130139556418.f(ib1.b.a.getApplicationContext(), (String) hashMap.get("mechanism"), new c7(hashMap));
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            uri.toString();
        }
    }

    public static void d(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        S10973172697741180971.j("ByteBuffer byte order must be little endian");
    }

    public static final N3331004317457690805 e(R16749699847173633337 r16749699847173633337) {
        D10130052429559023062 d10130052429559023062;
        Y8564331055586212282 y8564331055586212282 = new Y8564331055586212282();
        U1554499319261669842.u(r16749699847173633337, N11453512532534411282.a, new K13841493441907392258(new K13841493441907392258((Object) y8564331055586212282, (byte) 15), new C9424689592673022017(1, y8564331055586212282, Y8564331055586212282.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, (byte) 4)));
        U9803441765912152712 u9803441765912152712 = new U9803441765912152712();
        U9803441765912152712 u98034417659121527122 = y8564331055586212282.a;
        Object[] objArr = u98034417659121527122.a;
        int i = u98034417659121527122.b;
        byte b = 0;
        int i2 = 0;
        boolean z = true;
        F4266814510741967107 f4266814510741967107 = null;
        while (true) {
            d10130052429559023062 = D10130052429559023062.b;
            if (i2 >= i) {
                break;
            }
            F4266814510741967107 f42668145107419671072 = (F4266814510741967107) objArr[i2];
            if (!z || f42668145107419671072 != d10130052429559023062) {
                if (f42668145107419671072 != d10130052429559023062 || f4266814510741967107 != d10130052429559023062) {
                    if (f42668145107419671072 != d10130052429559023062) {
                        U9803441765912152712 u98034417659121527123 = y8564331055586212282.b;
                        Object[] objArr2 = u98034417659121527123.a;
                        int i3 = u98034417659121527123.b;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (((Boolean) ((F4096073349764486348) objArr2[i4]).invoke(f42668145107419671072)).booleanValue()) {
                            }
                        }
                    }
                    u9803441765912152712.a(f42668145107419671072);
                    z = false;
                    f4266814510741967107 = f42668145107419671072;
                }
                z = false;
                break;
            }
            i2++;
        }
        if (((F4266814510741967107) (u9803441765912152712.h() ? null : u9803441765912152712.a[u9803441765912152712.b - 1])) == d10130052429559023062) {
            u9803441765912152712.k(u9803441765912152712.b - 1);
        }
        K7217096618580727896 k7217096618580727896 = u9803441765912152712.c;
        if (k7217096618580727896 == null) {
            k7217096618580727896 = new K7217096618580727896(u9803441765912152712, b);
            u9803441765912152712.c = k7217096618580727896;
        }
        return new N3331004317457690805(k7217096618580727896);
    }

    public static final native AbstractMap f(Map map);

    public static C16290937579972779475 g(Y12887846282176508602 y12887846282176508602, int i) {
        int i2;
        if (i < 0 || i > 65535) {
            S10973172697741180971.j(G6547577305291411977.n(i, "maxCommentSize: "));
            return null;
        }
        long size = y12887846282176508602.size();
        if (size >= 22) {
            int min = ((int) Math.min(i, size - 22)) + 22;
            long j = size - min;
            ByteBuffer b = y12887846282176508602.b(min, j);
            b.order(ByteOrder.LITTLE_ENDIAN);
            d(b);
            int capacity = b.capacity();
            if (capacity >= 22) {
                int i3 = capacity - 22;
                int min2 = Math.min(i3, 65535);
                for (int i4 = 0; i4 <= min2; i4++) {
                    i2 = i3 - i4;
                    if (b.getInt(i2) == 101010256 && (b.getShort(i2 + 20) & 65535) == i4) {
                        break;
                    }
                }
            }
            i2 = -1;
            if (i2 != -1) {
                b.position(i2);
                ByteBuffer slice = b.slice();
                slice.order(ByteOrder.LITTLE_ENDIAN);
                return new C16290937579972779475(slice, Long.valueOf(j + i2));
            }
        }
        return null;
    }

    public static final X17453750288186724334 h(Object obj) {
        if (obj != O4077903568229246.g) {
            return (X17453750288186724334) obj;
        }
        S10973172697741180971.m("Does not contain segment");
        return null;
    }

    public static final boolean i(Object obj) {
        return obj == O4077903568229246.g;
    }

    public static boolean j(byte b) {
        return b > -65;
    }

    public static final native AbstractMap k(Map map, Map map2);

    public static ArrayList l(Y12887846282176508602 y12887846282176508602, J13328905385734298453 j13328905385734298453) {
        long j = j13328905385734298453.b;
        if (j > 2147483647L) {
            throw new C15632080896631311437(E12098517352909843120.k(j, "ZIP Central Directory too large: "));
        }
        long j2 = j13328905385734298453.a;
        ByteBuffer b = y12887846282176508602.b((int) j, j2);
        b.order(ByteOrder.LITTLE_ENDIAN);
        int i = j13328905385734298453.c;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            int position = b.position();
            try {
                X13396380553427713373 b2 = X13396380553427713373.b(b);
                if (!b2.g.endsWith("/")) {
                    arrayList.add(b2);
                }
            } catch (G3596274300958059526 e) {
                throw new C15632080896631311437("Malformed ZIP Central Directory record #" + (i2 + 1) + " at file offset " + (j2 + position), e);
            }
        }
        return arrayList;
    }

    public static final native void m(String str, String str2, Map map);

    public static final native Object n(Z6379685802376252086 z6379685802376252086, M755325389802720773 m755325389802720773, L12602321637077960189 l12602321637077960189, Q4931646073987916205 q4931646073987916205, K14749510448791472029 k14749510448791472029);

    public static void o(ByteBuffer byteBuffer, long j) {
        d(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j < 0 || j > 4294967295L) {
            S10973172697741180971.j(E12098517352909843120.k(j, "uint32 value of out range: "));
        } else {
            byteBuffer.putInt(position, (int) j);
        }
    }

    public static final void p(CharSequence charSequence, char[] cArr, int i, int i2, int i3) {
        if (charSequence instanceof C8185053590072587931) {
            p(((C8185053590072587931) charSequence).c, cArr, i, i2, i3);
            return;
        }
        while (i2 < i3) {
            cArr[i] = charSequence.charAt(i2);
            i2++;
            i++;
        }
    }

    public static final native void q(Q7430090668634766253 q7430090668634766253);

    public static final native Object r(Map map, B13729205492206812220 b13729205492206812220);
}
