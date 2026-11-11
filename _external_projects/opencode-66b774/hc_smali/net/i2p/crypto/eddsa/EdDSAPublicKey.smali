.class public Lnet/i2p/crypto/eddsa/EdDSAPublicKey;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lnet/i2p/crypto/eddsa/EdDSAKey;
.implements Ljava/security/PublicKey;


# static fields
.field private static final IDLEN_BYTE:I = 0x3

.field private static final OID_BYTE:I = 0x8

.field private static final OID_ED25519:I = 0x70

.field private static final OID_OLD:I = 0x64

.field private static final serialVersionUID:J = 0x22f31e1b1b346bL


# instance fields
.field private final A:Lnet/i2p/crypto/eddsa/math/GroupElement;

.field private final Abyte:[B

.field private Aneg:Lnet/i2p/crypto/eddsa/math/GroupElement;

.field private final edDsaSpec:Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;


# direct methods
.method public constructor <init>(Ljava/security/spec/X509EncodedKeySpec;)V
    .registers 4

    new-instance v0, Lnet/i2p/crypto/eddsa/spec/EdDSAPublicKeySpec;

    invoke-virtual {p1}, Ljava/security/spec/X509EncodedKeySpec;->getEncoded()[B

    move-result-object p1

    invoke-static {p1}, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;->decode([B)[B

    move-result-object p1

    sget-object v1, Lnet/i2p/crypto/eddsa/spec/EdDSANamedCurveTable;->ED_25519_CURVE_SPEC:Lnet/i2p/crypto/eddsa/spec/EdDSANamedCurveSpec;

    invoke-direct {v0, p1, v1}, Lnet/i2p/crypto/eddsa/spec/EdDSAPublicKeySpec;-><init>([BLnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;)V

    invoke-direct {p0, v0}, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;-><init>(Lnet/i2p/crypto/eddsa/spec/EdDSAPublicKeySpec;)V

    return-void
.end method

.method public constructor <init>(Lnet/i2p/crypto/eddsa/spec/EdDSAPublicKeySpec;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;->Aneg:Lnet/i2p/crypto/eddsa/math/GroupElement;

    invoke-virtual {p1}, Lnet/i2p/crypto/eddsa/spec/EdDSAPublicKeySpec;->getA()Lnet/i2p/crypto/eddsa/math/GroupElement;

    move-result-object v0

    iput-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;->A:Lnet/i2p/crypto/eddsa/math/GroupElement;

    invoke-virtual {v0}, Lnet/i2p/crypto/eddsa/math/GroupElement;->toByteArray()[B

    move-result-object v0

    iput-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;->Abyte:[B

    invoke-virtual {p1}, Lnet/i2p/crypto/eddsa/spec/EdDSAPublicKeySpec;->getParams()Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    move-result-object p1

    iput-object p1, p0, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;->edDsaSpec:Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    return-void
.end method

.method private static decode([B)[B
    .registers 14

    const/16 v0, 0x2c

    const/16 v1, 0x8

    :try_start_4
    aget-byte v2, p0, v1
    :try_end_6
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_4 .. :try_end_6} :catch_b4

    const/16 v3, 0x64

    const/4 v4, 0x5

    const/4 v5, 0x7

    const/4 v6, 0x3

    const-string v7, "unsupported key spec"

    if-ne v2, v3, :cond_12

    const/16 v0, 0x2f

    goto :goto_1f

    :cond_12
    const/16 v1, 0x70

    if-ne v2, v1, :cond_ae

    :try_start_16
    aget-byte v1, p0, v6

    if-ne v1, v5, :cond_1e

    const/16 v0, 0x2e

    const/4 v1, 0x7

    goto :goto_1f

    :cond_1e
    const/4 v1, 0x5

    :goto_1f
    array-length v8, p0

    if-ne v8, v0, :cond_a6

    const/4 v8, 0x0

    aget-byte v9, p0, v8

    const/16 v10, 0x30

    if-ne v9, v10, :cond_a0

    const/4 v9, 0x1

    aget-byte v11, p0, v9

    const/4 v12, 0x2

    sub-int/2addr v0, v12

    if-ne v11, v0, :cond_a0

    aget-byte v0, p0, v12

    if-ne v0, v10, :cond_a0

    const/4 v0, 0x4

    aget-byte v10, p0, v6

    if-ne v10, v1, :cond_a0

    aget-byte v0, p0, v0

    const/4 v10, 0x6

    if-ne v0, v10, :cond_a0

    aget-byte v0, p0, v4

    if-ne v0, v6, :cond_a0

    aget-byte v0, p0, v10

    const/16 v10, 0x2b

    if-ne v0, v10, :cond_a0

    aget-byte v0, p0, v5

    const/16 v10, 0x65

    if-ne v0, v10, :cond_a0

    const/16 v0, 0x9

    const/16 v10, 0xb

    const/16 v11, 0xa

    if-ne v2, v3, :cond_6b

    aget-byte v0, p0, v0

    if-ne v0, v11, :cond_65

    aget-byte v0, p0, v11

    if-ne v0, v9, :cond_65

    const/16 v0, 0xc

    aget-byte v1, p0, v10

    if-ne v1, v9, :cond_65

    goto :goto_7e

    :cond_65
    new-instance p0, Ljava/security/spec/InvalidKeySpecException;

    invoke-direct {p0, v7}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6b
    if-ne v1, v5, :cond_7e

    aget-byte v0, p0, v0

    if-ne v0, v4, :cond_78

    aget-byte v0, p0, v11

    if-nez v0, :cond_78

    const/16 v0, 0xb

    goto :goto_7e

    :cond_78
    new-instance p0, Ljava/security/spec/InvalidKeySpecException;

    invoke-direct {p0, v7}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7e
    :goto_7e
    add-int/lit8 v1, v0, 0x1

    aget-byte v0, p0, v0

    if-ne v0, v6, :cond_9a

    add-int/lit8 v0, v1, 0x1

    aget-byte v1, p0, v1

    const/16 v2, 0x21

    if-ne v1, v2, :cond_9a

    add-int/lit8 v1, v0, 0x1

    aget-byte v0, p0, v0

    if-nez v0, :cond_9a

    const/16 v0, 0x20

    new-array v2, v0, [B

    invoke-static {p0, v1, v2, v8, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2

    :cond_9a
    new-instance p0, Ljava/security/spec/InvalidKeySpecException;

    invoke-direct {p0, v7}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a0
    new-instance p0, Ljava/security/spec/InvalidKeySpecException;

    invoke-direct {p0, v7}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a6
    new-instance p0, Ljava/security/spec/InvalidKeySpecException;

    const-string v0, "invalid key spec length"

    invoke-direct {p0, v0}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_ae
    new-instance p0, Ljava/security/spec/InvalidKeySpecException;

    invoke-direct {p0, v7}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_b4
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_16 .. :try_end_b4} :catch_b4

    :catch_b4
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
    instance-of v1, p1, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;

    iget-object v1, p0, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;->Abyte:[B

    invoke-virtual {p1}, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;->getAbyte()[B

    move-result-object v3

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_25

    iget-object v1, p0, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;->edDsaSpec:Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    invoke-virtual {p1}, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;->getParams()Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

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

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;->A:Lnet/i2p/crypto/eddsa/math/GroupElement;

    return-object v0
.end method

.method public getAbyte()[B
    .registers 2

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;->Abyte:[B

    return-object v0
.end method

.method public getAlgorithm()Ljava/lang/String;
    .registers 2

    const-string v0, "EdDSA"

    return-object v0
.end method

.method public getEncoded()[B
    .registers 10

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;->edDsaSpec:Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    sget-object v1, Lnet/i2p/crypto/eddsa/spec/EdDSANamedCurveTable;->ED_25519_CURVE_SPEC:Lnet/i2p/crypto/eddsa/spec/EdDSANamedCurveSpec;

    invoke-virtual {v0, v1}, Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    const/4 v0, 0x0

    return-object v0

    :cond_c
    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;->Abyte:[B

    array-length v1, v0

    const/16 v2, 0xc

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

    aput-byte v5, v3, v6

    const/4 v1, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x5

    aput-byte v6, v3, v5

    const/4 v8, 0x6

    aput-byte v8, v3, v1

    aput-byte v5, v3, v6

    const/4 v1, 0x7

    const/16 v6, 0x2b

    aput-byte v6, v3, v8

    const/16 v6, 0x8

    const/16 v8, 0x65

    aput-byte v8, v3, v1

    const/16 v1, 0x9

    const/16 v8, 0x70

    aput-byte v8, v3, v6

    const/16 v6, 0xa

    aput-byte v5, v3, v1

    const/16 v1, 0xb

    array-length v5, v0

    add-int/2addr v5, v7

    int-to-byte v5, v5

    aput-byte v5, v3, v6

    aput-byte v4, v3, v1

    array-length v1, v0

    invoke-static {v0, v4, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v3
.end method

.method public getFormat()Ljava/lang/String;
    .registers 2

    const-string v0, "X.509"

    return-object v0
.end method

.method public getNegativeA()Lnet/i2p/crypto/eddsa/math/GroupElement;
    .registers 2

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;->Aneg:Lnet/i2p/crypto/eddsa/math/GroupElement;

    if-nez v0, :cond_c

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;->A:Lnet/i2p/crypto/eddsa/math/GroupElement;

    invoke-virtual {v0}, Lnet/i2p/crypto/eddsa/math/GroupElement;->negate()Lnet/i2p/crypto/eddsa/math/GroupElement;

    move-result-object v0

    iput-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;->Aneg:Lnet/i2p/crypto/eddsa/math/GroupElement;

    :cond_c
    return-object v0
.end method

.method public getParams()Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;
    .registers 2

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;->edDsaSpec:Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    return-object v0
.end method

.method public hashCode()I
    .registers 2

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;->Abyte:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    return v0
.end method
