.class public Ldev/epro/v2ray/bean/inbounds/InSettingsBean;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public address:Ljava/lang/String;

.field public auth:Ljava/lang/String;

.field public network:Ljava/lang/String;

.field public port:Ljava/lang/Integer;

.field public udp:Ljava/lang/Boolean;

.field public userLevel:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAddress()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/inbounds/InSettingsBean;->address:Ljava/lang/String;

    return-object v0
.end method

.method public getAuth()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/inbounds/InSettingsBean;->auth:Ljava/lang/String;

    return-object v0
.end method

.method public getNetwork()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/inbounds/InSettingsBean;->network:Ljava/lang/String;

    return-object v0
.end method

.method public getPort()Ljava/lang/Integer;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/inbounds/InSettingsBean;->port:Ljava/lang/Integer;

    return-object v0
.end method

.method public getUdp()Ljava/lang/Boolean;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/inbounds/InSettingsBean;->udp:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getUserLevel()Ljava/lang/Integer;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/inbounds/InSettingsBean;->userLevel:Ljava/lang/Integer;

    return-object v0
.end method

.method public setAddress(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/inbounds/InSettingsBean;->address:Ljava/lang/String;

    return-void
.end method

.method public setAuth(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/inbounds/InSettingsBean;->auth:Ljava/lang/String;

    return-void
.end method

.method public setNetwork(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/inbounds/InSettingsBean;->network:Ljava/lang/String;

    return-void
.end method

.method public setPort(Ljava/lang/Integer;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/inbounds/InSettingsBean;->port:Ljava/lang/Integer;

    return-void
.end method

.method public setUdp(Ljava/lang/Boolean;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/inbounds/InSettingsBean;->udp:Ljava/lang/Boolean;

    return-void
.end method

.method public setUserLevel(Ljava/lang/Integer;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/inbounds/InSettingsBean;->userLevel:Ljava/lang/Integer;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "InSettingsBean{auth=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/bean/inbounds/InSettingsBean;->auth:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", udp="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/bean/inbounds/InSettingsBean;->udp:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", userLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/bean/inbounds/InSettingsBean;->userLevel:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", address=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/bean/inbounds/InSettingsBean;->address:Ljava/lang/String;

    const-string v3, ", port="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/bean/inbounds/InSettingsBean;->port:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", network=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/bean/inbounds/InSettingsBean;->network:Ljava/lang/String;

    const/16 v3, 0x7d

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ(Ljava/lang/StringBuilder;Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
