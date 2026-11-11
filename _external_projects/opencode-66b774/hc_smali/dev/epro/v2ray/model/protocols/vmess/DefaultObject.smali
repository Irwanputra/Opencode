.class public Ldev/epro/v2ray/model/protocols/vmess/DefaultObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public alterId:I

.field public level:I


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAlterId()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/protocols/vmess/DefaultObject;->alterId:I

    return v0
.end method

.method public getLevel()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/protocols/vmess/DefaultObject;->level:I

    return v0
.end method

.method public setAlterId(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/protocols/vmess/DefaultObject;->alterId:I

    return-void
.end method

.method public setLevel(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/protocols/vmess/DefaultObject;->level:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    const-string v0, "DetourObject{level="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ldev/epro/v2ray/model/protocols/vmess/DefaultObject;->level:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", alterId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldev/epro/v2ray/model/protocols/vmess/DefaultObject;->alterId:I

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
