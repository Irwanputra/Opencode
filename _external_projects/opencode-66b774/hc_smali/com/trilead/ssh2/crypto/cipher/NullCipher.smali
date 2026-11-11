.class public Lcom/trilead/ssh2/crypto/cipher/NullCipher;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/trilead/ssh2/crypto/cipher/BlockCipher;


# instance fields
.field private blockSize:I


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    iput v0, p0, Lcom/trilead/ssh2/crypto/cipher/NullCipher;->blockSize:I

    return-void
.end method

.method public constructor <init>(I)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    iput v0, p0, Lcom/trilead/ssh2/crypto/cipher/NullCipher;->blockSize:I

    iput p1, p0, Lcom/trilead/ssh2/crypto/cipher/NullCipher;->blockSize:I

    return-void
.end method


# virtual methods
.method public getBlockSize()I
    .registers 2

    iget v0, p0, Lcom/trilead/ssh2/crypto/cipher/NullCipher;->blockSize:I

    return v0
.end method

.method public init(Z[B)V
    .registers 3

    return-void
.end method

.method public transformBlock([BI[BI)V
    .registers 6

    iget v0, p0, Lcom/trilead/ssh2/crypto/cipher/NullCipher;->blockSize:I

    invoke-static {p1, p2, p3, p4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method
