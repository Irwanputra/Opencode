package p034.p105.p106;

import android.view.animation.Interpolator;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p034.p094.AbstractC1666;
import p034.p094.C1679;
import p034.p094.InterfaceC1667;

/* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.のぷのちつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1808 extends AbstractC1666 {

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final InterfaceC1667 f8115 = new C1809();

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final boolean f8118;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final HashSet<Fragment> f8116 = new HashSet<>();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final HashMap<String, C1808> f8117 = new HashMap<>();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final HashMap<String, C1679> f8120 = new HashMap<>();

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f8119 = false;

    /* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.のぷのちつ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1809 implements InterfaceC1667 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public <T extends AbstractC1666> T m3871(Class<T> cls) {
            return new C1808(true);
        }
    }

    public C1808(boolean z) {
        this.f8118 = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1808 c1808 = (C1808) obj;
        return this.f8116.equals(c1808.f8116) && this.f8117.equals(c1808.f8117) && this.f8120.equals(c1808.f8120);
    }

    public int hashCode() {
        return this.f8120.hashCode() + ((this.f8117.hashCode() + (this.f8116.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f8116.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f8117.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f8120.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean m3870(Fragment fragment) {
        if (this.f8116.contains(fragment) && this.f8118) {
            return this.f8119;
        }
        return true;
    }

    @Override // p034.p094.AbstractC1666
    /* renamed from: げつ〴ぬぐ */
    public void mo3638() {
        Interpolator interpolator = LayoutInflaterFactory2C1815.f8138;
        this.f8119 = true;
    }
}
