package p010.p011.p012.p013;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.ぇぬぎばつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0740 {

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static C0740 f4832;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Set<InterfaceC0741> f4833 = new HashSet();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public BroadcastReceiver f4834 = new C0742();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public Context f4835;

    /* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.ぇぬぎばつ$〺つふすそ, reason: contains not printable characters */
    public interface InterfaceC0741 {
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        void mo2013(Intent intent, String str, int i);

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        void mo2014(Intent intent);

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void mo2015(Intent intent);

        /* renamed from: びぐびあび, reason: contains not printable characters */
        void mo2016();
    }

    /* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.ぇぬぎばつ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0742 extends BroadcastReceiver {
        public C0742() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (TextUtils.equals(intent.getAction(), Crypt.a(Crypt.xrc("NfkHc9@3<J6iL3g\u0019c9\u00190oO6nO4k\u001eg9\u001dajHf9IekA3mHjg\u001e`n\u001b`;\u001ekkI7>\u001e4gK4iMfhN1f\u001dd=\u001e1i@3m\u001afhIdg\u001aajIb>JcfOkl")))) {
                Iterator<InterfaceC0741> it = C0740.this.f4833.iterator();
                while (it.hasNext()) {
                    it.next().mo2014(intent);
                }
                String stringExtra = intent.getStringExtra(Crypt.a(Crypt.xrc("NfkHc9@3<J6iL3g\u0019c9\u00190oO6nO4k\u001eg9\u001dal\u001bdlHai\u001a7oO4fK`kN7lO`<M3fN69\u001ebh\u001a`jNj<@k<O0f\u00197mMbm\u001e1jI0nMeo\u0019dnKg:")));
                if (!TextUtils.equals(stringExtra, Crypt.a(Crypt.xrc("\u001b6h\u001eboNdn\u001cdmAf>NjjAkgId:AcjL`i\u001d4")))) {
                    if (TextUtils.equals(stringExtra, Crypt.a(Crypt.xrc("L4mAjn\u001dff@b:\u00190kK4jAgh\u001dflNam\u001eb9\u001aa")))) {
                        Iterator<InterfaceC0741> it2 = C0740.this.f4833.iterator();
                        while (it2.hasNext()) {
                            it2.next().mo2015(intent);
                        }
                        return;
                    }
                    return;
                }
                C0740.this.getClass();
                int intExtra = intent.getIntExtra(Crypt.a(Crypt.xrc("NfkHc9@3<J6iL3g\u0019c9\u00190oO6nO4k\u001eg9\u001dal\u001bdlHai\u001a7oO4fK`kN7lO`<M3fN69\u001ebh\u001a3<\u001d4;\u001bbf@7;@0l@eoAe;\u001b1gMamI1:Ie>\u001a7<LblLkhA1=\u001dj<Lkg\u001d1nN3kLggNd9\u001a1")), 9050);
                C0740.this.getClass();
                String stringExtra2 = intent.getStringExtra(Crypt.a(Crypt.xrc("NfkHc9@3<J6iL3g\u0019c9\u00190oO6nO4k\u001eg9\u001dal\u001bdlHai\u001a7oO4fK`kN7lO`<M3fN69\u001ebh\u001a3<\u001d4;\u001bbf@7;@0l@eoAe;\u001b1gMamI1:Ie>\u001d3fAk9I6lJ3h\u001a7iKji\u001cc9KglHe>\u001e4f\u001db")));
                if (TextUtils.isEmpty(stringExtra2)) {
                    stringExtra2 = Crypt.a(Crypt.xrc("HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb"));
                }
                Iterator<InterfaceC0741> it3 = C0740.this.f4833.iterator();
                while (it3.hasNext()) {
                    it3.next().mo2013(intent, stringExtra2, intExtra);
                }
            }
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static C0740 m2010() {
        if (f4832 == null) {
            f4832 = new C0740();
        }
        return f4832;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static boolean m2011(Context context) {
        Intent intent = new Intent(Crypt.a(Crypt.xrc("NfkHc9@3<J6iL3g\u0019c9\u00190oO6nO4k\u001eg9\u001dajHf9IekA3mHjg\u001e`n\u001b`;\u001ekkI7>\u001e4gK4iMdf\u001b4jA`:M4oJffK79LakMg>Ne=\u001c0nHei")));
        intent.setPackage(Crypt.a(Crypt.xrc("NfkHc9@3<J6iL3g\u0019c9\u00190oO6nO4k\u001eg9\u001damLfo\u001e`k\u001e`gM`9\u001e7>\u0019eg\u0019`>Nd:O6o\u001e`n\u001e")));
        intent.putExtra(Crypt.a(Crypt.xrc("NfkHc9@3<J6iL3g\u0019c9\u00190oO6nO4k\u001eg9\u001dal\u001bdlHai\u001a7oO4fK`kN7lO`<M3fN69\u001ebh\u001ag;\u001ed<OahI09\u00190<IcgM`l\u001b`oKbfO`o\u001bjiIag\u001abgO3nN7i\u001bk<\u0019ek\u001c7m\u0019`;\u001cbg\u001edk@6")), context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public synchronized void m2012(InterfaceC0741 interfaceC0741) {
        this.f4833.remove(interfaceC0741);
        if (this.f4833.size() == 0) {
            this.f4835.unregisterReceiver(this.f4834);
        }
    }
}
