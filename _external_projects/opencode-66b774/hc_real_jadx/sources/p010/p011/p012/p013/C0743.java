package p010.p011.p012.p013;

import android.os.Build;
import android.os.Process;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.security.Security;
import p131.p155.p156.p157.C2098;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.ぉざぅち〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0743 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final byte[] f4837;

    /* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.ぉざぅち〻$〺つふすそ, reason: contains not printable characters */
    public static class C0744 extends Provider {
        public C0744() {
            super(Crypt.a(Crypt.xrc("AeoM3=\u001b0lKblH6iH`lM`<Md;@kh\u001ag>Jk")), 1.0d, Crypt.a(Crypt.xrc("\u001bc:AjjK`fM6m\u001909I1jMj=JjoOf:JboNjoKgkL`oIkm\u001da:J6gJ`=\u001aj>Igl\u0019b<I3i@39\u00194<Ofo\u001cj<@0<H4j\u001e3;\u001a0>\u001ekg\u001c0>\u001edfH0h\u001aj9@go\u001c`;AjoK4gL6nM4l\u0019gh\u001bglO1")));
            put(Crypt.a(Crypt.xrc("K0jKa=\u001ck:\u001c4j\u001agnHf;Of>I1gN3>KklNagNa>Kk<J`nA`j\u001b0nA4h\u001b3=@0>Ld>N3f\u001a")), C0745.class.getName());
            put(Crypt.a(Crypt.xrc("K0jKa=\u001ck:\u001c4j\u001agnHf;Of>I1gN3>KklNanObj\u001a4>N3>J6gOckJakNdg\u001d0nA4f\u0019fh\u001d3nNf>O`n\u00190kLehO7mHfn\u001bj>@e:\u0019fiA6j")), Crypt.a(Crypt.xrc("\u001d4=K3nJkf\u001b7i\u001d1n\u001cgoJam\u001d7iJkm\u001d1fIb")));
        }
    }

    /* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.ぉざぅち〻$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0745 extends SecureRandomSpi {

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public static DataInputStream f4839;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public static OutputStream f4840;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean f4842;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public static final File f4838 = new File(Crypt.a(Crypt.xrc("A4n\u001cb<\u001egg\u001ab9\u001cc:Oj<\u001bbnI`kAefOenM1")));

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public static final Object f4841 = new Object();

        @Override // java.security.SecureRandomSpi
        public byte[] engineGenerateSeed(int i) {
            byte[] bArr = new byte[i];
            engineNextBytes(bArr);
            return bArr;
        }

        @Override // java.security.SecureRandomSpi
        public void engineNextBytes(byte[] bArr) {
            DataInputStream m2019;
            if (!this.f4842) {
                engineSetSeed(C0743.m2017());
            }
            try {
                synchronized (f4841) {
                    m2019 = m2019();
                }
                synchronized (m2019) {
                    m2019.readFully(bArr);
                }
            } catch (IOException e) {
                StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("M`mLj>OcgMkl\u001aei\u001d3h\u001dbnJ79\u001cfnMfoI7:\u001bdj@am\u001cgo\u001919@0nH3lAdk\u001d3>Nko\u001a3hK")));
                m4207.append(f4838);
                throw new SecurityException(m4207.toString(), e);
            }
        }

        @Override // java.security.SecureRandomSpi
        public void engineSetSeed(byte[] bArr) {
            Object obj;
            OutputStream outputStream;
            try {
                try {
                    obj = f4841;
                } catch (IOException unused) {
                    String str = Crypt.a(Crypt.xrc("\u0019g=\u001bdm\u001aj9A0:\u001efk\u001cflLem\u001eg:\u001djo\u001b3k\u00193gO7fO0;\u001b`g\u001ce9Hko\u001c39\u001abhKam\u0019k=Jfm\u001d")) + f4838;
                }
                synchronized (obj) {
                    synchronized (obj) {
                        if (f4840 == null) {
                            f4840 = new FileOutputStream(f4838);
                        }
                        outputStream = f4840;
                    }
                    outputStream.write(bArr);
                    outputStream.flush();
                }
                outputStream.write(bArr);
                outputStream.flush();
            } finally {
                this.f4842 = true;
            }
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final DataInputStream m2019() {
            DataInputStream dataInputStream;
            synchronized (f4841) {
                if (f4839 == null) {
                    try {
                        f4839 = new DataInputStream(new FileInputStream(f4838));
                    } catch (IOException e) {
                        throw new SecurityException(Crypt.a(Crypt.xrc("J3fJa=\u001da>\u001b19\u001ae:\u001c4l\u0019`i\u001d1=Ia=Ngk@4")) + f4838 + Crypt.a(Crypt.xrc("\u001bchM6mJfmAcnHc;\u001ef9\u001d7gM3k@1;\u001agi\u001ec")), e);
                    }
                }
                dataInputStream = f4839;
            }
            return dataInputStream;
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        String str = Build.FINGERPRINT;
        if (str != null) {
            sb.append(str);
        }
        String str2 = null;
        try {
            str2 = (String) Build.class.getField(Crypt.a(Crypt.xrc("L6=K3:Mg>\u001egoI7fK39@6h@7oOalL3=@j"))).get(null);
        } catch (Exception unused) {
        }
        if (str2 != null) {
            sb.append(str2);
        }
        try {
            f4837 = sb.toString().getBytes(Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1")));
        } catch (UnsupportedEncodingException unused2) {
            throw new RuntimeException(Crypt.a(Crypt.xrc("J7o\u001bj:\u001edk\u001bdh\u001a4mA0lI7h\u001e4>\u001cahOe:\u001e6oLdk@0gO4=\u0019an\u001bcj\u001acoK49\u001c49JffH`mA")));
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static byte[] m2017() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeLong(System.currentTimeMillis());
            dataOutputStream.writeLong(System.nanoTime());
            dataOutputStream.writeInt(Process.myPid());
            dataOutputStream.writeInt(Process.myUid());
            dataOutputStream.write(f4837);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new SecurityException(Crypt.a(Crypt.xrc("N1=\u001cdi\u001eclM6o\u001c1o\u001afj\u001bao\u001bafO6<L1:\u001benJ3<@b:\u001ajk\u0019d9\u00191nM4<Kc:O6;\u001b7<\u001c4o\u0019")), e);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m2018() {
        String a = Crypt.a(Crypt.xrc("\u001ckhLc9\u001d4;Ob=\u001bfk\u001ck9O09L7kLd:\u001c4=\u001e3hK69Lcg\u001b1hJ4iJ6hA0i\u001cbkNc=\u001bggOdlN3<\u00197;Okg\u001cjm\u001e3lK6nIj=LelHa<\u00191jL6:L1<\u0019j;\u001djmLg<\u001cemN0gJ3=\u00190lKgn\u001e7k\u001ak"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 16 && i <= 18) {
            try {
                Class.forName(a).getMethod(Crypt.a(Crypt.xrc("Ijm\u001a6iLflOjnI6k\u001e4i\u001bek\u001efmN3i@7lK0")), byte[].class).invoke(null, m2017());
                int intValue = ((Integer) Class.forName(a).getMethod(Crypt.a(Crypt.xrc("\u001aalN0;\u001c1=\u001c79J4j\u001c`fM1:@7lK1g@foMf")), String.class, Long.TYPE).invoke(null, Crypt.a(Crypt.xrc("A4n\u001cb<\u001egg\u001ab9\u001cc:Oj<\u001bbnI`kAefOenM1")), 1024)).intValue();
                if (intValue != 1024) {
                    throw new IOException(Crypt.a(Crypt.xrc("\u001bdjL3j\u001ejg\u001abm\u00193:\u001b79Ial\u001a7fOe:Jf<@1iHjlNg=\u001a1j\u001cdkJa=Nj>Nfn\u001ckmNdiI1mH6:\u0019bnNkiK`oNckA6gNc;O6o\u001cefL1iO7o\u001cdiJ0<O6kNgk\u0019am\u001ajh\u001bc=@kgAdhMj:Nj")) + intValue);
                }
            } catch (Exception e) {
                throw new SecurityException(Crypt.a(Crypt.xrc("\u001ajhJ1mJbkH0i\u001dglO3oN1;\u001ec<L1lJ3n\u001b3m@0mM3k\u001c0;Ld<H6iAf;JcoN3j\u001a0f@7jJ")), e);
            }
        }
        if (i > 18) {
            return;
        }
        Provider[] providers = Security.getProviders(Crypt.a(Crypt.xrc("K0jKa=\u001ck:\u001c4j\u001agnHf;Of>I1gN3>KklNagNa>Kk<J`nA`j\u001b0nA4h\u001b3=@0>Ld>N3f\u001a")));
        if (providers == null || providers.length < 1 || !C0744.class.equals(providers[0].getClass())) {
            Security.insertProviderAt(new C0744(), 1);
        }
        SecureRandom secureRandom = new SecureRandom();
        if (!C0744.class.equals(secureRandom.getProvider().getClass())) {
            StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("Ac;L0i\u0019aj\u001bchL7nMf:Kd:AjfI6;MdkMji\u001caiJj>\u001bj:K`oJ`mN09\u0019f=\u001a79@e<Jk9K`n\u001dbn\u001bf<\u001bdhH`jMenHb:KbgMa<\u001be<@ki")));
            m4207.append(secureRandom.getProvider().getClass());
            throw new SecurityException(m4207.toString());
        }
        try {
            SecureRandom secureRandom2 = SecureRandom.getInstance(Crypt.a(Crypt.xrc("Ka>\u001bal\u001a4=\u001e6mH1:IgfAahI1j\u0019bhI7kMj")));
            if (C0744.class.equals(secureRandom2.getProvider().getClass())) {
                return;
            }
            StringBuilder m42072 = C2098.m4207("SecureRandom.getInstance(\"SHA1PRNG\") backed by wrong Provider: ");
            m42072.append(secureRandom2.getProvider().getClass());
            throw new SecurityException(m42072.toString());
        } catch (NoSuchAlgorithmException e2) {
            throw new SecurityException(Crypt.a(Crypt.xrc("Neg\u0019f<HjiNchHanO49\u001a0nH0iA0:Hej\u001efnLcg\u001eahM39@d<\u001b1nH79\u001b7=Mbo\u00196nN0>J")), e2);
        }
    }
}
