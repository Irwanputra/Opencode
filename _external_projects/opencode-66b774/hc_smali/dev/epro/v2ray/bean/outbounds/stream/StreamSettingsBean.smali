.class public Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public httpSettings:Ldev/epro/v2ray/bean/outbounds/stream/HttpSettingsBean;

.field public kcpSettings:Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;

.field public network:Ljava/lang/String;

.field public quicSettings:Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;

.field public security:Ljava/lang/String;

.field public tcpSettings:Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;

.field public tlsSettings:Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;

.field public wsSettings:Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;Ldev/epro/v2ray/bean/outbounds/stream/HttpSettingsBean;Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;)V
    .registers 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->network:Ljava/lang/String;

    iput-object p2, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->security:Ljava/lang/String;

    iput-object p3, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->tcpSettings:Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;

    iput-object p4, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->kcpSettings:Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;

    iput-object p5, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->wsSettings:Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;

    iput-object p6, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->httpSettings:Ldev/epro/v2ray/bean/outbounds/stream/HttpSettingsBean;

    iput-object p7, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->tlsSettings:Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;

    iput-object p8, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->quicSettings:Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;

    return-void
.end method


# virtual methods
.method public getHttpSettings()Ldev/epro/v2ray/bean/outbounds/stream/HttpSettingsBean;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->httpSettings:Ldev/epro/v2ray/bean/outbounds/stream/HttpSettingsBean;

    return-object v0
.end method

.method public getKcpSettings()Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->kcpSettings:Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;

    return-object v0
.end method

.method public getNetwork()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->network:Ljava/lang/String;

    return-object v0
.end method

.method public getQuicSettings()Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->quicSettings:Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;

    return-object v0
.end method

.method public getSecurity()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->security:Ljava/lang/String;

    return-object v0
.end method

.method public getTcpSettings()Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->tcpSettings:Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;

    return-object v0
.end method

.method public getTlsSettings()Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->tlsSettings:Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;

    return-object v0
.end method

.method public getWsSettings()Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->wsSettings:Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;

    return-object v0
.end method

.method public setHttpSettings(Ldev/epro/v2ray/bean/outbounds/stream/HttpSettingsBean;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->httpSettings:Ldev/epro/v2ray/bean/outbounds/stream/HttpSettingsBean;

    return-void
.end method

.method public setKcpSettings(Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->kcpSettings:Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;

    return-void
.end method

.method public setNetwork(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->network:Ljava/lang/String;

    return-void
.end method

.method public setQuicSettings(Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->quicSettings:Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;

    return-void
.end method

.method public setSecurity(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->security:Ljava/lang/String;

    return-void
.end method

.method public setTcpSettings(Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->tcpSettings:Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;

    return-void
.end method

.method public setTlsSettings(Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->tlsSettings:Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;

    return-void
.end method

.method public setWsSettings(Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->wsSettings:Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "StreamSettingsBean{network=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->network:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", security=\'"

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->security:Ljava/lang/String;

    const-string v3, ", tcpSettings="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->tcpSettings:Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", kcpSettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->kcpSettings:Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", wsSettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->wsSettings:Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", httpSettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->httpSettings:Ldev/epro/v2ray/bean/outbounds/stream/HttpSettingsBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tlsSettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->tlsSettings:Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", quicSettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->quicSettings:Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
