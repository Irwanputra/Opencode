.class public abstract Lcom/trilead/ssh2/crypto/CertificateDecoder;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract createKeyPair(Lcom/trilead/ssh2/crypto/PEMStructure;)Ljava/security/KeyPair;
.end method

.method public createKeyPair(Lcom/trilead/ssh2/crypto/PEMStructure;Ljava/lang/String;)Ljava/security/KeyPair;
    .registers 3

    invoke-virtual {p0, p1}, Lcom/trilead/ssh2/crypto/CertificateDecoder;->createKeyPair(Lcom/trilead/ssh2/crypto/PEMStructure;)Ljava/security/KeyPair;

    move-result-object p1

    return-object p1
.end method

.method public abstract getEndLine()Ljava/lang/String;
.end method

.method public abstract getStartLine()Ljava/lang/String;
.end method
