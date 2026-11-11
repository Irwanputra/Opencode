package p010.p011.p012.p014;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import de.blinkt.openvpn.core.LogItem;
import java.io.IOException;
import java.io.StringReader;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.UUID;
import java.util.Vector;
import p010.p011.p012.C0775;
import p010.p011.p012.p013.C0731;
import p010.p011.p012.p013.C0753;
import p010.p011.p012.p013.C0765;
import xyz.easypro.ecrypt.utils.Crypt;

@TargetApi(21)
/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.なぎぱいぢぎ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0777 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static boolean f5003;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static C0777 f5004;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public BroadcastReceiver f5005;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public RestrictionsManager f5006;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m2103(Context context) {
        if (f5003) {
            return;
        }
        f5003 = true;
        IntentFilter intentFilter = new IntentFilter(Crypt.a(Crypt.xrc("L4oA6lLef\u001ajj@7=I1lLg;@bj\u001e1<Lbk\u001c4kHb>L0l\u00194n@7iI7:J4gMdnLem@3mA0i@fj\u001c0nN4fM`fJjkOgiHggLbg\u0019go\u001ae<NcoJjnK6;@1<JciKcj\u001ajf\u00196:JjlL4m\u001cbgIb")));
        C0781 c0781 = new C0781(this);
        this.f5005 = c0781;
        context.registerReceiver(c0781, intentFilter);
        m2105(context);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final String m2104(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001ea>Ad:N6oAf9Nbn@a<Acl\u001dbhA6h\u001c`h\u001a4")));
            byte[] bytes = str.getBytes();
            messageDigest.update(bytes, 0, bytes.length);
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m2105(Context context) {
        Bundle applicationRestrictions;
        String format;
        String a;
        String a2;
        RestrictionsManager restrictionsManager = (RestrictionsManager) context.getSystemService(Crypt.a(Crypt.xrc("\u001dgnJbjI0iHdgHe:Ig;\u001bbkLdh\u001ed<\u001ckjOe")));
        this.f5006 = restrictionsManager;
        if (restrictionsManager == null || (applicationRestrictions = restrictionsManager.getApplicationRestrictions()) == null) {
            return;
        }
        String a3 = Crypt.a(Crypt.xrc("J1>@d>H7>KejNb>JglK6nM1:\u001d39\u001d6j\u001ek"));
        String a4 = Crypt.a(Crypt.xrc("\u0019jlN4;Kc:M3jM7:O0:K`;Oj:\u0019dm\u001c0lH4"));
        String string = applicationRestrictions.getString(a3, a4);
        try {
        } catch (NumberFormatException unused) {
            if (a4.equals(string)) {
                return;
            } else {
                format = String.format(Locale.US, Crypt.a(Crypt.xrc("\u001af<L7gM09Mk9IejA7h\u001a0gLfn\u0019k=@gh\u001bbj\u001ac=\u001d6lO6:\u001d`iO`m\u001bjf\u001e4:\u001baj@f<NahLf:Hfm\u00196kNg9\u001ek:\u0019dj\u001ed>H3:\u001949\u001cjnKa;\u001bfkA6jOb9\u00190>Ib:M7<L4lKkj\u001dgo\u001bc:H`")), string, 1);
            }
        }
        if (Integer.parseInt(string) != 1) {
            throw new NumberFormatException(Crypt.a(Crypt.xrc("Ock\u001ccj\u001c3kI1fMgiL4<@ffJ4>Ngn\u001db<\u001d1")));
        }
        Parcelable[] parcelableArray = applicationRestrictions.getParcelableArray(Crypt.a(Crypt.xrc("Oe>\u001c0j\u00190gM4;\u001ebkM0gNa:\u001bc9MbiIegLj=IfmNjlH7mIch\u0019j<A7jK3gJ4j\u00191hA7>A")));
        if (parcelableArray == null) {
            format = Crypt.a(Crypt.xrc("\u001af<L7gM09Mk9IejA7h\u001a0gLfn\u0019k=@gh\u001bb;@fg\u00190o\u001bdiM4>Of<Lk:\u001bgi\u0019cg\u001b4=A4<J1iLf=\u001dcfKe:\u001d6;J6f\u001dkjNffM19Ob<H6;\u001bgfKclJclJbo\u001egkLag\u00193nN`f\u001c`i\u001e4f\u001a6<\u0019dm\u0019dhA4o\u001da>\u001bff\u00193oMe9\u0019bg\u001a4;\u001bkkM"));
            C0753.m2031(format);
            return;
        }
        HashSet hashSet = new HashSet();
        C0765 m2062 = C0765.m2062(context);
        int length = parcelableArray.length;
        int i = 0;
        while (true) {
            a = Crypt.a(Crypt.xrc("\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196:Ag:\u001ajnKjmK`hMfmHclOk9Ifo\u0019fi\u001bgmKjmL`k\u001e1oIbi\u001ba9K7;@1nIg=Oeg\u001ddl@bm"));
            if (i >= length) {
                break;
            }
            Parcelable parcelable = parcelableArray[i];
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                String string2 = bundle.getString(Crypt.a(Crypt.xrc("\u001dckA4j\u001a3l\u001ec9\u0019gkO4:Aef\u001cb;Na=\u0019k;N4")));
                String string3 = bundle.getString(Crypt.a(Crypt.xrc("H7n\u001dkhJ`gA4;Ok9AchKblL4oOgfJcjA`")));
                String string4 = bundle.getString(Crypt.a(Crypt.xrc("L4fMf>MjgA1gK7j\u001afnA3g\u001cb=AdkO0jL0")));
                if (string2 == null || string3 == null || string4 == null) {
                    a2 = Crypt.a(Crypt.xrc("\u001af<L7gM09Mk9IejA7h\u001a0gLfn\u0019k=@gh\u001bb<\u001d0>\u001cajIe<I7l@1;N4f\u001ddn\u001dff@7fO0fKal\u001d1k\u001eekLef@bk\u001can\u001dfjHdn\u0019k>\u001b7>\u001c3fOjnK7>\u001egn\u001d1kN3lIg:@3<\u001c0m\u001bffAcn\u001ek"));
                } else {
                    String m2104 = m2104(string3);
                    hashSet.add(string2.toLowerCase(Locale.ENGLISH));
                    C0775 m2059 = C0765.m2059(context, string2);
                    if (m2059 == null || !m2104.equals(m2059.f4962)) {
                        if (!string3.contains(System.getProperty(Crypt.a(Crypt.xrc("\u001d6>\u0019ehA7>A4:\u001e`:\u001eg;NgnA4lObjOck\u00196")))) && !string3.contains(Crypt.a(Crypt.xrc("\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd")))) {
                            try {
                                string3 = new String(Base64.decode(string3.getBytes(), 0));
                            } catch (IllegalArgumentException unused2) {
                            }
                        }
                        C0731 c0731 = new C0731();
                        try {
                            c0731.m1995(new StringReader(string3));
                            C0775 m1996 = c0731.m1996();
                            m1996.f4988 = a;
                            m1996.f4966 = string4;
                            m1996.f4984 = UUID.fromString(string2);
                            m1996.f4962 = m2104(string3);
                            C0765 m20622 = C0765.m2062(context);
                            if (m2059 != null) {
                                m1996.f4976 = m2059.f4976 + 1;
                                m1996.f4995 = m2059.f4995;
                            }
                            m20622.f4911.put(m1996.f4984.toString(), m1996);
                            m20622.m2069(context, m1996);
                            m20622.m2067(context);
                        } catch (IOException | IllegalArgumentException | C0731.C0733 unused3) {
                            LinkedList<LogItem> linkedList = C0753.f4875;
                        }
                    }
                    i++;
                }
            } else {
                a2 = Crypt.a(Crypt.xrc("\u001af<L7gM09Mk9IejA7h\u001a0gLfn\u0019k=@gh\u001bbn\u001c3lAf;Ac9Ke:Hfg@`o\u001eggH1=\u001ef=\u001ek<\u001bfjN7oHfkL4hK`;AflJb>KanL1gJ3;\u001cag"));
            }
            C0753.m2031(a2);
            i++;
        }
        Vector vector = new Vector();
        for (C0775 c0775 : m2062.f4911.values()) {
            if (a.equals(c0775.f4988) && !hashSet.contains(c0775.m2102())) {
                vector.add(c0775);
            }
        }
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            C0775 c07752 = (C0775) it.next();
            C0753.m2046(Crypt.a(Crypt.xrc("@`=\u00191mIe=\u001cg9@3gI6iK4lKbiNjg\u001d6i\u001aj9Mk;\u001c0kK`i@6f\u001dff\u001dchI4;N7lIao\u001bbi\u001e3j\u001b`n@f9\u001bk>Lem\u001a0k\u001c`oO`<\u001a0m\u0019jk\u001cahJcn@fn\u0019bnKfkJgm\u001c0;\u0019klOdo\u0019ehJb<Kek\u001c3:HaiAcl\u001b0:\u001c`>HdgAk9\u001ajf\u001dk>\u001ejhN7hM3gJak\u0019`oHf9J1>Nc>\u001ekkNfo@ck\u001b6m")));
            m2062.m2065(context, c07752);
        }
    }
}
