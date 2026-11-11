package p131.p161.p162.p163.p186;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.のぷのちつ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2289 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public long f9498;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public TimeInterpolator f9499;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public long f9500;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f9501;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f9502;

    public C2289(long j, long j2) {
        this.f9500 = 0L;
        this.f9498 = 300L;
        this.f9499 = null;
        this.f9502 = 0;
        this.f9501 = 1;
        this.f9500 = j;
        this.f9498 = j2;
    }

    public C2289(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f9500 = 0L;
        this.f9498 = 300L;
        this.f9499 = null;
        this.f9502 = 0;
        this.f9501 = 1;
        this.f9500 = j;
        this.f9498 = j2;
        this.f9499 = timeInterpolator;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2289)) {
            return false;
        }
        C2289 c2289 = (C2289) obj;
        if (this.f9500 == c2289.f9500 && this.f9498 == c2289.f9498 && this.f9502 == c2289.f9502 && this.f9501 == c2289.f9501) {
            return m4447().getClass().equals(c2289.m4447().getClass());
        }
        return false;
    }

    public int hashCode() {
        long j = this.f9500;
        long j2 = this.f9498;
        return ((((m4447().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31) + this.f9502) * 31) + this.f9501;
    }

    public String toString() {
        return '\n' + C2289.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f9500 + " duration: " + this.f9498 + " interpolator: " + m4447().getClass() + " repeatCount: " + this.f9502 + " repeatMode: " + this.f9501 + "}\n";
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public TimeInterpolator m4447() {
        TimeInterpolator timeInterpolator = this.f9499;
        return timeInterpolator != null ? timeInterpolator : C2294.f9507;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m4448(Animator animator) {
        animator.setStartDelay(this.f9500);
        animator.setDuration(this.f9498);
        animator.setInterpolator(m4447());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f9502);
            valueAnimator.setRepeatMode(this.f9501);
        }
    }
}
