.class public Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final ざとぅぼこ〺:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;


# instance fields
.field public 〳ぜぞぜべっ:I

.field public 〺つふすそ:I

.field public ぁごぐすすぃ:[B

.field public いいにぽつ:[B

.field public final ぇぬぎばつ:[B

.field public final ぉざぅち〻:Ljava/security/SecureRandom;

.field public final おぐぴう〸ず:[B

.field public くし〴〺ぅ:Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;

.field public げつ〴ぬぐ:I

.field public づざかべべ:Z

.field public てぜきぽく:I

.field public なぎぱいぢぎ:Lcom/trilead/ssh2/crypto/digest/MAC;

.field public final のぷのちつ:[B

.field public びぐびあび:Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;

.field public final へぬ〴づぞ:[B

.field public ぺぁあねじ:Lcom/trilead/ssh2/crypto/digest/MAC;

.field public ぺふねづ〺:[B


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    const-class v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;

    .line 1
    new-instance v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    invoke-direct {v1, v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;-><init>(Ljava/lang/Class;)V

    .line 2
    sput-object v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->ざとぅぼこ〺:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Ljava/io/OutputStream;Ljava/security/SecureRandom;)V
    .registers 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->げつ〴ぬぐ:I

    iput v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->〺つふすそ:I

    iput-boolean v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->づざかべべ:Z

    const/16 v0, 0x8

    iput v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->〳ぜぞぜべっ:I

    iput v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->てぜきぽく:I

    const/16 v0, 0x100

    new-array v1, v0, [B

    iput-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->のぷのちつ:[B

    const/4 v1, 0x5

    new-array v2, v1, [B

    iput-object v2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->へぬ〴づぞ:[B

    new-array v0, v0, [B

    iput-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->おぐぴう〸ず:[B

    new-array v0, v1, [B

    iput-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->ぇぬぎばつ:[B

    new-instance v0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;

    new-instance v1, Lcom/trilead/ssh2/crypto/cipher/NullCipher;

    invoke-direct {v1}, Lcom/trilead/ssh2/crypto/cipher/NullCipher;-><init>()V

    invoke-direct {v0, v1, p1}, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;-><init>(Lcom/trilead/ssh2/crypto/cipher/BlockCipher;Ljava/io/InputStream;)V

    iput-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->くし〴〺ぅ:Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;

    new-instance p1, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;

    new-instance v0, Lcom/trilead/ssh2/crypto/cipher/NullCipher;

    invoke-direct {v0}, Lcom/trilead/ssh2/crypto/cipher/NullCipher;-><init>()V

    invoke-direct {p1, v0, p2}, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;-><init>(Lcom/trilead/ssh2/crypto/cipher/BlockCipher;Ljava/io/OutputStream;)V

    iput-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->びぐびあび:Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;

    iput-object p3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->ぉざぅち〻:Ljava/security/SecureRandom;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ([B)V
    .registers 12

    array-length v0, p1

    add-int/lit8 v1, v0, 0x5

    const/4 v2, 0x4

    add-int v3, v2, v1

    .line 1
    iget v4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->〳ぜぞぜべっ:I

    rem-int v5, v3, v4

    if-eqz v5, :cond_e

    sub-int/2addr v4, v5

    add-int/2addr v3, v4

    :cond_e
    const/16 v4, 0x10

    if-ge v3, v4, :cond_14

    const/16 v3, 0x10

    :cond_14
    sub-int v1, v3, v1

    iget-boolean v4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->づざかべべ:Z

    const/4 v5, 0x0

    if-eqz v4, :cond_41

    const/4 v4, 0x0

    :goto_1c
    if-ge v4, v1, :cond_4b

    iget-object v6, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->ぉざぅち〻:Ljava/security/SecureRandom;

    invoke-virtual {v6}, Ljava/security/SecureRandom;->nextInt()I

    move-result v6

    iget-object v7, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->のぷのちつ:[B

    int-to-byte v8, v6

    aput-byte v8, v7, v4

    add-int/lit8 v8, v4, 0x1

    shr-int/lit8 v9, v6, 0x8

    int-to-byte v9, v9

    aput-byte v9, v7, v8

    add-int/lit8 v8, v4, 0x2

    shr-int/lit8 v9, v6, 0x10

    int-to-byte v9, v9

    aput-byte v9, v7, v8

    add-int/lit8 v8, v4, 0x3

    shr-int/lit8 v6, v6, 0x18

    int-to-byte v6, v6

    aput-byte v6, v7, v8

    add-int/lit8 v4, v4, 0x4

    goto :goto_1c

    :cond_41
    const/4 v4, 0x0

    :goto_42
    if-ge v4, v1, :cond_4b

    iget-object v6, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->のぷのちつ:[B

    aput-byte v5, v6, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_42

    :cond_4b
    iget-object v4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->へぬ〴づぞ:[B

    sub-int/2addr v3, v2

    shr-int/lit8 v6, v3, 0x18

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    shr-int/lit8 v6, v3, 0x10

    int-to-byte v6, v6

    const/4 v7, 0x1

    aput-byte v6, v4, v7

    shr-int/lit8 v6, v3, 0x8

    int-to-byte v6, v6

    const/4 v8, 0x2

    aput-byte v6, v4, v8

    int-to-byte v3, v3

    const/4 v6, 0x3

    aput-byte v3, v4, v6

    int-to-byte v3, v1

    aput-byte v3, v4, v2

    iget-object v2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->びぐびあび:Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;

    const/4 v3, 0x5

    invoke-virtual {v2, v4, v5, v3}, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->write([BII)V

    iget-object v2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->びぐびあび:Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;

    invoke-virtual {v2, p1, v5, v0}, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->write([BII)V

    iget-object v2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->びぐびあび:Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;

    iget-object v4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->のぷのちつ:[B

    invoke-virtual {v2, v4, v5, v1}, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->write([BII)V

    iget-object v2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->なぎぱいぢぎ:Lcom/trilead/ssh2/crypto/digest/MAC;

    if-eqz v2, :cond_a3

    iget v4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->げつ〴ぬぐ:I

    invoke-virtual {v2, v4}, Lcom/trilead/ssh2/crypto/digest/MAC;->initMac(I)V

    iget-object v2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->なぎぱいぢぎ:Lcom/trilead/ssh2/crypto/digest/MAC;

    iget-object v4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->へぬ〴づぞ:[B

    invoke-virtual {v2, v4, v5, v3}, Lcom/trilead/ssh2/crypto/digest/MAC;->update([BII)V

    iget-object v2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->なぎぱいぢぎ:Lcom/trilead/ssh2/crypto/digest/MAC;

    invoke-virtual {v2, p1, v5, v0}, Lcom/trilead/ssh2/crypto/digest/MAC;->update([BII)V

    iget-object v2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->なぎぱいぢぎ:Lcom/trilead/ssh2/crypto/digest/MAC;

    iget-object v3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->のぷのちつ:[B

    invoke-virtual {v2, v3, v5, v1}, Lcom/trilead/ssh2/crypto/digest/MAC;->update([BII)V

    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->なぎぱいぢぎ:Lcom/trilead/ssh2/crypto/digest/MAC;

    iget-object v2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->ぁごぐすすぃ:[B

    invoke-virtual {v1, v2, v5}, Lcom/trilead/ssh2/crypto/digest/MAC;->getMac([BI)V

    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->びぐびあび:Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;

    iget-object v2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->ぁごぐすすぃ:[B

    array-length v3, v2

    invoke-virtual {v1, v2, v5, v3}, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->writePlain([BII)V

    :cond_a3
    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->びぐびあび:Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;

    invoke-virtual {v1}, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->flush()V

    sget-object v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->ざとぅぼこ〺:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v2, 0x5a

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u001aeoKjiMb=Ie:LffJ1lJfoJco@an\u001a7l\u001e6"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-byte p1, p1, v5

    and-int/lit16 p1, p1, 0xff

    invoke-static {p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/〺つふすそ;->げつ〴ぬぐ(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "J1jHgf\u001bck\u001d1fN0gM0:\u001bklO0<A3iNd>@6"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->げつ〴ぬぐ(ILjava/lang/String;)V

    iget p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->げつ〴ぬぐ:I

    add-int/2addr p1, v7

    iput p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->げつ〴ぬぐ:I

    return-void
.end method
