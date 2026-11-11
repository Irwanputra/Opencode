package p107.p108.p109.p110.p129;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p034.p035.p043.C1067;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぺぁあねじ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1965 extends ArrayAdapter<String> {

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final HashMap<String, C1966> f8573;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Context f8574;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Set<String> f8575;

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぺぁあねじ.づざかべべ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1966 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f8576;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f8577;

        public C1966(String str, int i, int i2) {
            this.f8577 = i;
            this.f8576 = i2;
        }
    }

    static {
        HashMap<String, C1966> hashMap = new HashMap<>();
        f8573 = hashMap;
        hashMap.put("", new C1966("", 2131821159, 2131230898));
        String a = Crypt.a(Crypt.xrc("K4<Lk>@3jAffAflOdoNa:Nbj\u00197lN6l\u0019e"));
        hashMap.put(a, new C1966(a, 2131821160, 2131230859));
        String a2 = Crypt.a(Crypt.xrc("\u001d`9Hb9\u001a7>@0fIf=\u001ae;Ia:\u0019cmObmK7:\u001bg"));
        hashMap.put(a2, new C1966(a2, 2131821161, 2131230860));
        String a3 = Crypt.a(Crypt.xrc("A1:@49Nd>\u001c79\u001afnJ6:\u001cjo\u001cciJeoNc:K7"));
        hashMap.put(a3, new C1966(a3, 2131821162, 2131230867));
        String a4 = Crypt.a(Crypt.xrc("\u001ag9Hkh@4hLfl\u001d7;OegKbjHb=@0fNg:\u001ab"));
        hashMap.put(a4, new C1966(a4, 2131821163, 2131230869));
        String a5 = Crypt.a(Crypt.xrc("HgkHeh\u001djgA`mAb9\u001e4oMe<J1fAj=@fi\u001af"));
        hashMap.put(a5, new C1966(a5, 2131821164, 2131230884));
        String a6 = Crypt.a(Crypt.xrc("\u001dj9JdhAagO1h@amAc:Ad=\u001abjHa:L4:\u001ba"));
        hashMap.put(a6, new C1966(a6, 2131821165, 2131230889));
        String a7 = Crypt.a(Crypt.xrc("I`9\u001c`fA`:H3iL19N`>Off\u001dah\u001bji\u001bg;\u001ef"));
        hashMap.put(a7, new C1966(a7, 2131821166, 2131230902));
        String a8 = Crypt.a(Crypt.xrc("Hjk\u001bgnIbnKglA0:LffOg=A09L7lIcgL4"));
        hashMap.put(a8, new C1966(a8, 2131821167, 2131230903));
        String a9 = Crypt.a(Crypt.xrc("\u001d7i\u00191lIj9H19\u001a6f\u001bjl@0;Ok>K1g\u001dgjK1"));
        hashMap.put(a9, new C1966(a9, 2131821168, 2131230905));
        String a10 = Crypt.a(Crypt.xrc("Lg9Jcl\u001cg:H0=J7=L1;MbkM4=L1:Af9L3"));
        hashMap.put(a10, new C1966(a10, 2131821169, 2131230914));
        String a11 = Crypt.a(Crypt.xrc("I`:\u001a6=\u0019b=JjlH3i\u001bahMki\u001cchNgm\u001e7hI0"));
        hashMap.put(a11, new C1966(a11, 2131821170, 2131230921));
        String a12 = Crypt.a(Crypt.xrc("Abj\u001eck@ghI3>\u00194kN6fMklL3;Ngl\u001cg:@a"));
        hashMap.put(a12, new C1966(a12, 2131821171, 2131230924));
        String a13 = Crypt.a(Crypt.xrc("\u001c0jIf=\u001cfg\u001ckhO7fO3iH`9\u001d`>\u001bjj\u001ddmNg"));
        hashMap.put(a13, new C1966(a13, 2131821172, 2131230942));
        String a14 = Crypt.a(Crypt.xrc("NgmKk;\u001ejoI7mL3gK6<K6nOkhIaj\u001b7nH3"));
        hashMap.put(a14, new C1966(a14, 2131821173, 2131230947));
        String a15 = Crypt.a(Crypt.xrc("\u0019d>\u001e`<H0fHgg\u00191i\u001bfj\u001ajk\u001dafKegLjgN1"));
        hashMap.put(a15, new C1966(a15, 2131821174, 2131230952));
        String a16 = Crypt.a(Crypt.xrc("OgoKefM3nLgl@7fIdoMbmJjgI3iOkk\u001d6"));
        hashMap.put(a16, new C1966(a16, 2131821175, 2131230957));
        String a17 = Crypt.a(Crypt.xrc("I`kM0hL1kK7jAcgN3jMf;K6j\u001ej;O6jM3"));
        hashMap.put(a17, new C1966(a17, 2131821176, 2131230961));
        String a18 = Crypt.a(Crypt.xrc("@c:\u001cfhL0hHd=\u001ako\u001e7iId;Oe9\u001benN`:H0"));
        hashMap.put(a18, new C1966(a18, 2131821177, 2131231013));
        String a19 = Crypt.a(Crypt.xrc("Ja;\u001cb9Nb:Aj:Oak@fn@e;\u001e6=\u001a1fH7m\u001e0"));
        hashMap.put(a19, new C1966(a19, 2131821178, 2131231014));
        String a20 = Crypt.a(Crypt.xrc("L`m\u001bjk\u001ebo\u001dcg\u001ec>K6o\u001e`oK`=Ib:O4hIc"));
        hashMap.put(a20, new C1966(a20, 2131821179, 2131231026));
        String a21 = Crypt.a(Crypt.xrc("K0oIa:\u001d7f\u001e0k\u001a1:A6h\u001cehH4;M0f@dj\u001ea"));
        hashMap.put(a21, new C1966(a21, 2131821180, 2131231036));
        hashMap.put(Crypt.a(Crypt.xrc("\u001cd9@1mO`iIek\u0019kjHgiLjiJ1>\u001bj=KcmN7")), new C1966(Crypt.a(Crypt.xrc("\u001cd9@1mO`iIek\u0019kjHgiLjiJ1>\u001bj=KcmN7")), 2131821181, 2131231037));
        hashMap.put(Crypt.a(Crypt.xrc("Ljf\u001b1m\u001e`:\u001df9Ab<O7k\u00193i\u0019j=\u001b3>\u001c1fJ7")), new C1966(Crypt.a(Crypt.xrc("Ljf\u001b1m\u001e`:\u001df9Ab<O7k\u00193i\u0019j=\u001b3>\u001c1fJ7")), 2131821182, 2131231044));
        hashMap.put(Crypt.a(Crypt.xrc("A1l\u001b3oLbnK7h@69LgoOkf\u001df;Ijl\u001de9\u001eb")), new C1966(Crypt.a(Crypt.xrc("A1l\u001b3oLbnK7h@69LgoOkf\u001df;Ijl\u001de9\u001eb")), 2131821183, 2131231045));
        hashMap.put(Crypt.a(Crypt.xrc("L1>\u001bgkH6lJ3f\u001b`>KcoIei@afAeiH4o@6")), new C1966(Crypt.a(Crypt.xrc("L1>\u001bgkH6lJ3f\u001b`>KcoIei@afAeiH4o@6")), 2131821184, 2131231049));
        hashMap.put(Crypt.a(Crypt.xrc("MdgKbfO7:\u001eblK6h\u001d3gLjn@a<\u0019koLd=Ie")), new C1966(Crypt.a(Crypt.xrc("MdgKbfO7:\u001eblK6h\u001d3gLjn@a<\u0019koLd=Ie")), 2131821185, 2131231078));
    }

    public C1965(Context context) {
        super(context, 2131493008);
        this.f8574 = context;
        this.f8575 = new HashSet();
        Set<String> stringSet = App.f3762.getStringSet(Crypt.a(Crypt.xrc("\u001dd=I6:\u001ejjL3fM`9\u001a0:LdlKc9Kef\u001eeoO39L4h\u001afm@a>Ae>\u001e79L3nIghI69OkfJegJ")), new HashSet());
        if (stringSet.size() <= 0 || !stringSet.equals(this.f8575)) {
            this.f8575 = stringSet;
            clear();
            add("");
            if (stringSet.size() > 0) {
                ArrayList arrayList = new ArrayList(this.f8575);
                Collections.sort(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (f8573.containsKey(str)) {
                        add(str);
                    }
                }
            } else {
                clear();
                ArrayList arrayList2 = new ArrayList(f8573.keySet());
                Collections.sort(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    if (f8573.containsKey(str2)) {
                        add(str2);
                    }
                }
            }
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return m4085(i, viewGroup, true);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return m4085(i, viewGroup, false);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public View m4085(int i, ViewGroup viewGroup, boolean z) {
        View inflate = ((LayoutInflater) this.f8574.getSystemService(Crypt.a(Crypt.xrc("\u001cfoM4o\u001b`kJb=NjfN6mNk;MffM3fIjf\u001d1")))).inflate(2131493008, viewGroup, false);
        if (z && Build.VERSION.SDK_INT >= 16) {
            inflate.setBackground(C1067.m2406(App.f3759, 2131231199));
        }
        String item = getItem(i);
        HashMap<String, C1966> hashMap = f8573;
        if (hashMap.get(item) != null) {
            ((ImageView) inflate.findViewById(2131296754)).setImageResource(hashMap.get(item).f8576);
            ((TextView) inflate.findViewById(2131296755)).setText(this.f8574.getString(hashMap.get(item).f8577));
        }
        return inflate;
    }
}
