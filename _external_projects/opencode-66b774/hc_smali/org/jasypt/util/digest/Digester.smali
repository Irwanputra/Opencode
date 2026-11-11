.class public final Lorg/jasypt/util/digest/Digester;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final DEFAULT_ALGORITHM:Ljava/lang/String; = "MD5"

.field private static final ITERATIONS:I = 0x1

.field private static final SALT_SIZE_BYTES:I


# instance fields
.field private final digester:Lorg/jasypt/digest/StandardByteDigester;


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/jasypt/digest/StandardByteDigester;

    invoke-direct {v0}, Lorg/jasypt/digest/StandardByteDigester;-><init>()V

    iput-object v0, p0, Lorg/jasypt/util/digest/Digester;->digester:Lorg/jasypt/digest/StandardByteDigester;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardByteDigester;->setIterations(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardByteDigester;->setSaltSizeBytes(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/jasypt/digest/StandardByteDigester;

    invoke-direct {v0}, Lorg/jasypt/digest/StandardByteDigester;-><init>()V

    iput-object v0, p0, Lorg/jasypt/util/digest/Digester;->digester:Lorg/jasypt/digest/StandardByteDigester;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardByteDigester;->setIterations(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardByteDigester;->setSaltSizeBytes(I)V

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardByteDigester;->setAlgorithm(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/jasypt/digest/StandardByteDigester;

    invoke-direct {v0}, Lorg/jasypt/digest/StandardByteDigester;-><init>()V

    iput-object v0, p0, Lorg/jasypt/util/digest/Digester;->digester:Lorg/jasypt/digest/StandardByteDigester;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardByteDigester;->setIterations(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardByteDigester;->setSaltSizeBytes(I)V

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardByteDigester;->setAlgorithm(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Lorg/jasypt/digest/StandardByteDigester;->setProviderName(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/security/Provider;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/jasypt/digest/StandardByteDigester;

    invoke-direct {v0}, Lorg/jasypt/digest/StandardByteDigester;-><init>()V

    iput-object v0, p0, Lorg/jasypt/util/digest/Digester;->digester:Lorg/jasypt/digest/StandardByteDigester;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardByteDigester;->setIterations(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardByteDigester;->setSaltSizeBytes(I)V

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardByteDigester;->setAlgorithm(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Lorg/jasypt/digest/StandardByteDigester;->setProvider(Ljava/security/Provider;)V

    return-void
.end method


# virtual methods
.method public digest([B)[B
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/digest/Digester;->digester:Lorg/jasypt/digest/StandardByteDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardByteDigester;->digest([B)[B

    move-result-object p1

    return-object p1
.end method

.method public setAlgorithm(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/digest/Digester;->digester:Lorg/jasypt/digest/StandardByteDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardByteDigester;->setAlgorithm(Ljava/lang/String;)V

    return-void
.end method

.method public setProvider(Ljava/security/Provider;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/digest/Digester;->digester:Lorg/jasypt/digest/StandardByteDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardByteDigester;->setProvider(Ljava/security/Provider;)V

    return-void
.end method

.method public setProviderName(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/digest/Digester;->digester:Lorg/jasypt/digest/StandardByteDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardByteDigester;->setProviderName(Ljava/lang/String;)V

    return-void
.end method
