.class public Lcom/trilead/ssh2/crypto/PEMDecoder;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final LOGGER:Ljava/util/logging/Logger;

.field private static final PEM_DSA_PRIVATE_KEY:I = 0x2

.field private static final PEM_RSA_PRIVATE_KEY:I = 0x1


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const-class v0, Lcom/trilead/ssh2/crypto/PEMDecoder;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/trilead/ssh2/crypto/PEMDecoder;->LOGGER:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static decode([CLjava/lang/String;)Ljava/lang/Object;
    .registers 11
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/trilead/ssh2/crypto/PEMDecoder;->parsePEM([C)Lcom/trilead/ssh2/crypto/PEMStructure;

    move-result-object p0

    invoke-static {p0}, Lcom/trilead/ssh2/crypto/PEMDecoder;->isPEMEncrypted(Lcom/trilead/ssh2/crypto/PEMStructure;)Z

    move-result v0

    if-eqz v0, :cond_2e

    if-eqz p1, :cond_1e

    const-string v0, "\u001c0<Jgf\u001b0<\u001dgf\u001db=\u001b`kL`m@a>Nkh\u001ecnH7"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    invoke-static {p0, p1}, Lcom/trilead/ssh2/crypto/PEMDecoder;->decryptPEM(Lcom/trilead/ssh2/crypto/PEMStructure;[B)V

    goto :goto_2e

    :cond_1e
    new-instance p0, Ljava/io/IOException;

    const-string p1, "@jlAbh\u001ca<OjlOjoHa:Nj9Af;Ian\u001cjgJ3i@`h\u001c4<\u001ckhO`l\u001bkf\u001ck<@ei\u001a0:\u001b3oMd;@em@1<M`iMd<Ka;Nf<Id=Mc>KdlLkm\u001eb9"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2e
    :goto_2e
    iget p1, p0, Lcom/trilead/ssh2/crypto/PEMStructure;->pemType:I

    const/4 v0, 0x2

    const-string v1, "\u0019dl\u001e1>M`<\u001c7jKb>J1=M7kIcmM6n\u001del\u001cc"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-ne p1, v0, :cond_b6

    new-instance p1, Lcom/trilead/ssh2/crypto/SimpleDERReader;

    iget-object p0, p0, Lcom/trilead/ssh2/crypto/PEMStructure;->data:[B

    invoke-direct {p1, p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;-><init>([B)V

    invoke-virtual {p1}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readSequenceAsByteArray()[B

    move-result-object p0

    invoke-virtual {p1}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->available()I

    move-result v0

    const-string v2, "Ij<L`n\u001d6hN3hKa:Mb=Aal\u001cdo@jgN`o\u001e4j@bnO6>A0l\u001dd>K0fIg9Jdo\u001bcgJd;\u001akiNemMbk\u001bb>Afk\u00194hM0mHb<L4g\u001c6j\u00196j\u001a4;"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v0, :cond_b0

    invoke-virtual {p1, p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->resetInput([B)V

    invoke-virtual {p1}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object p0

    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-nez v0, :cond_8e

    invoke-virtual {p1}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {p1}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {p1}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object v6

    invoke-virtual {p1}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {p1}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {p1}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->available()I

    move-result p0

    if-nez p0, :cond_88

    new-instance p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/〺つふすそ;

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/〺つふすそ;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    return-object p0

    :cond_88
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8e
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\u001b4<Kc=N0:M1oI7;J`g@ejNfk\u001dghM1<\u00194:\u001c0>K`;Hg<O1l\u001ee;Lc9Kk=MjfMcn\u001c6>I0m\u001c`:\u001e4>\u001bf9\u001a1:IkmA1kL6>L19Ac;Adk"

    invoke-static {p0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b0
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b6
    const/4 v0, 0x1

    if-ne p1, v0, :cond_126

    new-instance p1, Lcom/trilead/ssh2/crypto/SimpleDERReader;

    iget-object p0, p0, Lcom/trilead/ssh2/crypto/PEMStructure;->data:[B

    invoke-direct {p1, p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;-><init>([B)V

    invoke-virtual {p1}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readSequenceAsByteArray()[B

    move-result-object p0

    invoke-virtual {p1}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->available()I

    move-result v0

    if-nez v0, :cond_116

    invoke-virtual {p1, p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->resetInput([B)V

    invoke-virtual {p1}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object p0

    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-eqz v0, :cond_104

    sget-object v0, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-nez v0, :cond_e2

    goto :goto_104

    :cond_e2
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "Jbf\u0019`;\u00193>NanI7nMc;IgnKcnIk=Lj>\u00197=L7nAjn\u001balH1gLgm\u001d3mK3oMd>\u001e4k@7;\u001dgjKj=O4=@4iJbhO7nMgoNgmO`iLfnLj9"

    invoke-static {p0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_104
    :goto_104
    invoke-virtual {p1}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p1}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p1}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object p1

    new-instance v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/ぺぁあねじ;

    invoke-direct {v1, p1, v0, p0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/ぺぁあねじ;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    return-object v1

    :cond_116
    new-instance p0, Ljava/io/IOException;

    const-string p1, "\u001be<\u001edmHe9\u001b7:\u001dg:@kmLf>\u001b3;\u001cdkHdm\u001ckh@km\u001dd:J6oL3:I7kHf;Ka9\u001bjh@c<@1k\u001a4g\u001ab<\u001b1nHkj\u0019ch\u001bkkM`k\u001cc<\u0019kfKd;Ia<"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_126
    new-instance p0, Ljava/io/IOException;

    const-string p1, "L3iK4gI0n\u001ebo\u001aelN6g\u001bg=\u0019fg\u001ajfJ`fMgl\u001b3nK`hLb9\u0019ci\u001bag\u001a`m\u001cbgAdlKg:O6h\u001acfKg;O3iAk:\u001ek<\u001c4g\u001a0g\u001e09\u001a6k\u001cb<J4g"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static decodeKeyPair([CLjava/lang/String;)Ljava/security/KeyPair;
    .registers 9

    .line 1
    sget-object v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/util/Collection;

    .line 2
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;

    invoke-virtual {v1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;->くし〴〺ぅ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/trilead/ssh2/crypto/CertificateDecoder;

    :try_start_26
    invoke-static {p0, v2}, Lcom/trilead/ssh2/crypto/PEMDecoder;->parsePEM([CLcom/trilead/ssh2/crypto/CertificateDecoder;)Lcom/trilead/ssh2/crypto/PEMStructure;

    move-result-object v3

    invoke-static {v3}, Lcom/trilead/ssh2/crypto/PEMDecoder;->isPEMEncrypted(Lcom/trilead/ssh2/crypto/PEMStructure;)Z

    move-result v4

    if-eqz v4, :cond_54

    if-eqz p1, :cond_44

    const-string v4, "\u001c0<Jgf\u001b0<\u001dgf\u001db=\u001b`kL`m@a>Nkh\u001ecnH7"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v4

    invoke-static {v3, v4}, Lcom/trilead/ssh2/crypto/PEMDecoder;->decryptPEM(Lcom/trilead/ssh2/crypto/PEMStructure;[B)V

    goto :goto_54

    :cond_44
    new-instance v3, Ljava/io/IOException;

    const-string v4, "@jlAbh\u001ca<OjlOjoHa:Nj9Af;Ian\u001cjgJ3i@`h\u001c4<\u001ckhO`l\u001bkf\u001ck<@ei\u001a0:\u001b3oMd;@em@1<M`iMd<Ka;Nf<Id=Mc>KdlLkm\u001eb9"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_54
    :goto_54
    invoke-virtual {v2, v3, p1}, Lcom/trilead/ssh2/crypto/CertificateDecoder;->createKeyPair(Lcom/trilead/ssh2/crypto/PEMStructure;Ljava/lang/String;)Ljava/security/KeyPair;

    move-result-object p0
    :try_end_58
    .catch Ljava/io/IOException; {:try_start_26 .. :try_end_58} :catch_59

    return-object p0

    :catch_59
    move-exception v3

    sget-object v4, Lcom/trilead/ssh2/crypto/PEMDecoder;->LOGGER:Ljava/util/logging/Logger;

    sget-object v5, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v6, "Lbo\u0019fmJ6o\u001abk\u001dd>O4m@7jMbkHjm\u001e3:@cf\u001c3>JkjN3kHj=\u001ak:\u001ad9H39\u001a7gOjo\u001b0g\u001aefId9Og:M3oJc=Ne9Hd<K6>A0gLfkN6m@g>H4:Idf\u001djk\u001a1hMg>Ok<HckI3<Od>La"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v5, v2, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1a

    :cond_7f
    new-instance p0, Ljava/io/IOException;

    const-string p1, "L3iK4gI0n\u001ebo\u001aelN6g\u001bg=\u0019fg\u001ajfJ`fMgl\u001b3nK`hLb9\u0019ci\u001bag\u001a`m\u001cbgAdlKg:O6h\u001acfKg;O3iAk:\u001ek<\u001c4g\u001a0g\u001e09\u001a6k\u001cb<J4g"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_90

    :goto_8f
    throw p0

    :goto_90
    goto :goto_8f
.end method

.method private static decryptPEM(Lcom/trilead/ssh2/crypto/PEMStructure;[B)V
    .registers 7

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/PEMStructure;->dekInfo:[Ljava/lang/String;

    if-eqz v0, :cond_144

    array-length v1, v0

    const/4 v2, 0x2

    if-ne v1, v2, :cond_134

    const/4 v1, 0x0

    aget-object v2, v0, v1

    const/4 v3, 0x1

    aget-object v0, v0, v3

    invoke-static {v0}, Lcom/trilead/ssh2/crypto/PEMDecoder;->hexToByteArray(Ljava/lang/String;)[B

    move-result-object v0

    const-string v3, "\u001c`gHa;@blIcn\u001e6oL3jKbgNd9HjiKd>Oe"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/16 v4, 0x18

    if-eqz v3, :cond_37

    new-instance v2, Lcom/trilead/ssh2/crypto/cipher/DESede;

    invoke-direct {v2}, Lcom/trilead/ssh2/crypto/cipher/DESede;-><init>()V

    invoke-static {p1, v0, v4}, Lcom/trilead/ssh2/crypto/PEMDecoder;->generateKeyFromPasswordSaltWithMD5([B[BI)[B

    move-result-object p1

    invoke-virtual {v2, v1, p1}, Lcom/trilead/ssh2/crypto/cipher/DESede;->init(Z[B)V

    new-instance p1, Lcom/trilead/ssh2/crypto/cipher/CBCMode;

    invoke-direct {p1, v2, v0, v1}, Lcom/trilead/ssh2/crypto/cipher/CBCMode;-><init>(Lcom/trilead/ssh2/crypto/cipher/BlockCipher;[BZ)V

    goto/16 :goto_c4

    :cond_37
    const-string v3, "@kfJf>@fmKkl\u001d`nAfiL1i\u001b4>\u001cjnH3m\u001cf"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5b

    new-instance v2, Lcom/trilead/ssh2/crypto/cipher/DES;

    invoke-direct {v2}, Lcom/trilead/ssh2/crypto/cipher/DES;-><init>()V

    const/16 v3, 0x8

    invoke-static {p1, v0, v3}, Lcom/trilead/ssh2/crypto/PEMDecoder;->generateKeyFromPasswordSaltWithMD5([B[BI)[B

    move-result-object p1

    invoke-virtual {v2, v1, p1}, Lcom/trilead/ssh2/crypto/cipher/DES;->init(Z[B)V

    new-instance p1, Lcom/trilead/ssh2/crypto/cipher/CBCMode;

    invoke-direct {p1, v2, v0, v1}, Lcom/trilead/ssh2/crypto/cipher/CBCMode;-><init>(Lcom/trilead/ssh2/crypto/cipher/BlockCipher;[BZ)V

    goto :goto_c4

    :cond_5b
    const-string v3, "\u001ce=I4h\u001c0<\u0019b<K`9@3jLeh\u001efhKa<\u001dg=\u00196"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7f

    new-instance v2, Lcom/trilead/ssh2/crypto/cipher/AES;

    invoke-direct {v2}, Lcom/trilead/ssh2/crypto/cipher/AES;-><init>()V

    const/16 v3, 0x10

    invoke-static {p1, v0, v3}, Lcom/trilead/ssh2/crypto/PEMDecoder;->generateKeyFromPasswordSaltWithMD5([B[BI)[B

    move-result-object p1

    invoke-virtual {v2, v1, p1}, Lcom/trilead/ssh2/crypto/cipher/AES;->init(Z[B)V

    new-instance p1, Lcom/trilead/ssh2/crypto/cipher/CBCMode;

    invoke-direct {p1, v2, v0, v1}, Lcom/trilead/ssh2/crypto/cipher/CBCMode;-><init>(Lcom/trilead/ssh2/crypto/cipher/BlockCipher;[BZ)V

    goto :goto_c4

    :cond_7f
    const-string v3, "MfkJgh@6>\u001b4=K7fO`9J3;\u001e7kLenAkfLb"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a1

    new-instance v2, Lcom/trilead/ssh2/crypto/cipher/AES;

    invoke-direct {v2}, Lcom/trilead/ssh2/crypto/cipher/AES;-><init>()V

    invoke-static {p1, v0, v4}, Lcom/trilead/ssh2/crypto/PEMDecoder;->generateKeyFromPasswordSaltWithMD5([B[BI)[B

    move-result-object p1

    invoke-virtual {v2, v1, p1}, Lcom/trilead/ssh2/crypto/cipher/AES;->init(Z[B)V

    new-instance p1, Lcom/trilead/ssh2/crypto/cipher/CBCMode;

    invoke-direct {p1, v2, v0, v1}, Lcom/trilead/ssh2/crypto/cipher/CBCMode;-><init>(Lcom/trilead/ssh2/crypto/cipher/BlockCipher;[BZ)V

    goto :goto_c4

    :cond_a1
    const-string v3, "I49L`<H4oO6:Ian\u001ddo\u001a1<\u001adk\u0019j:L6kHa"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_120

    new-instance v2, Lcom/trilead/ssh2/crypto/cipher/AES;

    invoke-direct {v2}, Lcom/trilead/ssh2/crypto/cipher/AES;-><init>()V

    const/16 v3, 0x20

    invoke-static {p1, v0, v3}, Lcom/trilead/ssh2/crypto/PEMDecoder;->generateKeyFromPasswordSaltWithMD5([B[BI)[B

    move-result-object p1

    invoke-virtual {v2, v1, p1}, Lcom/trilead/ssh2/crypto/cipher/AES;->init(Z[B)V

    new-instance p1, Lcom/trilead/ssh2/crypto/cipher/CBCMode;

    invoke-direct {p1, v2, v0, v1}, Lcom/trilead/ssh2/crypto/cipher/CBCMode;-><init>(Lcom/trilead/ssh2/crypto/cipher/BlockCipher;[BZ)V

    :goto_c4
    iget-object v0, p0, Lcom/trilead/ssh2/crypto/PEMStructure;->data:[B

    array-length v0, v0

    invoke-interface {p1}, Lcom/trilead/ssh2/crypto/cipher/BlockCipher;->getBlockSize()I

    move-result v2

    rem-int/2addr v0, v2

    if-nez v0, :cond_101

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/PEMStructure;->data:[B

    array-length v0, v0

    new-array v0, v0, [B

    :goto_d3
    iget-object v2, p0, Lcom/trilead/ssh2/crypto/PEMStructure;->data:[B

    array-length v2, v2

    invoke-interface {p1}, Lcom/trilead/ssh2/crypto/cipher/BlockCipher;->getBlockSize()I

    move-result v3

    div-int/2addr v2, v3

    if-ge v1, v2, :cond_f1

    iget-object v2, p0, Lcom/trilead/ssh2/crypto/PEMStructure;->data:[B

    invoke-interface {p1}, Lcom/trilead/ssh2/crypto/cipher/BlockCipher;->getBlockSize()I

    move-result v3

    mul-int v3, v3, v1

    invoke-interface {p1}, Lcom/trilead/ssh2/crypto/cipher/BlockCipher;->getBlockSize()I

    move-result v4

    mul-int v4, v4, v1

    invoke-interface {p1, v2, v3, v0, v4}, Lcom/trilead/ssh2/crypto/cipher/BlockCipher;->transformBlock([BI[BI)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_d3

    :cond_f1
    invoke-interface {p1}, Lcom/trilead/ssh2/crypto/cipher/BlockCipher;->getBlockSize()I

    move-result p1

    invoke-static {v0, p1}, Lcom/trilead/ssh2/crypto/PEMDecoder;->removePadding([BI)[B

    move-result-object p1

    iput-object p1, p0, Lcom/trilead/ssh2/crypto/PEMStructure;->data:[B

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/trilead/ssh2/crypto/PEMStructure;->dekInfo:[Ljava/lang/String;

    iput-object p1, p0, Lcom/trilead/ssh2/crypto/PEMStructure;->procType:[Ljava/lang/String;

    return-void

    :cond_101
    new-instance p0, Ljava/io/IOException;

    const-string v0, "\u001dahOf>\u0019ji\u001dk<LjoAffHd:\u001a0hMdfN1>MkkA3>\u001a3l\u001ae=\u001acl\u001ddhHeo\u001ddj\u001dkmHa:K6=\u0019`nO4>\u001ab=\u001a`;\u001bd>IanAcnMgo\u001dc=AgiI1l\u0019`mK7gMa<N`9\u001ajkJ6jH7o\u001ab<Lb=\u001dkl@`h@di\u001b4>Okn\u001delN7gN3jHkmA1i\u001afkO1i\u0019"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p1}, Lcom/trilead/ssh2/crypto/cipher/BlockCipher;->getBlockSize()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_120
    new-instance p0, Ljava/io/IOException;

    const-string p1, "IfiL79\u001cc:\u001cfhM1;NggN3j\u001balJjgKdiJfkIboAbj\u001djkMb=I6<OdiMbiKe>OchNfoIbh\u00193hI39\u001b3;AkfLefAe:O6>L`f\u0019bg\u001a1l"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_134
    new-instance p0, Ljava/io/IOException;

    const-string p1, "\u001dj>\u0019fm\u001abkMj;\u001ee=\u001e`hHc:AefLj9\u001djj@4<Aj;\u001e1k\u001bgkH3l\u001d1fMa:K`:\u001b3iAdlAb;@d<J`<Ad<Aj<@bjOg;\u001c`oLekIgjN6=\u001cji"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_144
    new-instance p0, Ljava/io/IOException;

    const-string p1, "\u0019cnOgm@6jL`=\u001ec>\u0019bk\u001ef9\u001b6;McmIk=Ib:Lf<\u001d79I49\u001cb:KjkI`j\u001c4kHjgO1<J4jLgjJdjN7<\u001eagNagAem\u001e7;\u001bbgMjlM7<KgfOgk\u001c7jMem\u001a3l\u001d1nJj:\u0019k<L7:@ai\u001eg9Ma"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_155

    :goto_154
    throw p0

    :goto_155
    goto :goto_154
.end method

.method public static generateKeyFromPasswordSaltWithMD5([B[BI)[B
    .registers 12

    array-length v0, p1

    const/16 v1, 0x8

    if-lt v0, v1, :cond_30

    new-instance v0, Lcom/trilead/ssh2/crypto/digest/MD5;

    invoke-direct {v0}, Lcom/trilead/ssh2/crypto/digest/MD5;-><init>()V

    new-array v2, p2, [B

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/digest/MD5;->getDigestLength()I

    move-result v3

    new-array v4, v3, [B

    move v5, p2

    :goto_13
    array-length v6, p0

    const/4 v7, 0x0

    invoke-virtual {v0, p0, v7, v6}, Lcom/trilead/ssh2/crypto/digest/MD5;->update([BII)V

    invoke-virtual {v0, p1, v7, v1}, Lcom/trilead/ssh2/crypto/digest/MD5;->update([BII)V

    if-ge v5, v3, :cond_1f

    move v6, v5

    goto :goto_20

    :cond_1f
    move v6, v3

    :goto_20
    invoke-virtual {v0, v4, v7}, Lcom/trilead/ssh2/crypto/digest/MD5;->digest([BI)V

    sub-int v8, p2, v5

    invoke-static {v4, v7, v2, v8, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int/2addr v5, v6

    if-nez v5, :cond_2c

    return-object v2

    :cond_2c
    invoke-virtual {v0, v4, v7, v3}, Lcom/trilead/ssh2/crypto/digest/MD5;->update([BII)V

    goto :goto_13

    :cond_30
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "M0hJeh\u001b1i@jmHg:\u001b6fMdoI6h\u001e4:N7;@79\u001c1jL6nO`gL7o\u001bdi\u001ea>A0m\u001b7:K3:A3=Mcm\u0019j=\u001ceoA7:O`f\u001e1=AaiHjhL7:Mfi\u001a0mJfiId<\u001909\u001ejjAe=O3k\u001abnHdiO7nJ6:\u00191"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_41

    :goto_40
    throw p0

    :goto_41
    goto :goto_40
.end method

.method private static hexToByteArray(Ljava/lang/String;)[B
    .registers 6

    if-eqz p0, :cond_43

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_33

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_13
    if-ge v2, v0, :cond_32

    mul-int/lit8 v3, v2, 0x2

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Lcom/trilead/ssh2/crypto/PEMDecoder;->hexToInt(C)I

    move-result v4

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Lcom/trilead/ssh2/crypto/PEMDecoder;->hexToInt(C)I

    move-result v3

    mul-int/lit8 v4, v4, 0x10

    add-int/2addr v4, v3

    int-to-byte v3, v4

    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_13

    :cond_32
    return-object v1

    :cond_33
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "NboO79@0<Hdg\u001cg<N0:OdiI6:JaiNggL0m\u001ajm\u001cd;L1nH4mN79J`h\u001b6<Na:O7oI3iK0fJ0oOe:H0;\u0019knKb>\u001b4k\u001bg=\u0019gnLcnA0<"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_43
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "H3lM0lK3lOf<Og9JkhA6<\u0019b9Ij<A`hJd"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_54

    :goto_53
    throw p0

    :goto_54
    goto :goto_53
.end method

.method private static hexToInt(C)I
    .registers 3

    const/16 v0, 0x61

    if-lt p0, v0, :cond_c

    const/16 v1, 0x66

    if-gt p0, v1, :cond_c

    :goto_8
    sub-int/2addr p0, v0

    add-int/lit8 p0, p0, 0xa

    return p0

    :cond_c
    const/16 v0, 0x41

    if-lt p0, v0, :cond_15

    const/16 v1, 0x46

    if-gt p0, v1, :cond_15

    goto :goto_8

    :cond_15
    const/16 v0, 0x30

    if-lt p0, v0, :cond_1f

    const/16 v1, 0x39

    if-gt p0, v1, :cond_1f

    sub-int/2addr p0, v0

    return p0

    :cond_1f
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Nkh\u001cb9\u001d`gNdj\u001c1:\u001dekK7o\u0019f9\u001cen\u001c7iO1"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_30

    :goto_2f
    throw p0

    :goto_30
    goto :goto_2f
.end method

.method public static isPEMEncrypted(Lcom/trilead/ssh2/crypto/PEMStructure;)Z
    .registers 5

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/PEMStructure;->procType:[Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    :cond_6
    array-length v2, v0

    const/4 v3, 0x2

    if-ne v2, v3, :cond_56

    aget-object v0, v0, v1

    const-string v2, "@0gMflHdk\u001bamI`kA1g\u001ad=\u001ccgAk>NchHa"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_30

    iget-object p0, p0, Lcom/trilead/ssh2/crypto/PEMStructure;->procType:[Ljava/lang/String;

    const/4 v0, 0x1

    aget-object p0, p0, v0

    const-string v0, "\u001ae>\u0019ff\u001a79K3jJgjAdgAen\u0019df\u001ab>Lfh@b"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_30
    new-instance v0, Ljava/io/IOException;

    const-string v2, "L6g@bo\u001ec=\u0019giI3oHf:N3fKek@co\u001ce9@1fHc=\u001c4nOfg\u001cdm\u001aagNj<\u001a0n@dkJ4:N3kI"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object p0, p0, Lcom/trilead/ssh2/crypto/PEMStructure;->procType:[Ljava/lang/String;

    aget-object p0, p0, v1

    const-string v1, "\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, p0, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_56
    new-instance p0, Ljava/io/IOException;

    const-string v0, "L6g@bo\u001ec=\u0019giI3oHf:N3fKek@co\u001ce9@1gMdl\u001c4;H6gJ0;@0n\u001afo\u001e6k@a9AeoOg=M"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static parsePEM([C)Lcom/trilead/ssh2/crypto/PEMStructure;
    .registers 9

    new-instance v0, Lcom/trilead/ssh2/crypto/PEMStructure;

    invoke-direct {v0}, Lcom/trilead/ssh2/crypto/PEMStructure;-><init>()V

    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/CharArrayReader;

    invoke-direct {v2, p0}, Ljava/io/CharArrayReader;-><init>([C)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    :cond_f
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_11a

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    const-string v2, "\u00196oI`f\u001baj\u001cbiId=\u001b`f\u001c`oHkhHcmO0<H6i\u001cgn\u001b`g\u001ce9Hbo\u001ab:KamAdgMa=\u001aci\u001dg=H"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_37

    const/4 p0, 0x2

    iput p0, v0, Lcom/trilead/ssh2/crypto/PEMStructure;->pemType:I

    const-string p0, "Ob:\u001ed:\u00194<M6kMboLc>H`jIb:Lg=\u001dj9\u001c3hOdgN6=Nd=\u0019d9\u001ccmMkiH`;\u0019a;\u001da:Meo\u001b"

    invoke-static {p0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_54

    :cond_37
    const-string v2, "Ifm\u001b0hJghNc;Okf@djMf:@e<\u001e3=Hfh\u001ck:HbmH79Mj<Hjf\u001ce<\u001bekA0f\u001dcnMboJ4fJ"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_f

    const/4 p0, 0x1

    iput p0, v0, Lcom/trilead/ssh2/crypto/PEMStructure;->pemType:I

    const-string p0, "I7;Hdh\u00191kNc:\u001ce=A4iHj>\u001d69\u001ceh\u001ea:AenNd<\u001cfj\u001djjLj>O4f\u001db<\u001cjnAe;@1fKdlI"

    invoke-static {p0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_54
    :goto_54
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    const-string v3, "IgjO4o\u001a3<\u001aah\u001a3:\u0019g9A1=J`mAf9\u001cc>\u001cb"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "\u001dahOf>\u0019ji\u001dk<LjoAffHd:\u001a0hMdfN1>MklK3hJcj\u0019el\u001cbi\u001a4m@kf\u001dckN3nAkmN6hI"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v2, :cond_110

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    const/16 v5, 0x3a

    invoke-virtual {v2, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    const/4 v6, -0x1

    const/4 v7, 0x0

    if-ne v5, v6, :cond_c2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    :goto_81
    if-eqz v2, :cond_b8

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_b0

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    new-array v1, p0, [C

    invoke-virtual {v5, v7, p0, v1, v7}, Ljava/lang/StringBuilder;->getChars(II[CI)V

    invoke-static {v1}, Lcom/trilead/ssh2/crypto/Base64;->decode([C)[B

    move-result-object p0

    iput-object p0, v0, Lcom/trilead/ssh2/crypto/PEMStructure;->data:[B

    array-length p0, p0

    if-eqz p0, :cond_a0

    return-object v0

    :cond_a0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "\u001dahOf>\u0019ji\u001dk<LjoAffHd:\u001a0hMdfN1>Mk<Mcl@6f\u001bggL69L0fA0>Mg;O7j\u001ck;\u001a`m\u001a1:Nf>\u001dk>\u001dgoIa;\u001e0gI6:\u001e79Ajh\u001bgnKai"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b0
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    goto :goto_81

    :cond_b8
    new-instance v0, Ljava/io/IOException;

    invoke-static {v4, p0, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c2
    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v2, v7, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    const-string v4, "\u0019j>A7;K4:\u001a6:@79IbkJ7fO3g\u00190hAbjO3"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    :goto_da
    array-length v4, v2

    if-ge v7, v4, :cond_e8

    aget-object v4, v2, v7

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_da

    :cond_e8
    const-string v4, "\u001b6;\u001dbo\u001b1oJjkNk>K1=Ld=@3<@bf\u001ad;\u001de"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_fc

    iput-object v2, v0, Lcom/trilead/ssh2/crypto/PEMStructure;->procType:[Ljava/lang/String;

    goto/16 :goto_54

    :cond_fc
    const-string v4, "\u001a`;N4;\u001db>\u001adk\u001cbl\u001a6jLfi\u001ajm\u001cafH1=\u0019e"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_54

    iput-object v2, v0, Lcom/trilead/ssh2/crypto/PEMStructure;->dekInfo:[Ljava/lang/String;

    goto/16 :goto_54

    :cond_110
    new-instance v0, Ljava/io/IOException;

    invoke-static {v4, p0, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11a
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid PEM structure, \'-----BEGIN...\' missing"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_123

    :goto_122
    throw p0

    :goto_123
    goto :goto_122
.end method

.method private static parsePEM([CLcom/trilead/ssh2/crypto/CertificateDecoder;)Lcom/trilead/ssh2/crypto/PEMStructure;
    .registers 9

    new-instance v0, Lcom/trilead/ssh2/crypto/PEMStructure;

    invoke-direct {v0}, Lcom/trilead/ssh2/crypto/PEMStructure;-><init>()V

    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/CharArrayReader;

    invoke-direct {v2, p0}, Ljava/io/CharArrayReader;-><init>([C)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    :cond_f
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_ed

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lcom/trilead/ssh2/crypto/CertificateDecoder;->getStartLine()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_f

    invoke-virtual {p1}, Lcom/trilead/ssh2/crypto/CertificateDecoder;->getEndLine()Ljava/lang/String;

    move-result-object p0

    :cond_27
    :goto_27
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p1

    const-string v2, "IgjO4o\u001a3<\u001aah\u001a3:\u0019g9A1=J`mAf9\u001cc>\u001cb"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "\u001dahOf>\u0019ji\u001dk<LjoAffHd:\u001a0hMdfN1>MklK3hJcj\u0019el\u001cbi\u001a4m@kf\u001dckN3nAkmN6hI"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz p1, :cond_e3

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const/16 v4, 0x3a

    invoke-virtual {p1, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    const/4 v5, -0x1

    const/4 v6, 0x0

    if-ne v4, v5, :cond_95

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    :goto_54
    if-eqz p1, :cond_8b

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_83

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    new-array p1, p0, [C

    invoke-virtual {v4, v6, p0, p1, v6}, Ljava/lang/StringBuilder;->getChars(II[CI)V

    invoke-static {p1}, Lcom/trilead/ssh2/crypto/Base64;->decode([C)[B

    move-result-object p0

    iput-object p0, v0, Lcom/trilead/ssh2/crypto/PEMStructure;->data:[B

    array-length p0, p0

    if-eqz p0, :cond_73

    return-object v0

    :cond_73
    new-instance p0, Ljava/io/IOException;

    const-string p1, "\u001dahOf>\u0019ji\u001dk<LjoAffHd:\u001a0hMdfN1>Mk<Mcl@6f\u001bggL69L0fA0>Mg;O7j\u001ck;\u001a`m\u001a1:Nf>\u001dk>\u001dgoIa;\u001e0gI6:\u001e79Ajh\u001bgnKai"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_83
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p1

    goto :goto_54

    :cond_8b
    new-instance p1, Ljava/io/IOException;

    invoke-static {v3, p0, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_95
    add-int/lit8 v4, v4, 0x1

    invoke-virtual {p1, v6, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string v3, "\u0019j>A7;K4:\u001a6:@79IbkJ7fO3g\u00190hAbjO3"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    :goto_ad
    array-length v3, p1

    if-ge v6, v3, :cond_bb

    aget-object v3, p1, v6

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    aput-object v3, p1, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_ad

    :cond_bb
    const-string v3, "\u001b6;\u001dbo\u001b1oJjkNk>K1=Ld=@3<@bf\u001ad;\u001de"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_cf

    iput-object p1, v0, Lcom/trilead/ssh2/crypto/PEMStructure;->procType:[Ljava/lang/String;

    goto/16 :goto_27

    :cond_cf
    const-string v3, "\u001a`;N4;\u001db>\u001adk\u001cbl\u001a6jLfi\u001ajm\u001cafH1=\u0019e"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_27

    iput-object p1, v0, Lcom/trilead/ssh2/crypto/PEMStructure;->dekInfo:[Ljava/lang/String;

    goto/16 :goto_27

    :cond_e3
    new-instance p1, Ljava/io/IOException;

    invoke-static {v3, p0, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_ed
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid PEM structure, \'-----BEGIN...\' missing"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_f6

    :goto_f5
    throw p0

    :goto_f6
    goto :goto_f5
.end method

.method private static removePadding([BI)[B
    .registers 5

    array-length v0, p0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    const-string v2, "JgfIjh\u001akh\u001bf=H`9MgiOb:J`f@3mIjf\u001c1>\u001c`:@1o\u001c3:O1m\u001e4>HjfK39Nd<Idh\u001ebkA6l\u001dcfNajIfnM1>\u001a0:\u001dkh@aiMbgM7fLa>@3nI69\u001ee;\u001d4mAciO0g\u001eek@7:\u001d4:Obi@di\u001d6iJe>\u001c0fI7k\u001ben\u001e`jIghI`=OegN7>K"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-lt v0, v1, :cond_32

    if-gt v0, p1, :cond_32

    const/4 p1, 0x2

    :goto_16
    if-gt p1, v0, :cond_27

    array-length v1, p0

    sub-int/2addr v1, p1

    aget-byte v1, p0, v1

    if-ne v1, v0, :cond_21

    add-int/lit8 p1, p1, 0x1

    goto :goto_16

    :cond_21
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_27
    array-length p1, p0

    sub-int/2addr p1, v0

    new-array p1, p1, [B

    array-length v1, p0

    sub-int/2addr v1, v0

    const/4 v0, 0x0

    invoke-static {p0, v0, p1, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p1

    :cond_32
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_39

    :goto_38
    throw p0

    :goto_39
    goto :goto_38
.end method
