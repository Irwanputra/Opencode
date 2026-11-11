.class public Lcom/trilead/ssh2/crypto/cipher/DESede;
.super Lcom/trilead/ssh2/crypto/cipher/DES;
.source ""


# instance fields
.field private encrypt:Z

.field private key1:[I

.field private key2:[I

.field private key3:[I


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/cipher/DES;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/trilead/ssh2/crypto/cipher/DESede;->key1:[I

    iput-object v0, p0, Lcom/trilead/ssh2/crypto/cipher/DESede;->key2:[I

    iput-object v0, p0, Lcom/trilead/ssh2/crypto/cipher/DESede;->key3:[I

    return-void
.end method


# virtual methods
.method public getAlgorithmName()Ljava/lang/String;
    .registers 2

    const-string v0, "\u00196k@39M0i\u00197=O4k\u001c7=@4mMfkN6>\u001a3gMk"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getBlockSize()I
    .registers 2

    const/16 v0, 0x8

    return v0
.end method

.method public init(Z[B)V
    .registers 5

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/trilead/ssh2/crypto/cipher/DES;->generateWorkingKey(Z[BI)[I

    move-result-object v0

    iput-object v0, p0, Lcom/trilead/ssh2/crypto/cipher/DESede;->key1:[I

    xor-int/lit8 v0, p1, 0x1

    const/16 v1, 0x8

    invoke-virtual {p0, v0, p2, v1}, Lcom/trilead/ssh2/crypto/cipher/DES;->generateWorkingKey(Z[BI)[I

    move-result-object v0

    iput-object v0, p0, Lcom/trilead/ssh2/crypto/cipher/DESede;->key2:[I

    const/16 v0, 0x10

    invoke-virtual {p0, p1, p2, v0}, Lcom/trilead/ssh2/crypto/cipher/DES;->generateWorkingKey(Z[BI)[I

    move-result-object p2

    iput-object p2, p0, Lcom/trilead/ssh2/crypto/cipher/DESede;->key3:[I

    iput-boolean p1, p0, Lcom/trilead/ssh2/crypto/cipher/DESede;->encrypt:Z

    return-void
.end method

.method public reset()V
    .registers 1

    return-void
.end method

.method public transformBlock([BI[BI)V
    .registers 11

    iget-object v1, p0, Lcom/trilead/ssh2/crypto/cipher/DESede;->key1:[I

    if-eqz v1, :cond_34

    iget-boolean v0, p0, Lcom/trilead/ssh2/crypto/cipher/DESede;->encrypt:Z

    if-eqz v0, :cond_1d

    move-object v0, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/trilead/ssh2/crypto/cipher/DES;->desFunc([I[BI[BI)V

    iget-object v1, p0, Lcom/trilead/ssh2/crypto/cipher/DESede;->key2:[I

    move-object v2, p3

    move v3, p4

    invoke-virtual/range {v0 .. v5}, Lcom/trilead/ssh2/crypto/cipher/DES;->desFunc([I[BI[BI)V

    iget-object v1, p0, Lcom/trilead/ssh2/crypto/cipher/DESede;->key3:[I

    invoke-virtual/range {v0 .. v5}, Lcom/trilead/ssh2/crypto/cipher/DES;->desFunc([I[BI[BI)V

    goto :goto_33

    :cond_1d
    iget-object v1, p0, Lcom/trilead/ssh2/crypto/cipher/DESede;->key3:[I

    move-object v0, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/trilead/ssh2/crypto/cipher/DES;->desFunc([I[BI[BI)V

    iget-object v1, p0, Lcom/trilead/ssh2/crypto/cipher/DESede;->key2:[I

    move-object v2, p3

    move v3, p4

    invoke-virtual/range {v0 .. v5}, Lcom/trilead/ssh2/crypto/cipher/DES;->desFunc([I[BI[BI)V

    iget-object v1, p0, Lcom/trilead/ssh2/crypto/cipher/DESede;->key1:[I

    invoke-virtual/range {v0 .. v5}, Lcom/trilead/ssh2/crypto/cipher/DES;->desFunc([I[BI[BI)V

    :goto_33
    return-void

    :cond_34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Hff\u001b3h\u001ag9M7o\u001beoK3mJ7fNcmA7:A`g@4i\u001dj;\u001dekI7<HfkHd;\u001dcfO7jOco@k;NkfH"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
