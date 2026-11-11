package p034.p050.p051;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p034.p035.p045.C1104;
import p034.p035.p045.C1112;
import p034.p035.p045.InterfaceC1108;

/* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1151 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Interpolator f5684;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f5686;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public InterfaceC1108 f5688;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public long f5683 = -1;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final C1112 f5687 = new C1152();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final ArrayList<C1104> f5685 = new ArrayList<>();

    /* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぁごぐすすぃ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1152 extends C1112 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean f5691 = false;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f5689 = 0;

        public C1152() {
        }

        @Override // p034.p035.p045.InterfaceC1108
        /* renamed from: 〺つふすそ */
        public void mo2539(View view) {
            int i = this.f5689 + 1;
            this.f5689 = i;
            if (i == C1151.this.f5685.size()) {
                InterfaceC1108 interfaceC1108 = C1151.this.f5688;
                if (interfaceC1108 != null) {
                    interfaceC1108.mo2539(null);
                }
                this.f5689 = 0;
                this.f5691 = false;
                C1151.this.f5686 = false;
            }
        }

        @Override // p034.p035.p045.C1112, p034.p035.p045.InterfaceC1108
        /* renamed from: くし〴〺ぅ */
        public void mo2540(View view) {
            if (this.f5691) {
                return;
            }
            this.f5691 = true;
            InterfaceC1108 interfaceC1108 = C1151.this.f5688;
            if (interfaceC1108 != null) {
                interfaceC1108.mo2540(null);
            }
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m2579() {
        View view;
        if (this.f5686) {
            return;
        }
        Iterator<C1104> it = this.f5685.iterator();
        while (it.hasNext()) {
            C1104 next = it.next();
            long j = this.f5683;
            if (j >= 0) {
                next.m2534(j);
            }
            Interpolator interpolator = this.f5684;
            if (interpolator != null && (view = next.f5597.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f5688 != null) {
                next.m2538(this.f5687);
            }
            View view2 = next.f5597.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f5686 = true;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m2580() {
        if (this.f5686) {
            Iterator<C1104> it = this.f5685.iterator();
            while (it.hasNext()) {
                it.next().m2532();
            }
            this.f5686 = false;
        }
    }
}
