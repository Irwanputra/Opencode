.class public Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CipherEntry"
.end annotation


# instance fields
.field public blocksize:I

.field public cipherClass:Ljava/lang/String;

.field public keysize:I

.field public type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;->type:Ljava/lang/String;

    iput p2, p0, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;->blocksize:I

    iput p3, p0, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;->keysize:I

    iput-object p4, p0, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;->cipherClass:Ljava/lang/String;

    return-void
.end method
