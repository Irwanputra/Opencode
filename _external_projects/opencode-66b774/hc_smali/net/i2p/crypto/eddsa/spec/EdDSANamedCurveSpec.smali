.class public Lnet/i2p/crypto/eddsa/spec/EdDSANamedCurveSpec;
.super Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;
.source ""


# instance fields
.field private final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lnet/i2p/crypto/eddsa/math/Curve;Ljava/lang/String;Lnet/i2p/crypto/eddsa/math/ScalarOps;Lnet/i2p/crypto/eddsa/math/GroupElement;)V
    .registers 6

    invoke-direct {p0, p2, p3, p4, p5}, Lnet/i2p/crypto/eddsa/spec/EdDSAParameterSpec;-><init>(Lnet/i2p/crypto/eddsa/math/Curve;Ljava/lang/String;Lnet/i2p/crypto/eddsa/math/ScalarOps;Lnet/i2p/crypto/eddsa/math/GroupElement;)V

    iput-object p1, p0, Lnet/i2p/crypto/eddsa/spec/EdDSANamedCurveSpec;->name:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/spec/EdDSANamedCurveSpec;->name:Ljava/lang/String;

    return-object v0
.end method
