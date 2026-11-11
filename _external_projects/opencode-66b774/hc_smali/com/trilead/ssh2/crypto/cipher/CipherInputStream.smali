.class public Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final BUFF_SIZE:I

.field public bi:Ljava/io/InputStream;

.field public blockSize:I

.field public buffer:[B

.field public currentCipher:Lcom/trilead/ssh2/crypto/cipher/BlockCipher;

.field public enc:[B

.field public input_buffer:[B

.field public input_buffer_pos:I

.field public input_buffer_size:I

.field public pos:I


# direct methods
.method public constructor <init>(Lcom/trilead/ssh2/crypto/cipher/BlockCipher;Ljava/io/InputStream;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x800

    iput v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->BUFF_SIZE:I

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->input_buffer:[B

    const/4 v0, 0x0

    iput v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->input_buffer_pos:I

    iput v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->input_buffer_size:I

    iput-object p2, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->bi:Ljava/io/InputStream;

    invoke-virtual {p0, p1}, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->changeCipher(Lcom/trilead/ssh2/crypto/cipher/BlockCipher;)V

    return-void
.end method

.method private fill_buffer()I
    .registers 5

    const/4 v0, 0x0

    iput v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->input_buffer_pos:I

    iget-object v1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->bi:Ljava/io/InputStream;

    iget-object v2, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->input_buffer:[B

    const/16 v3, 0x800

    invoke-virtual {v1, v2, v0, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    iput v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->input_buffer_size:I

    return v0
.end method

.method private getBlock()V
    .registers 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_2
    iget v2, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->blockSize:I

    if-ge v1, v2, :cond_21

    iget-object v3, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->enc:[B

    sub-int/2addr v2, v1

    invoke-direct {p0, v3, v1, v2}, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->internal_read([BII)I

    move-result v2

    if-ltz v2, :cond_11

    add-int/2addr v1, v2

    goto :goto_2

    :cond_11
    new-instance v0, Ljava/io/IOException;

    const-string v1, "OakLgkOg<\u001c`hN3<@blH6f\u001a4=\u001bdnM7:\u001e1>\u001cdo\u001a0=\u001c3iA7>Je>\u001e1oAc=IdiAgoAf:NfhN1f\u001b7;J0;Ie;Kao\u001dgf@j=\u001c1f\u0019knJ4g"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_21
    :try_start_21
    iget-object v1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->currentCipher:Lcom/trilead/ssh2/crypto/cipher/BlockCipher;

    iget-object v2, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->enc:[B

    iget-object v3, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->buffer:[B

    invoke-interface {v1, v2, v0, v3, v0}, Lcom/trilead/ssh2/crypto/cipher/BlockCipher;->transformBlock([BI[BI)V
    :try_end_2a
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_2a} :catch_2d

    iput v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->pos:I

    return-void

    :catch_2d
    new-instance v0, Ljava/io/IOException;

    const-string v1, "\u001adm\u00196>K6kJkgKdiI`mKeo\u001ck;H3gJ`j\u001b4fJ3>\u001d39\u001c3f\u0019jfHan\u001dki\u001ejkOfl@6nIjiM"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_3e

    :goto_3d
    throw v0

    :goto_3e
    goto :goto_3d
.end method

.method private internal_read([BII)I
    .registers 7

    iget v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->input_buffer_size:I

    const/4 v1, -0x1

    if-gez v0, :cond_6

    return v1

    :cond_6
    iget v2, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->input_buffer_pos:I

    if-lt v2, v0, :cond_11

    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->fill_buffer()I

    move-result v0

    if-gtz v0, :cond_11

    return v1

    :cond_11
    iget v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->input_buffer_size:I

    iget v1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->input_buffer_pos:I

    sub-int/2addr v0, v1

    if-le p3, v0, :cond_19

    move p3, v0

    :cond_19
    iget-object v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->input_buffer:[B

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->input_buffer_pos:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->input_buffer_pos:I

    return p3
.end method


# virtual methods
.method public changeCipher(Lcom/trilead/ssh2/crypto/cipher/BlockCipher;)V
    .registers 3

    iput-object p1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->currentCipher:Lcom/trilead/ssh2/crypto/cipher/BlockCipher;

    invoke-interface {p1}, Lcom/trilead/ssh2/crypto/cipher/BlockCipher;->getBlockSize()I

    move-result p1

    iput p1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->blockSize:I

    new-array v0, p1, [B

    iput-object v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->buffer:[B

    new-array v0, p1, [B

    iput-object v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->enc:[B

    iput p1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->pos:I

    return-void
.end method

.method public read()I
    .registers 4

    iget v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->pos:I

    iget v1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->blockSize:I

    if-lt v0, v1, :cond_9

    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->getBlock()V

    :cond_9
    iget-object v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->buffer:[B

    iget v1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->pos:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->pos:I

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public read([B)I
    .registers 4

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->read([BII)I

    move-result p1

    return p1
.end method

.method public read([BII)I
    .registers 8

    const/4 v0, 0x0

    :goto_1
    if-lez p3, :cond_25

    iget v1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->pos:I

    iget v2, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->blockSize:I

    if-lt v1, v2, :cond_c

    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->getBlock()V

    :cond_c
    iget v1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->blockSize:I

    iget v2, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->pos:I

    sub-int/2addr v1, v2

    invoke-static {v1, p3}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget-object v2, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->buffer:[B

    iget v3, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->pos:I

    invoke-static {v2, v3, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v2, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->pos:I

    add-int/2addr v2, v1

    iput v2, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->pos:I

    add-int/2addr p2, v1

    sub-int/2addr p3, v1

    add-int/2addr v0, v1

    goto :goto_1

    :cond_25
    return v0
.end method

.method public readPlain([BII)I
    .registers 7

    iget v0, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->pos:I

    iget v1, p0, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->blockSize:I

    if-ne v0, v1, :cond_26

    const/4 v0, 0x0

    :goto_7
    if-ge v0, p3, :cond_25

    add-int v1, p2, v0

    sub-int v2, p3, v0

    invoke-direct {p0, p1, v1, v2}, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->internal_read([BII)I

    move-result v1

    if-ltz v1, :cond_15

    add-int/2addr v0, v1

    goto :goto_7

    :cond_15
    new-instance p1, Ljava/io/IOException;

    const-string p2, "\u001b7k\u001d6hIbh\u0019dnL`oJjl\u001efjIalK4=Jk:L0hOfj@k;\u001efgA7gHjjMg:Kk<K6>O0fHb9Mdi\u001cf;M7>L3>Oa>\u001d4jO`kKb>Me<\u001d3hIgk"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_25
    return v0

    :cond_26
    new-instance p1, Ljava/io/IOException;

    const-string p2, "M1j@gfA`>K3o@j=I0g\u001c4<\u0019a9\u001e3k\u001cbmMfiNenH`gH`:\u001c3jL7m\u001ek>Kgn@c:Jbl\u001cfo@6hIf=\u001e4g\u001d69N6o@fj@j=\u001a7g\u0019gk@4;Af9He9Afn\u001ajf\u001d1o\u001dbo\u001bghIflLaj\u001beoL0g\u001ed"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_37

    :goto_36
    throw p1

    :goto_37
    goto :goto_36
.end method
