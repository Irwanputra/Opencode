package p034.p086.p087.p088;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p034.p086.p087.C1558;
import p034.p086.p087.p088.C1544;
import p034.p086.p087.p088.p089.AbstractC1530;
import p034.p086.p087.p088.p089.C1525;
import p034.p086.p087.p088.p089.C1528;
import p034.p086.p087.p088.p089.C1532;
import p034.p086.p087.p088.p089.C1534;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1520 extends C1521 {

    /* renamed from: く〱なおぎ, reason: contains not printable characters */
    public int f7025;

    /* renamed from: ぺぃつぢぼ, reason: contains not printable characters */
    public int f7033;

    /* renamed from: 〻しざ〹おま, reason: contains not printable characters */
    public C1525 f7019 = new C1525(this);

    /* renamed from: 〻はぎっぼ, reason: contains not printable characters */
    public C1534 f7021 = new C1534(this);

    /* renamed from: びがえ〱な, reason: contains not printable characters */
    public C1525.InterfaceC1526 f7031 = null;

    /* renamed from: かちして〹づ, reason: contains not printable characters */
    public boolean f7024 = false;

    /* renamed from: はぁとそぎ, reason: contains not printable characters */
    public C1558 f7030 = new C1558();

    /* renamed from: ごまぉてう, reason: contains not printable characters */
    public int f7026 = 0;

    /* renamed from: ぷちぅぐね, reason: contains not printable characters */
    public int f7032 = 0;

    /* renamed from: ぺでどぜべ, reason: contains not printable characters */
    public C1514[] f7034 = new C1514[4];

    /* renamed from: 〻えぱひがこ, reason: contains not printable characters */
    public C1514[] f7018 = new C1514[4];

    /* renamed from: 〴ぐち〱へ, reason: contains not printable characters */
    public int f7017 = 257;

    /* renamed from: づあてぐく, reason: contains not printable characters */
    public boolean f7027 = false;

    /* renamed from: にぷきなせこ, reason: contains not printable characters */
    public boolean f7029 = false;

    /* renamed from: え〱さぽぜ, reason: contains not printable characters */
    public WeakReference<C1517> f7023 = null;

    /* renamed from: づおぴ〱いづ, reason: contains not printable characters */
    public WeakReference<C1517> f7028 = null;

    /* renamed from: いおてぢび, reason: contains not printable characters */
    public WeakReference<C1517> f7022 = null;

    /* renamed from: 〳に〴あぽ, reason: contains not printable characters */
    public WeakReference<C1517> f7016 = null;

    /* renamed from: 〻だくけはく, reason: contains not printable characters */
    public C1525.C1527 f7020 = new C1525.C1527();

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public static boolean m3339(C1544 c1544, C1525.InterfaceC1526 interfaceC1526, C1525.C1527 c1527, int i) {
        int i2;
        int i3;
        C1544.EnumC1545 enumC1545 = C1544.EnumC1545.WRAP_CONTENT;
        C1544.EnumC1545 enumC15452 = C1544.EnumC1545.FIXED;
        if (interfaceC1526 == null) {
            return false;
        }
        c1527.f7088 = c1544.m3424();
        c1527.f7084 = c1544.m3430();
        c1527.f7087 = c1544.m3438();
        c1527.f7091 = c1544.m3418();
        c1527.f7092 = false;
        c1527.f7086 = i;
        C1544.EnumC1545 enumC15453 = c1527.f7088;
        C1544.EnumC1545 enumC15454 = C1544.EnumC1545.MATCH_CONSTRAINT;
        boolean z = enumC15453 == enumC15454;
        boolean z2 = c1527.f7084 == enumC15454;
        boolean z3 = z && c1544.f7194 > 0.0f;
        boolean z4 = z2 && c1544.f7194 > 0.0f;
        if (z && c1544.m3413(0) && c1544.f7207 == 0 && !z3) {
            c1527.f7088 = enumC1545;
            if (z2 && c1544.f7218 == 0) {
                c1527.f7088 = enumC15452;
            }
            z = false;
        }
        if (z2 && c1544.m3413(1) && c1544.f7218 == 0 && !z4) {
            c1527.f7084 = enumC1545;
            if (z && c1544.f7207 == 0) {
                c1527.f7084 = enumC15452;
            }
            z2 = false;
        }
        if (c1544.mo3315()) {
            c1527.f7088 = enumC15452;
            z = false;
        }
        if (c1544.mo3319()) {
            c1527.f7084 = enumC15452;
            z2 = false;
        }
        if (z3) {
            if (c1544.f7231[0] == 4) {
                c1527.f7088 = enumC15452;
            } else if (!z2) {
                if (c1527.f7084 == enumC15452) {
                    i3 = c1527.f7091;
                } else {
                    c1527.f7088 = enumC1545;
                    ((ConstraintLayout.C0127) interfaceC1526).m318(c1544, c1527);
                    i3 = c1527.f7090;
                }
                c1527.f7088 = enumC15452;
                int i4 = c1544.f7192;
                c1527.f7087 = (int) ((i4 == 0 || i4 == -1) ? c1544.f7194 * i3 : c1544.f7194 / i3);
            }
        }
        if (z4) {
            if (c1544.f7231[1] == 4) {
                c1527.f7084 = enumC15452;
            } else if (!z) {
                if (c1527.f7088 == enumC15452) {
                    i2 = c1527.f7087;
                } else {
                    c1527.f7084 = enumC1545;
                    ((ConstraintLayout.C0127) interfaceC1526).m318(c1544, c1527);
                    i2 = c1527.f7089;
                }
                c1527.f7084 = enumC15452;
                int i5 = c1544.f7192;
                c1527.f7091 = (int) ((i5 == 0 || i5 == -1) ? i2 / c1544.f7194 : i2 * c1544.f7194);
            }
        }
        ((ConstraintLayout.C0127) interfaceC1526).m318(c1544, c1527);
        c1544.m3416(c1527.f7089);
        c1544.m3421(c1527.f7090);
        c1544.f7224 = c1527.f7083;
        c1544.m3419(c1527.f7085);
        c1527.f7086 = 0;
        return c1527.f7092;
    }

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public void m3340(C1525.InterfaceC1526 interfaceC1526) {
        this.f7031 = interfaceC1526;
        this.f7021.f7117 = interfaceC1526;
    }

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public void m3341(C1517 c1517) {
        WeakReference<C1517> weakReference = this.f7022;
        if (weakReference == null || weakReference.get() == null || c1517.m3333() > this.f7022.get().m3333()) {
            this.f7022 = new WeakReference<>(c1517);
        }
    }

    @Override // p034.p086.p087.p088.C1521, p034.p086.p087.p088.C1544
    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public void mo3342() {
        this.f7030.m3486();
        this.f7033 = 0;
        this.f7025 = 0;
        super.mo3342();
    }

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public void m3343() {
        this.f7021.f7112 = true;
    }

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public void m3344(int i) {
        this.f7017 = i;
        C1558.f7303 = m3350(512);
    }

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public void m3345(C1517 c1517) {
        WeakReference<C1517> weakReference = this.f7023;
        if (weakReference == null || weakReference.get() == null || c1517.m3333() > this.f7023.get().m3333()) {
            this.f7023 = new WeakReference<>(c1517);
        }
    }

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public void m3346(C1517 c1517) {
        WeakReference<C1517> weakReference = this.f7016;
        if (weakReference == null || weakReference.get() == null || c1517.m3333() > this.f7016.get().m3333()) {
            this.f7016 = new WeakReference<>(c1517);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x065b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x05d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v15 */
    @Override // p034.p086.p087.p088.C1521
    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo3347() {
        /*
            Method dump skipped, instructions count: 2261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p086.p087.p088.C1520.mo3347():void");
    }

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public boolean m3348(boolean z, int i) {
        C1528 c1528;
        int i2;
        boolean z2;
        C1528 c15282;
        int m3418;
        C1534 c1534 = this.f7021;
        C1544.EnumC1545 enumC1545 = C1544.EnumC1545.MATCH_PARENT;
        C1544.EnumC1545 enumC15452 = C1544.EnumC1545.WRAP_CONTENT;
        C1544.EnumC1545 enumC15453 = C1544.EnumC1545.FIXED;
        boolean z3 = true;
        boolean z4 = z & true;
        C1544.EnumC1545 m3415 = c1534.f7115.m3415(0);
        C1544.EnumC1545 m34152 = c1534.f7115.m3415(1);
        int m3409 = c1534.f7115.m3409();
        int m3417 = c1534.f7115.m3417();
        if (z4 && (m3415 == enumC15452 || m34152 == enumC15452)) {
            Iterator<AbstractC1530> it = c1534.f7116.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC1530 next = it.next();
                if (next.f7101 == i && !next.mo3379()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && m3415 == enumC15452) {
                    C1520 c1520 = c1534.f7115;
                    c1520.f7206[0] = enumC15453;
                    c1520.m3416(c1534.m3395(c1520, 0));
                    C1520 c15202 = c1534.f7115;
                    c15282 = c15202.f7225.f7100;
                    m3418 = c15202.m3438();
                    c15282.mo3373(m3418);
                }
            } else if (z4 && m34152 == enumC15452) {
                C1520 c15203 = c1534.f7115;
                c15203.f7206[1] = enumC15453;
                c15203.m3421(c1534.m3395(c15203, 1));
                C1520 c15204 = c1534.f7115;
                c15282 = c15204.f7205.f7100;
                m3418 = c15204.m3418();
                c15282.mo3373(m3418);
            }
        }
        C1520 c15205 = c1534.f7115;
        C1544.EnumC1545[] enumC1545Arr = c15205.f7206;
        if (i == 0) {
            if (enumC1545Arr[0] == enumC15453 || enumC1545Arr[0] == enumC1545) {
                int m3438 = c15205.m3438() + m3409;
                c1534.f7115.f7225.f7103.mo3373(m3438);
                c1528 = c1534.f7115.f7225.f7100;
                i2 = m3438 - m3409;
                c1528.mo3373(i2);
                z2 = true;
            }
            z2 = false;
        } else {
            if (enumC1545Arr[1] == enumC15453 || enumC1545Arr[1] == enumC1545) {
                int m34182 = c15205.m3418() + m3417;
                c1534.f7115.f7205.f7103.mo3373(m34182);
                c1528 = c1534.f7115.f7205.f7100;
                i2 = m34182 - m3417;
                c1528.mo3373(i2);
                z2 = true;
            }
            z2 = false;
        }
        c1534.m3390();
        Iterator<AbstractC1530> it2 = c1534.f7116.iterator();
        while (it2.hasNext()) {
            AbstractC1530 next2 = it2.next();
            if (next2.f7101 == i && (next2.f7095 != c1534.f7115 || next2.f7096)) {
                next2.mo3375();
            }
        }
        Iterator<AbstractC1530> it3 = c1534.f7116.iterator();
        while (it3.hasNext()) {
            AbstractC1530 next3 = it3.next();
            if (next3.f7101 == i && (z2 || next3.f7095 != c1534.f7115)) {
                if (!next3.f7094.f7125 || !next3.f7103.f7125 || (!(next3 instanceof C1532) && !next3.f7100.f7125)) {
                    z3 = false;
                    break;
                }
            }
        }
        c1534.f7115.m3432(m3415);
        c1534.f7115.m3426(m34152);
        return z3;
    }

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public boolean m3349(C1558 c1558) {
        C1544.EnumC1545 enumC1545 = C1544.EnumC1545.FIXED;
        C1544.EnumC1545 enumC15452 = C1544.EnumC1545.WRAP_CONTENT;
        boolean m3350 = m3350(64);
        mo3316(c1558, m3350);
        int size = this.f7035.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C1544 c1544 = this.f7035.get(i);
            boolean[] zArr = c1544.f7166;
            zArr[0] = false;
            zArr[1] = false;
            if (c1544 instanceof C1519) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C1544 c15442 = this.f7035.get(i2);
                if (c15442 instanceof C1519) {
                    C1519 c1519 = (C1519) c15442;
                    for (int i3 = 0; i3 < c1519.f7242; i3++) {
                        C1544 c15443 = c1519.f7243[i3];
                        int i4 = c1519.f7012;
                        if (i4 == 0 || i4 == 1) {
                            c15443.f7166[0] = true;
                        } else if (i4 == 2 || i4 == 3) {
                            c15443.f7166[1] = true;
                        }
                    }
                }
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            C1544 c15444 = this.f7035.get(i5);
            if (c15444.m3427()) {
                c15444.mo3316(c1558, m3350);
            }
        }
        if (C1558.f7303) {
            HashSet<C1544> hashSet = new HashSet<>();
            for (int i6 = 0; i6 < size; i6++) {
                C1544 c15445 = this.f7035.get(i6);
                if (!c15445.m3427()) {
                    hashSet.add(c15445);
                }
            }
            m3437(this, c1558, hashSet, m3424() == enumC15452 ? 0 : 1, false);
            Iterator<C1544> it = hashSet.iterator();
            while (it.hasNext()) {
                C1544 next = it.next();
                C1516.m3322(this, c1558, next);
                next.mo3316(c1558, m3350);
            }
        } else {
            for (int i7 = 0; i7 < size; i7++) {
                C1544 c15446 = this.f7035.get(i7);
                if (c15446 instanceof C1520) {
                    C1544.EnumC1545[] enumC1545Arr = c15446.f7206;
                    C1544.EnumC1545 enumC15453 = enumC1545Arr[0];
                    C1544.EnumC1545 enumC15454 = enumC1545Arr[1];
                    if (enumC15453 == enumC15452) {
                        enumC1545Arr[0] = enumC1545;
                    }
                    if (enumC15454 == enumC15452) {
                        enumC1545Arr[1] = enumC1545;
                    }
                    c15446.mo3316(c1558, m3350);
                    if (enumC15453 == enumC15452) {
                        c15446.m3432(enumC15453);
                    }
                    if (enumC15454 == enumC15452) {
                        c15446.m3426(enumC15454);
                    }
                } else {
                    C1516.m3322(this, c1558, c15446);
                    if (!c15446.m3427()) {
                        c15446.mo3316(c1558, m3350);
                    }
                }
            }
        }
        if (this.f7026 > 0) {
            C2786.m4765(this, c1558, null, 0);
        }
        if (this.f7032 > 0) {
            C2786.m4765(this, c1558, null, 1);
        }
        return true;
    }

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public boolean m3350(int i) {
        return (this.f7017 & i) == i;
    }

    @Override // p034.p086.p087.p088.C1544
    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public void mo3351(boolean z, boolean z2) {
        super.mo3351(z, z2);
        int size = this.f7035.size();
        for (int i = 0; i < size; i++) {
            this.f7035.get(i).mo3351(z, z2);
        }
    }

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public void m3352(C1544 c1544, int i) {
        if (i == 0) {
            int i2 = this.f7026 + 1;
            C1514[] c1514Arr = this.f7018;
            if (i2 >= c1514Arr.length) {
                this.f7018 = (C1514[]) Arrays.copyOf(c1514Arr, c1514Arr.length * 2);
            }
            C1514[] c1514Arr2 = this.f7018;
            int i3 = this.f7026;
            c1514Arr2[i3] = new C1514(c1544, 0, this.f7024);
            this.f7026 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f7032 + 1;
            C1514[] c1514Arr3 = this.f7034;
            if (i4 >= c1514Arr3.length) {
                this.f7034 = (C1514[]) Arrays.copyOf(c1514Arr3, c1514Arr3.length * 2);
            }
            C1514[] c1514Arr4 = this.f7034;
            int i5 = this.f7032;
            c1514Arr4[i5] = new C1514(c1544, 1, this.f7024);
            this.f7032 = i5 + 1;
        }
    }
}
