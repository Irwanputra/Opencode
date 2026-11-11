.class public Lcom/trilead/ssh2/crypto/dh/DhExchange;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final g:Ljava/math/BigInteger;

.field private static final log:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

.field public static final p1:Ljava/math/BigInteger;

.field public static final p14:Ljava/math/BigInteger;


# instance fields
.field public e:Ljava/math/BigInteger;

.field public f:Ljava/math/BigInteger;

.field private final hashAlgorithm:Ljava/lang/String;

.field public k:Ljava/math/BigInteger;

.field public p:Ljava/math/BigInteger;

.field public x:Ljava/math/BigInteger;


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    const-class v0, Lcom/trilead/ssh2/crypto/dh/DhExchange;

    .line 1
    new-instance v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    invoke-direct {v1, v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;-><init>(Ljava/lang/Class;)V

    .line 2
    sput-object v1, Lcom/trilead/ssh2/crypto/dh/DhExchange;->log:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    new-instance v0, Ljava/math/BigInteger;

    const-string v1, "@emJ4=A3i\u001b3>Kek\u001b4gLen\u001dgoO`jI3>\u001e3kJ19\u001bjgM7mL49\u001cj:@3=Ib:Hf<I1o\u001c0:N`;M4o\u001b6hM6jN1<\u0019koL3gNg=Ngf@e>IdiK3<Ae=\u001bfk\u001b0jMkhA4k\u001ae;\u001adnA19\u001b3mM3k\u001dcg\u001denNj:Af;\u001bk<I6k@0mNdfHglJbjK`hMgoLcmJ`>J7<\u001c7o@j=\u001d7g\u001ef;\u001afh\u00190=\u001b0jAeiN`;KbhHk>N0jIfo\u001bdnL7lA6j\u0019ef\u001c1;Ijk\u00193i\u001da:I1;Hf>Mfh\u001a7lMehMkj\u001d`f\u001b`f@6fM`=Jb;Ic;\u001e`mJ`mM6:H4oI69@7;\u001b6oLc<KdnLakK`jMkk\u001eao@6<M0n@k:K`>I7f@ejM4<\u001e0<NejL49OeiK1oN4h\u001d3:HjkHehNdm@3lM3jId:@6lIg;L39\u001e3fO7>Jco\u001d1hMfjAemK6kH4=HcfOdfI7l\u001c`n\u001ajlHfkNd;\u0019g;@0kJ1g\u001c`lJbfH3>\u001eei\u001aj=\u001d3hJ1j@k<Lfh@c>K7<@eh\u001c1jI1mK`mLai\u00194k\u001c1gKgfLfkMd>O0h\u001dfoL0lIek\u001e0l\u001e0k\u0019gmIc9\u001b4gJ7f\u001e`:M4>\u001b1l\u001bkg\u0019gfIdl\u001ekjOfj\u001d0mLk;N`l\u001ee:@blHe=M1l\u001bekLa;\u001dj<I1gM7<Ngg@7<\u001dd;Nf;L0f@coI`hI3<HjgKegKgg\u001d1o\u00194gL7oNkf@jkMcjH"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/trilead/ssh2/crypto/dh/DhExchange;->p1:Ljava/math/BigInteger;

    new-instance v0, Ljava/math/BigInteger;

    const/16 v1, 0x10

    const-string v2, "Hg=Hd=\u001deg\u001cki\u001c49\u001adjK7iLeo\u001d`9\u001a0jObm\u001e6hOfgIfjN4k\u0019al\u001efmLagJcoNdg@d;\u001de9Lkg\u001bj=@6mLb<Oc;KejKg;\u001d6>\u001b3j@4iKg>Mb<\u001c3oN`<K4>H6iN`fJ1;Ial\u0019j=Kcm\u001a6g\u001e6kHagOkmJ`k@7i\u001c0g\u0019a9IkgKd:H3j@k;Lci\u001dgn\u001e4mH3kHb9\u001deiJkmIbhIblA6jI3=KfjKj;Of;\u001a`i\u001eekJfnO3=\u0019khNcn@emA69L19A1;K3gMji\u001ef9\u001a4;\u001aj<\u00197>\u001ac<\u001a6=MjkH6iMc<\u001ajfN4kHki\u001a0;\u001a4>A3oH1gHd<LkkJai\u001e`gMj:Mdj@b;Lb:\u001ca<Ako\u001bj:\u001begKf=N3gK39Hk9\u001agn\u001dd<@4l\u001bbjM09\u001d1<\u001ajnAjn\u001c4m\u0019`9\u001aajNc<\u001ejmOdf@aj@jj\u001c1m\u001bg;A`9\u001d1hMak\u001c3oL6l\u00190:N6k\u001b7hJanKc>\u001ae;\u001ccjOejL3=Je9Ia<Jjj\u001cgjNe9\u001bdg\u001af9\u001eemLc<M4oJ6fMc<@dnM1<MejH4lIkfLdn\u0019g:\u00193hIj>\u001ajn\u001a4<Ndi\u001cfi\u001dc=N3>N6h\u001dg:OcgJkj\u001c`h\u0019kn\u001df<Mdn\u001c7iLd:\u001cefK6i\u001adlIjf\u001cjnIeg@3hI0>O4mOc;A4iA1j@jm\u001d79H4iA4=\u00193o\u00193;\u001d`<Ij=HkgN1m\u001e0fHd;\u001e7gOag\u001ck;Kb9\u0019a>Hg:\u001dfhM1jHd9O7g\u0019bg\u00194mO6nH7hLbi\u001bjm\u001d1iM4g\u001cglLa:\u001a4:\u001d4fK6f\u001degNc9@3h\u001ef>@kjNjkO4o\u001b`=OfoIeiJj:\u001d7mKb<\u001b`<O7gJef\u0019`<\u001dd<\u001eco@7mMjf\u001eck\u001ebh\u001c`:\u001b0<OaoAb=\u001d1gHdjLajH1hH0=NahKd>I7=\u001bkiN3g@cmNemM7m\u001ab=\u001a`iIe=K7iK19\u001c1=N6l\u001b6nJb>Ne9L6;Mal@4j\u0019chNkk\u0019cgKk:\u001dghNfmHa>Od>H1g\u00191h\u001achI`mM49Oj;\u00190nOk=Jf=\u001d0<\u0019ej\u001cg;\u001eff\u001a1f\u00196o\u001aaiM7n\u001dk:J3lA0:Nf=\u001af<\u001a6g\u001a0fN1;L4kAc9KglKei\u001cd<\u001ak>Oa<I1mAj;Lao\u001aj=Hfg\u001ad=H39Lbj\u001aafAf=\u001bj9K6;\u001b7lOj>@4i\u001e7i\u001cjg\u001ekoHe=@k>\u001a1lIk;Oc:\u001b0n\u001d`o@3nOff\u001bdmMa9L1k"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/trilead/ssh2/crypto/dh/DhExchange;->p14:Ljava/math/BigInteger;

    new-instance v0, Ljava/math/BigInteger;

    const-string v1, "J4;\u001b19Aj>HdfLjjLeiNalLd;\u001bdk\u001dbhJk"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/trilead/ssh2/crypto/dh/DhExchange;->g:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>()V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "\u001ea>Ad:N6oAf9Nbn@a<Acl\u001dbhA6h\u001c`h\u001a4"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/trilead/ssh2/crypto/dh/DhExchange;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/trilead/ssh2/crypto/dh/DhExchange;->hashAlgorithm:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public calculateH([B[B[B[B[B)[B
    .registers 13

    new-instance v0, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;

    invoke-virtual {p0}, Lcom/trilead/ssh2/crypto/dh/DhExchange;->getHashAlgorithm()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/trilead/ssh2/crypto/dh/DhExchange;->log:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Client: \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v3, Ljava/lang/String;

    const-string v4, "\u001c0<Jgf\u001b0<\u001dgf\u001db=\u001b`kL`m@a>Nkh\u001ecnH7"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, p1, v4}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v5, 0x5a

    invoke-virtual {v1, v5, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->げつ〴ぬぐ(ILjava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Server: \'"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, p2, v4}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v5, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->げつ〴ぬぐ(ILjava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateByteString([B)V

    invoke-virtual {v0, p2}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateByteString([B)V

    invoke-virtual {v0, p3}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateByteString([B)V

    invoke-virtual {v0, p4}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateByteString([B)V

    invoke-virtual {v0, p5}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateByteString([B)V

    iget-object p1, p0, Lcom/trilead/ssh2/crypto/dh/DhExchange;->e:Ljava/math/BigInteger;

    invoke-virtual {v0, p1}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateBigInt(Ljava/math/BigInteger;)V

    iget-object p1, p0, Lcom/trilead/ssh2/crypto/dh/DhExchange;->f:Ljava/math/BigInteger;

    invoke-virtual {v0, p1}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateBigInt(Ljava/math/BigInteger;)V

    iget-object p1, p0, Lcom/trilead/ssh2/crypto/dh/DhExchange;->k:Ljava/math/BigInteger;

    invoke-virtual {v0, p1}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateBigInt(Ljava/math/BigInteger;)V

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->getDigest()[B

    move-result-object p1

    return-object p1
.end method

.method public getE()Ljava/math/BigInteger;
    .registers 3

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/dh/DhExchange;->e:Ljava/math/BigInteger;

    if-eqz v0, :cond_5

    return-object v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "I19Oj<\u001e0mM3g\u001d`jJciIbfN`>Lg9\u001dbo\u001d4=Og>Nk9\u001dej\u0019c=K4iL39\u001d3g\u001a1jKk>Oa:@"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getHashAlgorithm()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/dh/DhExchange;->hashAlgorithm:Ljava/lang/String;

    return-object v0
.end method

.method public getK()Ljava/math/BigInteger;
    .registers 3

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/dh/DhExchange;->k:Ljava/math/BigInteger;

    if-eqz v0, :cond_5

    return-object v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Mdh\u001a0:I1;N0f\u001efnKb9A3;\u001bknJkiKcjJem\u001e39O3jHa:Lel@kn\u001a7hH0oA6kLem\u0019c9M6>\u0019klJ7gOcoJejKgoNe=J6kI39OdkN6="

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public init(ILjava/security/SecureRandom;)V
    .registers 5

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/trilead/ssh2/crypto/dh/DhExchange;->k:Ljava/math/BigInteger;

    const/4 v0, 0x1

    if-ne p1, v0, :cond_9

    sget-object p1, Lcom/trilead/ssh2/crypto/dh/DhExchange;->p1:Ljava/math/BigInteger;

    goto :goto_f

    :cond_9
    const/16 v1, 0xe

    if-ne p1, v1, :cond_2a

    sget-object p1, Lcom/trilead/ssh2/crypto/dh/DhExchange;->p14:Ljava/math/BigInteger;

    :goto_f
    iput-object p1, p0, Lcom/trilead/ssh2/crypto/dh/DhExchange;->p:Ljava/math/BigInteger;

    new-instance p1, Ljava/math/BigInteger;

    iget-object v1, p0, Lcom/trilead/ssh2/crypto/dh/DhExchange;->p:Ljava/math/BigInteger;

    invoke-virtual {v1}, Ljava/math/BigInteger;->bitLength()I

    move-result v1

    sub-int/2addr v1, v0

    invoke-direct {p1, v1, p2}, Ljava/math/BigInteger;-><init>(ILjava/util/Random;)V

    iput-object p1, p0, Lcom/trilead/ssh2/crypto/dh/DhExchange;->x:Ljava/math/BigInteger;

    sget-object p2, Lcom/trilead/ssh2/crypto/dh/DhExchange;->g:Ljava/math/BigInteger;

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/dh/DhExchange;->p:Ljava/math/BigInteger;

    invoke-virtual {p2, p1, v0}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    iput-object p1, p0, Lcom/trilead/ssh2/crypto/dh/DhExchange;->e:Ljava/math/BigInteger;

    return-void

    :cond_2a
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "M0mIejAfoL39L`=\u001aj=\u001a`kJgkH1k\u001a`<Lan\u0019fgM`n\u001aakHc>O3jKafO3lId9A4oLkm\u001b"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public setF(Ljava/math/BigInteger;)V
    .registers 4

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/dh/DhExchange;->e:Ljava/math/BigInteger;

    if-eqz v0, :cond_35

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-gez v0, :cond_25

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/dh/DhExchange;->p:Ljava/math/BigInteger;

    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-lez v0, :cond_25

    iput-object p1, p0, Lcom/trilead/ssh2/crypto/dh/DhExchange;->f:Ljava/math/BigInteger;

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/dh/DhExchange;->x:Ljava/math/BigInteger;

    iget-object v1, p0, Lcom/trilead/ssh2/crypto/dh/DhExchange;->p:Ljava/math/BigInteger;

    invoke-virtual {p1, v0, v1}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    iput-object p1, p0, Lcom/trilead/ssh2/crypto/dh/DhExchange;->k:Ljava/math/BigInteger;

    return-void

    :cond_25
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "KelJc=Lcg\u0019`o\u001a0hLk>KgoKbi\u001e3hJg=@7<\u001d0fO3k\u001cgh\u001a7<NfnI09O6<Jen\u001b1g\u001ef;\u001e"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_35
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "I19Oj<\u001e0mM3g\u001d`jJciIbfN`>Lg9\u001dbo\u001d4=Og>Nk9\u001dej\u0019c=K4iL39\u001d3g\u001a1jKk>Oa:@"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
