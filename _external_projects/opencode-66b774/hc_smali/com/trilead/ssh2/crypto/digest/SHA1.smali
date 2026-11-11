.class public final Lcom/trilead/ssh2/crypto/digest/SHA1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/trilead/ssh2/crypto/digest/Digest;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private H0:I

.field private H1:I

.field private H2:I

.field private H3:I

.field private H4:I

.field private currentLen:J

.field private currentPos:I

.field private final w:[I


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x50

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->w:[I

    invoke-virtual {p0}, Lcom/trilead/ssh2/crypto/digest/SHA1;->reset()V

    return-void
.end method

.method private final perform()V
    .registers 20

    move-object/from16 v0, p0

    const/16 v2, 0x10

    :goto_4
    const/16 v3, 0x50

    if-ge v2, v3, :cond_27

    iget-object v3, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->w:[I

    add-int/lit8 v4, v2, -0x3

    aget v4, v3, v4

    add-int/lit8 v5, v2, -0x8

    aget v5, v3, v5

    xor-int/2addr v4, v5

    add-int/lit8 v5, v2, -0xe

    aget v5, v3, v5

    xor-int/2addr v4, v5

    add-int/lit8 v5, v2, -0x10

    aget v5, v3, v5

    xor-int/2addr v4, v5

    shl-int/lit8 v5, v4, 0x1

    ushr-int/lit8 v4, v4, 0x1f

    or-int/2addr v4, v5

    aput v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_27
    iget v2, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->H0:I

    iget v3, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->H1:I

    iget v5, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->H2:I

    iget v6, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->H3:I

    iget v7, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->H4:I

    shl-int/lit8 v8, v2, 0x5

    ushr-int/lit8 v9, v2, 0x1b

    or-int/2addr v8, v9

    and-int v9, v3, v5

    xor-int/lit8 v10, v3, -0x1

    and-int/2addr v10, v6

    or-int/2addr v9, v10

    add-int/2addr v8, v9

    iget-object v9, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->w:[I

    const/4 v10, 0x0

    aget v10, v9, v10

    const v11, 0x5a827999

    invoke-static {v8, v10, v11, v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v8

    shl-int/lit8 v10, v3, 0x1e

    ushr-int/lit8 v12, v3, 0x2

    or-int/2addr v10, v12

    shl-int/lit8 v12, v8, 0x5

    ushr-int/lit8 v13, v8, 0x1b

    or-int/2addr v12, v13

    and-int v13, v2, v10

    xor-int/lit8 v14, v2, -0x1

    and-int/2addr v14, v5

    or-int/2addr v13, v14

    add-int/2addr v12, v13

    const/4 v13, 0x1

    aget v13, v9, v13

    invoke-static {v12, v13, v11, v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v12

    shl-int/lit8 v13, v2, 0x1e

    ushr-int/lit8 v14, v2, 0x2

    or-int/2addr v13, v14

    shl-int/lit8 v14, v12, 0x5

    ushr-int/lit8 v15, v12, 0x1b

    or-int/2addr v14, v15

    and-int v15, v8, v13

    xor-int/lit8 v16, v8, -0x1

    and-int v16, v16, v10

    or-int v15, v15, v16

    add-int/2addr v14, v15

    const/4 v15, 0x2

    aget v4, v9, v15

    invoke-static {v14, v4, v11, v5}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v4

    shl-int/lit8 v14, v8, 0x1e

    ushr-int/2addr v8, v15

    or-int/2addr v8, v14

    shl-int/lit8 v14, v4, 0x5

    ushr-int/lit8 v17, v4, 0x1b

    or-int v14, v14, v17

    and-int v17, v12, v8

    xor-int/lit8 v18, v12, -0x1

    and-int v18, v18, v13

    or-int v17, v17, v18

    add-int v14, v14, v17

    const/16 v17, 0x3

    aget v1, v9, v17

    invoke-static {v14, v1, v11, v10}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v1

    shl-int/lit8 v10, v12, 0x1e

    ushr-int/2addr v12, v15

    or-int/2addr v10, v12

    shl-int/lit8 v12, v1, 0x5

    ushr-int/lit8 v14, v1, 0x1b

    or-int/2addr v12, v14

    and-int v14, v4, v10

    xor-int/lit8 v17, v4, -0x1

    and-int v17, v17, v8

    or-int v14, v14, v17

    add-int/2addr v12, v14

    const/4 v14, 0x4

    aget v14, v9, v14

    invoke-static {v12, v14, v11, v13}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v12

    shl-int/lit8 v13, v4, 0x1e

    ushr-int/2addr v4, v15

    or-int/2addr v4, v13

    shl-int/lit8 v13, v12, 0x5

    ushr-int/lit8 v14, v12, 0x1b

    or-int/2addr v13, v14

    and-int v14, v1, v4

    xor-int/lit8 v17, v1, -0x1

    and-int v17, v17, v10

    or-int v14, v14, v17

    add-int/2addr v13, v14

    const/4 v14, 0x5

    aget v14, v9, v14

    invoke-static {v13, v14, v11, v8}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v8

    shl-int/lit8 v13, v1, 0x1e

    ushr-int/lit8 v1, v1, 0x2

    or-int/2addr v1, v13

    shl-int/lit8 v13, v8, 0x5

    ushr-int/lit8 v14, v8, 0x1b

    or-int/2addr v13, v14

    and-int v14, v12, v1

    xor-int/lit8 v17, v12, -0x1

    and-int v17, v17, v4

    or-int v14, v14, v17

    add-int/2addr v13, v14

    const/4 v14, 0x6

    aget v14, v9, v14

    invoke-static {v13, v14, v11, v10}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v10

    shl-int/lit8 v13, v12, 0x1e

    ushr-int/2addr v12, v15

    or-int/2addr v12, v13

    shl-int/lit8 v13, v10, 0x5

    ushr-int/lit8 v14, v10, 0x1b

    or-int/2addr v13, v14

    and-int v14, v8, v12

    xor-int/lit8 v17, v8, -0x1

    and-int v17, v17, v1

    or-int v14, v14, v17

    add-int/2addr v13, v14

    const/4 v14, 0x7

    aget v14, v9, v14

    invoke-static {v13, v14, v11, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v4

    shl-int/lit8 v13, v8, 0x1e

    ushr-int/2addr v8, v15

    or-int/2addr v8, v13

    shl-int/lit8 v13, v4, 0x5

    ushr-int/lit8 v14, v4, 0x1b

    or-int/2addr v13, v14

    and-int v14, v10, v8

    xor-int/lit8 v17, v10, -0x1

    and-int v17, v17, v12

    or-int v14, v14, v17

    add-int/2addr v13, v14

    const/16 v14, 0x8

    aget v14, v9, v14

    invoke-static {v13, v14, v11, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v1

    shl-int/lit8 v13, v10, 0x1e

    ushr-int/lit8 v10, v10, 0x2

    or-int/2addr v10, v13

    shl-int/lit8 v13, v1, 0x5

    ushr-int/lit8 v14, v1, 0x1b

    or-int/2addr v13, v14

    and-int v14, v4, v10

    xor-int/lit8 v17, v4, -0x1

    and-int v17, v17, v8

    or-int v14, v14, v17

    add-int/2addr v13, v14

    const/16 v14, 0x9

    aget v14, v9, v14

    invoke-static {v13, v14, v11, v12}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v12

    shl-int/lit8 v13, v4, 0x1e

    ushr-int/2addr v4, v15

    or-int/2addr v4, v13

    shl-int/lit8 v13, v12, 0x5

    ushr-int/lit8 v14, v12, 0x1b

    or-int/2addr v13, v14

    and-int v14, v1, v4

    xor-int/lit8 v17, v1, -0x1

    and-int v17, v17, v10

    or-int v14, v14, v17

    add-int/2addr v13, v14

    const/16 v14, 0xa

    aget v14, v9, v14

    invoke-static {v13, v14, v11, v8}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v8

    shl-int/lit8 v13, v1, 0x1e

    ushr-int/2addr v1, v15

    or-int/2addr v1, v13

    shl-int/lit8 v13, v8, 0x5

    ushr-int/lit8 v14, v8, 0x1b

    or-int/2addr v13, v14

    and-int v14, v12, v1

    xor-int/lit8 v17, v12, -0x1

    and-int v17, v17, v4

    or-int v14, v14, v17

    add-int/2addr v13, v14

    const/16 v14, 0xb

    aget v14, v9, v14

    invoke-static {v13, v14, v11, v10}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v10

    shl-int/lit8 v13, v12, 0x1e

    ushr-int/lit8 v12, v12, 0x2

    or-int/2addr v12, v13

    shl-int/lit8 v13, v10, 0x5

    ushr-int/lit8 v14, v10, 0x1b

    or-int/2addr v13, v14

    and-int v14, v8, v12

    xor-int/lit8 v17, v8, -0x1

    and-int v17, v17, v1

    or-int v14, v14, v17

    add-int/2addr v13, v14

    const/16 v14, 0xc

    aget v14, v9, v14

    invoke-static {v13, v14, v11, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v4

    shl-int/lit8 v13, v8, 0x1e

    ushr-int/2addr v8, v15

    or-int/2addr v8, v13

    shl-int/lit8 v13, v4, 0x5

    ushr-int/lit8 v14, v4, 0x1b

    or-int/2addr v13, v14

    and-int v14, v10, v8

    xor-int/lit8 v17, v10, -0x1

    and-int v17, v17, v12

    or-int v14, v14, v17

    add-int/2addr v13, v14

    const/16 v14, 0xd

    aget v14, v9, v14

    invoke-static {v13, v14, v11, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v1

    shl-int/lit8 v13, v10, 0x1e

    ushr-int/2addr v10, v15

    or-int/2addr v10, v13

    shl-int/lit8 v13, v1, 0x5

    ushr-int/lit8 v14, v1, 0x1b

    or-int/2addr v13, v14

    and-int v14, v4, v10

    xor-int/lit8 v17, v4, -0x1

    and-int v17, v17, v8

    or-int v14, v14, v17

    add-int/2addr v13, v14

    const/16 v14, 0xe

    aget v14, v9, v14

    invoke-static {v13, v14, v11, v12}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v12

    shl-int/lit8 v13, v4, 0x1e

    ushr-int/lit8 v4, v4, 0x2

    or-int/2addr v4, v13

    shl-int/lit8 v13, v12, 0x5

    ushr-int/lit8 v14, v12, 0x1b

    or-int/2addr v13, v14

    and-int v14, v1, v4

    xor-int/lit8 v17, v1, -0x1

    and-int v17, v17, v10

    or-int v14, v14, v17

    add-int/2addr v13, v14

    const/16 v14, 0xf

    aget v14, v9, v14

    invoke-static {v13, v14, v11, v8}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v8

    shl-int/lit8 v13, v1, 0x1e

    ushr-int/2addr v1, v15

    or-int/2addr v1, v13

    shl-int/lit8 v13, v8, 0x5

    ushr-int/lit8 v14, v8, 0x1b

    or-int/2addr v13, v14

    and-int v14, v12, v1

    xor-int/lit8 v17, v12, -0x1

    and-int v17, v17, v4

    or-int v14, v14, v17

    add-int/2addr v13, v14

    const/16 v14, 0x10

    aget v14, v9, v14

    invoke-static {v13, v14, v11, v10}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v10

    shl-int/lit8 v13, v12, 0x1e

    ushr-int/lit8 v12, v12, 0x2

    or-int/2addr v12, v13

    shl-int/lit8 v13, v10, 0x5

    ushr-int/lit8 v14, v10, 0x1b

    or-int/2addr v13, v14

    and-int v14, v8, v12

    xor-int/lit8 v17, v8, -0x1

    and-int v17, v17, v1

    or-int v14, v14, v17

    add-int/2addr v13, v14

    const/16 v14, 0x11

    aget v14, v9, v14

    invoke-static {v13, v14, v11, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v4

    shl-int/lit8 v13, v8, 0x1e

    ushr-int/lit8 v8, v8, 0x2

    or-int/2addr v8, v13

    shl-int/lit8 v13, v4, 0x5

    ushr-int/lit8 v14, v4, 0x1b

    or-int/2addr v13, v14

    and-int v14, v10, v8

    xor-int/lit8 v17, v10, -0x1

    and-int v17, v17, v12

    or-int v14, v14, v17

    add-int/2addr v13, v14

    const/16 v14, 0x12

    aget v14, v9, v14

    invoke-static {v13, v14, v11, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v1

    shl-int/lit8 v13, v10, 0x1e

    ushr-int/2addr v10, v15

    or-int/2addr v10, v13

    shl-int/lit8 v13, v1, 0x5

    ushr-int/lit8 v14, v1, 0x1b

    or-int/2addr v13, v14

    and-int v14, v4, v10

    xor-int/lit8 v17, v4, -0x1

    and-int v17, v17, v8

    or-int v14, v14, v17

    add-int/2addr v13, v14

    const/16 v14, 0x13

    aget v14, v9, v14

    invoke-static {v13, v14, v11, v12}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v11

    shl-int/lit8 v12, v4, 0x1e

    ushr-int/lit8 v4, v4, 0x2

    or-int/2addr v4, v12

    shl-int/lit8 v12, v11, 0x5

    ushr-int/lit8 v13, v11, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v1, v4

    xor-int/2addr v13, v10

    add-int/2addr v12, v13

    const/16 v13, 0x14

    aget v13, v9, v13

    const v14, 0x6ed9eba1

    invoke-static {v12, v13, v14, v8}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v8

    shl-int/lit8 v12, v1, 0x1e

    ushr-int/2addr v1, v15

    or-int/2addr v1, v12

    shl-int/lit8 v12, v8, 0x5

    ushr-int/lit8 v13, v8, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v11, v1

    xor-int/2addr v13, v4

    add-int/2addr v12, v13

    const/16 v13, 0x15

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v10}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v10

    shl-int/lit8 v12, v11, 0x1e

    ushr-int/2addr v11, v15

    or-int/2addr v11, v12

    shl-int/lit8 v12, v10, 0x5

    ushr-int/lit8 v13, v10, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v8, v11

    xor-int/2addr v13, v1

    add-int/2addr v12, v13

    const/16 v13, 0x16

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v4

    shl-int/lit8 v12, v8, 0x1e

    ushr-int/2addr v8, v15

    or-int/2addr v8, v12

    shl-int/lit8 v12, v4, 0x5

    ushr-int/lit8 v13, v4, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v10, v8

    xor-int/2addr v13, v11

    add-int/2addr v12, v13

    const/16 v13, 0x17

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v1

    shl-int/lit8 v12, v10, 0x1e

    ushr-int/2addr v10, v15

    or-int/2addr v10, v12

    shl-int/lit8 v12, v1, 0x5

    ushr-int/lit8 v13, v1, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v4, v10

    xor-int/2addr v13, v8

    add-int/2addr v12, v13

    const/16 v13, 0x18

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v11

    shl-int/lit8 v12, v4, 0x1e

    ushr-int/2addr v4, v15

    or-int/2addr v4, v12

    shl-int/lit8 v12, v11, 0x5

    ushr-int/lit8 v13, v11, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v1, v4

    xor-int/2addr v13, v10

    add-int/2addr v12, v13

    const/16 v13, 0x19

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v8}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v8

    shl-int/lit8 v12, v1, 0x1e

    ushr-int/2addr v1, v15

    or-int/2addr v1, v12

    shl-int/lit8 v12, v8, 0x5

    ushr-int/lit8 v13, v8, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v11, v1

    xor-int/2addr v13, v4

    add-int/2addr v12, v13

    const/16 v13, 0x1a

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v10}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v10

    shl-int/lit8 v12, v11, 0x1e

    ushr-int/2addr v11, v15

    or-int/2addr v11, v12

    shl-int/lit8 v12, v10, 0x5

    ushr-int/lit8 v13, v10, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v8, v11

    xor-int/2addr v13, v1

    add-int/2addr v12, v13

    const/16 v13, 0x1b

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v4

    shl-int/lit8 v12, v8, 0x1e

    ushr-int/2addr v8, v15

    or-int/2addr v8, v12

    shl-int/lit8 v12, v4, 0x5

    ushr-int/lit8 v13, v4, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v10, v8

    xor-int/2addr v13, v11

    add-int/2addr v12, v13

    const/16 v13, 0x1c

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v1

    shl-int/lit8 v12, v10, 0x1e

    ushr-int/2addr v10, v15

    or-int/2addr v10, v12

    shl-int/lit8 v12, v1, 0x5

    ushr-int/lit8 v13, v1, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v4, v10

    xor-int/2addr v13, v8

    add-int/2addr v12, v13

    const/16 v13, 0x1d

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v11

    shl-int/lit8 v12, v4, 0x1e

    ushr-int/2addr v4, v15

    or-int/2addr v4, v12

    shl-int/lit8 v12, v11, 0x5

    ushr-int/lit8 v13, v11, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v1, v4

    xor-int/2addr v13, v10

    add-int/2addr v12, v13

    const/16 v13, 0x1e

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v8}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v8

    shl-int/lit8 v12, v1, 0x1e

    ushr-int/2addr v1, v15

    or-int/2addr v1, v12

    shl-int/lit8 v12, v8, 0x5

    ushr-int/lit8 v13, v8, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v11, v1

    xor-int/2addr v13, v4

    add-int/2addr v12, v13

    const/16 v13, 0x1f

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v10}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v10

    shl-int/lit8 v12, v11, 0x1e

    ushr-int/lit8 v11, v11, 0x2

    or-int/2addr v11, v12

    shl-int/lit8 v12, v10, 0x5

    ushr-int/lit8 v13, v10, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v8, v11

    xor-int/2addr v13, v1

    add-int/2addr v12, v13

    const/16 v13, 0x20

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v4

    shl-int/lit8 v12, v8, 0x1e

    ushr-int/lit8 v8, v8, 0x2

    or-int/2addr v8, v12

    shl-int/lit8 v12, v4, 0x5

    ushr-int/lit8 v13, v4, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v10, v8

    xor-int/2addr v13, v11

    add-int/2addr v12, v13

    const/16 v13, 0x21

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v1

    shl-int/lit8 v12, v10, 0x1e

    ushr-int/2addr v10, v15

    or-int/2addr v10, v12

    shl-int/lit8 v12, v1, 0x5

    ushr-int/lit8 v13, v1, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v4, v10

    xor-int/2addr v13, v8

    add-int/2addr v12, v13

    const/16 v13, 0x22

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v11

    shl-int/lit8 v12, v4, 0x1e

    ushr-int/2addr v4, v15

    or-int/2addr v4, v12

    shl-int/lit8 v12, v11, 0x5

    ushr-int/lit8 v13, v11, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v1, v4

    xor-int/2addr v13, v10

    add-int/2addr v12, v13

    const/16 v13, 0x23

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v8}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v8

    shl-int/lit8 v12, v1, 0x1e

    ushr-int/2addr v1, v15

    or-int/2addr v1, v12

    shl-int/lit8 v12, v8, 0x5

    ushr-int/lit8 v13, v8, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v11, v1

    xor-int/2addr v13, v4

    add-int/2addr v12, v13

    const/16 v13, 0x24

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v10}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v10

    shl-int/lit8 v12, v11, 0x1e

    ushr-int/2addr v11, v15

    or-int/2addr v11, v12

    shl-int/lit8 v12, v10, 0x5

    ushr-int/lit8 v13, v10, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v8, v11

    xor-int/2addr v13, v1

    add-int/2addr v12, v13

    const/16 v13, 0x25

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v4

    shl-int/lit8 v12, v8, 0x1e

    ushr-int/2addr v8, v15

    or-int/2addr v8, v12

    shl-int/lit8 v12, v4, 0x5

    ushr-int/lit8 v13, v4, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v10, v8

    xor-int/2addr v13, v11

    add-int/2addr v12, v13

    const/16 v13, 0x26

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v1

    shl-int/lit8 v12, v10, 0x1e

    ushr-int/2addr v10, v15

    or-int/2addr v10, v12

    shl-int/lit8 v12, v1, 0x5

    ushr-int/lit8 v13, v1, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v4, v10

    xor-int/2addr v13, v8

    add-int/2addr v12, v13

    const/16 v13, 0x27

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v11

    shl-int/lit8 v12, v4, 0x1e

    ushr-int/2addr v4, v15

    or-int/2addr v4, v12

    shl-int/lit8 v12, v11, 0x5

    ushr-int/lit8 v13, v11, 0x1b

    or-int/2addr v12, v13

    and-int v13, v1, v4

    and-int v14, v1, v10

    or-int/2addr v13, v14

    and-int v14, v4, v10

    or-int/2addr v13, v14

    add-int/2addr v12, v13

    const/16 v13, 0x28

    aget v13, v9, v13

    const v14, -0x70e44324

    invoke-static {v12, v13, v14, v8}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v8

    shl-int/lit8 v12, v1, 0x1e

    ushr-int/2addr v1, v15

    or-int/2addr v1, v12

    shl-int/lit8 v12, v8, 0x5

    ushr-int/lit8 v13, v8, 0x1b

    or-int/2addr v12, v13

    and-int v13, v11, v1

    and-int v16, v11, v4

    or-int v13, v13, v16

    and-int v16, v1, v4

    or-int v13, v13, v16

    add-int/2addr v12, v13

    const/16 v13, 0x29

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v10}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v10

    shl-int/lit8 v12, v11, 0x1e

    ushr-int/2addr v11, v15

    or-int/2addr v11, v12

    shl-int/lit8 v12, v10, 0x5

    ushr-int/lit8 v13, v10, 0x1b

    or-int/2addr v12, v13

    and-int v13, v8, v11

    and-int v16, v8, v1

    or-int v13, v13, v16

    and-int v16, v11, v1

    or-int v13, v13, v16

    add-int/2addr v12, v13

    const/16 v13, 0x2a

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v4

    shl-int/lit8 v12, v8, 0x1e

    ushr-int/2addr v8, v15

    or-int/2addr v8, v12

    shl-int/lit8 v12, v4, 0x5

    ushr-int/lit8 v13, v4, 0x1b

    or-int/2addr v12, v13

    and-int v13, v10, v8

    and-int v16, v10, v11

    or-int v13, v13, v16

    and-int v16, v8, v11

    or-int v13, v13, v16

    add-int/2addr v12, v13

    const/16 v13, 0x2b

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v1

    shl-int/lit8 v12, v10, 0x1e

    ushr-int/2addr v10, v15

    or-int/2addr v10, v12

    shl-int/lit8 v12, v1, 0x5

    ushr-int/lit8 v13, v1, 0x1b

    or-int/2addr v12, v13

    and-int v13, v4, v10

    and-int v16, v4, v8

    or-int v13, v13, v16

    and-int v16, v10, v8

    or-int v13, v13, v16

    add-int/2addr v12, v13

    const/16 v13, 0x2c

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v11

    shl-int/lit8 v12, v4, 0x1e

    ushr-int/2addr v4, v15

    or-int/2addr v4, v12

    shl-int/lit8 v12, v11, 0x5

    ushr-int/lit8 v13, v11, 0x1b

    or-int/2addr v12, v13

    and-int v13, v1, v4

    and-int v16, v1, v10

    or-int v13, v13, v16

    and-int v16, v4, v10

    or-int v13, v13, v16

    add-int/2addr v12, v13

    const/16 v13, 0x2d

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v8}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v8

    shl-int/lit8 v12, v1, 0x1e

    ushr-int/2addr v1, v15

    or-int/2addr v1, v12

    shl-int/lit8 v12, v8, 0x5

    ushr-int/lit8 v13, v8, 0x1b

    or-int/2addr v12, v13

    and-int v13, v11, v1

    and-int v16, v11, v4

    or-int v13, v13, v16

    and-int v16, v1, v4

    or-int v13, v13, v16

    add-int/2addr v12, v13

    const/16 v13, 0x2e

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v10}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v10

    shl-int/lit8 v12, v11, 0x1e

    ushr-int/2addr v11, v15

    or-int/2addr v11, v12

    shl-int/lit8 v12, v10, 0x5

    ushr-int/lit8 v13, v10, 0x1b

    or-int/2addr v12, v13

    and-int v13, v8, v11

    and-int v16, v8, v1

    or-int v13, v13, v16

    and-int v16, v11, v1

    or-int v13, v13, v16

    add-int/2addr v12, v13

    const/16 v13, 0x2f

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v4

    shl-int/lit8 v12, v8, 0x1e

    ushr-int/2addr v8, v15

    or-int/2addr v8, v12

    shl-int/lit8 v12, v4, 0x5

    ushr-int/lit8 v13, v4, 0x1b

    or-int/2addr v12, v13

    and-int v13, v10, v8

    and-int v16, v10, v11

    or-int v13, v13, v16

    and-int v16, v8, v11

    or-int v13, v13, v16

    add-int/2addr v12, v13

    const/16 v13, 0x30

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v1

    shl-int/lit8 v12, v10, 0x1e

    ushr-int/2addr v10, v15

    or-int/2addr v10, v12

    shl-int/lit8 v12, v1, 0x5

    ushr-int/lit8 v13, v1, 0x1b

    or-int/2addr v12, v13

    and-int v13, v4, v10

    and-int v16, v4, v8

    or-int v13, v13, v16

    and-int v16, v10, v8

    or-int v13, v13, v16

    add-int/2addr v12, v13

    const/16 v13, 0x31

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v11

    shl-int/lit8 v12, v4, 0x1e

    ushr-int/2addr v4, v15

    or-int/2addr v4, v12

    shl-int/lit8 v12, v11, 0x5

    ushr-int/lit8 v13, v11, 0x1b

    or-int/2addr v12, v13

    and-int v13, v1, v4

    and-int v16, v1, v10

    or-int v13, v13, v16

    and-int v16, v4, v10

    or-int v13, v13, v16

    add-int/2addr v12, v13

    const/16 v13, 0x32

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v8}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v8

    shl-int/lit8 v12, v1, 0x1e

    ushr-int/2addr v1, v15

    or-int/2addr v1, v12

    shl-int/lit8 v12, v8, 0x5

    ushr-int/lit8 v13, v8, 0x1b

    or-int/2addr v12, v13

    and-int v13, v11, v1

    and-int v16, v11, v4

    or-int v13, v13, v16

    and-int v16, v1, v4

    or-int v13, v13, v16

    add-int/2addr v12, v13

    const/16 v13, 0x33

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v10}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v10

    shl-int/lit8 v12, v11, 0x1e

    ushr-int/2addr v11, v15

    or-int/2addr v11, v12

    shl-int/lit8 v12, v10, 0x5

    ushr-int/lit8 v13, v10, 0x1b

    or-int/2addr v12, v13

    and-int v13, v8, v11

    and-int v16, v8, v1

    or-int v13, v13, v16

    and-int v16, v11, v1

    or-int v13, v13, v16

    add-int/2addr v12, v13

    const/16 v13, 0x34

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v4

    shl-int/lit8 v12, v8, 0x1e

    ushr-int/2addr v8, v15

    or-int/2addr v8, v12

    shl-int/lit8 v12, v4, 0x5

    ushr-int/lit8 v13, v4, 0x1b

    or-int/2addr v12, v13

    and-int v13, v10, v8

    and-int v16, v10, v11

    or-int v13, v13, v16

    and-int v16, v8, v11

    or-int v13, v13, v16

    add-int/2addr v12, v13

    const/16 v13, 0x35

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v1

    shl-int/lit8 v12, v10, 0x1e

    ushr-int/2addr v10, v15

    or-int/2addr v10, v12

    shl-int/lit8 v12, v1, 0x5

    ushr-int/lit8 v13, v1, 0x1b

    or-int/2addr v12, v13

    and-int v13, v4, v10

    and-int v16, v4, v8

    or-int v13, v13, v16

    and-int v16, v10, v8

    or-int v13, v13, v16

    add-int/2addr v12, v13

    const/16 v13, 0x36

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v11

    shl-int/lit8 v12, v4, 0x1e

    ushr-int/2addr v4, v15

    or-int/2addr v4, v12

    shl-int/lit8 v12, v11, 0x5

    ushr-int/lit8 v13, v11, 0x1b

    or-int/2addr v12, v13

    add-int/2addr v8, v12

    and-int v12, v1, v4

    and-int v13, v1, v10

    or-int/2addr v12, v13

    and-int v13, v4, v10

    or-int/2addr v12, v13

    add-int/2addr v8, v12

    const/16 v12, 0x37

    aget v12, v9, v12

    add-int/2addr v8, v12

    add-int/2addr v8, v14

    shl-int/lit8 v12, v1, 0x1e

    ushr-int/2addr v1, v15

    or-int/2addr v1, v12

    shl-int/lit8 v12, v8, 0x5

    ushr-int/lit8 v13, v8, 0x1b

    or-int/2addr v12, v13

    and-int v13, v11, v1

    and-int v16, v11, v4

    or-int v13, v13, v16

    and-int v16, v1, v4

    or-int v13, v13, v16

    add-int/2addr v12, v13

    const/16 v13, 0x38

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v10}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v10

    shl-int/lit8 v12, v11, 0x1e

    ushr-int/2addr v11, v15

    or-int/2addr v11, v12

    shl-int/lit8 v12, v10, 0x5

    ushr-int/lit8 v13, v10, 0x1b

    or-int/2addr v12, v13

    and-int v13, v8, v11

    and-int v16, v8, v1

    or-int v13, v13, v16

    and-int v16, v11, v1

    or-int v13, v13, v16

    add-int/2addr v12, v13

    const/16 v13, 0x39

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v4

    shl-int/lit8 v12, v8, 0x1e

    ushr-int/2addr v8, v15

    or-int/2addr v8, v12

    shl-int/lit8 v12, v4, 0x5

    ushr-int/lit8 v13, v4, 0x1b

    or-int/2addr v12, v13

    and-int v13, v10, v8

    and-int v16, v10, v11

    or-int v13, v13, v16

    and-int v16, v8, v11

    or-int v13, v13, v16

    add-int/2addr v12, v13

    const/16 v13, 0x3a

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v1

    shl-int/lit8 v12, v10, 0x1e

    ushr-int/2addr v10, v15

    or-int/2addr v10, v12

    shl-int/lit8 v12, v1, 0x5

    ushr-int/lit8 v13, v1, 0x1b

    or-int/2addr v12, v13

    and-int v13, v4, v10

    and-int v16, v4, v8

    or-int v13, v13, v16

    and-int v16, v10, v8

    or-int v13, v13, v16

    add-int/2addr v12, v13

    const/16 v13, 0x3b

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v11

    shl-int/lit8 v12, v4, 0x1e

    ushr-int/2addr v4, v15

    or-int/2addr v4, v12

    shl-int/lit8 v12, v11, 0x5

    ushr-int/lit8 v13, v11, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v1, v4

    xor-int/2addr v13, v10

    add-int/2addr v12, v13

    const/16 v13, 0x3c

    aget v13, v9, v13

    const v14, -0x359d3e2a    # -3715189.5f

    invoke-static {v12, v13, v14, v8}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v8

    shl-int/lit8 v12, v1, 0x1e

    ushr-int/2addr v1, v15

    or-int/2addr v1, v12

    shl-int/lit8 v12, v8, 0x5

    ushr-int/lit8 v13, v8, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v11, v1

    xor-int/2addr v13, v4

    add-int/2addr v12, v13

    const/16 v13, 0x3d

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v10}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v10

    shl-int/lit8 v12, v11, 0x1e

    ushr-int/2addr v11, v15

    or-int/2addr v11, v12

    shl-int/lit8 v12, v10, 0x5

    ushr-int/lit8 v13, v10, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v8, v11

    xor-int/2addr v13, v1

    add-int/2addr v12, v13

    const/16 v13, 0x3e

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v4

    shl-int/lit8 v12, v8, 0x1e

    ushr-int/2addr v8, v15

    or-int/2addr v8, v12

    shl-int/lit8 v12, v4, 0x5

    ushr-int/lit8 v13, v4, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v10, v8

    xor-int/2addr v13, v11

    add-int/2addr v12, v13

    const/16 v13, 0x3f

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v1

    shl-int/lit8 v12, v10, 0x1e

    ushr-int/2addr v10, v15

    or-int/2addr v10, v12

    shl-int/lit8 v12, v1, 0x5

    ushr-int/lit8 v13, v1, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v4, v10

    xor-int/2addr v13, v8

    add-int/2addr v12, v13

    const/16 v13, 0x40

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v11

    shl-int/lit8 v12, v4, 0x1e

    ushr-int/2addr v4, v15

    or-int/2addr v4, v12

    shl-int/lit8 v12, v11, 0x5

    ushr-int/lit8 v13, v11, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v1, v4

    xor-int/2addr v13, v10

    add-int/2addr v12, v13

    const/16 v13, 0x41

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v8}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v8

    shl-int/lit8 v12, v1, 0x1e

    ushr-int/2addr v1, v15

    or-int/2addr v1, v12

    shl-int/lit8 v12, v8, 0x5

    ushr-int/lit8 v13, v8, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v11, v1

    xor-int/2addr v13, v4

    add-int/2addr v12, v13

    const/16 v13, 0x42

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v10}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v10

    shl-int/lit8 v12, v11, 0x1e

    ushr-int/2addr v11, v15

    or-int/2addr v11, v12

    shl-int/lit8 v12, v10, 0x5

    ushr-int/lit8 v13, v10, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v8, v11

    xor-int/2addr v13, v1

    add-int/2addr v12, v13

    const/16 v13, 0x43

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v4

    shl-int/lit8 v12, v8, 0x1e

    ushr-int/2addr v8, v15

    or-int/2addr v8, v12

    shl-int/lit8 v12, v4, 0x5

    ushr-int/lit8 v13, v4, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v10, v8

    xor-int/2addr v13, v11

    add-int/2addr v12, v13

    const/16 v13, 0x44

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v1

    shl-int/lit8 v12, v10, 0x1e

    ushr-int/2addr v10, v15

    or-int/2addr v10, v12

    shl-int/lit8 v12, v1, 0x5

    ushr-int/lit8 v13, v1, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v4, v10

    xor-int/2addr v13, v8

    add-int/2addr v12, v13

    const/16 v13, 0x45

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v11

    shl-int/lit8 v12, v4, 0x1e

    ushr-int/2addr v4, v15

    or-int/2addr v4, v12

    shl-int/lit8 v12, v11, 0x5

    ushr-int/lit8 v13, v11, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v1, v4

    xor-int/2addr v13, v10

    add-int/2addr v12, v13

    const/16 v13, 0x46

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v8}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v8

    shl-int/lit8 v12, v1, 0x1e

    ushr-int/2addr v1, v15

    or-int/2addr v1, v12

    shl-int/lit8 v12, v8, 0x5

    ushr-int/lit8 v13, v8, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v11, v1

    xor-int/2addr v13, v4

    add-int/2addr v12, v13

    const/16 v13, 0x47

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v10}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v10

    shl-int/lit8 v12, v11, 0x1e

    ushr-int/2addr v11, v15

    or-int/2addr v11, v12

    shl-int/lit8 v12, v10, 0x5

    ushr-int/lit8 v13, v10, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v8, v11

    xor-int/2addr v13, v1

    add-int/2addr v12, v13

    const/16 v13, 0x48

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v4

    shl-int/lit8 v12, v8, 0x1e

    ushr-int/2addr v8, v15

    or-int/2addr v8, v12

    shl-int/lit8 v12, v4, 0x5

    ushr-int/lit8 v13, v4, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v10, v8

    xor-int/2addr v13, v11

    add-int/2addr v12, v13

    const/16 v13, 0x49

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v1

    shl-int/lit8 v12, v10, 0x1e

    ushr-int/2addr v10, v15

    or-int/2addr v10, v12

    shl-int/lit8 v12, v1, 0x5

    ushr-int/lit8 v13, v1, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v4, v10

    xor-int/2addr v13, v8

    add-int/2addr v12, v13

    const/16 v13, 0x4a

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v11

    shl-int/lit8 v12, v4, 0x1e

    ushr-int/2addr v4, v15

    or-int/2addr v4, v12

    shl-int/lit8 v12, v11, 0x5

    ushr-int/lit8 v13, v11, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v1, v4

    xor-int/2addr v13, v10

    add-int/2addr v12, v13

    const/16 v13, 0x4b

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v8}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v8

    shl-int/lit8 v12, v1, 0x1e

    ushr-int/2addr v1, v15

    or-int/2addr v1, v12

    shl-int/lit8 v12, v8, 0x5

    ushr-int/lit8 v13, v8, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v11, v1

    xor-int/2addr v13, v4

    add-int/2addr v12, v13

    const/16 v13, 0x4c

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v10}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v10

    shl-int/lit8 v12, v11, 0x1e

    ushr-int/2addr v11, v15

    or-int/2addr v11, v12

    shl-int/lit8 v12, v10, 0x5

    ushr-int/lit8 v13, v10, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v8, v11

    xor-int/2addr v13, v1

    add-int/2addr v12, v13

    const/16 v13, 0x4d

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v4

    shl-int/lit8 v12, v8, 0x1e

    ushr-int/2addr v8, v15

    or-int/2addr v8, v12

    shl-int/lit8 v12, v4, 0x5

    ushr-int/lit8 v13, v4, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v10, v8

    xor-int/2addr v13, v11

    add-int/2addr v12, v13

    const/16 v13, 0x4e

    aget v13, v9, v13

    invoke-static {v12, v13, v14, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v1

    shl-int/lit8 v12, v10, 0x1e

    ushr-int/2addr v10, v15

    or-int/2addr v10, v12

    shl-int/lit8 v12, v1, 0x5

    ushr-int/lit8 v13, v1, 0x1b

    or-int/2addr v12, v13

    xor-int v13, v4, v10

    xor-int/2addr v13, v8

    add-int/2addr v12, v13

    const/16 v13, 0x4f

    aget v9, v9, v13

    invoke-static {v12, v9, v14, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result v9

    shl-int/lit8 v11, v4, 0x1e

    ushr-int/lit8 v4, v4, 0x2

    or-int/2addr v4, v11

    add-int/2addr v2, v9

    iput v2, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->H0:I

    add-int/2addr v3, v1

    iput v3, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->H1:I

    add-int/2addr v5, v4

    iput v5, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->H2:I

    add-int/2addr v6, v10

    iput v6, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->H3:I

    add-int/2addr v7, v8

    iput v7, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->H4:I

    return-void
.end method

.method private final putInt([BII)V
    .registers 6

    shr-int/lit8 v0, p3, 0x18

    int-to-byte v0, v0

    aput-byte v0, p1, p2

    add-int/lit8 v0, p2, 0x1

    shr-int/lit8 v1, p3, 0x10

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    add-int/lit8 v0, p2, 0x2

    shr-int/lit8 v1, p3, 0x8

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    add-int/lit8 p2, p2, 0x3

    int-to-byte p3, p3

    aput-byte p3, p1, p2

    return-void
.end method

.method private static final toHexString([B)Ljava/lang/String;
    .registers 5

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v1, 0x0

    :goto_6
    array-length v2, p0

    if-ge v1, v2, :cond_2e

    aget-byte v2, p0, v1

    shr-int/lit8 v2, v2, 0x4

    and-int/lit8 v2, v2, 0xf

    const-string v3, "H7nLk=\u00190=\u001a3nKboKgfMbi\u001bfh@jh\u001cd9LggK1<Ndf\u001d1jO6:O`kJcnO0kKao\u001abfO4oM"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    aget-byte v2, p0, v1

    and-int/lit8 v2, v2, 0xf

    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_2e
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final digest([B)V
    .registers 3

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/trilead/ssh2/crypto/digest/SHA1;->digest([BI)V

    return-void
.end method

.method public final digest([BI)V
    .registers 10

    iget v0, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    shr-int/lit8 v1, v0, 0x2

    iget-object v2, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->w:[I

    aget v3, v2, v1

    shl-int/lit8 v3, v3, 0x8

    or-int/lit16 v3, v3, 0x80

    and-int/lit8 v4, v0, 0x3

    rsub-int/lit8 v4, v4, 0x3

    shl-int/lit8 v4, v4, 0x3

    shl-int/2addr v3, v4

    aput v3, v2, v1

    and-int/lit8 v0, v0, -0x4

    add-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    const/16 v1, 0xf

    const/4 v3, 0x0

    const/16 v4, 0x40

    if-ne v0, v4, :cond_28

    iput v3, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    :goto_24
    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/digest/SHA1;->perform()V

    goto :goto_31

    :cond_28
    const/16 v4, 0x3c

    if-ne v0, v4, :cond_31

    iput v3, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    aput v3, v2, v1

    goto :goto_24

    :cond_31
    :goto_31
    iget v0, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    shr-int/lit8 v0, v0, 0x2

    :goto_35
    const/16 v2, 0xe

    if-ge v0, v2, :cond_40

    iget-object v2, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->w:[I

    aput v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_35

    :cond_40
    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->w:[I

    iget-wide v3, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentLen:J

    const/16 v5, 0x20

    shr-long v5, v3, v5

    long-to-int v6, v5

    aput v6, v0, v2

    long-to-int v2, v3

    aput v2, v0, v1

    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/digest/SHA1;->perform()V

    iget v0, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->H0:I

    invoke-direct {p0, p1, p2, v0}, Lcom/trilead/ssh2/crypto/digest/SHA1;->putInt([BII)V

    add-int/lit8 v0, p2, 0x4

    iget v1, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->H1:I

    invoke-direct {p0, p1, v0, v1}, Lcom/trilead/ssh2/crypto/digest/SHA1;->putInt([BII)V

    add-int/lit8 v0, p2, 0x8

    iget v1, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->H2:I

    invoke-direct {p0, p1, v0, v1}, Lcom/trilead/ssh2/crypto/digest/SHA1;->putInt([BII)V

    add-int/lit8 v0, p2, 0xc

    iget v1, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->H3:I

    invoke-direct {p0, p1, v0, v1}, Lcom/trilead/ssh2/crypto/digest/SHA1;->putInt([BII)V

    add-int/lit8 p2, p2, 0x10

    iget v0, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->H4:I

    invoke-direct {p0, p1, p2, v0}, Lcom/trilead/ssh2/crypto/digest/SHA1;->putInt([BII)V

    invoke-virtual {p0}, Lcom/trilead/ssh2/crypto/digest/SHA1;->reset()V

    return-void
.end method

.method public final getDigestLength()I
    .registers 2

    const/16 v0, 0x14

    return v0
.end method

.method public final reset()V
    .registers 3

    const v0, 0x67452301

    iput v0, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->H0:I

    const v0, -0x10325477

    iput v0, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->H1:I

    const v0, -0x67452302

    iput v0, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->H2:I

    const v0, 0x10325476

    iput v0, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->H3:I

    const v0, -0x3c2d1e10

    iput v0, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->H4:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentLen:J

    return-void
.end method

.method public final update(B)V
    .registers 7

    iget v0, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    shr-int/lit8 v1, v0, 0x2

    iget-object v2, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->w:[I

    aget v3, v2, v1

    shl-int/lit8 v3, v3, 0x8

    and-int/lit16 p1, p1, 0xff

    or-int/2addr p1, v3

    aput p1, v2, v1

    iget-wide v1, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentLen:J

    const-wide/16 v3, 0x8

    add-long/2addr v1, v3

    iput-wide v1, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentLen:J

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    const/16 p1, 0x40

    if-ne v0, p1, :cond_24

    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/digest/SHA1;->perform()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    :cond_24
    return-void
.end method

.method public final update([B)V
    .registers 4

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/trilead/ssh2/crypto/digest/SHA1;->update([BII)V

    return-void
.end method

.method public final update([BII)V
    .registers 21

    move-object/from16 v0, p0

    move/from16 v1, p3

    const-wide/16 v2, 0x8

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/16 v6, 0x40

    const/16 v7, 0x8

    const/4 v8, 0x1

    if-lt v1, v4, :cond_186

    iget v9, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    shr-int/lit8 v10, v9, 0x2

    and-int/lit8 v11, v9, 0x3

    if-eqz v11, :cond_a0

    const/4 v14, 0x3

    if-eq v11, v8, :cond_71

    const/4 v15, 0x2

    if-eq v11, v15, :cond_44

    if-eq v11, v14, :cond_23

    move/from16 v15, p2

    goto/16 :goto_d8

    :cond_23
    iget-object v11, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->w:[I

    aget v14, v11, v10

    shl-int/2addr v14, v7

    add-int/lit8 v15, p2, 0x1

    aget-byte v12, p1, p2

    and-int/lit16 v12, v12, 0xff

    or-int/2addr v12, v14

    aput v12, v11, v10

    add-int/lit8 v1, v1, -0x1

    add-int/2addr v9, v8

    iput v9, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    iget-wide v10, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentLen:J

    add-long/2addr v10, v2

    iput-wide v10, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentLen:J

    if-ne v9, v6, :cond_d8

    :goto_3d
    invoke-direct/range {p0 .. p0}, Lcom/trilead/ssh2/crypto/digest/SHA1;->perform()V

    iput v5, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    goto/16 :goto_d8

    :cond_44
    iget-object v11, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->w:[I

    aget v12, v11, v10

    shl-int/lit8 v12, v12, 0x10

    add-int/lit8 v13, p2, 0x1

    aget-byte v14, p1, p2

    and-int/lit16 v14, v14, 0xff

    shl-int/2addr v14, v7

    add-int/lit8 v16, v13, 0x1

    aget-byte v13, p1, v13

    and-int/lit16 v13, v13, 0xff

    or-int/2addr v13, v14

    or-int/2addr v12, v13

    aput v12, v11, v10

    add-int/lit8 v1, v1, -0x2

    add-int/2addr v9, v15

    iput v9, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    iget-wide v10, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentLen:J

    const-wide/16 v12, 0x10

    add-long/2addr v10, v12

    iput-wide v10, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentLen:J

    if-ne v9, v6, :cond_6e

    invoke-direct/range {p0 .. p0}, Lcom/trilead/ssh2/crypto/digest/SHA1;->perform()V

    iput v5, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    :cond_6e
    move/from16 v15, v16

    goto :goto_d8

    :cond_71
    iget-object v11, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->w:[I

    aget v12, v11, v10

    shl-int/lit8 v12, v12, 0x18

    add-int/lit8 v13, p2, 0x1

    aget-byte v15, p1, p2

    and-int/lit16 v15, v15, 0xff

    shl-int/lit8 v15, v15, 0x10

    add-int/lit8 v16, v13, 0x1

    aget-byte v13, p1, v13

    and-int/lit16 v13, v13, 0xff

    shl-int/2addr v13, v7

    or-int/2addr v13, v15

    add-int/lit8 v15, v16, 0x1

    aget-byte v8, p1, v16

    and-int/lit16 v8, v8, 0xff

    or-int/2addr v8, v13

    or-int/2addr v8, v12

    aput v8, v11, v10

    add-int/lit8 v1, v1, -0x3

    add-int/2addr v9, v14

    iput v9, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    iget-wide v10, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentLen:J

    const-wide/16 v12, 0x18

    add-long/2addr v10, v12

    iput-wide v10, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentLen:J

    if-ne v9, v6, :cond_d8

    goto :goto_3d

    :cond_a0
    iget-object v8, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->w:[I

    add-int/lit8 v11, p2, 0x1

    aget-byte v12, p1, p2

    and-int/lit16 v12, v12, 0xff

    shl-int/lit8 v12, v12, 0x18

    add-int/lit8 v13, v11, 0x1

    aget-byte v11, p1, v11

    and-int/lit16 v11, v11, 0xff

    shl-int/lit8 v11, v11, 0x10

    or-int/2addr v11, v12

    add-int/lit8 v12, v13, 0x1

    aget-byte v13, p1, v13

    and-int/lit16 v13, v13, 0xff

    shl-int/2addr v13, v7

    or-int/2addr v11, v13

    add-int/lit8 v13, v12, 0x1

    aget-byte v12, p1, v12

    and-int/lit16 v12, v12, 0xff

    or-int/2addr v11, v12

    aput v11, v8, v10

    add-int/lit8 v1, v1, -0x4

    add-int/2addr v9, v4

    iput v9, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    iget-wide v10, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentLen:J

    const-wide/16 v14, 0x20

    add-long/2addr v10, v14

    iput-wide v10, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentLen:J

    if-ne v9, v6, :cond_d7

    invoke-direct/range {p0 .. p0}, Lcom/trilead/ssh2/crypto/digest/SHA1;->perform()V

    iput v5, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    :cond_d7
    move v15, v13

    :cond_d8
    :goto_d8
    if-lt v1, v7, :cond_148

    iget-object v8, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->w:[I

    iget v9, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    shr-int/lit8 v10, v9, 0x2

    add-int/lit8 v11, v15, 0x1

    aget-byte v12, p1, v15

    and-int/lit16 v12, v12, 0xff

    shl-int/lit8 v12, v12, 0x18

    add-int/lit8 v13, v11, 0x1

    aget-byte v11, p1, v11

    and-int/lit16 v11, v11, 0xff

    shl-int/lit8 v11, v11, 0x10

    or-int/2addr v11, v12

    add-int/lit8 v12, v13, 0x1

    aget-byte v13, p1, v13

    and-int/lit16 v13, v13, 0xff

    shl-int/2addr v13, v7

    or-int/2addr v11, v13

    add-int/lit8 v13, v12, 0x1

    aget-byte v12, p1, v12

    and-int/lit16 v12, v12, 0xff

    or-int/2addr v11, v12

    aput v11, v8, v10

    add-int/2addr v9, v4

    iput v9, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    if-ne v9, v6, :cond_10c

    invoke-direct/range {p0 .. p0}, Lcom/trilead/ssh2/crypto/digest/SHA1;->perform()V

    iput v5, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    :cond_10c
    iget-object v8, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->w:[I

    iget v9, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    shr-int/lit8 v10, v9, 0x2

    add-int/lit8 v11, v13, 0x1

    aget-byte v12, p1, v13

    and-int/lit16 v12, v12, 0xff

    shl-int/lit8 v12, v12, 0x18

    add-int/lit8 v13, v11, 0x1

    aget-byte v11, p1, v11

    and-int/lit16 v11, v11, 0xff

    shl-int/lit8 v11, v11, 0x10

    or-int/2addr v11, v12

    add-int/lit8 v12, v13, 0x1

    aget-byte v13, p1, v13

    and-int/lit16 v13, v13, 0xff

    shl-int/2addr v13, v7

    or-int/2addr v11, v13

    add-int/lit8 v15, v12, 0x1

    aget-byte v12, p1, v12

    and-int/lit16 v12, v12, 0xff

    or-int/2addr v11, v12

    aput v11, v8, v10

    add-int/2addr v9, v4

    iput v9, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    if-ne v9, v6, :cond_13e

    invoke-direct/range {p0 .. p0}, Lcom/trilead/ssh2/crypto/digest/SHA1;->perform()V

    iput v5, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    :cond_13e
    iget-wide v8, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentLen:J

    const-wide/16 v10, 0x40

    add-long/2addr v8, v10

    iput-wide v8, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentLen:J

    add-int/lit8 v1, v1, -0x8

    goto :goto_d8

    :cond_148
    :goto_148
    if-gez v1, :cond_188

    iget-object v8, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->w:[I

    iget v9, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    shr-int/lit8 v10, v9, 0x2

    add-int/lit8 v11, v15, 0x1

    aget-byte v12, p1, v15

    and-int/lit16 v12, v12, 0xff

    shl-int/lit8 v12, v12, 0x18

    add-int/lit8 v13, v11, 0x1

    aget-byte v11, p1, v11

    and-int/lit16 v11, v11, 0xff

    shl-int/lit8 v11, v11, 0x10

    or-int/2addr v11, v12

    add-int/lit8 v12, v13, 0x1

    aget-byte v13, p1, v13

    and-int/lit16 v13, v13, 0xff

    shl-int/2addr v13, v7

    or-int/2addr v11, v13

    add-int/lit8 v15, v12, 0x1

    aget-byte v12, p1, v12

    and-int/lit16 v12, v12, 0xff

    or-int/2addr v11, v12

    aput v11, v8, v10

    add-int/lit8 v1, v1, -0x4

    add-int/2addr v9, v4

    iput v9, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    iget-wide v10, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentLen:J

    const-wide/16 v12, 0x20

    add-long/2addr v10, v12

    iput-wide v10, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentLen:J

    if-ne v9, v6, :cond_148

    invoke-direct/range {p0 .. p0}, Lcom/trilead/ssh2/crypto/digest/SHA1;->perform()V

    iput v5, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    goto :goto_148

    :cond_186
    move/from16 v15, p2

    :cond_188
    :goto_188
    if-lez v1, :cond_1b0

    iget v4, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    shr-int/lit8 v8, v4, 0x2

    iget-object v9, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->w:[I

    aget v10, v9, v8

    shl-int/2addr v10, v7

    add-int/lit8 v11, v15, 0x1

    aget-byte v12, p1, v15

    and-int/lit16 v12, v12, 0xff

    or-int/2addr v10, v12

    aput v10, v9, v8

    iget-wide v8, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentLen:J

    add-long/2addr v8, v2

    iput-wide v8, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentLen:J

    const/4 v8, 0x1

    add-int/2addr v4, v8

    iput v4, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    if-ne v4, v6, :cond_1ac

    invoke-direct/range {p0 .. p0}, Lcom/trilead/ssh2/crypto/digest/SHA1;->perform()V

    iput v5, v0, Lcom/trilead/ssh2/crypto/digest/SHA1;->currentPos:I

    :cond_1ac
    add-int/lit8 v1, v1, -0x1

    move v15, v11

    goto :goto_188

    :cond_1b0
    return-void
.end method
