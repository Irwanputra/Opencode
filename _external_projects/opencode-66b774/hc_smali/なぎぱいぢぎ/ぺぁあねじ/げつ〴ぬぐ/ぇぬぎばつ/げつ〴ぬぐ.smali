.class public Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/げつ〴ぬぐ;
.super Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/げつ〴ぬぐ$〺つふすそ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u306a\u304e\u3071\u3044\u3062\u304e/\u307a\u3041\u3042\u306d\u3058/\u3052\u3064\u3034\u306c\u3050/\u3047\u306c\u304e\u3070\u3064/\u3065\u3056\u304b\u3079\u3079<",
        "Ljava/security/interfaces/DSAPublicKey;",
        "Ljava/security/interfaces/DSAPrivateKey;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 4

    const-class v0, Ljava/security/interfaces/DSAPrivateKey;

    const-string v1, "Mbg\u001c6nLj>\u001ek9I3;Kfm\u001cd=Nc:\u001bd>Ak9Ma"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "\u001e7<\u001b1kO`>Nci\u001e7kH`nL4=N3=\u001cegOai\u00193"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2, v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public 〺つふすそ([B)[B
    .registers 13

    array-length v0, p1

    const-string v1, "\u001bjiM4;M`iJgf@bk\u0019ajH1>H4g@b9Ij9AciJ0>\u001d0<N6oMdnMkiKchNd>\u001b`h\u001b1fKdfM"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x28

    if-ne v0, v2, :cond_10

    goto :goto_2e

    :cond_10
    new-instance v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;

    invoke-direct {v0, p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;-><init>([B)V

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->ぁごぐすすぃ()Ljava/lang/String;

    move-result-object p1

    .line 1
    iget-object v3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;->〺つふすそ:Ljava/lang/String;

    .line 2
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_fe

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->くし〴〺ぅ()[B

    move-result-object p1

    array-length v3, p1

    if-ne v3, v2, :cond_f8

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->いいにぽつ()I

    move-result v0

    if-nez v0, :cond_e8

    :goto_2e
    const/4 v0, 0x0

    aget-byte v3, p1, v0

    const/4 v4, 0x2

    const/4 v5, 0x3

    const/4 v6, 0x1

    if-nez v3, :cond_81

    aget-byte v3, p1, v6

    if-nez v3, :cond_81

    aget-byte v3, p1, v4

    if-nez v3, :cond_81

    aget-byte v3, p1, v0

    shl-int/lit8 v3, v3, 0x18

    const/high16 v7, -0x1000000

    and-int/2addr v3, v7

    aget-byte v8, p1, v6

    shl-int/lit8 v8, v8, 0x10

    const/high16 v9, 0xff0000

    and-int/2addr v8, v9

    or-int/2addr v3, v8

    aget-byte v8, p1, v4

    shl-int/lit8 v8, v8, 0x8

    const v10, 0xff00

    and-int/2addr v8, v10

    or-int/2addr v3, v8

    aget-byte v8, p1, v5

    and-int/lit16 v8, v8, 0xff

    or-int/2addr v3, v8

    add-int/lit8 v3, v3, 0x4

    add-int/lit8 v8, v3, 0x1

    aget-byte v3, p1, v3

    shl-int/lit8 v3, v3, 0x18

    and-int/2addr v3, v7

    add-int/lit8 v7, v8, 0x1

    aget-byte v8, p1, v8

    shl-int/lit8 v8, v8, 0x10

    and-int/2addr v8, v9

    or-int/2addr v3, v8

    add-int/lit8 v8, v7, 0x1

    aget-byte v7, p1, v7

    shl-int/lit8 v7, v7, 0x8

    and-int/2addr v7, v10

    or-int/2addr v3, v7

    add-int/lit8 v7, v8, 0x1

    aget-byte v8, p1, v8

    and-int/lit16 v8, v8, 0xff

    or-int/2addr v3, v8

    new-array v8, v3, [B

    invoke-static {p1, v7, v8, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p1, v8

    :cond_81
    aget-byte v3, p1, v0

    and-int/lit16 v3, v3, 0x80

    if-eqz v3, :cond_89

    const/4 v3, 0x1

    goto :goto_8a

    :cond_89
    const/4 v3, 0x0

    :goto_8a
    const/16 v7, 0x14

    aget-byte v8, p1, v7

    and-int/lit16 v8, v8, 0x80

    if-eqz v8, :cond_94

    const/4 v8, 0x1

    goto :goto_95

    :cond_94
    const/4 v8, 0x0

    :goto_95
    array-length v9, p1

    const/4 v10, 0x6

    invoke-static {v9, v10, v3, v8}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v9

    new-array v9, v9, [B

    const/16 v10, 0x30

    aput-byte v10, v9, v0

    array-length v10, p1

    if-ne v10, v2, :cond_e2

    const/16 v1, 0x2c

    aput-byte v1, v9, v6

    aget-byte v1, v9, v6

    add-int/2addr v1, v3

    int-to-byte v1, v1

    aput-byte v1, v9, v6

    aget-byte v1, v9, v6

    add-int/2addr v1, v8

    int-to-byte v1, v1

    aput-byte v1, v9, v6

    aput-byte v4, v9, v4

    aput-byte v7, v9, v5

    aget-byte v1, v9, v5

    add-int/2addr v1, v3

    int-to-byte v1, v1

    aput-byte v1, v9, v5

    add-int/lit8 v3, v3, 0x4

    invoke-static {p1, v0, v9, v3, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aget-byte v0, v9, v5

    add-int/lit8 v0, v0, 0x4

    aput-byte v4, v9, v0

    aget-byte v0, v9, v5

    add-int/lit8 v0, v0, 0x5

    aput-byte v7, v9, v0

    aget-byte v0, v9, v5

    add-int/lit8 v0, v0, 0x5

    aget-byte v1, v9, v0

    add-int/2addr v1, v8

    int-to-byte v1, v1

    aput-byte v1, v9, v0

    aget-byte v0, v9, v5

    add-int/lit8 v0, v0, 0x6

    add-int/2addr v0, v8

    invoke-static {p1, v7, v9, v0, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v9

    :cond_e2
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e8
    new-instance p1, Ljava/io/IOException;

    const-string v0, "N4;\u001919MefLjk\u001dc;\u001b3fIeoA4n\u0019giOf:\u0019kj\u001ca:M4iKkhIb9@1oOe9J7=O3jJ7nAkfA"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f8
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_fe
    new-instance p1, Ljava/io/IOException;

    const-string v0, "\u001d6h\u001e7lKd>O0j\u001ba:I4gMahJ6jOa;KgnJ3<\u001a3f\u001a7lK09\u001efn\u0019`h\u001bdg\u001d3lJ3:\u001bf=Jfl\u00194j\u0019`gHdg\u001bafNjmHglAb=I1h\u001deo@e:\u001a4h"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public くし〴〺ぅ()Ljava/util/List;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/trilead/ssh2/crypto/CertificateDecoder;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/trilead/ssh2/crypto/CertificateDecoder;

    new-instance v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/げつ〴ぬぐ$〺つふすそ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/げつ〴ぬぐ$〺つふすそ;-><init>(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;

    .line 1
    iget-object v2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;->〺つふすそ:Ljava/lang/String;

    .line 2
    invoke-direct {v1, p0, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/げつ〴ぬぐ;Ljava/lang/String;)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public げつ〴ぬぐ([B)Ljava/security/PublicKey;
    .registers 7

    .line 1
    new-instance v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;

    invoke-direct {v0, p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;-><init>([B)V

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->ぁごぐすすぃ()Ljava/lang/String;

    move-result-object p1

    .line 2
    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;->〺つふすそ:Ljava/lang/String;

    .line 3
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_62

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->づざかべべ()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->づざかべべ()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->づざかべべ()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->づざかべべ()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->いいにぽつ()I

    move-result v0

    if-nez v0, :cond_52

    :try_start_27
    const-string v0, "Jb;Oa:\u001dd=Mfn\u001a69\u001e4kKd>LcjJjlN6j\u001dj"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v0

    new-instance v4, Ljava/security/spec/DSAPublicKeySpec;

    invoke-direct {v4, v3, p1, v1, v2}, Ljava/security/spec/DSAPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0, v4}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p1

    check-cast p1, Ljava/security/interfaces/DSAPublicKey;
    :try_end_40
    .catch Ljava/security/GeneralSecurityException; {:try_start_27 .. :try_end_40} :catch_41

    return-object p1

    :catch_41
    move-exception p1

    new-instance v0, Ljava/io/IOException;

    const-string v1, "O1gL`=@1>\u0019a=\u001bjj\u001cj;K`gNalH1:\u001c0kNj>HdlIg=\u001d3g\u001c`j\u001cj9Hd<Hk9I0nOdkAk<M"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_52
    new-instance p1, Ljava/io/IOException;

    const-string v0, "\u001dc9\u001c0h@ckKg9\u0019ag\u001a3<\u001aff\u001c`kAdm\u001a3oN4>NjfO7g\u001ebnO`<N7fLc9Og=\u001c4m\u001ecj\u001bd:@"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_62
    new-instance v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/〳ぜぞぜべっ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported key format found \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' while expecting "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;->〺つふすそ:Ljava/lang/String;

    .line 5
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/〳ぜぞぜべっ;-><init>(Ljava/lang/String;)V

    throw v0
.end method
