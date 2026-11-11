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

/* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1604 extends AbstractC1579 {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f7564 = -1;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public float f7566 = Float.NaN;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public float f7558 = Float.NaN;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public float f7557 = Float.NaN;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public float f7570 = Float.NaN;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public float f7559 = Float.NaN;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public float f7571 = Float.NaN;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public float f7565 = Float.NaN;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public float f7567 = Float.NaN;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public float f7569 = Float.NaN;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public float f7562 = Float.NaN;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public float f7560 = Float.NaN;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public float f7561 = Float.NaN;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public float f7563 = Float.NaN;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public float f7568 = Float.NaN;

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.くし〴〺ぅ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1605 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public static SparseIntArray f7572;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7572 = sparseIntArray;
            sparseIntArray.append(C1575.KeyAttribute_android_alpha, 1);
            f7572.append(C1575.KeyAttribute_android_elevation, 2);
            f7572.append(C1575.KeyAttribute_android_rotation, 4);
            f7572.append(C1575.KeyAttribute_android_rotationX, 5);
            f7572.append(C1575.KeyAttribute_android_rotationY, 6);
            f7572.append(C1575.KeyAttribute_android_transformPivotX, 19);
            f7572.append(C1575.KeyAttribute_android_transformPivotY, 20);
            f7572.append(C1575.KeyAttribute_android_scaleX, 7);
            f7572.append(C1575.KeyAttribute_transitionPathRotate, 8);
            f7572.append(C1575.KeyAttribute_transitionEasing, 9);
            f7572.append(C1575.KeyAttribute_motionTarget, 10);
            f7572.append(C1575.KeyAttribute_framePosition, 12);
            f7572.append(C1575.KeyAttribute_curveFit, 13);
            f7572.append(C1575.KeyAttribute_android_scaleY, 14);
            f7572.append(C1575.KeyAttribute_android_translationX, 15);
            f7572.append(C1575.KeyAttribute_android_translationY, 16);
            f7572.append(C1575.KeyAttribute_android_translationZ, 17);
            f7572.append(C1575.KeyAttribute_motionProgress, 18);
        }
    }

    public C1604() {
        this.f7474 = new HashMap<>();
    }

    @Override // p034.p086.p091.p092.AbstractC1579
    /* renamed from: 〺つふすそ */
    public void mo3534(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f7566)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f7558)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f7557)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f7570)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f7559)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f7571)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f7565)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f7560)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f7561)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f7563)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f7567)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f7569)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f7562)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f7568)) {
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1575.KeyAttribute);
        SparseIntArray sparseIntArray = C1605.f7572;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (C1605.f7572.get(index)) {
                case 1:
                    this.f7566 = obtainStyledAttributes.getFloat(index, this.f7566);
                    break;
                case 2:
                    this.f7558 = obtainStyledAttributes.getDimension(index, this.f7558);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    C1605.f7572.get(index);
                    break;
                case 4:
                    this.f7557 = obtainStyledAttributes.getFloat(index, this.f7557);
                    break;
                case 5:
                    this.f7570 = obtainStyledAttributes.getFloat(index, this.f7570);
                    break;
                case 6:
                    this.f7559 = obtainStyledAttributes.getFloat(index, this.f7559);
                    break;
                case 7:
                    this.f7569 = obtainStyledAttributes.getFloat(index, this.f7569);
                    break;
                case 8:
                    this.f7567 = obtainStyledAttributes.getFloat(index, this.f7567);
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
                    this.f7564 = obtainStyledAttributes.getInteger(index, this.f7564);
                    break;
                case 14:
                    this.f7562 = obtainStyledAttributes.getFloat(index, this.f7562);
                    break;
                case 15:
                    this.f7560 = obtainStyledAttributes.getDimension(index, this.f7560);
                    break;
                case 16:
                    this.f7561 = obtainStyledAttributes.getDimension(index, this.f7561);
                    break;
                case 17:
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f7563 = obtainStyledAttributes.getDimension(index, this.f7563);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    this.f7568 = obtainStyledAttributes.getFloat(index, this.f7568);
                    break;
                case 19:
                    this.f7571 = obtainStyledAttributes.getDimension(index, this.f7571);
                    break;
                case 20:
                    this.f7565 = obtainStyledAttributes.getDimension(index, this.f7565);
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x009e, code lost:
    
        if (r1.equals("scaleY") == false) goto L68;
     */
    @Override // p034.p086.p091.p092.AbstractC1579
    /* renamed from: げつ〴ぬぐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo3533(java.util.HashMap<java.lang.String, p034.p086.p091.p092.AbstractC1587> r6) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p086.p091.p092.C1604.mo3533(java.util.HashMap):void");
    }

    @Override // p034.p086.p091.p092.AbstractC1579
    /* renamed from: びぐびあび */
    public void mo3535(HashMap<String, Integer> hashMap) {
        if (this.f7564 == -1) {
            return;
        }
        if (!Float.isNaN(this.f7566)) {
            hashMap.put("alpha", Integer.valueOf(this.f7564));
        }
        if (!Float.isNaN(this.f7558)) {
            hashMap.put("elevation", Integer.valueOf(this.f7564));
        }
        if (!Float.isNaN(this.f7557)) {
            hashMap.put("rotation", Integer.valueOf(this.f7564));
        }
        if (!Float.isNaN(this.f7570)) {
            hashMap.put("rotationX", Integer.valueOf(this.f7564));
        }
        if (!Float.isNaN(this.f7559)) {
            hashMap.put("rotationY", Integer.valueOf(this.f7564));
        }
        if (!Float.isNaN(this.f7571)) {
            hashMap.put("transformPivotX", Integer.valueOf(this.f7564));
        }
        if (!Float.isNaN(this.f7565)) {
            hashMap.put("transformPivotY", Integer.valueOf(this.f7564));
        }
        if (!Float.isNaN(this.f7560)) {
            hashMap.put("translationX", Integer.valueOf(this.f7564));
        }
        if (!Float.isNaN(this.f7561)) {
            hashMap.put("translationY", Integer.valueOf(this.f7564));
        }
        if (!Float.isNaN(this.f7563)) {
            hashMap.put("translationZ", Integer.valueOf(this.f7564));
        }
        if (!Float.isNaN(this.f7567)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f7564));
        }
        if (!Float.isNaN(this.f7569)) {
            hashMap.put("scaleX", Integer.valueOf(this.f7564));
        }
        if (!Float.isNaN(this.f7562)) {
            hashMap.put("scaleY", Integer.valueOf(this.f7564));
        }
        if (!Float.isNaN(this.f7568)) {
            hashMap.put(NotificationCompat.CATEGORY_PROGRESS, Integer.valueOf(this.f7564));
        }
        if (this.f7474.size() > 0) {
            Iterator<String> it = this.f7474.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put(C2098.m4205("CUSTOM,", it.next()), Integer.valueOf(this.f7564));
            }
        }
    }
}
