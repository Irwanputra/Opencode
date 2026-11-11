.class public Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ;
.super Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ$〺つふすそ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u306a\u304e\u3071\u3044\u3062\u304e/\u307a\u3041\u3042\u306d\u3058/\u3052\u3064\u3034\u306c\u3050/\u3047\u306c\u304e\u3070\u3064/\u3065\u3056\u304b\u3079\u3079<",
        "Ljava/security/interfaces/RSAPublicKey;",
        "Ljava/security/interfaces/RSAPrivateKey;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 4

    const-class v0, Ljava/security/interfaces/RSAPrivateKey;

    const-string v1, "@fj\u001b39Lc>\u001cc<\u001d7k\u001919\u0019bl\u001ebjL0mH1gO4"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "O4hL`f\u001ejn\u001bf<I6iO7:Jb;Ad>\u001d0<\u001e3i\u001cf"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2, v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public 〺つふすそ([B)[B
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

    if-eqz p1, :cond_3f

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->くし〴〺ぅ()[B

    move-result-object p1

    array-length v1, p1

    if-eqz v1, :cond_2f

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->いいにぽつ()I

    move-result v0

    if-nez v0, :cond_1f

    return-object p1

    :cond_1f
    new-instance p1, Ljava/io/IOException;

    const-string v0, "M69\u001bdh\u001e0hAg9@6lJbj\u001d6k\u001d79Akn\u001ec;Ie<\u001dd=@ef\u001b3mM7<Oe=I0;MfhH1=\u0019ag\u001c0n\u0019"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2f
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Kkg\u001c6=@egOgf\u001a1hNalJbl\u001bfg\u001bf;Kj:\u001dfoI0j\u0019kkM`oJkiJ`fH0nH3n\u001b1hMcm\u001d3>MjlA1;\u001egf\u001dgjHjiNa>Ogl\u001b6l\u001ad>NbgMeo"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3f
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

    new-instance v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ$〺つふすそ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ$〺つふすそ;-><init>(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ$げつ〴ぬぐ;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ$げつ〴ぬぐ;

    const-string v2, "O4hL`f\u001ejn\u001bf<I6iO7:Jb;Ad>\u001d0<\u001e3i\u001cf"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ$げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ;Ljava/lang/String;)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

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

    .line 2
    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;->〺つふすそ:Ljava/lang/String;

    .line 3
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5a

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->づざかべべ()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->づざかべべ()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->いいにぽつ()I

    move-result v0

    if-nez v0, :cond_4a

    :try_start_1f
    const-string v0, "J7=\u001dkn\u001c4h\u001ab>\u001dfh\u0019dkLcn\u001eah\u001aj;\u001e6kH6"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v0

    new-instance v2, Ljava/security/spec/RSAPublicKeySpec;

    invoke-direct {v2, v1, p1}, Ljava/security/spec/RSAPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0, v2}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p1

    check-cast p1, Ljava/security/interfaces/RSAPublicKey;
    :try_end_38
    .catch Ljava/security/GeneralSecurityException; {:try_start_1f .. :try_end_38} :catch_39

    return-object p1

    :catch_39
    move-exception p1

    new-instance v0, Ljava/io/IOException;

    const-string v1, "O1gL`=@1>\u0019a=\u001bjj\u001cj;K`gNalH1:\u001c0kNjkL6oA6<N`<@kh\u001b`kLjhIch\u0019fmKdg@jo\u001c"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_4a
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Ig<@fk\u001ec>K6l\u001bc9NgmN1f\u001bak\u001a4fIefK3gNgm\u001e1<Jkf\u001achA`=\u001e`mAgi\u001dkkNb;A4m\u001c"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5a
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
