.class public Ldev/epro/v2ray/model/protocols/dokodemo/InboundConfigurationObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public address:Ljava/lang/String;

.field public followRedirect:Z

.field public network:Ljava/lang/String;

.field public port:I

.field public timeout:I

.field public userLevel:I


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAddress()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/protocols/dokodemo/InboundConfigurationObject;->address:Ljava/lang/String;

    return-object v0
.end method

.method public getFollowRedirect()Z
    .registers 2

    iget-boolean v0, p0, Ldev/epro/v2ray/model/protocols/dokodemo/InboundConfigurationObject;->followRedirect:Z

    return v0
.end method

.method public getNetwork()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/protocols/dokodemo/InboundConfigurationObject;->network:Ljava/lang/String;

    return-object v0
.end method

.method public getPort()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/protocols/dokodemo/InboundConfigurationObject;->port:I

    return v0
.end method

.method public getTimeout()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/protocols/dokodemo/InboundConfigurationObject;->timeout:I

    return v0
.end method

.method public getUserLevel()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/protocols/dokodemo/InboundConfigurationObject;->userLevel:I

    return v0
.end method

.method public setAddress(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/protocols/dokodemo/InboundConfigurationObject;->address:Ljava/lang/String;

    return-void
.end method

.method public setFollowRedirect(Z)V
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/model/protocols/dokodemo/InboundConfigurationObject;->followRedirect:Z

    return-void
.end method

.method public setNetwork(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/protocols/dokodemo/InboundConfigurationObject;->network:Ljava/lang/String;

    return-void
.end method

.method public setPort(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/protocols/dokodemo/InboundConfigurationObject;->port:I

    return-void
.end method

.method public setTimeout(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/protocols/dokodemo/InboundConfigurationObject;->timeout:I

    return-void
.end method

.method public setUserLevel(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/protocols/dokodemo/InboundConfigurationObject;->userLevel:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "InboundConfigurationObject{address=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/model/protocols/dokodemo/InboundConfigurationObject;->address:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", port="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Ldev/epro/v2ray/model/protocols/dokodemo/InboundConfigurationObject;->port:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", network=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/protocols/dokodemo/InboundConfigurationObject;->network:Ljava/lang/String;

    const-string v3, ", timeout="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Ldev/epro/v2ray/model/protocols/dokodemo/InboundConfigurationObject;->timeout:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", followRedirect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ldev/epro/v2ray/model/protocols/dokodemo/InboundConfigurationObject;->followRedirect:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", userLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldev/epro/v2ray/model/protocols/dokodemo/InboundConfigurationObject;->userLevel:I

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
