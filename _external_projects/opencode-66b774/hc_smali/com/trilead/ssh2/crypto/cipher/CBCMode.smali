.class public Lcom/trilead/ssh2/crypto/cipher/CBCMode;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/trilead/ssh2/crypto/cipher/BlockCipher;


# instance fields
.field public blockSize:I

.field public cbc_vector:[B

.field public doEncrypt:Z

.field public tc:Lcom/trilead/ssh2/crypto/cipher/BlockCipher;

.field public tmp_vector:[B


# direct methods
.method public constructor <init>(Lcom/trilead/ssh2/crypto/cipher/BlockCipher;[BZ)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->tc:Lcom/trilead/ssh2/crypto/cipher/BlockCipher;

    invoke-interface {p1}, Lcom/trilead/ssh2/crypto/cipher/BlockCipher;->getBlockSize()I

    move-result p1

    iput p1, p0, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->blockSize:I

    iput-boolean p3, p0, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->doEncrypt:Z

    array-length p3, p2

    if-ne p1, p3, :cond_1d

    new-array p3, p1, [B

    iput-object p3, p0, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->cbc_vector:[B

    new-array v0, p1, [B

    iput-object v0, p0, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->tmp_vector:[B

    const/4 v0, 0x0

    invoke-static {p2, v0, p3, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    :cond_1d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p3, "Jc:N7h\u001c1gN6:\u001a1gL`kOg9L`=\u001d3gMbjK1"

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    iget v0, p0, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->blockSize:I

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

.method private decryptBlock([BI[BI)V
    .registers 8

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->tmp_vector:[B

    iget v1, p0, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->blockSize:I

    const/4 v2, 0x0

    invoke-static {p1, p2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->tc:Lcom/trilead/ssh2/crypto/cipher/BlockCipher;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/trilead/ssh2/crypto/cipher/BlockCipher;->transformBlock([BI[BI)V

    :goto_d
    iget p1, p0, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->blockSize:I

    if-ge v2, p1, :cond_20

    add-int p1, p4, v2

    aget-byte p2, p3, p1

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->cbc_vector:[B

    aget-byte v0, v0, v2

    xor-int/2addr p2, v0

    int-to-byte p2, p2

    aput-byte p2, p3, p1

    add-int/lit8 v2, v2, 0x1

    goto :goto_d

    :cond_20
    iget-object p1, p0, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->cbc_vector:[B

    iget-object p2, p0, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->tmp_vector:[B

    iput-object p2, p0, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->cbc_vector:[B

    iput-object p1, p0, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->tmp_vector:[B

    return-void
.end method

.method private encryptBlock([BI[BI)V
    .registers 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_2
    iget v2, p0, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->blockSize:I

    if-ge v1, v2, :cond_15

    iget-object v2, p0, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->cbc_vector:[B

    aget-byte v3, v2, v1

    add-int v4, p2, v1

    aget-byte v4, p1, v4

    xor-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_15
    iget-object p1, p0, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->tc:Lcom/trilead/ssh2/crypto/cipher/BlockCipher;

    iget-object p2, p0, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->cbc_vector:[B

    invoke-interface {p1, p2, v0, p3, p4}, Lcom/trilead/ssh2/crypto/cipher/BlockCipher;->transformBlock([BI[BI)V

    iget-object p1, p0, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->cbc_vector:[B

    iget p2, p0, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->blockSize:I

    invoke-static {p3, p4, p1, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method


# virtual methods
.method public getBlockSize()I
    .registers 2

    iget v0, p0, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->blockSize:I

    return v0
.end method

.method public init(Z[B)V
    .registers 3

    return-void
.end method

.method public transformBlock([BI[BI)V
    .registers 6

    iget-boolean v0, p0, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->doEncrypt:Z

    if-eqz v0, :cond_8

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->encryptBlock([BI[BI)V

    goto :goto_b

    :cond_8
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/trilead/ssh2/crypto/cipher/CBCMode;->decryptBlock([BI[BI)V

    :goto_b
    return-void
.end method
