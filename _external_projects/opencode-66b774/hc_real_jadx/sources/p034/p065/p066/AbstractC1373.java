package p034.p065.p066;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.ぇ〳〲〺すっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1373 extends RecyclerView.AbstractC0230 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Scroller f6526;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final RecyclerView.AbstractC0206 f6527 = new C1375();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public RecyclerView f6528;

    /* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.ぇ〳〲〺すっ$〺つふすそ, reason: contains not printable characters */
    public class C1374 extends C1380 {
        public C1374(Context context) {
            super(context);
        }

        @Override // p034.p065.p066.C1380, androidx.recyclerview.widget.RecyclerView.AbstractC0214
        /* renamed from: 〺つふすそ */
        public void mo792(View view, RecyclerView.C0224 c0224, RecyclerView.AbstractC0214.C0216 c0216) {
            AbstractC1373 abstractC1373 = AbstractC1373.this;
            RecyclerView recyclerView = abstractC1373.f6528;
            if (recyclerView == null) {
                return;
            }
            int[] mo3097 = abstractC1373.mo3097(recyclerView.getLayoutManager(), view);
            int i = mo3097[0];
            int i2 = mo3097[1];
            int m3110 = m3110(Math.max(Math.abs(i), Math.abs(i2)));
            if (m3110 > 0) {
                c0216.m795(i, i2, m3110, this.f6536);
            }
        }

        @Override // p034.p065.p066.C1380
        /* renamed from: づざかべべ, reason: contains not printable characters */
        public float mo3102(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    /* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.ぇ〳〲〺すっ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1375 extends RecyclerView.AbstractC0206 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean f6531 = false;

        public C1375() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0206
        /* renamed from: 〺つふすそ */
        public void mo760(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f6531 = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0206
        /* renamed from: げつ〴ぬぐ */
        public void mo761(RecyclerView recyclerView, int i) {
            if (i == 0 && this.f6531) {
                this.f6531 = false;
                AbstractC1373.this.m3101();
            }
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public abstract int[] mo3097(RecyclerView.AbstractC0219 abstractC0219, View view);

    @Deprecated
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C1380 mo3098(RecyclerView.AbstractC0219 abstractC0219) {
        if (abstractC0219 instanceof RecyclerView.AbstractC0214.InterfaceC0215) {
            return new C1374(this.f6528.getContext());
        }
        return null;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m3099(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f6528;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            RecyclerView.AbstractC0206 abstractC0206 = this.f6527;
            List<RecyclerView.AbstractC0206> list = recyclerView2.f1383;
            if (list != null) {
                list.remove(abstractC0206);
            }
            this.f6528.setOnFlingListener(null);
        }
        this.f6528 = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f6528.m693(this.f6527);
            this.f6528.setOnFlingListener(this);
            this.f6526 = new Scroller(this.f6528.getContext(), new DecelerateInterpolator());
            m3101();
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public abstract int mo3100(RecyclerView.AbstractC0219 abstractC0219, int i, int i2);

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void m3101() {
        RecyclerView.AbstractC0219 layoutManager;
        View mo1105;
        RecyclerView recyclerView = this.f6528;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (mo1105 = mo1105(layoutManager)) == null) {
            return;
        }
        int[] mo3097 = mo3097(layoutManager, mo1105);
        if (mo3097[0] == 0 && mo3097[1] == 0) {
            return;
        }
        this.f6528.m703(mo3097[0], mo3097[1], null, Integer.MIN_VALUE, false);
    }

    /* renamed from: びぐびあび */
    public abstract View mo1105(RecyclerView.AbstractC0219 abstractC0219);
}
