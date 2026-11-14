package dev.epro.r0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.widget.EditText;
import android.widget.TextView;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F6942723054099263096 implements I1845098107738424918, P14572820171047441271, O16368343340005843063 {
    public static F6942723054099263096 c;
    public final /* synthetic */ byte a;
    public Object b;

    public F6942723054099263096(byte b) {
        this.a = b;
        Object obj = null;
        switch (b) {
            case 1:
                this.b = new X7482811339048806651(C12265524002282074474.f);
                break;
            case 10:
                this.b = null;
                break;
            case 12:
                this.b = T5910761665012682387.a();
                break;
            case 18:
                G17795399428317025709 g17795399428317025709 = new G17795399428317025709();
                this.b = g17795399428317025709;
                if (!g17795399428317025709.b) {
                    if (g17795399428317025709.c) {
                        M8835823653360628475.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    g17795399428317025709.a();
                    g17795399428317025709.c = true;
                    break;
                }
                break;
            case 25:
                byte b2 = 20;
                this.b = Build.VERSION.SDK_INT >= 28 ? new T15504973625601650233(b2) : new E17149812035295265804(b2);
                break;
            case 26:
                this.b = new A18377563779865231301(obj);
                break;
            default:
                this.b = U15853425786981391261.D(Looper.getMainLooper());
                break;
        }
    }

    public static T5398360193539863765 o(F6942723054099263096 f6942723054099263096, int i) {
        E17523205116624666034 e17523205116624666034 = (E17523205116624666034) f6942723054099263096.b;
        M4722199849958580248 m4722199849958580248H = T8598786036980488824.h();
        F4096073349764486348 f4096073349764486348E = m4722199849958580248H != null ? m4722199849958580248H.e() : null;
        M4722199849958580248 m4722199849958580248O = T8598786036980488824.o(m4722199849958580248H);
        try {
            O11472352839632764090 o11472352839632764090 = (O11472352839632764090) e17523205116624666034.f.getValue();
            T8598786036980488824.x(m4722199849958580248H, m4722199849958580248O, f4096073349764486348E);
            return e17523205116624666034.q.a(i, o11472352839632764090.j, e17523205116624666034.d, new X2899556981606350920(i, o11472352839632764090));
        } catch (Throwable th) {
            T8598786036980488824.x(m4722199849958580248H, m4722199849958580248O, f4096073349764486348E);
            throw th;
        }
    }

    public void a(H11725168162114556860 h11725168162114556860) {
        if (!h11725168162114556860.H()) {
            P753981624812481271.b("DepthSortedSet.add called on an unattached node");
        }
        ((X7482811339048806651) this.b).add(h11725168162114556860);
    }

    @Override // dev.epro.r0.P14572820171047441271
    public void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        for (MessageDigest messageDigest : (MessageDigest[]) this.b) {
            byteBuffer.position(iPosition);
            messageDigest.update(byteBuffer);
        }
    }

    @Override // dev.epro.r0.P14572820171047441271
    public void c(int i, byte[] bArr, int i2) {
        for (MessageDigest messageDigest : (MessageDigest[]) this.b) {
            messageDigest.update(bArr, 0, i2);
        }
    }

    public void d(String str) {
        C10251609400980016117 c10251609400980016117 = (C10251609400980016117) ((O12494175665883759871) ((I1632105416032993715) this.b).d).getValue();
        S3214537669496409879 s3214537669496409879 = (S3214537669496409879) c10251609400980016117.b.g(str);
        if (s3214537669496409879 == null) {
            return;
        }
        s3214537669496409879.c = true;
        S3214537669496409879 s32145376694964098792 = (S3214537669496409879) c10251609400980016117.b.l(str);
        if (s32145376694964098792 != null) {
            s32145376694964098792.b.a();
        }
    }

    public void e(byte b) {
        ((Parcel) this.b).writeByte(b);
    }

    public void f(float f) {
        ((Parcel) this.b).writeFloat(f);
    }

    public void g(long j) {
        long jB = J5593409210068682756.b(j);
        byte b = 0;
        if (!E6417708602094478350.a(jB, 0L)) {
            if (E6417708602094478350.a(jB, 4294967296L)) {
                b = 1;
            } else if (E6417708602094478350.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        e(b);
        if (E6417708602094478350.a(J5593409210068682756.b(j), 0L)) {
            return;
        }
        f(J5593409210068682756.c(j));
    }

    public Z12604781490060456085 h(String str) {
        if (Q6344330807969154194.f456o.b()) {
            return new Z12604781490060456085((ProfileBoundaryInterface) K5751602218013079365.w(ProfileBoundaryInterface.class, ((ProfileStoreBoundaryInterface) this.b).getOrCreateProfile(str)));
        }
        throw Q6344330807969154194.a();
    }

    public void i() {
        ((C10994625127000459680) this.b).t.I();
    }

    public N10542843603712830247 j(V10300877997588547986 v10300877997588547986, S7974369370986781936 s7974369370986781936) {
        long j;
        boolean z;
        long jK;
        A18377563779865231301 a18377563779865231301 = (A18377563779865231301) this.b;
        ArrayList arrayList = (ArrayList) v10300877997588547986.b;
        A18377563779865231301 a183775637798652313012 = new A18377563779865231301(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            R9761660112265475292 r9761660112265475292 = (R9761660112265475292) arrayList.get(i);
            long j2 = r9761660112265475292.a;
            X5227545958932849092 x5227545958932849092 = (X5227545958932849092) a18377563779865231301.b(j2);
            if (x5227545958932849092 == null) {
                j = r9761660112265475292.b;
                jK = r9761660112265475292.d;
                z = false;
            } else {
                long j3 = x5227545958932849092.a;
                j = j3;
                z = x5227545958932849092.c;
                jK = s7974369370986781936.K(x5227545958932849092.b);
            }
            long j4 = r9761660112265475292.a;
            int i2 = i;
            ArrayList arrayList2 = arrayList;
            int i3 = size;
            a183775637798652313012.d(j4, new N13196868278329319633(j4, r9761660112265475292.b, r9761660112265475292.d, r9761660112265475292.e, r9761660112265475292.f, j, jK, z, r9761660112265475292.g, r9761660112265475292.i, r9761660112265475292.j, r9761660112265475292.k, r9761660112265475292.l, r9761660112265475292.m));
            boolean z2 = r9761660112265475292.e;
            if (z2) {
                a18377563779865231301.d(j2, new X5227545958932849092(r9761660112265475292.b, r9761660112265475292.c, z2));
            } else {
                a18377563779865231301.e(j2);
            }
            i = i2 + 1;
            arrayList = arrayList2;
            size = i3;
        }
        return new N10542843603712830247(a183775637798652313012, v10300877997588547986);
    }

    public void k(Object obj, Object... objArr) {
        List listAsList = Arrays.asList(objArr);
        T5910761665012682387 t5910761665012682387 = (T5910761665012682387) this.b;
        if (obj == null) {
            StringBuilder sb = new StringBuilder("null key in entry: null=");
            Iterator it = listAsList.iterator();
            StringBuilder sb2 = new StringBuilder("[");
            boolean z = true;
            while (it.hasNext()) {
                if (!z) {
                    sb2.append(", ");
                }
                sb2.append(it.next());
                z = false;
            }
            sb2.append(']');
            sb.append(sb2.toString());
            throw new NullPointerException(sb.toString());
        }
        Collection collection = (Collection) t5910761665012682387.get(obj);
        if (collection != null) {
            for (Object obj2 : listAsList) {
                U15853425786981391261.x(obj, obj2);
                collection.add(obj2);
            }
            return;
        }
        Iterator it2 = listAsList.iterator();
        if (it2.hasNext()) {
            U5420740526844651015 u5420740526844651015A = U5420740526844651015.a();
            while (it2.hasNext()) {
                Object next = it2.next();
                U15853425786981391261.x(obj, next);
                u5420740526844651015A.add(next);
            }
            t5910761665012682387.put(obj, u5420740526844651015A);
        }
    }

    public boolean l(H11725168162114556860 h11725168162114556860) {
        if (!h11725168162114556860.H()) {
            P753981624812481271.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((X7482811339048806651) this.b).remove(h11725168162114556860);
    }

    @Override // dev.epro.r0.O16368343340005843063
    public void m(int i, Object obj) {
        if (i == 6 || i == 7 || i == 8) {
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i);
    }

    public ArrayList n(int i) {
        ArrayList arrayList = new ArrayList();
        W5896017744614017491 w5896017744614017491 = (W5896017744614017491) this.b;
        M4722199849958580248 m4722199849958580248H = T8598786036980488824.h();
        F4096073349764486348 f4096073349764486348E = m4722199849958580248H != null ? m4722199849958580248H.e() : null;
        M4722199849958580248 m4722199849958580248O = T8598786036980488824.o(m4722199849958580248H);
        try {
            K15976628200778816833 k15976628200778816833 = w5896017744614017491.b ? w5896017744614017491.c : (K15976628200778816833) w5896017744614017491.e.getValue();
            if (k15976628200778816833 != null) {
                A8284336046188466534 a8284336046188466534 = new A8284336046188466534();
                a8284336046188466534.a = 1;
                List list = (List) k15976628200778816833.k.invoke(Integer.valueOf(i));
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    H9390398899829886498 h9390398899829886498 = (H9390398899829886498) list.get(i2);
                    B14178846910827721115 b14178846910827721115 = w5896017744614017491.f564o;
                    int iIntValue = ((Number) h9390398899829886498.a).intValue();
                    long j = ((I16980768508151520658) h9390398899829886498.b).a;
                    V10300877997588547986 v10300877997588547986 = W5896017744614017491.w;
                    a8284336046188466534 = a8284336046188466534;
                    arrayList.add(b14178846910827721115.a(iIntValue, j, false, new G11323133580509801397((ArrayList) null, a8284336046188466534, list, i, k15976628200778816833)));
                }
            }
            T8598786036980488824.x(m4722199849958580248H, m4722199849958580248O, f4096073349764486348E);
            return arrayList;
        } catch (Throwable th) {
            T8598786036980488824.x(m4722199849958580248H, m4722199849958580248O, f4096073349764486348E);
            throw th;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return ((X7482811339048806651) this.b).toString();
            case 22:
                return "NavControllerViewModel(provider=" + ((I1632105416032993715) this.b) + ")";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ F6942723054099263096(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public F6942723054099263096(String str) {
        this.a = (byte) 19;
        this.b = Logger.getLogger(str);
    }

    public F6942723054099263096(TextView textView) {
        this.a = (byte) 7;
        this.b = new O7697661401786286612(textView);
    }

    public F6942723054099263096(EditText editText) {
        this.a = (byte) 6;
        this.b = new W8455343525638953052(editText, (byte) 23);
    }

    public F6942723054099263096(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = (byte) 13;
        if (Build.VERSION.SDK_INT >= 25) {
            this.b = new L12119018558356739237(uri, clipDescription, uri2);
        } else {
            this.b = new Q7316561721656982910((Object) uri, (Object) clipDescription, (Object) uri2, (byte) 23);
        }
    }
}
