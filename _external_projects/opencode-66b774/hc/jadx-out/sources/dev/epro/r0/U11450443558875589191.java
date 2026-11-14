package dev.epro.r0;

import ads_mobile_sdk.bm3;
import ads_mobile_sdk.cu0;
import ads_mobile_sdk.tu;
import ads_mobile_sdk.wp;
import ads_mobile_sdk.xv0;
import ads_mobile_sdk.yi1;
import ads_mobile_sdk.zt3;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U11450443558875589191 implements C2811124483977556747, Z8888095354249304160, W14715101850940949422, H2380759164981958837, O313374706087262796, B4259731004323267459, R12081023847482212386, A10930401833958772877, I3673563500665330592 {
    public final /* synthetic */ byte a;

    public /* synthetic */ U11450443558875589191(byte b) {
        this.a = b;
    }

    public static bm3 d(Object obj) {
        cu0 cu0Var = (cu0) obj;
        bm3 bm3Var = cu0Var.b;
        if (bm3Var != bm3.f) {
            return bm3Var;
        }
        bm3 bm3VarB = bm3.b();
        cu0Var.b = bm3VarB;
        return bm3VarB;
    }

    public static boolean e(int i, E17564419012940707302 e17564419012940707302, Object obj) throws yi1 {
        int i2 = e17564419012940707302.b;
        tu tuVar = (tu) e17564419012940707302.e;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            e17564419012940707302.b(0);
            ((bm3) obj).a(i3 << 3, Long.valueOf(tuVar.l()));
            return true;
        }
        if (i4 == 1) {
            e17564419012940707302.b(1);
            ((bm3) obj).a((i3 << 3) | 1, Long.valueOf(tuVar.i()));
            return true;
        }
        if (i4 == 2) {
            e17564419012940707302.b(2);
            ((bm3) obj).a((i3 << 3) | 2, tuVar.e());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                Z3383101362411723454.o("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            if (i4 != 5) {
                Z3383101362411723454.v();
                return false;
            }
            e17564419012940707302.b(5);
            ((bm3) obj).a(5 | (i3 << 3), Integer.valueOf(tuVar.h()));
            return true;
        }
        bm3 bm3VarB = bm3.b();
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            Z3383101362411723454.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (e17564419012940707302.a() != Integer.MAX_VALUE && e(i7, e17564419012940707302, bm3VarB)) {
        }
        if (i6 != e17564419012940707302.b) {
            Z3383101362411723454.o("Protocol message end-group tag did not match expected tag.");
            return false;
        }
        if (bm3VarB.e) {
            bm3VarB.e = false;
        }
        ((bm3) obj).a(i5 | 3, bm3VarB);
        return true;
    }

    @Override // dev.epro.r0.B4259731004323267459
    public Object a(int i) {
        Object obj = null;
        switch (this.a) {
            case 12:
                switch (i) {
                    case 0:
                        obj = xv0.FORMAT_UNKNOWN;
                        break;
                    case 1:
                        obj = xv0.FORMAT_BANNER;
                        break;
                    case 2:
                        obj = xv0.FORMAT_INTERSTITIAL;
                        break;
                    case 3:
                        obj = xv0.FORMAT_REWARDED;
                        break;
                    case 4:
                        obj = xv0.FORMAT_REWARDED_INTERSTITIAL;
                        break;
                    case 5:
                        obj = xv0.FORMAT_APP_OPEN;
                        break;
                    case 6:
                        obj = xv0.FORMAT_NATIVE;
                        break;
                    case 7:
                        obj = xv0.FORMAT_ICON;
                        break;
                    case 8:
                        obj = xv0.FORMAT_SWIPEABLE_INTERSTITIAL;
                        break;
                }
                return obj == null ? xv0.UNRECOGNIZED : obj;
            default:
                wp wpVar = wp.UNKNOWN;
                if (i == 0) {
                    obj = wpVar;
                } else if (i == 1) {
                    obj = wp.COLLECTED_BIDDING_SIGNAL;
                }
                return obj == null ? wpVar : obj;
        }
    }

    @Override // dev.epro.r0.C2811124483977556747
    public boolean b(F6942723054099263096 f6942723054099263096, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                ((S4170173850086311843) f6942723054099263096.b).d();
                Object objA = ((S4170173850086311843) f6942723054099263096.b).a();
                objA.getClass();
                Parcelable parcelable = (Parcelable) objA;
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                e.toString();
                return false;
            }
        }
        ClipDescription description = ((S4170173850086311843) f6942723054099263096.b).getDescription();
        S4170173850086311843 s4170173850086311843 = (S4170173850086311843) f6942723054099263096.b;
        new ClipData(description, new ClipData.Item(s4170173850086311843.b()));
        s4170173850086311843.getDescription();
        s4170173850086311843.e();
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        return false;
    }

    @Override // dev.epro.r0.A10930401833958772877
    public void c(D14731132657808549702 d14731132657808549702) {
        "Failed to load and cache a form, error=".concat(String.valueOf(d14731132657808549702.b));
    }

    @Override // dev.epro.r0.Z8888095354249304160
    public Object f(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        obj2.getClass();
        int iIntValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        obj3.getClass();
        String str = (String) obj3;
        Object obj4 = list.get(2);
        obj4.getClass();
        String str2 = (String) obj4;
        Object obj5 = list.get(3);
        obj5.getClass();
        int iIntValue2 = ((Integer) obj5).intValue();
        Object obj6 = list.get(4);
        obj6.getClass();
        long jD = T1335862270807194835.d(iIntValue2, ((Integer) obj6).intValue());
        Object obj7 = list.get(5);
        obj7.getClass();
        int iIntValue3 = ((Integer) obj7).intValue();
        Object obj8 = list.get(6);
        obj8.getClass();
        long jD2 = T1335862270807194835.d(iIntValue3, ((Integer) obj8).intValue());
        Object obj9 = list.get(7);
        obj9.getClass();
        return new N6128695298966473235(iIntValue, str, str2, jD, jD2, ((Long) obj9).longValue(), false, 64);
    }

    @Override // dev.epro.r0.I3673563500665330592
    public Object h() {
        L10699316803831699764 l10699316803831699764 = L7597948271951285043.b;
        Q3791352212346016950.m(l10699316803831699764);
        return new Y15841630011871852334(l10699316803831699764);
    }

    @Override // dev.epro.r0.Z8888095354249304160
    public Object k(E13808449687169887804 e13808449687169887804, Object obj) {
        N6128695298966473235 n6128695298966473235 = (N6128695298966473235) obj;
        Integer numValueOf = Integer.valueOf(n6128695298966473235.a);
        String str = n6128695298966473235.b;
        String str2 = n6128695298966473235.c;
        long j = n6128695298966473235.d;
        int i = F12478849263529740365.c;
        Integer numValueOf2 = Integer.valueOf((int) (j >> 32));
        Integer numValueOf3 = Integer.valueOf((int) (j & 4294967295L));
        long j2 = n6128695298966473235.e;
        return K5751602218013079365.V(numValueOf, str, str2, numValueOf2, numValueOf3, Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (4294967295L & j2)), Long.valueOf(n6128695298966473235.f));
    }

    public String toString() {
        switch (this.a) {
            case 5:
                int iHashCode = hashCode();
                M9216324016624295870.q(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return E12098517352909843120.m("CreationExtras.Key@", string, "<", J17975719213314763068.a(String.class).c(), ">");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ U11450443558875589191(Object obj, byte b) {
        this.a = b;
    }

    @Override // dev.epro.r0.O313374706087262796
    public byte a(zt3 zt3Var, int i) {
        return zt3Var.a(i);
    }

    @Override // dev.epro.r0.O313374706087262796
    public zt3 a(zt3 zt3Var, int i, int i2) {
        byte[] bArr;
        if (i >= 0 && i <= i2) {
            byte[] bArr2 = zt3Var.a;
            if (i2 <= bArr2.length) {
                if (i > i2 || i2 > bArr2.length) {
                    throw new IndexOutOfBoundsException();
                }
                int i3 = i2 - i;
                if (i3 == 0) {
                    bArr = new byte[0];
                } else {
                    byte[] bArr3 = new byte[i3];
                    System.arraycopy(bArr2, i, bArr3, 0, i3);
                    bArr = bArr3;
                }
                return new zt3(bArr);
            }
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // dev.epro.r0.O313374706087262796
    public O313374706087262796 a() {
        return new U11450443558875589191((byte) 11);
    }
}
