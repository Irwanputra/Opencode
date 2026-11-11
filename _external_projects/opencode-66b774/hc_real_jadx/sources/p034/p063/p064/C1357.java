package p034.p063.p064;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import p034.p035.p045.C1096;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.いいにぽつ.げつ〴ぬぐ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1357 {

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public static final Interpolator f6475 = new InterpolatorC1360();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int[] f6476;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f6477;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public float[] f6478;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int[] f6479;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int f6480;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public OverScroller f6481;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int f6482;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int f6484;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public boolean f6485;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public final ViewGroup f6486;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public final AbstractC1359 f6487;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public float[] f6488;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public VelocityTracker f6489;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public float[] f6491;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public float f6492;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public View f6493;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public float[] f6494;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public float f6495;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int[] f6496;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f6497;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f6483 = -1;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public final Runnable f6490 = new RunnableC1358();

    /* renamed from: づざかべべ.いいにぽつ.げつ〴ぬぐ.づざかべべ$〺つふすそ, reason: contains not printable characters */
    public class RunnableC1358 implements Runnable {
        public RunnableC1358() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1357.this.m3073(0);
        }
    }

    /* renamed from: づざかべべ.いいにぽつ.げつ〴ぬぐ.づざかべべ$くし〴〺ぅ, reason: contains not printable characters */
    public static abstract class AbstractC1359 {
        /* renamed from: 〳ぜぞぜべっ */
        public void mo458(View view, int i) {
        }

        /* renamed from: 〺つふすそ */
        public abstract int mo459(View view, int i, int i2);

        /* renamed from: ぁごぐすすぃ */
        public void mo460(int i, int i2) {
        }

        /* renamed from: いいにぽつ */
        public abstract void mo461(View view, int i, int i2, int i3, int i4);

        /* renamed from: くし〴〺ぅ */
        public int mo462(View view) {
            return 0;
        }

        /* renamed from: げつ〴ぬぐ */
        public abstract int mo463(View view, int i, int i2);

        /* renamed from: づざかべべ */
        public void mo464(int i, int i2) {
        }

        /* renamed from: てぜきぽく */
        public abstract boolean mo465(View view, int i);

        /* renamed from: なぎぱいぢぎ */
        public boolean mo466(int i) {
            return false;
        }

        /* renamed from: びぐびあび */
        public int mo1356(View view) {
            return 0;
        }

        /* renamed from: ぺぁあねじ */
        public abstract void mo469(int i);

        /* renamed from: ぺふねづ〺 */
        public abstract void mo470(View view, float f, float f2);
    }

    /* renamed from: づざかべべ.いいにぽつ.げつ〴ぬぐ.づざかべべ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class InterpolatorC1360 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public C1357(Context context, ViewGroup viewGroup, AbstractC1359 abstractC1359) {
        if (abstractC1359 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f6486 = viewGroup;
        this.f6487 = abstractC1359;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f6482 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f6477 = viewConfiguration.getScaledTouchSlop();
        this.f6492 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f6495 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6481 = new OverScroller(context, f6475);
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static C1357 m3049(ViewGroup viewGroup, float f, AbstractC1359 abstractC1359) {
        C1357 c1357 = new C1357(viewGroup.getContext(), viewGroup, abstractC1359);
        c1357.f6477 = (int) ((1.0f / f) * c1357.f6477);
        return c1357;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final void m3050(int i) {
        if (this.f6494 == null || !m3059(i)) {
            return;
        }
        this.f6494[i] = 0.0f;
        this.f6488[i] = 0.0f;
        this.f6491[i] = 0.0f;
        this.f6478[i] = 0.0f;
        this.f6476[i] = 0;
        this.f6496[i] = 0;
        this.f6479[i] = 0;
        this.f6497 = ((1 << i) ^ (-1)) & this.f6497;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m3051() {
        this.f6483 = -1;
        float[] fArr = this.f6494;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f6488, 0.0f);
            Arrays.fill(this.f6491, 0.0f);
            Arrays.fill(this.f6478, 0.0f);
            Arrays.fill(this.f6476, 0);
            Arrays.fill(this.f6496, 0);
            Arrays.fill(this.f6479, 0);
            this.f6497 = 0;
        }
        VelocityTracker velocityTracker = this.f6489;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6489 = null;
        }
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public boolean m3052(int i, int i2) {
        if (this.f6485) {
            return m3074(i, i2, (int) this.f6489.getXVelocity(this.f6483), (int) this.f6489.getYVelocity(this.f6483));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final int m3053(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean m3054(boolean z) {
        if (this.f6484 == 2) {
            boolean computeScrollOffset = this.f6481.computeScrollOffset();
            int currX = this.f6481.getCurrX();
            int currY = this.f6481.getCurrY();
            int left = currX - this.f6493.getLeft();
            int top = currY - this.f6493.getTop();
            if (left != 0) {
                C1096.m2483(this.f6493, left);
            }
            if (top != 0) {
                C1096.m2515(this.f6493, top);
            }
            if (left != 0 || top != 0) {
                this.f6487.mo461(this.f6493, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f6481.getFinalX() && currY == this.f6481.getFinalY()) {
                this.f6481.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f6486.post(this.f6490);
                } else {
                    m3073(0);
                }
            }
        }
        return this.f6484 == 2;
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public boolean m3055(View view, int i, int i2) {
        this.f6493 = view;
        this.f6483 = -1;
        boolean m3074 = m3074(i, i2, 0, 0);
        if (!m3074 && this.f6484 == 0 && this.f6493 != null) {
            this.f6493 = null;
        }
        return m3074;
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final boolean m3056(int i) {
        return m3059(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00de, code lost:
    
        if (r12 != r11) goto L54;
     */
    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m3057(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p063.p064.C1357.m3057(android.view.MotionEvent):boolean");
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public boolean m3058(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public boolean m3059(int i) {
        return ((1 << i) & this.f6497) != 0;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m3060(View view, int i) {
        if (view.getParent() != this.f6486) {
            StringBuilder m4207 = C2098.m4207("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            m4207.append(this.f6486);
            m4207.append(")");
            throw new IllegalArgumentException(m4207.toString());
        }
        this.f6493 = view;
        this.f6483 = i;
        this.f6487.mo458(view, i);
        m3073(1);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m3061() {
        m3051();
        if (this.f6484 == 2) {
            int currX = this.f6481.getCurrX();
            int currY = this.f6481.getCurrY();
            this.f6481.abortAnimation();
            int currX2 = this.f6481.getCurrX();
            int currY2 = this.f6481.getCurrY();
            this.f6487.mo461(this.f6493, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        m3073(0);
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public final void m3062(float f, float f2, int i) {
        int i2 = m3072(f, f2, i, 1) ? 1 : 0;
        if (m3072(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m3072(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m3072(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f6496;
            iArr[i] = iArr[i] | i2;
            this.f6487.mo464(i2, i);
        }
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public final void m3063(float f, float f2, int i) {
        float[] fArr = this.f6494;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f6488;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f6491;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f6478;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f6476;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f6496;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f6479;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f6494 = fArr2;
            this.f6488 = fArr3;
            this.f6491 = fArr4;
            this.f6478 = fArr5;
            this.f6476 = iArr;
            this.f6496 = iArr2;
            this.f6479 = iArr3;
        }
        float[] fArr9 = this.f6494;
        this.f6491[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f6488;
        this.f6478[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f6476;
        int i3 = (int) f;
        int i4 = (int) f2;
        int i5 = i3 < this.f6486.getLeft() + this.f6482 ? 1 : 0;
        if (i4 < this.f6486.getTop() + this.f6482) {
            i5 |= 4;
        }
        if (i3 > this.f6486.getRight() - this.f6482) {
            i5 |= 2;
        }
        if (i4 > this.f6486.getBottom() - this.f6482) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.f6497 |= 1 << i;
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public void m3064(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m3051();
        }
        if (this.f6489 == null) {
            this.f6489 = VelocityTracker.obtain();
        }
        this.f6489.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View m3069 = m3069((int) x, (int) y);
            m3063(x, y, pointerId);
            m3071(m3069, pointerId);
            int i3 = this.f6476[pointerId];
            int i4 = this.f6480;
            if ((i3 & i4) != 0) {
                this.f6487.mo460(i3 & i4, pointerId);
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f6484 != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i2 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (m3056(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.f6494[pointerId2];
                            float f2 = y2 - this.f6488[pointerId2];
                            m3062(f, f2, pointerId2);
                            if (this.f6484 != 1) {
                                View m30692 = m3069((int) x2, (int) y2);
                                if (m3065(m30692, f, f2) && m3071(m30692, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i2++;
                    }
                } else {
                    if (!m3056(this.f6483)) {
                        return;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(this.f6483);
                    float x3 = motionEvent.getX(findPointerIndex);
                    float y3 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f6491;
                    int i5 = this.f6483;
                    int i6 = (int) (x3 - fArr[i5]);
                    int i7 = (int) (y3 - this.f6478[i5]);
                    int left = this.f6493.getLeft() + i6;
                    int top = this.f6493.getTop() + i7;
                    int left2 = this.f6493.getLeft();
                    int top2 = this.f6493.getTop();
                    if (i6 != 0) {
                        left = this.f6487.mo463(this.f6493, left, i6);
                        C1096.m2483(this.f6493, left - left2);
                    }
                    int i8 = left;
                    if (i7 != 0) {
                        top = this.f6487.mo459(this.f6493, top, i7);
                        C1096.m2515(this.f6493, top - top2);
                    }
                    int i9 = top;
                    if (i6 != 0 || i7 != 0) {
                        this.f6487.mo461(this.f6493, i8, i9, i8 - left2, i9 - top2);
                    }
                }
                m3067(motionEvent);
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    float x4 = motionEvent.getX(actionIndex);
                    float y4 = motionEvent.getY(actionIndex);
                    m3063(x4, y4, pointerId3);
                    if (this.f6484 != 0) {
                        if (m3058(this.f6493, (int) x4, (int) y4)) {
                            m3071(this.f6493, pointerId3);
                            return;
                        }
                        return;
                    }
                    m3071(m3069((int) x4, (int) y4), pointerId3);
                    int i10 = this.f6476[pointerId3];
                    int i11 = this.f6480;
                    if ((i10 & i11) != 0) {
                        this.f6487.mo460(i10 & i11, pointerId3);
                        return;
                    }
                    return;
                }
                if (actionMasked != 6) {
                    return;
                }
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.f6484 == 1 && pointerId4 == this.f6483) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount2) {
                            i = -1;
                            break;
                        }
                        int pointerId5 = motionEvent.getPointerId(i2);
                        if (pointerId5 != this.f6483) {
                            View m30693 = m3069((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f6493;
                            if (m30693 == view && m3071(view, pointerId5)) {
                                i = this.f6483;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        m3070();
                    }
                }
                m3050(pointerId4);
                return;
            }
            if (this.f6484 == 1) {
                m3066(0.0f, 0.0f);
            }
        } else if (this.f6484 == 1) {
            m3070();
        }
        m3051();
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final boolean m3065(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f6487.mo462(view) > 0;
        boolean z2 = this.f6487.mo1356(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f6477) : z2 && Math.abs(f2) > ((float) this.f6477);
        }
        float f3 = (f2 * f2) + (f * f);
        int i = this.f6477;
        return f3 > ((float) (i * i));
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final void m3066(float f, float f2) {
        this.f6485 = true;
        this.f6487.mo470(this.f6493, f, f2);
        this.f6485 = false;
        if (this.f6484 == 1) {
            m3073(0);
        }
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public final void m3067(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m3056(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f6491[pointerId] = x;
                this.f6478[pointerId] = y;
            }
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final float m3068(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public View m3069(int i, int i2) {
        for (int childCount = this.f6486.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f6486;
            this.f6487.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public final void m3070() {
        this.f6489.computeCurrentVelocity(1000, this.f6492);
        m3066(m3068(this.f6489.getXVelocity(this.f6483), this.f6495, this.f6492), m3068(this.f6489.getYVelocity(this.f6483), this.f6495, this.f6492));
    }

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public boolean m3071(View view, int i) {
        if (view == this.f6493 && this.f6483 == i) {
            return true;
        }
        if (view == null || !this.f6487.mo465(view, i)) {
            return false;
        }
        this.f6483 = i;
        m3060(view, i);
        return true;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final boolean m3072(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f6476[i] & i2) != i2 || (this.f6480 & i2) == 0 || (this.f6479[i] & i2) == i2 || (this.f6496[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f6477;
        if (abs <= i3 && abs2 <= i3) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f6487.mo466(i2)) {
            return (this.f6496[i] & i2) == 0 && abs > ((float) this.f6477);
        }
        int[] iArr = this.f6479;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public void m3073(int i) {
        this.f6486.removeCallbacks(this.f6490);
        if (this.f6484 != i) {
            this.f6484 = i;
            this.f6487.mo469(i);
            if (this.f6484 == 0) {
                this.f6493 = null;
            }
        }
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public final boolean m3074(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f6493.getLeft();
        int top = this.f6493.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f6481.abortAnimation();
            m3073(0);
            return false;
        }
        View view = this.f6493;
        int m3053 = m3053(i3, (int) this.f6495, (int) this.f6492);
        int m30532 = m3053(i4, (int) this.f6495, (int) this.f6492);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(m3053);
        int abs4 = Math.abs(m30532);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        if (m3053 != 0) {
            f = abs3;
            f2 = i7;
        } else {
            f = abs;
            f2 = i8;
        }
        float f5 = f / f2;
        if (m30532 != 0) {
            f3 = abs4;
            f4 = i7;
        } else {
            f3 = abs2;
            f4 = i8;
        }
        int m3075 = m3075(i5, m3053, this.f6487.mo462(view));
        this.f6481.startScroll(left, top, i5, i6, (int) ((m3075(i6, m30532, this.f6487.mo1356(view)) * (f3 / f4)) + (m3075 * f5)));
        m3073(2);
        return true;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final int m3075(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.f6486.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }
}
