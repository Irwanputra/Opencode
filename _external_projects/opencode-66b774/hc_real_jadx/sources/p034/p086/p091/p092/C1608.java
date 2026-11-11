package p034.p086.p091.p092;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import org.xmlpull.v1.XmlPullParser;
import p034.p086.p090.C1575;

/* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ざっざへづ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1608 {

    /* renamed from: でどあくず, reason: contains not printable characters */
    public static final float[][] f7575 = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public static final float[][] f7576 = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public float f7577;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f7578;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public float f7579;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public float f7580;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public float f7581;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public float f7582;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public final MotionLayout f7583;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f7584;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int f7585;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f7586;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public float f7587;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public boolean f7588;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f7589;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f7591;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public float f7592;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public float f7593;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f7594;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public float f7595;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public float f7596;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean f7597 = false;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public float[] f7590 = new float[2];

    public C1608(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f7585 = 0;
        this.f7578 = 0;
        this.f7584 = 0;
        this.f7594 = -1;
        this.f7589 = -1;
        this.f7591 = -1;
        this.f7579 = 0.5f;
        this.f7577 = 0.5f;
        this.f7596 = 0.0f;
        this.f7580 = 1.0f;
        this.f7581 = 4.0f;
        this.f7582 = 1.2f;
        this.f7588 = true;
        this.f7593 = 1.0f;
        this.f7586 = 0;
        this.f7587 = 10.0f;
        this.f7583 = motionLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1575.OnSwipe);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C1575.OnSwipe_touchAnchorId) {
                this.f7594 = obtainStyledAttributes.getResourceId(index, this.f7594);
            } else if (index == C1575.OnSwipe_touchAnchorSide) {
                int i2 = obtainStyledAttributes.getInt(index, this.f7585);
                this.f7585 = i2;
                float[][] fArr = f7575;
                this.f7577 = fArr[i2][0];
                this.f7579 = fArr[i2][1];
            } else if (index == C1575.OnSwipe_dragDirection) {
                int i3 = obtainStyledAttributes.getInt(index, this.f7578);
                this.f7578 = i3;
                float[][] fArr2 = f7576;
                this.f7596 = fArr2[i3][0];
                this.f7580 = fArr2[i3][1];
            } else if (index == C1575.OnSwipe_maxVelocity) {
                this.f7581 = obtainStyledAttributes.getFloat(index, this.f7581);
            } else if (index == C1575.OnSwipe_maxAcceleration) {
                this.f7582 = obtainStyledAttributes.getFloat(index, this.f7582);
            } else if (index == C1575.OnSwipe_moveWhenScrollAtTop) {
                this.f7588 = obtainStyledAttributes.getBoolean(index, this.f7588);
            } else if (index == C1575.OnSwipe_dragScale) {
                this.f7593 = obtainStyledAttributes.getFloat(index, this.f7593);
            } else if (index == C1575.OnSwipe_dragThreshold) {
                this.f7587 = obtainStyledAttributes.getFloat(index, this.f7587);
            } else if (index == C1575.OnSwipe_touchRegionId) {
                this.f7589 = obtainStyledAttributes.getResourceId(index, this.f7589);
            } else if (index == C1575.OnSwipe_onTouchUp) {
                this.f7584 = obtainStyledAttributes.getInt(index, this.f7584);
            } else if (index == C1575.OnSwipe_nestedScrollFlags) {
                this.f7586 = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == C1575.OnSwipe_limitBoundsTo) {
                this.f7591 = obtainStyledAttributes.getResourceId(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public String toString() {
        return this.f7596 + " , " + this.f7580;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m3563(boolean z) {
        if (z) {
            float[][] fArr = f7576;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f7575;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f7576;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f7575;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[][] fArr5 = f7575;
        int i = this.f7585;
        this.f7577 = fArr5[i][0];
        this.f7579 = fArr5[i][1];
        float[][] fArr6 = f7576;
        int i2 = this.f7578;
        this.f7596 = fArr6[i2][0];
        this.f7580 = fArr6[i2][1];
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public RectF m3564(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f7589;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }
}
