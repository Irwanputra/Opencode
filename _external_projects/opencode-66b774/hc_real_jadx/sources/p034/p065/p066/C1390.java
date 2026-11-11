package p034.p065.p066;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p034.p035.p045.C1096;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.てぜきぽく, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1390 extends RecyclerView.AbstractC0235 implements RecyclerView.InterfaceC0210 {

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public static final int[] f6563 = {R.attr.state_pressed};

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public static final int[] f6564 = new int[0];

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final Drawable f6565;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final int f6566;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final StateListDrawable f6568;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final int f6569;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public final ValueAnimator f6570;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public float f6571;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int f6574;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final StateListDrawable f6575;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final int f6576;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final int f6580;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int f6581;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public final RecyclerView.AbstractC0206 f6583;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final int f6584;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public final Runnable f6585;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public float f6586;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public RecyclerView f6587;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public int f6588;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Drawable f6589;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public int f6591;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final int f6592;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f6593;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public int f6573 = 0;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f6579 = 0;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public boolean f6577 = false;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public boolean f6578 = false;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public int f6582 = 0;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public int f6590 = 0;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public final int[] f6567 = new int[2];

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public final int[] f6572 = new int[2];

    /* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.てぜきぽく$〺つふすそ, reason: contains not printable characters */
    public class C1391 extends RecyclerView.AbstractC0206 {
        public C1391() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0206
        /* renamed from: 〺つふすそ */
        public void mo760(RecyclerView recyclerView, int i, int i2) {
            C1390 c1390 = C1390.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = c1390.f6587.computeVerticalScrollRange();
            int i3 = c1390.f6579;
            c1390.f6577 = computeVerticalScrollRange - i3 > 0 && i3 >= c1390.f6576;
            int computeHorizontalScrollRange = c1390.f6587.computeHorizontalScrollRange();
            int i4 = c1390.f6573;
            boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= c1390.f6576;
            c1390.f6578 = z;
            boolean z2 = c1390.f6577;
            if (!z2 && !z) {
                if (c1390.f6582 != 0) {
                    c1390.m3150(0);
                    return;
                }
                return;
            }
            if (z2) {
                float f = i3;
                c1390.f6581 = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
                c1390.f6593 = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (c1390.f6578) {
                float f2 = computeHorizontalScrollOffset;
                float f3 = i4;
                c1390.f6574 = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
                c1390.f6591 = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = c1390.f6582;
            if (i5 == 0 || i5 == 1) {
                c1390.m3150(1);
            }
        }
    }

    /* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.てぜきぽく$くし〴〺ぅ, reason: contains not printable characters */
    public class C1392 extends AnimatorListenerAdapter {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean f6596 = false;

        public C1392() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6596 = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f6596) {
                this.f6596 = false;
                return;
            }
            if (((Float) C1390.this.f6570.getAnimatedValue()).floatValue() == 0.0f) {
                C1390 c1390 = C1390.this;
                c1390.f6588 = 0;
                c1390.m3150(0);
            } else {
                C1390 c13902 = C1390.this;
                c13902.f6588 = 2;
                c13902.f6587.invalidate();
            }
        }
    }

    /* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.てぜきぽく$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC1393 implements Runnable {
        public RunnableC1393() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1390 c1390 = C1390.this;
            int i = c1390.f6588;
            if (i == 1) {
                c1390.f6570.cancel();
            } else if (i != 2) {
                return;
            }
            c1390.f6588 = 3;
            ValueAnimator valueAnimator = c1390.f6570;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            c1390.f6570.setDuration(500);
            c1390.f6570.start();
        }
    }

    /* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.てぜきぽく$びぐびあび, reason: contains not printable characters */
    public class C1394 implements ValueAnimator.AnimatorUpdateListener {
        public C1394() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1390.this.f6575.setAlpha(floatValue);
            C1390.this.f6589.setAlpha(floatValue);
            C1390.this.f6587.invalidate();
        }
    }

    public C1390(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f6570 = ofFloat;
        this.f6588 = 0;
        this.f6585 = new RunnableC1393();
        C1391 c1391 = new C1391();
        this.f6583 = c1391;
        this.f6575 = stateListDrawable;
        this.f6589 = drawable;
        this.f6568 = stateListDrawable2;
        this.f6565 = drawable2;
        this.f6580 = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f6584 = Math.max(i, drawable.getIntrinsicWidth());
        this.f6592 = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f6569 = Math.max(i, drawable2.getIntrinsicWidth());
        this.f6576 = i2;
        this.f6566 = i3;
        stateListDrawable.setAlpha(Base64.BASELENGTH);
        drawable.setAlpha(Base64.BASELENGTH);
        ofFloat.addListener(new C1392());
        ofFloat.addUpdateListener(new C1394());
        RecyclerView recyclerView2 = this.f6587;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            RecyclerView.AbstractC0219 abstractC0219 = recyclerView2.f1438;
            if (abstractC0219 != null) {
                abstractC0219.mo667("Cannot remove item decoration during a scroll  or layout");
            }
            recyclerView2.f1406.remove(this);
            if (recyclerView2.f1406.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m729();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f6587;
            recyclerView3.f1399.remove(this);
            if (recyclerView3.f1402 == this) {
                recyclerView3.f1402 = null;
            }
            List<RecyclerView.AbstractC0206> list = this.f6587.f1383;
            if (list != null) {
                list.remove(c1391);
            }
            m3146();
        }
        this.f6587 = recyclerView;
        recyclerView.m697(this);
        this.f6587.f1399.add(this);
        this.f6587.m693(c1391);
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean m3145(float f, float f2) {
        if (f2 >= this.f6579 - this.f6592) {
            int i = this.f6574;
            int i2 = this.f6591;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0210
    /* renamed from: 〺つふすそ */
    public void mo786(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f6582 == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean m3149 = m3149(motionEvent.getX(), motionEvent.getY());
            boolean m3145 = m3145(motionEvent.getX(), motionEvent.getY());
            if (m3149 || m3145) {
                if (m3145) {
                    this.f6590 = 1;
                    this.f6571 = (int) motionEvent.getX();
                } else if (m3149) {
                    this.f6590 = 2;
                    this.f6586 = (int) motionEvent.getY();
                }
                m3150(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f6582 == 2) {
            this.f6586 = 0.0f;
            this.f6571 = 0.0f;
            m3150(1);
            this.f6590 = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f6582 == 2) {
            m3148();
            if (this.f6590 == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f6572;
                int i = this.f6566;
                iArr[0] = i;
                iArr[1] = this.f6573 - i;
                float max = Math.max(iArr[0], Math.min(iArr[1], x));
                if (Math.abs(this.f6574 - max) >= 2.0f) {
                    int m3147 = m3147(this.f6571, max, iArr, this.f6587.computeHorizontalScrollRange(), this.f6587.computeHorizontalScrollOffset(), this.f6573);
                    if (m3147 != 0) {
                        this.f6587.scrollBy(m3147, 0);
                    }
                    this.f6571 = max;
                }
            }
            if (this.f6590 == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f6567;
                int i2 = this.f6566;
                iArr2[0] = i2;
                iArr2[1] = this.f6579 - i2;
                float max2 = Math.max(iArr2[0], Math.min(iArr2[1], y));
                if (Math.abs(this.f6581 - max2) < 2.0f) {
                    return;
                }
                int m31472 = m3147(this.f6586, max2, iArr2, this.f6587.computeVerticalScrollRange(), this.f6587.computeVerticalScrollOffset(), this.f6579);
                if (m31472 != 0) {
                    this.f6587.scrollBy(0, m31472);
                }
                this.f6586 = max2;
            }
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final void m3146() {
        this.f6587.removeCallbacks(this.f6585);
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final int m3147(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0210
    /* renamed from: くし〴〺ぅ */
    public void mo787(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0210
    /* renamed from: げつ〴ぬぐ */
    public boolean mo788(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f6582;
        if (i == 1) {
            boolean m3149 = m3149(motionEvent.getX(), motionEvent.getY());
            boolean m3145 = m3145(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (m3149 || m3145)) {
                if (m3145) {
                    this.f6590 = 1;
                    this.f6571 = (int) motionEvent.getX();
                } else if (m3149) {
                    this.f6590 = 2;
                    this.f6586 = (int) motionEvent.getY();
                }
                m3150(2);
                return true;
            }
        } else if (i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public void m3148() {
        int i = this.f6588;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.f6570.cancel();
            }
        }
        this.f6588 = 1;
        ValueAnimator valueAnimator = this.f6570;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f6570.setDuration(500L);
        this.f6570.setStartDelay(0L);
        this.f6570.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0235
    /* renamed from: なぎぱいぢぎ */
    public void mo902(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0224 c0224) {
        if (this.f6573 != this.f6587.getWidth() || this.f6579 != this.f6587.getHeight()) {
            this.f6573 = this.f6587.getWidth();
            this.f6579 = this.f6587.getHeight();
            m3150(0);
            return;
        }
        if (this.f6588 != 0) {
            if (this.f6577) {
                int i = this.f6573;
                int i2 = this.f6580;
                int i3 = i - i2;
                int i4 = this.f6581;
                int i5 = this.f6593;
                int i6 = i4 - (i5 / 2);
                this.f6575.setBounds(0, 0, i2, i5);
                this.f6589.setBounds(0, 0, this.f6584, this.f6579);
                if (C1096.m2491(this.f6587) == 1) {
                    this.f6589.draw(canvas);
                    canvas.translate(this.f6580, i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.f6575.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    i3 = this.f6580;
                } else {
                    canvas.translate(i3, 0.0f);
                    this.f6589.draw(canvas);
                    canvas.translate(0.0f, i6);
                    this.f6575.draw(canvas);
                }
                canvas.translate(-i3, -i6);
            }
            if (this.f6578) {
                int i7 = this.f6579;
                int i8 = this.f6592;
                int i9 = this.f6574;
                int i10 = this.f6591;
                this.f6568.setBounds(0, 0, i10, i8);
                this.f6565.setBounds(0, 0, this.f6573, this.f6569);
                canvas.translate(0.0f, i7 - i8);
                this.f6565.draw(canvas);
                canvas.translate(i9 - (i10 / 2), 0.0f);
                this.f6568.draw(canvas);
                canvas.translate(-r2, -r7);
            }
        }
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean m3149(float f, float f2) {
        if (C1096.m2491(this.f6587) == 1) {
            if (f > this.f6580 / 2) {
                return false;
            }
        } else if (f < this.f6573 - this.f6580) {
            return false;
        }
        int i = this.f6581;
        int i2 = this.f6593 / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i2 + i));
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void m3150(int i) {
        int i2;
        if (i == 2 && this.f6582 != 2) {
            this.f6575.setState(f6563);
            m3146();
        }
        if (i == 0) {
            this.f6587.invalidate();
        } else {
            m3148();
        }
        if (this.f6582 != 2 || i == 2) {
            i2 = i == 1 ? 1500 : 1200;
            this.f6582 = i;
        }
        this.f6575.setState(f6564);
        m3146();
        this.f6587.postDelayed(this.f6585, i2);
        this.f6582 = i;
    }
}
