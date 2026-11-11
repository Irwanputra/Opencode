.class public Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/げつ〴ぬぐ$〺つふすそ;
.super Lcom/trilead/ssh2/crypto/CertificateDecoder;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/げつ〴ぬぐ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/CertificateDecoder;-><init>()V

    return-void
.end method


# virtual methods
.method public createKeyPair(Lcom/trilead/ssh2/crypto/PEMStructure;)Ljava/security/KeyPair;
    .registers 8

    new-instance v0, Lcom/trilead/ssh2/crypto/SimpleDERReader;

    invoke-virtual {p1}, Lcom/trilead/ssh2/crypto/PEMStructure;->getData()[B

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/trilead/ssh2/crypto/SimpleDERReader;-><init>([B)V

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readSequenceAsByteArray()[B

    move-result-object p1

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->available()I

    move-result v1

    const-string v2, "Ij<L`n\u001d6hN3hKa:Mb=Aal\u001cdo@jgN`o\u001e4j@bnO6>A0l\u001dd>K0fIg9Jdo\u001bcgJd;\u001akiNemMbk\u001bb>Afk\u00194hM0mHb<L4g\u001c6j\u00196j\u001a4;"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_ae

    invoke-virtual {v0, p1}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->resetInput([B)V

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object p1

    sget-object v1, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-virtual {p1, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v1

    if-nez v1, :cond_82

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->available()I

    move-result v0

    if-nez v0, :cond_7c

    :try_start_46
    new-instance v0, Ljava/security/spec/DSAPrivateKeySpec;

    invoke-direct {v0, v5, p1, v1, v3}, Ljava/security/spec/DSAPrivateKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    new-instance v2, Ljava/security/spec/DSAPublicKeySpec;

    invoke-direct {v2, v4, p1, v1, v3}, Ljava/security/spec/DSAPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    const-string p1, "Jb;Oa:\u001dd=Mfn\u001a69\u001e4kKd>LcjJjlN6j\u001dj"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v0

    invoke-virtual {p1, v2}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p1

    new-instance v1, Ljava/security/KeyPair;

    invoke-direct {v1, p1, v0}, Ljava/security/KeyPair;-><init>(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V
    :try_end_6b
    .catch Ljava/security/GeneralSecurityException; {:try_start_46 .. :try_end_6b} :catch_6c

    return-object v1

    :catch_6c
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Lbo\u0019fmJ6o\u001abk\u001dd>O4m@7jMbkHjm\u001e3:@ch\u001bf<Lbm\u0019gf@dgO3iO7fIjk\u00193n\u001cc9\u001akf\u001d"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7c
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_82
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u0019dl\u001e1>M`<\u001c7jKb>J1=M7kIcmM6n\u001del\u001cc"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\u001b4<Kc=N0:M1oI7;J`g@ejNfk\u001dghM1<\u00194:\u001c0>K`;Hg<O1l\u001ee;Lc9Kk=MjfMcn\u001c6>I0m\u001c`:\u001e4>\u001bf9\u001a1:IkmA1kL6>L19Ac;Adk"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_ae
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getEndLine()Ljava/lang/String;
    .registers 2

    const-string v0, "Ob:\u001ed:\u00194<M6kMboLc>H`jIb:Lg=\u001dj9\u001c3hOdgN6=Nd=\u0019d9\u001ccmMkiH`;\u0019a;\u001da:Meo\u001b"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getStartLine()Ljava/lang/String;
    .registers 2

    const-string v0, "\u00196oI`f\u001baj\u001cbiId=\u001b`f\u001c`oHkhHcmO0<H6i\u001cgn\u001b`g\u001ce9Hbo\u001ab:KamAdgMa=\u001aci\u001dg=H"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
