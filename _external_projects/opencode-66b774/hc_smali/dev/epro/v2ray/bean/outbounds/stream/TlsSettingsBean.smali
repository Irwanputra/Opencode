.class public Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public allowInsecure:Z

.field public serverName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;->allowInsecure:Z

    const-string v0, ""

    iput-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;->serverName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getServerName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;->serverName:Ljava/lang/String;

    return-object v0
.end method

.method public isAllowInsecure()Z
    .registers 2

    iget-boolean v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;->allowInsecure:Z

    return v0
.end method

.method public setAllowInsecure(Z)V
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;->allowInsecure:Z

    return-void
.end method

.method public setServerName(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;->serverName:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "TlsSettingsBean{allowInsecure="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;->allowInsecure:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", serverName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;->serverName:Ljava/lang/String;

    const/16 v2, 0x27

    const/16 v3, 0x7d

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ(Ljava/lang/StringBuilder;Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
