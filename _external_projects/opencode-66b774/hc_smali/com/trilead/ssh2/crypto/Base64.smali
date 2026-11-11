.class public Lcom/trilead/ssh2/crypto/Base64;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final alphabet:[C


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const-string v0, "N7mAjm\u001ea>\u001e6fAb<MfkM69M19Idl\u001b79MfhKeiNj>Kk:\u001c7=Nd;\u00194f\u00193:N`=\u001a`n@jmM4nK`<OdmK`9\u001cjm\u001d6jKg;M1:H7mH6kJfgN3o\u001e0:\u001c7gK4h\u001abn\u001aejA1lLfnA1j@6n\u001bkmM4oO3<Ab9@0nA1g\u001ddkKjnHf:\u001ac:M4>K"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lcom/trilead/ssh2/crypto/Base64;->alphabet:[C

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static decode([C)[B
    .registers 13

    const/4 v0, 0x4

    new-array v1, v0, [B

    array-length v2, p0

    new-array v2, v2, [B

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_a
    array-length v7, p0

    if-ge v4, v7, :cond_104

    aget-char v7, p0, v4

    const/16 v8, 0xa

    if-eq v7, v8, :cond_100

    const/16 v8, 0xd

    if-eq v7, v8, :cond_100

    const/16 v8, 0x20

    if-eq v7, v8, :cond_100

    const/16 v8, 0x9

    if-ne v7, v8, :cond_21

    goto/16 :goto_100

    :cond_21
    const/16 v8, 0x41

    const/16 v9, 0x40

    const/16 v10, 0x3f

    if-lt v7, v8, :cond_36

    const/16 v8, 0x5a

    if-gt v7, v8, :cond_36

    add-int/lit8 v8, v5, 0x1

    add-int/lit8 v7, v7, -0x41

    int-to-byte v7, v7

    aput-byte v7, v1, v5

    :goto_34
    move v5, v8

    goto :goto_78

    :cond_36
    const/16 v8, 0x61

    if-lt v7, v8, :cond_48

    const/16 v8, 0x7a

    if-gt v7, v8, :cond_48

    add-int/lit8 v8, v5, 0x1

    add-int/lit8 v7, v7, -0x61

    add-int/lit8 v7, v7, 0x1a

    int-to-byte v7, v7

    aput-byte v7, v1, v5

    goto :goto_34

    :cond_48
    const/16 v8, 0x30

    if-lt v7, v8, :cond_5a

    const/16 v8, 0x39

    if-gt v7, v8, :cond_5a

    add-int/lit8 v8, v5, 0x1

    add-int/lit8 v7, v7, -0x30

    add-int/lit8 v7, v7, 0x34

    int-to-byte v7, v7

    aput-byte v7, v1, v5

    goto :goto_34

    :cond_5a
    const/16 v8, 0x2b

    if-ne v7, v8, :cond_66

    add-int/lit8 v7, v5, 0x1

    const/16 v8, 0x3e

    aput-byte v8, v1, v5

    :goto_64
    move v5, v7

    goto :goto_78

    :cond_66
    const/16 v8, 0x2f

    if-ne v7, v8, :cond_6f

    add-int/lit8 v7, v5, 0x1

    aput-byte v10, v1, v5

    goto :goto_64

    :cond_6f
    const/16 v8, 0x3d

    if-ne v7, v8, :cond_f0

    add-int/lit8 v7, v5, 0x1

    aput-byte v9, v1, v5

    goto :goto_64

    :goto_78
    if-ne v5, v0, :cond_100

    aget-byte v5, v1, v3

    if-ne v5, v9, :cond_80

    goto/16 :goto_104

    :cond_80
    const/4 v5, 0x1

    aget-byte v7, v1, v5

    if-eq v7, v9, :cond_e8

    const/4 v7, 0x2

    aget-byte v8, v1, v7

    if-ne v8, v9, :cond_9b

    aget-byte p0, v1, v3

    and-int/2addr p0, v10

    shl-int/lit8 p0, p0, 0x6

    aget-byte v1, v1, v5

    and-int/2addr v1, v10

    or-int/2addr p0, v1

    add-int/lit8 v1, v6, 0x1

    shr-int/2addr p0, v0

    int-to-byte p0, p0

    aput-byte p0, v2, v6

    move v6, v1

    goto :goto_104

    :cond_9b
    const/4 v8, 0x3

    aget-byte v11, v1, v8

    if-ne v11, v9, :cond_bd

    aget-byte p0, v1, v3

    and-int/2addr p0, v10

    shl-int/lit8 p0, p0, 0xc

    aget-byte v0, v1, v5

    and-int/2addr v0, v10

    shl-int/lit8 v0, v0, 0x6

    or-int/2addr p0, v0

    aget-byte v0, v1, v7

    and-int/2addr v0, v10

    or-int/2addr p0, v0

    add-int/lit8 v0, v6, 0x1

    shr-int/lit8 v1, p0, 0xa

    int-to-byte v1, v1

    aput-byte v1, v2, v6

    add-int/lit8 v6, v0, 0x1

    shr-int/2addr p0, v7

    int-to-byte p0, p0

    aput-byte p0, v2, v0

    goto :goto_104

    :cond_bd
    aget-byte v9, v1, v3

    and-int/2addr v9, v10

    shl-int/lit8 v9, v9, 0x12

    aget-byte v5, v1, v5

    and-int/2addr v5, v10

    shl-int/lit8 v5, v5, 0xc

    or-int/2addr v5, v9

    aget-byte v7, v1, v7

    and-int/2addr v7, v10

    shl-int/lit8 v7, v7, 0x6

    or-int/2addr v5, v7

    aget-byte v7, v1, v8

    and-int/2addr v7, v10

    or-int/2addr v5, v7

    add-int/lit8 v7, v6, 0x1

    shr-int/lit8 v8, v5, 0x10

    int-to-byte v8, v8

    aput-byte v8, v2, v6

    add-int/lit8 v6, v7, 0x1

    shr-int/lit8 v8, v5, 0x8

    int-to-byte v8, v8

    aput-byte v8, v2, v7

    add-int/lit8 v7, v6, 0x1

    int-to-byte v5, v5

    aput-byte v5, v2, v6

    move v6, v7

    const/4 v5, 0x0

    goto :goto_100

    :cond_e8
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Unexpected \'=\' in base64 code."

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_f0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "J`n\u001cdl\u001a1fI7;Kan\u0019khM4f\u001d3jA4mH69\u00193l\u001ee=M1;\u00190iM7m\u001c4kL3k\u001b4;\u001a`:@6lNjjM"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_100
    :goto_100
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_a

    :cond_104
    :goto_104
    new-array p0, v6, [B

    invoke-static {v2, v3, p0, v3, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p0
.end method

.method public static encode([B)[C
    .registers 9

    new-instance v0, Ljava/io/CharArrayWriter;

    array-length v1, p0

    mul-int/lit8 v1, v1, 0x4

    const/4 v2, 0x3

    div-int/2addr v1, v2

    invoke-direct {v0, v1}, Ljava/io/CharArrayWriter;-><init>(I)V

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_e
    array-length v6, p0

    const/4 v7, 0x1

    if-ge v3, v6, :cond_53

    if-nez v4, :cond_1b

    aget-byte v5, p0, v3

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x10

    goto :goto_29

    :cond_1b
    if-ne v4, v7, :cond_24

    aget-byte v6, p0, v3

    and-int/lit16 v6, v6, 0xff

    shl-int/lit8 v6, v6, 0x8

    goto :goto_28

    :cond_24
    aget-byte v6, p0, v3

    and-int/lit16 v6, v6, 0xff

    :goto_28
    or-int/2addr v5, v6

    :goto_29
    add-int/lit8 v4, v4, 0x1

    if-ne v4, v2, :cond_50

    sget-object v4, Lcom/trilead/ssh2/crypto/Base64;->alphabet:[C

    shr-int/lit8 v6, v5, 0x12

    aget-char v6, v4, v6

    invoke-virtual {v0, v6}, Ljava/io/CharArrayWriter;->write(I)V

    shr-int/lit8 v6, v5, 0xc

    and-int/lit8 v6, v6, 0x3f

    aget-char v6, v4, v6

    invoke-virtual {v0, v6}, Ljava/io/CharArrayWriter;->write(I)V

    shr-int/lit8 v6, v5, 0x6

    and-int/lit8 v6, v6, 0x3f

    aget-char v6, v4, v6

    invoke-virtual {v0, v6}, Ljava/io/CharArrayWriter;->write(I)V

    and-int/lit8 v6, v5, 0x3f

    aget-char v4, v4, v6

    invoke-virtual {v0, v4}, Ljava/io/CharArrayWriter;->write(I)V

    const/4 v4, 0x0

    :cond_50
    add-int/lit8 v3, v3, 0x1

    goto :goto_e

    :cond_53
    const/16 p0, 0x3d

    if-ne v4, v7, :cond_6f

    sget-object v1, Lcom/trilead/ssh2/crypto/Base64;->alphabet:[C

    shr-int/lit8 v2, v5, 0x12

    aget-char v2, v1, v2

    invoke-virtual {v0, v2}, Ljava/io/CharArrayWriter;->write(I)V

    shr-int/lit8 v2, v5, 0xc

    and-int/lit8 v2, v2, 0x3f

    aget-char v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/io/CharArrayWriter;->write(I)V

    invoke-virtual {v0, p0}, Ljava/io/CharArrayWriter;->write(I)V

    invoke-virtual {v0, p0}, Ljava/io/CharArrayWriter;->write(I)V

    :cond_6f
    const/4 v1, 0x2

    if-ne v4, v1, :cond_90

    sget-object v1, Lcom/trilead/ssh2/crypto/Base64;->alphabet:[C

    shr-int/lit8 v2, v5, 0x12

    aget-char v2, v1, v2

    invoke-virtual {v0, v2}, Ljava/io/CharArrayWriter;->write(I)V

    shr-int/lit8 v2, v5, 0xc

    and-int/lit8 v2, v2, 0x3f

    aget-char v2, v1, v2

    invoke-virtual {v0, v2}, Ljava/io/CharArrayWriter;->write(I)V

    shr-int/lit8 v2, v5, 0x6

    and-int/lit8 v2, v2, 0x3f

    aget-char v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/io/CharArrayWriter;->write(I)V

    invoke-virtual {v0, p0}, Ljava/io/CharArrayWriter;->write(I)V

    :cond_90
    invoke-virtual {v0}, Ljava/io/CharArrayWriter;->toCharArray()[C

    move-result-object p0

    return-object p0
.end method
