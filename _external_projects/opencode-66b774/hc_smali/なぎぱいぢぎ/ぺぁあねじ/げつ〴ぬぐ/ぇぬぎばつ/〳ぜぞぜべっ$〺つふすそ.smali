.class public Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ$〺つふすそ;
.super Lcom/trilead/ssh2/crypto/CertificateDecoder;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ$げつ〴ぬぐ;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/CertificateDecoder;-><init>()V

    return-void
.end method


# virtual methods
.method public createKeyPair(Lcom/trilead/ssh2/crypto/PEMStructure;)Ljava/security/KeyPair;
    .registers 13

    new-instance v0, Lcom/trilead/ssh2/crypto/SimpleDERReader;

    invoke-virtual {p1}, Lcom/trilead/ssh2/crypto/PEMStructure;->getData()[B

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/trilead/ssh2/crypto/SimpleDERReader;-><init>([B)V

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readSequenceAsByteArray()[B

    move-result-object p1

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->available()I

    move-result v1

    if-nez v1, :cond_b0

    invoke-virtual {v0, p1}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->resetInput([B)V

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object p1

    sget-object v1, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-virtual {p1, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v1

    if-eqz v1, :cond_57

    sget-object v1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {p1, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v1

    if-nez v1, :cond_2b

    goto :goto_57

    :cond_2b
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

    const-string p1, "Jbf\u0019`;\u00193>NanI7nMc;IgnKcnIk=Lj>\u00197=L7nAjn\u001balH1gLgm\u001d3mK3oMd>\u001e4k@7;\u001dgjKj=O4=@4iJbhO7nMgoNgmO`iLfnLj9"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_57
    :goto_57
    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object v10

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object v6

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readInt()Ljava/math/BigInteger;

    move-result-object v9

    :try_start_77
    new-instance v0, Ljava/security/spec/RSAPrivateCrtKeySpec;

    move-object v1, v0

    move-object v2, p1

    move-object v3, v10

    invoke-direct/range {v1 .. v9}, Ljava/security/spec/RSAPrivateCrtKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    new-instance v1, Ljava/security/spec/RSAPublicKeySpec;

    invoke-direct {v1, p1, v10}, Ljava/security/spec/RSAPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    const-string p1, "J7=\u001dkn\u001c4h\u001ab>\u001dfh\u0019dkLcn\u001eah\u001aj;\u001e6kH6"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v0

    invoke-virtual {p1, v1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p1

    new-instance v1, Ljava/security/KeyPair;

    invoke-direct {v1, p1, v0}, Ljava/security/KeyPair;-><init>(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V
    :try_end_9f
    .catch Ljava/security/GeneralSecurityException; {:try_start_77 .. :try_end_9f} :catch_a0

    return-object v1

    :catch_a0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Lbo\u0019fmJ6o\u001abk\u001dd>O4m@7jMbkHjm\u001e3:@coNg>\u001aak\u001ejm\u0019fnHk;Mkk\u001ag9LjgIgg\u00196>\u001b"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "\u001be<\u001edmHe9\u001b7:\u001dg:@kmLf>\u001b3;\u001cdkHdm\u001ckh@km\u001dd:J6oL3:I7kHf;Ka9\u001bjh@c<@1k\u001a4g\u001ab<\u001b1nHkj\u0019ch\u001bkkM`k\u001cc<\u0019kfKd;Ia<"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getEndLine()Ljava/lang/String;
    .registers 2

    const-string v0, "I7;Hdh\u00191kNc:\u001ce=A4iHj>\u001d69\u001ceh\u001ea:AenNd<\u001cfj\u001djjLj>O4f\u001db<\u001cjnAe;@1fKdlI"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getStartLine()Ljava/lang/String;
    .registers 2

    const-string v0, "Ifm\u001b0hJghNc;Okf@djMf:@e<\u001e3=Hfh\u001ck:HbmH79Mj<Hjf\u001ce<\u001bekA0f\u001dcnMboJ4fJ"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
