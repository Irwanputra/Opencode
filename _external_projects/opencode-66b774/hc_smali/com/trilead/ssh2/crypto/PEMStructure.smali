.class public Lcom/trilead/ssh2/crypto/PEMStructure;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public data:[B

.field public dekInfo:[Ljava/lang/String;

.field public pemType:I

.field public procType:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getData()[B
    .registers 2

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/PEMStructure;->data:[B

    return-object v0
.end method
