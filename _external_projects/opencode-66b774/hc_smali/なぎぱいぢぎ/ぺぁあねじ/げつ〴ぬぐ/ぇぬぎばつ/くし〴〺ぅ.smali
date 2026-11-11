.class public abstract Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ;
.super Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ$なぎぱいぢぎ;,
        Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ$づざかべべ;,
        Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ$びぐびあび;,
        Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ$くし〴〺ぅ;,
        Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ$〺つふすそ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u306a\u304e\u3071\u3044\u3062\u304e/\u307a\u3041\u3042\u306d\u3058/\u3052\u3064\u3034\u306c\u3050/\u3047\u306c\u304e\u3070\u3064/\u3065\u3056\u304b\u3079\u3079<",
        "Ljava/security/interfaces/ECPublicKey;",
        "Ljava/security/interfaces/ECPrivateKey;",
        ">;"
    }
.end annotation


# instance fields
.field public final づざかべべ:Ljava/security/spec/ECParameterSpec;

.field public final びぐびあび:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/ECParameterSpec;Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ$げつ〴ぬぐ;)V
    .registers 6

    const-string p4, "@6oMg>H`gIf<\u001cbhOfh\u001ejh\u001dgmL7:\u001d7f\u0019a"

    invoke-static {p4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    .line 1
    invoke-static {p4, p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    const-class v0, Ljava/security/interfaces/ECPrivateKey;

    invoke-direct {p0, p1, p4, v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V

    iput-object p2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ;->びぐびあび:Ljava/lang/String;

    iput-object p3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ;->づざかべべ:Ljava/security/spec/ECParameterSpec;

    return-void
.end method

.method public static なぎぱいぢぎ(ILjava/io/OutputStream;)V
    .registers 4

    const/16 v0, 0x7f

    if-gt p0, v0, :cond_8

    invoke-virtual {p1, p0}, Ljava/io/OutputStream;->write(I)V

    return-void

    :cond_8
    const/4 v0, 0x0

    move v1, p0

    :goto_a
    if-eqz v1, :cond_11

    ushr-int/lit8 v1, v1, 0x8

    add-int/lit8 v0, v0, 0x1

    goto :goto_a

    :cond_11
    or-int/lit16 v1, v0, 0x80

    invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write(I)V

    add-int/lit8 v0, v0, -0x1

    mul-int/lit8 v0, v0, 0x8

    :goto_1a
    if-ltz v0, :cond_25

    shr-int v1, p0, v0

    int-to-byte v1, v1

    invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write(I)V

    add-int/lit8 v0, v0, -0x8

    goto :goto_1a

    :cond_25
    return-void
.end method

.method public static びぐびあび([BLjava/security/spec/EllipticCurve;)Ljava/security/spec/ECPoint;
    .registers 7

    invoke-virtual {p1}, Ljava/security/spec/EllipticCurve;->getField()Ljava/security/spec/ECField;

    move-result-object p1

    invoke-interface {p1}, Ljava/security/spec/ECField;->getFieldSize()I

    move-result p1

    add-int/lit8 p1, p1, 0x7

    div-int/lit8 p1, p1, 0x8

    array-length v0, p0

    mul-int/lit8 v1, p1, 0x2

    const/4 v2, 0x1

    add-int/2addr v1, v2

    if-ne v0, v1, :cond_39

    const/4 v0, 0x0

    aget-byte v1, p0, v0

    const/4 v3, 0x4

    if-ne v1, v3, :cond_39

    array-length v1, p0

    if-nez v1, :cond_1d

    goto :goto_39

    :cond_1d
    new-array v1, p1, [B

    invoke-static {p0, v2, v1, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-array v3, p1, [B

    add-int/lit8 v4, p1, 0x1

    invoke-static {p0, v4, v3, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance p0, Ljava/security/spec/ECPoint;

    new-instance p1, Ljava/math/BigInteger;

    invoke-direct {p1, v2, v1}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance v0, Ljava/math/BigInteger;

    invoke-direct {v0, v2, v3}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-direct {p0, p1, v0}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    return-object p0

    :cond_39
    :goto_39
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public 〺つふすそ([B)[B
    .registers 9

    new-instance v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;

    invoke-direct {v0, p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;-><init>([B)V

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->ぁごぐすすぃ()Ljava/lang/String;

    move-result-object p1

    .line 1
    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;->〺つふすそ:Ljava/lang/String;

    .line 2
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_88

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->くし〴〺ぅ()[B

    move-result-object p1

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->いいにぽつ()I

    move-result v0

    if-nez v0, :cond_78

    new-instance v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;

    invoke-direct {v0, p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;-><init>([B)V

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->づざかべべ()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p1

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->づざかべべ()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    array-length v1, p1

    array-length v2, v0

    const/4 v3, 0x0

    aget-byte v4, p1, v3

    and-int/lit16 v4, v4, 0x80

    if-eqz v4, :cond_3b

    add-int/lit8 v1, v1, 0x1

    :cond_3b
    aget-byte v4, v0, v3

    and-int/lit16 v4, v4, 0x80

    if-eqz v4, :cond_43

    add-int/lit8 v2, v2, 0x1

    :cond_43
    add-int/lit8 v4, v1, 0x6

    add-int/2addr v4, v2

    new-instance v5, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v5, v4}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    const/16 v6, 0x30

    invoke-virtual {v5, v6}, Ljava/io/ByteArrayOutputStream;->write(I)V

    const/4 v6, 0x2

    sub-int/2addr v4, v6

    invoke-static {v4, v5}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ;->なぎぱいぢぎ(ILjava/io/OutputStream;)V

    invoke-virtual {v5, v6}, Ljava/io/ByteArrayOutputStream;->write(I)V

    invoke-static {v1, v5}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ;->なぎぱいぢぎ(ILjava/io/OutputStream;)V

    array-length v4, p1

    if-eq v1, v4, :cond_61

    invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    :cond_61
    invoke-virtual {v5, p1}, Ljava/io/ByteArrayOutputStream;->write([B)V

    invoke-virtual {v5, v6}, Ljava/io/ByteArrayOutputStream;->write(I)V

    invoke-static {v2, v5}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ;->なぎぱいぢぎ(ILjava/io/OutputStream;)V

    array-length p1, v0

    if-eq v2, p1, :cond_70

    invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    :cond_70
    invoke-virtual {v5, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V

    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    return-object p1

    :cond_78
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Hd;\u001d`gI6fJd=O3=Hf:\u001e7kA`jM7;\u001bd>Kf<\u001ae=MbnNe=Ag>KjhLeoH1>I6i\u001da<\u001e1h\u0019dfLdoHgg\u001agfA1i\u0019kkAafJck\u001dk:AdmH6;"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_88
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Je=If:\u001c1>O6<\u001ak=Kb>\u001acn\u0019ej\u0019c>\u00194i\u001b0l\u00196<\u001cal\u001a3;Ik>\u0019f9@6=M3>Adj@j:LfhI"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic げつ〴ぬぐ([B)Ljava/security/PublicKey;
    .registers 2

    invoke-virtual {p0, p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ;->づざかべべ([B)Ljava/security/interfaces/ECPublicKey;

    move-result-object p1

    return-object p1
.end method

.method public づざかべべ([B)Ljava/security/interfaces/ECPublicKey;
    .registers 4

    new-instance v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;

    invoke-direct {v0, p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;-><init>([B)V

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->ぁごぐすすぃ()Ljava/lang/String;

    move-result-object p1

    .line 1
    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;->〺つふすそ:Ljava/lang/String;

    .line 2
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_75

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->ぁごぐすすぃ()Ljava/lang/String;

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->くし〴〺ぅ()[B

    move-result-object p1

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->いいにぽつ()I

    move-result v0

    if-nez v0, :cond_65

    .line 3
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ;->づざかべべ:Ljava/security/spec/ECParameterSpec;

    .line 4
    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v1

    invoke-static {p1, v1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ;->びぐびあび([BLjava/security/spec/EllipticCurve;)Ljava/security/spec/ECPoint;

    move-result-object p1

    if-eqz p1, :cond_55

    :try_start_2a
    new-instance v1, Ljava/security/spec/ECPublicKeySpec;

    invoke-direct {v1, p1, v0}, Ljava/security/spec/ECPublicKeySpec;-><init>(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)V

    const-string p1, "Igg\u001daj\u001bdfJgh@glIa>\u001bd:Ib9O7k@1=@j"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p1

    check-cast p1, Ljava/security/interfaces/ECPublicKey;
    :try_end_43
    .catch Ljava/security/GeneralSecurityException; {:try_start_2a .. :try_end_43} :catch_44

    return-object p1

    :catch_44
    move-exception p1

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Lbo\u0019fmJ6o\u001abk\u001dd>O4m@7jMbkHjm\u001e3:@cj\u001ea=J19\u001e4k\u001dd9\u001bkhN1;K1lM19Mg9\u001a6oO"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_55
    new-instance p1, Ljava/io/IOException;

    const-string v0, "\u0019chHe9Kj9Jg:O0>Ag=MakL4=N3kHglAa<\u001ad=\u001aek\u001a4m\u001e`kAb9OkfOamAeo\u001afiO`iN"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_65
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Ikf\u001bgfM1l\u001e3fIbkOcg\u001b0;L0o\u001da=Ae:L1l\u001c7f\u001de>\u00193iM3oIa9Hbm\u001af<Adn\u001cgm\u001e1=\u001adnA4f@foMaf\u001d4oIf>I3<@gkJcf\u001c0k\u001b4l"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_75
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Jk<\u001dgn@ehM0hNan\u0019b>O3iH6mH6>H`m\u001a4:Hc:L4j\u001aco\u001dk<Nkn\u001c1=OggJ`g@0oK`gI"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
