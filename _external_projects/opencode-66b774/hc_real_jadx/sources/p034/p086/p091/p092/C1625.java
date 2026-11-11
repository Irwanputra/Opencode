package p034.p086.p091.p092;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p034.p086.p087.p088.C1544;
import p034.p086.p090.C1566;
import p034.p086.p090.C1572;
import p034.p086.p091.p092.AbstractC1587;
import p034.p086.p091.p093.C1654;

/* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.てぜきぽく, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1625 implements Comparable<C1625> {

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f7645;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public float f7633 = 1.0f;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f7639 = 0;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public float f7641 = 0.0f;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public float f7643 = 0.0f;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public float f7634 = 0.0f;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public float f7632 = 0.0f;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public float f7647 = 1.0f;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public float f7635 = 1.0f;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public float f7648 = Float.NaN;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public float f7642 = Float.NaN;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public float f7644 = 0.0f;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public float f7646 = 0.0f;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public float f7638 = 0.0f;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public float f7636 = Float.NaN;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public float f7637 = Float.NaN;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public LinkedHashMap<String, C1572> f7640 = new LinkedHashMap<>();

    @Override // java.lang.Comparable
    public int compareTo(C1625 c1625) {
        c1625.getClass();
        return Float.compare(0.0f, 0.0f);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final boolean m3570(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m3571(C1544 c1544, C1566 c1566, int i) {
        c1544.m3409();
        c1544.m3417();
        C1566.C1569 m3506 = c1566.m3506(i);
        C1566.C1571 c1571 = m3506.f7422;
        int i2 = c1571.f7443;
        this.f7639 = i2;
        int i3 = c1571.f7442;
        this.f7645 = i3;
        this.f7633 = (i3 == 0 || i2 != 0) ? c1571.f7446 : 0.0f;
        C1566.C1570 c1570 = m3506.f7425;
        boolean z = c1570.f7436;
        this.f7641 = c1570.f7438;
        this.f7643 = c1570.f7430;
        this.f7634 = c1570.f7433;
        this.f7632 = c1570.f7439;
        this.f7647 = c1570.f7435;
        this.f7635 = c1570.f7437;
        this.f7648 = c1570.f7431;
        this.f7642 = c1570.f7429;
        this.f7644 = c1570.f7440;
        this.f7646 = c1570.f7432;
        this.f7638 = c1570.f7441;
        C1654.m3601(m3506.f7423.f7417);
        this.f7636 = m3506.f7423.f7416;
        this.f7637 = m3506.f7422.f7445;
        for (String str : m3506.f7426.keySet()) {
            C1572 c1572 = m3506.f7426.get(str);
            if (c1572.f7447 != C1572.EnumC1573.STRING_TYPE) {
                this.f7640.put(str, c1572);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m3572(HashMap<String, AbstractC1587> hashMap, int i) {
        for (String str : hashMap.keySet()) {
            AbstractC1587 abstractC1587 = hashMap.get(str);
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals(NotificationCompat.CATEGORY_PROGRESS)) {
                        c = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = 7;
                        break;
                    }
                    break;
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c = '\r';
                        break;
                    }
                    break;
            }
            float f = 1.0f;
            float f2 = 0.0f;
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.f7634)) {
                        f2 = this.f7634;
                    }
                    abstractC1587.mo3554(i, f2);
                    break;
                case 1:
                    if (!Float.isNaN(this.f7632)) {
                        f2 = this.f7632;
                    }
                    abstractC1587.mo3554(i, f2);
                    break;
                case 2:
                    if (!Float.isNaN(this.f7644)) {
                        f2 = this.f7644;
                    }
                    abstractC1587.mo3554(i, f2);
                    break;
                case 3:
                    if (!Float.isNaN(this.f7646)) {
                        f2 = this.f7646;
                    }
                    abstractC1587.mo3554(i, f2);
                    break;
                case 4:
                    if (!Float.isNaN(this.f7638)) {
                        f2 = this.f7638;
                    }
                    abstractC1587.mo3554(i, f2);
                    break;
                case 5:
                    if (!Float.isNaN(this.f7637)) {
                        f2 = this.f7637;
                    }
                    abstractC1587.mo3554(i, f2);
                    break;
                case 6:
                    if (!Float.isNaN(this.f7647)) {
                        f = this.f7647;
                    }
                    abstractC1587.mo3554(i, f);
                    break;
                case 7:
                    if (!Float.isNaN(this.f7635)) {
                        f = this.f7635;
                    }
                    abstractC1587.mo3554(i, f);
                    break;
                case '\b':
                    if (!Float.isNaN(this.f7648)) {
                        f2 = this.f7648;
                    }
                    abstractC1587.mo3554(i, f2);
                    break;
                case '\t':
                    if (!Float.isNaN(this.f7642)) {
                        f2 = this.f7642;
                    }
                    abstractC1587.mo3554(i, f2);
                    break;
                case '\n':
                    if (!Float.isNaN(this.f7643)) {
                        f2 = this.f7643;
                    }
                    abstractC1587.mo3554(i, f2);
                    break;
                case 11:
                    if (!Float.isNaN(this.f7641)) {
                        f2 = this.f7641;
                    }
                    abstractC1587.mo3554(i, f2);
                    break;
                case '\f':
                    if (!Float.isNaN(this.f7636)) {
                        f2 = this.f7636;
                    }
                    abstractC1587.mo3554(i, f2);
                    break;
                case '\r':
                    if (!Float.isNaN(this.f7633)) {
                        f = this.f7633;
                    }
                    abstractC1587.mo3554(i, f);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.f7640.containsKey(str2)) {
                            C1572 c1572 = this.f7640.get(str2);
                            if (abstractC1587 instanceof AbstractC1587.C1589) {
                                ((AbstractC1587.C1589) abstractC1587).f7540.append(i, c1572);
                                break;
                            } else {
                                String str3 = str + " splineSet not a CustomSet frame = " + i + ", value" + c1572.m3528() + abstractC1587;
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
            }
        }
    }
}
