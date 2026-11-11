.class public Ldev/epro/v2ray/model/protocols/socks/InboundConfigurationObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public accounts:Ldev/epro/v2ray/model/protocols/socks/AccountObject;

.field public auth:Ljava/lang/String;

.field public ip:Ljava/lang/String;

.field public udp:Z

.field public userLevel:I


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAccounts()Ldev/epro/v2ray/model/protocols/socks/AccountObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/protocols/socks/InboundConfigurationObject;->accounts:Ldev/epro/v2ray/model/protocols/socks/AccountObject;

    return-object v0
.end method

.method public getAuth()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/protocols/socks/InboundConfigurationObject;->auth:Ljava/lang/String;

    return-object v0
.end method

.method public getIp()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/protocols/socks/InboundConfigurationObject;->ip:Ljava/lang/String;

    return-object v0
.end method

.method public getUdp()Z
    .registers 2

    iget-boolean v0, p0, Ldev/epro/v2ray/model/protocols/socks/InboundConfigurationObject;->udp:Z

    return v0
.end method

.method public getUserLevel()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/protocols/socks/InboundConfigurationObject;->userLevel:I

    return v0
.end method

.method public setAccounts(Ldev/epro/v2ray/model/protocols/socks/AccountObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/protocols/socks/InboundConfigurationObject;->accounts:Ldev/epro/v2ray/model/protocols/socks/AccountObject;

    return-void
.end method

.method public setAuth(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/protocols/socks/InboundConfigurationObject;->auth:Ljava/lang/String;

    return-void
.end method

.method public setIp(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/protocols/socks/InboundConfigurationObject;->ip:Ljava/lang/String;

    return-void
.end method

.method public setUdp(Z)V
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/model/protocols/socks/InboundConfigurationObject;->udp:Z

    return-void
.end method

.method public setUserLevel(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/protocols/socks/InboundConfigurationObject;->userLevel:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "InboundConfigurationObject{auth=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/model/protocols/socks/InboundConfigurationObject;->auth:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", accounts="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/model/protocols/socks/InboundConfigurationObject;->accounts:Ldev/epro/v2ray/model/protocols/socks/AccountObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", udp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ldev/epro/v2ray/model/protocols/socks/InboundConfigurationObject;->udp:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", ip=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/protocols/socks/InboundConfigurationObject;->ip:Ljava/lang/String;

    const-string v3, ", userLevel="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Ldev/epro/v2ray/model/protocols/socks/InboundConfigurationObject;->userLevel:I

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
