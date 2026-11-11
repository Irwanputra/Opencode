package p010.p011.p012;

import android.content.Context;
import android.os.Build;
import android.security.KeyChain;
import android.security.KeyChainException;
import android.text.TextUtils;
import java.io.Serializable;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.UUID;
import java.util.Vector;
import p010.p011.p012.p013.C0740;
import p010.p011.p012.p013.C0747;
import p034.p095.C1687;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0775 implements Serializable, Cloneable {

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public int f4943;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public String f4944;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public String f4949;

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public boolean f4950;

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public C0747[] f4956;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public String f4961;

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public String f4962;

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public transient PrivateKey f4964;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public String f4966;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public String f4971;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public String f4979;

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public String f4980;

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public String f4988;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public String f4995;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public String f4999;

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public String f5000;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public String f5002;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f4946 = 2;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public String f4986 = "";

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f4951 = true;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean f4981 = false;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public String f4990 = Crypt.a(Crypt.xrc("Lb:\u001b`m\u00194=JjkHbiHdhI3kMem\u001dko\u001ag9Ag"));

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public String f4998 = Crypt.a(Crypt.xrc("I4fN`gL1mJc9I3;\u001c3:\u001d49MfgI`lO4nMf"));

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean f4955 = false;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public String f4958 = "";

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public boolean f4974 = true;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public boolean f4991 = true;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public boolean f4973 = true;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public boolean f4982 = false;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public String f4996 = "";

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public String f4948 = "";

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public String f4957 = "";

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public boolean f4953 = false;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public boolean f4994 = false;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public boolean f4987 = false;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public boolean f4983 = false;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public String f4952 = "";

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public String f4975 = "";

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public boolean f5001 = true;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public boolean f4959 = true;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public String f4977 = "";

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public boolean f4997 = false;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public String f4968 = Crypt.a(Crypt.xrc("\u001abiHbm@eiM3<\u0019gnK7:Kjj\u001c7hA3m@79\u001cb"));

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public String f4960 = Crypt.a(Crypt.xrc("J4;\u001b19Aj>HdfLjjLeiNalLd;\u001bdk\u001dbhJk"));

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public String f4947 = Crypt.a(Crypt.xrc("AkiN0gHc>@7l\u001cfmA7hO0=\u0019g9Nck\u001b1>Lf"));

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public String f4954 = "";

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public int f4969 = 3;

    /* renamed from: ながふずは, reason: contains not printable characters */
    public String f4985 = null;

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public int f4978 = 0;

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public boolean f4993 = false;

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public HashSet<String> f4972 = new HashSet<>();

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public boolean f4970 = true;

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public int f4967 = 0;

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public boolean f4965 = false;

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public int f4976 = 0;

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public String f4945 = Crypt.a(Crypt.xrc("\u001dboM`iLglM4l\u001djfIfmJ3gKgj\u001b3<Ob>\u001ba=Mc:N0:J0g\u001ajj\u001ck=A4o@6o\u001bbi\u0019gg\u001d0mO"));

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public String f4992 = Crypt.a(Crypt.xrc("@1oLg;O4n@ekO`:L1;\u001cc=N`;OkgAgfNk"));

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public boolean f4942 = true;

    /* renamed from: のびぶけせ, reason: contains not printable characters */
    public boolean f4989 = true;

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public UUID f4984 = UUID.randomUUID();

    /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
    public int f4963 = 8;

    /* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.づざかべべ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0776 extends Exception {
        public C0776(C0775 c0775, String str) {
            super(str);
        }
    }

    public C0775(String str) {
        this.f4956 = new C0747[0];
        this.f4966 = str;
        this.f4956 = new C0747[]{new C0747()};
        System.currentTimeMillis();
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static String m2088(String str, String str2) {
        if (str2 == null) {
            return String.format("%s %s\n", str, Crypt.a(Crypt.xrc("J3g\u001d0mM7gAf>Jko\u001eglKajN0<Nc>\u00190o@7m\u001b4j\u001bem\u001ea=\u001dagA7;J`mKelK3:I1;KkkI")));
        }
        if (!m2091(str2)) {
            return String.format(Locale.ENGLISH, "%s %s\n", str, m2090(str2));
        }
        return String.format(Locale.ENGLISH, "<%s>\n%s\n</%s>\n", str, m2089(str2), str);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static String m2089(String str) {
        String a = Crypt.a(Crypt.xrc("OglMfoN`>MbkM`gAclMg=Odh@3>\u001afl\u001a4"));
        return !str.contains(a) ? str : str.substring(str.indexOf(a) + 10);
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static String m2090(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n");
        if (replace.equals(str) && !replace.contains(Crypt.a(Crypt.xrc("\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd"))) && !replace.contains(Crypt.a(Crypt.xrc("Iam\u001cc<AelI4oJ0=@3mN1o\u001d3>HchK`fN1"))) && !replace.contains(Crypt.a(Crypt.xrc("L`lOb=\u001bgmJaoKel\u001dam\u001djkI`h\u001bafJciJ7"))) && !replace.equals("")) {
            return str;
        }
        return '\"' + replace + '\"';
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static boolean m2091(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(Crypt.a(Crypt.xrc("OglMfoN`>MbkM`gAclMg=Odh@3>\u001afl\u001a4"))) || str.startsWith(Crypt.a(Crypt.xrc("M6i\u001d0l@7hK3=Lek\u001aeo\u001ajf\u0019fkI0=N`f\u001ef")));
    }

    public Object clone() {
        C0775 c0775 = (C0775) super.clone();
        c0775.f4984 = UUID.randomUUID();
        c0775.f4956 = new C0747[this.f4956.length];
        C0747[] c0747Arr = this.f4956;
        int length = c0747Arr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            c0775.f4956[i2] = c0747Arr[i].clone();
            i++;
            i2++;
        }
        c0775.f4972 = (HashSet) this.f4972.clone();
        return c0775;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0775) {
            return this.f4984.equals(((C0775) obj).f4984);
        }
        return false;
    }

    public String toString() {
        return this.f4966;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final X509Certificate[] m2092(Context context) {
        this.f4964 = KeyChain.getPrivateKey(context, this.f4995);
        return KeyChain.getCertificateChain(context, this.f4995);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final String m2093(String str) {
        String a = Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad"));
        String[] split = str.split(a);
        if (split.length == 1) {
            split = (str + Crypt.a(Crypt.xrc("NanMf:M6l@6kNb9H6;\u001balM`>\u001ebfHji\u0019b"))).split(a);
        }
        if (split.length != 2) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(split[1]);
            if (parseInt >= 0 && parseInt <= 32) {
                long j = 4294967295L & (4294967295 << (32 - parseInt));
                return split[0] + Crypt.a(Crypt.xrc("@6h\u001c3f\u001effOkgOdiA0n\u001b4=Obg\u001e6=\u001a6:N6")) + String.format(Locale.ENGLISH, Crypt.a(Crypt.xrc("\u001dk<Acj\u001d69N0i\u001c4<N1f\u001ec<O4h\u0019gi@d9\u001d1")), Long.valueOf(((-16777216) & j) >> 24), Long.valueOf((16711680 & j) >> 16), Long.valueOf((65280 & j) >> 8), Long.valueOf(255 & j));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb A[Catch: AssertionError -> 0x0116, KeyChainException | IOException | IllegalArgumentException | InterruptedException | CertificateException | げつ〴ぬぐ -> 0x0141, IllegalArgumentException -> 0x0143, げつ〴ぬぐ -> 0x0145, KeyChainException -> 0x0147, IOException -> 0x0149, InterruptedException -> 0x014b, all -> 0x0180, TryCatch #7 {AssertionError -> 0x0116, blocks: (B:7:0x000a, B:9:0x0010, B:11:0x0016, B:13:0x0019, B:15:0x0021, B:16:0x0062, B:31:0x006a, B:33:0x007e, B:35:0x0099, B:19:0x00c3, B:21:0x00cb, B:22:0x00eb, B:25:0x00f6, B:38:0x00a2, B:39:0x0031, B:40:0x003c, B:42:0x003f, B:44:0x005a, B:45:0x0102, B:46:0x0111, B:47:0x0112), top: B:6:0x000a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3  */
    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.lang.String[] m2094(android.content.Context r17, int r18) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p010.p011.p012.C0775.m2094(android.content.Context, int):java.lang.String[]");
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public final boolean m2095() {
        String str;
        if (this.f4983 && (str = this.f4952) != null && str.contains(Crypt.a(Crypt.xrc("\u001d3k\u001c6lMjfKa;\u001ddi\u001b0n\u001b3=K6l\u00197<L7mA1<L6hIa=HfmHa<J3mM`lO7j\u001bg;KknHbfI")))) {
            return true;
        }
        for (C0747 c0747 : this.f4956) {
            if (c0747.m2021()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x042c  */
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m2096(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p010.p011.p012.C0775.m2096(android.content.Context, boolean):java.lang.String");
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int m2097(Context context) {
        String str;
        C1687.m3670(context).getBoolean(Crypt.a(Crypt.xrc("\u001b6k\u001dd:H1fLkf\u001acmO4j\u001ejhNgmN6<Ac9Nc")), false);
        C0747.EnumC0748 enumC0748 = C0747.EnumC0748.f4859;
        int i = this.f4946;
        if (i == 2 || i == 7 || i == 8) {
            if (this.f4995 == null) {
                return 2131821052;
            }
        } else if ((i == 0 || i == 5) && TextUtils.isEmpty(this.f4999)) {
            return 2131821046;
        }
        if (this.f4973 && this.f4969 == 0) {
            return 2131820769;
        }
        if ((!this.f4991 || this.f4946 == 4) && ((str = this.f4961) == null || m2093(str) == null)) {
            return 2131820932;
        }
        if (!this.f4974 && ((!TextUtils.isEmpty(this.f4971) && ((Vector) m2100(this.f4971)).size() == 0) || (!TextUtils.isEmpty(this.f4980) && ((Vector) m2100(this.f4980)).size() == 0))) {
            return 2131820750;
        }
        if (this.f4981 && TextUtils.isEmpty(this.f4949)) {
            return 2131820981;
        }
        int i2 = this.f4946;
        if ((i2 == 5 || i2 == 0) && (TextUtils.isEmpty(this.f4979) || TextUtils.isEmpty(this.f4944))) {
            return 2131820980;
        }
        int i3 = this.f4946;
        if ((i3 == 0 || i3 == 5) && TextUtils.isEmpty(this.f4999)) {
            return 2131820979;
        }
        boolean z = true;
        for (C0747 c0747 : this.f4956) {
            if (c0747.f4846) {
                z = false;
            }
        }
        if (z) {
            return 2131821186;
        }
        for (C0747 c07472 : this.f4956) {
            if (c07472.f4855 == enumC0748) {
                if (m2095()) {
                    return 2131820823;
                }
                if (!C0740.m2011(context)) {
                    return 2131821053;
                }
            }
        }
        return 2131821050;
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean m2098() {
        int i = this.f4946;
        return i == 3 || i == 5 || i == 6 || i == 7;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final X509Certificate[] m2099(Context context) {
        throw new KeyChainException(Crypt.a(Crypt.xrc("\u001c7;ObkI3i@akLfiL3kK`oA4h\u001cdfHj<K3jIe:HdoN0k\u001cb<@gnJdlA7lN6m@km\u001dkfL4n\u001aekIggKdkA6f\u001bcf\u001cao\u001ce:Ad;\u001c7nAg<")));
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Collection<String> m2100(String str) {
        Vector vector = new Vector();
        if (str == null) {
            return vector;
        }
        for (String str2 : str.split("[\n \t]")) {
            if (!str2.equals("")) {
                String m2093 = m2093(str2);
                if (m2093 == null) {
                    return vector;
                }
                vector.add(m2093);
            }
        }
        return vector;
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public void m2101() {
        switch (this.f4963) {
            case 0:
            case 1:
                this.f4950 = Build.VERSION.SDK_INT < 19;
            case 2:
            case 3:
                this.f4956 = new C0747[]{r3};
                C0747 c0747 = new C0747();
                c0747.f4845 = this.f4945;
                c0747.f4848 = this.f4992;
                c0747.f4853 = this.f4942;
                c0747.f4849 = "";
                this.f4970 = true;
                if (this.f4972 == null) {
                    this.f4972 = new HashSet<>();
                }
                if (this.f4956 == null) {
                    this.f4956 = new C0747[0];
                }
            case 4:
            case 5:
                TextUtils.isEmpty(this.f4988);
            case 6:
                for (C0747 c07472 : this.f4956) {
                    if (c07472.f4855 == null) {
                        c07472.f4855 = C0747.EnumC0748.f4857;
                    }
                }
                break;
        }
        this.f4963 = 8;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public String m2102() {
        return this.f4984.toString().toLowerCase(Locale.ENGLISH);
    }
}
