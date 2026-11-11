.class public Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerScalarOps;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lnet/i2p/crypto/eddsa/math/ScalarOps;


# instance fields
.field private final enc:Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerLittleEndianEncoding;

.field private final l:Ljava/math/BigInteger;


# direct methods
.method public constructor <init>(Lnet/i2p/crypto/eddsa/math/Field;Ljava/math/BigInteger;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerScalarOps;->l:Ljava/math/BigInteger;

    new-instance p2, Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerLittleEndianEncoding;

    invoke-direct {p2}, Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerLittleEndianEncoding;-><init>()V

    iput-object p2, p0, Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerScalarOps;->enc:Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerLittleEndianEncoding;

    invoke-virtual {p2, p1}, Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerLittleEndianEncoding;->setField(Lnet/i2p/crypto/eddsa/math/Field;)V

    return-void
.end method


# virtual methods
.method public multiplyAndAdd([B[B[B)[B
    .registers 6

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerScalarOps;->enc:Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerLittleEndianEncoding;

    invoke-virtual {v0, p1}, Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerLittleEndianEncoding;->toBigInteger([B)Ljava/math/BigInteger;

    move-result-object p1

    iget-object v1, p0, Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerScalarOps;->enc:Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerLittleEndianEncoding;

    invoke-virtual {v1, p2}, Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerLittleEndianEncoding;->toBigInteger([B)Ljava/math/BigInteger;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    iget-object p2, p0, Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerScalarOps;->enc:Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerLittleEndianEncoding;

    invoke-virtual {p2, p3}, Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerLittleEndianEncoding;->toBigInteger([B)Ljava/math/BigInteger;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    iget-object p2, p0, Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerScalarOps;->l:Ljava/math/BigInteger;

    invoke-virtual {p1, p2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v0, p1}, Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerLittleEndianEncoding;->encode(Ljava/math/BigInteger;)[B

    move-result-object p1

    return-object p1
.end method

.method public reduce([B)[B
    .registers 4

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerScalarOps;->enc:Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerLittleEndianEncoding;

    invoke-virtual {v0, p1}, Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerLittleEndianEncoding;->toBigInteger([B)Ljava/math/BigInteger;

    move-result-object p1

    iget-object v1, p0, Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerScalarOps;->l:Ljava/math/BigInteger;

    invoke-virtual {p1, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v0, p1}, Lnet/i2p/crypto/eddsa/math/bigint/BigIntegerLittleEndianEncoding;->encode(Ljava/math/BigInteger;)[B

    move-result-object p1

    return-object p1
.end method
