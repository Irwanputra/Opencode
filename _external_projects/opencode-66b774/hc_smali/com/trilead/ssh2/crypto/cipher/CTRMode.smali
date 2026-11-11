.class public Lcom/trilead/ssh2/crypto/cipher/CTRMode;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/trilead/ssh2/crypto/cipher/BlockCipher;


# instance fields
.field public X:[B

.field public Xenc:[B

.field public bc:Lcom/trilead/ssh2/crypto/cipher/BlockCipher;

.field public blockSize:I

.field public count:I

.field public doEncrypt:Z


# direct methods
.method public constructor <init>(Lcom/trilead/ssh2/crypto/cipher/BlockCipher;[BZ)V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/trilead/ssh2/crypto/cipher/CTRMode;->count:I

    iput-object p1, p0, Lcom/trilead/ssh2/crypto/cipher/CTRMode;->bc:Lcom/trilead/ssh2/crypto/cipher/BlockCipher;

    invoke-interface {p1}, Lcom/trilead/ssh2/crypto/cipher/BlockCipher;->getBlockSize()I

    move-result p1

    iput p1, p0, Lcom/trilead/ssh2/crypto/cipher/CTRMode;->blockSize:I

    iput-boolean p3, p0, Lcom/trilead/ssh2/crypto/cipher/CTRMode;->doEncrypt:Z

    array-length p3, p2

    if-ne p1, p3, :cond_1f

    new-array p3, p1, [B

    iput-object p3, p0, Lcom/trilead/ssh2/crypto/cipher/CTRMode;->X:[B

    new-array v1, p1, [B

    iput-object v1, p0, Lcom/trilead/ssh2/crypto/cipher/CTRMode;->Xenc:[B

    invoke-static {p2, v0, p3, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    :cond_1f
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p3, "Jc:N7h\u001c1gN6:\u001a1gL`kOg9L`=\u001d3gMbjK1"

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    iget v0, p0, Lcom/trilead/ssh2/crypto/cipher/CTRMode;->blockSize:I

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\u001c6k\u001akhM3mJffMf<\u001cf>\u001b4hHa;\u001daf\u00194j\u001e7;K`;J3>OcjA`9Keo\u001djhN6nO7f\u001de;N3jO"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p2, p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final getBlockSize()I
    .registers 2

    iget v0, p0, Lcom/trilead/ssh2/crypto/cipher/CTRMode;->blockSize:I

    return v0
.end method

.method public init(Z[B)V
    .registers 3

    return-void
.end method

.method public final transformBlock([BI[BI)V
    .registers 9

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/cipher/CTRMode;->bc:Lcom/trilead/ssh2/crypto/cipher/BlockCipher;

    iget-object v1, p0, Lcom/trilead/ssh2/crypto/cipher/CTRMode;->X:[B

    iget-object v2, p0, Lcom/trilead/ssh2/crypto/cipher/CTRMode;->Xenc:[B

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3, v2, v3}, Lcom/trilead/ssh2/crypto/cipher/BlockCipher;->transformBlock([BI[BI)V

    :goto_a
    iget v0, p0, Lcom/trilead/ssh2/crypto/cipher/CTRMode;->blockSize:I

    if-ge v3, v0, :cond_1f

    add-int v0, p4, v3

    add-int v1, p2, v3

    aget-byte v1, p1, v1

    iget-object v2, p0, Lcom/trilead/ssh2/crypto/cipher/CTRMode;->Xenc:[B

    aget-byte v2, v2, v3

    xor-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, p3, v0

    add-int/lit8 v3, v3, 0x1

    goto :goto_a

    :cond_1f
    add-int/lit8 v0, v0, -0x1

    :goto_21
    if-ltz v0, :cond_34

    iget-object p1, p0, Lcom/trilead/ssh2/crypto/cipher/CTRMode;->X:[B

    aget-byte p2, p1, v0

    add-int/lit8 p2, p2, 0x1

    int-to-byte p2, p2

    aput-byte p2, p1, v0

    aget-byte p1, p1, v0

    if-eqz p1, :cond_31

    goto :goto_34

    :cond_31
    add-int/lit8 v0, v0, -0x1

    goto :goto_21

    :cond_34
    :goto_34
    return-void
.end method
