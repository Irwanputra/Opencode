.class public Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final BUFF_SIZE:I

.field public blockSize:I

.field public bo:Ljava/io/OutputStream;

.field public buffer:[B

.field public currentCipher:Lcom/trilead/ssh2/crypto/cipher/BlockCipher;

.field public enc:[B

.field public out_buffer:[B

.field public out_buffer_pos:I

.field public pos:I


# direct methods
.method public constructor <init>(Lcom/trilead/ssh2/crypto/cipher/BlockCipher;Ljava/io/OutputStream;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x800

    iput v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->BUFF_SIZE:I

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->out_buffer:[B

    const/4 v0, 0x0

    iput v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->out_buffer_pos:I

    iput-object p2, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->bo:Ljava/io/OutputStream;

    invoke-virtual {p0, p1}, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->changeCipher(Lcom/trilead/ssh2/crypto/cipher/BlockCipher;)V

    return-void
.end method

.method private internal_write(I)V
    .registers 5

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->out_buffer:[B

    iget v1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->out_buffer_pos:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->out_buffer_pos:I

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    const/16 p1, 0x800

    if-lt v2, p1, :cond_17

    iget-object v1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->bo:Ljava/io/OutputStream;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2, p1}, Ljava/io/OutputStream;->write([BII)V

    iput v2, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->out_buffer_pos:I

    :cond_17
    return-void
.end method

.method private internal_write([BII)V
    .registers 8

    :cond_0
    :goto_0
    if-lez p3, :cond_25

    iget v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->out_buffer_pos:I

    rsub-int v1, v0, 0x800

    if-le p3, v1, :cond_9

    goto :goto_a

    :cond_9
    move v1, p3

    :goto_a
    iget-object v2, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->out_buffer:[B

    invoke-static {p1, p2, v2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p2, v1

    iget v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->out_buffer_pos:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->out_buffer_pos:I

    sub-int/2addr p3, v1

    const/16 v1, 0x800

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->bo:Ljava/io/OutputStream;

    iget-object v2, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->out_buffer:[B

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, Ljava/io/OutputStream;->write([BII)V

    iput v3, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->out_buffer_pos:I

    goto :goto_0

    :cond_25
    return-void
.end method

.method private writeBlock()V
    .registers 5

    :try_start_0
    iget-object v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->currentCipher:Lcom/trilead/ssh2/crypto/cipher/BlockCipher;

    iget-object v1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->buffer:[B

    iget-object v2, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->enc:[B

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3, v2, v3}, Lcom/trilead/ssh2/crypto/cipher/BlockCipher;->transformBlock([BI[BI)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_a} :catch_14

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->enc:[B

    iget v1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->blockSize:I

    invoke-direct {p0, v0, v3, v1}, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->internal_write([BII)V

    iput v3, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->pos:I

    return-void

    :catch_14
    move-exception v0

    new-instance v1, Ljava/io/IOException;

    const-string v2, "\u001adm\u00196>K6kJkgKdiI`mKeo\u001ck;H3gJ`j\u001b4fJ3>\u001d39\u001c3f\u0019jfHan\u001dki\u001ejkOfl@6nIjiM"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/io/IOException;

    throw v0
.end method


# virtual methods
.method public changeCipher(Lcom/trilead/ssh2/crypto/cipher/BlockCipher;)V
    .registers 3

    iput-object p1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->currentCipher:Lcom/trilead/ssh2/crypto/cipher/BlockCipher;

    invoke-interface {p1}, Lcom/trilead/ssh2/crypto/cipher/BlockCipher;->getBlockSize()I

    move-result p1

    iput p1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->blockSize:I

    new-array v0, p1, [B

    iput-object v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->buffer:[B

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->enc:[B

    const/4 p1, 0x0

    iput p1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->pos:I

    return-void
.end method

.method public flush()V
    .registers 5

    iget v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->pos:I

    if-nez v0, :cond_18

    iget v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->out_buffer_pos:I

    if-lez v0, :cond_12

    iget-object v1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->bo:Ljava/io/OutputStream;

    iget-object v2, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->out_buffer:[B

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Ljava/io/OutputStream;->write([BII)V

    iput v3, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->out_buffer_pos:I

    :cond_12
    iget-object v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->bo:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void

    :cond_18
    new-instance v0, Ljava/io/IOException;

    const-string v1, "\u001bcg\u001af>M7=\u001dehM3gO0o\u001bf9\u001e6<Ka=\u001abiJ4o\u001b6k\u001bg9Nkk\u001d4nHkf\u001bdfM1l\u001d6lH6<\u001d1iObfO6=JjkK7mM`hA4n\u001e4fMji@d:\u001cei\u001d7nAao@7j\u0019jl@1n\u001e4n@79Kf=\u001bf;AbiK7f\u001ec"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public write(I)V
    .registers 5

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->buffer:[B

    iget v1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->pos:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->pos:I

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    iget p1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->blockSize:I

    if-lt v2, p1, :cond_12

    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->writeBlock()V

    :cond_12
    return-void
.end method

.method public write([BII)V
    .registers 7

    :cond_0
    :goto_0
    if-lez p3, :cond_21

    iget v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->blockSize:I

    iget v1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->pos:I

    sub-int/2addr v0, v1

    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->buffer:[B

    iget v2, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->pos:I

    invoke-static {p1, p2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->pos:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->pos:I

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    iget v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->blockSize:I

    if-lt v1, v0, :cond_0

    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->writeBlock()V

    goto :goto_0

    :cond_21
    return-void
.end method

.method public writePlain(I)V
    .registers 3

    iget v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->pos:I

    if-nez v0, :cond_8

    invoke-direct {p0, p1}, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->internal_write(I)V

    return-void

    :cond_8
    new-instance p1, Ljava/io/IOException;

    const-string v0, "OgjKjl\u001cc<@3jO3:IckA0k\u001ejfAgmI4gO0>\u0019koMkg\u001dji\u001a6l\u001db=IaiOc<Abi\u001cch\u0019j9O7k\u001d4:Jj9\u001bjk\u001ddi\u001ec:@0:\u001ckfHgh@7=Ob:\u001d`<\u00191mN4lHfh\u001edk\u0019kh\u001e`n@7oAcf\u001d3>@e"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public writePlain([BII)V
    .registers 5

    iget v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->pos:I

    if-nez v0, :cond_8

    invoke-direct {p0, p1, p2, p3}, Lcom/trilead/ssh2/crypto/cipher/CipherOutputStream;->internal_write([BII)V

    return-void

    :cond_8
    new-instance p1, Ljava/io/IOException;

    const-string p2, "OgjKjl\u001cc<@3jO3:IckA0k\u001ejfAgmI4gO0>\u0019koMkg\u001dji\u001a6l\u001db=IaiOc<Abi\u001cch\u0019j9O7k\u001d4:Jj9\u001bjk\u001ddi\u001ec:@0:\u001ckfHgh@7=Ob:\u001d`<\u00191mN4lHfh\u001edk\u0019kh\u001e`n@7oAcf\u001d3>@e"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
