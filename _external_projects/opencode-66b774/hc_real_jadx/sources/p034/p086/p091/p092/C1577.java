package p034.p086.p091.p092;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import p034.p086.p090.C1575;
import p034.p086.p091.p093.C1654;

/* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1577 extends AbstractC1647 {

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public String f7466 = null;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f7463 = -1;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f7462 = 0;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public float f7468 = Float.NaN;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public float f7464 = Float.NaN;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public float f7469 = Float.NaN;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public float f7465 = Float.NaN;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f7467 = 0;

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.〳ぜぞぜべっ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1578 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public static SparseIntArray f7470;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7470 = sparseIntArray;
            sparseIntArray.append(C1575.KeyPosition_motionTarget, 1);
            f7470.append(C1575.KeyPosition_framePosition, 2);
            f7470.append(C1575.KeyPosition_transitionEasing, 3);
            f7470.append(C1575.KeyPosition_curveFit, 4);
            f7470.append(C1575.KeyPosition_drawPath, 5);
            f7470.append(C1575.KeyPosition_percentX, 6);
            f7470.append(C1575.KeyPosition_percentY, 7);
            f7470.append(C1575.KeyPosition_keyPositionType, 9);
            f7470.append(C1575.KeyPosition_sizePercent, 8);
            f7470.append(C1575.KeyPosition_percentWidth, 11);
            f7470.append(C1575.KeyPosition_percentHeight, 12);
            f7470.append(C1575.KeyPosition_pathMotionArc, 10);
        }
    }

    @Override // p034.p086.p091.p092.AbstractC1579
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void mo3532(Context context, AttributeSet attributeSet) {
        float f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1575.KeyPosition);
        SparseIntArray sparseIntArray = C1578.f7470;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (C1578.f7470.get(index)) {
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
                            continue;
                        }
                        this.f7472 = obtainStyledAttributes.getString(index);
                    }
                case 2:
                    this.f7473 = obtainStyledAttributes.getInt(index, this.f7473);
                    continue;
                case 3:
                    this.f7466 = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : C1654.f7740[obtainStyledAttributes.getInteger(index, 0)];
                    continue;
                case 4:
                    this.f7697 = obtainStyledAttributes.getInteger(index, this.f7697);
                    continue;
                case 5:
                    this.f7462 = obtainStyledAttributes.getInt(index, this.f7462);
                    continue;
                case 6:
                    this.f7469 = obtainStyledAttributes.getFloat(index, this.f7469);
                    continue;
                case 7:
                    this.f7465 = obtainStyledAttributes.getFloat(index, this.f7465);
                    continue;
                case 8:
                    f = obtainStyledAttributes.getFloat(index, this.f7464);
                    this.f7468 = f;
                    break;
                case 9:
                    this.f7467 = obtainStyledAttributes.getInt(index, this.f7467);
                    continue;
                case 10:
                    this.f7463 = obtainStyledAttributes.getInt(index, this.f7463);
                    continue;
                case 11:
                    this.f7468 = obtainStyledAttributes.getFloat(index, this.f7468);
                    continue;
                case 12:
                    f = obtainStyledAttributes.getFloat(index, this.f7464);
                    break;
                default:
                    Integer.toHexString(index);
                    C1578.f7470.get(index);
                    continue;
            }
            this.f7464 = f;
        }
    }

    @Override // p034.p086.p091.p092.AbstractC1579
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo3533(HashMap<String, AbstractC1587> hashMap) {
    }
}
