package p034.p086.p091.p092;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p034.p086.p090.C1575;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1581 extends AbstractC1579 {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f7485 = -1;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public float f7487 = Float.NaN;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public float f7478 = Float.NaN;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public float f7477 = Float.NaN;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public float f7491 = Float.NaN;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public float f7479 = Float.NaN;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public float f7492 = Float.NaN;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public float f7486 = Float.NaN;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public float f7488 = Float.NaN;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public float f7490 = Float.NaN;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public float f7482 = Float.NaN;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public float f7480 = Float.NaN;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public float f7481 = Float.NaN;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f7484 = 0;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public float f7489 = Float.NaN;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public float f7483 = 0.0f;

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.いいにぽつ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1582 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public static SparseIntArray f7493;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7493 = sparseIntArray;
            sparseIntArray.append(C1575.KeyTimeCycle_android_alpha, 1);
            f7493.append(C1575.KeyTimeCycle_android_elevation, 2);
            f7493.append(C1575.KeyTimeCycle_android_rotation, 4);
            f7493.append(C1575.KeyTimeCycle_android_rotationX, 5);
            f7493.append(C1575.KeyTimeCycle_android_rotationY, 6);
            f7493.append(C1575.KeyTimeCycle_android_scaleX, 7);
            f7493.append(C1575.KeyTimeCycle_transitionPathRotate, 8);
            f7493.append(C1575.KeyTimeCycle_transitionEasing, 9);
            f7493.append(C1575.KeyTimeCycle_motionTarget, 10);
            f7493.append(C1575.KeyTimeCycle_framePosition, 12);
            f7493.append(C1575.KeyTimeCycle_curveFit, 13);
            f7493.append(C1575.KeyTimeCycle_android_scaleY, 14);
            f7493.append(C1575.KeyTimeCycle_android_translationX, 15);
            f7493.append(C1575.KeyTimeCycle_android_translationY, 16);
            f7493.append(C1575.KeyTimeCycle_android_translationZ, 17);
            f7493.append(C1575.KeyTimeCycle_motionProgress, 18);
            f7493.append(C1575.KeyTimeCycle_wavePeriod, 20);
            f7493.append(C1575.KeyTimeCycle_waveOffset, 21);
            f7493.append(C1575.KeyTimeCycle_waveShape, 19);
        }
    }

    public C1581() {
        this.f7474 = new HashMap<>();
    }

    @Override // p034.p086.p091.p092.AbstractC1579
    /* renamed from: 〺つふすそ */
    public void mo3534(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f7487)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f7478)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f7477)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f7491)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f7479)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f7490)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f7482)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f7480)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f7492)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f7486)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f7488)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f7481)) {
            hashSet.add(NotificationCompat.CATEGORY_PROGRESS);
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1575.KeyTimeCycle);
        SparseIntArray sparseIntArray = C1582.f7493;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (C1582.f7493.get(index)) {
                case 1:
                    this.f7487 = obtainStyledAttributes.getFloat(index, this.f7487);
                    break;
                case 2:
                    this.f7478 = obtainStyledAttributes.getDimension(index, this.f7478);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    C1582.f7493.get(index);
                    break;
                case 4:
                    this.f7477 = obtainStyledAttributes.getFloat(index, this.f7477);
                    break;
                case 5:
                    this.f7491 = obtainStyledAttributes.getFloat(index, this.f7491);
                    break;
                case 6:
                    this.f7479 = obtainStyledAttributes.getFloat(index, this.f7479);
                    break;
                case 7:
                    this.f7486 = obtainStyledAttributes.getFloat(index, this.f7486);
                    break;
                case 8:
                    this.f7492 = obtainStyledAttributes.getFloat(index, this.f7492);
                    break;
                case 9:
                    obtainStyledAttributes.getString(index);
                    break;
                case 10:
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
                case 12:
                    this.f7473 = obtainStyledAttributes.getInt(index, this.f7473);
                    break;
                case 13:
                    this.f7485 = obtainStyledAttributes.getInteger(index, this.f7485);
                    break;
                case 14:
                    this.f7488 = obtainStyledAttributes.getFloat(index, this.f7488);
                    break;
                case 15:
                    this.f7490 = obtainStyledAttributes.getDimension(index, this.f7490);
                    break;
                case 16:
                    this.f7482 = obtainStyledAttributes.getDimension(index, this.f7482);
                    break;
                case 17:
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f7480 = obtainStyledAttributes.getDimension(index, this.f7480);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    this.f7481 = obtainStyledAttributes.getFloat(index, this.f7481);
                    break;
                case 19:
                    this.f7484 = obtainStyledAttributes.getInt(index, this.f7484);
                    break;
                case 20:
                    this.f7489 = obtainStyledAttributes.getFloat(index, this.f7489);
                    break;
                case 21:
                    this.f7483 = obtainStyledAttributes.peekValue(index).type == 5 ? obtainStyledAttributes.getDimension(index, this.f7483) : obtainStyledAttributes.getFloat(index, this.f7483);
                    break;
            }
        }
    }

    @Override // p034.p086.p091.p092.AbstractC1579
    /* renamed from: げつ〴ぬぐ */
    public void mo3533(HashMap<String, AbstractC1587> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // p034.p086.p091.p092.AbstractC1579
    /* renamed from: びぐびあび */
    public void mo3535(HashMap<String, Integer> hashMap) {
        if (this.f7485 == -1) {
            return;
        }
        if (!Float.isNaN(this.f7487)) {
            hashMap.put("alpha", Integer.valueOf(this.f7485));
        }
        if (!Float.isNaN(this.f7478)) {
            hashMap.put("elevation", Integer.valueOf(this.f7485));
        }
        if (!Float.isNaN(this.f7477)) {
            hashMap.put("rotation", Integer.valueOf(this.f7485));
        }
        if (!Float.isNaN(this.f7491)) {
            hashMap.put("rotationX", Integer.valueOf(this.f7485));
        }
        if (!Float.isNaN(this.f7479)) {
            hashMap.put("rotationY", Integer.valueOf(this.f7485));
        }
        if (!Float.isNaN(this.f7490)) {
            hashMap.put("translationX", Integer.valueOf(this.f7485));
        }
        if (!Float.isNaN(this.f7482)) {
            hashMap.put("translationY", Integer.valueOf(this.f7485));
        }
        if (!Float.isNaN(this.f7480)) {
            hashMap.put("translationZ", Integer.valueOf(this.f7485));
        }
        if (!Float.isNaN(this.f7492)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f7485));
        }
        if (!Float.isNaN(this.f7486)) {
            hashMap.put("scaleX", Integer.valueOf(this.f7485));
        }
        if (!Float.isNaN(this.f7486)) {
            hashMap.put("scaleY", Integer.valueOf(this.f7485));
        }
        if (!Float.isNaN(this.f7481)) {
            hashMap.put(NotificationCompat.CATEGORY_PROGRESS, Integer.valueOf(this.f7485));
        }
        if (this.f7474.size() > 0) {
            Iterator<String> it = this.f7474.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put(C2098.m4205("CUSTOM,", it.next()), Integer.valueOf(this.f7485));
            }
        }
    }
}
