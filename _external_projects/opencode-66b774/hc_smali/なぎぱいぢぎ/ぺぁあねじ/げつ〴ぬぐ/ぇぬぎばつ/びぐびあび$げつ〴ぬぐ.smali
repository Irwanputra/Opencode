.class public Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/びぐびあび$げつ〴ぬぐ;
.super Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/ぁごぐすすぃ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/びぐびあび;->くし〴〺ぅ()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/びぐびあび;Ljava/lang/String;)V
    .registers 3

    invoke-direct {p0, p2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/ぁごぐすすぃ;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;)Ljava/security/KeyPair;
    .registers 7

    const-string v0, "LkiKc;Hk<\u001dblN1nJ4lMk:L7g\u001b4;\u001b1iOg"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/i2p/crypto/eddsa/spec/EdDSANamedCurveTable;->getByName(Ljava/lang/String;)Lnet/i2p/crypto/eddsa/spec/EdDSANamedCurveSpec;

    move-result-object v0

    invoke-virtual {p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->くし〴〺ぅ()[B

    move-result-object v1

    invoke-virtual {p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->くし〴〺ぅ()[B

    move-result-object p1

    new-instance v2, Lnet/i2p/crypto/eddsa/spec/EdDSAPublicKeySpec;

    invoke-direct {v2, v1, v0}, Lnet/i2p/crypto/eddsa/spec/EdDSAPublicKeySpec;-><init>([BLnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;)V

    new-instance v1, Lnet/i2p/crypto/eddsa/spec/EdDSAPrivateKeySpec;

    const/4 v3, 0x0

    const/16 v4, 0x20

    invoke-static {p1, v3, v4}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lnet/i2p/crypto/eddsa/spec/EdDSAPrivateKeySpec;-><init>([BLnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;)V

    new-instance p1, Lnet/i2p/crypto/eddsa/EdDSASecurityProvider;

    invoke-direct {p1}, Lnet/i2p/crypto/eddsa/EdDSASecurityProvider;-><init>()V

    const-string v0, "I7jH7iL3g\u001b3<\u001dehJ1fNc:O`;\u0019djJcf@j"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyFactory;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    invoke-virtual {p1, v1}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object p1

    new-instance v1, Ljava/security/KeyPair;

    invoke-direct {v1, v0, p1}, Ljava/security/KeyPair;-><init>(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V

    return-object v1
.end method
