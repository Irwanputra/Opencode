.class public final Lnet/i2p/crypto/eddsa/EdDSAEngine;
.super Ljava/security/Signature;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/i2p/crypto/eddsa/EdDSAEngine$OneShotSpec;
    }
.end annotation


# static fields
.field public static final ONE_SHOT_MODE:Ljava/security/spec/AlgorithmParameterSpec;

.field public static final SIGNATURE_ALGORITHM:Ljava/lang/String; = "NONEwithEdDSA"


# instance fields
.field private baos:Ljava/io/ByteArrayOutputStream;

.field private digest:Ljava/security/MessageDigest;

.field private key:Lnet/i2p/crypto/eddsa/EdDSAKey;

.field private oneShotBytes:[B

.field private oneShotLength:I

.field private oneShotMode:Z

.field private oneShotOffset:I


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    new-instance v0, Lnet/i2p/crypto/eddsa/EdDSAEngine$OneShotSpec;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnet/i2p/crypto/eddsa/EdDSAEngine$OneShotSpec;-><init>(Lnet/i2p/crypto/eddsa/EdDSAEngine$1;)V

    sput-object v0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->ONE_SHOT_MODE:Ljava/security/spec/AlgorithmParameterSpec;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    const-string v0, "NONEwithEdDSA"

    invoke-direct {p0, v0}, Ljava/security/Signature;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/security/MessageDigest;)V
    .registers 2

    invoke-direct {p0}, Lnet/i2p/crypto/eddsa/EdDSAEngine;-><init>()V

    iput-object p1, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->digest:Ljava/security/MessageDigest;

    return-void
.end method

.method private digestInitSign(Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;)V
    .registers 5

    invoke-virtual {p1}, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->getParams()Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;->getCurve()Lnet/i2p/crypto/eddsa/math/Curve;

    move-result-object v0

    invoke-virtual {v0}, Lnet/i2p/crypto/eddsa/math/Curve;->getField()Lnet/i2p/crypto/eddsa/math/Field;

    move-result-object v0

    invoke-virtual {v0}, Lnet/i2p/crypto/eddsa/math/Field;->getb()I

    move-result v0

    iget-object v1, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->digest:Ljava/security/MessageDigest;

    invoke-virtual {p1}, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->getH()[B

    move-result-object p1

    div-int/lit8 v2, v0, 0x8

    div-int/lit8 v0, v0, 0x4

    sub-int/2addr v0, v2

    invoke-virtual {v1, p1, v2, v0}, Ljava/security/MessageDigest;->update([BII)V

    return-void
.end method

.method private reset()V
    .registers 2

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->digest:Ljava/security/MessageDigest;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/security/MessageDigest;->reset()V

    :cond_7
    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->baos:Ljava/io/ByteArrayOutputStream;

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V

    :cond_e
    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->oneShotMode:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->oneShotBytes:[B

    return-void
.end method

.method private x_engineSign()[B
    .registers 11

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->key:Lnet/i2p/crypto/eddsa/EdDSAKey;

    invoke-interface {v0}, Lnet/i2p/crypto/eddsa/EdDSAKey;->getParams()Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;->getCurve()Lnet/i2p/crypto/eddsa/math/Curve;

    move-result-object v0

    iget-object v1, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->key:Lnet/i2p/crypto/eddsa/EdDSAKey;

    invoke-interface {v1}, Lnet/i2p/crypto/eddsa/EdDSAKey;->getParams()Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    move-result-object v1

    invoke-virtual {v1}, Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;->getScalarOps()Lnet/i2p/crypto/eddsa/math/ScalarOps;

    move-result-object v1

    iget-object v2, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->key:Lnet/i2p/crypto/eddsa/EdDSAKey;

    check-cast v2, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;

    invoke-virtual {v2}, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->geta()[B

    move-result-object v2

    iget-boolean v3, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->oneShotMode:Z

    const/4 v4, 0x0

    if-eqz v3, :cond_32

    iget-object v3, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->oneShotBytes:[B

    if-eqz v3, :cond_2a

    iget v4, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->oneShotOffset:I

    iget v5, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->oneShotLength:I

    goto :goto_3e

    :cond_2a
    new-instance v0, Ljava/security/SignatureException;

    const-string v1, "update() not called first"

    invoke-direct {v0, v1}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_32
    iget-object v3, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->baos:Ljava/io/ByteArrayOutputStream;

    if-nez v3, :cond_39

    new-array v3, v4, [B

    goto :goto_3d

    :cond_39
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    :goto_3d
    array-length v5, v3

    :goto_3e
    iget-object v6, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->digest:Ljava/security/MessageDigest;

    invoke-virtual {v6, v3, v4, v5}, Ljava/security/MessageDigest;->update([BII)V

    iget-object v6, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->digest:Ljava/security/MessageDigest;

    invoke-virtual {v6}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v6

    invoke-interface {v1, v6}, Lnet/i2p/crypto/eddsa/math/ScalarOps;->reduce([B)[B

    move-result-object v6

    iget-object v7, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->key:Lnet/i2p/crypto/eddsa/EdDSAKey;

    invoke-interface {v7}, Lnet/i2p/crypto/eddsa/EdDSAKey;->getParams()Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    move-result-object v7

    invoke-virtual {v7}, Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;->getB()Lnet/i2p/crypto/eddsa/math/GroupElement;

    move-result-object v7

    invoke-virtual {v7, v6}, Lnet/i2p/crypto/eddsa/math/GroupElement;->scalarMultiply([B)Lnet/i2p/crypto/eddsa/math/GroupElement;

    move-result-object v7

    invoke-virtual {v7}, Lnet/i2p/crypto/eddsa/math/GroupElement;->toByteArray()[B

    move-result-object v7

    iget-object v8, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->digest:Ljava/security/MessageDigest;

    invoke-virtual {v8, v7}, Ljava/security/MessageDigest;->update([B)V

    iget-object v8, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->digest:Ljava/security/MessageDigest;

    iget-object v9, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->key:Lnet/i2p/crypto/eddsa/EdDSAKey;

    check-cast v9, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;

    invoke-virtual {v9}, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;->getAbyte()[B

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/security/MessageDigest;->update([B)V

    iget-object v8, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->digest:Ljava/security/MessageDigest;

    invoke-virtual {v8, v3, v4, v5}, Ljava/security/MessageDigest;->update([BII)V

    iget-object v3, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->digest:Ljava/security/MessageDigest;

    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v3

    invoke-interface {v1, v3}, Lnet/i2p/crypto/eddsa/math/ScalarOps;->reduce([B)[B

    move-result-object v3

    invoke-interface {v1, v3, v2, v6}, Lnet/i2p/crypto/eddsa/math/ScalarOps;->multiplyAndAdd([B[B[B)[B

    move-result-object v1

    invoke-virtual {v0}, Lnet/i2p/crypto/eddsa/math/Curve;->getField()Lnet/i2p/crypto/eddsa/math/Field;

    move-result-object v0

    invoke-virtual {v0}, Lnet/i2p/crypto/eddsa/math/Field;->getb()I

    move-result v0

    div-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    return-object v0
.end method

.method private x_engineVerify([B)Z
    .registers 9

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->key:Lnet/i2p/crypto/eddsa/EdDSAKey;

    invoke-interface {v0}, Lnet/i2p/crypto/eddsa/EdDSAKey;->getParams()Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;->getCurve()Lnet/i2p/crypto/eddsa/math/Curve;

    move-result-object v0

    invoke-virtual {v0}, Lnet/i2p/crypto/eddsa/math/Curve;->getField()Lnet/i2p/crypto/eddsa/math/Field;

    move-result-object v0

    invoke-virtual {v0}, Lnet/i2p/crypto/eddsa/math/Field;->getb()I

    move-result v0

    array-length v1, p1

    div-int/lit8 v2, v0, 0x4

    if-ne v1, v2, :cond_95

    iget-object v1, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->digest:Ljava/security/MessageDigest;

    div-int/lit8 v0, v0, 0x8

    const/4 v3, 0x0

    invoke-virtual {v1, p1, v3, v0}, Ljava/security/MessageDigest;->update([BII)V

    iget-object v1, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->digest:Ljava/security/MessageDigest;

    iget-object v4, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->key:Lnet/i2p/crypto/eddsa/EdDSAKey;

    check-cast v4, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;

    invoke-virtual {v4}, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;->getAbyte()[B

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/security/MessageDigest;->update([B)V

    iget-boolean v1, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->oneShotMode:Z

    if-eqz v1, :cond_41

    iget-object v1, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->oneShotBytes:[B

    if-eqz v1, :cond_39

    iget v4, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->oneShotOffset:I

    iget v5, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->oneShotLength:I

    goto :goto_4e

    :cond_39
    new-instance p1, Ljava/security/SignatureException;

    const-string v0, "update() not called first"

    invoke-direct {p1, v0}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_41
    iget-object v1, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->baos:Ljava/io/ByteArrayOutputStream;

    if-nez v1, :cond_48

    new-array v1, v3, [B

    goto :goto_4c

    :cond_48
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    :goto_4c
    array-length v5, v1

    const/4 v4, 0x0

    :goto_4e
    iget-object v6, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->digest:Ljava/security/MessageDigest;

    invoke-virtual {v6, v1, v4, v5}, Ljava/security/MessageDigest;->update([BII)V

    iget-object v1, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->digest:Ljava/security/MessageDigest;

    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    iget-object v4, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->key:Lnet/i2p/crypto/eddsa/EdDSAKey;

    invoke-interface {v4}, Lnet/i2p/crypto/eddsa/EdDSAKey;->getParams()Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    move-result-object v4

    invoke-virtual {v4}, Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;->getScalarOps()Lnet/i2p/crypto/eddsa/math/ScalarOps;

    move-result-object v4

    invoke-interface {v4, v1}, Lnet/i2p/crypto/eddsa/math/ScalarOps;->reduce([B)[B

    move-result-object v1

    invoke-static {p1, v0, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    iget-object v2, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->key:Lnet/i2p/crypto/eddsa/EdDSAKey;

    invoke-interface {v2}, Lnet/i2p/crypto/eddsa/EdDSAKey;->getParams()Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    move-result-object v2

    invoke-virtual {v2}, Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;->getB()Lnet/i2p/crypto/eddsa/math/GroupElement;

    move-result-object v2

    iget-object v4, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->key:Lnet/i2p/crypto/eddsa/EdDSAKey;

    check-cast v4, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;

    invoke-virtual {v4}, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;->getNegativeA()Lnet/i2p/crypto/eddsa/math/GroupElement;

    move-result-object v4

    invoke-virtual {v2, v4, v1, v0}, Lnet/i2p/crypto/eddsa/math/GroupElement;->doubleScalarMultiplyVariableTime(Lnet/i2p/crypto/eddsa/math/GroupElement;[B[B)Lnet/i2p/crypto/eddsa/math/GroupElement;

    move-result-object v0

    invoke-virtual {v0}, Lnet/i2p/crypto/eddsa/math/GroupElement;->toByteArray()[B

    move-result-object v0

    const/4 v1, 0x0

    :goto_86
    array-length v2, v0

    if-ge v1, v2, :cond_93

    aget-byte v2, v0, v1

    aget-byte v4, p1, v1

    if-eq v2, v4, :cond_90

    return v3

    :cond_90
    add-int/lit8 v1, v1, 0x1

    goto :goto_86

    :cond_93
    const/4 p1, 0x1

    return p1

    :cond_95
    new-instance p1, Ljava/security/SignatureException;

    const-string v0, "signature length is wrong"

    invoke-direct {p1, v0}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    goto :goto_9e

    :goto_9d
    throw p1

    :goto_9e
    goto :goto_9d
.end method


# virtual methods
.method public engineGetParameter(Ljava/lang/String;)Ljava/lang/Object;
    .registers 3

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "engineSetParameter unsupported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineInitSign(Ljava/security/PrivateKey;)V
    .registers 4

    invoke-direct {p0}, Lnet/i2p/crypto/eddsa/EdDSAEngine;->reset()V

    instance-of v0, p1, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;

    if-eqz v0, :cond_60

    check-cast p1, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;

    iput-object p1, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->key:Lnet/i2p/crypto/eddsa/EdDSAKey;

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->digest:Ljava/security/MessageDigest;

    if-nez v0, :cond_40

    :try_start_f
    invoke-interface {p1}, Lnet/i2p/crypto/eddsa/EdDSAKey;->getParams()Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;->getHashAlgorithm()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    iput-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->digest:Ljava/security/MessageDigest;
    :try_end_1d
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_f .. :try_end_1d} :catch_1e

    goto :goto_54

    :catch_1e
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string v0, "cannot get required digest "

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->key:Lnet/i2p/crypto/eddsa/EdDSAKey;

    invoke-interface {v1}, Lnet/i2p/crypto/eddsa/EdDSAKey;->getParams()Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    move-result-object v1

    invoke-virtual {v1}, Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;->getHashAlgorithm()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " for private key."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_40
    invoke-interface {p1}, Lnet/i2p/crypto/eddsa/EdDSAKey;->getParams()Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;->getHashAlgorithm()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->digest:Ljava/security/MessageDigest;

    invoke-virtual {v1}, Ljava/security/MessageDigest;->getAlgorithm()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_58

    :goto_54
    invoke-direct {p0, p1}, Lnet/i2p/crypto/eddsa/EdDSAEngine;->digestInitSign(Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;)V

    return-void

    :cond_58
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string v0, "Key hash algorithm does not match chosen digest"

    invoke-direct {p1, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_60
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "cannot identify EdDSA private key: "

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public engineInitVerify(Ljava/security/PublicKey;)V
    .registers 5

    invoke-direct {p0}, Lnet/i2p/crypto/eddsa/EdDSAEngine;->reset()V

    instance-of v0, p1, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;

    if-eqz v0, :cond_5d

    check-cast p1, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;

    iput-object p1, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->key:Lnet/i2p/crypto/eddsa/EdDSAKey;

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->digest:Ljava/security/MessageDigest;

    if-nez v0, :cond_40

    :try_start_f
    invoke-interface {p1}, Lnet/i2p/crypto/eddsa/EdDSAKey;->getParams()Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    move-result-object p1

    invoke-virtual {p1}, Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;->getHashAlgorithm()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p1

    iput-object p1, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->digest:Ljava/security/MessageDigest;
    :try_end_1d
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_f .. :try_end_1d} :catch_1e

    goto :goto_72

    :catch_1e
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string v0, "cannot get required digest "

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->key:Lnet/i2p/crypto/eddsa/EdDSAKey;

    invoke-interface {v1}, Lnet/i2p/crypto/eddsa/EdDSAKey;->getParams()Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    move-result-object v1

    invoke-virtual {v1}, Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;->getHashAlgorithm()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " for private key."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_40
    invoke-interface {p1}, Lnet/i2p/crypto/eddsa/EdDSAKey;->getParams()Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;

    move-result-object p1

    invoke-virtual {p1}, Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;->getHashAlgorithm()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->digest:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_55

    goto :goto_72

    :cond_55
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string v0, "Key hash algorithm does not match chosen digest"

    invoke-direct {p1, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5d
    instance-of v0, p1, Lsun/security/x509/X509Key;

    if-eqz v0, :cond_8a

    :try_start_61
    new-instance v0, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;

    new-instance v1, Ljava/security/spec/X509EncodedKeySpec;

    invoke-interface {p1}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    invoke-direct {v0, v1}, Lnet/i2p/crypto/eddsa/EdDSAPublicKey;-><init>(Ljava/security/spec/X509EncodedKeySpec;)V
    :try_end_6f
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_61 .. :try_end_6f} :catch_73

    invoke-virtual {p0, v0}, Lnet/i2p/crypto/eddsa/EdDSAEngine;->engineInitVerify(Ljava/security/PublicKey;)V

    :goto_72
    return-void

    :catch_73
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "cannot handle X.509 EdDSA public key: "

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p1}, Ljava/security/PublicKey;->getAlgorithm()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8a
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "cannot identify EdDSA public key: "

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public engineSetParameter(Ljava/lang/String;Ljava/lang/Object;)V
    .registers 3

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "engineSetParameter unsupported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineSetParameter(Ljava/security/spec/AlgorithmParameterSpec;)V
    .registers 3

    sget-object v0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->ONE_SHOT_MODE:Ljava/security/spec/AlgorithmParameterSpec;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_22

    iget-object p1, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->oneShotBytes:[B

    if-nez p1, :cond_1a

    iget-object p1, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->baos:Ljava/io/ByteArrayOutputStream;

    if-eqz p1, :cond_16

    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p1

    if-gtz p1, :cond_1a

    :cond_16
    const/4 p1, 0x1

    iput-boolean p1, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->oneShotMode:Z

    goto :goto_25

    :cond_1a
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    const-string v0, "update() already called"

    invoke-direct {p1, v0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_22
    invoke-super {p0, p1}, Ljava/security/Signature;->engineSetParameter(Ljava/security/spec/AlgorithmParameterSpec;)V

    :goto_25
    return-void
.end method

.method public engineSign()[B
    .registers 3

    :try_start_0
    invoke-direct {p0}, Lnet/i2p/crypto/eddsa/EdDSAEngine;->x_engineSign()[B

    move-result-object v0
    :try_end_4
    .catchall {:try_start_0 .. :try_end_4} :catchall_f

    invoke-direct {p0}, Lnet/i2p/crypto/eddsa/EdDSAEngine;->reset()V

    iget-object v1, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->key:Lnet/i2p/crypto/eddsa/EdDSAKey;

    check-cast v1, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;

    invoke-direct {p0, v1}, Lnet/i2p/crypto/eddsa/EdDSAEngine;->digestInitSign(Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;)V

    return-object v0

    :catchall_f
    move-exception v0

    invoke-direct {p0}, Lnet/i2p/crypto/eddsa/EdDSAEngine;->reset()V

    iget-object v1, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->key:Lnet/i2p/crypto/eddsa/EdDSAKey;

    check-cast v1, Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;

    invoke-direct {p0, v1}, Lnet/i2p/crypto/eddsa/EdDSAEngine;->digestInitSign(Lnet/i2p/crypto/eddsa/EdDSAPrivateKey;)V

    throw v0
.end method

.method public engineUpdate(B)V
    .registers 4

    iget-boolean v0, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->oneShotMode:Z

    if-nez v0, :cond_17

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->baos:Ljava/io/ByteArrayOutputStream;

    if-nez v0, :cond_11

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    iput-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->baos:Ljava/io/ByteArrayOutputStream;

    :cond_11
    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->baos:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    return-void

    :cond_17
    new-instance p1, Ljava/security/SignatureException;

    const-string v0, "unsupported in one-shot mode"

    invoke-direct {p1, v0}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineUpdate([BII)V
    .registers 6

    iget-boolean v0, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->oneShotMode:Z

    if-eqz v0, :cond_17

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->oneShotBytes:[B

    if-nez v0, :cond_f

    iput-object p1, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->oneShotBytes:[B

    iput p2, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->oneShotOffset:I

    iput p3, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->oneShotLength:I

    goto :goto_29

    :cond_f
    new-instance p1, Ljava/security/SignatureException;

    const-string p2, "update() already called"

    invoke-direct {p1, p2}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_17
    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->baos:Ljava/io/ByteArrayOutputStream;

    if-nez v0, :cond_24

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    iput-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->baos:Ljava/io/ByteArrayOutputStream;

    :cond_24
    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->baos:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    :goto_29
    return-void
.end method

.method public engineVerify([B)Z
    .registers 2

    :try_start_0
    invoke-direct {p0, p1}, Lnet/i2p/crypto/eddsa/EdDSAEngine;->x_engineVerify([B)Z

    move-result p1
    :try_end_4
    .catchall {:try_start_0 .. :try_end_4} :catchall_8

    invoke-direct {p0}, Lnet/i2p/crypto/eddsa/EdDSAEngine;->reset()V

    return p1

    :catchall_8
    move-exception p1

    invoke-direct {p0}, Lnet/i2p/crypto/eddsa/EdDSAEngine;->reset()V

    throw p1
.end method

.method public signOneShot([B)[B
    .registers 4

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lnet/i2p/crypto/eddsa/EdDSAEngine;->signOneShot([BII)[B

    move-result-object p1

    return-object p1
.end method

.method public signOneShot([BII)[B
    .registers 5

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->oneShotMode:Z

    invoke-virtual {p0, p1, p2, p3}, Ljava/security/Signature;->update([BII)V

    invoke-virtual {p0}, Ljava/security/Signature;->sign()[B

    move-result-object p1

    return-object p1
.end method

.method public verifyOneShot([BII[B)Z
    .registers 12

    array-length v6, p4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v6}, Lnet/i2p/crypto/eddsa/EdDSAEngine;->verifyOneShot([BII[BII)Z

    move-result p1

    return p1
.end method

.method public verifyOneShot([BII[BII)Z
    .registers 8

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/i2p/crypto/eddsa/EdDSAEngine;->oneShotMode:Z

    invoke-virtual {p0, p1, p2, p3}, Ljava/security/Signature;->update([BII)V

    invoke-virtual {p0, p4, p5, p6}, Ljava/security/Signature;->verify([BII)Z

    move-result p1

    return p1
.end method

.method public verifyOneShot([B[B)Z
    .registers 10

    array-length v3, p1

    array-length v6, p2

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    invoke-virtual/range {v0 .. v6}, Lnet/i2p/crypto/eddsa/EdDSAEngine;->verifyOneShot([BII[BII)Z

    move-result p1

    return p1
.end method

.method public verifyOneShot([B[BII)Z
    .registers 12

    array-length v3, p1

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    invoke-virtual/range {v0 .. v6}, Lnet/i2p/crypto/eddsa/EdDSAEngine;->verifyOneShot([BII[BII)Z

    move-result p1

    return p1
.end method
