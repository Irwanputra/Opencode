.class public Lcom/trilead/ssh2/crypto/CryptoWishList;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public c2s_enc_algos:[Ljava/lang/String;

.field public c2s_mac_algos:[Ljava/lang/String;

.field public kexAlgorithms:[Ljava/lang/String;

.field public s2c_enc_algos:[Ljava/lang/String;

.field public s2c_mac_algos:[Ljava/lang/String;

.field public serverHostKeyAlgorithms:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    sget-object v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->ぉざぅち〻:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "Jbi\u0019f<@`;Idj\u0019b9JkiO0nNe;Kbj\u001c4gO4k\u001b69I6:Hf>\u0019kf\u001a7nJa;\u001a0g\u001a`<I0>\u001b6:ManL6n\u001dblJemL`>\u001eb>O7:I`>\u001bao@joN6g"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "Jbi\u0019f<@`;Idj\u0019b9JkiO0nNe;Kbj\u001c4gO4k\u001b69I6:Hf>\u0019kf\u001a7nJa;\u001a0g\u001a`<I0>\u001b6:M`k\u001c1j\u001bkm\u001ekfI4>N`iJdh\u001c1nL1h@kjJ7<"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "Jbi\u0019f<@`;Idj\u0019b9JkiO0nNe;Kbj\u001c4gO4o\u00193jKj;\u001eekAgiAb;K1o@jnA0jJf<@d:O"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "Jbi\u0019f<@`;Idj\u0019b9JkiO0nNe;Kbj\u001c4gO4>Ic;\u001a4hLfnK1n@6i\u001d6k\u001be;\u0019ghHdjOjg\u001b"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 2
    iput-object v0, p0, Lcom/trilead/ssh2/crypto/CryptoWishList;->kexAlgorithms:[Ljava/lang/String;

    .line 3
    sget-object v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->ざとぅぼこ〺:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lcom/trilead/ssh2/crypto/CryptoWishList;->serverHostKeyAlgorithms:[Ljava/lang/String;

    invoke-static {}, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->getDefaultCipherList()[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/trilead/ssh2/crypto/CryptoWishList;->c2s_enc_algos:[Ljava/lang/String;

    invoke-static {}, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->getDefaultCipherList()[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/trilead/ssh2/crypto/CryptoWishList;->s2c_enc_algos:[Ljava/lang/String;

    invoke-static {}, Lcom/trilead/ssh2/crypto/digest/MessageMac;->getMacs()[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/trilead/ssh2/crypto/CryptoWishList;->c2s_mac_algos:[Ljava/lang/String;

    invoke-static {}, Lcom/trilead/ssh2/crypto/digest/MessageMac;->getMacs()[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/trilead/ssh2/crypto/CryptoWishList;->s2c_mac_algos:[Ljava/lang/String;

    return-void
.end method
