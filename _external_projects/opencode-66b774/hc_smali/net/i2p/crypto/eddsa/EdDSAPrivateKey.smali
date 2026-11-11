.class public Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lnet/i2p/crypto/eddsa/EdDSAKey;
.implements Ljava/security/PrivateKey;


# static fields
.field private static final IDLEN_BYTE:I = 0x6

.field private static final OID_BYTE:I = 0xb

.field private static final OID_ED25519:I = 0x70

.field private static final OID_OLD:I = 0x64

.field private static final serialVersionUID:J = 0x53795f57437c2dL


# instance fields
.field private final A:Lnet/i2p/crypto/eddsa/math/GroupElement;

.field private final Abyte:[B

.field private final a:[B

.field private final edDsaSpec:Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

.field private final h:[B

.field private final seed:[B


# direct methods
.method public constructor <init>(Ljava/security/spec/PKCS8EncodedKeySpec;)V
    .registers 4

    new-instance v0, Lnet/i2p/crypto/eddsa/spec/EdDSAPrivateKeySpec;

    invoke-virtual {p1}, Ljava/security/spec/PKCS8EncodedKeySpec;->getEncoded()[B

    move-result-object p1

    invoke-static {p1}, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->decode([B)[B

    move-result-object p1

    sget-object v1, Lnet/i2p/crypto/eddsa/spec/EdDSANamedCurveTable;->ED_25519_CURVE_SPEC:Lnet/i2p/crypto/eddsa/spec/EdDSANamedCurveSpec;

    invoke-direct {v0, p1, v1}, Lnet/i2p/crypto/eddsa/spec/EdDSAPrivateKeySpec;-><init>([BLnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;)V

    invoke-direct {p0, v0}, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;-><init>(Lnet/i2p/crypto/eddsa/spec/EdDSAPrivateKeySpec;)V

    return-void
.end method

.method public constructor <init>(Lnet/i2p/crypto/eddsa/spec/EdDSAPrivateKeySpec;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lnet/i2p/crypto/eddsa/spec/EdDSAPrivateKeySpec;->getSeed()[B

    move-result-object v0

    iput-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->seed:[B

    invoke-virtual {p1}, Lnet/i2p/crypto/eddsa/spec/EdDSAPrivateKeySpec;->getH()[B

    move-result-object v0

    iput-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->h:[B

    invoke-virtual {p1}, Lnet/i2p/crypto/eddsa/spec/EdDSAPrivateKeySpec;->geta()[B

    move-result-object v0

    iput-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->a:[B

    invoke-virtual {p1}, Lnet/i2p/crypto/eddsa/spec/EdDSAPrivateKeySpec;->getA()Lnet/i2p/crypto/eddsa/math/GroupElement;

    move-result-object v0

    iput-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->A:Lnet/i2p/crypto/eddsa/math/GroupElement;

    invoke-virtual {v0}, Lnet/i2p/crypto/eddsa/math/GroupElement;->toByteArray()[B

    move-result-object v0

    iput-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->Abyte:[B

    invoke-virtual {p1}, Lnet/i2p/crypto/eddsa/spec/EdDSAPrivateKeySpec;->getParams()Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    move-result-object p1

    iput-object p1, p0, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->edDsaSpec:Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    return-void
.end method

.method private static decode([B)[B
    .registers 15

    const/16 v0, 0xb

    :try_start_2
    aget-byte v0, p0, v0
    :try_end_4
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_4} :catch_d5

    const/16 v1, 0x8

    const/16 v2, 0x64

    const/4 v3, 0x6

    const/4 v4, 0x5

    const/16 v5, 0x30

    const/4 v6, 0x7

    const-string v7, "unsupported key spec"

    if-ne v0, v2, :cond_16

    const/16 v8, 0x31

    const/16 v9, 0x8

    goto :goto_25

    :cond_16
    const/16 v8, 0x70

    if-ne v0, v8, :cond_cf

    :try_start_1a
    aget-byte v8, p0, v3

    if-ne v8, v6, :cond_22

    const/16 v8, 0x32

    const/4 v9, 0x7

    goto :goto_25

    :cond_22
    const/16 v8, 0x30

    const/4 v9, 0x5

    :goto_25
    array-length v10, p0

    if-ne v10, v8, :cond_c7

    const/4 v10, 0x0

    aget-byte v11, p0, v10

    if-ne v11, v5, :cond_c1

    const/4 v11, 0x1

    aget-byte v12, p0, v11

    const/4 v13, 0x2

    sub-int/2addr v8, v13

    if-ne v12, v8, :cond_c1

    aget-byte v8, p0, v13

    if-ne v8, v13, :cond_c1

    const/4 v8, 0x3

    aget-byte v12, p0, v8

    if-ne v12, v11, :cond_c1

    const/4 v12, 0x4

    aget-byte v13, p0, v12

    if-nez v13, :cond_c1

    aget-byte v13, p0, v4

    if-ne v13, v5, :cond_c1

    aget-byte v5, p0, v3

    if-ne v5, v9, :cond_c1

    aget-byte v5, p0, v6

    if-ne v5, v3, :cond_c1

    const/16 v3, 0x9

    aget-byte v1, p0, v1

    if-ne v1, v8, :cond_c1

    aget-byte v1, p0, v3

    const/16 v3, 0x2b

    if-ne v1, v3, :cond_c1

    const/16 v1, 0xa

    aget-byte v3, p0, v1

    const/16 v5, 0x65

    if-ne v3, v5, :cond_c1

    const/16 v3, 0xc

    const/16 v5, 0xe

    const/16 v8, 0xd

    if-ne v0, v2, :cond_7f

    aget-byte v0, p0, v3

    if-ne v0, v1, :cond_79

    aget-byte v0, p0, v8

    if-ne v0, v11, :cond_79

    const/16 v0, 0xf

    aget-byte v1, p0, v5

    if-ne v1, v11, :cond_79

    goto :goto_a1

    :cond_79
    new-instance p0, Ljava/security/spec/InvalidKeySpecException;

    invoke-direct {p0, v7}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7f
    if-ne v9, v6, :cond_92

    aget-byte v0, p0, v3

    if-ne v0, v4, :cond_8c

    aget-byte v0, p0, v8

    if-nez v0, :cond_8c

    const/16 v3, 0xe

    goto :goto_92

    :cond_8c
    new-instance p0, Ljava/security/spec/InvalidKeySpecException;

    invoke-direct {p0, v7}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_92
    :goto_92
    add-int/lit8 v0, v3, 0x1

    aget-byte v1, p0, v3

    if-ne v1, v12, :cond_bb

    add-int/lit8 v1, v0, 0x1

    aget-byte v0, p0, v0

    const/16 v2, 0x22

    if-ne v0, v2, :cond_bb

    move v0, v1

    :goto_a1
    add-int/lit8 v1, v0, 0x1

    aget-byte v0, p0, v0

    if-ne v0, v12, :cond_b5

    add-int/lit8 v0, v1, 0x1

    aget-byte v1, p0, v1

    const/16 v2, 0x20

    if-ne v1, v2, :cond_b5

    new-array v1, v2, [B

    invoke-static {p0, v0, v1, v10, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1

    :cond_b5
    new-instance p0, Ljava/security/spec/InvalidKeySpecException;

    invoke-direct {p0, v7}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_bb
    new-instance p0, Ljava/security/spec/InvalidKeySpecException;

    invoke-direct {p0, v7}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_c1
    new-instance p0, Ljava/security/spec/InvalidKeySpecException;

    invoke-direct {p0, v7}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_c7
    new-instance p0, Ljava/security/spec/InvalidKeySpecException;

    const-string v0, "invalid key spec length"

    invoke-direct {p0, v0}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_cf
    new-instance p0, Ljava/security/spec/InvalidKeySpecException;

    invoke-direct {p0, v7}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_d5
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1a .. :try_end_d5} :catch_d5

    :catch_d5
    move-exception p0

    new-instance v0, Ljava/security/spec/InvalidKeySpecException;

    invoke-direct {v0, p0}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p1, p0, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;

    iget-object v1, p0, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->seed:[B

    invoke-virtual {p1}, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->getSeed()[B

    move-result-object v3

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_25

    iget-object v1, p0, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->edDsaSpec:Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    invoke-virtual {p1}, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->getParams()Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    move-result-object p1

    invoke-virtual {v1, p1}, Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_25

    goto :goto_26

    :cond_25
    const/4 v0, 0x0

    :goto_26
    return v0
.end method

.method public getA()Lnet/i2p/crypto/eddsa/math/GroupElement;
    .registers 2

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->A:Lnet/i2p/crypto/eddsa/math/GroupElement;

    return-object v0
.end method

.method public getAbyte()[B
    .registers 2

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->Abyte:[B

    return-object v0
.end method

.method public getAlgorithm()Ljava/lang/String;
    .registers 2

    const-string v0, "EdDSA"

    return-object v0
.end method

.method public getEncoded()[B
    .registers 11

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->edDsaSpec:Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    sget-object v1, Lnet/i2p/crypto/eddsa/spec/EdDSANamedCurveTable;->ED_25519_CURVE_SPEC:Lnet/i2p/crypto/eddsa/spec/EdDSANamedCurveSpec;

    invoke-virtual {v0, v1}, Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_c

    return-object v1

    :cond_c
    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->seed:[B

    if-nez v0, :cond_11

    return-object v1

    :cond_11
    array-length v1, v0

    const/16 v2, 0x10

    add-int/2addr v1, v2

    new-array v3, v1, [B

    const/4 v4, 0x0

    const/16 v5, 0x30

    aput-byte v5, v3, v4

    const/4 v6, 0x2

    sub-int/2addr v1, v6

    int-to-byte v1, v1

    const/4 v7, 0x1

    aput-byte v1, v3, v7

    aput-byte v6, v3, v6

    const/4 v1, 0x3

    aput-byte v7, v3, v1

    const/4 v7, 0x4

    aput-byte v4, v3, v7

    const/4 v8, 0x5

    aput-byte v5, v3, v8

    const/4 v5, 0x7

    const/4 v9, 0x6

    aput-byte v8, v3, v9

    const/16 v8, 0x8

    aput-byte v9, v3, v5

    const/16 v5, 0x9

    aput-byte v1, v3, v8

    const/16 v1, 0xa

    const/16 v8, 0x2b

    aput-byte v8, v3, v5

    const/16 v5, 0xb

    const/16 v8, 0x65

    aput-byte v8, v3, v1

    const/16 v1, 0xc

    const/16 v8, 0x70

    aput-byte v8, v3, v5

    const/16 v5, 0xd

    aput-byte v7, v3, v1

    const/16 v1, 0xe

    array-length v8, v0

    add-int/2addr v8, v6

    int-to-byte v6, v8

    aput-byte v6, v3, v5

    const/16 v5, 0xf

    aput-byte v7, v3, v1

    array-length v1, v0

    int-to-byte v1, v1

    aput-byte v1, v3, v5

    array-length v1, v0

    invoke-static {v0, v4, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v3
.end method

.method public getFormat()Ljava/lang/String;
    .registers 2

    const-string v0, "PKCS#8"

    return-object v0
.end method

.method public getH()[B
    .registers 2

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->h:[B

    return-object v0
.end method

.method public getParams()Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;
    .registers 2

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->edDsaSpec:Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    return-object v0
.end method

.method public getSeed()[B
    .registers 2

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->seed:[B

    return-object v0
.end method

.method public geta()[B
    .registers 2

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->a:[B

    return-object v0
.end method

.method public hashCode()I
    .registers 2

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->seed:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    return v0
.end method
