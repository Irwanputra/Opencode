package p034.p086.p091.p092;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p034.p086.p090.C1572;
import p034.p086.p091.p092.AbstractC1587;
import p034.p086.p091.p092.AbstractC1609;
import p034.p086.p091.p092.AbstractC1626;
import p034.p086.p091.p093.AbstractC1651;
import p034.p086.p091.p093.C1654;
import p034.p086.p091.p093.C1656;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.のぷのちつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1643 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public AbstractC1651[] f7669;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f7670;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public HashMap<String, AbstractC1587> f7671;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public C1648[] f7674;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public String[] f7675;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public HashMap<String, AbstractC1626> f7676;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public int[] f7677;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public double[] f7678;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public View f7680;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int[] f7688;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public HashMap<String, AbstractC1609> f7692;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public double[] f7693;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public AbstractC1651 f7694;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f7679 = -1;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C1603 f7691 = new C1603();

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public C1603 f7684 = new C1603();

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C1625 f7687 = new C1625();

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public C1625 f7672 = new C1625();

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public float f7673 = Float.NaN;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public float f7695 = 0.0f;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public float f7685 = 1.0f;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f7683 = 4;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public float[] f7689 = new float[4];

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public ArrayList<C1603> f7681 = new ArrayList<>();

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public float[] f7682 = new float[1];

    /* renamed from: でどあくず, reason: contains not printable characters */
    public ArrayList<AbstractC1579> f7686 = new ArrayList<>();

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public int f7690 = -1;

    public C1643(View view) {
        this.f7680 = view;
        this.f7670 = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            String str = ((ConstraintLayout.LayoutParams) layoutParams).f899;
        }
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207(" start: x: ");
        m4207.append(this.f7691.f7551);
        m4207.append(" y: ");
        m4207.append(this.f7691.f7545);
        m4207.append(" end: x: ");
        m4207.append(this.f7684.f7551);
        m4207.append(" y: ");
        m4207.append(this.f7684.f7545);
        return m4207.toString();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m3578(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float m3580 = m3580(f, this.f7682);
        AbstractC1651[] abstractC1651Arr = this.f7669;
        int i = 0;
        if (abstractC1651Arr == null) {
            C1603 c1603 = this.f7684;
            float f4 = c1603.f7551;
            C1603 c16032 = this.f7691;
            float f5 = f4 - c16032.f7551;
            float f6 = c1603.f7545 - c16032.f7545;
            float f7 = c1603.f7543 - c16032.f7543;
            float f8 = (c1603.f7555 - c16032.f7555) + f6;
            fArr[0] = ((f7 + f5) * f2) + ((1.0f - f2) * f5);
            fArr[1] = (f8 * f3) + ((1.0f - f3) * f6);
            return;
        }
        double d = m3580;
        abstractC1651Arr[0].mo3596(d, this.f7678);
        this.f7669[0].mo3594(d, this.f7693);
        float f9 = this.f7682[0];
        while (true) {
            dArr = this.f7678;
            if (i >= dArr.length) {
                break;
            }
            double d2 = dArr[i];
            double d3 = f9;
            Double.isNaN(d3);
            dArr[i] = d2 * d3;
            i++;
        }
        AbstractC1651 abstractC1651 = this.f7694;
        if (abstractC1651 == null) {
            this.f7691.m3561(f2, f3, fArr, this.f7688, dArr, this.f7693);
            return;
        }
        double[] dArr2 = this.f7693;
        if (dArr2.length > 0) {
            abstractC1651.mo3594(d, dArr2);
            this.f7694.mo3596(d, this.f7678);
            this.f7691.m3561(f2, f3, fArr, this.f7688, this.f7678, this.f7693);
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final float m3579() {
        float[] fArr = new float[2];
        float f = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        float f2 = 0.0f;
        while (i < 100) {
            float f3 = i * f;
            double d3 = f3;
            C1654 c1654 = this.f7691.f7544;
            float f4 = Float.NaN;
            Iterator<C1603> it = this.f7681.iterator();
            float f5 = 0.0f;
            while (it.hasNext()) {
                C1603 next = it.next();
                C1654 c16542 = next.f7544;
                float f6 = f;
                if (c16542 != null) {
                    float f7 = next.f7553;
                    if (f7 < f3) {
                        f5 = f7;
                        c1654 = c16542;
                    } else if (Float.isNaN(f4)) {
                        f4 = next.f7553;
                    }
                }
                f = f6;
            }
            float f8 = f;
            if (c1654 != null) {
                if (Float.isNaN(f4)) {
                    f4 = 1.0f;
                }
                d3 = (((float) c1654.mo3603((f3 - f5) / r16)) * (f4 - f5)) + f5;
            }
            this.f7669[0].mo3594(d3, this.f7693);
            this.f7691.m3559(this.f7688, this.f7693, fArr, 0);
            if (i > 0) {
                double d4 = f2;
                double d5 = fArr[1];
                Double.isNaN(d5);
                double d6 = d2 - d5;
                double d7 = fArr[0];
                Double.isNaN(d7);
                double hypot = Math.hypot(d6, d - d7);
                Double.isNaN(d4);
                f2 = (float) (hypot + d4);
            }
            d = fArr[0];
            d2 = fArr[1];
            i++;
            f = f8;
        }
        return f2;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final float m3580(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.f7685;
            if (f3 != 1.0d) {
                float f4 = this.f7695;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = (f - f4) * f3;
                }
            }
        }
        C1654 c1654 = this.f7691.f7544;
        float f5 = Float.NaN;
        Iterator<C1603> it = this.f7681.iterator();
        while (it.hasNext()) {
            C1603 next = it.next();
            C1654 c16542 = next.f7544;
            if (c16542 != null) {
                float f6 = next.f7553;
                if (f6 < f) {
                    c1654 = c16542;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = next.f7553;
                }
            }
        }
        if (c1654 != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) c1654.mo3603(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) c1654.mo3602(d);
            }
        }
        return f;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m3581(C1603 c1603) {
        c1603.m3562((int) this.f7680.getX(), (int) this.f7680.getY(), this.f7680.getWidth(), this.f7680.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void m3582(int i, int i2, long j) {
        String str;
        String str2;
        String str3;
        String str4;
        ArrayList arrayList;
        Object obj;
        String str5;
        String str6;
        String str7;
        String str8;
        HashSet<String> hashSet;
        HashSet<String> hashSet2;
        Object obj2;
        Object obj3;
        C1643 c1643;
        Object obj4;
        Object obj5;
        Object obj6;
        C1623 c1623;
        String str9;
        String str10;
        String str11;
        Object obj7;
        HashMap<String, AbstractC1626> hashMap;
        Object obj8;
        Object obj9;
        String str12;
        Object obj10;
        String str13;
        String str14;
        char c;
        char c2;
        C1623 c16232;
        float f;
        Object obj11;
        Object obj12;
        String str15;
        Object obj13;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        char c3;
        AbstractC1626 c1641;
        Iterator<String> it;
        AbstractC1626 abstractC1626;
        String str23;
        String str24;
        double[] dArr;
        double[][] dArr2;
        String str25;
        Object obj14;
        HashSet<String> hashSet3;
        Iterator<String> it2;
        int i3;
        Object obj15;
        char c4;
        int i4;
        float f2;
        Iterator<String> it3;
        HashMap<String, Integer> hashMap2;
        Object obj16;
        Object obj17;
        char c5;
        AbstractC1609 c1612;
        Object obj18;
        C1572 c1572;
        Iterator<String> it4;
        Object obj19;
        String str26;
        String str27;
        String str28;
        String str29;
        HashSet<String> hashSet4;
        HashSet<String> hashSet5;
        Object obj20;
        Object obj21;
        char c6;
        AbstractC1587 c1601;
        Object obj22;
        AbstractC1587 abstractC1587;
        C1572 c15722;
        String str30;
        String str31;
        String str32;
        C1643 c16432 = this;
        new HashSet();
        HashSet<String> hashSet6 = new HashSet<>();
        HashSet<String> hashSet7 = new HashSet<>();
        HashSet<String> hashSet8 = new HashSet<>();
        HashMap<String, Integer> hashMap3 = new HashMap<>();
        int i5 = c16432.f7690;
        if (i5 != -1) {
            c16432.f7691.f7556 = i5;
        }
        C1625 c1625 = c16432.f7687;
        C1625 c16252 = c16432.f7672;
        String str33 = "alpha";
        if (c1625.m3570(c1625.f7633, c16252.f7633)) {
            hashSet7.add("alpha");
        }
        String str34 = "elevation";
        if (c1625.m3570(c1625.f7641, c16252.f7641)) {
            hashSet7.add("elevation");
        }
        int i6 = c1625.f7645;
        int i7 = c16252.f7645;
        if (i6 != i7 && c1625.f7639 == 0 && (i6 == 0 || i7 == 0)) {
            hashSet7.add("alpha");
        }
        String str35 = "rotation";
        if (c1625.m3570(c1625.f7643, c16252.f7643)) {
            hashSet7.add("rotation");
        }
        if (!Float.isNaN(c1625.f7636) || !Float.isNaN(c16252.f7636)) {
            hashSet7.add("transitionPathRotate");
        }
        boolean isNaN = Float.isNaN(c1625.f7637);
        String str36 = NotificationCompat.CATEGORY_PROGRESS;
        if (!isNaN || !Float.isNaN(c16252.f7637)) {
            hashSet7.add(NotificationCompat.CATEGORY_PROGRESS);
        }
        if (c1625.m3570(c1625.f7634, c16252.f7634)) {
            hashSet7.add("rotationX");
        }
        if (c1625.m3570(c1625.f7632, c16252.f7632)) {
            hashSet7.add("rotationY");
        }
        if (c1625.m3570(c1625.f7648, c16252.f7648)) {
            hashSet7.add("transformPivotX");
        }
        if (c1625.m3570(c1625.f7642, c16252.f7642)) {
            hashSet7.add("transformPivotY");
        }
        String str37 = "scaleX";
        if (c1625.m3570(c1625.f7647, c16252.f7647)) {
            hashSet7.add("scaleX");
        }
        Object obj23 = "rotationX";
        String str38 = "scaleY";
        if (c1625.m3570(c1625.f7635, c16252.f7635)) {
            hashSet7.add("scaleY");
        }
        Object obj24 = "rotationY";
        if (c1625.m3570(c1625.f7644, c16252.f7644)) {
            hashSet7.add("translationX");
        }
        Object obj25 = "translationX";
        String str39 = "translationY";
        if (c1625.m3570(c1625.f7646, c16252.f7646)) {
            hashSet7.add("translationY");
        }
        boolean m3570 = c1625.m3570(c1625.f7638, c16252.f7638);
        String str40 = "translationZ";
        if (m3570) {
            hashSet7.add("translationZ");
        }
        ArrayList<AbstractC1579> arrayList2 = c16432.f7686;
        if (arrayList2 != null) {
            Iterator<AbstractC1579> it5 = arrayList2.iterator();
            arrayList = null;
            while (it5.hasNext()) {
                Iterator<AbstractC1579> it6 = it5;
                AbstractC1579 next = it5.next();
                String str41 = str39;
                if (next instanceof C1577) {
                    C1577 c1577 = (C1577) next;
                    str30 = str40;
                    str31 = str36;
                    str32 = str37;
                    c16432.f7681.add((-Collections.binarySearch(c16432.f7681, r14)) - 1, new C1603(i, i2, c1577, c16432.f7691, c16432.f7684));
                    int i8 = c1577.f7697;
                    if (i8 != -1) {
                        c16432.f7679 = i8;
                    }
                } else {
                    str30 = str40;
                    str31 = str36;
                    str32 = str37;
                    if (next instanceof C1623) {
                        next.mo3534(hashSet8);
                    } else if (next instanceof C1581) {
                        next.mo3534(hashSet6);
                    } else if (next instanceof C1648) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add((C1648) next);
                    } else {
                        next.mo3535(hashMap3);
                        next.mo3534(hashSet7);
                    }
                }
                str39 = str41;
                it5 = it6;
                str37 = str32;
                str40 = str30;
                str36 = str31;
            }
            str = str40;
            str2 = str36;
            str3 = str39;
            str4 = str37;
        } else {
            str = "translationZ";
            str2 = NotificationCompat.CATEGORY_PROGRESS;
            str3 = "translationY";
            str4 = "scaleX";
            arrayList = null;
        }
        if (arrayList != null) {
            c16432.f7674 = (C1648[]) arrayList.toArray(new C1648[0]);
        }
        char c7 = 1;
        if (hashSet7.isEmpty()) {
            obj = obj25;
            str5 = str3;
            str6 = str4;
            str7 = str;
            str8 = str2;
            hashSet = hashSet7;
            hashSet2 = hashSet8;
            obj2 = obj23;
            obj3 = obj24;
        } else {
            c16432.f7671 = new HashMap<>();
            Iterator<String> it7 = hashSet7.iterator();
            while (it7.hasNext()) {
                String next2 = it7.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str42 = next2.split(",")[c7];
                    Iterator<AbstractC1579> it8 = c16432.f7686.iterator();
                    while (it8.hasNext()) {
                        AbstractC1579 next3 = it8.next();
                        Iterator<String> it9 = it7;
                        HashMap<String, C1572> hashMap4 = next3.f7474;
                        if (hashMap4 != null && (c15722 = hashMap4.get(str42)) != null) {
                            sparseArray.append(next3.f7473, c15722);
                        }
                        it7 = it9;
                    }
                    it4 = it7;
                    AbstractC1587.C1589 c1589 = new AbstractC1587.C1589(next2, sparseArray);
                    obj19 = obj25;
                    str26 = str3;
                    str28 = str;
                    str29 = str2;
                    hashSet4 = hashSet7;
                    hashSet5 = hashSet8;
                    abstractC1587 = c1589;
                    obj21 = obj24;
                    str27 = str4;
                    obj22 = obj23;
                } else {
                    it4 = it7;
                    switch (next2.hashCode()) {
                        case -1249320806:
                            obj19 = obj25;
                            str26 = str3;
                            str27 = str4;
                            str28 = str;
                            str29 = str2;
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            if (next2.equals(obj20)) {
                                c6 = 0;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case -1249320805:
                            obj19 = obj25;
                            str26 = str3;
                            str27 = str4;
                            str28 = str;
                            str29 = str2;
                            hashSet5 = hashSet8;
                            obj21 = obj24;
                            if (next2.equals(obj21)) {
                                hashSet4 = hashSet7;
                                obj20 = obj23;
                                c6 = 1;
                                break;
                            }
                            hashSet4 = hashSet7;
                            obj20 = obj23;
                            c6 = 65535;
                            break;
                        case -1225497657:
                            obj19 = obj25;
                            str26 = str3;
                            str27 = str4;
                            str28 = str;
                            str29 = str2;
                            if (next2.equals(obj19)) {
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c6 = 2;
                                break;
                            }
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            c6 = 65535;
                            break;
                        case -1225497656:
                            str26 = str3;
                            str27 = str4;
                            str28 = str;
                            str29 = str2;
                            if (next2.equals(str26)) {
                                hashSet5 = hashSet8;
                                obj21 = obj24;
                                obj19 = obj25;
                                hashSet4 = hashSet7;
                                obj20 = obj23;
                                c6 = 3;
                                break;
                            } else {
                                hashSet5 = hashSet8;
                                obj21 = obj24;
                                obj19 = obj25;
                                hashSet4 = hashSet7;
                                obj20 = obj23;
                                c6 = 65535;
                                break;
                            }
                        case -1225497655:
                            str27 = str4;
                            str28 = str;
                            str29 = str2;
                            if (next2.equals(str28)) {
                                obj19 = obj25;
                                str26 = str3;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c6 = 4;
                                break;
                            } else {
                                obj19 = obj25;
                                str26 = str3;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c6 = 65535;
                                break;
                            }
                        case -1001078227:
                            str27 = str4;
                            str29 = str2;
                            if (next2.equals(str29)) {
                                obj19 = obj25;
                                str26 = str3;
                                str28 = str;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c6 = 5;
                                break;
                            } else {
                                obj19 = obj25;
                                str26 = str3;
                                str28 = str;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c6 = 65535;
                                break;
                            }
                        case -908189618:
                            str27 = str4;
                            if (next2.equals(str27)) {
                                obj19 = obj25;
                                str26 = str3;
                                str28 = str;
                                str29 = str2;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c6 = 6;
                                break;
                            } else {
                                obj19 = obj25;
                                str26 = str3;
                                str28 = str;
                                str29 = str2;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c6 = 65535;
                                break;
                            }
                        case -908189617:
                            if (next2.equals("scaleY")) {
                                obj19 = obj25;
                                str26 = str3;
                                str27 = str4;
                                str28 = str;
                                str29 = str2;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c6 = 7;
                                break;
                            }
                            obj19 = obj25;
                            str26 = str3;
                            str27 = str4;
                            str28 = str;
                            str29 = str2;
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            c6 = 65535;
                            break;
                        case -797520672:
                            if (next2.equals("waveVariesBy")) {
                                obj19 = obj25;
                                str26 = str3;
                                str27 = str4;
                                str28 = str;
                                str29 = str2;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c6 = '\b';
                                break;
                            }
                            obj19 = obj25;
                            str26 = str3;
                            str27 = str4;
                            str28 = str;
                            str29 = str2;
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            c6 = 65535;
                            break;
                        case -760884510:
                            if (next2.equals("transformPivotX")) {
                                obj19 = obj25;
                                str26 = str3;
                                str27 = str4;
                                str28 = str;
                                str29 = str2;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c6 = '\t';
                                break;
                            }
                            obj19 = obj25;
                            str26 = str3;
                            str27 = str4;
                            str28 = str;
                            str29 = str2;
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            c6 = 65535;
                            break;
                        case -760884509:
                            if (next2.equals("transformPivotY")) {
                                obj19 = obj25;
                                str26 = str3;
                                str27 = str4;
                                str28 = str;
                                str29 = str2;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c6 = '\n';
                                break;
                            }
                            obj19 = obj25;
                            str26 = str3;
                            str27 = str4;
                            str28 = str;
                            str29 = str2;
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            c6 = 65535;
                            break;
                        case -40300674:
                            if (next2.equals("rotation")) {
                                obj19 = obj25;
                                str26 = str3;
                                str27 = str4;
                                str28 = str;
                                str29 = str2;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c6 = 11;
                                break;
                            }
                            obj19 = obj25;
                            str26 = str3;
                            str27 = str4;
                            str28 = str;
                            str29 = str2;
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            c6 = 65535;
                            break;
                        case -4379043:
                            if (next2.equals("elevation")) {
                                obj19 = obj25;
                                str26 = str3;
                                str27 = str4;
                                str28 = str;
                                str29 = str2;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c6 = '\f';
                                break;
                            }
                            obj19 = obj25;
                            str26 = str3;
                            str27 = str4;
                            str28 = str;
                            str29 = str2;
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            c6 = 65535;
                            break;
                        case 37232917:
                            if (next2.equals("transitionPathRotate")) {
                                obj19 = obj25;
                                str26 = str3;
                                str27 = str4;
                                str28 = str;
                                str29 = str2;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c6 = '\r';
                                break;
                            }
                            obj19 = obj25;
                            str26 = str3;
                            str27 = str4;
                            str28 = str;
                            str29 = str2;
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            c6 = 65535;
                            break;
                        case 92909918:
                            if (next2.equals("alpha")) {
                                obj19 = obj25;
                                str26 = str3;
                                str27 = str4;
                                str28 = str;
                                str29 = str2;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c6 = 14;
                                break;
                            }
                            obj19 = obj25;
                            str26 = str3;
                            str27 = str4;
                            str28 = str;
                            str29 = str2;
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            c6 = 65535;
                            break;
                        case 156108012:
                            if (next2.equals("waveOffset")) {
                                obj19 = obj25;
                                str26 = str3;
                                str27 = str4;
                                str28 = str;
                                str29 = str2;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c6 = 15;
                                break;
                            }
                            obj19 = obj25;
                            str26 = str3;
                            str27 = str4;
                            str28 = str;
                            str29 = str2;
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            c6 = 65535;
                            break;
                        default:
                            obj19 = obj25;
                            str26 = str3;
                            str27 = str4;
                            str28 = str;
                            str29 = str2;
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            c6 = 65535;
                            break;
                    }
                    switch (c6) {
                        case 0:
                            c1601 = new AbstractC1587.C1601();
                            break;
                        case 1:
                            c1601 = new AbstractC1587.C1591();
                            break;
                        case 2:
                            c1601 = new AbstractC1587.C1598();
                            break;
                        case 3:
                            c1601 = new AbstractC1587.C1600();
                            break;
                        case 4:
                            c1601 = new AbstractC1587.C1592();
                            break;
                        case 5:
                            c1601 = new AbstractC1587.C1590();
                            break;
                        case 6:
                            c1601 = new AbstractC1587.C1602();
                            break;
                        case 7:
                            c1601 = new AbstractC1587.C1596();
                            break;
                        case '\b':
                            c1601 = new AbstractC1587.C1594();
                            break;
                        case '\t':
                            c1601 = new AbstractC1587.C1595();
                            break;
                        case '\n':
                            c1601 = new AbstractC1587.C1597();
                            break;
                        case 11:
                            c1601 = new AbstractC1587.C1588();
                            break;
                        case '\f':
                            c1601 = new AbstractC1587.C1593();
                            break;
                        case '\r':
                            c1601 = new AbstractC1587.C1599();
                            break;
                        case 14:
                            c1601 = new AbstractC1587.C1594();
                            break;
                        case 15:
                            c1601 = new AbstractC1587.C1594();
                            break;
                        default:
                            c1601 = null;
                            break;
                    }
                    obj22 = obj20;
                    abstractC1587 = c1601;
                }
                if (abstractC1587 == null) {
                    str4 = str27;
                    str2 = str29;
                    str = str28;
                    obj23 = obj22;
                    hashSet7 = hashSet4;
                    it7 = it4;
                    obj24 = obj21;
                    obj25 = obj19;
                    hashSet8 = hashSet5;
                    str3 = str26;
                    c7 = 1;
                } else {
                    abstractC1587.f7537 = next2;
                    Object obj26 = obj21;
                    c16432.f7671.put(next2, abstractC1587);
                    str4 = str27;
                    str2 = str29;
                    str = str28;
                    hashSet7 = hashSet4;
                    hashSet8 = hashSet5;
                    it7 = it4;
                    str3 = str26;
                    obj25 = obj19;
                    c7 = 1;
                    Object obj27 = obj22;
                    obj24 = obj26;
                    obj23 = obj27;
                }
            }
            obj = obj25;
            str5 = str3;
            str6 = str4;
            str7 = str;
            str8 = str2;
            hashSet = hashSet7;
            hashSet2 = hashSet8;
            Object obj28 = obj24;
            obj2 = obj23;
            obj3 = obj28;
            ArrayList<AbstractC1579> arrayList3 = c16432.f7686;
            if (arrayList3 != null) {
                Iterator<AbstractC1579> it10 = arrayList3.iterator();
                while (it10.hasNext()) {
                    AbstractC1579 next4 = it10.next();
                    if (next4 instanceof C1604) {
                        next4.mo3533(c16432.f7671);
                    }
                }
            }
            c16432.f7687.m3572(c16432.f7671, 0);
            c16432.f7672.m3572(c16432.f7671, 100);
            for (Iterator<String> it11 = c16432.f7671.keySet().iterator(); it11.hasNext(); it11 = it11) {
                String next5 = it11.next();
                c16432.f7671.get(next5).mo3557(hashMap3.containsKey(next5) ? hashMap3.get(next5).intValue() : 0);
            }
        }
        if (hashSet6.isEmpty()) {
            c1643 = c16432;
            obj4 = obj;
            obj5 = obj3;
            obj6 = obj2;
        } else {
            if (c16432.f7692 == null) {
                c16432.f7692 = new HashMap<>();
            }
            Iterator<String> it12 = hashSet6.iterator();
            while (it12.hasNext()) {
                String next6 = it12.next();
                if (!c16432.f7692.containsKey(next6)) {
                    if (!next6.startsWith("CUSTOM,")) {
                        it3 = it12;
                        hashMap2 = hashMap3;
                        switch (next6.hashCode()) {
                            case -1249320806:
                                obj16 = obj3;
                                obj17 = obj2;
                                if (next6.equals(obj17)) {
                                    c5 = 0;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -1249320805:
                                obj16 = obj3;
                                if (next6.equals(obj16)) {
                                    obj17 = obj2;
                                    c5 = 1;
                                    break;
                                }
                                obj17 = obj2;
                                c5 = 65535;
                                break;
                            case -1225497657:
                                if (next6.equals(obj)) {
                                    obj16 = obj3;
                                    obj17 = obj2;
                                    c5 = 2;
                                    break;
                                }
                                obj16 = obj3;
                                obj17 = obj2;
                                c5 = 65535;
                                break;
                            case -1225497656:
                                if (next6.equals(str5)) {
                                    obj16 = obj3;
                                    obj17 = obj2;
                                    c5 = 3;
                                    break;
                                }
                                obj16 = obj3;
                                obj17 = obj2;
                                c5 = 65535;
                                break;
                            case -1225497655:
                                if (next6.equals(str7)) {
                                    obj16 = obj3;
                                    obj17 = obj2;
                                    c5 = 4;
                                    break;
                                }
                                obj16 = obj3;
                                obj17 = obj2;
                                c5 = 65535;
                                break;
                            case -1001078227:
                                if (next6.equals(str8)) {
                                    obj16 = obj3;
                                    obj17 = obj2;
                                    c5 = 5;
                                    break;
                                }
                                obj16 = obj3;
                                obj17 = obj2;
                                c5 = 65535;
                                break;
                            case -908189618:
                                if (next6.equals(str6)) {
                                    obj16 = obj3;
                                    obj17 = obj2;
                                    c5 = 6;
                                    break;
                                }
                                obj16 = obj3;
                                obj17 = obj2;
                                c5 = 65535;
                                break;
                            case -908189617:
                                if (next6.equals("scaleY")) {
                                    obj16 = obj3;
                                    obj17 = obj2;
                                    c5 = 7;
                                    break;
                                }
                                obj16 = obj3;
                                obj17 = obj2;
                                c5 = 65535;
                                break;
                            case -40300674:
                                if (next6.equals("rotation")) {
                                    obj16 = obj3;
                                    obj17 = obj2;
                                    c5 = '\b';
                                    break;
                                }
                                obj16 = obj3;
                                obj17 = obj2;
                                c5 = 65535;
                                break;
                            case -4379043:
                                if (next6.equals("elevation")) {
                                    obj16 = obj3;
                                    obj17 = obj2;
                                    c5 = '\t';
                                    break;
                                }
                                obj16 = obj3;
                                obj17 = obj2;
                                c5 = 65535;
                                break;
                            case 37232917:
                                if (next6.equals("transitionPathRotate")) {
                                    obj16 = obj3;
                                    obj17 = obj2;
                                    c5 = '\n';
                                    break;
                                }
                                obj16 = obj3;
                                obj17 = obj2;
                                c5 = 65535;
                                break;
                            case 92909918:
                                if (next6.equals("alpha")) {
                                    obj16 = obj3;
                                    obj17 = obj2;
                                    c5 = 11;
                                    break;
                                }
                                obj16 = obj3;
                                obj17 = obj2;
                                c5 = 65535;
                                break;
                            default:
                                obj16 = obj3;
                                obj17 = obj2;
                                c5 = 65535;
                                break;
                        }
                        switch (c5) {
                            case 0:
                                c1612 = new AbstractC1609.C1612();
                                obj18 = obj;
                                c1612.f7607 = j;
                                break;
                            case 1:
                                c1612 = new AbstractC1609.C1610();
                                obj18 = obj;
                                c1612.f7607 = j;
                                break;
                            case 2:
                                c1612 = new AbstractC1609.C1622();
                                obj18 = obj;
                                c1612.f7607 = j;
                                break;
                            case 3:
                                c1612 = new AbstractC1609.C1617();
                                obj18 = obj;
                                c1612.f7607 = j;
                                break;
                            case 4:
                                c1612 = new AbstractC1609.C1619();
                                obj18 = obj;
                                c1612.f7607 = j;
                                break;
                            case 5:
                                c1612 = new AbstractC1609.C1616();
                                obj18 = obj;
                                c1612.f7607 = j;
                                break;
                            case 6:
                                c1612 = new AbstractC1609.C1621();
                                obj18 = obj;
                                c1612.f7607 = j;
                                break;
                            case 7:
                                c1612 = new AbstractC1609.C1613();
                                obj18 = obj;
                                c1612.f7607 = j;
                                break;
                            case '\b':
                                c1612 = new AbstractC1609.C1618();
                                obj18 = obj;
                                c1612.f7607 = j;
                                break;
                            case '\t':
                                c1612 = new AbstractC1609.C1614();
                                obj18 = obj;
                                c1612.f7607 = j;
                                break;
                            case '\n':
                                c1612 = new AbstractC1609.C1620();
                                obj18 = obj;
                                c1612.f7607 = j;
                                break;
                            case 11:
                                c1612 = new AbstractC1609.C1615();
                                obj18 = obj;
                                c1612.f7607 = j;
                                break;
                            default:
                                obj18 = obj;
                                c1612 = null;
                                break;
                        }
                    } else {
                        SparseArray sparseArray2 = new SparseArray();
                        String str43 = next6.split(",")[1];
                        it3 = it12;
                        Iterator<AbstractC1579> it13 = c16432.f7686.iterator();
                        while (it13.hasNext()) {
                            Iterator<AbstractC1579> it14 = it13;
                            AbstractC1579 next7 = it13.next();
                            HashMap<String, Integer> hashMap5 = hashMap3;
                            HashMap<String, C1572> hashMap6 = next7.f7474;
                            if (hashMap6 != null && (c1572 = hashMap6.get(str43)) != null) {
                                sparseArray2.append(next7.f7473, c1572);
                            }
                            hashMap3 = hashMap5;
                            it13 = it14;
                        }
                        hashMap2 = hashMap3;
                        c1612 = new AbstractC1609.C1611(next6, sparseArray2);
                        obj16 = obj3;
                        obj17 = obj2;
                        obj18 = obj;
                    }
                    if (c1612 != null) {
                        c1612.f7605 = next6;
                        c16432.f7692.put(next6, c1612);
                    }
                    obj2 = obj17;
                    obj = obj18;
                    hashMap3 = hashMap2;
                    obj3 = obj16;
                    it12 = it3;
                }
            }
            HashMap<String, Integer> hashMap7 = hashMap3;
            obj5 = obj3;
            obj6 = obj2;
            Object obj29 = obj;
            ArrayList<AbstractC1579> arrayList4 = c16432.f7686;
            if (arrayList4 != null) {
                Iterator<AbstractC1579> it15 = arrayList4.iterator();
                while (it15.hasNext()) {
                    AbstractC1579 next8 = it15.next();
                    if (next8 instanceof C1581) {
                        C1581 c1581 = (C1581) next8;
                        HashMap<String, AbstractC1609> hashMap8 = c16432.f7692;
                        c1581.getClass();
                        Iterator<String> it16 = hashMap8.keySet().iterator();
                        while (it16.hasNext()) {
                            Iterator<AbstractC1579> it17 = it15;
                            String next9 = it16.next();
                            AbstractC1609 abstractC1609 = hashMap8.get(next9);
                            HashMap<String, AbstractC1609> hashMap9 = hashMap8;
                            if (!next9.startsWith("CUSTOM")) {
                                Object obj30 = obj5;
                                Object obj31 = obj6;
                                C1581 c15812 = c1581;
                                Iterator<String> it18 = it16;
                                switch (next9.hashCode()) {
                                    case -1249320806:
                                        obj15 = obj29;
                                        obj6 = obj31;
                                        obj5 = obj30;
                                        if (next9.equals(obj6)) {
                                            c4 = 0;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1249320805:
                                        obj15 = obj29;
                                        obj5 = obj30;
                                        if (next9.equals(obj5)) {
                                            c4 = 1;
                                            obj6 = obj31;
                                            break;
                                        } else {
                                            obj6 = obj31;
                                            c4 = 65535;
                                            break;
                                        }
                                    case -1225497657:
                                        obj15 = obj29;
                                        if (next9.equals(obj15)) {
                                            obj6 = obj31;
                                            obj5 = obj30;
                                            c4 = 2;
                                            break;
                                        }
                                        obj6 = obj31;
                                        obj5 = obj30;
                                        c4 = 65535;
                                        break;
                                    case -1225497656:
                                        if (next9.equals(str5)) {
                                            obj15 = obj29;
                                            obj6 = obj31;
                                            obj5 = obj30;
                                            c4 = 3;
                                            break;
                                        }
                                        obj15 = obj29;
                                        obj6 = obj31;
                                        obj5 = obj30;
                                        c4 = 65535;
                                        break;
                                    case -1225497655:
                                        if (next9.equals(str7)) {
                                            obj15 = obj29;
                                            obj6 = obj31;
                                            obj5 = obj30;
                                            c4 = 4;
                                            break;
                                        }
                                        obj15 = obj29;
                                        obj6 = obj31;
                                        obj5 = obj30;
                                        c4 = 65535;
                                        break;
                                    case -1001078227:
                                        if (next9.equals(str8)) {
                                            obj15 = obj29;
                                            obj6 = obj31;
                                            obj5 = obj30;
                                            c4 = 5;
                                            break;
                                        }
                                        obj15 = obj29;
                                        obj6 = obj31;
                                        obj5 = obj30;
                                        c4 = 65535;
                                        break;
                                    case -908189618:
                                        if (next9.equals(str6)) {
                                            obj15 = obj29;
                                            obj6 = obj31;
                                            obj5 = obj30;
                                            c4 = 6;
                                            break;
                                        }
                                        obj15 = obj29;
                                        obj6 = obj31;
                                        obj5 = obj30;
                                        c4 = 65535;
                                        break;
                                    case -908189617:
                                        if (next9.equals("scaleY")) {
                                            obj15 = obj29;
                                            obj6 = obj31;
                                            obj5 = obj30;
                                            c4 = 7;
                                            break;
                                        }
                                        obj15 = obj29;
                                        obj6 = obj31;
                                        obj5 = obj30;
                                        c4 = 65535;
                                        break;
                                    case -40300674:
                                        if (next9.equals("rotation")) {
                                            obj15 = obj29;
                                            obj6 = obj31;
                                            obj5 = obj30;
                                            c4 = '\b';
                                            break;
                                        }
                                        obj15 = obj29;
                                        obj6 = obj31;
                                        obj5 = obj30;
                                        c4 = 65535;
                                        break;
                                    case -4379043:
                                        if (next9.equals("elevation")) {
                                            obj15 = obj29;
                                            obj6 = obj31;
                                            obj5 = obj30;
                                            c4 = '\t';
                                            break;
                                        }
                                        obj15 = obj29;
                                        obj6 = obj31;
                                        obj5 = obj30;
                                        c4 = 65535;
                                        break;
                                    case 37232917:
                                        if (next9.equals("transitionPathRotate")) {
                                            obj15 = obj29;
                                            obj6 = obj31;
                                            obj5 = obj30;
                                            c4 = '\n';
                                            break;
                                        }
                                        obj15 = obj29;
                                        obj6 = obj31;
                                        obj5 = obj30;
                                        c4 = 65535;
                                        break;
                                    case 92909918:
                                        if (next9.equals("alpha")) {
                                            obj15 = obj29;
                                            obj6 = obj31;
                                            obj5 = obj30;
                                            c4 = 11;
                                            break;
                                        }
                                        obj15 = obj29;
                                        obj6 = obj31;
                                        obj5 = obj30;
                                        c4 = 65535;
                                        break;
                                    default:
                                        obj15 = obj29;
                                        obj6 = obj31;
                                        obj5 = obj30;
                                        c4 = 65535;
                                        break;
                                }
                                switch (c4) {
                                    case 0:
                                        c1581 = c15812;
                                        if (!Float.isNaN(c1581.f7491)) {
                                            i4 = c1581.f7473;
                                            f2 = c1581.f7491;
                                            abstractC1609.mo3566(i4, f2, c1581.f7489, c1581.f7484, c1581.f7483);
                                        }
                                        it15 = it17;
                                        it16 = it18;
                                        obj29 = obj15;
                                        hashMap8 = hashMap9;
                                        break;
                                    case 1:
                                        c1581 = c15812;
                                        if (!Float.isNaN(c1581.f7479)) {
                                            i4 = c1581.f7473;
                                            f2 = c1581.f7479;
                                            abstractC1609.mo3566(i4, f2, c1581.f7489, c1581.f7484, c1581.f7483);
                                        }
                                        it15 = it17;
                                        it16 = it18;
                                        obj29 = obj15;
                                        hashMap8 = hashMap9;
                                        break;
                                    case 2:
                                        c1581 = c15812;
                                        if (!Float.isNaN(c1581.f7490)) {
                                            i4 = c1581.f7473;
                                            f2 = c1581.f7490;
                                            abstractC1609.mo3566(i4, f2, c1581.f7489, c1581.f7484, c1581.f7483);
                                        }
                                        it15 = it17;
                                        it16 = it18;
                                        obj29 = obj15;
                                        hashMap8 = hashMap9;
                                        break;
                                    case 3:
                                        c1581 = c15812;
                                        if (!Float.isNaN(c1581.f7482)) {
                                            i4 = c1581.f7473;
                                            f2 = c1581.f7482;
                                            abstractC1609.mo3566(i4, f2, c1581.f7489, c1581.f7484, c1581.f7483);
                                        }
                                        it15 = it17;
                                        it16 = it18;
                                        obj29 = obj15;
                                        hashMap8 = hashMap9;
                                        break;
                                    case 4:
                                        c1581 = c15812;
                                        if (!Float.isNaN(c1581.f7480)) {
                                            i4 = c1581.f7473;
                                            f2 = c1581.f7480;
                                            abstractC1609.mo3566(i4, f2, c1581.f7489, c1581.f7484, c1581.f7483);
                                        }
                                        it15 = it17;
                                        it16 = it18;
                                        obj29 = obj15;
                                        hashMap8 = hashMap9;
                                        break;
                                    case 5:
                                        c1581 = c15812;
                                        if (!Float.isNaN(c1581.f7481)) {
                                            i4 = c1581.f7473;
                                            f2 = c1581.f7481;
                                            abstractC1609.mo3566(i4, f2, c1581.f7489, c1581.f7484, c1581.f7483);
                                        }
                                        it15 = it17;
                                        it16 = it18;
                                        obj29 = obj15;
                                        hashMap8 = hashMap9;
                                        break;
                                    case 6:
                                        c1581 = c15812;
                                        if (!Float.isNaN(c1581.f7486)) {
                                            i4 = c1581.f7473;
                                            f2 = c1581.f7486;
                                            abstractC1609.mo3566(i4, f2, c1581.f7489, c1581.f7484, c1581.f7483);
                                        }
                                        it15 = it17;
                                        it16 = it18;
                                        obj29 = obj15;
                                        hashMap8 = hashMap9;
                                        break;
                                    case 7:
                                        c1581 = c15812;
                                        if (!Float.isNaN(c1581.f7488)) {
                                            i4 = c1581.f7473;
                                            f2 = c1581.f7488;
                                            abstractC1609.mo3566(i4, f2, c1581.f7489, c1581.f7484, c1581.f7483);
                                        }
                                        it15 = it17;
                                        it16 = it18;
                                        obj29 = obj15;
                                        hashMap8 = hashMap9;
                                        break;
                                    case '\b':
                                        c1581 = c15812;
                                        if (!Float.isNaN(c1581.f7477)) {
                                            i4 = c1581.f7473;
                                            f2 = c1581.f7477;
                                            abstractC1609.mo3566(i4, f2, c1581.f7489, c1581.f7484, c1581.f7483);
                                        }
                                        it15 = it17;
                                        it16 = it18;
                                        obj29 = obj15;
                                        hashMap8 = hashMap9;
                                        break;
                                    case '\t':
                                        c1581 = c15812;
                                        if (!Float.isNaN(c1581.f7478)) {
                                            i4 = c1581.f7473;
                                            f2 = c1581.f7478;
                                            abstractC1609.mo3566(i4, f2, c1581.f7489, c1581.f7484, c1581.f7483);
                                        }
                                        it15 = it17;
                                        it16 = it18;
                                        obj29 = obj15;
                                        hashMap8 = hashMap9;
                                        break;
                                    case '\n':
                                        c1581 = c15812;
                                        if (!Float.isNaN(c1581.f7492)) {
                                            i4 = c1581.f7473;
                                            f2 = c1581.f7492;
                                            abstractC1609.mo3566(i4, f2, c1581.f7489, c1581.f7484, c1581.f7483);
                                        }
                                        it15 = it17;
                                        it16 = it18;
                                        obj29 = obj15;
                                        hashMap8 = hashMap9;
                                        break;
                                    case 11:
                                        c1581 = c15812;
                                        if (!Float.isNaN(c1581.f7487)) {
                                            i4 = c1581.f7473;
                                            f2 = c1581.f7487;
                                            abstractC1609.mo3566(i4, f2, c1581.f7489, c1581.f7484, c1581.f7483);
                                        }
                                        it15 = it17;
                                        it16 = it18;
                                        obj29 = obj15;
                                        hashMap8 = hashMap9;
                                        break;
                                    default:
                                        it15 = it17;
                                        it16 = it18;
                                        obj29 = obj15;
                                        hashMap8 = hashMap9;
                                        c1581 = c15812;
                                        break;
                                }
                            } else {
                                C1572 c15723 = c1581.f7474.get(next9.substring(7));
                                if (c15723 != null) {
                                    AbstractC1609.C1611 c1611 = (AbstractC1609.C1611) abstractC1609;
                                    Iterator<String> it19 = it16;
                                    int i9 = c1581.f7473;
                                    float f3 = c1581.f7489;
                                    Object obj32 = obj6;
                                    int i10 = c1581.f7484;
                                    Object obj33 = obj5;
                                    float f4 = c1581.f7483;
                                    c1611.f7609.append(i9, c15723);
                                    c1611.f7610.append(i9, new float[]{f3, f4});
                                    c1611.f7599 = Math.max(c1611.f7599, i10);
                                    it15 = it17;
                                    it16 = it19;
                                    hashMap8 = hashMap9;
                                    obj6 = obj32;
                                    obj5 = obj33;
                                    c1581 = c1581;
                                } else {
                                    it15 = it17;
                                    hashMap8 = hashMap9;
                                }
                            }
                        }
                    }
                    it15 = it15;
                    obj29 = obj29;
                    c16432 = this;
                }
            }
            obj4 = obj29;
            c1643 = this;
            Iterator<String> it20 = c1643.f7692.keySet().iterator();
            while (it20.hasNext()) {
                String next10 = it20.next();
                HashMap<String, Integer> hashMap10 = hashMap7;
                if (hashMap10.containsKey(next10)) {
                    it2 = it20;
                    hashMap7 = hashMap10;
                    i3 = hashMap10.get(next10).intValue();
                } else {
                    it2 = it20;
                    hashMap7 = hashMap10;
                    i3 = 0;
                }
                c1643.f7692.get(next10).mo3568(i3);
                it20 = it2;
            }
        }
        int size = c1643.f7681.size() + 2;
        C1603[] c1603Arr = new C1603[size];
        c1603Arr[0] = c1643.f7691;
        Object obj34 = obj6;
        c1603Arr[size - 1] = c1643.f7684;
        if (c1643.f7681.size() > 0 && c1643.f7679 == -1) {
            c1643.f7679 = 0;
        }
        Iterator<C1603> it21 = c1643.f7681.iterator();
        int i11 = 1;
        while (it21.hasNext()) {
            c1603Arr[i11] = it21.next();
            i11++;
        }
        HashSet hashSet9 = new HashSet();
        Iterator<String> it22 = c1643.f7684.f7550.keySet().iterator();
        while (it22.hasNext()) {
            Iterator<String> it23 = it22;
            String next11 = it22.next();
            Object obj35 = obj5;
            if (c1643.f7691.f7550.containsKey(next11)) {
                StringBuilder sb = new StringBuilder();
                obj14 = obj4;
                sb.append("CUSTOM,");
                sb.append(next11);
                String sb2 = sb.toString();
                hashSet3 = hashSet;
                if (!hashSet3.contains(sb2)) {
                    hashSet9.add(next11);
                }
            } else {
                obj14 = obj4;
                hashSet3 = hashSet;
            }
            it22 = it23;
            hashSet = hashSet3;
            obj5 = obj35;
            obj4 = obj14;
        }
        Object obj36 = obj4;
        Object obj37 = obj5;
        String[] strArr = (String[]) hashSet9.toArray(new String[0]);
        c1643.f7675 = strArr;
        c1643.f7677 = new int[strArr.length];
        int i12 = 0;
        while (true) {
            String[] strArr2 = c1643.f7675;
            if (i12 < strArr2.length) {
                String str44 = strArr2[i12];
                c1643.f7677[i12] = 0;
                int i13 = 0;
                while (true) {
                    if (i13 >= size) {
                        break;
                    }
                    if (c1603Arr[i13].f7550.containsKey(str44)) {
                        int[] iArr = c1643.f7677;
                        iArr[i12] = c1603Arr[i13].f7550.get(str44).m3531() + iArr[i12];
                    } else {
                        i13++;
                    }
                }
                i12++;
            } else {
                boolean z = c1603Arr[0].f7556 != -1;
                int length = strArr2.length + 18;
                boolean[] zArr = new boolean[length];
                int i14 = 1;
                while (i14 < size) {
                    String str45 = str5;
                    C1603 c1603 = c1603Arr[i14];
                    String str46 = str7;
                    C1603 c16032 = c1603Arr[i14 - 1];
                    c1603.getClass();
                    zArr[0] = zArr[0] | c1603.m3558(c1603.f7549, c16032.f7549);
                    zArr[1] = zArr[1] | c1603.m3558(c1603.f7551, c16032.f7551) | z;
                    zArr[2] = zArr[2] | c1603.m3558(c1603.f7545, c16032.f7545) | z;
                    zArr[3] = c1603.m3558(c1603.f7543, c16032.f7543) | zArr[3];
                    zArr[4] = zArr[4] | c1603.m3558(c1603.f7555, c16032.f7555);
                    i14++;
                    str5 = str45;
                    str38 = str38;
                    str6 = str6;
                    str7 = str46;
                    str8 = str8;
                }
                String str47 = str6;
                String str48 = str8;
                String str49 = str7;
                String str50 = str5;
                String str51 = str38;
                int i15 = 0;
                for (int i16 = 1; i16 < length; i16++) {
                    if (zArr[i16]) {
                        i15++;
                    }
                }
                int[] iArr2 = new int[i15];
                c1643.f7688 = iArr2;
                c1643.f7693 = new double[iArr2.length];
                c1643.f7678 = new double[iArr2.length];
                int i17 = 0;
                for (int i18 = 1; i18 < length; i18++) {
                    if (zArr[i18]) {
                        c1643.f7688[i17] = i18;
                        i17++;
                    }
                }
                double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) double.class, size, c1643.f7688.length);
                double[] dArr4 = new double[size];
                for (int i19 = 0; i19 < size; i19++) {
                    C1603 c16033 = c1603Arr[i19];
                    double[] dArr5 = dArr3[i19];
                    int[] iArr3 = c1643.f7688;
                    float[] fArr = {c16033.f7549, c16033.f7551, c16033.f7545, c16033.f7543, c16033.f7555, c16033.f7546};
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < iArr3.length) {
                        String str52 = str35;
                        if (iArr3[i20] < 6) {
                            str25 = str34;
                            dArr5[i21] = fArr[iArr3[i20]];
                            i21++;
                        } else {
                            str25 = str34;
                        }
                        i20++;
                        str35 = str52;
                        str34 = str25;
                    }
                    dArr4[i19] = c1603Arr[i19].f7553;
                }
                String str53 = str34;
                String str54 = str35;
                int i22 = 0;
                while (true) {
                    int[] iArr4 = c1643.f7688;
                    if (i22 < iArr4.length) {
                        if (iArr4[i22] < C1603.f7542.length) {
                            String m4198 = C2098.m4198(new StringBuilder(), C1603.f7542[c1643.f7688[i22]], " [");
                            for (int i23 = 0; i23 < size; i23++) {
                                StringBuilder m4207 = C2098.m4207(m4198);
                                m4207.append(dArr3[i23][i22]);
                                m4198 = m4207.toString();
                            }
                        }
                        i22++;
                    } else {
                        c1643.f7669 = new AbstractC1651[c1643.f7675.length + 1];
                        int i24 = 0;
                        while (true) {
                            String[] strArr3 = c1643.f7675;
                            if (i24 >= strArr3.length) {
                                String str55 = str33;
                                c1643.f7669[0] = AbstractC1651.m3591(c1643.f7679, dArr4, dArr3);
                                if (c1603Arr[0].f7556 != -1) {
                                    int[] iArr5 = new int[size];
                                    double[] dArr6 = new double[size];
                                    double[][] dArr7 = (double[][]) Array.newInstance((Class<?>) double.class, size, 2);
                                    for (int i25 = 0; i25 < size; i25++) {
                                        iArr5[i25] = c1603Arr[i25].f7556;
                                        dArr6[i25] = c1603Arr[i25].f7553;
                                        dArr7[i25][0] = c1603Arr[i25].f7551;
                                        dArr7[i25][1] = c1603Arr[i25].f7545;
                                    }
                                    c1643.f7694 = new C1656(iArr5, dArr6, dArr7);
                                }
                                float f5 = Float.NaN;
                                c1643.f7676 = new HashMap<>();
                                if (c1643.f7686 != null) {
                                    Iterator<String> it24 = hashSet2.iterator();
                                    while (it24.hasNext()) {
                                        String next12 = it24.next();
                                        if (next12.startsWith("CUSTOM")) {
                                            it = it24;
                                            abstractC1626 = new AbstractC1626.C1633();
                                            obj11 = obj34;
                                            obj12 = obj37;
                                            str15 = str50;
                                            obj13 = obj36;
                                            str16 = str51;
                                            str17 = str55;
                                            str18 = str47;
                                            str19 = str54;
                                            str20 = str53;
                                            str21 = str49;
                                            str22 = str48;
                                        } else {
                                            switch (next12.hashCode()) {
                                                case -1249320806:
                                                    obj11 = obj34;
                                                    obj12 = obj37;
                                                    str15 = str50;
                                                    obj13 = obj36;
                                                    str16 = str51;
                                                    str17 = str55;
                                                    str18 = str47;
                                                    str19 = str54;
                                                    str20 = str53;
                                                    str21 = str49;
                                                    str22 = str48;
                                                    if (next12.equals(obj11)) {
                                                        c3 = 0;
                                                        break;
                                                    }
                                                    c3 = 65535;
                                                    break;
                                                case -1249320805:
                                                    obj12 = obj37;
                                                    str15 = str50;
                                                    obj13 = obj36;
                                                    str16 = str51;
                                                    str17 = str55;
                                                    str18 = str47;
                                                    str19 = str54;
                                                    str20 = str53;
                                                    str21 = str49;
                                                    str22 = str48;
                                                    if (next12.equals(obj12)) {
                                                        obj11 = obj34;
                                                        c3 = 1;
                                                        break;
                                                    } else {
                                                        obj11 = obj34;
                                                        c3 = 65535;
                                                        break;
                                                    }
                                                case -1225497657:
                                                    str15 = str50;
                                                    obj13 = obj36;
                                                    str16 = str51;
                                                    str17 = str55;
                                                    str18 = str47;
                                                    str19 = str54;
                                                    str20 = str53;
                                                    str21 = str49;
                                                    str22 = str48;
                                                    if (next12.equals(obj13)) {
                                                        obj11 = obj34;
                                                        obj12 = obj37;
                                                        c3 = 2;
                                                        break;
                                                    } else {
                                                        obj11 = obj34;
                                                        obj12 = obj37;
                                                        c3 = 65535;
                                                        break;
                                                    }
                                                case -1225497656:
                                                    str15 = str50;
                                                    str16 = str51;
                                                    str17 = str55;
                                                    str18 = str47;
                                                    str19 = str54;
                                                    str20 = str53;
                                                    str21 = str49;
                                                    str22 = str48;
                                                    if (next12.equals(str15)) {
                                                        obj11 = obj34;
                                                        obj12 = obj37;
                                                        obj13 = obj36;
                                                        c3 = 3;
                                                        break;
                                                    } else {
                                                        obj11 = obj34;
                                                        obj12 = obj37;
                                                        obj13 = obj36;
                                                        c3 = 65535;
                                                        break;
                                                    }
                                                case -1225497655:
                                                    str16 = str51;
                                                    str17 = str55;
                                                    str18 = str47;
                                                    str19 = str54;
                                                    str20 = str53;
                                                    str21 = str49;
                                                    str22 = str48;
                                                    if (next12.equals(str21)) {
                                                        obj11 = obj34;
                                                        obj12 = obj37;
                                                        str15 = str50;
                                                        obj13 = obj36;
                                                        c3 = 4;
                                                        break;
                                                    } else {
                                                        obj11 = obj34;
                                                        obj12 = obj37;
                                                        str15 = str50;
                                                        obj13 = obj36;
                                                        c3 = 65535;
                                                        break;
                                                    }
                                                case -1001078227:
                                                    str16 = str51;
                                                    str17 = str55;
                                                    str18 = str47;
                                                    str19 = str54;
                                                    str20 = str53;
                                                    str22 = str48;
                                                    if (next12.equals(str22)) {
                                                        obj11 = obj34;
                                                        obj12 = obj37;
                                                        str15 = str50;
                                                        obj13 = obj36;
                                                        str21 = str49;
                                                        c3 = 5;
                                                        break;
                                                    }
                                                    obj11 = obj34;
                                                    obj12 = obj37;
                                                    str15 = str50;
                                                    obj13 = obj36;
                                                    str21 = str49;
                                                    c3 = 65535;
                                                    break;
                                                case -908189618:
                                                    str16 = str51;
                                                    str17 = str55;
                                                    str18 = str47;
                                                    str19 = str54;
                                                    str20 = str53;
                                                    if (next12.equals(str18)) {
                                                        obj11 = obj34;
                                                        obj12 = obj37;
                                                        str15 = str50;
                                                        obj13 = obj36;
                                                        str21 = str49;
                                                        str22 = str48;
                                                        c3 = 6;
                                                        break;
                                                    } else {
                                                        str22 = str48;
                                                        obj11 = obj34;
                                                        obj12 = obj37;
                                                        str15 = str50;
                                                        obj13 = obj36;
                                                        str21 = str49;
                                                        c3 = 65535;
                                                        break;
                                                    }
                                                case -908189617:
                                                    str16 = str51;
                                                    str17 = str55;
                                                    str19 = str54;
                                                    str20 = str53;
                                                    if (next12.equals(str16)) {
                                                        obj11 = obj34;
                                                        obj12 = obj37;
                                                        str15 = str50;
                                                        obj13 = obj36;
                                                        str18 = str47;
                                                        str21 = str49;
                                                        str22 = str48;
                                                        c3 = 7;
                                                        break;
                                                    }
                                                    obj11 = obj34;
                                                    obj12 = obj37;
                                                    str15 = str50;
                                                    obj13 = obj36;
                                                    str18 = str47;
                                                    str21 = str49;
                                                    str22 = str48;
                                                    c3 = 65535;
                                                    break;
                                                case -797520672:
                                                    str17 = str55;
                                                    str19 = str54;
                                                    str20 = str53;
                                                    if (next12.equals("waveVariesBy")) {
                                                        obj11 = obj34;
                                                        obj12 = obj37;
                                                        str15 = str50;
                                                        obj13 = obj36;
                                                        str16 = str51;
                                                        str18 = str47;
                                                        str21 = str49;
                                                        str22 = str48;
                                                        c3 = '\b';
                                                        break;
                                                    }
                                                    str16 = str51;
                                                    obj11 = obj34;
                                                    obj12 = obj37;
                                                    str15 = str50;
                                                    obj13 = obj36;
                                                    str18 = str47;
                                                    str21 = str49;
                                                    str22 = str48;
                                                    c3 = 65535;
                                                    break;
                                                case -40300674:
                                                    str17 = str55;
                                                    str19 = str54;
                                                    str20 = str53;
                                                    if (next12.equals(str19)) {
                                                        obj11 = obj34;
                                                        obj12 = obj37;
                                                        str15 = str50;
                                                        obj13 = obj36;
                                                        str16 = str51;
                                                        str18 = str47;
                                                        str21 = str49;
                                                        str22 = str48;
                                                        c3 = '\t';
                                                        break;
                                                    }
                                                    str16 = str51;
                                                    obj11 = obj34;
                                                    obj12 = obj37;
                                                    str15 = str50;
                                                    obj13 = obj36;
                                                    str18 = str47;
                                                    str21 = str49;
                                                    str22 = str48;
                                                    c3 = 65535;
                                                    break;
                                                case -4379043:
                                                    str17 = str55;
                                                    str20 = str53;
                                                    if (next12.equals(str20)) {
                                                        obj11 = obj34;
                                                        obj12 = obj37;
                                                        str15 = str50;
                                                        obj13 = obj36;
                                                        str16 = str51;
                                                        str18 = str47;
                                                        str19 = str54;
                                                        str21 = str49;
                                                        str22 = str48;
                                                        c3 = '\n';
                                                        break;
                                                    } else {
                                                        obj11 = obj34;
                                                        obj12 = obj37;
                                                        str15 = str50;
                                                        obj13 = obj36;
                                                        str16 = str51;
                                                        str18 = str47;
                                                        str19 = str54;
                                                        str21 = str49;
                                                        str22 = str48;
                                                        c3 = 65535;
                                                        break;
                                                    }
                                                case 37232917:
                                                    str17 = str55;
                                                    if (next12.equals("transitionPathRotate")) {
                                                        obj11 = obj34;
                                                        obj12 = obj37;
                                                        str15 = str50;
                                                        obj13 = obj36;
                                                        str16 = str51;
                                                        str18 = str47;
                                                        str19 = str54;
                                                        str20 = str53;
                                                        str21 = str49;
                                                        str22 = str48;
                                                        c3 = 11;
                                                        break;
                                                    }
                                                    obj11 = obj34;
                                                    obj12 = obj37;
                                                    str15 = str50;
                                                    obj13 = obj36;
                                                    str16 = str51;
                                                    str18 = str47;
                                                    str19 = str54;
                                                    str20 = str53;
                                                    str21 = str49;
                                                    str22 = str48;
                                                    c3 = 65535;
                                                    break;
                                                case 92909918:
                                                    str17 = str55;
                                                    if (next12.equals(str17)) {
                                                        obj11 = obj34;
                                                        obj12 = obj37;
                                                        str15 = str50;
                                                        obj13 = obj36;
                                                        str16 = str51;
                                                        str18 = str47;
                                                        str19 = str54;
                                                        str20 = str53;
                                                        str21 = str49;
                                                        str22 = str48;
                                                        c3 = '\f';
                                                        break;
                                                    }
                                                    obj11 = obj34;
                                                    obj12 = obj37;
                                                    str15 = str50;
                                                    obj13 = obj36;
                                                    str16 = str51;
                                                    str18 = str47;
                                                    str19 = str54;
                                                    str20 = str53;
                                                    str21 = str49;
                                                    str22 = str48;
                                                    c3 = 65535;
                                                    break;
                                                case 156108012:
                                                    if (next12.equals("waveOffset")) {
                                                        obj11 = obj34;
                                                        obj12 = obj37;
                                                        str15 = str50;
                                                        obj13 = obj36;
                                                        str16 = str51;
                                                        str17 = str55;
                                                        str18 = str47;
                                                        str19 = str54;
                                                        str20 = str53;
                                                        str21 = str49;
                                                        str22 = str48;
                                                        c3 = '\r';
                                                        break;
                                                    }
                                                default:
                                                    obj11 = obj34;
                                                    obj12 = obj37;
                                                    str15 = str50;
                                                    obj13 = obj36;
                                                    str16 = str51;
                                                    str17 = str55;
                                                    str18 = str47;
                                                    str19 = str54;
                                                    str20 = str53;
                                                    str21 = str49;
                                                    str22 = str48;
                                                    c3 = 65535;
                                                    break;
                                            }
                                            switch (c3) {
                                                case 0:
                                                    c1641 = new AbstractC1626.C1641();
                                                    break;
                                                case 1:
                                                    c1641 = new AbstractC1626.C1630();
                                                    break;
                                                case 2:
                                                    c1641 = new AbstractC1626.C1638();
                                                    break;
                                                case 3:
                                                    c1641 = new AbstractC1626.C1640();
                                                    break;
                                                case 4:
                                                    c1641 = new AbstractC1626.C1632();
                                                    break;
                                                case 5:
                                                    c1641 = new AbstractC1626.C1629();
                                                    break;
                                                case 6:
                                                    c1641 = new AbstractC1626.C1642();
                                                    break;
                                                case 7:
                                                    c1641 = new AbstractC1626.C1636();
                                                    break;
                                                case '\b':
                                                    c1641 = new AbstractC1626.C1628();
                                                    break;
                                                case '\t':
                                                    c1641 = new AbstractC1626.C1627();
                                                    break;
                                                case '\n':
                                                    c1641 = new AbstractC1626.C1635();
                                                    break;
                                                case 11:
                                                    c1641 = new AbstractC1626.C1637();
                                                    break;
                                                case '\f':
                                                    c1641 = new AbstractC1626.C1628();
                                                    break;
                                                case '\r':
                                                    c1641 = new AbstractC1626.C1628();
                                                    break;
                                                default:
                                                    c1641 = null;
                                                    break;
                                            }
                                            it = it24;
                                            abstractC1626 = c1641;
                                        }
                                        if (abstractC1626 == null) {
                                            it24 = it;
                                            str55 = str17;
                                            str53 = str20;
                                            str54 = str19;
                                            str51 = str16;
                                            str47 = str18;
                                            str48 = str22;
                                            str49 = str21;
                                            str50 = str15;
                                            obj36 = obj13;
                                            obj37 = obj12;
                                            obj34 = obj11;
                                        } else {
                                            obj34 = obj11;
                                            obj37 = obj12;
                                            if ((abstractC1626.f7652 == 1) && Float.isNaN(f5)) {
                                                f5 = m3579();
                                            }
                                            abstractC1626.f7650 = next12;
                                            c1643.f7676.put(next12, abstractC1626);
                                            it24 = it;
                                            str55 = str17;
                                            str53 = str20;
                                            str54 = str19;
                                            str51 = str16;
                                            str47 = str18;
                                            str48 = str22;
                                            str49 = str21;
                                            str50 = str15;
                                            obj36 = obj13;
                                        }
                                    }
                                    String str56 = str50;
                                    Object obj38 = obj36;
                                    String str57 = str51;
                                    String str58 = str55;
                                    String str59 = str47;
                                    String str60 = str54;
                                    String str61 = str53;
                                    String str62 = str49;
                                    String str63 = str48;
                                    Iterator<AbstractC1579> it25 = c1643.f7686.iterator();
                                    while (it25.hasNext()) {
                                        AbstractC1579 next13 = it25.next();
                                        if (next13 instanceof C1623) {
                                            C1623 c16233 = (C1623) next13;
                                            HashMap<String, AbstractC1626> hashMap11 = c1643.f7676;
                                            c16233.getClass();
                                            Iterator<String> it26 = hashMap11.keySet().iterator();
                                            while (it26.hasNext()) {
                                                Iterator<AbstractC1579> it27 = it25;
                                                String next14 = it26.next();
                                                Iterator<String> it28 = it26;
                                                if (next14.startsWith("CUSTOM")) {
                                                    float f6 = f5;
                                                    C1572 c15724 = c16233.f7474.get(next14.substring(7));
                                                    if (c15724 == null || c15724.f7447 != C1572.EnumC1573.FLOAT_TYPE) {
                                                        c1623 = c16233;
                                                        str9 = str63;
                                                        str10 = str62;
                                                        str11 = str56;
                                                        obj7 = obj38;
                                                        hashMap = hashMap11;
                                                    } else {
                                                        AbstractC1626 abstractC16262 = hashMap11.get(next14);
                                                        int i26 = c16233.f7473;
                                                        int i27 = c16233.f7625;
                                                        hashMap = hashMap11;
                                                        int i28 = c16233.f7616;
                                                        obj7 = obj38;
                                                        str11 = str56;
                                                        c1623 = c16233;
                                                        str10 = str62;
                                                        str9 = str63;
                                                        abstractC16262.f7653.add(new AbstractC1626.C1631(i26, c16233.f7615, c16233.f7614, c15724.m3528()));
                                                        if (i28 != -1) {
                                                            abstractC16262.f7652 = i28;
                                                        }
                                                        abstractC16262.f7654 = i27;
                                                        abstractC16262.f7649 = c15724;
                                                    }
                                                    it25 = it27;
                                                    it26 = it28;
                                                    f5 = f6;
                                                    c16233 = c1623;
                                                    hashMap11 = hashMap;
                                                    str56 = str11;
                                                    obj38 = obj7;
                                                    str62 = str10;
                                                } else {
                                                    float f7 = f5;
                                                    C1623 c16234 = c16233;
                                                    String str64 = str63;
                                                    String str65 = str62;
                                                    String str66 = str56;
                                                    Object obj39 = obj38;
                                                    HashMap<String, AbstractC1626> hashMap12 = hashMap11;
                                                    switch (next14.hashCode()) {
                                                        case -1249320806:
                                                            obj8 = obj34;
                                                            obj9 = obj37;
                                                            str12 = str66;
                                                            obj10 = obj39;
                                                            str13 = str65;
                                                            str14 = str64;
                                                            if (next14.equals(obj8)) {
                                                                c = 0;
                                                                break;
                                                            }
                                                            c = 65535;
                                                            break;
                                                        case -1249320805:
                                                            obj9 = obj37;
                                                            str12 = str66;
                                                            obj10 = obj39;
                                                            str13 = str65;
                                                            str14 = str64;
                                                            if (next14.equals(obj9)) {
                                                                obj8 = obj34;
                                                                c = 1;
                                                                break;
                                                            } else {
                                                                obj8 = obj34;
                                                                c = 65535;
                                                                break;
                                                            }
                                                        case -1225497657:
                                                            str12 = str66;
                                                            obj10 = obj39;
                                                            str13 = str65;
                                                            str14 = str64;
                                                            if (next14.equals(obj10)) {
                                                                obj8 = obj34;
                                                                obj9 = obj37;
                                                                c = 2;
                                                                break;
                                                            } else {
                                                                obj8 = obj34;
                                                                obj9 = obj37;
                                                                c = 65535;
                                                                break;
                                                            }
                                                        case -1225497656:
                                                            str12 = str66;
                                                            str13 = str65;
                                                            str14 = str64;
                                                            if (next14.equals(str12)) {
                                                                obj8 = obj34;
                                                                obj9 = obj37;
                                                                obj10 = obj39;
                                                                c = 3;
                                                                break;
                                                            } else {
                                                                obj8 = obj34;
                                                                obj9 = obj37;
                                                                obj10 = obj39;
                                                                c = 65535;
                                                                break;
                                                            }
                                                        case -1225497655:
                                                            str13 = str65;
                                                            str14 = str64;
                                                            if (next14.equals(str13)) {
                                                                obj8 = obj34;
                                                                obj9 = obj37;
                                                                str12 = str66;
                                                                obj10 = obj39;
                                                                c = 4;
                                                                break;
                                                            } else {
                                                                obj8 = obj34;
                                                                obj9 = obj37;
                                                                str12 = str66;
                                                                obj10 = obj39;
                                                                c = 65535;
                                                                break;
                                                            }
                                                        case -1001078227:
                                                            str14 = str64;
                                                            if (next14.equals(str14)) {
                                                                obj8 = obj34;
                                                                obj9 = obj37;
                                                                str12 = str66;
                                                                obj10 = obj39;
                                                                str13 = str65;
                                                                c = 5;
                                                                break;
                                                            } else {
                                                                obj8 = obj34;
                                                                obj9 = obj37;
                                                                str12 = str66;
                                                                obj10 = obj39;
                                                                str13 = str65;
                                                                c = 65535;
                                                                break;
                                                            }
                                                        case -908189618:
                                                            if (next14.equals(str59)) {
                                                                obj8 = obj34;
                                                                obj9 = obj37;
                                                                str12 = str66;
                                                                obj10 = obj39;
                                                                str13 = str65;
                                                                str14 = str64;
                                                                c = 6;
                                                                break;
                                                            }
                                                            obj8 = obj34;
                                                            obj9 = obj37;
                                                            str12 = str66;
                                                            obj10 = obj39;
                                                            str13 = str65;
                                                            str14 = str64;
                                                            c = 65535;
                                                            break;
                                                        case -908189617:
                                                            if (next14.equals(str57)) {
                                                                obj8 = obj34;
                                                                obj9 = obj37;
                                                                str12 = str66;
                                                                obj10 = obj39;
                                                                str13 = str65;
                                                                str14 = str64;
                                                                c = 7;
                                                                break;
                                                            }
                                                            obj8 = obj34;
                                                            obj9 = obj37;
                                                            str12 = str66;
                                                            obj10 = obj39;
                                                            str13 = str65;
                                                            str14 = str64;
                                                            c = 65535;
                                                            break;
                                                        case -40300674:
                                                            if (next14.equals(str60)) {
                                                                c2 = '\b';
                                                                c = c2;
                                                                obj8 = obj34;
                                                                obj9 = obj37;
                                                                str12 = str66;
                                                                obj10 = obj39;
                                                                str13 = str65;
                                                                str14 = str64;
                                                                break;
                                                            }
                                                            obj8 = obj34;
                                                            obj9 = obj37;
                                                            str12 = str66;
                                                            obj10 = obj39;
                                                            str13 = str65;
                                                            str14 = str64;
                                                            c = 65535;
                                                            break;
                                                        case -4379043:
                                                            if (next14.equals(str61)) {
                                                                c2 = '\t';
                                                                c = c2;
                                                                obj8 = obj34;
                                                                obj9 = obj37;
                                                                str12 = str66;
                                                                obj10 = obj39;
                                                                str13 = str65;
                                                                str14 = str64;
                                                                break;
                                                            }
                                                            obj8 = obj34;
                                                            obj9 = obj37;
                                                            str12 = str66;
                                                            obj10 = obj39;
                                                            str13 = str65;
                                                            str14 = str64;
                                                            c = 65535;
                                                            break;
                                                        case 37232917:
                                                            if (next14.equals("transitionPathRotate")) {
                                                                c2 = '\n';
                                                                c = c2;
                                                                obj8 = obj34;
                                                                obj9 = obj37;
                                                                str12 = str66;
                                                                obj10 = obj39;
                                                                str13 = str65;
                                                                str14 = str64;
                                                                break;
                                                            }
                                                            obj8 = obj34;
                                                            obj9 = obj37;
                                                            str12 = str66;
                                                            obj10 = obj39;
                                                            str13 = str65;
                                                            str14 = str64;
                                                            c = 65535;
                                                            break;
                                                        case 92909918:
                                                            if (next14.equals(str58)) {
                                                                c2 = 11;
                                                                c = c2;
                                                                obj8 = obj34;
                                                                obj9 = obj37;
                                                                str12 = str66;
                                                                obj10 = obj39;
                                                                str13 = str65;
                                                                str14 = str64;
                                                                break;
                                                            }
                                                            obj8 = obj34;
                                                            obj9 = obj37;
                                                            str12 = str66;
                                                            obj10 = obj39;
                                                            str13 = str65;
                                                            str14 = str64;
                                                            c = 65535;
                                                            break;
                                                        case 156108012:
                                                            if (next14.equals("waveOffset")) {
                                                                c2 = '\f';
                                                                c = c2;
                                                                obj8 = obj34;
                                                                obj9 = obj37;
                                                                str12 = str66;
                                                                obj10 = obj39;
                                                                str13 = str65;
                                                                str14 = str64;
                                                                break;
                                                            }
                                                            obj8 = obj34;
                                                            obj9 = obj37;
                                                            str12 = str66;
                                                            obj10 = obj39;
                                                            str13 = str65;
                                                            str14 = str64;
                                                            c = 65535;
                                                            break;
                                                        default:
                                                            obj8 = obj34;
                                                            obj9 = obj37;
                                                            str12 = str66;
                                                            obj10 = obj39;
                                                            str13 = str65;
                                                            str14 = str64;
                                                            c = 65535;
                                                            break;
                                                    }
                                                    switch (c) {
                                                        case 0:
                                                            c16232 = c16234;
                                                            f = c16232.f7619;
                                                            break;
                                                        case 1:
                                                            c16232 = c16234;
                                                            f = c16232.f7617;
                                                            break;
                                                        case 2:
                                                            c16232 = c16234;
                                                            f = c16232.f7627;
                                                            break;
                                                        case 3:
                                                            c16232 = c16234;
                                                            f = c16232.f7620;
                                                            break;
                                                        case 4:
                                                            c16232 = c16234;
                                                            f = c16232.f7621;
                                                            break;
                                                        case 5:
                                                            c16232 = c16234;
                                                            f = c16232.f7629;
                                                            break;
                                                        case 6:
                                                            c16232 = c16234;
                                                            f = c16232.f7618;
                                                            break;
                                                        case 7:
                                                            c16232 = c16234;
                                                            f = c16232.f7622;
                                                            break;
                                                        case '\b':
                                                            c16232 = c16234;
                                                            f = c16232.f7626;
                                                            break;
                                                        case '\t':
                                                            c16232 = c16234;
                                                            f = c16232.f7624;
                                                            break;
                                                        case '\n':
                                                            c16232 = c16234;
                                                            f = c16232.f7628;
                                                            break;
                                                        case 11:
                                                            c16232 = c16234;
                                                            f = c16232.f7630;
                                                            break;
                                                        case '\f':
                                                            c16232 = c16234;
                                                            f = c16232.f7614;
                                                            break;
                                                        default:
                                                            c16232 = c16234;
                                                            f = Float.NaN;
                                                            break;
                                                    }
                                                    if (Float.isNaN(f)) {
                                                        it25 = it27;
                                                        it26 = it28;
                                                        obj37 = obj9;
                                                        obj34 = obj8;
                                                        hashMap11 = hashMap12;
                                                        str62 = str13;
                                                        str56 = str12;
                                                        c16233 = c16232;
                                                        obj38 = obj10;
                                                        str63 = str14;
                                                        f5 = f7;
                                                    } else {
                                                        AbstractC1626 abstractC16263 = hashMap12.get(next14);
                                                        str9 = str14;
                                                        int i29 = c16232.f7473;
                                                        String str67 = str13;
                                                        int i30 = c16232.f7625;
                                                        String str68 = str12;
                                                        int i31 = c16232.f7616;
                                                        String str69 = str58;
                                                        String str70 = str61;
                                                        String str71 = str60;
                                                        String str72 = str57;
                                                        abstractC16263.f7653.add(new AbstractC1626.C1631(i29, c16232.f7615, c16232.f7614, f));
                                                        if (i31 != -1) {
                                                            abstractC16263.f7652 = i31;
                                                        }
                                                        abstractC16263.f7654 = i30;
                                                        it25 = it27;
                                                        f5 = f7;
                                                        obj37 = obj9;
                                                        obj34 = obj8;
                                                        c16233 = c16232;
                                                        hashMap11 = hashMap12;
                                                        str56 = str68;
                                                        str57 = str72;
                                                        str58 = str69;
                                                        str60 = str71;
                                                        str61 = str70;
                                                        str62 = str67;
                                                        it26 = it28;
                                                        obj38 = obj10;
                                                    }
                                                }
                                                str63 = str9;
                                            }
                                        }
                                        c1643 = this;
                                        it25 = it25;
                                        f5 = f5;
                                        obj38 = obj38;
                                        obj37 = obj37;
                                        obj34 = obj34;
                                        str56 = str56;
                                        str57 = str57;
                                        str58 = str58;
                                        str60 = str60;
                                        str61 = str61;
                                        str62 = str62;
                                        str63 = str63;
                                    }
                                    float f8 = f5;
                                    Iterator<AbstractC1626> it29 = c1643.f7676.values().iterator();
                                    while (it29.hasNext()) {
                                        it29.next().m3576(f8);
                                    }
                                    return;
                                }
                                return;
                            }
                            String str73 = strArr3[i24];
                            int i32 = 0;
                            int i33 = 0;
                            double[] dArr8 = null;
                            double[][] dArr9 = null;
                            while (i32 < size) {
                                if (c1603Arr[i32].f7550.containsKey(str73)) {
                                    if (dArr9 == null) {
                                        dArr8 = new double[size];
                                        dArr9 = (double[][]) Array.newInstance((Class<?>) double.class, size, c1603Arr[i32].f7550.get(str73).m3531());
                                    }
                                    dArr8[i33] = c1603Arr[i32].f7553;
                                    C1603 c16034 = c1603Arr[i32];
                                    double[] dArr10 = dArr9[i33];
                                    C1572 c15725 = c16034.f7550.get(str73);
                                    str23 = str73;
                                    if (c15725.m3531() == 1) {
                                        dArr = dArr8;
                                        dArr2 = dArr9;
                                        dArr10[0] = c15725.m3528();
                                    } else {
                                        dArr = dArr8;
                                        dArr2 = dArr9;
                                        int m3531 = c15725.m3531();
                                        float[] fArr2 = new float[m3531];
                                        c15725.m3530(fArr2);
                                        int i34 = 0;
                                        int i35 = 0;
                                        while (i34 < m3531) {
                                            dArr10[i35] = fArr2[i34];
                                            i34++;
                                            m3531 = m3531;
                                            i35++;
                                            str33 = str33;
                                            fArr2 = fArr2;
                                        }
                                    }
                                    str24 = str33;
                                    i33++;
                                    dArr8 = dArr;
                                    dArr9 = dArr2;
                                } else {
                                    str23 = str73;
                                    str24 = str33;
                                }
                                i32++;
                                str73 = str23;
                                str33 = str24;
                            }
                            i24++;
                            c1643.f7669[i24] = AbstractC1651.m3591(c1643.f7679, Arrays.copyOf(dArr8, i33), (double[][]) Arrays.copyOf(dArr9, i33));
                            str33 = str33;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0229 A[LOOP:5: B:103:0x0224->B:105:0x0229, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0248 A[EDGE_INSN: B:106:0x0248->B:107:0x0248 BREAK  A[LOOP:5: B:103:0x0224->B:105:0x0229], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bd  */
    /* renamed from: びぐびあび, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m3583(android.view.View r24, float r25, long r26, p034.p086.p091.p092.C1645 r28) {
        /*
            Method dump skipped, instructions count: 1250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p086.p091.p092.C1643.m3583(android.view.View, float, long, づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.びぐびあび):boolean");
    }
}
