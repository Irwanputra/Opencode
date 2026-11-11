package p131.p161.p162.p163.p172;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉざぅち〻.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2157 extends FloatingActionButton.AbstractC0446 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ BottomAppBar f9027;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ int f9028;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉざぅち〻.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2158 extends FloatingActionButton.AbstractC0446 {
        public C2158() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC0446
        /* renamed from: 〺つふすそ */
        public void mo1441(FloatingActionButton floatingActionButton) {
            BottomAppBar.m1314(C2157.this.f9027);
        }
    }

    public C2157(BottomAppBar bottomAppBar, int i) {
        this.f9027 = bottomAppBar;
        this.f9028 = i;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC0446
    /* renamed from: げつ〴ぬぐ */
    public void mo1442(FloatingActionButton floatingActionButton) {
        BottomAppBar bottomAppBar = this.f9027;
        int i = this.f9028;
        int i2 = BottomAppBar.f3003;
        floatingActionButton.setTranslationX(bottomAppBar.m1326(i));
        floatingActionButton.m1426(new C2158(), true);
    }
}
