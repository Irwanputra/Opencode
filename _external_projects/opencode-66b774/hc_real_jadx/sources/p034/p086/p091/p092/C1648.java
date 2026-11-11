package p034.p086.p091.p092;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import p034.p086.p090.C1575;

/* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぺふねづ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1648 extends AbstractC1579 {

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public Method f7702;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public float f7704;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public Method f7706;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public Method f7712;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public String f7707 = null;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f7710 = -1;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public String f7699 = null;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public String f7698 = null;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f7715 = -1;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f7700 = -1;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public View f7716 = null;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public float f7708 = 0.1f;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean f7711 = true;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean f7714 = true;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public boolean f7703 = true;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public float f7701 = Float.NaN;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public boolean f7705 = false;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public RectF f7709 = new RectF();

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public RectF f7713 = new RectF();

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぺふねづ〺$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1649 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public static SparseIntArray f7717;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7717 = sparseIntArray;
            sparseIntArray.append(C1575.KeyTrigger_framePosition, 8);
            f7717.append(C1575.KeyTrigger_onCross, 4);
            f7717.append(C1575.KeyTrigger_onNegativeCross, 1);
            f7717.append(C1575.KeyTrigger_onPositiveCross, 2);
            f7717.append(C1575.KeyTrigger_motionTarget, 7);
            f7717.append(C1575.KeyTrigger_triggerId, 6);
            f7717.append(C1575.KeyTrigger_triggerSlack, 5);
            f7717.append(C1575.KeyTrigger_motion_triggerOnCollision, 9);
            f7717.append(C1575.KeyTrigger_motion_postLayoutCollision, 10);
            f7717.append(C1575.KeyTrigger_triggerReceiver, 11);
        }
    }

    public C1648() {
        this.f7474 = new HashMap<>();
    }

    @Override // p034.p086.p091.p092.AbstractC1579
    /* renamed from: 〺つふすそ */
    public void mo3534(HashSet<String> hashSet) {
    }

    @Override // p034.p086.p091.p092.AbstractC1579
    /* renamed from: くし〴〺ぅ */
    public void mo3532(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1575.KeyTrigger);
        SparseIntArray sparseIntArray = C1649.f7717;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (C1649.f7717.get(index)) {
                case 1:
                    this.f7699 = obtainStyledAttributes.getString(index);
                    continue;
                case 2:
                    this.f7698 = obtainStyledAttributes.getString(index);
                    continue;
                case 4:
                    this.f7707 = obtainStyledAttributes.getString(index);
                    continue;
                case 5:
                    this.f7708 = obtainStyledAttributes.getFloat(index, this.f7708);
                    continue;
                case 6:
                    this.f7715 = obtainStyledAttributes.getResourceId(index, this.f7715);
                    continue;
                case 7:
                    if (MotionLayout.f688) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f7471);
                        this.f7471 = resourceId;
                        if (resourceId != -1) {
                            continue;
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
                case 8:
                    int integer = obtainStyledAttributes.getInteger(index, this.f7473);
                    this.f7473 = integer;
                    this.f7701 = (integer + 0.5f) / 100.0f;
                    continue;
                case 9:
                    this.f7700 = obtainStyledAttributes.getResourceId(index, this.f7700);
                    continue;
                case 10:
                    this.f7705 = obtainStyledAttributes.getBoolean(index, this.f7705);
                    continue;
                case 11:
                    this.f7710 = obtainStyledAttributes.getResourceId(index, this.f7710);
                    break;
            }
            Integer.toHexString(index);
            C1649.f7717.get(index);
        }
    }

    @Override // p034.p086.p091.p092.AbstractC1579
    /* renamed from: げつ〴ぬぐ */
    public void mo3533(HashMap<String, AbstractC1587> hashMap) {
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m3585(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }
}
