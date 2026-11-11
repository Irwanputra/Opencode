package p034.p086.p091.p092;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p034.p086.p090.C1575;

/* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1623 extends AbstractC1579 {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f7623 = 0;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f7625 = -1;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public float f7615 = Float.NaN;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public float f7614 = 0.0f;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public float f7629 = Float.NaN;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f7616 = -1;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public float f7630 = Float.NaN;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public float f7624 = Float.NaN;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public float f7626 = Float.NaN;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public float f7628 = Float.NaN;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public float f7619 = Float.NaN;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public float f7617 = Float.NaN;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public float f7618 = Float.NaN;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public float f7622 = Float.NaN;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public float f7627 = Float.NaN;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public float f7620 = Float.NaN;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public float f7621 = Float.NaN;

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.づざかべべ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1624 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public static SparseIntArray f7631;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7631 = sparseIntArray;
            sparseIntArray.append(C1575.KeyCycle_motionTarget, 1);
            f7631.append(C1575.KeyCycle_framePosition, 2);
            f7631.append(C1575.KeyCycle_transitionEasing, 3);
            f7631.append(C1575.KeyCycle_curveFit, 4);
            f7631.append(C1575.KeyCycle_waveShape, 5);
            f7631.append(C1575.KeyCycle_wavePeriod, 6);
            f7631.append(C1575.KeyCycle_waveOffset, 7);
            f7631.append(C1575.KeyCycle_waveVariesBy, 8);
            f7631.append(C1575.KeyCycle_android_alpha, 9);
            f7631.append(C1575.KeyCycle_android_elevation, 10);
            f7631.append(C1575.KeyCycle_android_rotation, 11);
            f7631.append(C1575.KeyCycle_android_rotationX, 12);
            f7631.append(C1575.KeyCycle_android_rotationY, 13);
            f7631.append(C1575.KeyCycle_transitionPathRotate, 14);
            f7631.append(C1575.KeyCycle_android_scaleX, 15);
            f7631.append(C1575.KeyCycle_android_scaleY, 16);
            f7631.append(C1575.KeyCycle_android_translationX, 17);
            f7631.append(C1575.KeyCycle_android_translationY, 18);
            f7631.append(C1575.KeyCycle_android_translationZ, 19);
            f7631.append(C1575.KeyCycle_motionProgress, 20);
        }
    }

    public C1623() {
        this.f7474 = new HashMap<>();
    }

    @Override // p034.p086.p091.p092.AbstractC1579
    /* renamed from: 〺つふすそ */
    public void mo3534(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f7630)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f7624)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f7626)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f7619)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f7617)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f7618)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f7622)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f7628)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f7627)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f7620)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f7621)) {
            hashSet.add("translationZ");
        }
        if (this.f7474.size() > 0) {
            Iterator<String> it = this.f7474.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // p034.p086.p091.p092.AbstractC1579
    /* renamed from: くし〴〺ぅ */
    public void mo3532(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1575.KeyCycle);
        SparseIntArray sparseIntArray = C1624.f7631;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (C1624.f7631.get(index)) {
                case 1:
                    if (MotionLayout.f688) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f7471);
                        this.f7471 = resourceId;
                        if (resourceId != -1) {
                            break;
                        }
                        this.f7472 = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f7471 = obtainStyledAttributes.getResourceId(index, this.f7471);
                            break;
                        }
                        this.f7472 = obtainStyledAttributes.getString(index);
                    }
                case 2:
                    this.f7473 = obtainStyledAttributes.getInt(index, this.f7473);
                    break;
                case 3:
                    obtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f7623 = obtainStyledAttributes.getInteger(index, this.f7623);
                    break;
                case 5:
                    this.f7625 = obtainStyledAttributes.getInt(index, this.f7625);
                    break;
                case 6:
                    this.f7615 = obtainStyledAttributes.getFloat(index, this.f7615);
                    break;
                case 7:
                    this.f7614 = obtainStyledAttributes.peekValue(index).type == 5 ? obtainStyledAttributes.getDimension(index, this.f7614) : obtainStyledAttributes.getFloat(index, this.f7614);
                    break;
                case 8:
                    this.f7616 = obtainStyledAttributes.getInt(index, this.f7616);
                    break;
                case 9:
                    this.f7630 = obtainStyledAttributes.getFloat(index, this.f7630);
                    break;
                case 10:
                    this.f7624 = obtainStyledAttributes.getDimension(index, this.f7624);
                    break;
                case 11:
                    this.f7626 = obtainStyledAttributes.getFloat(index, this.f7626);
                    break;
                case 12:
                    this.f7619 = obtainStyledAttributes.getFloat(index, this.f7619);
                    break;
                case 13:
                    this.f7617 = obtainStyledAttributes.getFloat(index, this.f7617);
                    break;
                case 14:
                    this.f7628 = obtainStyledAttributes.getFloat(index, this.f7628);
                    break;
                case 15:
                    this.f7618 = obtainStyledAttributes.getFloat(index, this.f7618);
                    break;
                case 16:
                    this.f7622 = obtainStyledAttributes.getFloat(index, this.f7622);
                    break;
                case 17:
                    this.f7627 = obtainStyledAttributes.getDimension(index, this.f7627);
                    break;
                case 18:
                    this.f7620 = obtainStyledAttributes.getDimension(index, this.f7620);
                    break;
                case 19:
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f7621 = obtainStyledAttributes.getDimension(index, this.f7621);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    this.f7629 = obtainStyledAttributes.getFloat(index, this.f7629);
                    break;
                default:
                    Integer.toHexString(index);
                    C1624.f7631.get(index);
                    break;
            }
        }
    }

    @Override // p034.p086.p091.p092.AbstractC1579
    /* renamed from: げつ〴ぬぐ */
    public void mo3533(HashMap<String, AbstractC1587> hashMap) {
        AbstractC1587 abstractC1587;
        int i;
        float f;
        hashMap.size();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(2, stackTrace.length - 1);
        String str = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            stackTrace[i2].getFileName();
            stackTrace[i2].getLineNumber();
            stackTrace[i2].getMethodName();
            str = str + " ";
        }
        for (String str2 : hashMap.keySet()) {
            abstractC1587 = hashMap.get(str2);
            str2.hashCode();
            switch (str2) {
                case "rotationX":
                    i = this.f7473;
                    f = this.f7619;
                    abstractC1587.mo3554(i, f);
                    break;
                case "rotationY":
                    i = this.f7473;
                    f = this.f7617;
                    abstractC1587.mo3554(i, f);
                    break;
                case "translationX":
                    i = this.f7473;
                    f = this.f7627;
                    abstractC1587.mo3554(i, f);
                    break;
                case "translationY":
                    i = this.f7473;
                    f = this.f7620;
                    abstractC1587.mo3554(i, f);
                    break;
                case "translationZ":
                    i = this.f7473;
                    f = this.f7621;
                    abstractC1587.mo3554(i, f);
                    break;
                case "progress":
                    i = this.f7473;
                    f = this.f7629;
                    abstractC1587.mo3554(i, f);
                    break;
                case "scaleX":
                    i = this.f7473;
                    f = this.f7618;
                    abstractC1587.mo3554(i, f);
                    break;
                case "scaleY":
                    i = this.f7473;
                    f = this.f7622;
                    abstractC1587.mo3554(i, f);
                    break;
                case "rotation":
                    i = this.f7473;
                    f = this.f7626;
                    abstractC1587.mo3554(i, f);
                    break;
                case "elevation":
                    i = this.f7473;
                    f = this.f7624;
                    abstractC1587.mo3554(i, f);
                    break;
                case "transitionPathRotate":
                    i = this.f7473;
                    f = this.f7628;
                    abstractC1587.mo3554(i, f);
                    break;
                case "alpha":
                    i = this.f7473;
                    f = this.f7630;
                    abstractC1587.mo3554(i, f);
                    break;
                case "waveOffset":
                    i = this.f7473;
                    f = this.f7614;
                    abstractC1587.mo3554(i, f);
                    break;
            }
        }
    }
}
