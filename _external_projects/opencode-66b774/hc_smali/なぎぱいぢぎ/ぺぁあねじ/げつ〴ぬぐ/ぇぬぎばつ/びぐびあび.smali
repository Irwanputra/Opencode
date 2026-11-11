.class public Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/びぐびあび;
.super Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u306a\u304e\u3071\u3044\u3062\u304e/\u307a\u3041\u3042\u306d\u3058/\u3052\u3064\u3034\u306c\u3050/\u3047\u306c\u304e\u3070\u3064/\u3065\u3056\u304b\u3079\u3079<",
        "Lnet/i2p/crypto/eddsa/EdDSAPublicKey;",
        "Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 5

    const-class v0, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;

    new-instance v1, Lnet/i2p/crypto/eddsa/EdDSASecurityProvider;

    invoke-direct {v1}, Lnet/i2p/crypto/eddsa/EdDSASecurityProvider;-><init>()V

    const-string v2, "@`n\u001den\u001e6hI`=Ibh\u001ceoO7f@ci\u001d4k\u001c4o\u001ea"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "N1gL`n\u0019ejAfgKf>@1o\u001cgmI7;\u001a4nLjn\u001a1"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v2, v3, v0, v1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/security/Provider;)V

    return-void
.end method


# virtual methods
.method public 〺つふすそ([B)[B
    .registers 4

    new-instance v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;

    invoke-direct {v0, p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;-><init>([B)V

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->ぁごぐすすぃ()Ljava/lang/String;

    move-result-object p1

    const-string v1, "N1gL`n\u0019ejAfgKf>@1o\u001cgmI7;\u001a4nLjn\u001a1"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_34

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->くし〴〺ぅ()[B

    move-result-object p1

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->いいにぽつ()I

    move-result v0

    if-nez v0, :cond_24

    return-object p1

    :cond_24
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Hd;\u001d`gI6fJd=O3=Hf:\u001e7kA`jM7;\u001bd>KfjL3g@`;\u001a1m\u00197<Kk:@1<\u001b`n\u001d3o\u001a7h\u001b09\u001a"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_34
    new-instance p1, Ljava/io/IOException;

    const-string v0, "\u0019ck\u001b4<\u001cgoMej\u001d3m\u0019fj\u001eb=\u001bgk\u001b79KefJ1f\u001cjf\u001djkOk=O6lNdg\u0019d<\u001cefM3<Na9Ifh\u001d"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public くし〴〺ぅ()Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/trilead/ssh2/crypto/CertificateDecoder;",
            ">;"
        }
    .end annotation

    new-instance v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/びぐびあび$げつ〴ぬぐ;

    const-string v1, "N1gL`n\u0019ejAfgKf>@1o\u001cgmI7;\u001a4nLjn\u001a1"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/びぐびあび$げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/びぐびあび;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public げつ〴ぬぐ([B)Ljava/security/PublicKey;
    .registers 5

    .line 1
    new-instance v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;

    invoke-direct {v0, p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;-><init>([B)V

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->ぁごぐすすぃ()Ljava/lang/String;

    move-result-object p1

    const-string v1, "N1gL`n\u0019ejAfgKf>@1o\u001cgmI7;\u001a4nLjn\u001a1"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4c

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->くし〴〺ぅ()[B

    move-result-object p1

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->いいにぽつ()I

    move-result v0

    if-nez v0, :cond_3c

    new-instance v0, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;

    new-instance v1, Lnet/i2p/crypto/eddsa/spec/EdDSAPublicKeySpec;

    const-string v2, "LkiKc;Hk<\u001dblN1nJ4lMk:L7g\u001b4;\u001b1iOg"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lnet/i2p/crypto/eddsa/spec/EdDSANamedCurveTable;->getByName(Ljava/lang/String;)Lnet/i2p/crypto/eddsa/spec/EdDSANamedCurveSpec;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lnet/i2p/crypto/eddsa/spec/EdDSAPublicKeySpec;-><init>([BLnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;)V

    invoke-direct {v0, v1}, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;-><init>(Lnet/i2p/crypto/eddsa/spec/EdDSAPublicKeySpec;)V

    return-object v0

    :cond_3c
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Hd;\u001d`gI6fJd=O3=Hf:\u001e7kA`jM7;\u001bd>Kfj\u00190l@e=\u0019jg\u0019`iO3f\u0019f;Ij<\u001bf9\u001bch\u001b4gHjnJeoLeo\u001b3nO3>Oe;\u00197jL7f\u001cjhNdj\u0019bg"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4c
    new-instance p1, Ljava/io/IOException;

    const-string v0, "\u001dkm\u001c`kLd:\u001aeiI7;@7=Lb<Ken\u001ccm\u00190i\u001ef;\u0019khMb=OdiLc9\u0019kgN1g\u001bj;\u001eg;Aej\u001eklO"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
