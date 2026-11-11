package p131.p225.p226.p227;

import androidx.core.app.NotificationCompat;
import com.trilead.ssh2.crypto.CertificateDecoder;
import com.trilead.ssh2.crypto.PEMStructure;
import com.trilead.ssh2.crypto.SimpleDERReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.List;
import p131.p155.p156.p157.C2098;
import p131.p225.p226.p229.C2742;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぇぬぎばつ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC2713 extends AbstractC2723<ECPublicKey, ECPrivateKey> {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final ECParameterSpec f10206;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final String f10207;

    /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぇぬぎばつ.くし〴〺ぅ$〺つふすそ, reason: contains not printable characters */
    public static class C2714 extends AbstractC2713 {
        public C2714() {
            super(Crypt.a(Crypt.xrc("\u001b79JfkKg=O0nI`=MdoAcmKgn\u0019dg\u00191mOk")), Crypt.a(Crypt.xrc("H4oNfk\u001cbg\u001c7g@elAa:Mj=\u001daiJe=@1m\u001c1")), new ECParameterSpec(new EllipticCurve(new ECFieldFp(new BigInteger(Crypt.a(Crypt.xrc("\u001dg:I69AchN3i\u001ck<NkkId9Men\u001eblM6gL0j\u001d4i\u001d3:\u001d7f@klI1kAdgO0mO3kOe9\u001dc=NfoKk>\u001cgk\u001de9Ijm\u00194>H4gL6kOdj\u0019akNbi@k>\u001ak=\u001abi\u0019jh\u001c4=\u001e0m\u00191<Jjg\u001d0<NjhI6=\u001ef:N6nLamN1<M4:N7o\u001djmHkj@fgMc:I")), 16)), new BigInteger(Crypt.a(Crypt.xrc("\u001dg:I69AchN3i\u001ck<NkkId9Men\u001eblM6gL0j\u001d4i\u001d3:\u001d7f@klI1kAdgO0mO3kOe9\u001dc=NfoKk>\u001cgk\u001de9Ijm\u00194>H4gL6kOdj\u0019akNbi\u001c6=Lbj@diKcl\u001ekiM0n\u001cc<LbkO`=\u001c3kHgnI1hLb<L1gNc9@7n\u00194iL7h\u001d1<Od:J7=O")), 16), new BigInteger(Crypt.a(Crypt.xrc("\u00197oLemIj:Hg<I3=\u001cei\u001a0g\u001bbo\u001djn\u001bgnHk;\u001djh\u001bjo@ck\u001eanObmHbjJkf\u001ea<Mg=\u001ed:\u001ddnA39Aa<\u001a4oIk<Oa=\u0019a=Jck\u001c4=M4>\u001d7;\u001cch\u001c`fIj9LcmH7oObl\u001a3g\u001djl\u001dfm\u001cjo\u001a49Jd:@af\u001cdo\u001d3;Icj\u001c1jJ`i\u001c7jLkh@0;H")), 16)), new ECPoint(new BigInteger(Crypt.a(Crypt.xrc("\u001afm\u001cbi\u001cc;A4>\u001a6iOb9Ljm\u001c7n\u001d0gIc:J3oJbh\u00190>\u001ec:\u001bghLgf\u001acfKd<O7mJffOa:HjfNgfOfo\u00190>K`mOckA4:\u001bb>\u001bkiI3fI3gA09AjiKg9L1l\u001djm\u001cg9H7=Oj=\u001cj<O4lLkmJf<\u001bciK4hMa:I19\u001dciM7m\u001a`oLafNc;A")), 16), new BigInteger(Crypt.a(Crypt.xrc("@1oN4kO7;\u0019agIbi\u001cg9\u001cgoLc:OjgI3lH1hJ0o\u001af>@jkJboM0l\u001cjhKfk@k<Ab;L7;\u001ddiM6kJ`9\u001be;Jbn\u001cgi\u001a4:\u001ca9\u0019e>\u00197kL3fK7lA1;\u00194m\u001aa=L3nI0fI0<\u001e3=\u001e3mM4mM`<\u001bcoId<Mgf\u001efhJjj\u001ed9L3g\u001djo\u001c`:Mag\u001a")), 16)), new BigInteger(Crypt.a(Crypt.xrc("L79Hc=\u001b1gKj<\u001cao\u001ajiIfh\u001e0>Adm\u001ed;Lgk\u001egn@0k@e=I4i\u001e7hMcnNf=JkiM3iNg:@j=K`f@7;Mj>@4fJbnL1k\u00191iO6;N1:Le>@1l\u001egk\u001ccfA7i\u001c4fJ4<IboM39IahO0<O4j\u001eefH6oHafJk>\u001e69L3;N0<\u001akiH3g\u001a0n\u001a")), 16), 1), null);
        }

        @Override // p131.p225.p226.p227.AbstractC2723
        /* renamed from: くし〴〺ぅ */
        public List<CertificateDecoder> mo4657() {
            return Arrays.asList(new C2717(Crypt.a(Crypt.xrc("\u001eaf@3=KchJ09\u001dcoN0m@cl\u001ek;A1o\u001e4l\u001c1m@`h\u001e7hM6m\u001d7;Kc>\u00193l\u001celLa>\u001dg9MjjI")), this.f10206, null), new C2718(this.f10212, this.f10207, this.f10206));
        }
    }

    /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぇぬぎばつ.くし〴〺ぅ$くし〴〺ぅ, reason: contains not printable characters */
    public static class C2715 extends AbstractC2713 {
        public C2715() {
            super(Crypt.a(Crypt.xrc("\u001c6>\u0019fn\u001ee=L3hLdmH6=KclLekMk:Mfg\u001ba")), Crypt.a(Crypt.xrc("\u001c7;O7nN1j\u001bk9@6n\u001cbf\u001a1m\u001dgfA`<\u0019g=L0")), new ECParameterSpec(new EllipticCurve(new ECFieldFp(new BigInteger(Crypt.a(Crypt.xrc("Hg=Hd=\u001deg\u001cki\u001c49\u001adjK7iLeo\u001d`9\u001a0jObnAd=OejOeo\u0019c<\u001a`k\u001e4nJci\u0019cn\u001a3lIek\u001909\u001ejnK`hJ`hMcgAfk@k;Hgj\u001cknN79Jb:O1kA4iL`j\u001db>\u001eeg@fg\u001dgmM7i\u001eko\u001a4m@09\u001agjO1k\u001cbiJ7<K0=N0kIanL7oHci\u001ce:M4oNbi\u001e6oJcgNclAf=\u001ebg\u001b4oIj:\u001d3g\u001d`<M7g\u001a7=K7jA`;M3;J4gOg:Nk<\u001ab9H6=Of")), 16)), new BigInteger(Crypt.a(Crypt.xrc("Hg=Hd=\u001deg\u001cki\u001c49\u001adjK7iLeo\u001d`9\u001a0jObnAd=OejOeo\u0019c<\u001a`k\u001e4nJci\u0019cn\u001a3lIek\u001909\u001ejnK`hJ`hMcgAfk@k;Hgj\u001cknN79Jb:O1kA4iL`j\u001db>\u001eeg@fg\u001dgmM7i\u001eko\u001a4m@09\u001agjO1k\u001cbiJ7<K0=N0kIanL7oHci\u001ce:MkjOg9AjhAfn@dh\u001bffNf;\u001afjJbhM1h\u001ecj\u001adnI1j\u001eb<\u0019kgJ3n\u001dbfO`o\u001a6h\u001e6k\u001bfkJ4")), 16), new BigInteger(Crypt.a(Crypt.xrc("@`>H3iJf:\u001agjIf:KaoHkoHemH6jMfhIgn\u001aahI7i@`j\u001a`;\u001cem\u001d1;\u001e4fNe:\u001ad>A3kHjo\u001a3i\u001b0:L1;\u001a6mN`;L0;Hc=\u001aggK`fM7oLgmK6j\u0019a:L0:\u001c7=I4=Ig=\u001d7i\u001e6:@3mL7nLe=\u001dg:O7;@1gLbmLe<Ag<LbfJfo\u001djhLjiI1j\u001a6>N0oA7n@a;\u001e0jI7fM`g\u001dj:Jjl\u001df:\u001cg9Je>\u001e`g\u001acl\u001de=Jal\u001b0fMc=H0oOc")), 16)), new ECPoint(new BigInteger(Crypt.a(Crypt.xrc("L6>Ak=\u001ddoI1=Oa<@dlN0iM4nM0n\u001ca<Ld9\u0019km\u001ekkK7f\u001aj<\u00190o\u001agmAk>\u001ef:Kei\u001c3j\u001b3<Lf;HgkJdlNd=\u001bk;\u001ckfIf9\u00196nH`<\u00191i@diAei@3hIg=\u001e0lHj:Og>\u001d`9\u001bdh\u001cclH3oObjA0mJci@0<Ne>@en\u00196j\u001ee:Mgm@6nA0mKfn\u0019c<O7f\u001ecn\u001aki\u001cehK1kK`fOcjLbj@4hMknM0nA4kJ1>\u001cgl\u001ccl\u001eejJ0;\u001a49Ie")), 16), new BigInteger(Crypt.a(Crypt.xrc("\u001a1fK`>\u001d1>\u001c6oM4gL`jJ3gAbfOjgJbgMam\u001c3>@kiL3i\u001e`>@khK0k\u0019j;\u00190;\u001aa9OknM3fHji\u001cch\u0019dm@7:\u001a7jHanJf9H7:\u001dag\u001dgnA0lO`j\u0019gm@49Md=@09IdhJdfM`m\u001afgHb<\u001d0>\u001dgiIe;@6f\u001cj;\u001bcgN6nH3<K39I1>Ae;LgkHbm@fh\u001banMckI4gO3:\u001ddhHdn\u001be<@d<\u001ddhMcoNai\u001eek\u0019efLkiHjjOagJ7:Ld")), 16)), new BigInteger(Crypt.a(Crypt.xrc("Hg=Hd=\u001deg\u001cki\u001c49\u001adjK7iLeo\u001d`9\u001a0jObnAd=OejOeo\u0019c<\u001a`k\u001e4nJci\u0019cn\u001a3lIek\u001909\u001ejnK`hJ`hMcgAfk@k;Hgj\u001cknN79Jb:\u001ejoIk>\u001c3kO1:I3g\u001a4=IdlMk:Jjj\u001da>A6=\u0019`>\u0019bi\u00197hKc9\u001bfk@koLbnJ6=\u001a1>J0kO3j\u001bk<\u001cbiI3lJel\u001b6gOdkIjf\u001b4o\u001cjhL49M3mIdnM6;@blId<J`l\u001b6n\u00191f\u001dboAd<L6")), 16), 1), null);
        }

        @Override // p131.p225.p226.p227.AbstractC2723
        /* renamed from: くし〴〺ぅ */
        public List<CertificateDecoder> mo4657() {
            return Arrays.asList(new C2717(Crypt.a(Crypt.xrc("\u001e7nI`nM0m\u001dei@dlM7kA7n\u001a4h\u0019fhJ7;N0")), this.f10206, null), new C2718(this.f10212, this.f10207, this.f10206));
        }
    }

    /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぇぬぎばつ.くし〴〺ぅ$づざかべべ, reason: contains not printable characters */
    public static class C2717 extends CertificateDecoder {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final ECParameterSpec f10208;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final String f10209;

        public C2717(String str, ECParameterSpec eCParameterSpec, C2716 c2716) {
            this.f10209 = str;
            this.f10208 = eCParameterSpec;
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public KeyPair createKeyPair(PEMStructure pEMStructure) {
            SimpleDERReader simpleDERReader = new SimpleDERReader(pEMStructure.getData());
            byte[] readSequenceAsByteArray = simpleDERReader.readSequenceAsByteArray();
            if (simpleDERReader.available() != 0) {
                throw new IOException(Crypt.a(Crypt.xrc("Hd;\u001d`gI6fJd=O3=Hf:\u001e7kA`jM7;\u001bd>KfmL`o@ffOj;\u001cffOdnI3o\u001eeiHk<\u001e`jO1lJck@b:O1<\u001cb9@g:LdhOfl@en\u0019ehH3<J`g")));
            }
            SimpleDERReader simpleDERReader2 = new SimpleDERReader(readSequenceAsByteArray);
            BigInteger readInt = simpleDERReader2.readInt();
            if (readInt.compareTo(BigInteger.ONE) != 0) {
                throw new IOException(Crypt.a(Crypt.xrc("Ob=\u001c4l\u001eb9\u001ddlMe;O0j@3;\u001bdfNah\u001bfhOgkNa=\u001ca<\u001b0j\u001d`nNcgJf:Ok9\u001ce;\u001cjkHd<L3mJc9\u001befLf>\u001c4>@6gIj;N`f\u001daoN7nK7:")) + readInt);
            }
            byte[] readOctetString = simpleDERReader2.readOctetString();
            String str = null;
            byte[] bArr = null;
            while (simpleDERReader2.available() > 0) {
                int readConstructedType = simpleDERReader2.readConstructedType();
                SimpleDERReader readConstructed = simpleDERReader2.readConstructed();
                if (readConstructedType == 0) {
                    str = readConstructed.readOid();
                } else if (readConstructedType == 1) {
                    bArr = readConstructed.readOctetString();
                }
            }
            if (!this.f10209.equals(str)) {
                throw new IOException(Crypt.a(Crypt.xrc("@b>Afg\u001d1jMai\u001c4;\u001a`jK3i\u001dg;\u001ba<Ngk\u001e`h\u001ecm@bjA79\u001d4jN`9\u001a4=\u001ag;Jf>O3n\u001aa9\u0019")));
            }
            BigInteger bigInteger = new BigInteger(1, readOctetString);
            int length = bArr.length - 1;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 1, bArr2, 0, length);
            ECPoint m4662 = AbstractC2713.m4662(bArr2, this.f10208.getCurve());
            ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(bigInteger, this.f10208);
            ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(m4662, this.f10208);
            try {
                KeyFactory keyFactory = KeyFactory.getInstance(Crypt.a(Crypt.xrc("Igg\u001daj\u001bdfJgh@glIa>\u001bd:Ib9O7k@1=@j")));
                return new KeyPair(keyFactory.generatePublic(eCPublicKeySpec), keyFactory.generatePrivate(eCPrivateKeySpec));
            } catch (GeneralSecurityException unused) {
                throw new IOException(Crypt.a(Crypt.xrc("O1gL`=@1>\u0019a=\u001bjj\u001cj;K`gNalH1:\u001c0kNjoH`<IaoIeo@6h@`fLgoN1<Hgl\u001ed<M7fN")));
            }
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public String getEndLine() {
            return Crypt.a(Crypt.xrc("A7>@cnI`h\u001c`hL0fJ6gOagOfnO`>\u001bki\u001cjg\u001dj:\u001d`;\u001beoLgfLjk\u001akjHkhM0<A6oLki\u001b"));
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public String getStartLine() {
            return Crypt.a(Crypt.xrc("\u001de;\u001b09@1l\u001adlL`:Mj;If<\u0019dlNbiL7m\u001d1:@gm@gg\u001ca9\u001e3<\u001cegKelO4iIbkI6>\u001ej<A"));
        }
    }

    /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぇぬぎばつ.くし〴〺ぅ$なぎぱいぢぎ, reason: contains not printable characters */
    public static class C2718 extends AbstractC2705 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final String f10210;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final ECParameterSpec f10211;

        public C2718(String str, String str2, ECParameterSpec eCParameterSpec) {
            super(str);
            this.f10210 = str2;
            this.f10211 = eCParameterSpec;
        }

        @Override // p131.p225.p226.p227.AbstractC2705
        /* renamed from: げつ〴ぬぐ */
        public KeyPair mo4659(C2742 c2742) {
            String m4694 = c2742.m4694();
            if (!m4694.equals(this.f10210)) {
                throw new IOException(C2098.m4205(Crypt.a(Crypt.xrc("KknAaiHf:\u001b4kI1iN3i\u0019afM1:\u001bck@g>O69AkfNcjA3h\u001cd:\u001c49\u001a0oAe>L3fI`kId;M")), m4694));
            }
            byte[] m4696 = c2742.m4696();
            BigInteger m4698 = c2742.m4698();
            ECPoint m4662 = AbstractC2713.m4662(m4696, this.f10211.getCurve());
            if (m4662 == null) {
                throw new IOException(Crypt.a(Crypt.xrc("\u0019chHe9Kj9Jg:O0>Ag=MakL4=N3kHglAa<\u001ad=\u001aek\u001a4m\u001e`kAb9OkfOamAeo\u001afiO`iN")));
            }
            ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(m4662, this.f10211);
            ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(m4698, this.f10211);
            KeyFactory keyFactory = KeyFactory.getInstance(Crypt.a(Crypt.xrc("Igg\u001daj\u001bdfJgh@glIa>\u001bd:Ib9O7k@1=@j")));
            return new KeyPair(keyFactory.generatePublic(eCPublicKeySpec), keyFactory.generatePrivate(eCPrivateKeySpec));
        }
    }

    /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぇぬぎばつ.くし〴〺ぅ$びぐびあび, reason: contains not printable characters */
    public static class C2719 extends AbstractC2713 {
        public C2719() {
            super(Crypt.a(Crypt.xrc("A7kMa;\u001e6:OclAj>\u001eekA7=\u001bc:Ljj\u0019fl\u0019e")), Crypt.a(Crypt.xrc("Adl\u001e3=He;Aa>Haj\u001dffOe=L6hL7f\u001a`l\u001b4")), new ECParameterSpec(new EllipticCurve(new ECFieldFp(new BigInteger(Crypt.a(Crypt.xrc("\u001cjg@jfO6>Njh@0>Mcn@g<\u001ajlO4mH6f\u00191hL`mKfnAchL3j\u001d4hJgkIeo\u001bc9L0gH39I`9IckIdg\u001e1nKd:@c>KkgKj>L4mN69\u001akm\u001a4nK6;O0nO7<Lj<\u001d0>\u001a19@1fHalN0=\u001c7gIk;Ae:Nbg\u00196:I3<KjmMb=Igk@c:HbmH`l\u00196=K`l\u001ed<Jk>\u001d7iOjoN6kIf;JkgA7;KflHjm\u0019dlHjj\u001ad>Lcj\u00197:\u001949\u001d0<K`fN3=H7mI4hNalHf=L3fO4nMagJg<La<N1>\u0019d<O0kJf:\u001e6<L3mHfj@69\u001cfg\u001een\u001d`;@dh")), 16)), new BigInteger(Crypt.a(Crypt.xrc("\u001cjg@jfO6>Njh@0>Mcn@g<\u001ajlO4mH6f\u00191hL`mKfnAchL3j\u001d4hJgkIeo\u001bc9L0gH39I`9IckIdg\u001e1nKd:@c>KkgKj>L4mN69\u001akm\u001a4nK6;O0nO7<Lj<\u001d0>\u001a19@1fHalN0=\u001c7gIk;Ae:Nbg\u00196:I3<KjmMb=Igk@c:HbmH`l\u00196=K`l\u001ed<Jk>\u001d7iOjoN6kIf;JkgA7;KflHjm\u0019dlHjj\u001ad>Lcj\u00197:\u001949\u001d0<K`fN3=H7mI4hNalHf=L3fO4nMagJg<La<N1>\u00190j\u001bc;J3;O6=M0h\u0019bgJ`iL4iL7jJ4k\u0019d9")), 16), new BigInteger(Crypt.a(Crypt.xrc("N7fMa=Mbm\u001ck<Hgi\u001e6h\u001dc<\u001ednL0mLjk\u001bf<Ie9\u001aj=HffO3o@goNg=HgoO`9\u0019`k\u001cf<\u0019cmK7fH6j\u001adnHbkOemJ49\u001dcnKk;\u0019aj\u001ebh\u001e79\u001ceh@d:\u001c1;\u001ag<@klJ`n\u001c1gNeoMkkLkoIch\u001e1f\u001ck9Oei@f<N0fKkoNdm\u001e6:AjhM6kJ3j\u0019kj\u0019biKeoLafK4o\u001akg\u001dfi\u001a69\u001egg\u001ebo\u001cg;Oa<Ibf\u0019b;K6jOkiN7h\u0019emMcm\u001df9\u001dafJ3l@dhH`gJdmHdj\u001a3=\u001dcmIj<JalI6jOf=Ne<LcoK3o\u001da<A39N6j\u001bkoL7;Kd>")), 16)), new ECPoint(new BigInteger(Crypt.a(Crypt.xrc("\u001ael\u001acj\u001cfj\u001a`f@7nH1iKjmNgiM`kL0<\u001e6m\u00190nHg<\u0019`hA6;Ij9J0:\u001a0k\u001c`hOdm@k<OehK7h\u001aen\u00197<\u001e6g\u00196lAd:\u001b7oLeo\u001c6oLglI6j\u00194oH7:Hc;\u001e4mM4iLak\u001ebf\u001c3<Nc:Jg9\u001dan\u0019ckM3l\u001cb=\u001cd>O1j\u0019g:I7>Ik>\u001ed:A7>\u001c0nMkkN6<NjmIjnNfn\u001ceiNb=@1h\u001dek\u001eb9A6j\u001cfm\u001d`iH3<OgnMgn\u001c1iH7<\u001bg:Ag<\u001a6l\u001ab>LelM4hHgiO1<\u001eckIemMg=\u001e6fNdj\u001eclH4gA1;Nf<\u001cem@bn\u001c4=J0:\u001bb;\u001d7m")), 16), new BigInteger(Crypt.a(Crypt.xrc("Jb:\u00194gL7j@1i\u0019cg@`k\u001b69\u0019e9L1n\u001a39I`<He;@f:\u001cbl\u001a`g\u001ckiNf9\u001b0kI6jOfkHek\u001c4jOejO7n\u001ce:\u001aj:He:\u001de9Ia9O6mM7fH0jKenHdf\u0019gl\u0019d>Nf=\u001c4iOaf\u001be;\u0019afLch\u001be=Ak=\u001e4g\u001cknLcoO3=\u001a6g\u001c1m\u001bc;\u001d4oM7<O1;\u001b7o\u0019j;\u001c3fJgl\u001ekg@cj\u001ag>Ie:\u001ddiI4mKk;Ne=\u0019`=AjoLbk\u001e`=@j9@`gI4k\u001bjgLj=Ac=\u0019ko\u001e1=N0hH`9\u00197l\u001aekHjiM6=\u0019ehJgf\u001d6o\u001e`kObhJfjJ4<A`;H3nIdlL`>\u001bjn")), 16)), new BigInteger(Crypt.a(Crypt.xrc("\u001cjg@jfO6>Njh@0>Mcn@g<\u001ajlO4mH6f\u00191hL`mKfnAchL3j\u001d4hJgkIeo\u001bc9L0gH39I`9IckIdg\u001e1nKd:@c>KkgKj>L4mN69\u001akm\u001a4nK6;O0nO7<Lj<\u001d0>\u001a19@1fHalN0=\u001c7k@4>AgkIan\u001bfhL3k@3>H7<\u001d`k\u0019`m\u00197=A4hHkn@di\u001dei\u001ccgM7nA6fHah\u001ae9If>L3<A0iOj<KalNdoLjm\u001e7lN`h@ejJ6:Jam\u001cc9L4lAd:\u001d0;\u001e4g\u0019e9\u00193n@knN7k\u001edjOamL`>H7=\u001bdi\u001aaf\u001eg9Hg:\u001d3l@a;MgkJ0oM3=")), 16), 1), null);
        }

        @Override // p131.p225.p226.p227.AbstractC2723
        /* renamed from: くし〴〺ぅ */
        public List<CertificateDecoder> mo4657() {
            return Arrays.asList(new C2717(Crypt.a(Crypt.xrc("AkjA1kN6mIdl\u00196kN0j\u001b0iKb>LjiI4f\u001da")), this.f10206, null), new C2718(this.f10212, this.f10207, this.f10206));
        }
    }

    public AbstractC2713(String str, String str2, ECParameterSpec eCParameterSpec, C2716 c2716) {
        super(str, C2098.m4205(Crypt.a(Crypt.xrc("@6oMg>H`gIf<\u001cbhOfh\u001ejh\u001dgmL7:\u001d7f\u0019a")), str2), ECPrivateKey.class);
        this.f10207 = str2;
        this.f10206 = eCParameterSpec;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static void m4661(int i, OutputStream outputStream) {
        if (i <= 127) {
            outputStream.write(i);
            return;
        }
        int i2 = 0;
        int i3 = i;
        while (i3 != 0) {
            i3 >>>= 8;
            i2++;
        }
        outputStream.write(i2 | NotificationCompat.FLAG_HIGH_PRIORITY);
        for (int i4 = (i2 - 1) * 8; i4 >= 0; i4 -= 8) {
            outputStream.write((byte) (i >> i4));
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static ECPoint m4662(byte[] bArr, EllipticCurve ellipticCurve) {
        int fieldSize = (ellipticCurve.getField().getFieldSize() + 7) / 8;
        if (bArr.length != (fieldSize * 2) + 1 || bArr[0] != 4 || bArr.length == 0) {
            return null;
        }
        byte[] bArr2 = new byte[fieldSize];
        System.arraycopy(bArr, 1, bArr2, 0, fieldSize);
        byte[] bArr3 = new byte[fieldSize];
        System.arraycopy(bArr, fieldSize + 1, bArr3, 0, fieldSize);
        return new ECPoint(new BigInteger(1, bArr2), new BigInteger(1, bArr3));
    }

    @Override // p131.p225.p226.p227.AbstractC2723
    /* renamed from: 〺つふすそ */
    public byte[] mo4656(byte[] bArr) {
        C2742 c2742 = new C2742(bArr);
        String m4694 = c2742.m4694();
        if (!m4694.equals(this.f10212)) {
            throw new IOException(C2098.m4205(Crypt.a(Crypt.xrc("Je=If:\u001c1>O6<\u001ak=Kb>\u001acn\u0019ej\u0019c>\u00194i\u001b0l\u00196<\u001cal\u001a3;Ik>\u0019f9@6=M3>Adj@j:LfhI")), m4694));
        }
        byte[] m4696 = c2742.m4696();
        if (c2742.m4695() != 0) {
            throw new IOException(Crypt.a(Crypt.xrc("Hd;\u001d`gI6fJd=O3=Hf:\u001e7kA`jM7;\u001bd>Kf<\u001ae=MbnNe=Ag>KjhLeoH1>I6i\u001da<\u001e1h\u0019dfLdoHgg\u001agfA1i\u0019kkAafJck\u001dk:AdmH6;")));
        }
        C2742 c27422 = new C2742(m4696);
        byte[] byteArray = c27422.m4698().toByteArray();
        byte[] byteArray2 = c27422.m4698().toByteArray();
        int length = byteArray.length;
        int length2 = byteArray2.length;
        if ((byteArray[0] & 128) != 0) {
            length++;
        }
        if ((byteArray2[0] & 128) != 0) {
            length2++;
        }
        int i = length + 6 + length2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        byteArrayOutputStream.write(48);
        m4661(i - 2, byteArrayOutputStream);
        byteArrayOutputStream.write(2);
        m4661(length, byteArrayOutputStream);
        if (length != byteArray.length) {
            byteArrayOutputStream.write(0);
        }
        byteArrayOutputStream.write(byteArray);
        byteArrayOutputStream.write(2);
        m4661(length2, byteArrayOutputStream);
        if (length2 != byteArray2.length) {
            byteArrayOutputStream.write(0);
        }
        byteArrayOutputStream.write(byteArray2);
        return byteArrayOutputStream.toByteArray();
    }

    @Override // p131.p225.p226.p227.AbstractC2723
    /* renamed from: づざかべべ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public ECPublicKey mo4658(byte[] bArr) {
        C2742 c2742 = new C2742(bArr);
        if (!c2742.m4694().equals(this.f10212)) {
            throw new IOException(Crypt.a(Crypt.xrc("Jk<\u001dgn@ehM0hNan\u0019b>O3iH6mH6>H`m\u001a4:Hc:L4j\u001aco\u001dk<Nkn\u001c1=OggJ`g@0oK`gI")));
        }
        c2742.m4694();
        byte[] m4696 = c2742.m4696();
        if (c2742.m4695() != 0) {
            throw new IOException(Crypt.a(Crypt.xrc("Ikf\u001bgfM1l\u001e3fIbkOcg\u001b0;L0o\u001da=Ae:L1l\u001c7f\u001de>\u00193iM3oIa9Hbm\u001af<Adn\u001cgm\u001e1=\u001adnA4f@foMaf\u001d4oIf>I3<@gkJcf\u001c0k\u001b4l")));
        }
        ECParameterSpec eCParameterSpec = this.f10206;
        ECPoint m4662 = m4662(m4696, eCParameterSpec.getCurve());
        if (m4662 == null) {
            throw new IOException(Crypt.a(Crypt.xrc("\u0019chHe9Kj9Jg:O0>Ag=MakL4=N3kHglAa<\u001ad=\u001aek\u001a4m\u001e`kAb9OkfOamAeo\u001afiO`iN")));
        }
        try {
            return (ECPublicKey) KeyFactory.getInstance(Crypt.a(Crypt.xrc("Igg\u001daj\u001bdfJgh@glIa>\u001bd:Ib9O7k@1=@j"))).generatePublic(new ECPublicKeySpec(m4662, eCParameterSpec));
        } catch (GeneralSecurityException e) {
            throw new IOException(Crypt.a(Crypt.xrc("Lbo\u0019fmJ6o\u001abk\u001dd>O4m@7jMbkHjm\u001e3:@cj\u001ea=J19\u001e4k\u001dd9\u001bkhN1;K1lM19Mg9\u001a6oO")), e);
        }
    }
}
