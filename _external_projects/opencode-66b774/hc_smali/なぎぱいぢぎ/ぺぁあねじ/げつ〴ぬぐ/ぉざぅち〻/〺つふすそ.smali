.class public Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/づざかべべ;


# static fields
.field public static final ぉざぅち〻:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

.field public static final ざとぅぼこ〺:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public 〺つふすそ:I

.field public ぁごぐすすぃ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ;

.field public final いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;

.field public final ぇぬぎばつ:Ljava/security/SecureRandom;

.field public final おぐぴう〸ず:I

.field public くし〴〺ぅ:Lcom/trilead/ssh2/crypto/KeyMaterial;

.field public げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

.field public づざかべべ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;

.field public てぜきぽく:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/びぐびあび;

.field public final なぎぱいぢぎ:Ljava/lang/Object;

.field public のぷのちつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぺふねづ〺;

.field public びぐびあび:[B

.field public final へぬ〴づぞ:Ljava/lang/String;

.field public ぺぁあねじ:Z

.field public ぺふねづ〺:Lcom/trilead/ssh2/crypto/CryptoWishList;


# direct methods
.method public static constructor <clinit>()V
    .registers 4

    const-class v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;

    .line 1
    new-instance v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    invoke-direct {v1, v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;-><init>(Ljava/lang/Class;)V

    .line 2
    sput-object v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->ぉざぅち〻:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    sget-object v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/util/Collection;

    .line 5
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 6
    iget-object v2, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;->〺つふすそ:Ljava/lang/String;

    .line 7
    invoke-virtual {v0, v3, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_14

    .line 8
    :cond_2a
    sput-object v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->ざとぅぼこ〺:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;Lcom/trilead/ssh2/crypto/CryptoWishList;Ljava/lang/String;ILなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぺふねづ〺;Ljava/security/SecureRandom;)V
    .registers 10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->〺つふすそ:I

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->なぎぱいぢぎ:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->ぁごぐすすぃ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ;

    iput-boolean v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->〳ぜぞぜべっ:Z

    iput-boolean v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->ぺぁあねじ:Z

    iput-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;

    iput-object p2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->づざかべべ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;

    iput-object p3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->ぺふねづ〺:Lcom/trilead/ssh2/crypto/CryptoWishList;

    new-instance p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/びぐびあび;

    invoke-direct {p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/びぐびあび;-><init>()V

    iput-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->てぜきぽく:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/びぐびあび;

    iput-object p4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->へぬ〴づぞ:Ljava/lang/String;

    iput p5, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->おぐぴう〸ず:I

    iput-object p6, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->のぷのちつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぺふねづ〺;

    iput-object p7, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->ぇぬぎばつ:Ljava/security/SecureRandom;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Ljava/lang/Throwable;)V
    .registers 3

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->なぎぱいぢぎ:Ljava/lang/Object;

    monitor-enter p1

    const/4 v0, 0x1

    :try_start_4
    iput-boolean v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->〳ぜぞぜべっ:Z

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->なぎぱいぢぎ:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p1

    return-void

    :catchall_d
    move-exception v0

    monitor-exit p1
    :try_end_f
    .catchall {:try_start_4 .. :try_end_f} :catchall_d

    throw v0
.end method

.method public final ぁごぐすすぃ([B[B)Z
    .registers 7

    .line 1
    sget-object v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/util/Collection;

    .line 2
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_59

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;

    .line 3
    iget-object v2, v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;->〺つふすそ:Ljava/lang/String;

    .line 4
    iget-object v3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v3, v3, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object v3, v3, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->くし〴〺ぅ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v1, p2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;->げつ〴ぬぐ([B)Ljava/security/PublicKey;

    move-result-object p2

    invoke-virtual {v1, p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;->〺つふすそ([B)[B

    move-result-object p1

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->なぎぱいぢぎ:[B

    .line 5
    :try_start_2c
    iget-object v2, v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;->くし〴〺ぅ:Ljava/security/Provider;

    if-nez v2, :cond_37

    iget-object v1, v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-static {v1}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v1

    goto :goto_3d

    :cond_37
    iget-object v1, v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-static {v1, v2}, Ljava/security/Signature;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/Signature;

    move-result-object v1

    :goto_3d
    invoke-virtual {v1, p2}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    invoke-virtual {v1, v0}, Ljava/security/Signature;->update([B)V

    invoke-virtual {v1, p1}, Ljava/security/Signature;->verify([B)Z

    move-result p1
    :try_end_47
    .catch Ljava/security/GeneralSecurityException; {:try_start_2c .. :try_end_47} :catch_48

    return p1

    :catch_48
    move-exception p1

    new-instance p2, Ljava/io/IOException;

    const-string v0, "\u001d`<Nb=@c;Okf\u0019eo\u001c1n\u001919@3=\u0019ji\u001e3hM1i\u001e0jJgj\u001dkgN1;\u001bafNk<AbnIb;H7g@7=H"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    .line 6
    :cond_59
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Unknown server host key algorithm \'"

    invoke-static {p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->くし〴〺ぅ:Ljava/lang/String;

    const-string v1, "\'"

    invoke-static {p2, v0, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_72

    :goto_71
    throw p1

    :goto_72
    goto :goto_71
.end method

.method public final くし〴〺ぅ([Ljava/lang/String;[Ljava/lang/String;)Z
    .registers 5

    if-eqz p1, :cond_1e

    if-eqz p2, :cond_1e

    array-length v0, p1

    if-nez v0, :cond_c

    array-length v0, p2

    if-nez v0, :cond_c

    const/4 p1, 0x1

    return p1

    :cond_c
    array-length v0, p1

    const/4 v1, 0x0

    if-eqz v0, :cond_1d

    array-length v0, p2

    if-nez v0, :cond_14

    goto :goto_1d

    :cond_14
    aget-object p1, p1, v1

    aget-object p2, p2, v1

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1d
    :goto_1d
    return v1

    :cond_1e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public declared-synchronized げつ〴ぬぐ([BI)V
    .registers 16

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    const/16 v1, 0x14

    const/4 v2, 0x0

    if-nez v0, :cond_3b

    aget-byte v3, p1, v2

    if-ne v3, v1, :cond_d

    goto :goto_3b

    :cond_d
    new-instance p2, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "KalOgo\u001e1g\u001c`iNal\u001ab>M3:\u0019km\u001ajgIgf@3n\u00194oJgfJ6:\u001cc<\u001akkNclAdnMf:KgiMej\u001d"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-byte p1, p1, v2

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3b
    :goto_3b
    iget-boolean v3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->ぺぁあねじ:Z

    if-eqz v3, :cond_43

    iput-boolean v2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->ぺぁあねじ:Z
    :try_end_41
    .catchall {:try_start_1 .. :try_end_41} :catchall_5ef

    monitor-exit p0

    return-void

    :cond_43
    :try_start_43
    aget-byte v3, p1, v2

    const/16 v4, 0x20

    const/16 v5, 0x21

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-ne v3, v1, :cond_23f

    if-eqz v0, :cond_64

    iget v1, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->びぐびあび:I

    if-nez v1, :cond_54

    goto :goto_64

    :cond_54
    new-instance p1, Ljava/io/IOException;

    const-string p2, "\u001c0;\u0019j<IagAcnMak\u001e3g\u001edkN4k\u001cbg\u0019c9@3kM6>O4>\u001a0:AbmId<@fk\u001a3m\u001e6n\u001a0nNb:\u001ag:Mj>\u001a`g\u001aejKak\u001b4hIfgKc:IklA3<Ic=Mdi\u001cb=\u001baiK4;J3jM3=Kj=\u001eeiJbnIbnM3:\u001bjl\u001d3jM6=\u001bj:N4hN4n\u001a0=\u001d`iKkf\u001b3=\u001b"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_64
    :goto_64
    if-nez v0, :cond_87

    new-instance v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    invoke-direct {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->てぜきぽく:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/びぐびあび;

    iput-object v1, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/びぐびあび;

    new-instance v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;

    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->ぺふねづ〺:Lcom/trilead/ssh2/crypto/CryptoWishList;

    iget-object v3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->ぇぬぎばつ:Ljava/security/SecureRandom;

    invoke-direct {v0, v1, v3}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;-><init>(Lcom/trilead/ssh2/crypto/CryptoWishList;Ljava/security/SecureRandom;)V

    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iput-object v0, v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;

    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;->〺つふすそ()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->のぷのちつ([B)V

    :cond_87
    new-instance v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;

    invoke-direct {v0, p1, v2, p2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;-><init>([BII)V

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iput-object v0, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->〺つふすそ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;

    iget-object p2, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;

    invoke-virtual {p2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;->げつ〴ぬぐ()Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;

    move-result-object p2

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->〺つふすそ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;->げつ〴ぬぐ()Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;

    move-result-object v0

    invoke-virtual {p0, p2, v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->なぎぱいぢぎ(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;)Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    move-result-object p2

    iput-object p2, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object p2, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    if-eqz p2, :cond_22f

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->〺つふすそ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;

    invoke-virtual {p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;->くし〴〺ぅ()Z

    move-result p1

    if-eqz p1, :cond_bc

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-boolean p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->げつ〴ぬぐ:Z

    if-nez p1, :cond_bc

    iput-boolean v7, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->ぺぁあねじ:Z

    :cond_bc
    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->〺つふすそ:Ljava/lang/String;

    const-string p2, "Jbi\u0019f<@`;Idj\u0019b9JkiO0nNe;Kbj\u001c4gO4k\u001b69I6:Hf>\u0019kf\u001a7nJa;\u001a0g\u001a`<I0>\u001b6:M`k\u001c1j\u001bkm\u001ekfI4>N`iJdh\u001c1nL1h@kjJ7<"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/16 p2, 0x1e

    if-nez p1, :cond_192

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->〺つふすそ:Ljava/lang/String;

    const-string v0, "Jbi\u0019f<@`;Idj\u0019b9JkiO0nNe;Kbj\u001c4gO4k\u001b69I6:Hf>\u0019kf\u001a7nJa;\u001a0g\u001a`<I0>\u001b6:ManL6n\u001dblJemL`>\u001eb>O7:I`>\u001bao@joN6g"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_ec

    goto/16 :goto_192

    :cond_ec
    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->〺つふすそ:Ljava/lang/String;

    const-string v0, "Jbi\u0019f<@`;Idj\u0019b9JkiO0nNe;Kbj\u001c4gO4>Ic;\u001a4hLfnK1n@6i\u001d6k\u001be;\u0019ghHdjOjg\u001b"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_129

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->〺つふすそ:Ljava/lang/String;

    const-string v0, "Jbi\u0019f<@`;Idj\u0019b9JkiO0nNe;Kbj\u001c4gO4o\u00193jKj;\u001eekAgiAb;K1o@jnA0jJf<@d:O"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_119

    goto :goto_129

    :cond_119
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "O6<\u0019e;@bf\u001eg=Mji\u001beoHg=\u001b1<\u001db:MjfK3hO7k\u001aeoH`i\u001a3<\u001c7;A7k\u001ddo\u001d6=M1o@4=\u001d"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_129
    :goto_129
    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    new-instance v0, Lcom/trilead/ssh2/crypto/dh/DhExchange;

    const-string v1, "\u001ea>Ad:N6oAf9Nbn@a<Acl\u001dbhA6h\u001c`h\u001a4"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/trilead/ssh2/crypto/dh/DhExchange;-><init>(Ljava/lang/String;)V

    iput-object v0, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->〳ぜぞぜべっ:Lcom/trilead/ssh2/crypto/dh/DhExchange;

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->〺つふすそ:Ljava/lang/String;

    const-string v0, "Jbi\u0019f<@`;Idj\u0019b9JkiO0nNe;Kbj\u001c4gO4>Ic;\u001a4hLfnK1n@6i\u001d6k\u001be;\u0019ghHdjOjg\u001b"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_15c

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->〳ぜぞぜべっ:Lcom/trilead/ssh2/crypto/dh/DhExchange;

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->ぇぬぎばつ:Ljava/security/SecureRandom;

    invoke-virtual {p1, v7, v0}, Lcom/trilead/ssh2/crypto/dh/DhExchange;->init(ILjava/security/SecureRandom;)V

    goto :goto_167

    :cond_15c
    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->〳ぜぞぜべっ:Lcom/trilead/ssh2/crypto/dh/DhExchange;

    const/16 v0, 0xe

    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->ぇぬぎばつ:Ljava/security/SecureRandom;

    invoke-virtual {p1, v0, v1}, Lcom/trilead/ssh2/crypto/dh/DhExchange;->init(ILjava/security/SecureRandom;)V

    :goto_167
    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->〳ぜぞぜべっ:Lcom/trilead/ssh2/crypto/dh/DhExchange;

    invoke-virtual {p1}, Lcom/trilead/ssh2/crypto/dh/DhExchange;->getE()Ljava/math/BigInteger;

    move-result-object p1

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;

    .line 1
    new-instance v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;

    invoke-direct {v1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;-><init>()V

    invoke-virtual {v1, p2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;->びぐびあび(I)V

    invoke-virtual {v1, p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;->なぎぱいぢぎ(Ljava/math/BigInteger;)V

    invoke-virtual {v1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;->げつ〴ぬぐ()[B

    move-result-object p1

    .line 2
    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->のぷのちつ([B)V

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iput v7, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->びぐびあび:I

    iget-object p2, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->〳ぜぞぜべっ:Lcom/trilead/ssh2/crypto/dh/DhExchange;

    invoke-virtual {p2}, Lcom/trilead/ssh2/crypto/dh/DhExchange;->getHashAlgorithm()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->〺つふすそ(Ljava/lang/String;)V
    :try_end_190
    .catchall {:try_start_43 .. :try_end_190} :catchall_5ef

    monitor-exit p0

    return-void

    :cond_192
    :goto_192
    :try_start_192
    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/びぐびあび;

    invoke-virtual {p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ()I

    move-result p1

    const/16 v0, 0x800

    if-nez p1, :cond_1d2

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/びぐびあび;

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;

    const/16 v1, 0x100

    new-array v1, v1, [B

    int-to-byte p2, p2

    aput-byte p2, v1, v2

    const/4 p2, 0x5

    .line 5
    array-length v3, v1

    if-le p2, v3, :cond_1b9

    new-array v3, v5, [B

    .line 6
    array-length v4, v1

    invoke-static {v1, v2, v3, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v1, v3

    :cond_1b9
    int-to-byte v3, v2

    .line 7
    aput-byte v3, v1, v7

    const/4 v3, 0x3

    int-to-byte v4, v2

    aput-byte v4, v1, v6

    const/4 v4, 0x4

    const/16 v5, 0x8

    int-to-byte v5, v5

    aput-byte v5, v1, v3

    int-to-byte v0, v0

    aput-byte v0, v1, v4

    new-array v0, p2, [B

    .line 8
    invoke-static {v1, v2, v0, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 9
    invoke-virtual {p1, v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->のぷのちつ([B)V

    goto :goto_1f9

    :cond_1d2
    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/びぐびあび;

    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p1, 0x400

    const/16 p2, 0x1000

    .line 11
    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;

    .line 12
    new-instance v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;

    invoke-direct {v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;-><init>()V

    const/16 v3, 0x22

    invoke-virtual {v2, v3}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;->びぐびあび(I)V

    invoke-virtual {v2, p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;->ぺぁあねじ(I)V

    invoke-virtual {v2, v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;->ぺぁあねじ(I)V

    invoke-virtual {v2, p2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;->ぺぁあねじ(I)V

    invoke-virtual {v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;->げつ〴ぬぐ()[B

    move-result-object p1

    .line 13
    invoke-virtual {v1, p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->のぷのちつ([B)V

    :goto_1f9
    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iput v7, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->びぐびあび:I

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->〺つふすそ:Ljava/lang/String;

    const-string p2, "Kj=\u001dj>IaoAejL6f\u001acm@3hNeg\u001aak\u001dj;Hb"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_21e

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    const-string p2, "\u001ea>Ad:N6oAf9Nbn@a<Acl\u001dbhA6h\u001c`h\u001a4"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_22a

    :cond_21e
    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    const-string p2, "\u001edn\u001e`g\u00194l\u001aalI0;\u001ebiO4f\u001b3jAd<Ncj\u001d0"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :goto_22a
    invoke-virtual {p1, p2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->〺つふすそ(Ljava/lang/String;)V
    :try_end_22d
    .catchall {:try_start_192 .. :try_end_22d} :catchall_5ef

    monitor-exit p0

    return-void

    :cond_22f
    :try_start_22f
    new-instance p1, Ljava/io/IOException;

    const-string p2, "\u001c`;Nai\u001e`i\u001d4<Neh\u00193lK4:Man\u001dc;\u001bg>Lkl\u001cggJgi\u001aci\u001bgm\u001cjg\u0019ghAbm\u001d1m@f=\u001c0>OkmJ4g\u001dakAc;Odj\u0019fl\u001cfj\u001ccgLkg\u001bef\u001da:"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_23f
    aget-byte v1, p1, v2

    const/16 v3, 0x15

    if-ne v1, v3, :cond_2b8

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->くし〴〺ぅ:Lcom/trilead/ssh2/crypto/KeyMaterial;
    :try_end_247
    .catchall {:try_start_22f .. :try_end_247} :catchall_5ef

    if-eqz p1, :cond_2a8

    :try_start_249
    iget-object p2, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object p2, p2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->づざかべべ:Ljava/lang/String;

    iget-object v0, p1, Lcom/trilead/ssh2/crypto/KeyMaterial;->enc_key_server_to_client:[B

    iget-object p1, p1, Lcom/trilead/ssh2/crypto/KeyMaterial;->initial_iv_server_to_client:[B

    invoke-static {p2, v2, v0, p1}, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->createCipher(Ljava/lang/String;Z[B[B)Lcom/trilead/ssh2/crypto/cipher/BlockCipher;

    move-result-object p1

    new-instance p2, Lcom/trilead/ssh2/crypto/digest/MessageMac;

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->ぁごぐすすぃ:Ljava/lang/String;

    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->くし〴〺ぅ:Lcom/trilead/ssh2/crypto/KeyMaterial;

    iget-object v1, v1, Lcom/trilead/ssh2/crypto/KeyMaterial;->integrity_key_server_to_client:[B

    invoke-direct {p2, v0, v1}, Lcom/trilead/ssh2/crypto/digest/MessageMac;-><init>(Ljava/lang/String;[B)V
    :try_end_264
    .catch Ljava/lang/IllegalArgumentException; {:try_start_249 .. :try_end_264} :catch_298
    .catchall {:try_start_249 .. :try_end_264} :catchall_5ef

    :try_start_264
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;

    invoke-virtual {v0, p1, p2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->げつ〴ぬぐ(Lcom/trilead/ssh2/crypto/cipher/BlockCipher;Lcom/trilead/ssh2/crypto/digest/MAC;)V

    new-instance p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ;

    invoke-direct {p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ;-><init>()V

    iget p2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->〺つふすそ:I

    add-int/2addr p2, v7

    iput p2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->〺つふすそ:I

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object v1, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->〺つふすそ:Ljava/lang/String;

    iput-object v1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Ljava/lang/String;

    iput p2, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:I

    iget-object p2, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->びぐびあび:Ljava/lang/String;

    iput-object p2, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Ljava/lang/String;

    iget-object p2, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->なぎぱいぢぎ:Ljava/lang/String;

    iput-object p2, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Ljava/lang/String;

    iget-object p2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->なぎぱいぢぎ:Ljava/lang/Object;

    monitor-enter p2
    :try_end_288
    .catchall {:try_start_264 .. :try_end_288} :catchall_5ef

    :try_start_288
    iput-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->ぁごぐすすぃ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ;

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->なぎぱいぢぎ:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p2
    :try_end_290
    .catchall {:try_start_288 .. :try_end_290} :catchall_295

    const/4 p1, 0x0

    :try_start_291
    iput-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;
    :try_end_293
    .catchall {:try_start_291 .. :try_end_293} :catchall_5ef

    monitor-exit p0

    return-void

    :catchall_295
    move-exception p1

    :try_start_296
    monitor-exit p2
    :try_end_297
    .catchall {:try_start_296 .. :try_end_297} :catchall_295

    :try_start_297
    throw p1

    :catch_298
    new-instance p1, Ljava/io/IOException;

    const-string p2, "\u001afg\u001ab;Mai\u001ef:@1gKg:O3jLj<@goIc>@0j\u001c`l\u001c0kNbj\u001d39\u00196;AfhNa9@en\u001abi\u001afhK"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2a8
    new-instance p1, Ljava/io/IOException;

    const-string p2, "If9La;I4=@6=J7nNefHf;\u001dbo\u001c7>O7;McoH7kH4lNf>\u001aej\u001be9J`nJ1nAg9\u001c`m\u001a19\u001ed;\u001dk:O0:Nk9Ha>O`:\u0019bjL`l\u001cdo\u001b4fAjoOgf\u001cd=H7gJ1n\u001b7gNegM6f\u001e0<@gk\u001ag=N6"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2b8
    if-eqz v0, :cond_5df

    iget v1, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->びぐびあび:I

    if-eqz v1, :cond_5df

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->〺つふすそ:Ljava/lang/String;

    const-string v1, "Jbi\u0019f<@`;Idj\u0019b9JkiO0nNe;Kbj\u001c4gO4k\u001b69I6:Hf>\u0019kf\u001a7nJa;\u001a0g\u001a`<I0>\u001b6:M`k\u001c1j\u001bkm\u001ekfI4>N`iJdh\u001c1nL1h@kjJ7<"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, -0x1

    const/16 v3, 0x1f

    if-nez v0, :cond_441

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->〺つふすそ:Ljava/lang/String;

    const-string v8, "Jbi\u0019f<@`;Idj\u0019b9JkiO0nNe;Kbj\u001c4gO4k\u001b69I6:Hf>\u0019kf\u001a7nJa;\u001a0g\u001a`<I0>\u001b6:ManL6n\u001dblJemL`>\u001eb>O7:I`>\u001bao@joN6g"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2ed

    goto/16 :goto_441

    :cond_2ed
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->〺つふすそ:Ljava/lang/String;

    const-string v4, "Jbi\u0019f<@`;Idj\u0019b9JkiO0nNe;Kbj\u001c4gO4>Ic;\u001a4hLfnK1n@6i\u001d6k\u001be;\u0019ghHdjOjg\u001b"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_319

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->〺つふすそ:Ljava/lang/String;

    const-string v4, "Jbi\u0019f<@`;Idj\u0019b9JkiO0nNe;Kbj\u001c4gO4o\u00193jKj;\u001eekAgiAb;K1o@jnA0jJf<@d:O"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_40f

    :cond_319
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->びぐびあび:I

    if-ne v0, v7, :cond_40f

    .line 14
    new-array v0, p2, [B

    invoke-static {p1, v2, v0, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;

    invoke-direct {v0, p1, v2, p2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;-><init>([BII)V

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->〺つふすそ()I

    move-result p1

    if-ne p1, v3, :cond_3e3

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->くし〴〺ぅ()[B

    move-result-object v9

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->づざかべべ()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->くし〴〺ぅ()[B

    move-result-object p2

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->いいにぽつ()I

    move-result v0

    if-nez v0, :cond_3d3

    .line 15
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iput-object v9, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->ぁごぐすすぃ:[B

    iget-object v2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->のぷのちつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぺふねづ〺;
    :try_end_347
    .catchall {:try_start_297 .. :try_end_347} :catchall_5ef

    if-eqz v2, :cond_368

    :try_start_349
    iget-object v3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->へぬ〴づぞ:Ljava/lang/String;

    iget v4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->おぐぴう〸ず:I

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->くし〴〺ぅ:Ljava/lang/String;

    check-cast v2, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    invoke-virtual {v2, v3, v4, v0, v9}, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->のぷのちつ(Ljava/lang/String;ILjava/lang/String;[B)Z
    :try_end_356
    .catch Ljava/lang/Exception; {:try_start_349 .. :try_end_356} :catch_357
    .catchall {:try_start_349 .. :try_end_356} :catchall_5ef

    goto :goto_368

    :catch_357
    move-exception p1

    :try_start_358
    new-instance p2, Ljava/io/IOException;

    const-string v0, "\u001e`hJ7gJjgO7k\u00194j\u00194;MfnK3>Obl\u001e4i\u001a`jOjfNjf\u001c0jAk:@cl\u00190n\u001af;Ieo\u001ceiMc<@g=O4fI4lI1jNfh\u0019d9H6;K3n\u001c1<\u001c3fAk=\u001bb;A4<OchH4mO1:M0fL4n\u001e`gHcn\u001caoL0"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_368
    :goto_368
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->〳ぜぞぜべっ:Lcom/trilead/ssh2/crypto/dh/DhExchange;

    invoke-virtual {v0, p1}, Lcom/trilead/ssh2/crypto/dh/DhExchange;->setF(Ljava/math/BigInteger;)V
    :try_end_36f
    .catchall {:try_start_358 .. :try_end_36f} :catchall_5ef

    :try_start_36f
    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v4, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->〳ぜぞぜべっ:Lcom/trilead/ssh2/crypto/dh/DhExchange;

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->づざかべべ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;->げつ〴ぬぐ()[B

    move-result-object v5

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->づざかべべ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;->〺つふすそ()[B

    move-result-object v6

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;->〺つふすそ()[B

    move-result-object v7

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->〺つふすそ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;->〺つふすそ()[B

    move-result-object v8

    invoke-virtual/range {v4 .. v9}, Lcom/trilead/ssh2/crypto/dh/DhExchange;->calculateH([B[B[B[B[B)[B

    move-result-object v0

    iput-object v0, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->なぎぱいぢぎ:[B
    :try_end_395
    .catch Ljava/lang/IllegalArgumentException; {:try_start_36f .. :try_end_395} :catch_3c2
    .catchall {:try_start_36f .. :try_end_395} :catchall_5ef

    :try_start_395
    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->ぁごぐすすぃ:[B

    invoke-virtual {p0, p2, p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->ぁごぐすすぃ([B[B)Z

    move-result p1

    if-eqz p1, :cond_3b2

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object p2, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->〳ぜぞぜべっ:Lcom/trilead/ssh2/crypto/dh/DhExchange;

    invoke-virtual {p2}, Lcom/trilead/ssh2/crypto/dh/DhExchange;->getK()Ljava/math/BigInteger;

    move-result-object p2

    iput-object p2, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->づざかべべ:Ljava/math/BigInteger;

    invoke-virtual {p0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->びぐびあび()V

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iput v1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->びぐびあび:I
    :try_end_3b0
    .catchall {:try_start_395 .. :try_end_3b0} :catchall_5ef

    monitor-exit p0

    return-void

    :cond_3b2
    :try_start_3b2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Of>\u001bdjJch\u001e`m\u001e4=@f;\u001e3;\u001b4gJbf\u00190iM4:\u001dg>A3kHd>LghHc<\u001bklM19M7j\u00196nMblLc;\u001ddfLcm@jiL0fM4nM`=J0o\u001bk<HkjMcg"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_3c2
    move-exception p1

    new-instance p2, Ljava/io/IOException;

    const-string v0, "A0kLcjHbgI3;Hko\u001ce:He=AjmL`:\u001db>H6"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    .line 16
    :cond_3d3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Ifo\u001dbgLdf\u001a6gHcmK4lJ0j\u0019f>NcgMemL3<MalNag\u001b39Aa:\u001ejiM3oKfnMe;Ij>\u001ck=O"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3e3
    new-instance p2, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "M4:\u001dcfMk;N6mLf>H0:\u001b3m\u001e`;Laj\u001aj<M3n\u001c6m\u0019dh\u0019el\u001cjkOkkKdgA7k\u001d0j\u001e4i@fkI4n@khAdm@a:@f<\u00197:\u001cg;@djMc<K4:O3h"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 17
    :cond_40f
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "O6<\u0019e;@bf\u001eg=Mji\u001beoHg=\u001b1<\u001db:MjfK3mNb;Ij=\u001aalJj=KcmM7i\u0019d=\u001ccm\u001ebl\u001a6h\u001d"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->〺つふすそ:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_441
    :goto_441
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->びぐびあび:I

    if-ne v0, v7, :cond_4d9

    .line 18
    new-array v0, p2, [B

    invoke-static {p1, v2, v0, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;

    invoke-direct {v0, p1, v2, p2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;-><init>([BII)V

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->〺つふすそ()I

    move-result p1

    if-ne p1, v3, :cond_4ad

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->づざかべべ()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->づざかべべ()Ljava/math/BigInteger;

    move-result-object p2

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->いいにぽつ()I

    move-result v0

    if-nez v0, :cond_49d

    .line 19
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    new-instance v1, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->げつ〴ぬぐ()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p1, p2}, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;-><init>(Ljava/lang/String;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    iput-object v1, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->ぺぁあねじ:Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->ぺぁあねじ:Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;

    iget-object p2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->ぇぬぎばつ:Ljava/security/SecureRandom;

    invoke-virtual {p1, p2}, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->init(Ljava/security/SecureRandom;)V

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->ぺぁあねじ:Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;

    invoke-virtual {p1}, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->getE()Ljava/math/BigInteger;

    move-result-object p1

    iget-object p2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;

    .line 20
    new-instance v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;

    invoke-direct {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;-><init>()V

    invoke-virtual {v0, v4}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;->びぐびあび(I)V

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;->なぎぱいぢぎ(Ljava/math/BigInteger;)V

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;->げつ〴ぬぐ()[B

    move-result-object p1

    .line 21
    invoke-virtual {p2, p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->のぷのちつ([B)V

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iput v6, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->びぐびあび:I
    :try_end_49b
    .catchall {:try_start_3b2 .. :try_end_49b} :catchall_5ef

    monitor-exit p0

    return-void

    .line 22
    :cond_49d
    :try_start_49d
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Ifo\u001dbgLdf\u001a6gHcmK4lJ0j\u0019f>NcgMemL3hMfnN7i\u0019en\u001ejmO1iIjk@`:\u001d6jJclJ0=\u001aaoAbl@j:Lj=\u001e1nJb:\u001calA4=@b:\u001b1oMcl"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4ad
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "M4:\u001dcfMk;N6mLf>H0:\u001b3m\u001e`;Laj\u001aj<M39Ng>Kcf\u001d49L4;@clK1k\u001b6kHg>\u001bki\u001cdhLag\u0019gn\u001ceoO6l\u001cb>\u0019jiN49\u001ceh\u001eb<Abj\u001a1<"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4d9
    if-ne v0, v6, :cond_5cf

    .line 23
    new-array v0, p2, [B

    invoke-static {p1, v2, v0, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;

    invoke-direct {v0, p1, v2, p2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;-><init>([BII)V

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->〺つふすそ()I

    move-result p1

    if-ne p1, v5, :cond_5a3

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->くし〴〺ぅ()[B

    move-result-object v11

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->づざかべべ()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->くし〴〺ぅ()[B

    move-result-object p2

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->いいにぽつ()I

    move-result v0

    if-nez v0, :cond_593

    .line 24
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iput-object v11, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->ぁごぐすすぃ:[B

    iget-object v2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->のぷのちつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぺふねづ〺;
    :try_end_503
    .catchall {:try_start_49d .. :try_end_503} :catchall_5ef

    if-eqz v2, :cond_524

    :try_start_505
    iget-object v3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->へぬ〴づぞ:Ljava/lang/String;

    iget v4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->おぐぴう〸ず:I

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->くし〴〺ぅ:Ljava/lang/String;

    check-cast v2, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    invoke-virtual {v2, v3, v4, v0, v11}, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->のぷのちつ(Ljava/lang/String;ILjava/lang/String;[B)Z
    :try_end_512
    .catch Ljava/lang/Exception; {:try_start_505 .. :try_end_512} :catch_513
    .catchall {:try_start_505 .. :try_end_512} :catchall_5ef

    goto :goto_524

    :catch_513
    move-exception p1

    :try_start_514
    new-instance p2, Ljava/io/IOException;

    const-string v0, "\u001e`hJ7gJjgO7k\u00194j\u00194;MfnK3>Obl\u001e4i\u001a`jOjfNjf\u001c0jAk:@cl\u00190n\u001af;Ieo\u001ceiMc<@g=O4fI4lI1jNfh\u0019d9H6;K3n\u001c1<\u001c3fAk=\u001bb;A4<OchH4mO1:M0fL4n\u001e`gHcn\u001caoL0"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_524
    :goto_524
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->ぺぁあねじ:Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;

    invoke-virtual {v0, p1}, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->setF(Ljava/math/BigInteger;)V
    :try_end_52b
    .catchall {:try_start_514 .. :try_end_52b} :catchall_5ef

    :try_start_52b
    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v6, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->ぺぁあねじ:Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->づざかべべ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;->げつ〴ぬぐ()[B

    move-result-object v7

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->づざかべべ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;->〺つふすそ()[B

    move-result-object v8

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;->〺つふすそ()[B

    move-result-object v9

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->〺つふすそ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;->〺つふすそ()[B

    move-result-object v10

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v12, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/びぐびあび;

    invoke-virtual/range {v6 .. v12}, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->calculateH([B[B[B[B[BLなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/びぐびあび;)[B

    move-result-object v0

    iput-object v0, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->なぎぱいぢぎ:[B
    :try_end_555
    .catch Ljava/lang/IllegalArgumentException; {:try_start_52b .. :try_end_555} :catch_582
    .catchall {:try_start_52b .. :try_end_555} :catchall_5ef

    :try_start_555
    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->ぁごぐすすぃ:[B

    invoke-virtual {p0, p2, p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->ぁごぐすすぃ([B[B)Z

    move-result p1

    if-eqz p1, :cond_572

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object p2, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->ぺぁあねじ:Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;

    invoke-virtual {p2}, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->getK()Ljava/math/BigInteger;

    move-result-object p2

    iput-object p2, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->づざかべべ:Ljava/math/BigInteger;

    invoke-virtual {p0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->びぐびあび()V

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iput v1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->びぐびあび:I
    :try_end_570
    .catchall {:try_start_555 .. :try_end_570} :catchall_5ef

    monitor-exit p0

    return-void

    :cond_572
    :try_start_572
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Of>\u001bdjJch\u001e`m\u001e4=@f;\u001e3;\u001b4gJbf\u00190iM4:\u001dg>A3kHd>LghHc<\u001bklM19M7j\u00196nMblLc;\u001ddfLcm@jiL0fM4nM`=J0o\u001bk<HkjMcg"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_582
    move-exception p1

    new-instance p2, Ljava/io/IOException;

    const-string v0, "A0kLcjHbgI3;Hko\u001ce:He=AjmL`:\u001db>H6"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    .line 25
    :cond_593
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Ifo\u001dbgLdf\u001a6gHcmK4lJ0j\u0019f>NcgMemL3lAcnI7:\u00197m\u001e3fHb;M7j@6mAekH0k@b<Mgo\u001dd:Kem\u001b39Jf>Lbi\u001bj=La9\u001ce:IfiNd="

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5a3
    new-instance p2, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "M4:\u001dcfMk;N6mLf>H0:\u001b3m\u001e`;Laj\u001aj<M39Ng>Kcf\u001d49L4;@clK1k\u001b6kHg>\u001bki\u001cdhL4>HdiKanMc9L`l@kfLb9\u0019k=Hb<\u001aciL0="

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 26
    :cond_5cf
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "\u001c3=A`oLakH`=L1iOc;\u001b3l\u001c4j@j;\u001ebkIc9\u001agmL7k\u001be>@akO3<\u001d3mAc=Ikj\u001c7g\u001d6g\u001a"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5df
    new-instance p1, Ljava/io/IOException;

    const-string p2, "A1:Lf=\u001eeoA7kI39Akg@`g\u001d7<K7j\u00191oJ4mK4>\u001cj=@j<Og>\u001df;JckJk>@4gKdf@g:O"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_5ef
    .catchall {:try_start_572 .. :try_end_5ef} :catchall_5ef

    :catchall_5ef
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final づざかべべ([Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .registers 10

    if-eqz p1, :cond_29

    if-eqz p2, :cond_29

    array-length v0, p1

    if-nez v0, :cond_9

    const/4 p1, 0x0

    return-object p1

    :cond_9
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_c
    if-ge v2, v0, :cond_23

    aget-object v3, p1, v2

    array-length v4, p2

    const/4 v5, 0x0

    :goto_12
    if-ge v5, v4, :cond_20

    aget-object v6, p2, v5

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1d

    return-object v3

    :cond_1d
    add-int/lit8 v5, v5, 0x1

    goto :goto_12

    :cond_20
    add-int/lit8 v2, v2, 0x1

    goto :goto_c

    :cond_23
    new-instance p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/なぎぱいぢぎ;

    invoke-direct {p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/なぎぱいぢぎ;-><init>()V

    throw p1

    :cond_29
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    goto :goto_30

    :goto_2f
    throw p1

    :goto_30
    goto :goto_2f
.end method

.method public final なぎぱいぢぎ(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;)Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;
    .registers 8

    new-instance v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    invoke-direct {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;-><init>()V

    :try_start_5
    iget-object v1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->〺つふすそ:[Ljava/lang/String;

    iget-object v2, p2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->〺つふすそ:[Ljava/lang/String;

    invoke-virtual {p0, v1, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->づざかべべ([Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->〺つふすそ:Ljava/lang/String;

    sget-object v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->ぉざぅち〻:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "I4f\u001de>Jfm@6kA3=Kfg\u001c0=\u001ebkN4o\u001b3mOe"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->〺つふすそ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x1e

    invoke-virtual {v1, v3, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->げつ〴ぬぐ(ILjava/lang/String;)V

    iget-object v2, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/String;

    iget-object v4, p2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/String;

    invoke-virtual {p0, v2, v4}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->づざかべべ([Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->くし〴〺ぅ:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Lk=\u001b7nKdj\u001a3j@3m\u001dcnL3gHjo\u001ej>N1kLao\u001eafNjiIb;Hd:\u00190k\u001c4j\u001denNglM`:Igm\u0019"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->くし〴〺ぅ:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->げつ〴ぬぐ(ILjava/lang/String;)V

    iget-object v2, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->びぐびあび:[Ljava/lang/String;

    iget-object v4, p2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->びぐびあび:[Ljava/lang/String;

    invoke-virtual {p0, v2, v4}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->づざかべべ([Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->びぐびあび:Ljava/lang/String;

    iget-object v2, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->づざかべべ:[Ljava/lang/String;

    iget-object v4, p2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->づざかべべ:[Ljava/lang/String;

    invoke-virtual {p0, v2, v4}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->づざかべべ([Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->づざかべべ:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "He:N`gIb:A3lA4mHkk@gfHc=K`mL7=\u00193m\u001cdjIelL6kLei\u001a`9\u001eb:\u001ac;\u0019bfNgg\u001ce>\u0019"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->びぐびあび:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->げつ〴ぬぐ(ILjava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MgnLbnO3h@ah\u001c0f\u001bj:\u0019dkIgmMe=\u001e`>OaiLggHkhM3jOfn\u001ac9\u001cf9Lb=L3>I0>\u001c6gI"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->づざかべべ:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->げつ〴ぬぐ(ILjava/lang/String;)V

    iget-object v2, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->なぎぱいぢぎ:[Ljava/lang/String;

    iget-object v4, p2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->なぎぱいぢぎ:[Ljava/lang/String;

    invoke-virtual {p0, v2, v4}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->づざかべべ([Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->なぎぱいぢぎ:Ljava/lang/String;

    iget-object v2, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->ぁごぐすすぃ:[Ljava/lang/String;

    iget-object v4, p2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->ぁごぐすすぃ:[Ljava/lang/String;

    invoke-virtual {p0, v2, v4}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->づざかべべ([Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->ぁごぐすすぃ:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "JglMknM3gKcgJjk@knJaiJd;\u001b4hM3:\u001a3lLei@7<\u001c`:\u001bj<A1i\u001c3=@a=H1fL3iIj9N"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->なぎぱいぢぎ:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->げつ〴ぬぐ(ILjava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u001b4f\u001c1;Aj>\u001afo\u001eaiN3=Lgg@1;@69Lgk\u001cc:N7:\u001dao@ah\u001a7>\u001ben\u001e1=HjmOj;Og>@fl\u001c"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->ぁごぐすすぃ:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->げつ〴ぬぐ(ILjava/lang/String;)V

    iget-object v2, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->〳ぜぞぜべっ:[Ljava/lang/String;

    iget-object v4, p2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->〳ぜぞぜべっ:[Ljava/lang/String;

    invoke-virtual {p0, v2, v4}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->づざかべべ([Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->〳ぜぞぜべっ:Ljava/lang/String;

    iget-object v2, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->ぺぁあねじ:[Ljava/lang/String;

    iget-object v4, p2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->ぺぁあねじ:[Ljava/lang/String;

    invoke-virtual {p0, v2, v4}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->づざかべべ([Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->ぺぁあねじ:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u00191=\u001camK7;\u001c09JfgM6f\u001d`i\u001df=\u001befOko\u001dgi\u001bdhN3:I1iAeoI`gKjnN7gMj=\u001a1iN1m\u001c"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->〳ぜぞぜべっ:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->げつ〴ぬぐ(ILjava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "IaoMgm\u00193nKdnOa:HeoIg=Hdi@aj\u001c`g\u001c69K6m\u0019doKc<LbiK`mOc;\u001c6=\u001eenO0mN4:A"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->ぺぁあねじ:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->げつ〴ぬぐ(ILjava/lang/String;)V
    :try_end_149
    .catch Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/なぎぱいぢぎ; {:try_start_5 .. :try_end_149} :catch_175

    :try_start_149
    iget-object v1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->いいにぽつ:[Ljava/lang/String;

    iget-object v2, p2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->いいにぽつ:[Ljava/lang/String;

    invoke-virtual {p0, v1, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->づざかべべ([Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    :try_end_150
    .catch Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/なぎぱいぢぎ; {:try_start_149 .. :try_end_150} :catch_150

    :catch_150
    :try_start_150
    iget-object v1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->ぺふねづ〺:[Ljava/lang/String;

    iget-object v2, p2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->ぺふねづ〺:[Ljava/lang/String;

    invoke-virtual {p0, v1, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->づざかべべ([Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    :try_end_157
    .catch Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/なぎぱいぢぎ; {:try_start_150 .. :try_end_157} :catch_157

    .line 1
    :catch_157
    iget-object v1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->〺つふすそ:[Ljava/lang/String;

    iget-object v2, p2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->〺つふすそ:[Ljava/lang/String;

    invoke-virtual {p0, v1, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->くし〴〺ぅ([Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_164

    goto :goto_170

    :cond_164
    iget-object p1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/String;

    iget-object p2, p2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->くし〴〺ぅ([Ljava/lang/String;[Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_16f

    goto :goto_170

    :cond_16f
    const/4 v2, 0x1

    :goto_170
    if-eqz v2, :cond_174

    .line 2
    iput-boolean v3, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->げつ〴ぬぐ:Z

    :cond_174
    return-object v0

    :catch_175
    const/4 p1, 0x0

    return-object p1
.end method

.method public final びぐびあび()V
    .registers 12

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->びぐびあび:[B

    if-nez v0, :cond_a

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->なぎぱいぢぎ:[B

    iput-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->びぐびあび:[B

    .line 1
    :cond_a
    :try_start_a
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->なぎぱいぢぎ:Ljava/lang/String;

    invoke-static {v0}, Lcom/trilead/ssh2/crypto/digest/MessageMac;->getKeyLength(Ljava/lang/String;)I

    move-result v7

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->びぐびあび:Ljava/lang/String;

    invoke-static {v0}, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->getKeySize(Ljava/lang/String;)I

    move-result v5

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->びぐびあび:Ljava/lang/String;

    invoke-static {v0}, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->getBlockSize(Ljava/lang/String;)I

    move-result v6

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->ぁごぐすすぃ:Ljava/lang/String;

    invoke-static {v0}, Lcom/trilead/ssh2/crypto/digest/MessageMac;->getKeyLength(Ljava/lang/String;)I

    move-result v10

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->づざかべべ:Ljava/lang/String;

    invoke-static {v0}, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->getKeySize(Ljava/lang/String;)I

    move-result v8

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->づざかべべ:Ljava/lang/String;

    invoke-static {v0}, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->getBlockSize(Ljava/lang/String;)I

    move-result v9

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    .line 2
    iget-object v1, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->ぺふねづ〺:Ljava/lang/String;

    .line 3
    iget-object v2, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->なぎぱいぢぎ:[B

    iget-object v3, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->づざかべべ:Ljava/math/BigInteger;

    iget-object v4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->びぐびあび:[B

    invoke-static/range {v1 .. v10}, Lcom/trilead/ssh2/crypto/KeyMaterial;->create(Ljava/lang/String;[BLjava/math/BigInteger;[BIIIIII)Lcom/trilead/ssh2/crypto/KeyMaterial;

    move-result-object v0

    iput-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->くし〴〺ぅ:Lcom/trilead/ssh2/crypto/KeyMaterial;
    :try_end_56
    .catch Ljava/lang/IllegalArgumentException; {:try_start_a .. :try_end_56} :catch_56

    .line 4
    :catch_56
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;

    const/16 v1, 0x100

    new-array v1, v1, [B

    const/16 v2, 0x15

    int-to-byte v2, v2

    const/4 v3, 0x0

    aput-byte v2, v1, v3

    const/4 v2, 0x1

    new-array v4, v2, [B

    .line 5
    invoke-static {v1, v3, v4, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 6
    invoke-virtual {v0, v4}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->のぷのちつ([B)V

    :try_start_6b
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->びぐびあび:Ljava/lang/String;

    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->くし〴〺ぅ:Lcom/trilead/ssh2/crypto/KeyMaterial;

    iget-object v4, v1, Lcom/trilead/ssh2/crypto/KeyMaterial;->enc_key_client_to_server:[B

    iget-object v1, v1, Lcom/trilead/ssh2/crypto/KeyMaterial;->initial_iv_client_to_server:[B

    invoke-static {v0, v2, v4, v1}, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->createCipher(Ljava/lang/String;Z[B[B)Lcom/trilead/ssh2/crypto/cipher/BlockCipher;

    move-result-object v0

    new-instance v1, Lcom/trilead/ssh2/crypto/digest/MessageMac;

    iget-object v4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iget-object v4, v4, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;

    iget-object v4, v4, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぁごぐすすぃ;->なぎぱいぢぎ:Ljava/lang/String;

    iget-object v5, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->くし〴〺ぅ:Lcom/trilead/ssh2/crypto/KeyMaterial;

    iget-object v5, v5, Lcom/trilead/ssh2/crypto/KeyMaterial;->integrity_key_client_to_server:[B

    invoke-direct {v1, v4, v5}, Lcom/trilead/ssh2/crypto/digest/MessageMac;-><init>(Ljava/lang/String;[B)V
    :try_end_8a
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6b .. :try_end_8a} :catch_c3

    iget-object v4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;

    .line 7
    iget-object v4, v4, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;

    .line 8
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v5, v0, Lcom/trilead/ssh2/crypto/cipher/NullCipher;

    if-nez v5, :cond_97

    iput-boolean v2, v4, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->づざかべべ:Z

    :cond_97
    iget-object v2, v4, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->びぐびあび:Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;

    invoke-virtual {v2, v0}, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->changeCipher(Lcom/trilead/ssh2/crypto/cipher/BlockCipher;)V

    iput-object v1, v4, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->なぎぱいぢぎ:Lcom/trilead/ssh2/crypto/digest/MAC;

    invoke-virtual {v1}, Lcom/trilead/ssh2/crypto/digest/MessageMac;->size()I

    move-result v1

    new-array v1, v1, [B

    iput-object v1, v4, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->ぁごぐすすぃ:[B

    invoke-interface {v0}, Lcom/trilead/ssh2/crypto/cipher/BlockCipher;->getBlockSize()I

    move-result v0

    iput v0, v4, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->〳ぜぞぜべっ:I

    const/16 v1, 0x8

    if-ge v0, v1, :cond_b2

    iput v1, v4, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->〳ぜぞぜべっ:I

    .line 9
    :cond_b2
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;

    .line 10
    iget-object v1, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぁごぐすすぃ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_b7
    iput-boolean v3, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->〳ぜぞぜべっ:Z

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぁごぐすすぃ:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v1

    return-void

    :catchall_c0
    move-exception v0

    monitor-exit v1
    :try_end_c2
    .catchall {:try_start_b7 .. :try_end_c2} :catchall_c0

    throw v0

    .line 11
    :catch_c3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "\u001afg\u001ab;Mai\u001ef:@1gKg:O3jLj<@goIc>@0j\u001c`l\u001c0kNbj\u001d39\u00196;AfhNa9@en\u001abi\u001afhK"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
