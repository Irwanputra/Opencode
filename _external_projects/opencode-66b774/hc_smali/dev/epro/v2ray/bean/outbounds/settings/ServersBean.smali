.class public Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public address:Ljava/lang/String;

.field public level:I

.field public method:Ljava/lang/String;

.field public ota:Z

.field public password:Ljava/lang/String;

.field public port:I


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAddress()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;->address:Ljava/lang/String;

    return-object v0
.end method

.method public getLevel()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;->level:I

    return v0
.end method

.method public getMethod()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;->method:Ljava/lang/String;

    return-object v0
.end method

.method public getPassword()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;->password:Ljava/lang/String;

    return-object v0
.end method

.method public getPort()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;->port:I

    return v0
.end method

.method public isOta()Z
    .registers 2

    iget-boolean v0, p0, Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;->ota:Z

    return v0
.end method

.method public setAddress(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;->address:Ljava/lang/String;

    return-void
.end method

.method public setLevel(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;->level:I

    return-void
.end method

.method public setMethod(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;->method:Ljava/lang/String;

    return-void
.end method

.method public setOta(Z)V
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;->ota:Z

    return-void
.end method

.method public setPassword(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;->password:Ljava/lang/String;

    return-void
.end method

.method public setPort(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;->port:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "ServersBean{address=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;->address:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", method=\'"

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;->method:Ljava/lang/String;

    const-string v3, ", ota="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-boolean v1, p0, Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;->ota:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", password=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;->password:Ljava/lang/String;

    const-string v3, ", port="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;->port:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", level="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;->level:I

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
