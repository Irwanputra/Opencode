.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final 〺つふすそ:[B

.field public final げつ〴ぬぐ:[B


# direct methods
.method public constructor <init>()V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x40

    new-array v0, v0, [B

    fill-array-data v0, :array_24

    iput-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->げつ〴ぬぐ:[B

    const/16 v0, 0x80

    new-array v0, v0, [B

    iput-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->〺つふすそ:[B

    const/4 v0, 0x0

    .line 1
    :goto_13
    iget-object v1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->げつ〴ぬぐ:[B

    array-length v2, v1

    if-ge v0, v2, :cond_22

    iget-object v2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->〺つふすそ:[B

    aget-byte v1, v1, v0

    int-to-byte v3, v0

    aput-byte v3, v2, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_13

    :cond_22
    return-void

    nop

    :array_24
    .array-data 1
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
        0x47t
        0x48t
        0x49t
        0x4at
        0x4bt
        0x4ct
        0x4dt
        0x4et
        0x4ft
        0x50t
        0x51t
        0x52t
        0x53t
        0x54t
        0x55t
        0x56t
        0x57t
        0x58t
        0x59t
        0x5at
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
        0x67t
        0x68t
        0x69t
        0x6at
        0x6bt
        0x6ct
        0x6dt
        0x6et
        0x6ft
        0x70t
        0x71t
        0x72t
        0x73t
        0x74t
        0x75t
        0x76t
        0x77t
        0x78t
        0x79t
        0x7at
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x2bt
        0x2ft
    .end array-data
.end method


# virtual methods
.method public 〺つふすそ([BIILjava/io/OutputStream;)I
    .registers 14

    rem-int/lit8 v0, p3, 0x3

    sub-int/2addr p3, v0

    move v1, p2

    :goto_4
    add-int v2, p2, p3

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-ge v1, v2, :cond_4c

    aget-byte v2, p1, v1

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v5, v1, 0x1

    aget-byte v5, p1, v5

    and-int/lit16 v5, v5, 0xff

    add-int/lit8 v6, v1, 0x2

    aget-byte v6, p1, v6

    and-int/lit16 v6, v6, 0xff

    iget-object v7, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->げつ〴ぬぐ:[B

    ushr-int/lit8 v8, v2, 0x2

    and-int/lit8 v8, v8, 0x3f

    aget-byte v7, v7, v8

    invoke-virtual {p4, v7}, Ljava/io/OutputStream;->write(I)V

    iget-object v7, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->げつ〴ぬぐ:[B

    shl-int/2addr v2, v3

    ushr-int/lit8 v3, v5, 0x4

    or-int/2addr v2, v3

    and-int/lit8 v2, v2, 0x3f

    aget-byte v2, v7, v2

    invoke-virtual {p4, v2}, Ljava/io/OutputStream;->write(I)V

    iget-object v2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->げつ〴ぬぐ:[B

    shl-int/lit8 v3, v5, 0x2

    ushr-int/lit8 v4, v6, 0x6

    or-int/2addr v3, v4

    and-int/lit8 v3, v3, 0x3f

    aget-byte v2, v2, v3

    invoke-virtual {p4, v2}, Ljava/io/OutputStream;->write(I)V

    iget-object v2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->げつ〴ぬぐ:[B

    and-int/lit8 v3, v6, 0x3f

    aget-byte v2, v2, v3

    invoke-virtual {p4, v2}, Ljava/io/OutputStream;->write(I)V

    add-int/lit8 v1, v1, 0x3

    goto :goto_4

    :cond_4c
    const/16 p2, 0x3d

    const/4 v1, 0x1

    if-eq v0, v1, :cond_81

    if-eq v0, v4, :cond_54

    goto :goto_a0

    :cond_54
    aget-byte v5, p1, v2

    and-int/lit16 v5, v5, 0xff

    add-int/2addr v2, v1

    aget-byte p1, p1, v2

    and-int/lit16 p1, p1, 0xff

    ushr-int/lit8 v1, v5, 0x2

    and-int/lit8 v1, v1, 0x3f

    shl-int/lit8 v2, v5, 0x4

    ushr-int/lit8 v5, p1, 0x4

    or-int/2addr v2, v5

    and-int/lit8 v2, v2, 0x3f

    shl-int/2addr p1, v4

    and-int/lit8 p1, p1, 0x3f

    iget-object v4, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->げつ〴ぬぐ:[B

    aget-byte v1, v4, v1

    invoke-virtual {p4, v1}, Ljava/io/OutputStream;->write(I)V

    iget-object v1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->げつ〴ぬぐ:[B

    aget-byte v1, v1, v2

    invoke-virtual {p4, v1}, Ljava/io/OutputStream;->write(I)V

    iget-object v1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->げつ〴ぬぐ:[B

    aget-byte p1, v1, p1

    invoke-virtual {p4, p1}, Ljava/io/OutputStream;->write(I)V

    goto :goto_9d

    :cond_81
    aget-byte p1, p1, v2

    and-int/lit16 p1, p1, 0xff

    ushr-int/lit8 v1, p1, 0x2

    and-int/lit8 v1, v1, 0x3f

    shl-int/2addr p1, v3

    and-int/lit8 p1, p1, 0x3f

    iget-object v2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->げつ〴ぬぐ:[B

    aget-byte v1, v2, v1

    invoke-virtual {p4, v1}, Ljava/io/OutputStream;->write(I)V

    iget-object v1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->げつ〴ぬぐ:[B

    aget-byte p1, v1, p1

    invoke-virtual {p4, p1}, Ljava/io/OutputStream;->write(I)V

    invoke-virtual {p4, p2}, Ljava/io/OutputStream;->write(I)V

    :goto_9d
    invoke-virtual {p4, p2}, Ljava/io/OutputStream;->write(I)V

    :goto_a0
    div-int/lit8 p3, p3, 0x3

    mul-int/lit8 p3, p3, 0x4

    if-nez v0, :cond_a7

    const/4 v3, 0x0

    :cond_a7
    add-int/2addr p3, v3

    return p3
.end method

.method public final くし〴〺ぅ(C)Z
    .registers 3

    const/16 v0, 0xa

    if-eq p1, v0, :cond_13

    const/16 v0, 0xd

    if-eq p1, v0, :cond_13

    const/16 v0, 0x9

    if-eq p1, v0, :cond_13

    const/16 v0, 0x20

    if-ne p1, v0, :cond_11

    goto :goto_13

    :cond_11
    const/4 p1, 0x0

    goto :goto_14

    :cond_13
    :goto_13
    const/4 p1, 0x1

    :goto_14
    return p1
.end method

.method public げつ〴ぬぐ([BIILjava/io/OutputStream;)I
    .registers 13

    add-int/2addr p3, p2

    :goto_1
    if-le p3, p2, :cond_11

    add-int/lit8 v0, p3, -0x1

    aget-byte v1, p1, v0

    int-to-char v1, v1

    invoke-virtual {p0, v1}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->くし〴〺ぅ(C)Z

    move-result v1

    if-nez v1, :cond_f

    goto :goto_11

    :cond_f
    move p3, v0

    goto :goto_1

    :cond_11
    :goto_11
    add-int/lit8 v0, p3, -0x4

    invoke-virtual {p0, p1, p2, v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->びぐびあび([BII)I

    move-result p2

    const/4 v1, 0x0

    :goto_18
    const/4 v2, 0x2

    if-ge p2, v0, :cond_63

    iget-object v3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->〺つふすそ:[B

    add-int/lit8 v4, p2, 0x1

    aget-byte p2, p1, p2

    aget-byte p2, v3, p2

    invoke-virtual {p0, p1, v4, v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->びぐびあび([BII)I

    move-result v3

    iget-object v4, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->〺つふすそ:[B

    add-int/lit8 v5, v3, 0x1

    aget-byte v3, p1, v3

    aget-byte v3, v4, v3

    invoke-virtual {p0, p1, v5, v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->びぐびあび([BII)I

    move-result v4

    iget-object v5, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->〺つふすそ:[B

    add-int/lit8 v6, v4, 0x1

    aget-byte v4, p1, v4

    aget-byte v4, v5, v4

    invoke-virtual {p0, p1, v6, v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->びぐびあび([BII)I

    move-result v5

    iget-object v6, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->〺つふすそ:[B

    add-int/lit8 v7, v5, 0x1

    aget-byte v5, p1, v5

    aget-byte v5, v6, v5

    shl-int/2addr p2, v2

    shr-int/lit8 v2, v3, 0x4

    or-int/2addr p2, v2

    invoke-virtual {p4, p2}, Ljava/io/OutputStream;->write(I)V

    shl-int/lit8 p2, v3, 0x4

    shr-int/lit8 v2, v4, 0x2

    or-int/2addr p2, v2

    invoke-virtual {p4, p2}, Ljava/io/OutputStream;->write(I)V

    shl-int/lit8 p2, v4, 0x6

    or-int/2addr p2, v5

    invoke-virtual {p4, p2}, Ljava/io/OutputStream;->write(I)V

    add-int/lit8 v1, v1, 0x3

    invoke-virtual {p0, p1, v7, v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->びぐびあび([BII)I

    move-result p2

    goto :goto_18

    :cond_63
    aget-byte p2, p1, v0

    int-to-char p2, p2

    add-int/lit8 v0, p3, -0x3

    aget-byte v0, p1, v0

    int-to-char v0, v0

    add-int/lit8 v3, p3, -0x2

    aget-byte v3, p1, v3

    int-to-char v3, v3

    const/4 v4, 0x1

    sub-int/2addr p3, v4

    aget-byte p1, p1, p3

    int-to-char p1, p1

    const/16 p3, 0x3d

    if-ne v3, p3, :cond_88

    .line 1
    iget-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->〺つふすそ:[B

    aget-byte p2, p1, p2

    aget-byte p1, p1, v0

    shl-int/2addr p2, v2

    shr-int/lit8 p1, p1, 0x4

    or-int/2addr p1, p2

    invoke-virtual {p4, p1}, Ljava/io/OutputStream;->write(I)V

    const/4 v2, 0x1

    goto :goto_c1

    :cond_88
    if-ne p1, p3, :cond_a1

    iget-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->〺つふすそ:[B

    aget-byte p2, p1, p2

    aget-byte p3, p1, v0

    aget-byte p1, p1, v3

    shl-int/2addr p2, v2

    shr-int/lit8 v0, p3, 0x4

    or-int/2addr p2, v0

    invoke-virtual {p4, p2}, Ljava/io/OutputStream;->write(I)V

    shl-int/lit8 p2, p3, 0x4

    shr-int/2addr p1, v2

    or-int/2addr p1, p2

    invoke-virtual {p4, p1}, Ljava/io/OutputStream;->write(I)V

    goto :goto_c1

    :cond_a1
    iget-object p3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->〺つふすそ:[B

    aget-byte p2, p3, p2

    aget-byte v0, p3, v0

    aget-byte v3, p3, v3

    aget-byte p1, p3, p1

    shl-int/2addr p2, v2

    shr-int/lit8 p3, v0, 0x4

    or-int/2addr p2, p3

    invoke-virtual {p4, p2}, Ljava/io/OutputStream;->write(I)V

    shl-int/lit8 p2, v0, 0x4

    shr-int/lit8 p3, v3, 0x2

    or-int/2addr p2, p3

    invoke-virtual {p4, p2}, Ljava/io/OutputStream;->write(I)V

    shl-int/lit8 p2, v3, 0x6

    or-int/2addr p1, p2

    invoke-virtual {p4, p1}, Ljava/io/OutputStream;->write(I)V

    const/4 v2, 0x3

    :goto_c1
    add-int/2addr v1, v2

    return v1
.end method

.method public final びぐびあび([BII)I
    .registers 5

    :goto_0
    if-ge p2, p3, :cond_e

    aget-byte v0, p1, p2

    int-to-char v0, v0

    invoke-virtual {p0, v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/くし〴〺ぅ;->くし〴〺ぅ(C)Z

    move-result v0

    if-eqz v0, :cond_e

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_e
    return p2
.end method
