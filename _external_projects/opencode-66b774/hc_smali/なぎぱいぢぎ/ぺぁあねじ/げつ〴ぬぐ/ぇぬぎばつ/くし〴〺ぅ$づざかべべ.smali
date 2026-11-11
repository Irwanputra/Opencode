.class public Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ$づざかべべ;
.super Lcom/trilead/ssh2/crypto/CertificateDecoder;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3065\u3056\u304b\u3079\u3079"
.end annotation


# instance fields
.field public final 〺つふすそ:Ljava/security/spec/ECParameterSpec;

.field public final げつ〴ぬぐ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/security/spec/ECParameterSpec;Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ$げつ〴ぬぐ;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/CertificateDecoder;-><init>()V

    iput-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ$づざかべべ;->げつ〴ぬぐ:Ljava/lang/String;

    iput-object p2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ$づざかべべ;->〺つふすそ:Ljava/security/spec/ECParameterSpec;

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

    move-result v0

    if-nez v0, :cond_d0

    new-instance v0, Lcom/trilead/ssh2/crypto/SimpleDERReader;

    invoke-direct {v0, p1}, Lcom/trilead/ssh2/crypto/SimpleDERReader;-><init>([B)V

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object p1

    sget-object v1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {p1, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v1

    if-nez v1, :cond_b1

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readOctetString()[B

    move-result-object p1

    const/4 v1, 0x0

    move-object v2, v1

    :goto_2a
    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->available()I

    move-result v3

    const/4 v4, 0x1

    if-lez v3, :cond_48

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readConstructedType()I

    move-result v3

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readConstructed()Lcom/trilead/ssh2/crypto/SimpleDERReader;

    move-result-object v5

    if-eqz v3, :cond_43

    if-eq v3, v4, :cond_3e

    goto :goto_2a

    :cond_3e
    invoke-virtual {v5}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readOctetString()[B

    move-result-object v2

    goto :goto_2a

    :cond_43
    invoke-virtual {v5}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readOid()Ljava/lang/String;

    move-result-object v1

    goto :goto_2a

    :cond_48
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ$づざかべべ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a1

    new-instance v0, Ljava/math/BigInteger;

    invoke-direct {v0, v4, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    array-length p1, v2

    sub-int/2addr p1, v4

    new-array v1, p1, [B

    const/4 v3, 0x0

    invoke-static {v2, v4, v1, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ$づざかべべ;->〺つふすそ:Ljava/security/spec/ECParameterSpec;

    invoke-virtual {p1}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object p1

    .line 1
    invoke-static {v1, p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ;->びぐびあび([BLjava/security/spec/EllipticCurve;)Ljava/security/spec/ECPoint;

    move-result-object p1

    .line 2
    new-instance v1, Ljava/security/spec/ECPrivateKeySpec;

    iget-object v2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ$づざかべべ;->〺つふすそ:Ljava/security/spec/ECParameterSpec;

    invoke-direct {v1, v0, v2}, Ljava/security/spec/ECPrivateKeySpec;-><init>(Ljava/math/BigInteger;Ljava/security/spec/ECParameterSpec;)V

    new-instance v0, Ljava/security/spec/ECPublicKeySpec;

    iget-object v2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ$づざかべべ;->〺つふすそ:Ljava/security/spec/ECParameterSpec;

    invoke-direct {v0, p1, v2}, Ljava/security/spec/ECPublicKeySpec;-><init>(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)V

    :try_start_75
    const-string p1, "Igg\u001daj\u001bdfJgh@glIa>\u001bd:Ib9O7k@1=@j"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    invoke-virtual {p1, v1}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object p1

    new-instance v1, Ljava/security/KeyPair;

    invoke-direct {v1, v0, p1}, Ljava/security/KeyPair;-><init>(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V
    :try_end_90
    .catch Ljava/security/GeneralSecurityException; {:try_start_75 .. :try_end_90} :catch_91

    return-object v1

    :catch_91
    new-instance p1, Ljava/io/IOException;

    const-string v0, "O1gL`=@1>\u0019a=\u001bjj\u001cj;K`gNalH1:\u001c0kNjoH`<IaoIeo@6h@`fLgoN1<Hgl\u001ed<M7fN"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "@b>Afg\u001d1jMai\u001c4;\u001a`jK3i\u001dg;\u001ba<Ngk\u001e`h\u001ecm@bjA79\u001d4jN`9\u001a4=\u001ag;Jf>O3n\u001aa9\u0019"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Ob=\u001c4l\u001eb9\u001ddlMe;O0j@3;\u001bdfNah\u001bfhOgkNa=\u001ca<\u001b0j\u001d`nNcgJf:Ok9\u001ce;\u001cjkHd<L3mJc9\u001befLf>\u001c4>@6gIj;N`f\u001daoN7nK7:"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Hd;\u001d`gI6fJd=O3=Hf:\u001e7kA`jM7;\u001bd>KfmL`o@ffOj;\u001cffOdnI3o\u001eeiHk<\u001e`jO1lJck@b:O1<\u001cb9@g:LdhOfl@en\u0019ehH3<J`g"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_e1

    :goto_e0
    throw p1

    :goto_e1
    goto :goto_e0
.end method

.method public getEndLine()Ljava/lang/String;
    .registers 2

    const-string v0, "A7>@cnI`h\u001c`hL0fJ6gOagOfnO`>\u001bki\u001cjg\u001dj:\u001d`;\u001beoLgfLjk\u001akjHkhM0<A6oLki\u001b"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getStartLine()Ljava/lang/String;
    .registers 2

    const-string v0, "\u001de;\u001b09@1l\u001adlL`:Mj;If<\u0019dlNbiL7m\u001d1:@gm@gg\u001ca9\u001e3<\u001cegKelO4iIbkI6>\u001ej<A"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
