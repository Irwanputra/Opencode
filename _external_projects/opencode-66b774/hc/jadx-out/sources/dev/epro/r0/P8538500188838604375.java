package dev.epro.r0;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P8538500188838604375 implements A10838822263452390785 {
    public final /* synthetic */ E3889562084885881810 a;
    public final /* synthetic */ H11725168162114556860 b;

    public P8538500188838604375(E3889562084885881810 e3889562084885881810, H11725168162114556860 h11725168162114556860) {
        this.a = e3889562084885881810;
        this.b = h11725168162114556860;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int a(J4720286603213127984 j4720286603213127984, List list, int i) {
        E3889562084885881810 e3889562084885881810 = this.a;
        ViewGroup.LayoutParams layoutParams = e3889562084885881810.getLayoutParams();
        layoutParams.getClass();
        e3889562084885881810.measure(N5230833122018532994.l(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return e3889562084885881810.getMeasuredHeight();
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int b(J4720286603213127984 j4720286603213127984, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        E3889562084885881810 e3889562084885881810 = this.a;
        ViewGroup.LayoutParams layoutParams = e3889562084885881810.getLayoutParams();
        layoutParams.getClass();
        e3889562084885881810.measure(iMakeMeasureSpec, N5230833122018532994.l(0, i, layoutParams.height));
        return e3889562084885881810.getMeasuredWidth();
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final H11646813293457574213 c(I5164649337253478959 i5164649337253478959, List list, long j) {
        E3889562084885881810 e3889562084885881810 = this.a;
        int childCount = e3889562084885881810.getChildCount();
        X9852054718446117252 x9852054718446117252 = X9852054718446117252.a;
        if (childCount == 0) {
            return i5164649337253478959.m(I16980768508151520658.k(j), I16980768508151520658.j(j), x9852054718446117252, new M14716691558468128220((byte) 25));
        }
        if (I16980768508151520658.k(j) != 0) {
            e3889562084885881810.getChildAt(0).setMinimumWidth(I16980768508151520658.k(j));
        }
        if (I16980768508151520658.j(j) != 0) {
            e3889562084885881810.getChildAt(0).setMinimumHeight(I16980768508151520658.j(j));
        }
        int iK = I16980768508151520658.k(j);
        int i = I16980768508151520658.i(j);
        ViewGroup.LayoutParams layoutParams = e3889562084885881810.getLayoutParams();
        layoutParams.getClass();
        int iL = N5230833122018532994.l(iK, i, layoutParams.width);
        int iJ = I16980768508151520658.j(j);
        int iH = I16980768508151520658.h(j);
        ViewGroup.LayoutParams layoutParams2 = e3889562084885881810.getLayoutParams();
        layoutParams2.getClass();
        e3889562084885881810.measure(iL, N5230833122018532994.l(iJ, iH, layoutParams2.height));
        return i5164649337253478959.m(e3889562084885881810.getMeasuredWidth(), e3889562084885881810.getMeasuredHeight(), x9852054718446117252, new P7557951149941010979(e3889562084885881810, this.b, (byte) 2));
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int d(J4720286603213127984 j4720286603213127984, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        E3889562084885881810 e3889562084885881810 = this.a;
        ViewGroup.LayoutParams layoutParams = e3889562084885881810.getLayoutParams();
        layoutParams.getClass();
        e3889562084885881810.measure(iMakeMeasureSpec, N5230833122018532994.l(0, i, layoutParams.height));
        return e3889562084885881810.getMeasuredWidth();
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int e(J4720286603213127984 j4720286603213127984, List list, int i) {
        E3889562084885881810 e3889562084885881810 = this.a;
        ViewGroup.LayoutParams layoutParams = e3889562084885881810.getLayoutParams();
        layoutParams.getClass();
        e3889562084885881810.measure(N5230833122018532994.l(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return e3889562084885881810.getMeasuredHeight();
    }
}
